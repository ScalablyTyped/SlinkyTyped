package typingsSlinky.gatsbyCli

import slinky.core.ReactComponentClass
import typingsSlinky.gatsbyCli.structuredErrorsTypesMod.IStructuredError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/components/error", "Error")
  @js.native
  val Error: ReactComponentClass[IErrorProps] = js.native
  
  @js.native
  trait IErrorProps extends StObject {
    
    var details: IStructuredError = js.native
  }
  object IErrorProps {
    
    @scala.inline
    def apply(details: IStructuredError): IErrorProps = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any])
      __obj.asInstanceOf[IErrorProps]
    }
    
    @scala.inline
    implicit class IErrorPropsMutableBuilder[Self <: IErrorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: IStructuredError): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    }
  }
}
