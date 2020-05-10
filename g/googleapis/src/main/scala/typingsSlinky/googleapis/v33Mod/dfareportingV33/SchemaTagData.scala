package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement Tag Data
  */
@js.native
trait SchemaTagData extends js.Object {
  /**
    * Ad associated with this placement tag. Applicable only when format is
    * PLACEMENT_TAG_TRACKING.
    */
  var adId: js.UndefOr[String] = js.native
  /**
    * Tag string to record a click.
    */
  var clickTag: js.UndefOr[String] = js.native
  /**
    * Creative associated with this placement tag. Applicable only when format
    * is PLACEMENT_TAG_TRACKING.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * TagData tag format of this tag.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Tag string for serving an ad.
    */
  var impressionTag: js.UndefOr[String] = js.native
}

object SchemaTagData {
  @scala.inline
  def apply(): SchemaTagData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagData]
  }
  @scala.inline
  implicit class SchemaTagDataOps[Self <: SchemaTagData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adId")(js.undefined)
        ret
    }
    @scala.inline
    def withClickTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTag")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withImpressionTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressionTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionTag")(js.undefined)
        ret
    }
  }
  
}

