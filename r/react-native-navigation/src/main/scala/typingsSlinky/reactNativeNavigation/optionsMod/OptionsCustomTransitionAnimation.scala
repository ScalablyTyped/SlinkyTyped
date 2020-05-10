package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.sharedElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsCustomTransitionAnimation extends js.Object {
  /**
    * Animation duration
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Transition from element Id
    */
  var fromId: String = js.native
  /**
    * Animation spring Velocity
    */
  var springVelocity: js.UndefOr[Double] = js.native
  /**
    * Animation delay
    */
  var startDelay: js.UndefOr[Double] = js.native
  /**
    * Transition to element Id
    */
  var toId: String = js.native
  /**
    * Animation type, only support sharedElement currently
    */
  var `type`: sharedElement = js.native
}

object OptionsCustomTransitionAnimation {
  @scala.inline
  def apply(fromId: String, toId: String, `type`: sharedElement): OptionsCustomTransitionAnimation = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsCustomTransitionAnimation]
  }
  @scala.inline
  implicit class OptionsCustomTransitionAnimationOps[Self <: OptionsCustomTransitionAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: sharedElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withSpringVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDelay")(js.undefined)
        ret
    }
  }
  
}

