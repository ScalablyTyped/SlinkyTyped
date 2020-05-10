package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import typingsSlinky.angular.mod.IPromise
import typingsSlinky.angularMaterial.AnonABOVE
import typingsSlinky.angularMaterial.AnonALIGNEND
import typingsSlinky.angularMaterial.AnonBOTTOM
import typingsSlinky.angularMaterial.AnonCLICKOUTSIDE
import typingsSlinky.angularMaterial.AnonCLOSE_
import typingsSlinky.angularMaterial.AnonFADE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelService extends js.Object {
  var absPosition: AnonBOTTOM = js.native
  var animation: AnonFADE = js.native
  var closeReasons: AnonCLICKOUTSIDE = js.native
  var interceptorTypes: AnonCLOSE_ = js.native
  var xPosition: AnonALIGNEND = js.native
  var yPosition: AnonABOVE = js.native
  def create(opt_config: IPanelConfig): IPanelRef = js.native
  def newPanelAnimation(): IPanelAnimation = js.native
  def newPanelPosition(): IPanelPosition = js.native
  def open(opt_config: IPanelConfig): IPromise[IPanelRef] = js.native
}

object IPanelService {
  @scala.inline
  def apply(
    absPosition: AnonBOTTOM,
    animation: AnonFADE,
    closeReasons: AnonCLICKOUTSIDE,
    create: IPanelConfig => IPanelRef,
    interceptorTypes: AnonCLOSE_,
    newPanelAnimation: () => IPanelAnimation,
    newPanelPosition: () => IPanelPosition,
    open: IPanelConfig => IPromise[IPanelRef],
    xPosition: AnonALIGNEND,
    yPosition: AnonABOVE
  ): IPanelService = {
    val __obj = js.Dynamic.literal(absPosition = absPosition.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], closeReasons = closeReasons.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), interceptorTypes = interceptorTypes.asInstanceOf[js.Any], newPanelAnimation = js.Any.fromFunction0(newPanelAnimation), newPanelPosition = js.Any.fromFunction0(newPanelPosition), open = js.Any.fromFunction1(open), xPosition = xPosition.asInstanceOf[js.Any], yPosition = yPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelService]
  }
  @scala.inline
  implicit class IPanelServiceOps[Self <: IPanelService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsPosition(value: AnonBOTTOM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: AnonFADE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseReasons(value: AnonCLICKOUTSIDE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: IPanelConfig => IPanelRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInterceptorTypes(value: AnonCLOSE_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptorTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewPanelAnimation(value: () => IPanelAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPanelAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPanelPosition(value: () => IPanelPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPanelPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpen(value: IPanelConfig => IPromise[IPanelRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXPosition(value: AnonALIGNEND): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYPosition(value: AnonABOVE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

