package typingsSlinky.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loader extends js.Object {
  var allowedSchemas: js.UndefOr[String | js.Array[String]] = js.native
  var blacklist: js.UndefOr[String | js.Array[String]] = js.native
  var exceptions: js.UndefOr[String | js.Array[String]] = js.native
  var functionBlacklist: js.UndefOr[String | js.Array[String]] = js.native
  var functionWhitelist: js.UndefOr[String | js.Array[String]] = js.native
  var scripts: js.UndefOr[String] = js.native
  var whitelist: js.UndefOr[String | js.Array[String]] = js.native
}

object Loader {
  @scala.inline
  def apply(): Loader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loader]
  }
  @scala.inline
  implicit class LoaderOps[Self <: Loader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedSchemas(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSchemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSchemas")(js.undefined)
        ret
    }
    @scala.inline
    def withBlacklist(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withExceptions(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionBlacklist(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionBlacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionBlacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionWhitelist(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionWhitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionWhitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withScripts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelist(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.undefined)
        ret
    }
  }
  
}

