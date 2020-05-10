package typingsSlinky.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to fetch stored inventory sources, campaigns, insertion orders,
  * line items, TrueView ad groups and ads.
  */
@js.native
trait SchemaDownloadRequest extends js.Object {
  /**
    * File types that will be returned.  Acceptable values are:   -
    * &quot;AD&quot;  - &quot;AD_GROUP&quot;  - &quot;CAMPAIGN&quot;  -
    * &quot;INSERTION_ORDER&quot;  - &quot;LINE_ITEM&quot;  -
    * &quot;INVENTORY_SOURCE&quot;
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The IDs of the specified filter type. This is used to filter entities to
    * fetch. At least one ID must be specified.
    */
  var filterIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Filter type used to filter entities to fetch.
    */
  var filterType: js.UndefOr[String] = js.native
  /**
    * SDF Version (column names, types, order) in which the entities will be
    * returned. Default to 3.1.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaDownloadRequest {
  @scala.inline
  def apply(): SchemaDownloadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadRequest]
  }
  @scala.inline
  implicit class SchemaDownloadRequestOps[Self <: SchemaDownloadRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIds")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

