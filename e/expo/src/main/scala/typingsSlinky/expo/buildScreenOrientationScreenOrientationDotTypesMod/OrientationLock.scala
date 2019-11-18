package typingsSlinky.expo.buildScreenOrientationScreenOrientationDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OrientationLock extends js.Object

@JSImport("expo/build/ScreenOrientation/ScreenOrientation.types", "OrientationLock")
@js.native
object OrientationLock extends js.Object {
  @js.native
  sealed trait ALL extends OrientationLock
  
  @js.native
  sealed trait ALL_BUT_UPSIDE_DOWN extends OrientationLock
  
  @js.native
  sealed trait DEFAULT extends OrientationLock
  
  @js.native
  sealed trait LANDSCAPE extends OrientationLock
  
  @js.native
  sealed trait LANDSCAPE_LEFT extends OrientationLock
  
  @js.native
  sealed trait LANDSCAPE_RIGHT extends OrientationLock
  
  @js.native
  sealed trait OTHER extends OrientationLock
  
  @js.native
  sealed trait PORTRAIT extends OrientationLock
  
  @js.native
  sealed trait PORTRAIT_DOWN extends OrientationLock
  
  @js.native
  sealed trait PORTRAIT_UP extends OrientationLock
  
  @js.native
  sealed trait UNKNOWN extends OrientationLock
  
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
  def apply(value: String): js.UndefOr[OrientationLock with String] = js.native
}

