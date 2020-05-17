package typingsSlinky.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApiTransfer.AMap.Transfer.WalkSegment
  - typingsSlinky.amapJsApiTransfer.AMap.Transfer.TaxiSegment
  - typingsSlinky.amapJsApiTransfer.AMap.Transfer.TransitSegment
  - typingsSlinky.amapJsApiTransfer.AMap.Transfer.RailwaySegment
*/
trait Segment extends js.Object

object Segment {
  @scala.inline
  implicit def apply(value: RailwaySegment): Segment = value.asInstanceOf[Segment]
  @scala.inline
  implicit def apply(value: TaxiSegment): Segment = value.asInstanceOf[Segment]
  @scala.inline
  implicit def apply(value: TransitSegment): Segment = value.asInstanceOf[Segment]
  @scala.inline
  implicit def apply(value: WalkSegment): Segment = value.asInstanceOf[Segment]
}

