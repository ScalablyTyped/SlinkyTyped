package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated whenever a product&#39;s availability changes.
  */
@js.native
trait SchemaProductAvailabilityChangeEvent extends js.Object {
  /**
    * The new state of the product. This field will always be present.
    */
  var availabilityStatus: js.UndefOr[String] = js.native
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which the product availability changed. This field will always be
    * present.
    */
  var productId: js.UndefOr[String] = js.native
}

object SchemaProductAvailabilityChangeEvent {
  @scala.inline
  def apply(): SchemaProductAvailabilityChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductAvailabilityChangeEvent]
  }
  @scala.inline
  implicit class SchemaProductAvailabilityChangeEventOps[Self <: SchemaProductAvailabilityChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
  }
  
}

