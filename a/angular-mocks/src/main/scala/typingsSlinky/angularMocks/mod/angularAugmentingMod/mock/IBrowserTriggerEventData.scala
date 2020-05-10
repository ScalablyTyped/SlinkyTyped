package typingsSlinky.angularMocks.mod.angularAugmentingMod.mock

import org.scalajs.dom.raw.Node
import typingsSlinky.angularMocks.angularMocksStrings.alt
import typingsSlinky.angularMocks.angularMocksStrings.ctrl
import typingsSlinky.angularMocks.angularMocksStrings.meta
import typingsSlinky.angularMocks.angularMocksStrings.shift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains additional event data used by the `browserTrigger` function when creating an event.
  */
@js.native
trait IBrowserTriggerEventData extends js.Object {
  /**
    * [Event.bubbles](https://developer.mozilla.org/docs/Web/API/Event/bubbles).
    * Not applicable to all events.
    */
  var bubbles: js.UndefOr[Boolean] = js.native
  /**
    * [Event.cancelable](https://developer.mozilla.org/docs/Web/API/Event/cancelable).
    * Not applicable to all events.
    */
  var cancelable: js.UndefOr[Boolean] = js.native
  /**
    * [charCode](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/charcode)
    * for keyboard events (keydown, keypress, and keyup).
    */
  var charcode: js.UndefOr[Double] = js.native
  /**
    * [data](https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent/data) for
    * [CompositionEvents](https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent).
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The elapsedTime for
    * [TransitionEvent](https://developer.mozilla.org/docs/Web/API/TransitionEvent)
    * and [AnimationEvent](https://developer.mozilla.org/docs/Web/API/AnimationEvent).
    */
  var elapsedTime: js.UndefOr[Double] = js.native
  /**
    * [keyCode](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/keycode)
    * for keyboard events (keydown, keypress, and keyup).
    */
  var keycode: js.UndefOr[Double] = js.native
  /**
    * An array of possible modifier keys (ctrl, alt, shift, meta) for
    * [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent) and
    * keyboard events (keydown, keypress, and keyup).
    */
  var keys: js.UndefOr[js.Array[ctrl | alt | shift | meta]] = js.native
  /**
    * The [relatedTarget](https://developer.mozilla.org/docs/Web/API/MouseEvent/relatedTarget)
    * for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent).
    */
  var relatedTarget: js.UndefOr[Node] = js.native
  /**
    * [which](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/which)
    * for keyboard events (keydown, keypress, and keyup).
    */
  var which: js.UndefOr[Double] = js.native
  /**
    * x-coordinates for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent)
    * and [TouchEvent](https://developer.mozilla.org/docs/Web/API/TouchEvent).
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * y-coordinates for [MouseEvent](https://developer.mozilla.org/docs/Web/API/MouseEvent)
    * and [TouchEvent](https://developer.mozilla.org/docs/Web/API/TouchEvent).
    */
  var y: js.UndefOr[Double] = js.native
}

object IBrowserTriggerEventData {
  @scala.inline
  def apply(): IBrowserTriggerEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBrowserTriggerEventData]
  }
  @scala.inline
  implicit class IBrowserTriggerEventDataOps[Self <: IBrowserTriggerEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(js.undefined)
        ret
    }
    @scala.inline
    def withCharcode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharcode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charcode")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withElapsedTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElapsedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withKeycode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keycode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeycode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keycode")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[ctrl | alt | shift | meta]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedTarget(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withWhich(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("which")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhich: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("which")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

