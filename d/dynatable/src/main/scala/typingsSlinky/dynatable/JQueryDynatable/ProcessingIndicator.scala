package typingsSlinky.dynatable.JQueryDynatable

import typingsSlinky.dynatable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingIndicator extends js.Object {
  /** Insert the processing indicator inside the page */
  def attach(): Unit = js.native
  /**
    * Generate the html markup for the processing indicator
    *
    * @return A jQuery object containing the generated html
    */
  def create(): JQuery = js.native
  /** Hide the processing indicator */
  def hide(): Unit = js.native
  /** Set up the processing indicator */
  def init(): Unit = js.native
  /**
    * Position the processing indicator at the center
    *
    * @return A jQuery object containing the processing indicator
    */
  def position(): JQuery = js.native
  /** Show the processing indicator */
  def show(): Unit = js.native
}

object ProcessingIndicator {
  @scala.inline
  def apply(
    attach: () => Unit,
    create: () => JQuery,
    hide: () => Unit,
    init: () => Unit,
    position: () => JQuery,
    show: () => Unit
  ): ProcessingIndicator = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), create = js.Any.fromFunction0(create), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), position = js.Any.fromFunction0(position), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ProcessingIndicator]
  }
  @scala.inline
  implicit class ProcessingIndicatorOps[Self <: ProcessingIndicator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttach(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attach")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreate(value: () => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPosition(value: () => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

