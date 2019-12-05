package typingsSlinky.forgeDashDi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.forgeDashDi.distFrameworkArgumentsMod.Arguments
import typingsSlinky.forgeDashDi.distFrameworkConfigMod.Config
import typingsSlinky.forgeDashDi.distFrameworkConstructorMod.Constructor
import typingsSlinky.forgeDashDi.distFrameworkDependencyMod.Dependency
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di", JSImport.Namespace)
@js.native
object forgeDashDiMod extends js.Object {
  @js.native
  class Binding protected ()
    extends typingsSlinky.forgeDashDi.distFrameworkBindingMod.default {
    def this(forge: typingsSlinky.forgeDashDi.distForgeMod.default, name: String) = this()
  }
  
  @js.native
  class ConfigurationError protected ()
    extends typingsSlinky.forgeDashDi.distErrorsConfigurationErrorMod.default {
    def this(name: String, message: String) = this()
  }
  
  @js.native
  class Context ()
    extends typingsSlinky.forgeDashDi.distFrameworkContextMod.default
  
  @js.native
  class Forge ()
    extends typingsSlinky.forgeDashDi.distForgeMod.default {
    def this(config: Config) = this()
  }
  
  @js.native
  class FunctionResolver protected ()
    extends typingsSlinky.forgeDashDi.distResolversFunctionResolverMod.default {
    def this(
      forge: typingsSlinky.forgeDashDi.distForgeMod.default,
      binding: typingsSlinky.forgeDashDi.distFrameworkBindingMod.default,
      func: js.Function
    ) = this()
  }
  
  @js.native
  class InstanceResolver protected ()
    extends typingsSlinky.forgeDashDi.distResolversInstanceResolverMod.default {
    def this(
      forge: typingsSlinky.forgeDashDi.distForgeMod.default,
      binding: typingsSlinky.forgeDashDi.distFrameworkBindingMod.default,
      instance: js.Any
    ) = this()
  }
  
  @js.native
  class RegexInspector ()
    extends typingsSlinky.forgeDashDi.distInspectorsRegexInspectorMod.RegexInspector {
    /* CompleteClass */
    override var getParameterNames: js.Any = js.native
    /* CompleteClass */
    override def findConstructor(func: Constructor): Constructor = js.native
    /* CompleteClass */
    override def getDependencies(func: js.Function): js.Array[Dependency] = js.native
  }
  
  @js.native
  class ResolutionError protected ()
    extends typingsSlinky.forgeDashDi.distErrorsResolutionErrorMod.default {
    def this(
      name: String,
      hint: js.Any,
      context: typingsSlinky.forgeDashDi.distFrameworkContextMod.default,
      message: String
    ) = this()
  }
  
  @js.native
  abstract class Resolver protected ()
    extends typingsSlinky.forgeDashDi.distResolversResolverMod.default {
    def this(
      forge: typingsSlinky.forgeDashDi.distForgeMod.default,
      binding: typingsSlinky.forgeDashDi.distFrameworkBindingMod.default
    ) = this()
  }
  
  @js.native
  class SingletonLifecycle ()
    extends typingsSlinky.forgeDashDi.distLifecyclesSingletonLifecycleMod.default
  
  @js.native
  class TransientLifecycle ()
    extends typingsSlinky.forgeDashDi.distLifecyclesTransientLifecycleMod.TransientLifecycle {
    /* CompleteClass */
    override def resolve(
      resolver: typingsSlinky.forgeDashDi.distResolversResolverMod.default,
      context: typingsSlinky.forgeDashDi.distFrameworkContextMod.default,
      args: Arguments
    ): js.Any = js.native
  }
  
  @js.native
  class TypeResolver protected ()
    extends typingsSlinky.forgeDashDi.distResolversTypeResolverMod.default {
    def this(
      forge: typingsSlinky.forgeDashDi.distForgeMod.default,
      binding: typingsSlinky.forgeDashDi.distFrameworkBindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
  @js.native
  class default ()
    extends typingsSlinky.forgeDashDi.distForgeMod.default {
    def this(config: Config) = this()
  }
  
  def inject[T](hints: StringDictionary[String | Partial[Dependency]]): js.Function1[/* target */ T, T] = js.native
  @js.native
  object Mode extends js.Object {
    /* "All" */ val All: typingsSlinky.forgeDashDi.distFrameworkModeMod.Mode.All with String = js.native
    /* "AtLeastOne" */ val AtLeastOne: typingsSlinky.forgeDashDi.distFrameworkModeMod.Mode.AtLeastOne with String = js.native
    /* "AtMostOne" */ val AtMostOne: typingsSlinky.forgeDashDi.distFrameworkModeMod.Mode.AtMostOne with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.forgeDashDi.distFrameworkModeMod.Mode with String] = js.native
  }
  
}

