package typingsSlinky.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleUrl extends js.Object {
  var moduleUrl: js.UndefOr[String] = js.native
  var styleUrls: js.UndefOr[js.Array[String]] = js.native
  var styles: js.UndefOr[js.Array[String]] = js.native
}

object ModuleUrl {
  @scala.inline
  def apply(): ModuleUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleUrl]
  }
  @scala.inline
  implicit class ModuleUrlOps[Self <: ModuleUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModuleUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

