package typingsSlinky.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPoint extends js.Object {
  /**
    * The time, in epoch format, associated with a particular Value.
    */
  var Timestamp: js.Date = js.native
  /**
    * The actual value associated with a particular Timestamp.
    */
  var Value: Double = js.native
}

object DataPoint {
  @scala.inline
  def apply(Timestamp: js.Date, Value: Double): DataPoint = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataPoint]
  }
}

