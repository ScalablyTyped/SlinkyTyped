package typingsSlinky.reduxAuthWrapper.locationHelperMod

import typingsSlinky.history.mod.LocationDescriptorObject
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationHelper[Props] extends js.Object {
  def createRedirectLoc(props: Props, redirectPath: String): LocationDescriptorObject[LocationState] = js.native
  def getRedirectQueryParam(props: Props): String = js.native
}

object LocationHelper {
  @scala.inline
  def apply[Props](
    createRedirectLoc: (Props, String) => LocationDescriptorObject[LocationState],
    getRedirectQueryParam: Props => String
  ): LocationHelper[Props] = {
    val __obj = js.Dynamic.literal(createRedirectLoc = js.Any.fromFunction2(createRedirectLoc), getRedirectQueryParam = js.Any.fromFunction1(getRedirectQueryParam))
    __obj.asInstanceOf[LocationHelper[Props]]
  }
  @scala.inline
  implicit class LocationHelperOps[Self[props] <: LocationHelper[props], Props] (val x: Self[Props]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Props] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Props] with Other]
    @scala.inline
    def withCreateRedirectLoc(value: (Props, String) => LocationDescriptorObject[LocationState]): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRedirectLoc")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetRedirectQueryParam(value: Props => String): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRedirectQueryParam")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

