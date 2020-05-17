package typingsSlinky.bootstrap.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery.TriggeredEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalEventHandler[TElement]
  extends TriggeredEvent[TElement, js.UndefOr[scala.Nothing], HTMLElement, HTMLElement] {
   // overridden only for better JsDoc
  /**
    * For `show.bs.modal` and `shown.bs.modal` is the clicked element, when caused by a _click_.
    * Otherwise is undefined.
    */
  var relatedTarget: js.UndefOr[HTMLElement] = js.native
}

object ModalEventHandler {
  @scala.inline
  def apply[TElement](
    currentTarget: HTMLElement,
    delegateTarget: TElement,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: HTMLElement,
    timeStamp: Double,
    `type`: String
  ): ModalEventHandler[TElement] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalEventHandler[TElement]]
  }
  @scala.inline
  implicit class ModalEventHandlerOps[Self[telement] <: ModalEventHandler[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withRelatedTarget(value: HTMLElement): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedTarget: Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedTarget")(js.undefined)
        ret
    }
  }
  
}

