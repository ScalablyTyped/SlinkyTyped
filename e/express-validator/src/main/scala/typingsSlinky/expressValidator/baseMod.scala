package typingsSlinky.expressValidator

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expressValidator.expressValidatorStrings._error
import typingsSlinky.std.Error
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("express-validator/src/base", "ValidationHalt")
  @js.native
  class ValidationHalt () extends Error
  
  @JSImport("express-validator/src/base", "contextsKey")
  @js.native
  val contextsKey: /* "express-validator#contexts" */ String = js.native
  
  type CustomSanitizer = js.Function2[/* input */ js.Any, /* meta */ Meta, js.Any]
  
  type CustomValidator = js.Function2[/* input */ js.Any, /* meta */ Meta, js.Any]
  
  type DynamicMessageCreator = js.Function2[/* value */ js.Any, /* meta */ Meta, js.Any]
  
  @js.native
  trait FieldInstance extends StObject {
    
    var location: Location = js.native
    
    var originalPath: String = js.native
    
    var originalValue: js.Any = js.native
    
    var path: String = js.native
    
    var value: js.Any = js.native
  }
  object FieldInstance {
    
    @scala.inline
    def apply(location: Location, originalPath: String, originalValue: js.Any, path: String, value: js.Any): FieldInstance = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], originalPath = originalPath.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldInstance]
    }
    
    @scala.inline
    implicit class FieldInstanceMutableBuilder[Self <: FieldInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalValue(value: js.Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InternalRequest extends Request
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.expressValidator.expressValidatorStrings.body
    - typingsSlinky.expressValidator.expressValidatorStrings.cookies
    - typingsSlinky.expressValidator.expressValidatorStrings.headers
    - typingsSlinky.expressValidator.expressValidatorStrings.params
    - typingsSlinky.expressValidator.expressValidatorStrings.query
  */
  trait Location extends StObject
  object Location {
    
    @scala.inline
    def body: typingsSlinky.expressValidator.expressValidatorStrings.body = "body".asInstanceOf[typingsSlinky.expressValidator.expressValidatorStrings.body]
    
    @scala.inline
    def cookies: typingsSlinky.expressValidator.expressValidatorStrings.cookies = "cookies".asInstanceOf[typingsSlinky.expressValidator.expressValidatorStrings.cookies]
    
    @scala.inline
    def headers: typingsSlinky.expressValidator.expressValidatorStrings.headers = "headers".asInstanceOf[typingsSlinky.expressValidator.expressValidatorStrings.headers]
    
    @scala.inline
    def params: typingsSlinky.expressValidator.expressValidatorStrings.params = "params".asInstanceOf[typingsSlinky.expressValidator.expressValidatorStrings.params]
    
    @scala.inline
    def query: typingsSlinky.expressValidator.expressValidatorStrings.query = "query".asInstanceOf[typingsSlinky.expressValidator.expressValidatorStrings.query]
  }
  
  @js.native
  trait Meta extends StObject {
    
    var location: Location = js.native
    
    var path: String = js.native
    
    var req: Request = js.native
  }
  object Meta {
    
    @scala.inline
    def apply(location: Location, path: String, req: Request): Meta = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    @scala.inline
    implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReq(value: Request): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  type Middleware = js.Function3[
    /* req */ Request, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  @js.native
  trait Request
    extends /* k */ StringDictionary[js.Any] {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var cookies: js.UndefOr[Record[String, _]] = js.native
    
    var headers: js.UndefOr[Record[String, _]] = js.native
    
    var params: js.UndefOr[Record[String, _]] = js.native
    
    var query: js.UndefOr[Record[String, _]] = js.native
  }
  object Request {
    
    @scala.inline
    def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCookies(value: Record[String, _]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setHeaders(value: Record[String, _]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setParams(value: Record[String, _]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setQuery(value: Record[String, _]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  type StandardSanitizer = js.Function2[/* input */ String, /* repeated */ js.Any, js.Any]
  
  type StandardValidator = js.Function2[/* input */ String, /* repeated */ js.Any, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.expressValidator.anon.Location
    - typingsSlinky.expressValidator.anon.Msg
  */
  trait ValidationError extends StObject
  object ValidationError {
    
    @scala.inline
    def Location(
      msg: js.Any,
      nestedErrors: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
        ],
      param: _error
    ): typingsSlinky.expressValidator.anon.Location = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.expressValidator.anon.Location]
    }
    
    @scala.inline
    def Msg(location: Location, msg: js.Any, param: String, value: js.Any): typingsSlinky.expressValidator.anon.Msg = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.expressValidator.anon.Msg]
    }
  }
}
