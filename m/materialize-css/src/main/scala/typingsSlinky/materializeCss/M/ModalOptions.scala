package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the Modal
  */
@js.native
trait ModalOptions extends js.Object {
  /**
    * Allow modal to be dismissed by keyboard or overlay click.
    * @default true
    */
  var dismissible: Boolean = js.native
  /**
    * Ending top offset
    * @default '10%'
    */
  var endingTop: String = js.native
  /**
    * Transition in duration in milliseconds.
    * @default 250
    */
  var inDuration: Double = js.native
  /**
    * Opacity of the modal overlay.
    * @default 0.5
    */
  var opacity: Double = js.native
  /**
    * Transition out duration in milliseconds.
    * @default 250
    */
  var outDuration: Double = js.native
  /**
    * Prevent page from scrolling while modal is open
    * @default true
    */
  var preventScrolling: Boolean = js.native
  /**
    * Starting top offset
    * @default '4%'
    */
  var startingTop: String = js.native
  /**
    * Callback function called after modal is closed
    * @default null
    */
  def onCloseEnd(el: Element): Unit = js.native
  /**
    * Callback function called before modal is closed
    * @default null
    */
  def onCloseStart(el: Element): Unit = js.native
  /**
    * Callback function called after modal is opened
    * @default null
    */
  def onOpenEnd(el: Element): Unit = js.native
  /**
    * Callback function called before modal is opened
    * @default null
    */
  def onOpenStart(el: Element): Unit = js.native
}

object ModalOptions {
  @scala.inline
  def apply(
    dismissible: Boolean,
    endingTop: String,
    inDuration: Double,
    onCloseEnd: Element => Unit,
    onCloseStart: Element => Unit,
    onOpenEnd: Element => Unit,
    onOpenStart: Element => Unit,
    opacity: Double,
    outDuration: Double,
    preventScrolling: Boolean,
    startingTop: String
  ): ModalOptions = {
    val __obj = js.Dynamic.literal(dismissible = dismissible.asInstanceOf[js.Any], endingTop = endingTop.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1(onCloseEnd), onCloseStart = js.Any.fromFunction1(onCloseStart), onOpenEnd = js.Any.fromFunction1(onOpenEnd), onOpenStart = js.Any.fromFunction1(onOpenStart), opacity = opacity.asInstanceOf[js.Any], outDuration = outDuration.asInstanceOf[js.Any], preventScrolling = preventScrolling.asInstanceOf[js.Any], startingTop = startingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions]
  }
  @scala.inline
  implicit class ModalOptionsOps[Self <: ModalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismissible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndingTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCloseEnd(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCloseStart(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpenEnd(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpenStart(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartingTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

