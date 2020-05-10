package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Zone&#39;s type restrictions.
  */
@js.native
trait SchemaZoneTypeRestriction extends js.Object {
  /**
    * True if type restrictions have been enabled for this Zone.
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * List of type public ids that have been whitelisted for use in this Zone.
    */
  var whitelistedTypeId: js.UndefOr[js.Array[String]] = js.native
}

object SchemaZoneTypeRestriction {
  @scala.inline
  def apply(): SchemaZoneTypeRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZoneTypeRestriction]
  }
  @scala.inline
  implicit class SchemaZoneTypeRestrictionOps[Self <: SchemaZoneTypeRestriction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelistedTypeId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelistedTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelistedTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelistedTypeId")(js.undefined)
        ret
    }
  }
  
}

