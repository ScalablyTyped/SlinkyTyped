package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about a transfer activity. */
@js.native
trait TransferResult extends js.Object {
  /** Either void if the transfer has been carried out successfully, or an exception indicating the kind of failure. */
  var Result: js.Any = js.native
  /** The URL of the source object. */
  var Source: String = js.native
  /** The URL of the target folder into which to transfer (a copy of) the source object. */
  var Target: String = js.native
}

object TransferResult {
  @scala.inline
  def apply(Result: js.Any, Source: String, Target: String): TransferResult = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferResult]
  }
  @scala.inline
  implicit class TransferResultOps[Self <: TransferResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

