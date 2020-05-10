package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A minimal index definition.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1Index extends js.Object {
  /**
    * The index&#39;s ancestor mode.  Must not be ANCESTOR_MODE_UNSPECIFIED.
    * Required.
    */
  var ancestor: js.UndefOr[String] = js.native
  /**
    * The resource ID of the index. Output only.
    */
  var indexId: js.UndefOr[String] = js.native
  /**
    * The entity kind to which this index applies. Required.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Project ID. Output only.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * An ordered sequence of property names and their index attributes.
    * Required.
    */
  var properties: js.UndefOr[js.Array[SchemaGoogleDatastoreAdminV1IndexedProperty]] = js.native
  /**
    * The state of the index. Output only.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleDatastoreAdminV1Index {
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1Index]
  }
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1IndexOps[Self <: SchemaGoogleDatastoreAdminV1Index] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAncestor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAncestor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestor")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexId")(js.undefined)
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
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[SchemaGoogleDatastoreAdminV1IndexedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

