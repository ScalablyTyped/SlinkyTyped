package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValueIconClue extends js.Object {
  val PropertyDef: MFBuiltInPropertyDef | Double = js.native
  val ValueListItem: Double = js.native
  def Clone(): IPropertyValueIconClue = js.native
}

object IPropertyValueIconClue {
  @scala.inline
  def apply(
    Clone: () => IPropertyValueIconClue,
    PropertyDef: MFBuiltInPropertyDef | Double,
    ValueListItem: Double
  ): IPropertyValueIconClue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyDef = PropertyDef.asInstanceOf[js.Any], ValueListItem = ValueListItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueIconClue]
  }
  @scala.inline
  implicit class IPropertyValueIconClueOps[Self <: IPropertyValueIconClue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IPropertyValueIconClue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPropertyDef(value: MFBuiltInPropertyDef | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueListItem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueListItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

