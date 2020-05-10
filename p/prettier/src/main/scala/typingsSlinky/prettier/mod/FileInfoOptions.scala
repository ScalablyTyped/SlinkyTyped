package typingsSlinky.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileInfoOptions extends js.Object {
  var ignorePath: js.UndefOr[String] = js.native
  var plugins: js.UndefOr[js.Array[String]] = js.native
  var resolveConfig: js.UndefOr[Boolean] = js.native
  var withNodeModules: js.UndefOr[Boolean] = js.native
}

object FileInfoOptions {
  @scala.inline
  def apply(): FileInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileInfoOptions]
  }
  @scala.inline
  implicit class FileInfoOptionsOps[Self <: FileInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnorePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withWithNodeModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withNodeModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithNodeModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withNodeModules")(js.undefined)
        ret
    }
  }
  
}

