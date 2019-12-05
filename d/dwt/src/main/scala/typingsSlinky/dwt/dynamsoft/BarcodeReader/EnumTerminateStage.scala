package typingsSlinky.dwt.dynamsoft.BarcodeReader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumTerminateStage extends js.Object

@JSGlobal("dynamsoft.BarcodeReader.EnumTerminateStage")
@js.native
object EnumTerminateStage extends js.Object {
  @js.native
  sealed trait ETS_Localized extends EnumTerminateStage
  
  @js.native
  sealed trait ETS_Prelocalized extends EnumTerminateStage
  
  @js.native
  sealed trait ETS_Recognized extends EnumTerminateStage
  
  /* 1 */ val ETS_Localized: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumTerminateStage.ETS_Localized with Double = js.native
  /* 0 */ val ETS_Prelocalized: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumTerminateStage.ETS_Prelocalized with Double = js.native
  /* 2 */ val ETS_Recognized: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumTerminateStage.ETS_Recognized with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTerminateStage with Double] = js.native
}

