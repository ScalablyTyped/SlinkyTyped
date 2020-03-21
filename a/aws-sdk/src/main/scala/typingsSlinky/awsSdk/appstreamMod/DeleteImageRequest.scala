package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImageRequest extends js.Object {
  /**
    * The name of the image.
    */
  var Name: typingsSlinky.awsSdk.appstreamMod.Name = js.native
}

object DeleteImageRequest {
  @scala.inline
  def apply(Name: Name): DeleteImageRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteImageRequest]
  }
}

