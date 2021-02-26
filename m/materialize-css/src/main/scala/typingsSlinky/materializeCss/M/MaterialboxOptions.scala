package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaterialboxOptions extends StObject {
  
  /**
    * Transition in duration in milliseconds
    * @default 275
    */
  var inDuration: Double = js.native
  
  /**
    * Callback function called after materialbox is closed
    * @default null
    */
  def onCloseEnd(el: Element): Unit = js.native
  
  /**
    * Callback function called before materialbox is closed
    * @default null
    */
  def onCloseStart(el: Element): Unit = js.native
  
  /**
    * Callback function called after materialbox is opened
    * @default null
    */
  def onOpenEnd(el: Element): Unit = js.native
  
  /**
    * Callback function called before materialbox is opened
    * @default null
    */
  def onOpenStart(el: Element): Unit = js.native
  
  /**
    * Transition out duration in milliseconds
    * @default 200
    */
  var outDuration: Double = js.native
}
object MaterialboxOptions {
  
  @scala.inline
  def apply(
    inDuration: Double,
    onCloseEnd: Element => Unit,
    onCloseStart: Element => Unit,
    onOpenEnd: Element => Unit,
    onOpenStart: Element => Unit,
    outDuration: Double
  ): MaterialboxOptions = {
    val __obj = js.Dynamic.literal(inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1(onCloseEnd), onCloseStart = js.Any.fromFunction1(onCloseStart), onOpenEnd = js.Any.fromFunction1(onOpenEnd), onOpenStart = js.Any.fromFunction1(onOpenStart), outDuration = outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialboxOptions]
  }
  
  @scala.inline
  implicit class MaterialboxOptionsMutableBuilder[Self <: MaterialboxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseEnd(value: Element => Unit): Self = StObject.set(x, "onCloseEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseStart(value: Element => Unit): Self = StObject.set(x, "onCloseStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenEnd(value: Element => Unit): Self = StObject.set(x, "onOpenEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenStart(value: Element => Unit): Self = StObject.set(x, "onOpenStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
  }
}
