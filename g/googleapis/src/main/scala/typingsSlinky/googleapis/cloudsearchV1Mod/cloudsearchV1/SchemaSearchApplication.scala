package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchApplication
  */
@js.native
trait SchemaSearchApplication extends js.Object {
  /**
    * Retrictions applied to the configurations. The maximum number of elements
    * is 10.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[SchemaDataSourceRestriction]] = js.native
  /**
    * The default fields for returning facet results. The sources specified
    * here also have been included in data_source_restrictions above.
    */
  var defaultFacetOptions: js.UndefOr[js.Array[SchemaFacetOptions]] = js.native
  /**
    * The default options for sorting the search results
    */
  var defaultSortOptions: js.UndefOr[SchemaSortOptions] = js.native
  /**
    * Display name of the Search Application. The maximum length is 300
    * characters.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Name of the Search Application. &lt;br /&gt;Format:
    * searchapplications/{application_id}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * IDs of the Long Running Operations (LROs) currently running for this
    * schema. Output only field.
    */
  var operationIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Configuration for ranking results.
    */
  var scoringConfig: js.UndefOr[SchemaScoringConfig] = js.native
  /**
    * Configuration for a sources specified in data_source_restrictions.
    */
  var sourceConfig: js.UndefOr[js.Array[SchemaSourceConfig]] = js.native
}

object SchemaSearchApplication {
  @scala.inline
  def apply(): SchemaSearchApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchApplication]
  }
  @scala.inline
  implicit class SchemaSearchApplicationOps[Self <: SchemaSearchApplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceRestrictions(value: js.Array[SchemaDataSourceRestriction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceRestrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFacetOptions(value: js.Array[SchemaFacetOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFacetOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFacetOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFacetOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSortOptions(value: SchemaSortOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSortOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
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
    def withOperationIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationIds")(js.undefined)
        ret
    }
    @scala.inline
    def withScoringConfig(value: SchemaScoringConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoringConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoringConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoringConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceConfig(value: js.Array[SchemaSourceConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceConfig")(js.undefined)
        ret
    }
  }
  
}

