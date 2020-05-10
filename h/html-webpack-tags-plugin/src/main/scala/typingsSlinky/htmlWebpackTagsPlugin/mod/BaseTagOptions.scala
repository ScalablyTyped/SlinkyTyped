package typingsSlinky.htmlWebpackTagsPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTagOptions extends CommonOptions {
  var glob: js.UndefOr[String] = js.native
  var globFlatten: js.UndefOr[Boolean] = js.native
  var globPath: js.UndefOr[String] = js.native
  var sourcePath: js.UndefOr[String] = js.native
}

object BaseTagOptions {
  @scala.inline
  def apply(): BaseTagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTagOptions]
  }
  @scala.inline
  implicit class BaseTagOptionsOps[Self <: BaseTagOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlob(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glob")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobFlatten(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globFlatten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobFlatten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globFlatten")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePath")(js.undefined)
        ret
    }
  }
  
}

