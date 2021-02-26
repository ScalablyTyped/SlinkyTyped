package typingsSlinky.aureliaKnockout

import org.scalajs.dom.raw.Element
import typingsSlinky.aureliaBinding.mod.ObserverLocator
import typingsSlinky.aureliaDependencyInjection.mod.Container
import typingsSlinky.aureliaLoader.mod.Loader
import typingsSlinky.aureliaTemplating.mod.CompositionEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aurelia-knockout", "KnockoutBindable")
  @js.native
  class KnockoutBindable protected ()
    extends typingsSlinky.aureliaKnockout.knockoutBindableMod.KnockoutBindable {
    def this(observerLocator: ObserverLocator) = this()
  }
  
  @JSImport("aurelia-knockout", "KnockoutComposition")
  @js.native
  class KnockoutComposition protected ()
    extends typingsSlinky.aureliaKnockout.knockoutCompositionMod.KnockoutComposition {
    def this(compositionEngine: CompositionEngine, container: Container, loader: Loader) = this()
  }
  
  @JSImport("aurelia-knockout", "KnockoutCustomAttribute")
  @js.native
  class KnockoutCustomAttribute protected ()
    extends typingsSlinky.aureliaKnockout.knockoutCustomAttributeMod.KnockoutCustomAttribute {
    def this(element: Element) = this()
  }
  /* static members */
  object KnockoutCustomAttribute {
    
    @JSImport("aurelia-knockout", "KnockoutCustomAttribute.register")
    @js.native
    def register(): Unit = js.native
  }
  
  @JSImport("aurelia-knockout", "RequirePolyfill")
  @js.native
  class RequirePolyfill protected ()
    extends typingsSlinky.aureliaKnockout.requirePolyfillMod.RequirePolyfill {
    def this(loader: Loader) = this()
  }
  
  @JSImport("aurelia-knockout", "configure")
  @js.native
  def configure(frameworkConfig: typingsSlinky.aureliaKnockout.anon.Container): Unit = js.native
}
