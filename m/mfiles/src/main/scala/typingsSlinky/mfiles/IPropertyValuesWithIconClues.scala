package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValuesWithIconClues extends js.Object {
  val IconClues: IPropertyValueIconClues = js.native
  val ObjVer: IObjVer = js.native
  val PropertyValues: IPropertyValues = js.native
  def Clone(): IPropertyValuesWithIconClues = js.native
}

object IPropertyValuesWithIconClues {
  @scala.inline
  def apply(
    Clone: () => IPropertyValuesWithIconClues,
    IconClues: IPropertyValueIconClues,
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues
  ): IPropertyValuesWithIconClues = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IconClues = IconClues.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], PropertyValues = PropertyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValuesWithIconClues]
  }
  @scala.inline
  implicit class IPropertyValuesWithIconCluesOps[Self <: IPropertyValuesWithIconClues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IPropertyValuesWithIconClues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIconClues(value: IPropertyValueIconClues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconClues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjVer(value: IObjVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjVer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyValues(value: IPropertyValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

