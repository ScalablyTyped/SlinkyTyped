package typingsSlinky.callsites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get callsites from the V8 stack trace API.
  	@returns An array of `CallSite` objects.
  	@example
  	```
  	import callsites = require('callsites');
  	function unicorn() {
  		console.log(callsites()[0].getFileName());
  		//=> '/Users/sindresorhus/dev/callsites/test.js'
  	}
  	unicorn();
  	```
  	*/
  @JSImport("callsites", JSImport.Namespace)
  @js.native
  def apply(): js.Array[CallSite] = js.native
  
  @JSImport("callsites", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function callsites(): callsites.CallSite[];
  // export = callsites;
  @JSImport("callsites", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof callsites */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof callsites */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait CallSite extends StObject {
    
    /**
    		Returns the current column number if this function was defined in a script.
    		*/
    def getColumnNumber(): Double | Null = js.native
    
    /**
    		Returns a string representing the location where `eval` was called if this function was created using a call to `eval`.
    		*/
    def getEvalOrigin(): js.UndefOr[String] = js.native
    
    /**
    		Returns the name of the script if this function was defined in a script.
    		*/
    def getFileName(): String | Null = js.native
    
    /**
    		Returns the current function.
    		*/
    def getFunction(): js.UndefOr[js.Function] = js.native
    
    /**
    		Returns the name of the current function, typically its `name` property. If a name property is not available an attempt will be made to try to infer a name from the function's context.
    		*/
    def getFunctionName(): String | Null = js.native
    
    /**
    		Returns the current line number if this function was defined in a script.
    		*/
    def getLineNumber(): Double | Null = js.native
    
    /**
    		Returns the name of the property of `this` or one of its prototypes that holds the current function.
    		*/
    def getMethodName(): js.UndefOr[String] = js.native
    
    /**
    		Returns the value of `this`.
    		*/
    def getThis(): js.UndefOr[js.Any] = js.native
    
    /**
    		Returns the type of `this` as a string. This is the name of the function stored in the constructor field of `this`, if available, otherwise the object's `[[Class]]` internal property.
    		*/
    def getTypeName(): String | Null = js.native
    
    /**
    		Returns `true` if this is a constructor call.
    		*/
    def isConstructor(): Boolean = js.native
    
    /**
    		Returns `true` if this call takes place in code defined by a call to `eval`.
    		*/
    def isEval(): Boolean = js.native
    
    /**
    		Returns `true` if this call is in native V8 code.
    		*/
    def isNative(): Boolean = js.native
    
    /**
    		Returns `true` if this is a top-level invocation, that is, if it's a global object.
    		*/
    def isToplevel(): Boolean = js.native
  }
  object CallSite {
    
    @scala.inline
    def apply(
      getColumnNumber: () => Double | Null,
      getEvalOrigin: () => js.UndefOr[String],
      getFileName: () => String | Null,
      getFunction: () => js.UndefOr[js.Function],
      getFunctionName: () => String | Null,
      getLineNumber: () => Double | Null,
      getMethodName: () => js.UndefOr[String],
      getThis: () => js.UndefOr[js.Any],
      getTypeName: () => String | Null,
      isConstructor: () => Boolean,
      isEval: () => Boolean,
      isNative: () => Boolean,
      isToplevel: () => Boolean
    ): CallSite = {
      val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
      __obj.asInstanceOf[CallSite]
    }
    
    @scala.inline
    implicit class CallSiteMutableBuilder[Self <: CallSite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetColumnNumber(value: () => Double | Null): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEvalOrigin(value: () => js.UndefOr[String]): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFileName(value: () => String | Null): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFunction(value: () => js.UndefOr[js.Function]): Self = StObject.set(x, "getFunction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFunctionName(value: () => String | Null): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLineNumber(value: () => Double | Null): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMethodName(value: () => js.UndefOr[String]): Self = StObject.set(x, "getMethodName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetThis(value: () => js.UndefOr[js.Any]): Self = StObject.set(x, "getThis", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTypeName(value: () => String | Null): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConstructor(value: () => Boolean): Self = StObject.set(x, "isConstructor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEval(value: () => Boolean): Self = StObject.set(x, "isEval", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsNative(value: () => Boolean): Self = StObject.set(x, "isNative", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsToplevel(value: () => Boolean): Self = StObject.set(x, "isToplevel", js.Any.fromFunction0(value))
    }
  }
}
