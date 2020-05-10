package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AllocationAffinity is the configuration of desired allocation which this
  * instance could take capacity from.
  */
@js.native
trait SchemaReservationAffinity extends js.Object {
  var consumeReservationType: js.UndefOr[String] = js.native
  /**
    * Corresponds to the label key of reservation resource.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Corresponds to the label values of reservation resource.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaReservationAffinity {
  @scala.inline
  def apply(): SchemaReservationAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservationAffinity]
  }
  @scala.inline
  implicit class SchemaReservationAffinityOps[Self <: SchemaReservationAffinity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumeReservationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumeReservationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumeReservationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumeReservationType")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

