package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Publisher Dynamic Tag
  */
@js.native
trait SchemaFloodlightActivityPublisherDynamicTag extends js.Object {
  /**
    * Whether this tag is applicable only for click-throughs.
    */
  var clickThrough: js.UndefOr[Boolean] = js.native
  /**
    * Directory site ID of this dynamic tag. This is a write-only field that
    * can be used as an alternative to the siteId field. When this resource is
    * retrieved, only the siteId field will be populated.
    */
  var directorySiteId: js.UndefOr[String] = js.native
  /**
    * Dynamic floodlight tag.
    */
  var dynamicTag: js.UndefOr[SchemaFloodlightActivityDynamicTag] = js.native
  /**
    * Site ID of this dynamic tag.
    */
  var siteId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the site. This is a read-only,
    * auto-generated field.
    */
  var siteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Whether this tag is applicable only for view-throughs.
    */
  var viewThrough: js.UndefOr[Boolean] = js.native
}

object SchemaFloodlightActivityPublisherDynamicTag {
  @scala.inline
  def apply(): SchemaFloodlightActivityPublisherDynamicTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivityPublisherDynamicTag]
  }
  @scala.inline
  implicit class SchemaFloodlightActivityPublisherDynamicTagOps[Self <: SchemaFloodlightActivityPublisherDynamicTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickThrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectorySiteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directorySiteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectorySiteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directorySiteId")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicTag(value: SchemaFloodlightActivityDynamicTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTag")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteId")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteIdDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withViewThrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewThrough")(js.undefined)
        ret
    }
  }
  
}

