package typingsSlinky.jestValidate

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jestValidate.typesMod.DeprecatedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dicts
    extends /* s */ StringDictionary[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
        ] {
    
    var deprecationEntries: DeprecatedOptions = js.native
  }
  object Dicts {
    
    @scala.inline
    def apply(deprecationEntries: DeprecatedOptions): Dicts = {
      val __obj = js.Dynamic.literal(deprecationEntries = deprecationEntries.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dicts]
    }
    
    @scala.inline
    implicit class DictsMutableBuilder[Self <: Dicts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeprecationEntries(value: DeprecatedOptions): Self = StObject.set(x, "deprecationEntries", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HasDeprecationWarnings extends StObject {
    
    var hasDeprecationWarnings: Boolean = js.native
    
    var isValid: Boolean = js.native
  }
  object HasDeprecationWarnings {
    
    @scala.inline
    def apply(hasDeprecationWarnings: Boolean, isValid: Boolean): HasDeprecationWarnings = {
      val __obj = js.Dynamic.literal(hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasDeprecationWarnings]
    }
    
    @scala.inline
    implicit class HasDeprecationWarningsMutableBuilder[Self <: HasDeprecationWarnings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasDeprecationWarnings(value: Boolean): Self = StObject.set(x, "hasDeprecationWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
}
