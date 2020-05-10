package typingsSlinky.ionicCore.transitionMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.navInterfaceMod.NavOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionOptions extends NavOptions {
  var baseEl: js.Any = js.native
  var enteringEl: HTMLElement = js.native
  var leavingEl: js.UndefOr[HTMLElement] = js.native
  var progressCallback: js.UndefOr[
    js.Function1[
      /* ani */ js.UndefOr[Animation | typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation], 
      Unit
    ]
  ] = js.native
}

object TransitionOptions {
  @scala.inline
  def apply(baseEl: js.Any, enteringEl: HTMLElement): TransitionOptions = {
    val __obj = js.Dynamic.literal(baseEl = baseEl.asInstanceOf[js.Any], enteringEl = enteringEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionOptions]
  }
  @scala.inline
  implicit class TransitionOptionsOps[Self <: TransitionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnteringEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enteringEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeavingEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavingEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeavingEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavingEl")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressCallback(
      value: /* ani */ js.UndefOr[Animation | typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProgressCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCallback")(js.undefined)
        ret
    }
  }
  
}

