package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import typingsSlinky.angular.mod.IPromise
import typingsSlinky.angularMaterial.anon.ABOVE
import typingsSlinky.angularMaterial.anon.ALIGNEND
import typingsSlinky.angularMaterial.anon.BOTTOM
import typingsSlinky.angularMaterial.anon.CLICKOUTSIDE
import typingsSlinky.angularMaterial.anon.CLOSE_
import typingsSlinky.angularMaterial.anon.FADE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelService extends js.Object {
  var absPosition: BOTTOM = js.native
  var animation: FADE = js.native
  var closeReasons: CLICKOUTSIDE = js.native
  var interceptorTypes: CLOSE_ = js.native
  var xPosition: ALIGNEND = js.native
  var yPosition: ABOVE = js.native
  def create(opt_config: IPanelConfig): IPanelRef = js.native
  def newPanelAnimation(): IPanelAnimation = js.native
  def newPanelPosition(): IPanelPosition = js.native
  def open(opt_config: IPanelConfig): IPromise[IPanelRef] = js.native
}

object IPanelService {
  @scala.inline
  def apply(
    absPosition: BOTTOM,
    animation: FADE,
    closeReasons: CLICKOUTSIDE,
    create: IPanelConfig => IPanelRef,
    interceptorTypes: CLOSE_,
    newPanelAnimation: () => IPanelAnimation,
    newPanelPosition: () => IPanelPosition,
    open: IPanelConfig => IPromise[IPanelRef],
    xPosition: ALIGNEND,
    yPosition: ABOVE
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
    def withAbsPosition(value: BOTTOM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: FADE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseReasons(value: CLICKOUTSIDE): Self = {
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
    def withInterceptorTypes(value: CLOSE_): Self = {
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
    def withXPosition(value: ALIGNEND): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYPosition(value: ABOVE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

