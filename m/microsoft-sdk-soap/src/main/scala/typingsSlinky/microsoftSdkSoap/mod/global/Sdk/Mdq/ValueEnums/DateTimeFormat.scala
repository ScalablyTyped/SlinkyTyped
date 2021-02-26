package typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateTimeFormat extends StObject
@JSGlobal("Sdk.Mdq.ValueEnums.DateTimeFormat")
@js.native
object DateTimeFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeFormat with Double] = js.native
  
  @js.native
  sealed trait DateAndTime extends DateTimeFormat
  /* 0 */ val DateAndTime: typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.DateTimeFormat.DateAndTime with Double = js.native
  
  @js.native
  sealed trait DateOnly extends DateTimeFormat
  /* 1 */ val DateOnly: typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums.DateTimeFormat.DateOnly with Double = js.native
}
