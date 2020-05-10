package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Datasource is a logical namespace for items to be indexed. All items must
  * belong to a datasource.  This is the prerequisite before items can be
  * indexed into Cloud Search.
  */
@js.native
trait SchemaDataSource extends js.Object {
  /**
    * If true, Indexing API rejects any modification calls to this datasource
    * such as create, update, and delete. Disabling this does not imply halting
    * process of previously accepted data.
    */
  var disableModifications: js.UndefOr[Boolean] = js.native
  /**
    * Disable serving any search or assist results.
    */
  var disableServing: js.UndefOr[Boolean] = js.native
  /**
    * Required. Display name of the datasource The maximum length is 300
    * characters.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * List of service accounts that have indexing access.
    */
  var indexingServiceAccounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * This field restricts visibility to items at the datasource level. Items
    * within the datasource are restricted to the union of users and groups
    * included in this field. Note that, this does not ensure access to a
    * specific item, as users need to have ACL permissions on the contained
    * items. This ensures a high level access on the entire datasource, and
    * that the individual items are not shared outside this visibility.
    */
  var itemsVisibility: js.UndefOr[js.Array[SchemaGSuitePrincipal]] = js.native
  /**
    * Name of the datasource resource. Format: datasources/{source_id}. &lt;br
    * /&gt;The name is ignored when creating a datasource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * IDs of the Long Running Operations (LROs) currently running for this
    * schema.
    */
  var operationIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A short name or alias for the source.  This value will be used to match
    * the &#39;source&#39; operator. For example, if the short name is
    * *&amp;lt;value&amp;gt;* then queries like *source:&amp;lt;value&amp;gt;*
    * will only return results for this source. The value must be unique across
    * all datasources. The value must only contain alphanumeric characters
    * (a-zA-Z0-9). The value cannot start with &#39;google&#39; and cannot be
    * one of the following: mail, gmail, docs, drive, groups, sites, calendar,
    * hangouts, gplus, keep, people, teams. Its maximum length is 32
    * characters.
    */
  var shortName: js.UndefOr[String] = js.native
}

object SchemaDataSource {
  @scala.inline
  def apply(): SchemaDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSource]
  }
  @scala.inline
  implicit class SchemaDataSourceOps[Self <: SchemaDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableModifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableModifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableModifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableModifications")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableServing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableServing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableServing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableServing")(js.undefined)
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
    def withIndexingServiceAccounts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexingServiceAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexingServiceAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexingServiceAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsVisibility(value: js.Array[SchemaGSuitePrincipal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsVisibility")(js.undefined)
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
    def withShortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(js.undefined)
        ret
    }
  }
  
}

