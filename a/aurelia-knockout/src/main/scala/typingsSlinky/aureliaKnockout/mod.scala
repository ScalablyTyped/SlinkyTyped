package typingsSlinky.aureliaKnockout

import org.scalajs.dom.raw.Element
import typingsSlinky.aureliaBinding.mod.ObserverLocator
import typingsSlinky.aureliaDependencyInjection.mod.Container
import typingsSlinky.aureliaLoader.mod.Loader
import typingsSlinky.aureliaTemplating.mod.CompositionEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-knockout", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class KnockoutBindable protected ()
    extends typingsSlinky.aureliaKnockout.knockoutBindableMod.KnockoutBindable {
    def this(observerLocator: ObserverLocator) = this()
  }
  
  @js.native
  class KnockoutComposition protected ()
    extends typingsSlinky.aureliaKnockout.knockoutCompositionMod.KnockoutComposition {
    def this(compositionEngine: CompositionEngine, container: Container, loader: Loader) = this()
  }
  
  @js.native
  class KnockoutCustomAttribute protected ()
    extends typingsSlinky.aureliaKnockout.knockoutCustomAttributeMod.KnockoutCustomAttribute {
    def this(element: Element) = this()
  }
  
  @js.native
  class RequirePolyfill protected ()
    extends typingsSlinky.aureliaKnockout.requirePolyfillMod.RequirePolyfill {
    def this(loader: Loader) = this()
  }
  
  def configure(frameworkConfig: AnonContainer): Unit = js.native
  /* static members */
  @js.native
  object KnockoutCustomAttribute extends js.Object {
    def register(): Unit = js.native
  }
  
}

