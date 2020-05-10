package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A unique identifier for a Datastore entity. If a key&#39;s partition ID or
  * any of its path kinds or names are reserved/read-only, the key is
  * reserved/read-only. A reserved/read-only key is forbidden in certain
  * documented contexts.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Key extends js.Object {
  /**
    * Entities are partitioned into subsets, currently identified by a project
    * ID and namespace ID. Queries are scoped to a single partition.
    */
  var partitionId: js.UndefOr[SchemaGooglePrivacyDlpV2PartitionId] = js.native
  /**
    * The entity path. An entity path consists of one or more elements composed
    * of a kind and a string or numerical identifier, which identify entities.
    * The first element identifies a _root entity_, the second element
    * identifies a _child_ of the root entity, the third element identifies a
    * child of the second entity, and so forth. The entities identified by all
    * prefixes of the path are called the element&#39;s _ancestors_.  A path
    * can never be empty, and a path can have at most 100 elements.
    */
  var path: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2PathElement]] = js.native
}

object SchemaGooglePrivacyDlpV2Key {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Key]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KeyOps[Self <: SchemaGooglePrivacyDlpV2Key] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartitionId(value: SchemaGooglePrivacyDlpV2PartitionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionId")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: js.Array[SchemaGooglePrivacyDlpV2PathElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

