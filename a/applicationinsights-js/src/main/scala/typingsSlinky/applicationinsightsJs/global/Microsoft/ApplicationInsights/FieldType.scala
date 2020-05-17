package typingsSlinky.applicationinsightsJs.global.Microsoft.ApplicationInsights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum is used in aiDataContract to describe how fields are serialized.
  * For instance: (Fieldtype.Required | FieldType.Array) will mark the field as required and indicate it's an array
  */
@JSGlobal("Microsoft.ApplicationInsights.FieldType")
@js.native
object FieldType extends js.Object {
  /* 2 */ val Array: typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType.Array with Double = js.native
  /* 0 */ val Default: typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType.Default with Double = js.native
  /* 4 */ val Hidden: typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType.Hidden with Double = js.native
  /* 1 */ val Required: typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType.Required with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType with Double
  ] = js.native
}

