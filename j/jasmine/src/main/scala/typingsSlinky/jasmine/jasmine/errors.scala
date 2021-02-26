package typingsSlinky.jasmine.jasmine

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errors {
  
  @js.native
  trait ExpectationFailed extends Error
  object ExpectationFailed {
    
    @scala.inline
    def apply(message: String, name: String): ExpectationFailed = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectationFailed]
    }
  }
}
