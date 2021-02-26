package typingsSlinky.aureliaMetadata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aurelia-metadata", "Origin")
  @js.native
  class Origin protected () extends StObject {
    /**
      * Creates an instance of Origin metadata.
      * @param moduleId The id of the module from which the item originated.
      * @param moduleMember The member name of the export on the module object from which the item originated.
      */
    def this(moduleId: String, moduleMember: String) = this()
    
    /**
      * The id of the module from which the item originated.
      */
    var moduleId: String = js.native
    
    /**
      * The member name of the export on the module object from which the item originated.
      */
    var moduleMember: String = js.native
  }
  /* static members */
  object Origin {
    
    /**
      * Get the Origin metadata for the specified function.
      * @param fn The function to inspect for Origin metadata.
      * @return Returns the Origin metadata.
      */
    @JSImport("aurelia-metadata", "Origin.get")
    @js.native
    def get(fn: js.Function): Origin = js.native
    
    /**
      * Set the Origin metadata for the specified function.
      * @param fn The function to set the Origin metadata on.
      * @param fn The Origin metadata to store on the function.
      * @return Returns the Origin metadata.
      */
    @JSImport("aurelia-metadata", "Origin.set")
    @js.native
    def set(fn: js.Function, origin: Origin): Unit = js.native
  }
  
  @JSImport("aurelia-metadata", "decorators")
  @js.native
  def decorators(rest: js.Function*): DecoratorApplicator = js.native
  
  @JSImport("aurelia-metadata", "deprecated")
  @js.native
  def deprecated(): js.Any = js.native
  @JSImport("aurelia-metadata", "deprecated")
  @js.native
  def deprecated(
    optionsOrTarget: js.UndefOr[scala.Nothing],
    maybeKey: js.UndefOr[scala.Nothing],
    maybeDescriptor: js.Object
  ): js.Any = js.native
  @JSImport("aurelia-metadata", "deprecated")
  @js.native
  def deprecated(optionsOrTarget: js.UndefOr[scala.Nothing], maybeKey: String): js.Any = js.native
  @JSImport("aurelia-metadata", "deprecated")
  @js.native
  def deprecated(optionsOrTarget: js.UndefOr[scala.Nothing], maybeKey: String, maybeDescriptor: js.Object): js.Any = js.native
  @JSImport("aurelia-metadata", "deprecated")
  @js.native
  def deprecated(optionsOrTarget: DeprecatedOptions): js.Any = js.native
  @JSImport("aurelia-metadata", "deprecated")
  @js.native
  def deprecated(
    optionsOrTarget: DeprecatedOptions,
    maybeKey: js.UndefOr[scala.Nothing],
    maybeDescriptor: js.Object
  ): js.Any = js.native
  @JSImport("aurelia-metadata", "deprecated")
  @js.native
  def deprecated(optionsOrTarget: DeprecatedOptions, maybeKey: String): js.Any = js.native
  @JSImport("aurelia-metadata", "deprecated")
  @js.native
  def deprecated(optionsOrTarget: DeprecatedOptions, maybeKey: String, maybeDescriptor: js.Object): js.Any = js.native
  
  @JSImport("aurelia-metadata", "metadata")
  @js.native
  val metadata: MetadataType = js.native
  
  @JSImport("aurelia-metadata", "mixin")
  @js.native
  def mixin(behavior: js.Object): js.Any = js.native
  
  @JSImport("aurelia-metadata", "protocol")
  @js.native
  def protocol(name: String): js.Any = js.native
  @JSImport("aurelia-metadata", "protocol")
  @js.native
  def protocol(name: String, options: js.Function1[/* target */ js.Any, String | Boolean]): js.Any = js.native
  @JSImport("aurelia-metadata", "protocol")
  @js.native
  def protocol(name: String, options: ProtocolOptions): js.Any = js.native
  
  @js.native
  trait DecoratorApplicator extends StObject {
    
    /**
      * Applies the decorators to the target.
      * @param target The target.
      * @param key If applying to a method, the member name.
      * @param descriptor If applying to a method, you may supply an initial descriptor to pass to the decorators.
      */
    def on(target: js.Any): js.Any = js.native
    def on(target: js.Any, key: js.UndefOr[scala.Nothing], descriptor: js.PropertyDescriptor): js.Any = js.native
    def on(target: js.Any, key: String): js.Any = js.native
    def on(target: js.Any, key: String, descriptor: js.PropertyDescriptor): js.Any = js.native
  }
  
  @js.native
  trait DeprecatedOptions extends StObject {
    
    /**
      * Specifies whether or not the deprecation should throw an error.
      */
    var error: Boolean = js.native
    
    /**
      * Specifies a custom deprecation message.
      */
    var message: String = js.native
  }
  object DeprecatedOptions {
    
    @scala.inline
    def apply(error: Boolean, message: String): DeprecatedOptions = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeprecatedOptions]
    }
    
    @scala.inline
    implicit class DeprecatedOptionsMutableBuilder[Self <: DeprecatedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MetadataType extends StObject {
    
    /**
      * Defines metadata specified by a key on a target.
      * @param metadataKey The key for the metadata to define.
      * @param target The target to set the metadata on.
      * @param targetKey The member on the target to set the metadata on.
      */
    def define(metadataKey: String, metadataValue: js.Object, target: js.Function): Unit = js.native
    def define(metadataKey: String, metadataValue: js.Object, target: js.Function, targetKey: String): Unit = js.native
    
    /**
      * Gets metadata specified by a key on a target, searching up the inheritance hierarchy.
      * @param metadataKey The key for the metadata to lookup.
      * @param target The target to lookup the metadata on.
      * @param targetKey The member on the target to lookup the metadata on.
      */
    def get(metadataKey: String, target: js.Function): js.Object = js.native
    def get(metadataKey: String, target: js.Function, targetKey: String): js.Object = js.native
    
    /**
      * Gets metadata specified by a key on a target, or creates an instance of the specified metadata if not found.
      * @param metadataKey The key for the metadata to lookup or create.
      * @param Type The type of metadata to create if existing metadata is not found.
      * @param target The target to lookup or create the metadata on.
      * @param targetKey The member on the target to lookup or create the metadata on.
      */
    def getOrCreateOwn(metadataKey: String, Type: js.Function, target: js.Function): js.Object = js.native
    def getOrCreateOwn(metadataKey: String, Type: js.Function, target: js.Function, targetKey: String): js.Object = js.native
    
    /**
      * Gets metadata specified by a key on a target, only searching the own instance.
      * @param metadataKey The key for the metadata to lookup.
      * @param target The target to lookup the metadata on.
      * @param targetKey The member on the target to lookup the metadata on.
      */
    def getOwn(metadataKey: String, target: js.Function): js.Object = js.native
    def getOwn(metadataKey: String, target: js.Function, targetKey: String): js.Object = js.native
    
    /**
      * The metadata key representing parameter type information.
      */
    var paramTypes: String = js.native
    
    /**
      * The metadata key representing property information.
      */
    var properties: String = js.native
    
    /**
      * The metadata key representing object property type information.
      */
    var propertyType: String = js.native
    
    /**
      * The metadata key representing pluggable resources.
      */
    var resource: String = js.native
  }
  
  @js.native
  trait ProtocolOptions extends StObject {
    
    /**
      * A function which has the opportunity to compose additional behavior into the decorated class when the protocol is applied.
      */
    var compose: js.UndefOr[js.Function1[/* target */ js.Any, Unit]] = js.native
    
    /**
      * A function that will be run to validate the decorated class when the protocol is applied. It is also used to validate adhoc instances.
      * If the validation fails, a message should be returned which directs the developer in how to address the issue.
      */
    var validate: js.UndefOr[js.Function1[/* target */ js.Any, String | Boolean]] = js.native
  }
  object ProtocolOptions {
    
    @scala.inline
    def apply(): ProtocolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProtocolOptions]
    }
    
    @scala.inline
    implicit class ProtocolOptionsMutableBuilder[Self <: ProtocolOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompose(value: /* target */ js.Any => Unit): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComposeUndefined: Self = StObject.set(x, "compose", js.undefined)
      
      @scala.inline
      def setValidate(value: /* target */ js.Any => String | Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
}
