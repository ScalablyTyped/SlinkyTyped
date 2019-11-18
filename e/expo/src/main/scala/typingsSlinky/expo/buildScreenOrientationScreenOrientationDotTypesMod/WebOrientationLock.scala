package typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebOrientationLock extends js.Object

@JSImport("expo/build/ScreenOrientation/ScreenOrientation.types", "WebOrientationLock")
@js.native
object WebOrientationLock extends js.Object {
  @js.native
  sealed trait ANY extends WebOrientationLock
  
  @js.native
  sealed trait LANDSCAPE extends WebOrientationLock
  
  @js.native
  sealed trait LANDSCAPE_PRIMARY extends WebOrientationLock
  
  @js.native
  sealed trait LANDSCAPE_SECONDARY extends WebOrientationLock
  
  @js.native
  sealed trait NATURAL extends WebOrientationLock
  
  @js.native
  sealed trait PORTRAIT extends WebOrientationLock
  
  @js.native
  sealed trait PORTRAIT_PRIMARY extends WebOrientationLock
  
  @js.native
  sealed trait PORTRAIT_SECONDARY extends WebOrientationLock
  
  @js.native
  sealed trait UNKNOWN extends WebOrientationLock
  
  /* "any" */ val ANY: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientationLock.ANY with String = js.native
  /* "landscape" */ val LANDSCAPE: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientationLock.LANDSCAPE with String = js.native
  /* "landscape-primary" */ val LANDSCAPE_PRIMARY: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientationLock.LANDSCAPE_PRIMARY with String = js.native
  /* "landscape-secondary" */ val LANDSCAPE_SECONDARY: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientationLock.LANDSCAPE_SECONDARY with String = js.native
  /* "natural" */ val NATURAL: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientationLock.NATURAL with String = js.native
  /* "portrait" */ val PORTRAIT: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientationLock.PORTRAIT with String = js.native
  /* "portrait-primary" */ val PORTRAIT_PRIMARY: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientationLock.PORTRAIT_PRIMARY with String = js.native
  /* "portrait-secondary" */ val PORTRAIT_SECONDARY: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientationLock.PORTRAIT_SECONDARY with String = js.native
  /* "unknown" */ val UNKNOWN: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientationLock.UNKNOWN with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WebOrientationLock with String] = js.native
}

