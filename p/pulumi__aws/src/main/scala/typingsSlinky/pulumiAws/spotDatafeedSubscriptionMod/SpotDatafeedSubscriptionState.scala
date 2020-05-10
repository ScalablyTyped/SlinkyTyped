package typingsSlinky.pulumiAws.spotDatafeedSubscriptionMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotDatafeedSubscriptionState extends js.Object {
  /**
    * The Amazon S3 bucket in which to store the Spot instance data feed.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  /**
    * Path of folder inside bucket to place spot pricing data.
    */
  val prefix: js.UndefOr[Input[String]] = js.native
}

object SpotDatafeedSubscriptionState {
  @scala.inline
  def apply(): SpotDatafeedSubscriptionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotDatafeedSubscriptionState]
  }
  @scala.inline
  implicit class SpotDatafeedSubscriptionStateOps[Self <: SpotDatafeedSubscriptionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

