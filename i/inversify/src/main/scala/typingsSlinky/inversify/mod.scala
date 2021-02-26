package typingsSlinky.inversify

import typingsSlinky.inversify.injectMod.ServiceIdentifierOrFunc
import typingsSlinky.inversify.interfacesMod.interfaces.Abstract
import typingsSlinky.inversify.interfacesMod.interfaces.AsyncContainerModuleCallBack
import typingsSlinky.inversify.interfacesMod.interfaces.ConstraintFunction
import typingsSlinky.inversify.interfacesMod.interfaces.ContainerModuleCallBack
import typingsSlinky.inversify.interfacesMod.interfaces.ContainerOptions
import typingsSlinky.inversify.interfacesMod.interfaces.Newable
import typingsSlinky.inversify.interfacesMod.interfaces.Request
import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.std.ClassDecorator
import typingsSlinky.std.MethodDecorator
import typingsSlinky.std.ParameterDecorator
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify", "AsyncContainerModule")
  @js.native
  class AsyncContainerModule protected ()
    extends typingsSlinky.inversify.containerModuleMod.AsyncContainerModule {
    def this(registry: AsyncContainerModuleCallBack) = this()
  }
  
  @JSImport("inversify", "BindingScopeEnum")
  @js.native
  val BindingScopeEnum: typingsSlinky.inversify.interfacesMod.interfaces.BindingScopeEnum = js.native
  
  @JSImport("inversify", "BindingTypeEnum")
  @js.native
  val BindingTypeEnum: typingsSlinky.inversify.interfacesMod.interfaces.BindingTypeEnum = js.native
  
  @JSImport("inversify", "Container")
  @js.native
  class Container ()
    extends typingsSlinky.inversify.containerMod.Container {
    def this(containerOptions: ContainerOptions) = this()
  }
  object Container {
    
    /* static member */
    @JSImport("inversify", "Container.merge")
    @js.native
    def merge(
      container1: typingsSlinky.inversify.interfacesMod.interfaces.Container,
      container2: typingsSlinky.inversify.interfacesMod.interfaces.Container
    ): typingsSlinky.inversify.interfacesMod.interfaces.Container = js.native
  }
  
  @JSImport("inversify", "ContainerModule")
  @js.native
  class ContainerModule protected ()
    extends typingsSlinky.inversify.containerModuleMod.ContainerModule {
    def this(registry: ContainerModuleCallBack) = this()
  }
  
  @JSImport("inversify", "LazyServiceIdentifer")
  @js.native
  class LazyServiceIdentifer[T] protected ()
    extends typingsSlinky.inversify.injectMod.LazyServiceIdentifer[T] {
    def this(cb: js.Function0[ServiceIdentifier[T]]) = this()
  }
  
  object METADATA_KEY {
    
    @JSImport("inversify", "METADATA_KEY.DESIGN_PARAM_TYPES")
    @js.native
    val DESIGN_PARAM_TYPES: /* "design:paramtypes" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.INJECT_TAG")
    @js.native
    val INJECT_TAG: /* "inject" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.MULTI_INJECT_TAG")
    @js.native
    val MULTI_INJECT_TAG: /* "multi_inject" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.NAMED_TAG")
    @js.native
    val NAMED_TAG: /* "named" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.NAME_TAG")
    @js.native
    val NAME_TAG: /* "name" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.OPTIONAL_TAG")
    @js.native
    val OPTIONAL_TAG: /* "optional" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.PARAM_TYPES")
    @js.native
    val PARAM_TYPES: /* "inversify:paramtypes" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.POST_CONSTRUCT")
    @js.native
    val POST_CONSTRUCT: /* "post_construct" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.TAGGED")
    @js.native
    val TAGGED: /* "inversify:tagged" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.TAGGED_PROP")
    @js.native
    val TAGGED_PROP: /* "inversify:tagged_props" */ String = js.native
    
    @JSImport("inversify", "METADATA_KEY.UNMANAGED_TAG")
    @js.native
    val UNMANAGED_TAG: /* "unmanaged" */ String = js.native
  }
  
  @JSImport("inversify", "MetadataReader")
  @js.native
  class MetadataReader ()
    extends typingsSlinky.inversify.metadataReaderMod.MetadataReader
  
  @JSImport("inversify", "TargetTypeEnum")
  @js.native
  val TargetTypeEnum: typingsSlinky.inversify.interfacesMod.interfaces.TargetTypeEnum = js.native
  
  @JSImport("inversify", "decorate")
  @js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any): Unit = js.native
  @JSImport("inversify", "decorate")
  @js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: String): Unit = js.native
  @JSImport("inversify", "decorate")
  @js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: Double): Unit = js.native
  @JSImport("inversify", "decorate")
  @js.native
  def decorate(decorator: ClassDecorator, target: js.Any): Unit = js.native
  @JSImport("inversify", "decorate")
  @js.native
  def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: String): Unit = js.native
  @JSImport("inversify", "decorate")
  @js.native
  def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: Double): Unit = js.native
  
  @JSImport("inversify", "getServiceIdentifierAsString")
  @js.native
  def getServiceIdentifierAsString(serviceIdentifier: ServiceIdentifier[_]): String = js.native
  
  @JSImport("inversify", "id")
  @js.native
  def id(): Double = js.native
  
  @JSImport("inversify", "inject")
  @js.native
  def inject(serviceIdentifier: ServiceIdentifierOrFunc): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  
  @JSImport("inversify", "injectable")
  @js.native
  def injectable(): js.Function1[/* target */ js.Any, _] = js.native
  
  @JSImport("inversify", "multiBindToService")
  @js.native
  def multiBindToService(container: typingsSlinky.inversify.interfacesMod.interfaces.Container): js.Function1[
    /* service */ String | js.Symbol | Newable[_] | Abstract[_], 
    js.Function1[/* repeated */ String | js.Symbol | Newable[_] | Abstract[_], Unit]
  ] = js.native
  
  @JSImport("inversify", "multiInject")
  @js.native
  def multiInject(serviceIdentifier: ServiceIdentifier[_]): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  
  @JSImport("inversify", "named")
  @js.native
  def named(name: String): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  @JSImport("inversify", "named")
  @js.native
  def named(name: js.Symbol): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  @JSImport("inversify", "named")
  @js.native
  def named(name: Double): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  
  @JSImport("inversify", "namedConstraint")
  @js.native
  def namedConstraint(value: js.Any): ConstraintFunction = js.native
  
  @JSImport("inversify", "optional")
  @js.native
  def optional(): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  
  @JSImport("inversify", "postConstruct")
  @js.native
  def postConstruct(): js.Function3[
    /* target */ js.Any, 
    /* propertyKey */ String, 
    /* descriptor */ js.PropertyDescriptor, 
    Unit
  ] = js.native
  
  @JSImport("inversify", "tagged")
  @js.native
  def tagged(metadataKey: String, metadataValue: js.Any): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  @JSImport("inversify", "tagged")
  @js.native
  def tagged(metadataKey: js.Symbol, metadataValue: js.Any): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  @JSImport("inversify", "tagged")
  @js.native
  def tagged(metadataKey: Double, metadataValue: js.Any): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = js.native
  
  @JSImport("inversify", "taggedConstraint")
  @js.native
  def taggedConstraint(key: PropertyKey): js.Function1[/* value */ js.Any, ConstraintFunction] = js.native
  
  @JSImport("inversify", "targetName")
  @js.native
  def targetName(name: String): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ Double, Unit] = js.native
  
  @JSImport("inversify", "traverseAncerstors")
  @js.native
  def traverseAncerstors(request: Request, constraint: ConstraintFunction): Boolean = js.native
  
  @JSImport("inversify", "typeConstraint")
  @js.native
  def typeConstraint(`type`: String): js.Function1[/* request */ Request | Null, Boolean] = js.native
  @JSImport("inversify", "typeConstraint")
  @js.native
  def typeConstraint(`type`: js.Function): js.Function1[/* request */ Request | Null, Boolean] = js.native
  
  @JSImport("inversify", "unmanaged")
  @js.native
  def unmanaged(): js.Function3[/* target */ js.Any, /* targetKey */ String, /* index */ Double, Unit] = js.native
}
