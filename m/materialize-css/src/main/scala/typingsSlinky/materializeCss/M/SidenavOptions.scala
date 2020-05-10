package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.materializeCssStrings.left
import typingsSlinky.materializeCss.materializeCssStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the Sidenav
  */
@js.native
trait SidenavOptions extends js.Object {
  /**
    * Allow swipe gestures to open/close Sidenav
    * @default true
    */
  var draggable: Boolean = js.native
  /**
    * Side of screen on which Sidenav appears
    * @default 'left'
    */
  var edge: left | right = js.native
  /**
    * Length in ms of enter transition
    * @default 250
    */
  var inDuration: Double = js.native
  /**
    * Length in ms of exit transition
    * @default 200
    */
  var outDuration: Double = js.native
  /**
    * Function called when sidenav finishes exiting
    */
  def onCloseEnd(elem: Element): Unit = js.native
  /**
    * Function called when sidenav starts exiting
    */
  def onCloseStart(elem: Element): Unit = js.native
  /**
    * Function called when sidenav finishes entering
    */
  def onOpenEnd(elem: Element): Unit = js.native
  /**
    * Function called when sidenav starts entering
    */
  def onOpenStart(elem: Element): Unit = js.native
}

object SidenavOptions {
  @scala.inline
  def apply(
    draggable: Boolean,
    edge: left | right,
    inDuration: Double,
    onCloseEnd: Element => Unit,
    onCloseStart: Element => Unit,
    onOpenEnd: Element => Unit,
    onOpenStart: Element => Unit,
    outDuration: Double
  ): SidenavOptions = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1(onCloseEnd), onCloseStart = js.Any.fromFunction1(onCloseStart), onOpenEnd = js.Any.fromFunction1(onOpenEnd), onOpenStart = js.Any.fromFunction1(onOpenStart), outDuration = outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidenavOptions]
  }
  @scala.inline
  implicit class SidenavOptionsOps[Self <: SidenavOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdge(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(value.asInstanceOf[js.Any])
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
    def withOutDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDuration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

