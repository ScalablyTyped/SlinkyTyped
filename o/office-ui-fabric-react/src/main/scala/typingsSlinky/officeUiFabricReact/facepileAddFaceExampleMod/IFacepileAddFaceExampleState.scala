package typingsSlinky.officeUiFabricReact.facepileAddFaceExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFacepileAddFaceExampleState extends js.Object {
  var numberOfFaces: Double = js.native
}

object IFacepileAddFaceExampleState {
  @scala.inline
  def apply(numberOfFaces: Double): IFacepileAddFaceExampleState = {
    val __obj = js.Dynamic.literal(numberOfFaces = numberOfFaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFacepileAddFaceExampleState]
  }
  @scala.inline
  implicit class IFacepileAddFaceExampleStateOps[Self <: IFacepileAddFaceExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberOfFaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfFaces")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

