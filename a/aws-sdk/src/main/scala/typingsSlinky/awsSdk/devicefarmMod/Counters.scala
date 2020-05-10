package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Counters extends js.Object {
  /**
    * The number of errored entities.
    */
  var errored: js.UndefOr[Integer] = js.native
  /**
    * The number of failed entities.
    */
  var failed: js.UndefOr[Integer] = js.native
  /**
    * The number of passed entities.
    */
  var passed: js.UndefOr[Integer] = js.native
  /**
    * The number of skipped entities.
    */
  var skipped: js.UndefOr[Integer] = js.native
  /**
    * The number of stopped entities.
    */
  var stopped: js.UndefOr[Integer] = js.native
  /**
    * The total number of entities.
    */
  var total: js.UndefOr[Integer] = js.native
  /**
    * The number of warned entities.
    */
  var warned: js.UndefOr[Integer] = js.native
}

object Counters {
  @scala.inline
  def apply(): Counters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Counters]
  }
  @scala.inline
  implicit class CountersOps[Self <: Counters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrored(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errored")(js.undefined)
        ret
    }
    @scala.inline
    def withFailed(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(js.undefined)
        ret
    }
    @scala.inline
    def withPassed(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passed")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipped(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipped")(js.undefined)
        ret
    }
    @scala.inline
    def withStopped(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
    @scala.inline
    def withWarned(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warned")(js.undefined)
        ret
    }
  }
  
}

