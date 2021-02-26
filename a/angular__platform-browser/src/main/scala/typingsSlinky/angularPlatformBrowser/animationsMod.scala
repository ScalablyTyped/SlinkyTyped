package typingsSlinky.angularPlatformBrowser

import typingsSlinky.angularAnimations.browserMod.AnimationDriver
import typingsSlinky.angularAnimations.browserMod.ɵAnimationEngine
import typingsSlinky.angularAnimations.browserMod.ɵAnimationStyleNormalizer
import typingsSlinky.angularAnimations.browserMod.ɵCssKeyframesDriver
import typingsSlinky.angularAnimations.browserMod.ɵWebAnimationsDriver
import typingsSlinky.angularAnimations.browserMod.ɵWebAnimationsStyleNormalizer
import typingsSlinky.angularCore.mod.InjectionToken
import typingsSlinky.angularCore.mod.NgZone
import typingsSlinky.angularCore.mod.Provider
import typingsSlinky.angularCore.mod.Renderer2
import typingsSlinky.angularCore.mod.RendererFactory2
import typingsSlinky.angularPlatformBrowser.angularPlatformBrowserStrings.BrowserAnimations
import typingsSlinky.angularPlatformBrowser.angularPlatformBrowserStrings.NoopAnimations
import typingsSlinky.angularPlatformBrowser.mod.ɵDomRendererFactory2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationsMod {
  
  @JSImport("@angular/platform-browser/animations", "ANIMATION_MODULE_TYPE")
  @js.native
  val ANIMATION_MODULE_TYPE: InjectionToken[NoopAnimations | BrowserAnimations] = js.native
  
  @JSImport("@angular/platform-browser/animations", "BrowserAnimationsModule")
  @js.native
  class BrowserAnimationsModule ()
    extends typingsSlinky.angularPlatformBrowser.animationsAnimationsMod.BrowserAnimationsModule
  
  @JSImport("@angular/platform-browser/animations", "NoopAnimationsModule")
  @js.native
  class NoopAnimationsModule ()
    extends typingsSlinky.angularPlatformBrowser.animationsAnimationsMod.NoopAnimationsModule
  
  @JSImport("@angular/platform-browser/animations", "\u0275AnimationRenderer")
  @js.native
  class ɵAnimationRenderer protected ()
    extends typingsSlinky.angularPlatformBrowser.animationsAnimationsMod.ɵAnimationRenderer {
    def this(
      factory: typingsSlinky.angularPlatformBrowser.animationsAnimationsMod.ɵAnimationRendererFactory,
      namespaceId: String,
      delegate: Renderer2,
      engine: ɵAnimationEngine
    ) = this()
  }
  
  @JSImport("@angular/platform-browser/animations", "\u0275AnimationRendererFactory")
  @js.native
  class ɵAnimationRendererFactory protected ()
    extends typingsSlinky.angularPlatformBrowser.animationsAnimationsMod.ɵAnimationRendererFactory {
    def this(delegate: RendererFactory2, engine: ɵAnimationEngine, _zone: NgZone) = this()
  }
  
  @JSImport("@angular/platform-browser/animations", "\u0275BrowserAnimationBuilder")
  @js.native
  class ɵBrowserAnimationBuilder protected ()
    extends typingsSlinky.angularPlatformBrowser.animationsAnimationsMod.ɵBrowserAnimationBuilder {
    def this(rootRenderer: RendererFactory2, doc: js.Any) = this()
  }
  
  @JSImport("@angular/platform-browser/animations", "\u0275BrowserAnimationFactory")
  @js.native
  class ɵBrowserAnimationFactory protected ()
    extends typingsSlinky.angularPlatformBrowser.animationsAnimationsMod.ɵBrowserAnimationFactory {
    def this(
      _id: String,
      _renderer: typingsSlinky.angularPlatformBrowser.animationsAnimationsMod.ɵAnimationRenderer
    ) = this()
  }
  
  @JSImport("@angular/platform-browser/animations", "\u0275InjectableAnimationEngine")
  @js.native
  class ɵInjectableAnimationEngine protected ()
    extends typingsSlinky.angularPlatformBrowser.animationsAnimationsMod.ɵInjectableAnimationEngine {
    def this(doc: js.Any, driver: AnimationDriver, normalizer: ɵAnimationStyleNormalizer) = this()
  }
  
  @JSImport("@angular/platform-browser/animations", "\u0275angular_packages_platform_browser_animations_animations_a")
  @js.native
  def ɵangularPackagesPlatformBrowserAnimationsAnimationsA(): ɵWebAnimationsDriver | ɵCssKeyframesDriver = js.native
  
  @JSImport("@angular/platform-browser/animations", "\u0275angular_packages_platform_browser_animations_animations_b")
  @js.native
  def ɵangularPackagesPlatformBrowserAnimationsAnimationsB(): ɵWebAnimationsStyleNormalizer = js.native
  
  @JSImport("@angular/platform-browser/animations", "\u0275angular_packages_platform_browser_animations_animations_c")
  @js.native
  def ɵangularPackagesPlatformBrowserAnimationsAnimationsC(renderer: ɵDomRendererFactory2, engine: ɵAnimationEngine, zone: NgZone): typingsSlinky.angularPlatformBrowser.animationsAnimationsMod.ɵAnimationRendererFactory = js.native
  
  @JSImport("@angular/platform-browser/animations", "\u0275angular_packages_platform_browser_animations_animations_d")
  @js.native
  val ɵangularPackagesPlatformBrowserAnimationsAnimationsD: js.Array[Provider] = js.native
  
  @JSImport("@angular/platform-browser/animations", "\u0275angular_packages_platform_browser_animations_animations_e")
  @js.native
  val ɵangularPackagesPlatformBrowserAnimationsAnimationsE: js.Array[Provider] = js.native
  
  @JSImport("@angular/platform-browser/animations", "\u0275angular_packages_platform_browser_animations_animations_f")
  @js.native
  class ɵangularPackagesPlatformBrowserAnimationsAnimationsF protected ()
    extends typingsSlinky.angularPlatformBrowser.animationsAnimationsMod.ɵangularPackagesPlatformBrowserAnimationsAnimationsF {
    def this(namespaceId: String, delegate: Renderer2, engine: ɵAnimationEngine) = this()
  }
}
