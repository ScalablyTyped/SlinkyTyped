package typingsSlinky.bootstrap.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.bootstrap.bootstrapStrings.left
import typingsSlinky.bootstrap.bootstrapStrings.right
import typingsSlinky.jquery.JQuery_.TriggeredEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselEventHandler[TElement]
  extends TriggeredEvent[TElement, js.UndefOr[scala.Nothing], HTMLElement, HTMLElement] {
   // overridden only for better JsDoc
  /**
    * The direction in which the carousel is sliding.
    */
  var direction: left | right = js.native
  /**
    * The index of the current item.
    */
  var from: Double = js.native
  /**
    * The DOM element that is being slid into place as the active item.
    */
  var relatedTarget: HTMLElement = js.native
  /**
    * The index of the next item.
    */
  var to: Double = js.native
}

object CarouselEventHandler {
  @scala.inline
  def apply[TElement](
    currentTarget: HTMLElement,
    delegateTarget: TElement,
    direction: left | right,
    from: Double,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    relatedTarget: HTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: HTMLElement,
    timeStamp: Double,
    to: Double,
    `type`: String
  ): CarouselEventHandler[TElement] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselEventHandler[TElement]]
  }
  @scala.inline
  implicit class CarouselEventHandlerOps[Self[telement] <: CarouselEventHandler[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withDirection(value: left | right): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedTarget(value: HTMLElement): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Double): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

