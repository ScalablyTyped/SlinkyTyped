package typingsSlinky.lestate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Force extends StObject {
    
    var force: js.UndefOr[Boolean] = js.native
    
    var id: Double = js.native
    
    def selector(state: js.Any): js.Object = js.native
  }
  object Force {
    
    @scala.inline
    def apply(id: Double, selector: js.Any => js.Object): Force = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], selector = js.Any.fromFunction1(selector))
      __obj.asInstanceOf[Force]
    }
    
    @scala.inline
    implicit class ForceMutableBuilder[Self <: Force] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: js.Any => js.Object): Self = StObject.set(x, "selector", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: Double = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: Double): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InitialState extends StObject
}
