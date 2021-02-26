package typingsSlinky.formol

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictk
    extends /* k */ StringDictionary[js.Any] {
    
    var no: ReactElement = js.native
    
    var yes: ReactElement = js.native
  }
  object Dictk {
    
    @scala.inline
    def apply(): Dictk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictk]
    }
    
    @scala.inline
    implicit class DictkMutableBuilder[Self <: Dictk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNo(value: ReactElement): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUndefined: Self = StObject.set(x, "no", js.undefined)
      
      @scala.inline
      def setYes(value: ReactElement): Self = StObject.set(x, "yes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYesUndefined: Self = StObject.set(x, "yes", js.undefined)
    }
  }
}
