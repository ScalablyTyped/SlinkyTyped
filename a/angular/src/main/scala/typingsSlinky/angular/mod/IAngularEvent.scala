package typingsSlinky.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAngularEvent extends StObject {
  
  /**
    * the scope that is currently handling the event. Once the event propagates through the scope hierarchy, this property is set to null.
    */
  var currentScope: IScope = js.native
  
  /**
    * true if preventDefault was called.
    */
  var defaultPrevented: Boolean = js.native
  
  /**
    * name of the event.
    */
  var name: String = js.native
  
  /**
    * calling preventDefault sets defaultPrevented flag to true.
    */
  def preventDefault(): Unit = js.native
  
  /**
    * calling stopPropagation function will cancel further event propagation (available only for events that were $emit-ed).
    */
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * the scope on which the event was $emit-ed or $broadcast-ed.
    */
  var targetScope: IScope = js.native
}
object IAngularEvent {
  
  @scala.inline
  def apply(
    currentScope: IScope,
    defaultPrevented: Boolean,
    name: String,
    preventDefault: () => Unit,
    targetScope: IScope
  ): IAngularEvent = {
    val __obj = js.Dynamic.literal(currentScope = currentScope.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), targetScope = targetScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAngularEvent]
  }
  
  @scala.inline
  implicit class IAngularEventMutableBuilder[Self <: IAngularEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentScope(value: IScope): Self = StObject.set(x, "currentScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    
    @scala.inline
    def setTargetScope(value: IScope): Self = StObject.set(x, "targetScope", value.asInstanceOf[js.Any])
  }
}
