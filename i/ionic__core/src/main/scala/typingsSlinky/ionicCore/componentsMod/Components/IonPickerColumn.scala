package typingsSlinky.ionicCore.componentsMod.Components

import typingsSlinky.ionicCore.pickerInterfaceMod.PickerColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonPickerColumn extends js.Object {
  /**
    * Picker column data
    */
  var col: PickerColumn = js.native
}

object IonPickerColumn {
  @scala.inline
  def apply(col: PickerColumn): IonPickerColumn = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonPickerColumn]
  }
  @scala.inline
  implicit class IonPickerColumnOps[Self <: IonPickerColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCol(value: PickerColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

