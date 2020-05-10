package typingsSlinky.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleImportPointer extends js.Object {
  @JSName("$fragmentRefs")
  val $fragmentRefs: js.Any = js.native
  val __fragmentPropName: js.UndefOr[String | Null] = js.native
  val __module_component: js.Any = js.native
}

object ModuleImportPointer {
  @scala.inline
  def apply($fragmentRefs: js.Any, __module_component: js.Any): ModuleImportPointer = {
    val __obj = js.Dynamic.literal($fragmentRefs = $fragmentRefs.asInstanceOf[js.Any], __module_component = __module_component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleImportPointer]
  }
  @scala.inline
  implicit class ModuleImportPointerOps[Self <: ModuleImportPointer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$fragmentRefs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$fragmentRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__module_component(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__module_component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__fragmentPropName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__fragmentPropName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__fragmentPropName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__fragmentPropName")(js.undefined)
        ret
    }
    @scala.inline
    def with__fragmentPropNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__fragmentPropName")(null)
        ret
    }
  }
  
}

