package typingsSlinky.angularAnimations

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularAnimations.mod.AnimationMetadata
import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@angular/animations/browser", "AnimationDriver")
  @js.native
  abstract class AnimationDriver ()
    extends typingsSlinky.angularAnimations.browserBrowserMod.AnimationDriver
  /* static members */
  object AnimationDriver {
    
    @JSImport("@angular/animations/browser", "AnimationDriver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/animations/browser", "AnimationDriver.NOOP")
    @js.native
    def NOOP: typingsSlinky.angularAnimations.browserBrowserMod.AnimationDriver = js.native
    @scala.inline
    def NOOP_=(x: typingsSlinky.angularAnimations.browserBrowserMod.AnimationDriver): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOOP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/animations/browser", "\u0275Animation")
  @js.native
  class ɵAnimation protected ()
    extends typingsSlinky.angularAnimations.browserBrowserMod.ɵAnimation {
    def this(
      _driver: typingsSlinky.angularAnimations.browserBrowserMod.AnimationDriver,
      input: js.Array[AnimationMetadata]
    ) = this()
    def this(
      _driver: typingsSlinky.angularAnimations.browserBrowserMod.AnimationDriver,
      input: AnimationMetadata
    ) = this()
  }
  
  @JSImport("@angular/animations/browser", "\u0275AnimationEngine")
  @js.native
  class ɵAnimationEngine protected ()
    extends typingsSlinky.angularAnimations.browserBrowserMod.ɵAnimationEngine {
    def this(
      bodyNode: js.Any,
      _driver: typingsSlinky.angularAnimations.browserBrowserMod.AnimationDriver,
      normalizer: typingsSlinky.angularAnimations.browserBrowserMod.ɵAnimationStyleNormalizer
    ) = this()
  }
  
  @JSImport("@angular/animations/browser", "\u0275AnimationStyleNormalizer")
  @js.native
  abstract class ɵAnimationStyleNormalizer ()
    extends typingsSlinky.angularAnimations.browserBrowserMod.ɵAnimationStyleNormalizer
  
  @JSImport("@angular/animations/browser", "\u0275CssKeyframesDriver")
  @js.native
  class ɵCssKeyframesDriver ()
    extends typingsSlinky.angularAnimations.browserBrowserMod.ɵCssKeyframesDriver
  
  @JSImport("@angular/animations/browser", "\u0275CssKeyframesPlayer")
  @js.native
  class ɵCssKeyframesPlayer protected ()
    extends typingsSlinky.angularAnimations.browserBrowserMod.ɵCssKeyframesPlayer {
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      animationName: String,
      _duration: Double,
      _delay: Double,
      easing: String,
      _finalStyles: StringDictionary[js.Any]
    ) = this()
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      animationName: String,
      _duration: Double,
      _delay: Double,
      easing: String,
      _finalStyles: StringDictionary[js.Any],
      _specialStyles: typingsSlinky.angularAnimations.browserBrowserMod.ɵangularPackagesAnimationsBrowserBrowserA
    ) = this()
  }
  
  @JSImport("@angular/animations/browser", "\u0275NoopAnimationDriver")
  @js.native
  class ɵNoopAnimationDriver ()
    extends typingsSlinky.angularAnimations.browserBrowserMod.ɵNoopAnimationDriver
  
  @JSImport("@angular/animations/browser", "\u0275NoopAnimationStyleNormalizer")
  @js.native
  class ɵNoopAnimationStyleNormalizer ()
    extends typingsSlinky.angularAnimations.browserBrowserMod.ɵNoopAnimationStyleNormalizer
  
  @JSImport("@angular/animations/browser", "\u0275WebAnimationsDriver")
  @js.native
  class ɵWebAnimationsDriver ()
    extends typingsSlinky.angularAnimations.browserBrowserMod.ɵWebAnimationsDriver
  
  @JSImport("@angular/animations/browser", "\u0275WebAnimationsPlayer")
  @js.native
  class ɵWebAnimationsPlayer protected ()
    extends typingsSlinky.angularAnimations.browserBrowserMod.ɵWebAnimationsPlayer {
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      options: StringDictionary[String | Double]
    ) = this()
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      options: StringDictionary[String | Double],
      _specialStyles: typingsSlinky.angularAnimations.browserBrowserMod.ɵangularPackagesAnimationsBrowserBrowserA
    ) = this()
  }
  
  @JSImport("@angular/animations/browser", "\u0275WebAnimationsStyleNormalizer")
  @js.native
  class ɵWebAnimationsStyleNormalizer ()
    extends typingsSlinky.angularAnimations.browserBrowserMod.ɵWebAnimationsStyleNormalizer
  
  @JSImport("@angular/animations/browser", "\u0275allowPreviousPlayerStylesMerge")
  @js.native
  def ɵallowPreviousPlayerStylesMerge(duration: Double, delay: Double): Boolean = js.native
  
  @JSImport("@angular/animations/browser", "\u0275angular_packages_animations_browser_browser_a")
  @js.native
  class ɵangularPackagesAnimationsBrowserBrowserA protected ()
    extends typingsSlinky.angularAnimations.browserBrowserMod.ɵangularPackagesAnimationsBrowserBrowserA {
    def this(_element: js.Any) = this()
    def this(_element: js.Any, _startStyles: StringDictionary[js.Any]) = this()
    def this(_element: js.Any, _startStyles: StringDictionary[js.Any], _endStyles: StringDictionary[js.Any]) = this()
    def this(_element: js.Any, _startStyles: Null, _endStyles: StringDictionary[js.Any]) = this()
  }
  /* static members */
  object ɵangularPackagesAnimationsBrowserBrowserA {
    
    @JSImport("@angular/animations/browser", "\u0275angular_packages_animations_browser_browser_a")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/animations/browser", "\u0275angular_packages_animations_browser_browser_a.initialStylesByElement")
    @js.native
    def initialStylesByElement: WeakMap[js.Any, StringDictionary[js.Any]] = js.native
    @scala.inline
    def initialStylesByElement_=(x: WeakMap[js.Any, StringDictionary[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialStylesByElement")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/animations/browser", "\u0275containsElement")
  @js.native
  def ɵcontainsElement(elm1: js.Any, elm2: js.Any): Boolean = js.native
  
  @JSImport("@angular/animations/browser", "\u0275invokeQuery")
  @js.native
  def ɵinvokeQuery(element: js.Any, selector: String, multi: Boolean): js.Array[_] = js.native
  
  @JSImport("@angular/animations/browser", "\u0275matchesElement")
  @js.native
  def ɵmatchesElement(element: js.Any, selector: String): Boolean = js.native
  
  @JSImport("@angular/animations/browser", "\u0275supportsWebAnimations")
  @js.native
  def ɵsupportsWebAnimations(): Boolean = js.native
  
  @JSImport("@angular/animations/browser", "\u0275validateStyleProperty")
  @js.native
  def ɵvalidateStyleProperty(prop: String): Boolean = js.native
}
