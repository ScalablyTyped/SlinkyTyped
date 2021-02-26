package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractionMixin extends StObject {
  
  def clearInteractionHandle(clearHandle: Double): Unit = js.native
  
  def createInteractionHandle(): Double = js.native
  
  /**
    * Schedule work for after all interactions have completed.
    *
    */
  def runAfterInteractions(callback: js.Function0[_]): Unit = js.native
}
object InteractionMixin {
  
  @scala.inline
  def apply(
    clearInteractionHandle: Double => Unit,
    createInteractionHandle: () => Double,
    runAfterInteractions: js.Function0[_] => Unit
  ): InteractionMixin = {
    val __obj = js.Dynamic.literal(clearInteractionHandle = js.Any.fromFunction1(clearInteractionHandle), createInteractionHandle = js.Any.fromFunction0(createInteractionHandle), runAfterInteractions = js.Any.fromFunction1(runAfterInteractions))
    __obj.asInstanceOf[InteractionMixin]
  }
  
  @scala.inline
  implicit class InteractionMixinMutableBuilder[Self <: InteractionMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearInteractionHandle(value: Double => Unit): Self = StObject.set(x, "clearInteractionHandle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateInteractionHandle(value: () => Double): Self = StObject.set(x, "createInteractionHandle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRunAfterInteractions(value: js.Function0[_] => Unit): Self = StObject.set(x, "runAfterInteractions", js.Any.fromFunction1(value))
  }
}
