package typingsSlinky.applicationinsightsJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataPointType extends js.Object
@JSGlobal("AI.DataPointType")
@js.native
object DataPointType extends js.Object {
  
  @js.native
  sealed trait Aggregation extends DataPointType
  
  @js.native
  sealed trait Measurement extends DataPointType
}
