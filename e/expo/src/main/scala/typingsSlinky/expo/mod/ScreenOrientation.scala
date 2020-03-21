package typingsSlinky.expo.mod

import typingsSlinky.expo.screenOrientationTypesMod.OrientationChangeListener
import typingsSlinky.expo.screenOrientationTypesMod.OrientationInfo
import typingsSlinky.expo.screenOrientationTypesMod.OrientationLock
import typingsSlinky.expo.screenOrientationTypesMod.PlatformOrientationInfo
import typingsSlinky.unimodulesReactNativeAdapter.eventEmitterMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "ScreenOrientation")
@js.native
object ScreenOrientation extends js.Object {
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
    /* "LANDSCAPE" */ val LANDSCAPE: typingsSlinky.expo.screenOrientationTypesMod.Orientation.LANDSCAPE with String = js.native
    /* "LANDSCAPE_LEFT" */ val LANDSCAPE_LEFT: typingsSlinky.expo.screenOrientationTypesMod.Orientation.LANDSCAPE_LEFT with String = js.native
    /* "LANDSCAPE_RIGHT" */ val LANDSCAPE_RIGHT: typingsSlinky.expo.screenOrientationTypesMod.Orientation.LANDSCAPE_RIGHT with String = js.native
    /* "PORTRAIT" */ val PORTRAIT: typingsSlinky.expo.screenOrientationTypesMod.Orientation.PORTRAIT with String = js.native
    /* "PORTRAIT_DOWN" */ val PORTRAIT_DOWN: typingsSlinky.expo.screenOrientationTypesMod.Orientation.PORTRAIT_DOWN with String = js.native
    /* "PORTRAIT_UP" */ val PORTRAIT_UP: typingsSlinky.expo.screenOrientationTypesMod.Orientation.PORTRAIT_UP with String = js.native
    /* "UNKNOWN" */ val UNKNOWN: typingsSlinky.expo.screenOrientationTypesMod.Orientation.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.screenOrientationTypesMod.Orientation with String] = js.native
  }
  
  @js.native
  object OrientationLock extends js.Object {
    /* "ALL" */ val ALL: typingsSlinky.expo.screenOrientationTypesMod.OrientationLock.ALL with String = js.native
    /* "ALL_BUT_UPSIDE_DOWN" */ val ALL_BUT_UPSIDE_DOWN: typingsSlinky.expo.screenOrientationTypesMod.OrientationLock.ALL_BUT_UPSIDE_DOWN with String = js.native
    /* "DEFAULT" */ val DEFAULT: typingsSlinky.expo.screenOrientationTypesMod.OrientationLock.DEFAULT with String = js.native
    /* "LANDSCAPE" */ val LANDSCAPE: typingsSlinky.expo.screenOrientationTypesMod.OrientationLock.LANDSCAPE with String = js.native
    /* "LANDSCAPE_LEFT" */ val LANDSCAPE_LEFT: typingsSlinky.expo.screenOrientationTypesMod.OrientationLock.LANDSCAPE_LEFT with String = js.native
    /* "LANDSCAPE_RIGHT" */ val LANDSCAPE_RIGHT: typingsSlinky.expo.screenOrientationTypesMod.OrientationLock.LANDSCAPE_RIGHT with String = js.native
    /* "OTHER" */ val OTHER: typingsSlinky.expo.screenOrientationTypesMod.OrientationLock.OTHER with String = js.native
    /* "PORTRAIT" */ val PORTRAIT: typingsSlinky.expo.screenOrientationTypesMod.OrientationLock.PORTRAIT with String = js.native
    /* "PORTRAIT_DOWN" */ val PORTRAIT_DOWN: typingsSlinky.expo.screenOrientationTypesMod.OrientationLock.PORTRAIT_DOWN with String = js.native
    /* "PORTRAIT_UP" */ val PORTRAIT_UP: typingsSlinky.expo.screenOrientationTypesMod.OrientationLock.PORTRAIT_UP with String = js.native
    /* "UNKNOWN" */ val UNKNOWN: typingsSlinky.expo.screenOrientationTypesMod.OrientationLock.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.screenOrientationTypesMod.OrientationLock with String] = js.native
  }
  
  @js.native
  object SizeClassIOS extends js.Object {
    /* "COMPACT" */ val COMPACT: typingsSlinky.expo.screenOrientationTypesMod.SizeClassIOS.COMPACT with String = js.native
    /* "REGULAR" */ val REGULAR: typingsSlinky.expo.screenOrientationTypesMod.SizeClassIOS.REGULAR with String = js.native
    /* "UNKNOWN" */ val UNKNOWN: typingsSlinky.expo.screenOrientationTypesMod.SizeClassIOS.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.screenOrientationTypesMod.SizeClassIOS with String] = js.native
  }
  
  @js.native
  object WebOrientationLock extends js.Object {
    /* "any" */ val ANY: typingsSlinky.expo.screenOrientationTypesMod.WebOrientationLock.ANY with String = js.native
    /* "landscape" */ val LANDSCAPE: typingsSlinky.expo.screenOrientationTypesMod.WebOrientationLock.LANDSCAPE with String = js.native
    /* "landscape-primary" */ val LANDSCAPE_PRIMARY: typingsSlinky.expo.screenOrientationTypesMod.WebOrientationLock.LANDSCAPE_PRIMARY with String = js.native
    /* "landscape-secondary" */ val LANDSCAPE_SECONDARY: typingsSlinky.expo.screenOrientationTypesMod.WebOrientationLock.LANDSCAPE_SECONDARY with String = js.native
    /* "natural" */ val NATURAL: typingsSlinky.expo.screenOrientationTypesMod.WebOrientationLock.NATURAL with String = js.native
    /* "portrait" */ val PORTRAIT: typingsSlinky.expo.screenOrientationTypesMod.WebOrientationLock.PORTRAIT with String = js.native
    /* "portrait-primary" */ val PORTRAIT_PRIMARY: typingsSlinky.expo.screenOrientationTypesMod.WebOrientationLock.PORTRAIT_PRIMARY with String = js.native
    /* "portrait-secondary" */ val PORTRAIT_SECONDARY: typingsSlinky.expo.screenOrientationTypesMod.WebOrientationLock.PORTRAIT_SECONDARY with String = js.native
    /* "unknown" */ val UNKNOWN: typingsSlinky.expo.screenOrientationTypesMod.WebOrientationLock.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expo.screenOrientationTypesMod.WebOrientationLock with String] = js.native
  }
  
}

