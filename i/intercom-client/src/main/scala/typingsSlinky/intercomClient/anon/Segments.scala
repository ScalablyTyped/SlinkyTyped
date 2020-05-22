package typingsSlinky.intercomClient.anon

import typingsSlinky.intercomClient.intercomClientStrings.segmentDotlist
import typingsSlinky.intercomClient.userMod.Segment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segments extends js.Object {
  var segments: js.Array[Segment]
  var `type`: segmentDotlist
}

object Segments {
  @scala.inline
  def apply(segments: js.Array[Segment], `type`: segmentDotlist): Segments = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segments]
  }
}

