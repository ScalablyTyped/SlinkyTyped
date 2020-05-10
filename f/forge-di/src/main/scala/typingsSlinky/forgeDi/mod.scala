package typingsSlinky.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.forgeDi.configMod.Config
import typingsSlinky.forgeDi.constructorMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Binding protected ()
    extends typingsSlinky.forgeDi.bindingMod.default {
    def this(forge: typingsSlinky.forgeDi.forgeMod.default, name: String) = this()
  }
  
  @js.native
  class ConfigurationError protected ()
    extends typingsSlinky.forgeDi.configurationErrorMod.default {
    def this(name: String, message: String) = this()
  }
  
  @js.native
  class Context ()
    extends typingsSlinky.forgeDi.contextMod.default
  
  @js.native
  class Forge ()
    extends typingsSlinky.forgeDi.forgeMod.default {
    def this(config: Config) = this()
  }
  
  @js.native
  class FunctionResolver protected ()
    extends typingsSlinky.forgeDi.functionResolverMod.default {
    def this(
      forge: typingsSlinky.forgeDi.forgeMod.default,
      binding: typingsSlinky.forgeDi.bindingMod.default,
      func: js.Function
    ) = this()
  }
  
  @js.native
  class InstanceResolver protected ()
    extends typingsSlinky.forgeDi.instanceResolverMod.default {
    def this(
      forge: typingsSlinky.forgeDi.forgeMod.default,
      binding: typingsSlinky.forgeDi.bindingMod.default,
      instance: js.Any
    ) = this()
  }
  
  @js.native
  class RegexInspector ()
    extends typingsSlinky.forgeDi.regexInspectorMod.RegexInspector
  
  @js.native
  class ResolutionError protected ()
    extends typingsSlinky.forgeDi.resolutionErrorMod.default {
    def this(name: String, hint: js.Any, context: typingsSlinky.forgeDi.contextMod.default, message: String) = this()
  }
  
  @js.native
  abstract class Resolver protected ()
    extends typingsSlinky.forgeDi.resolverMod.default {
    def this(forge: typingsSlinky.forgeDi.forgeMod.default, binding: typingsSlinky.forgeDi.bindingMod.default) = this()
  }
  
  @js.native
  class SingletonLifecycle ()
    extends typingsSlinky.forgeDi.singletonLifecycleMod.default
  
  @js.native
  class TransientLifecycle ()
    extends typingsSlinky.forgeDi.transientLifecycleMod.TransientLifecycle
  
  @js.native
  class TypeResolver protected ()
    extends typingsSlinky.forgeDi.typeResolverMod.default {
    def this(
      forge: typingsSlinky.forgeDi.forgeMod.default,
      binding: typingsSlinky.forgeDi.bindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
  @js.native
  class default ()
    extends typingsSlinky.forgeDi.forgeMod.default {
    def this(config: Config) = this()
  }
  
  def inject[T](hints: StringDictionary[String | Partialdefault]): js.Function1[/* target */ T, T] = js.native
  @js.native
  object Mode extends js.Object {
    /* "All" */ val All: typingsSlinky.forgeDi.modeMod.Mode.All with String = js.native
    /* "AtLeastOne" */ val AtLeastOne: typingsSlinky.forgeDi.modeMod.Mode.AtLeastOne with String = js.native
    /* "AtMostOne" */ val AtMostOne: typingsSlinky.forgeDi.modeMod.Mode.AtMostOne with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.forgeDi.modeMod.Mode with String] = js.native
  }
  
}

