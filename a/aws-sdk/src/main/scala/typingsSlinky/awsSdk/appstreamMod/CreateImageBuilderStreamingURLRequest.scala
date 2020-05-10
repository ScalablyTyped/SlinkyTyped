package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageBuilderStreamingURLRequest extends js.Object {
  /**
    * The name of the image builder.
    */
  var Name: String = js.native
  /**
    * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The default is 3600 seconds.
    */
  var Validity: js.UndefOr[Long] = js.native
}

object CreateImageBuilderStreamingURLRequest {
  @scala.inline
  def apply(Name: String): CreateImageBuilderStreamingURLRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageBuilderStreamingURLRequest]
  }
  @scala.inline
  implicit class CreateImageBuilderStreamingURLRequestOps[Self <: CreateImageBuilderStreamingURLRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidity(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validity")(js.undefined)
        ret
    }
  }
  
}

