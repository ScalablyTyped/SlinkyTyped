package typingsSlinky.emscripten

import typingsSlinky.emscripten.anon.Kind
import typingsSlinky.emscripten.anon.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Emscripten {
  
  @js.native
  trait CCallOpts extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
  }
  object CCallOpts {
    
    @scala.inline
    def apply(): CCallOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CCallOpts]
    }
    
    @scala.inline
    implicit class CCallOptsMutableBuilder[Self <: CCallOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.emscripten.emscriptenStrings.float
    - typingsSlinky.emscripten.emscriptenStrings.double
  */
  trait CFloatType extends StObject
  object CFloatType {
    
    @scala.inline
    def double: typingsSlinky.emscripten.emscriptenStrings.double = "double".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.double]
    
    @scala.inline
    def float: typingsSlinky.emscripten.emscriptenStrings.float = "float".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.float]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.emscripten.emscriptenStrings.i8
    - typingsSlinky.emscripten.emscriptenStrings.i16
    - typingsSlinky.emscripten.emscriptenStrings.i32
    - typingsSlinky.emscripten.emscriptenStrings.i64
  */
  trait CIntType extends StObject
  object CIntType {
    
    @scala.inline
    def i16: typingsSlinky.emscripten.emscriptenStrings.i16 = "i16".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i16]
    
    @scala.inline
    def i32: typingsSlinky.emscripten.emscriptenStrings.i32 = "i32".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i32]
    
    @scala.inline
    def i64: typingsSlinky.emscripten.emscriptenStrings.i64 = "i64".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i64]
    
    @scala.inline
    def i8: typingsSlinky.emscripten.emscriptenStrings.i8 = "i8".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.emscripten.emscriptenStrings.i8Asterisk
    - typingsSlinky.emscripten.emscriptenStrings.i16Asterisk
    - typingsSlinky.emscripten.emscriptenStrings.i32Asterisk
    - typingsSlinky.emscripten.emscriptenStrings.i64Asterisk
    - typingsSlinky.emscripten.emscriptenStrings.floatAsterisk
    - typingsSlinky.emscripten.emscriptenStrings.doubleAsterisk
    - typingsSlinky.emscripten.emscriptenStrings.Asterisk
  */
  trait CPointerType extends StObject
  object CPointerType {
    
    @scala.inline
    def Asterisk: typingsSlinky.emscripten.emscriptenStrings.Asterisk = "*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.Asterisk]
    
    @scala.inline
    def doubleAsterisk: typingsSlinky.emscripten.emscriptenStrings.doubleAsterisk = "double*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.doubleAsterisk]
    
    @scala.inline
    def floatAsterisk: typingsSlinky.emscripten.emscriptenStrings.floatAsterisk = "float*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.floatAsterisk]
    
    @scala.inline
    def i16Asterisk: typingsSlinky.emscripten.emscriptenStrings.i16Asterisk = "i16*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i16Asterisk]
    
    @scala.inline
    def i32Asterisk: typingsSlinky.emscripten.emscriptenStrings.i32Asterisk = "i32*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i32Asterisk]
    
    @scala.inline
    def i64Asterisk: typingsSlinky.emscripten.emscriptenStrings.i64Asterisk = "i64*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i64Asterisk]
    
    @scala.inline
    def i8Asterisk: typingsSlinky.emscripten.emscriptenStrings.i8Asterisk = "i8*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i8Asterisk]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.emscripten.emscriptenStrings.i8
    - typingsSlinky.emscripten.emscriptenStrings.i16
    - typingsSlinky.emscripten.emscriptenStrings.i32
    - typingsSlinky.emscripten.emscriptenStrings.i64
    - typingsSlinky.emscripten.emscriptenStrings.float
    - typingsSlinky.emscripten.emscriptenStrings.double
    - typingsSlinky.emscripten.emscriptenStrings.i8Asterisk
    - typingsSlinky.emscripten.emscriptenStrings.i16Asterisk
    - typingsSlinky.emscripten.emscriptenStrings.i32Asterisk
    - typingsSlinky.emscripten.emscriptenStrings.i64Asterisk
    - typingsSlinky.emscripten.emscriptenStrings.floatAsterisk
    - typingsSlinky.emscripten.emscriptenStrings.doubleAsterisk
    - typingsSlinky.emscripten.emscriptenStrings.Asterisk
  */
  trait CType extends StObject
  object CType {
    
    @scala.inline
    def Asterisk: typingsSlinky.emscripten.emscriptenStrings.Asterisk = "*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.Asterisk]
    
    @scala.inline
    def double: typingsSlinky.emscripten.emscriptenStrings.double = "double".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.double]
    
    @scala.inline
    def doubleAsterisk: typingsSlinky.emscripten.emscriptenStrings.doubleAsterisk = "double*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.doubleAsterisk]
    
    @scala.inline
    def float: typingsSlinky.emscripten.emscriptenStrings.float = "float".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.float]
    
    @scala.inline
    def floatAsterisk: typingsSlinky.emscripten.emscriptenStrings.floatAsterisk = "float*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.floatAsterisk]
    
    @scala.inline
    def i16: typingsSlinky.emscripten.emscriptenStrings.i16 = "i16".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i16]
    
    @scala.inline
    def i16Asterisk: typingsSlinky.emscripten.emscriptenStrings.i16Asterisk = "i16*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i16Asterisk]
    
    @scala.inline
    def i32: typingsSlinky.emscripten.emscriptenStrings.i32 = "i32".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i32]
    
    @scala.inline
    def i32Asterisk: typingsSlinky.emscripten.emscriptenStrings.i32Asterisk = "i32*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i32Asterisk]
    
    @scala.inline
    def i64: typingsSlinky.emscripten.emscriptenStrings.i64 = "i64".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i64]
    
    @scala.inline
    def i64Asterisk: typingsSlinky.emscripten.emscriptenStrings.i64Asterisk = "i64*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i64Asterisk]
    
    @scala.inline
    def i8: typingsSlinky.emscripten.emscriptenStrings.i8 = "i8".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i8]
    
    @scala.inline
    def i8Asterisk: typingsSlinky.emscripten.emscriptenStrings.i8Asterisk = "i8*".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.i8Asterisk]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.emscripten.emscriptenStrings.WEB
    - typingsSlinky.emscripten.emscriptenStrings.NODE
    - typingsSlinky.emscripten.emscriptenStrings.SHELL
    - typingsSlinky.emscripten.emscriptenStrings.WORKER
  */
  trait EnvironmentType extends StObject
  object EnvironmentType {
    
    @scala.inline
    def NODE: typingsSlinky.emscripten.emscriptenStrings.NODE = "NODE".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.NODE]
    
    @scala.inline
    def SHELL: typingsSlinky.emscripten.emscriptenStrings.SHELL = "SHELL".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.SHELL]
    
    @scala.inline
    def WEB: typingsSlinky.emscripten.emscriptenStrings.WEB = "WEB".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.WEB]
    
    @scala.inline
    def WORKER: typingsSlinky.emscripten.emscriptenStrings.WORKER = "WORKER".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.WORKER]
  }
  
  @js.native
  trait FileSystemType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.emscripten.emscriptenStrings.number
    - typingsSlinky.emscripten.emscriptenStrings.string
    - typingsSlinky.emscripten.emscriptenStrings.array
    - typingsSlinky.emscripten.emscriptenStrings.boolean
  */
  trait JSType extends StObject
  object JSType {
    
    @scala.inline
    def array: typingsSlinky.emscripten.emscriptenStrings.array = "array".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.array]
    
    @scala.inline
    def boolean: typingsSlinky.emscripten.emscriptenStrings.boolean = "boolean".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.boolean]
    
    @scala.inline
    def number: typingsSlinky.emscripten.emscriptenStrings.number = "number".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.number]
    
    @scala.inline
    def string: typingsSlinky.emscripten.emscriptenStrings.string = "string".asInstanceOf[typingsSlinky.emscripten.emscriptenStrings.string]
  }
  
  type TypeCompatibleWithC = Double | String | js.Array[js.Any] | Boolean
  
  type WebAssemblyExports = js.Array[Module]
  
  type WebAssemblyImports = js.Array[Kind]
}
