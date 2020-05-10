package typingsSlinky.officeUiFabricReact.positioningContainerStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPositioningContainerNames extends js.Object {
  var beak: js.UndefOr[String] = js.native
  var beakCurtain: js.UndefOr[String] = js.native
  var container: String = js.native
  var main: String = js.native
  var overFlowYHidden: String = js.native
  /**
    * Root html container for this component.
    */
  var root: String = js.native
}

object IPositioningContainerNames {
  @scala.inline
  def apply(container: String, main: String, overFlowYHidden: String, root: String): IPositioningContainerNames = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], overFlowYHidden = overFlowYHidden.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositioningContainerNames]
  }
  @scala.inline
  implicit class IPositioningContainerNamesOps[Self <: IPositioningContainerNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverFlowYHidden(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overFlowYHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeak(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beak")(js.undefined)
        ret
    }
    @scala.inline
    def withBeakCurtain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakCurtain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeakCurtain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakCurtain")(js.undefined)
        ret
    }
  }
  
}

