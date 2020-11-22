package typingsSlinky.customFunctionsRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.customFunctionsRuntime.CustomFunctions.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object CustomFunctions extends js.Object {
    
    /**
      * Associates the JavaScript function to the name given by the "id" property in the metadata JSON file.
      */
    def associate(id: String, functionObject: js.Function): Unit = js.native
    /**
      * Associates the JavaScript functions to the names given by the "id" properties in the metadata JSON file.
      */
    def associate(mappings: StringDictionary[js.Function]): Unit = js.native
    
    /**
      * Use this class to handle errors and write custom error messages.
      * [Api set: CustomFunctionsRuntime 1.2]
      */
    @js.native
    class Error protected ()
      extends typingsSlinky.customFunctionsRuntime.CustomFunctions.Error {
      def this(code: ErrorCode) = this()
      def this(code: ErrorCode, message: String) = this()
    }
    
    /**
      * Error codes for custom functions. The error codes will appear in the cell that invoked the function.
      *
      * Custom error messages appear in addition to these error codes. Custom messages display in the error
      * indicator menu, which is accessed by hovering over the error flag on each cell with an error.
      */
    @js.native
    object ErrorCode extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.customFunctionsRuntime.CustomFunctions.ErrorCode with String] = js.native
      
      /* "#DIV/0!" */ val divisionByZero: typingsSlinky.customFunctionsRuntime.CustomFunctions.ErrorCode.divisionByZero with String = js.native
      
      /* "#NAME?" */ val invalidName: typingsSlinky.customFunctionsRuntime.CustomFunctions.ErrorCode.invalidName with String = js.native
      
      /* "#NUM!" */ val invalidNumber: typingsSlinky.customFunctionsRuntime.CustomFunctions.ErrorCode.invalidNumber with String = js.native
      
      /* "#REF!" */ val invalidReference: typingsSlinky.customFunctionsRuntime.CustomFunctions.ErrorCode.invalidReference with String = js.native
      
      /* "#VALUE!" */ val invalidValue: typingsSlinky.customFunctionsRuntime.CustomFunctions.ErrorCode.invalidValue with String = js.native
      
      /* "#N/A" */ val notAvailable: typingsSlinky.customFunctionsRuntime.CustomFunctions.ErrorCode.notAvailable with String = js.native
      
      /* "#NULL!" */ val nullReference: typingsSlinky.customFunctionsRuntime.CustomFunctions.ErrorCode.nullReference with String = js.native
    }
  }
}
