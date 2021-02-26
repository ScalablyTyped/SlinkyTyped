package typingsSlinky.atom.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atom.atomStrings.in
import typingsSlinky.atom.atomStrings.out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tooltip extends StObject {
  
  def disable(): Unit = js.native
  
  val element: HTMLElement = js.native
  
  def enable(): Unit = js.native
  
  val enabled: Boolean = js.native
  
  def getArrowElement(): HTMLElement = js.native
  
  def getTitle(): String = js.native
  
  def getTooltipElement(): HTMLElement = js.native
  
  val hoverState: in | out | Null = js.native
  
  val options: TooltipOptions = js.native
  
  def recalculatePosition(): Unit = js.native
  
  val timeout: Double = js.native
  
  def toggle(): Unit = js.native
  
  def toggleEnabled(): Unit = js.native
}
object Tooltip {
  
  @scala.inline
  def apply(
    disable: () => Unit,
    element: HTMLElement,
    enable: () => Unit,
    enabled: Boolean,
    getArrowElement: () => HTMLElement,
    getTitle: () => String,
    getTooltipElement: () => HTMLElement,
    options: TooltipOptions,
    recalculatePosition: () => Unit,
    timeout: Double,
    toggle: () => Unit,
    toggleEnabled: () => Unit
  ): Tooltip = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), element = element.asInstanceOf[js.Any], enable = js.Any.fromFunction0(enable), enabled = enabled.asInstanceOf[js.Any], getArrowElement = js.Any.fromFunction0(getArrowElement), getTitle = js.Any.fromFunction0(getTitle), getTooltipElement = js.Any.fromFunction0(getTooltipElement), options = options.asInstanceOf[js.Any], recalculatePosition = js.Any.fromFunction0(recalculatePosition), timeout = timeout.asInstanceOf[js.Any], toggle = js.Any.fromFunction0(toggle), toggleEnabled = js.Any.fromFunction0(toggleEnabled))
    __obj.asInstanceOf[Tooltip]
  }
  
  @scala.inline
  implicit class TooltipMutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetArrowElement(value: () => HTMLElement): Self = StObject.set(x, "getArrowElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTooltipElement(value: () => HTMLElement): Self = StObject.set(x, "getTooltipElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHoverState(value: in | out): Self = StObject.set(x, "hoverState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverStateNull: Self = StObject.set(x, "hoverState", null)
    
    @scala.inline
    def setOptions(value: TooltipOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecalculatePosition(value: () => Unit): Self = StObject.set(x, "recalculatePosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleEnabled(value: () => Unit): Self = StObject.set(x, "toggleEnabled", js.Any.fromFunction0(value))
  }
}
