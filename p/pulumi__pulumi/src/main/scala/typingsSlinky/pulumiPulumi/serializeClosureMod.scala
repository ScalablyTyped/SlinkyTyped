package typingsSlinky.pulumiPulumi

import typingsSlinky.pulumiPulumi.resourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializeClosureMod {
  
  @JSImport("@pulumi/pulumi/runtime/closure/serializeClosure", "serializeFunction")
  @js.native
  def serializeFunction(func: js.Function): js.Promise[SerializedFunction] = js.native
  @JSImport("@pulumi/pulumi/runtime/closure/serializeClosure", "serializeFunction")
  @js.native
  def serializeFunction(func: js.Function, args: SerializeFunctionArgs): js.Promise[SerializedFunction] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/closure/serializeClosure", "serializeFunctionAsync")
  @js.native
  def serializeFunctionAsync(func: js.Function): js.Promise[String] = js.native
  @JSImport("@pulumi/pulumi/runtime/closure/serializeClosure", "serializeFunctionAsync")
  @js.native
  def serializeFunctionAsync(func: js.Function, serialize: js.Function1[/* o */ js.Any, Boolean]): js.Promise[String] = js.native
  
  @js.native
  trait SerializeFunctionArgs extends StObject {
    
    /**
      * The name to export from the module defined by the generated module text.  Defaults to 'handler'.
      */
    var exportName: js.UndefOr[String] = js.native
    
    /**
      * If this is a function which, when invoked, will produce the actual entrypoint function.
      * Useful for when serializing a function that has high startup cost that only wants to be
      * run once. The signature of this function should be:  () => (provider_handler_args...) => provider_result
      *
      * This will then be emitted as: `exports.[exportName] = serialized_func_name();`
      *
      * In other words, the function will be invoked (once) and the resulting inner function will
      * be what is exported.
      */
    var isFactoryFunction: js.UndefOr[Boolean] = js.native
    
    /**
      * The resource to log any errors we encounter against.
      */
    var logResource: js.UndefOr[Resource] = js.native
    
    /**
      * A function to prevent serialization of certain objects captured during the serialization.  Primarily used to
      * prevent potential cycles.
      */
    var serialize: js.UndefOr[js.Function1[/* o */ js.Any, Boolean]] = js.native
  }
  object SerializeFunctionArgs {
    
    @scala.inline
    def apply(): SerializeFunctionArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeFunctionArgs]
    }
    
    @scala.inline
    implicit class SerializeFunctionArgsMutableBuilder[Self <: SerializeFunctionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportName(value: String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportNameUndefined: Self = StObject.set(x, "exportName", js.undefined)
      
      @scala.inline
      def setIsFactoryFunction(value: Boolean): Self = StObject.set(x, "isFactoryFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFactoryFunctionUndefined: Self = StObject.set(x, "isFactoryFunction", js.undefined)
      
      @scala.inline
      def setLogResource(value: Resource): Self = StObject.set(x, "logResource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogResourceUndefined: Self = StObject.set(x, "logResource", js.undefined)
      
      @scala.inline
      def setSerialize(value: /* o */ js.Any => Boolean): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    }
  }
  
  @js.native
  trait SerializedFunction extends StObject {
    
    /**
      * The name of the exported module member.
      */
    var exportName: String = js.native
    
    /**
      * The text of a JavaScript module which exports a single name bound to an appropriate value.
      * In the case of a normal function, this value will just be serialized function.  In the case
      * of a factory function this value will be the result of invoking the factory function.
      */
    var text: String = js.native
  }
  object SerializedFunction {
    
    @scala.inline
    def apply(exportName: String, text: String): SerializedFunction = {
      val __obj = js.Dynamic.literal(exportName = exportName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedFunction]
    }
    
    @scala.inline
    implicit class SerializedFunctionMutableBuilder[Self <: SerializedFunction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportName(value: String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
