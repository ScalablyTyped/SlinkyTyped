package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends js.Object
/**
  * Enum is used in aiDataContract to describe how fields are serialized.
  * For instance: (Fieldtype.Required | FieldType.Array) will mark the field as required and indicate it's an array
  */
@JSGlobal("Microsoft.ApplicationInsights.FieldType")
@js.native
object FieldType extends js.Object {
  
  @js.native
  sealed trait Array extends FieldType
  
  @js.native
  sealed trait Default extends FieldType
  
  @js.native
  sealed trait Hidden extends FieldType
  
  @js.native
  sealed trait Required extends FieldType
}
