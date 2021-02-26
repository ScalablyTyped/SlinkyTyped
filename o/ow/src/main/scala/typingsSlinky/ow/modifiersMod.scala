package typingsSlinky.ow

import typingsSlinky.ow.predicatesMod.Predicates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersMod {
  
  @JSImport("ow/dist/source/modifiers", JSImport.Default)
  @js.native
  def default[T](`object`: T): T with Modifiers = js.native
  
  @js.native
  trait Modifiers extends StObject {
    
    /**
      Make the following predicate optional so it doesn't fail when the value is `undefined`.
      */
    val optional: Predicates = js.native
  }
  object Modifiers {
    
    @scala.inline
    def apply(optional: Predicates): Modifiers = {
      val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modifiers]
    }
    
    @scala.inline
    implicit class ModifiersMutableBuilder[Self <: Modifiers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptional(value: Predicates): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    }
  }
}
