package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Basepath extends js.Object {
  var base_path: ExtensionURL = js.native
  var paths: js.UndefOr[js.Array[String]] = js.native
}

object Basepath {
  @scala.inline
  def apply(base_path: ExtensionURL): Basepath = {
    val __obj = js.Dynamic.literal(base_path = base_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basepath]
  }
  @scala.inline
  implicit class BasepathOps[Self <: Basepath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase_path(value: ExtensionURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
  }
  
}

