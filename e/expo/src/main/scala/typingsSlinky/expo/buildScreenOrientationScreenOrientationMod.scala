package typingsSlinky.expo

import typingsSlinky.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod.Subscription
import typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationChangeListener
import typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationInfo
import typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock
import typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.PlatformOrientationInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/ScreenOrientation/ScreenOrientation", JSImport.Namespace)
@js.native
object buildScreenOrientationScreenOrientationMod extends js.Object {
  def addOrientationChangeListener(listener: OrientationChangeListener): Subscription = js.native
  def allow(orientationLock: OrientationLock): Unit = js.native
  def allowAsync(orientationLock: OrientationLock): js.Promise[Unit] = js.native
  def doesSupportAsync(orientationLock: OrientationLock): js.Promise[Boolean] = js.native
  def getOrientationAsync(): js.Promise[OrientationInfo] = js.native
  def getOrientationLockAsync(): js.Promise[OrientationLock] = js.native
  def getPlatformOrientationLockAsync(): js.Promise[PlatformOrientationInfo] = js.native
  def lockAsync(orientationLock: OrientationLock): js.Promise[Unit] = js.native
  def lockPlatformAsync(options: PlatformOrientationInfo): js.Promise[Unit] = js.native
  def removeOrientationChangeListener(subscription: Subscription): Unit = js.native
  def removeOrientationChangeListeners(): Unit = js.native
  def supportsOrientationLockAsync(orientationLock: OrientationLock): js.Promise[Boolean] = js.native
  def unlockAsync(): js.Promise[Unit] = js.native
  @js.native
  object Orientation extends js.Object {
    /* "LANDSCAPE" */ val LANDSCAPE: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.LANDSCAPE with String = js.native
    /* "LANDSCAPE_LEFT" */ val LANDSCAPE_LEFT: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.LANDSCAPE_LEFT with String = js.native
    /* "LANDSCAPE_RIGHT" */ val LANDSCAPE_RIGHT: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.LANDSCAPE_RIGHT with String = js.native
    /* "PORTRAIT" */ val PORTRAIT: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.PORTRAIT with String = js.native
    /* "PORTRAIT_DOWN" */ val PORTRAIT_DOWN: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.PORTRAIT_DOWN with String = js.native
    /* "PORTRAIT_UP" */ val PORTRAIT_UP: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.PORTRAIT_UP with String = js.native
    /* "UNKNOWN" */ val UNKNOWN: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation with String
      ] = js.native
  }
  
  @js.native
  object OrientationLock extends js.Object {
    /* "ALL" */ val ALL: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock.ALL with String = js.native
    /* "ALL_BUT_UPSIDE_DOWN" */ val ALL_BUT_UPSIDE_DOWN: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock.ALL_BUT_UPSIDE_DOWN with String = js.native
    /* "DEFAULT" */ val DEFAULT: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock.DEFAULT with String = js.native
    /* "LANDSCAPE" */ val LANDSCAPE: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock.LANDSCAPE with String = js.native
    /* "LANDSCAPE_LEFT" */ val LANDSCAPE_LEFT: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock.LANDSCAPE_LEFT with String = js.native
    /* "LANDSCAPE_RIGHT" */ val LANDSCAPE_RIGHT: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock.LANDSCAPE_RIGHT with String = js.native
    /* "OTHER" */ val OTHER: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock.OTHER with String = js.native
    /* "PORTRAIT" */ val PORTRAIT: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock.PORTRAIT with String = js.native
    /* "PORTRAIT_DOWN" */ val PORTRAIT_DOWN: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock.PORTRAIT_DOWN with String = js.native
    /* "PORTRAIT_UP" */ val PORTRAIT_UP: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock.PORTRAIT_UP with String = js.native
    /* "UNKNOWN" */ val UNKNOWN: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.OrientationLock with String
      ] = js.native
  }
  
  @js.native
  object SizeClassIOS extends js.Object {
    /* "COMPACT" */ val COMPACT: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.SizeClassIOS.COMPACT with String = js.native
    /* "REGULAR" */ val REGULAR: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.SizeClassIOS.REGULAR with String = js.native
    /* "UNKNOWN" */ val UNKNOWN: typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.SizeClassIOS.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.SizeClassIOS with String
      ] = js.native
  }
  
  @js.native
  object WebOrientationLock extends js.Object {
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
    def apply(value: String): js.UndefOr[
        typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod.WebOrientationLock with String
      ] = js.native
  }
  
}

