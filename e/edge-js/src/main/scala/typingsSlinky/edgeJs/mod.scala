package typingsSlinky.edgeJs

import typingsSlinky.edgeJs.edgeJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("edge-js", "func")
  @js.native
  def func[TInput, TOutput](language: String, params: String): Func_[TInput, TOutput] = js.native
  @JSImport("edge-js", "func")
  @js.native
  def func[TInput, TOutput](language: String, params: js.Function): Func_[TInput, TOutput] = js.native
  @JSImport("edge-js", "func")
  @js.native
  def func[TInput, TOutput](language: String, params: Params): Func_[TInput, TOutput] = js.native
  @JSImport("edge-js", "func")
  @js.native
  def func[TInput, TOutput](language: String, params: Source): Func_[TInput, TOutput] = js.native
  @JSImport("edge-js", "func")
  @js.native
  def func[TInput, TOutput](language: String, params: TSQL): Func_[TInput, TOutput] = js.native
  @JSImport("edge-js", "func")
  @js.native
  def func[TInput, TOutput](params: String): Func_[TInput, TOutput] = js.native
  @JSImport("edge-js", "func")
  @js.native
  def func[TInput, TOutput](params: js.Function): Func_[TInput, TOutput] = js.native
  @JSImport("edge-js", "func")
  @js.native
  def func[TInput, TOutput](params: Params): Func_[TInput, TOutput] = js.native
  @JSImport("edge-js", "func")
  @js.native
  def func[TInput, TOutput](params: Source): Func_[TInput, TOutput] = js.native
  @JSImport("edge-js", "func")
  @js.native
  def func[TInput, TOutput](params: TSQL): Func_[TInput, TOutput] = js.native
  
  @js.native
  trait Func_[TInput, TOutput] extends StObject {
    
    def apply(payload: TInput, callback: js.Function2[/* error */ js.Error, /* result */ TOutput, Unit]): Unit = js.native
    def apply(payload: TInput, sync: `true`): TOutput = js.native
  }
  
  @js.native
  trait Params extends StObject {
    
    var assemblyFile: String = js.native
    
    var methodName: js.UndefOr[String] = js.native
    
    var typeName: js.UndefOr[String] = js.native
  }
  object Params {
    
    @scala.inline
    def apply(assemblyFile: String): Params = {
      val __obj = js.Dynamic.literal(assemblyFile = assemblyFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssemblyFile(value: String): Self = StObject.set(x, "assemblyFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
      
      @scala.inline
      def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    }
  }
  
  @js.native
  trait Source extends StObject {
    
    var references: js.UndefOr[js.Array[String]] = js.native
    
    var source: String | js.Function = js.native
  }
  object Source {
    
    @scala.inline
    def apply(source: String | js.Function): Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      @scala.inline
      def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: String | js.Function): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TSQL extends StObject {
    
    var commandTimeout: js.UndefOr[Double] = js.native
    
    var connectionString: js.UndefOr[String] = js.native
    
    var source: String = js.native
  }
  object TSQL {
    
    @scala.inline
    def apply(source: String): TSQL = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSQL]
    }
    
    @scala.inline
    implicit class TSQLMutableBuilder[Self <: TSQL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommandTimeout(value: Double): Self = StObject.set(x, "commandTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandTimeoutUndefined: Self = StObject.set(x, "commandTimeout", js.undefined)
      
      @scala.inline
      def setConnectionString(value: String): Self = StObject.set(x, "connectionString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionStringUndefined: Self = StObject.set(x, "connectionString", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
