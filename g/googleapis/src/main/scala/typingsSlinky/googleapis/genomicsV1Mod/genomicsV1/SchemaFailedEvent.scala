package typingsSlinky.googleapis.genomicsV1Mod.genomicsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when the execution of a pipeline has failed. Note that
  * other events can continue to occur after this event.
  */
@js.native
trait SchemaFailedEvent extends js.Object {
  /**
    * The human-readable description of the cause of the failure.
    */
  var cause: js.UndefOr[String] = js.native
  /**
    * The Google standard error code that best describes this failure.
    */
  var code: js.UndefOr[String] = js.native
}

object SchemaFailedEvent {
  @scala.inline
  def apply(): SchemaFailedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailedEvent]
  }
  @scala.inline
  implicit class SchemaFailedEventOps[Self <: SchemaFailedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCause(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
  }
  
}

