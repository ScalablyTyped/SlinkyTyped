package typingsSlinky.angularHttpAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Reject extends StObject {
    
    def reject(data: js.Any): Unit = js.native
    
    def resolve(data: js.Any): Unit = js.native
  }
  object Reject {
    
    @scala.inline
    def apply(reject: js.Any => Unit, resolve: js.Any => Unit): Reject = {
      val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Reject]
    }
    
    @scala.inline
    implicit class RejectMutableBuilder[Self <: Reject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReject(value: js.Any => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolve(value: js.Any => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
