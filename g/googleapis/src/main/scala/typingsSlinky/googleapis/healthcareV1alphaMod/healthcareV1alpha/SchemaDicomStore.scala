package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a DICOM store.
  */
@js.native
trait SchemaDicomStore extends js.Object {
  /**
    * Output only. Resource name of the DICOM store, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Notification destination for new DICOM instances. Supplied by the client.
    */
  var notificationConfig: js.UndefOr[SchemaNotificationConfig] = js.native
}

object SchemaDicomStore {
  @scala.inline
  def apply(): SchemaDicomStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDicomStore]
  }
  @scala.inline
  implicit class SchemaDicomStoreOps[Self <: SchemaDicomStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withNotificationConfig(value: SchemaNotificationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationConfig")(js.undefined)
        ret
    }
  }
  
}

