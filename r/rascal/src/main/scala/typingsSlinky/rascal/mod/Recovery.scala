package typingsSlinky.rascal.mod

import typingsSlinky.rascal.rascalStrings.ack
import typingsSlinky.rascal.rascalStrings.forward
import typingsSlinky.rascal.rascalStrings.nack
import typingsSlinky.rascal.rascalStrings.republish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recovery extends js.Object {
  var attempts: js.UndefOr[Double] = js.native
  var defer: js.UndefOr[Double] = js.native
  var immediateNack: js.UndefOr[Boolean] = js.native
  var options: js.UndefOr[PublicationConfig] = js.native
  var publication: js.UndefOr[String] = js.native
  var requeue: js.UndefOr[Boolean] = js.native
  var strategy: ack | nack | republish | forward = js.native
  var xDeathFix: js.UndefOr[Boolean] = js.native
}

object Recovery {
  @scala.inline
  def apply(strategy: ack | nack | republish | forward): Recovery = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recovery]
  }
  @scala.inline
  implicit class RecoveryOps[Self <: Recovery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStrategy(value: ack | nack | republish | forward): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts")(js.undefined)
        ret
    }
    @scala.inline
    def withDefer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(js.undefined)
        ret
    }
    @scala.inline
    def withImmediateNack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediateNack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediateNack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediateNack")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: PublicationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPublication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publication")(js.undefined)
        ret
    }
    @scala.inline
    def withRequeue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requeue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequeue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requeue")(js.undefined)
        ret
    }
    @scala.inline
    def withXDeathFix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xDeathFix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXDeathFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xDeathFix")(js.undefined)
        ret
    }
  }
  
}

