package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingTypeMetadata extends js.Object {
  /**
    * The date and time when the thing type was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  var deprecated: js.UndefOr[Boolean] = js.native
  /**
    * The date and time when the thing type was deprecated.
    */
  var deprecationDate: js.UndefOr[js.Date] = js.native
}

object ThingTypeMetadata {
  @scala.inline
  def apply(): ThingTypeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeMetadata]
  }
  @scala.inline
  implicit class ThingTypeMetadataOps[Self <: ThingTypeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationDate")(js.undefined)
        ret
    }
  }
  
}

