package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMMutationEvent extends StObject {
  
  @JSName("MSHTML.DOMMutationEvent_typekey")
  var MSHTMLDotDOMMutationEvent_typekey: DOMMutationEvent = js.native
  
  val attrChange: Double = js.native
  
  val attrName: String = js.native
  
  val bubbles: Boolean = js.native
  
  var cancelBubble: Boolean = js.native
  
  val cancelable: Boolean = js.native
  
  val currentTarget: IEventTarget = js.native
  
  val defaultPrevented: Boolean = js.native
  
  val eventPhase: Double = js.native
  
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  
  def initMutationEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    relatedNodeArg: js.Any,
    prevValueArg: String,
    newValueArg: String,
    attrNameArg: String,
    attrChangeArg: Double
  ): Unit = js.native
  
  val isTrusted: Boolean = js.native
  
  val newValue: String = js.native
  
  val prevValue: String = js.native
  
  def preventDefault(): Unit = js.native
  
  val relatedNode: js.Any = js.native
  
  val srcElement: IHTMLElement = js.native
  
  def stopImmediatePropagation(): Unit = js.native
  
  def stopPropagation(): Unit = js.native
  
  val target: IEventTarget = js.native
  
  val timeStamp: Double = js.native
  
  val `type`: String = js.native
}
object DOMMutationEvent {
  
  @scala.inline
  def apply(
    MSHTMLDotDOMMutationEvent_typekey: DOMMutationEvent,
    attrChange: Double,
    attrName: String,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initMutationEvent: (String, Boolean, Boolean, js.Any, String, String, String, Double) => Unit,
    isTrusted: Boolean,
    newValue: String,
    prevValue: String,
    preventDefault: () => Unit,
    relatedNode: js.Any,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String
  ): DOMMutationEvent = {
    val __obj = js.Dynamic.literal(attrChange = attrChange.asInstanceOf[js.Any], attrName = attrName.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initMutationEvent = js.Any.fromFunction8(initMutationEvent), isTrusted = isTrusted.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], prevValue = prevValue.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedNode = relatedNode.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMMutationEvent_typekey")(MSHTMLDotDOMMutationEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMMutationEvent]
  }
  
  @scala.inline
  implicit class DOMMutationEventMutableBuilder[Self <: DOMMutationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrChange(value: Double): Self = StObject.set(x, "attrChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrName(value: String): Self = StObject.set(x, "attrName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTarget(value: IEventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitEvent(value: (String, Boolean, Boolean) => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInitMutationEvent(value: (String, Boolean, Boolean, js.Any, String, String, String, Double) => Unit): Self = StObject.set(x, "initMutationEvent", js.Any.fromFunction8(value))
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotDOMMutationEvent_typekey(value: DOMMutationEvent): Self = StObject.set(x, "MSHTML.DOMMutationEvent_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevValue(value: String): Self = StObject.set(x, "prevValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRelatedNode(value: js.Any): Self = StObject.set(x, "relatedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcElement(value: IHTMLElement): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: IEventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
