package typingsSlinky.fridaGum.ObjC

import typingsSlinky.fridaGum.ModuleMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumerateLoadedClassesOptions extends js.Object {
  /**
    * Limit enumeration to modules in the given module map.
    */
  var ownedBy: js.UndefOr[ModuleMap] = js.native
}

object EnumerateLoadedClassesOptions {
  @scala.inline
  def apply(): EnumerateLoadedClassesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnumerateLoadedClassesOptions]
  }
  @scala.inline
  implicit class EnumerateLoadedClassesOptionsOps[Self <: EnumerateLoadedClassesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwnedBy(value: ModuleMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownedBy")(js.undefined)
        ret
    }
  }
  
}

