package typingsSlinky.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StateQuality extends js.Object
@JSGlobal("ioBroker.StateQuality")
@js.native
object StateQuality extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StateQuality with Double] = js.native
  
  @js.native
  sealed trait bad extends StateQuality
  /* 0x01 */ @js.native
  object bad extends TopLevel[bad with Double]
  
  @js.native
  sealed trait device_not_connected extends StateQuality
  /* 0x42 */ @js.native
  object device_not_connected extends TopLevel[device_not_connected with Double]
  
  @js.native
  sealed trait device_reports_error extends StateQuality
  /* 0x44 */ @js.native
  object device_reports_error extends TopLevel[device_reports_error with Double]
  
  @js.native
  sealed trait general_device_problem extends StateQuality
  /* 0x41 */ @js.native
  object general_device_problem extends TopLevel[general_device_problem with Double]
  
  @js.native
  sealed trait general_problem extends StateQuality
  /* 0x01 */ @js.native
  object general_problem extends TopLevel[general_problem with Double]
  
  @js.native
  sealed trait general_sensor_problem extends StateQuality
  /* 0x81 */ @js.native
  object general_sensor_problem extends TopLevel[general_sensor_problem with Double]
  
   // or undefined or null
  @js.native
  sealed trait good extends StateQuality
  /* 0x00 */ @js.native
  object good extends TopLevel[good with Double]
  
  @js.native
  sealed trait sensor_not_connected extends StateQuality
  /* 0x82 */ @js.native
  object sensor_not_connected extends TopLevel[sensor_not_connected with Double]
  
  @js.native
  sealed trait sensor_reports_error extends StateQuality
  /* 0x84 */ @js.native
  object sensor_reports_error extends TopLevel[sensor_reports_error with Double]
}
