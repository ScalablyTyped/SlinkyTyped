package typingsSlinky.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.forgeDi.anon.Partialdefault
import typingsSlinky.forgeDi.configMod.Config
import typingsSlinky.forgeDi.constructorMod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("forge-di", JSImport.Default)
  @js.native
  class default ()
    extends typingsSlinky.forgeDi.forgeMod.default {
    def this(config: Config) = this()
  }
  
  @JSImport("forge-di", "Binding")
  @js.native
  class Binding protected ()
    extends typingsSlinky.forgeDi.bindingMod.default {
    def this(forge: typingsSlinky.forgeDi.forgeMod.default, name: String) = this()
  }
  
  @JSImport("forge-di", "ConfigurationError")
  @js.native
  class ConfigurationError protected ()
    extends typingsSlinky.forgeDi.configurationErrorMod.default {
    def this(name: String, message: String) = this()
  }
  
  @JSImport("forge-di", "Context")
  @js.native
  class Context ()
    extends typingsSlinky.forgeDi.contextMod.default
  
  @JSImport("forge-di", "Forge")
  @js.native
  class Forge ()
    extends typingsSlinky.forgeDi.forgeMod.default {
    def this(config: Config) = this()
  }
  
  @JSImport("forge-di", "FunctionResolver")
  @js.native
  class FunctionResolver protected ()
    extends typingsSlinky.forgeDi.functionResolverMod.default {
    def this(
      forge: typingsSlinky.forgeDi.forgeMod.default,
      binding: typingsSlinky.forgeDi.bindingMod.default,
      func: js.Function
    ) = this()
  }
  
  @JSImport("forge-di", "InstanceResolver")
  @js.native
  class InstanceResolver protected ()
    extends typingsSlinky.forgeDi.instanceResolverMod.default {
    def this(
      forge: typingsSlinky.forgeDi.forgeMod.default,
      binding: typingsSlinky.forgeDi.bindingMod.default,
      instance: js.Any
    ) = this()
  }
  
  @JSImport("forge-di", "Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.forgeDi.modeMod.Mode with String] = js.native
    
    /* "All" */ val All: typingsSlinky.forgeDi.modeMod.Mode.All with String = js.native
    
    /* "AtLeastOne" */ val AtLeastOne: typingsSlinky.forgeDi.modeMod.Mode.AtLeastOne with String = js.native
    
    /* "AtMostOne" */ val AtMostOne: typingsSlinky.forgeDi.modeMod.Mode.AtMostOne with String = js.native
  }
  
  @JSImport("forge-di", "RegexInspector")
  @js.native
  class RegexInspector ()
    extends typingsSlinky.forgeDi.regexInspectorMod.default
  
  @JSImport("forge-di", "ResolutionError")
  @js.native
  class ResolutionError protected ()
    extends typingsSlinky.forgeDi.resolutionErrorMod.default {
    def this(name: String, hint: js.Any, context: typingsSlinky.forgeDi.contextMod.default, message: String) = this()
  }
  
  @JSImport("forge-di", "Resolver")
  @js.native
  abstract class Resolver protected ()
    extends typingsSlinky.forgeDi.resolverMod.default {
    def this(forge: typingsSlinky.forgeDi.forgeMod.default, binding: typingsSlinky.forgeDi.bindingMod.default) = this()
  }
  
  @JSImport("forge-di", "SingletonLifecycle")
  @js.native
  class SingletonLifecycle ()
    extends typingsSlinky.forgeDi.singletonLifecycleMod.default
  
  @JSImport("forge-di", "TransientLifecycle")
  @js.native
  class TransientLifecycle ()
    extends typingsSlinky.forgeDi.transientLifecycleMod.default
  
  @JSImport("forge-di", "TypeResolver")
  @js.native
  class TypeResolver protected ()
    extends typingsSlinky.forgeDi.typeResolverMod.default {
    def this(
      forge: typingsSlinky.forgeDi.forgeMod.default,
      binding: typingsSlinky.forgeDi.bindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
  @JSImport("forge-di", "inject")
  @js.native
  def inject[T](hints: StringDictionary[String | Partialdefault]): js.Function1[/* target */ T, T] = js.native
}
