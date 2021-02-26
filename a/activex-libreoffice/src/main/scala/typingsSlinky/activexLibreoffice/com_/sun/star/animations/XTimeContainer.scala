package typingsSlinky.activexLibreoffice.com_.sun.star.animations

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supported modules BasicInlineTimingEventTimingFillDefaultMultiArcTimingRepeatTiming ** The deprecated repeat is not supported.
  * **RestartDefaultRestartTimingTimeContainerAttributes
  * @see http://www.w3.org/TR/smil20/smil-timing.html
  * @see http://www.w3.org/TR/smil20/smil-timing.html#Timing-TimingConcepts
  */
@js.native
trait XTimeContainer extends XAnimationNode {
  
  def appendChild(newChild: XAnimationNode): XAnimationNode = js.native
  
  def insertAfter(newChild: XAnimationNode, refChild: XAnimationNode): XAnimationNode = js.native
  
  def insertBefore(newChild: XAnimationNode, refChild: XAnimationNode): XAnimationNode = js.native
  
  def removeChild(oldChild: XAnimationNode): XAnimationNode = js.native
  
  def replaceChild(newChild: XAnimationNode, oldChild: XAnimationNode): XAnimationNode = js.native
}
object XTimeContainer {
  
  @scala.inline
  def apply(
    Acceleration: Double,
    AutoReverse: Boolean,
    Begin: js.Any,
    Decelerate: Double,
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    Fill: Double,
    FillDefault: Double,
    Parent: XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: Double,
    RestartDefault: Double,
    Type: Double,
    UserData: SafeArray[NamedValue],
    acquire: () => Unit,
    appendChild: XAnimationNode => XAnimationNode,
    getParent: () => XInterface,
    insertAfter: (XAnimationNode, XAnimationNode) => XAnimationNode,
    insertBefore: (XAnimationNode, XAnimationNode) => XAnimationNode,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChild: XAnimationNode => XAnimationNode,
    replaceChild: (XAnimationNode, XAnimationNode) => XAnimationNode,
    setParent: XInterface => Unit
  ): XTimeContainer = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), getParent = js.Any.fromFunction0(getParent), insertAfter = js.Any.fromFunction2(insertAfter), insertBefore = js.Any.fromFunction2(insertBefore), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XTimeContainer]
  }
  
  @scala.inline
  implicit class XTimeContainerMutableBuilder[Self <: XTimeContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendChild(value: XAnimationNode => XAnimationNode): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertAfter(value: (XAnimationNode, XAnimationNode) => XAnimationNode): Self = StObject.set(x, "insertAfter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertBefore(value: (XAnimationNode, XAnimationNode) => XAnimationNode): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveChild(value: XAnimationNode => XAnimationNode): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceChild(value: (XAnimationNode, XAnimationNode) => XAnimationNode): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
  }
}
