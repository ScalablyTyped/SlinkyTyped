package typingsSlinky.dynatable.JQueryDynatable

import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends StObject {
  
  /** Set up a listener for popstate event on window */
  def init(): Unit = js.native
  
  /**
    * Check if pushState option is true, and if browser supports it
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean = js.native
  
  /**
    * Handler for the popstate event
    *
    * @param event The native popstate event
    */
  def pop(event: Event): Unit = js.native
  
  /**
    * Update the URL data using pushState
    *
    * @param data An object with the parameters we want to push
    */
  def push(data: js.Object): Unit = js.native
}
object State {
  
  @scala.inline
  def apply(init: () => Unit, initOnLoad: () => Boolean, pop: Event => Unit, push: js.Object => Unit): State = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad), pop = js.Any.fromFunction1(pop), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitOnLoad(value: () => Boolean): Self = StObject.set(x, "initOnLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPop(value: Event => Unit): Self = StObject.set(x, "pop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPush(value: js.Object => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
  }
}
