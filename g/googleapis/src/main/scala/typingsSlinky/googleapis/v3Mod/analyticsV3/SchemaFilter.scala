package typingsSlinky.googleapis.v3Mod.analyticsV3

import typingsSlinky.googleapis.AnonCaseSensitive
import typingsSlinky.googleapis.AnonField
import typingsSlinky.googleapis.AnonFieldIndex
import typingsSlinky.googleapis.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics account filter.
  */
@js.native
trait SchemaFilter extends js.Object {
  /**
    * Account ID to which this filter belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Details for the filter of the type ADVANCED.
    */
  var advancedDetails: js.UndefOr[AnonCaseSensitive] = js.native
  /**
    * Time this filter was created.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * Details for the filter of the type EXCLUDE.
    */
  var excludeDetails: js.UndefOr[SchemaFilterExpression] = js.native
  /**
    * Filter ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Details for the filter of the type INCLUDE.
    */
  var includeDetails: js.UndefOr[SchemaFilterExpression] = js.native
  /**
    * Resource type for Analytics filter.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Details for the filter of the type LOWER.
    */
  var lowercaseDetails: js.UndefOr[AnonField] = js.native
  /**
    * Name of this filter.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent link for this filter. Points to the account to which this filter
    * belongs.
    */
  var parentLink: js.UndefOr[AnonHref] = js.native
  /**
    * Details for the filter of the type SEARCH_AND_REPLACE.
    */
  var searchAndReplaceDetails: js.UndefOr[AnonFieldIndex] = js.native
  /**
    * Link for this filter.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Type of this filter. Possible values are INCLUDE, EXCLUDE, LOWERCASE,
    * UPPERCASE, SEARCH_AND_REPLACE and ADVANCED.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Time this filter was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * Details for the filter of the type UPPER.
    */
  var uppercaseDetails: js.UndefOr[AnonField] = js.native
}

object SchemaFilter {
  @scala.inline
  def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  @scala.inline
  implicit class SchemaFilterOps[Self <: SchemaFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvancedDetails(value: AnonCaseSensitive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvancedDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeDetails(value: SchemaFilterExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDetails(value: SchemaFilterExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLowercaseDetails(value: AnonField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercaseDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowercaseDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercaseDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParentLink(value: AnonHref): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchAndReplaceDetails(value: AnonFieldIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchAndReplaceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchAndReplaceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchAndReplaceDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withUppercaseDetails(value: AnonField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercaseDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUppercaseDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercaseDetails")(js.undefined)
        ret
    }
  }
  
}

