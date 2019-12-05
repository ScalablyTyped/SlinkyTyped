package typingsSlinky.aureliaDashKnockout

import org.scalajs.dom.raw.Element
import typingsSlinky.aureliaDashBinding.aureliaDashBindingMod.ObserverLocator
import typingsSlinky.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod.Container
import typingsSlinky.aureliaDashLoader.aureliaDashLoaderMod.Loader
import typingsSlinky.aureliaDashTemplating.aureliaDashTemplatingMod.CompositionEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-knockout", JSImport.Namespace)
@js.native
object aureliaDashKnockoutMod extends js.Object {
  @js.native
  class KnockoutBindable protected ()
    extends typingsSlinky.aureliaDashKnockout.distCommonjsKnockoutDashBindableMod.KnockoutBindable {
    def this(observerLocator: ObserverLocator) = this()
  }
  
  @js.native
  class KnockoutComposition protected ()
    extends typingsSlinky.aureliaDashKnockout.distCommonjsKnockoutDashCompositionMod.KnockoutComposition {
    def this(compositionEngine: CompositionEngine, container: Container, loader: Loader) = this()
  }
  
  @js.native
  class KnockoutCustomAttribute protected ()
    extends typingsSlinky.aureliaDashKnockout.distCommonjsKnockoutDashCustomDashAttributeMod.KnockoutCustomAttribute {
    def this(element: Element) = this()
  }
  
  @js.native
  class RequirePolyfill protected ()
    extends typingsSlinky.aureliaDashKnockout.distCommonjsRequireDashPolyfillMod.RequirePolyfill {
    def this(loader: Loader) = this()
  }
  
  def configure(frameworkConfig: Anon_Container): Unit = js.native
  /* static members */
  @js.native
  object KnockoutCustomAttribute extends js.Object {
    def register(): Unit = js.native
  }
  
}

