package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnFailure extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the destination resource.
    */
  var Destination: js.UndefOr[DestinationArn] = js.native
}

object OnFailure {
  @scala.inline
  def apply(): OnFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnFailure]
  }
  @scala.inline
  implicit class OnFailureOps[Self <: OnFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: DestinationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(js.undefined)
        ret
    }
  }
  
}

