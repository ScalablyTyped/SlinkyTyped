package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.typesMod.ErrorFilterFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("fast-glob/out/providers/filters/error", JSImport.Default)
  @js.native
  class default protected () extends ErrorFilter {
    def this(_settings: typingsSlinky.fastGlob.settingsMod.default) = this()
  }
  
  @js.native
  trait ErrorFilter extends StObject {
    
    var _isNonFatalError: js.Any = js.native
    
    val _settings: js.Any = js.native
    
    def getFilter(): ErrorFilterFunction = js.native
  }
  object ErrorFilter {
    
    @scala.inline
    def apply(_isNonFatalError: js.Any, _settings: js.Any, getFilter: () => ErrorFilterFunction): ErrorFilter = {
      val __obj = js.Dynamic.literal(_isNonFatalError = _isNonFatalError.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], getFilter = js.Any.fromFunction0(getFilter))
      __obj.asInstanceOf[ErrorFilter]
    }
    
    @scala.inline
    implicit class ErrorFilterMutableBuilder[Self <: ErrorFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFilter(value: () => ErrorFilterFunction): Self = StObject.set(x, "getFilter", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_isNonFatalError(value: js.Any): Self = StObject.set(x, "_isNonFatalError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_settings(value: js.Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
