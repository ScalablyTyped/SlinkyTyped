package typingsSlinky.ngTable.ngTableSelectFilterDsDirectiveMod

import typingsSlinky.ngTable.publicInterfacesMod.ISelectOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScopeExtensions extends js.Object {
  @JSName("$selectData")
  var $selectData: js.Array[ISelectOption] = js.native
}

object IScopeExtensions {
  @scala.inline
  def apply($selectData: js.Array[ISelectOption]): IScopeExtensions = {
    val __obj = js.Dynamic.literal($selectData = $selectData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScopeExtensions]
  }
  @scala.inline
  implicit class IScopeExtensionsOps[Self <: IScopeExtensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$selectData(value: js.Array[ISelectOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$selectData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

