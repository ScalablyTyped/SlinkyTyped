package typingsSlinky.blueprintjsCore.handlePropsMod

import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHandleProps extends IProps {
  /** Intent for the track segment immediately after this handle, taking priority over `intentBefore`. */
  var intentAfter: js.UndefOr[Intent] = js.native
  /** Intent for the track segment immediately before this handle. */
  var intentBefore: js.UndefOr[Intent] = js.native
  /**
    * How this handle interacts with other handles.
    * @default "lock"
    */
  var interactionKind: js.UndefOr[HandleInteractionKind] = js.native
  /**
    * Callback invoked when this handle's value is changed due to a drag
    * interaction. Note that "push" interactions can cause multiple handles to
    * update at the same time.
    */
  var onChange: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  /** Callback invoked when this handle is released (the end of a drag interaction). */
  var onRelease: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  /**
    * Handle appearance type.
    * @default "full"
    */
  var `type`: js.UndefOr[HandleType] = js.native
  /** Numeric value of this handle. */
  var value: Double = js.native
}

object IHandleProps {
  @scala.inline
  def apply(value: Double): IHandleProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHandleProps]
  }
  @scala.inline
  implicit class IHandlePropsOps[Self <: IHandleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntentAfter(value: Intent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentBefore(value: Intent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractionKind(value: HandleInteractionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractionKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionKind")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* newValue */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRelease(value: /* newValue */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: HandleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

