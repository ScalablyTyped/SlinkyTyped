package typingsSlinky.backlogJs.mod

import org.scalajs.dom.experimental.Response
import typingsSlinky.backlogJs.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Error {
  
  @JSImport("backlog-js", "Error.BacklogApiError")
  @js.native
  class BacklogApiError protected () extends BacklogError {
    def this(response: Response) = this()
    def this(response: Response, body: Errors) = this()
  }
  
  @JSImport("backlog-js", "Error.BacklogAuthError")
  @js.native
  class BacklogAuthError protected () extends BacklogError {
    def this(response: Response) = this()
    def this(response: Response, body: Errors) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("backlog-js", "Error.BacklogError")
  @js.native
  class BacklogError protected () extends StObject {
    def this(name: BacklogErrorNameType, response: Response) = this()
    def this(name: BacklogErrorNameType, response: Response, body: Errors) = this()
    
    var _body: js.Any = js.native
    
    var _name: js.Any = js.native
    
    var _response: js.Any = js.native
    
    var _status: js.Any = js.native
    
    var _url: js.Any = js.native
    
    var body: Errors = js.native
    
    var name: BacklogErrorNameType = js.native
    
    var response: Response = js.native
    
    var status: Double = js.native
    
    var url: String = js.native
  }
  
  @JSImport("backlog-js", "Error.UnexpectedError")
  @js.native
  class UnexpectedError protected () extends BacklogError {
    def this(response: Response) = this()
  }
  
  @js.native
  trait BacklogErrorMessage extends StObject {
    
    var code: Double = js.native
    
    var errorInfo: String = js.native
    
    var message: String = js.native
    
    var moreInfo: String = js.native
  }
  object BacklogErrorMessage {
    
    @scala.inline
    def apply(code: Double, errorInfo: String, message: String, moreInfo: String): BacklogErrorMessage = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errorInfo = errorInfo.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], moreInfo = moreInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[BacklogErrorMessage]
    }
    
    @scala.inline
    implicit class BacklogErrorMessageMutableBuilder[Self <: BacklogErrorMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorInfo(value: String): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoreInfo(value: String): Self = StObject.set(x, "moreInfo", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.backlogJs.backlogJsStrings.BacklogApiError
    - typingsSlinky.backlogJs.backlogJsStrings.BacklogAuthError
    - typingsSlinky.backlogJs.backlogJsStrings.UnexpectedError
  */
  trait BacklogErrorNameType extends StObject
  object BacklogErrorNameType {
    
    @scala.inline
    def BacklogApiError: typingsSlinky.backlogJs.backlogJsStrings.BacklogApiError = "BacklogApiError".asInstanceOf[typingsSlinky.backlogJs.backlogJsStrings.BacklogApiError]
    
    @scala.inline
    def BacklogAuthError: typingsSlinky.backlogJs.backlogJsStrings.BacklogAuthError = "BacklogAuthError".asInstanceOf[typingsSlinky.backlogJs.backlogJsStrings.BacklogAuthError]
    
    @scala.inline
    def UnexpectedError: typingsSlinky.backlogJs.backlogJsStrings.UnexpectedError = "UnexpectedError".asInstanceOf[typingsSlinky.backlogJs.backlogJsStrings.UnexpectedError]
  }
}
