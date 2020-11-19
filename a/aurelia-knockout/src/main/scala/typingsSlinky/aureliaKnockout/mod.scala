package typingsSlinky.aureliaKnockout

import org.scalajs.dom.raw.Element
import typingsSlinky.aureliaBinding.mod.ObserverLocator
import typingsSlinky.aureliaKnockout.anon.Container
import typingsSlinky.aureliaLoader.mod.Loader
import typingsSlinky.aureliaTemplating.mod.CompositionEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-knockout", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def configure(frameworkConfig: Container): Unit = js.native
  
  @js.native
  class KnockoutBindable protected ()
    extends typingsSlinky.aureliaKnockout.knockoutBindableMod.KnockoutBindable {
    def this(observerLocator: ObserverLocator) = this()
  }
  
  @js.native
  class KnockoutComposition protected ()
    extends typingsSlinky.aureliaKnockout.knockoutCompositionMod.KnockoutComposition {
    def this(
      compositionEngine: CompositionEngine,
      container: typingsSlinky.aureliaDependencyInjection.mod.Container,
      loader: Loader
    ) = this()
  }
  
  @js.native
  class KnockoutCustomAttribute protected ()
    extends typingsSlinky.aureliaKnockout.knockoutCustomAttributeMod.KnockoutCustomAttribute {
    def this(element: Element) = this()
  }
  /* static members */
  @js.native
  object KnockoutCustomAttribute extends js.Object {
    
    def register(): Unit = js.native
  }
  
  @js.native
  class RequirePolyfill protected ()
    extends typingsSlinky.aureliaKnockout.requirePolyfillMod.RequirePolyfill {
    def this(loader: Loader) = this()
  }
}
