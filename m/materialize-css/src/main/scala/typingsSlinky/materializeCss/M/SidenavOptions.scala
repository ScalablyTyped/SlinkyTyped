package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.materializeCssStrings.left
import typingsSlinky.materializeCss.materializeCssStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /**
    * Length in ms of exit transition
    * @default 200
    */
  var outDuration: Double = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdge(value: left | right): Self = this.set("edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDuration(value: Double): Self = this.set("inDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseEnd(value: Element => Unit): Self = this.set("onCloseEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseStart(value: Element => Unit): Self = this.set("onCloseStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenEnd(value: Element => Unit): Self = this.set("onOpenEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenStart(value: Element => Unit): Self = this.set("onOpenStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutDuration(value: Double): Self = this.set("outDuration", value.asInstanceOf[js.Any])
  }
}
