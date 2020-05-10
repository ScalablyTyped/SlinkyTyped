package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationSettings extends js.Object {
  /**
    * Determines whether the user desires reduced motion based on platform APIs.
    */
  var prefersReducedMotion: Boolean = js.native
  /**
    * Determines on a per-platform basis whether scroll animations (e.g. produced by
    * home/end key) should be enabled.
    */
  var scrollAnimationsEnabledBySystem: Boolean = js.native
  /**
    * Returns true if rich animations should be rendered. Looks at session type (e.g.
    * remote desktop) and accessibility settings to give guidance for heavy
    * animations.
    */
  var shouldRenderRichAnimation: Boolean = js.native
}

object AnimationSettings {
  @scala.inline
  def apply(
    prefersReducedMotion: Boolean,
    scrollAnimationsEnabledBySystem: Boolean,
    shouldRenderRichAnimation: Boolean
  ): AnimationSettings = {
    val __obj = js.Dynamic.literal(prefersReducedMotion = prefersReducedMotion.asInstanceOf[js.Any], scrollAnimationsEnabledBySystem = scrollAnimationsEnabledBySystem.asInstanceOf[js.Any], shouldRenderRichAnimation = shouldRenderRichAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationSettings]
  }
  @scala.inline
  implicit class AnimationSettingsOps[Self <: AnimationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefersReducedMotion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefersReducedMotion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollAnimationsEnabledBySystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAnimationsEnabledBySystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldRenderRichAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRenderRichAnimation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

