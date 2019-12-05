package typingsSlinky.applicationinsights

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
import typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryTypeValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Declarations/Contracts/TelemetryTypes", JSImport.Namespace)
@js.native
object outDeclarationsContractsTelemetryTypesMod extends js.Object {
  def baseTypeToTelemetryType(baseType: TelemetryTypeValues): TelemetryType = js.native
  def telemetryTypeToBaseType(`type`: TelemetryType): TelemetryTypeValues = js.native
  @js.native
  object TelemetryType extends js.Object {
    /* 6 */ val Availability: typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Availability with Double = js.native
    /* 5 */ val Dependency: typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Dependency with Double = js.native
    /* 0 */ val Event: typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Event with Double = js.native
    /* 1 */ val Exception: typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Exception with Double = js.native
    /* 3 */ val Metric: typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Metric with Double = js.native
    /* 4 */ val Request: typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Request with Double = js.native
    /* 2 */ val Trace: typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Trace with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType with Double
      ] = js.native
  }
  
  @js.native
  object TelemetryTypeString extends /* key */ StringDictionary[TelemetryTypeValues]
  
}

