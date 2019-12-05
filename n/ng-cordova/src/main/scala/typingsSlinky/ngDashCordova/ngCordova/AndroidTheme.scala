package typingsSlinky.ngDashCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AndroidTheme extends js.Object

@JSGlobal("ngCordova.AndroidTheme")
@js.native
object AndroidTheme extends js.Object {
  @js.native
  sealed trait DeviceDefaultDark extends AndroidTheme
  
  @js.native
  sealed trait DeviceDefaultLight extends AndroidTheme
  
  @js.native
  sealed trait HoloDark extends AndroidTheme
  
  @js.native
  sealed trait HoloLight extends AndroidTheme
  
  @js.native
  sealed trait Traditional extends AndroidTheme
  
  /* 4 */ val DeviceDefaultDark: typingsSlinky.ngDashCordova.ngCordova.AndroidTheme.DeviceDefaultDark with Double = js.native
  /* 5 */ val DeviceDefaultLight: typingsSlinky.ngDashCordova.ngCordova.AndroidTheme.DeviceDefaultLight with Double = js.native
  /* 2 */ val HoloDark: typingsSlinky.ngDashCordova.ngCordova.AndroidTheme.HoloDark with Double = js.native
  /* 3 */ val HoloLight: typingsSlinky.ngDashCordova.ngCordova.AndroidTheme.HoloLight with Double = js.native
  /* 1 */ val Traditional: typingsSlinky.ngDashCordova.ngCordova.AndroidTheme.Traditional with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AndroidTheme with Double] = js.native
}

