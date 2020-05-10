package typingsSlinky.officeUiFabricReact.coachmarkBasicExampleMod

import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoachmarkBasicExampleState extends js.Object {
  var coachmarkPosition: DirectionalHint = js.native
  var dropdownSelectedOptionKey: String | Double = js.native
  var isCoachmarkVisible: js.UndefOr[Boolean] = js.native
}

object ICoachmarkBasicExampleState {
  @scala.inline
  def apply(coachmarkPosition: DirectionalHint, dropdownSelectedOptionKey: String | Double): ICoachmarkBasicExampleState = {
    val __obj = js.Dynamic.literal(coachmarkPosition = coachmarkPosition.asInstanceOf[js.Any], dropdownSelectedOptionKey = dropdownSelectedOptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoachmarkBasicExampleState]
  }
  @scala.inline
  implicit class ICoachmarkBasicExampleStateOps[Self <: ICoachmarkBasicExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoachmarkPosition(value: DirectionalHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coachmarkPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdownSelectedOptionKey(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownSelectedOptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCoachmarkVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCoachmarkVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCoachmarkVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCoachmarkVisible")(js.undefined)
        ret
    }
  }
  
}

