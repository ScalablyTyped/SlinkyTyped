package typingsSlinky.atAngularPlatformDashBrowser

import typingsSlinky.atAngularAnimations.browserMod.AnimationDriver
import typingsSlinky.atAngularAnimations.browserMod.ɵAnimationEngine
import typingsSlinky.atAngularAnimations.browserMod.ɵAnimationStyleNormalizer
import typingsSlinky.atAngularAnimations.browserMod.ɵCssKeyframesDriver
import typingsSlinky.atAngularAnimations.browserMod.ɵWebAnimationsDriver
import typingsSlinky.atAngularAnimations.browserMod.ɵWebAnimationsStyleNormalizer
import typingsSlinky.atAngularCore.atAngularCoreMod.InjectionToken
import typingsSlinky.atAngularCore.atAngularCoreMod.NgZone
import typingsSlinky.atAngularCore.atAngularCoreMod.Provider
import typingsSlinky.atAngularCore.atAngularCoreMod.Renderer2
import typingsSlinky.atAngularCore.atAngularCoreMod.RendererFactory2
import typingsSlinky.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserMod.ɵDomRendererFactory2
import typingsSlinky.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserStrings.BrowserAnimations
import typingsSlinky.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserStrings.NoopAnimations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/animations", JSImport.Namespace)
@js.native
object animationsMod extends js.Object {
  @js.native
  class BrowserAnimationsModule ()
    extends typingsSlinky.atAngularPlatformDashBrowser.animationsAnimationsMod.BrowserAnimationsModule
  
  @js.native
  class NoopAnimationsModule ()
    extends typingsSlinky.atAngularPlatformDashBrowser.animationsAnimationsMod.NoopAnimationsModule
  
  @js.native
  class ɵAnimationRenderer protected ()
    extends typingsSlinky.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRenderer {
    def this(
      factory: typingsSlinky.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRendererFactory,
      namespaceId: String,
      delegate: Renderer2,
      engine: ɵAnimationEngine
    ) = this()
  }
  
  @js.native
  class ɵAnimationRendererFactory protected ()
    extends typingsSlinky.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRendererFactory {
    def this(delegate: RendererFactory2, engine: ɵAnimationEngine, _zone: NgZone) = this()
  }
  
  @js.native
  class ɵBrowserAnimationBuilder protected ()
    extends typingsSlinky.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵBrowserAnimationBuilder {
    def this(rootRenderer: RendererFactory2, doc: js.Any) = this()
  }
  
  @js.native
  class ɵBrowserAnimationFactory protected ()
    extends typingsSlinky.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵBrowserAnimationFactory {
    def this(
      _id: String,
      _renderer: typingsSlinky.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRenderer
    ) = this()
  }
  
  @js.native
  class ɵInjectableAnimationEngine protected ()
    extends typingsSlinky.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵInjectableAnimationEngine {
    def this(doc: js.Any, driver: AnimationDriver, normalizer: ɵAnimationStyleNormalizer) = this()
  }
  
  @js.native
  class ɵangular_packages_platform_browser_animations_animations_f protected ()
    extends typingsSlinky.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵangular_packages_platform_browser_animations_animations_f {
    def this(namespaceId: String, delegate: Renderer2, engine: ɵAnimationEngine) = this()
  }
  
  val ANIMATION_MODULE_TYPE: InjectionToken[NoopAnimations | BrowserAnimations] = js.native
  val ɵangular_packages_platform_browser_animations_animations_d: js.Array[Provider] = js.native
  val ɵangular_packages_platform_browser_animations_animations_e: js.Array[Provider] = js.native
  def ɵangular_packages_platform_browser_animations_animations_a(): ɵWebAnimationsDriver | ɵCssKeyframesDriver = js.native
  def ɵangular_packages_platform_browser_animations_animations_b(): ɵWebAnimationsStyleNormalizer = js.native
  def ɵangular_packages_platform_browser_animations_animations_c(renderer: ɵDomRendererFactory2, engine: ɵAnimationEngine, zone: NgZone): typingsSlinky.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRendererFactory = js.native
}

