package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An index definition.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta1Index extends js.Object {
  /**
    * The collection ID to which this index applies. Required.
    */
  var collectionId: js.UndefOr[String] = js.native
  /**
    * The fields to index.
    */
  var fields: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1beta1IndexField]] = js.native
  /**
    * The resource name of the index. Output only.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The state of the index. Output only.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1beta1Index {
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta1Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1Index]
  }
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta1IndexOps[Self <: SchemaGoogleFirestoreAdminV1beta1Index] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[SchemaGoogleFirestoreAdminV1beta1IndexField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
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

