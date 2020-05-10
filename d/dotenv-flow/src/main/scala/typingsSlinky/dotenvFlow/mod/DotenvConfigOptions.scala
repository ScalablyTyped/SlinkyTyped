package typingsSlinky.dotenvFlow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotenvConfigOptions extends js.Object {
  /**
    * Default node environment to use if `process.env.NODE_ENV` is not present.
    */
  var default_node_env: js.UndefOr[String] = js.native
  /**
    * Encoding for reading the `.env*` files.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * Node environment (development/test/production/etc,.).
    */
  var node_env: js.UndefOr[String] = js.native
  /**
    * Path to `.env*` files directory.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * In some cases the original "dotenv" library can be used by one of the dependent npm modules.
    * It causes calling the original `dotenv.config()` that loads the `.env` file from your project before you can call `dotenv-flow.config()`.
    *
    * Such cases breaks `.env*` files priority because the previously loaded environment variables are treated as shell-defined thus having the higher priority.
    *
    * Setting the `purge_dotenv` option to `true` can gracefully fix this issue.
    */
  var purge_dotenv: js.UndefOr[Boolean] = js.native
}

object DotenvConfigOptions {
  @scala.inline
  def apply(): DotenvConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotenvConfigOptions]
  }
  @scala.inline
  implicit class DotenvConfigOptionsOps[Self <: DotenvConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault_node_env(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_node_env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_node_env: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_node_env")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withNode_env(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode_env: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_env")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPurge_dotenv(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purge_dotenv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurge_dotenv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purge_dotenv")(js.undefined)
        ret
    }
  }
  
}

