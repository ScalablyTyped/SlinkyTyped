package typingsSlinky.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  var Tags: typingsSlinky.awsDashSdk.clientsSchemasMod.Tags = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Tags: Tags): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

