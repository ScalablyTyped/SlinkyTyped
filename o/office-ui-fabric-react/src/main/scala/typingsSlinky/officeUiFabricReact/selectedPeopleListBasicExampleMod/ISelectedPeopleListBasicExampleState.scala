package typingsSlinky.officeUiFabricReact.selectedPeopleListBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectedPeopleListBasicExampleState extends js.Object {
  var nextPersonIndex: Double = js.native
}

object ISelectedPeopleListBasicExampleState {
  @scala.inline
  def apply(nextPersonIndex: Double): ISelectedPeopleListBasicExampleState = {
    val __obj = js.Dynamic.literal(nextPersonIndex = nextPersonIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectedPeopleListBasicExampleState]
  }
  @scala.inline
  implicit class ISelectedPeopleListBasicExampleStateOps[Self <: ISelectedPeopleListBasicExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPersonIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPersonIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

