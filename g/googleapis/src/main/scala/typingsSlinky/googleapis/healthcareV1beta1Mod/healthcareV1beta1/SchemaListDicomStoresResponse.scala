package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the DICOM stores in the given dataset.
  */
@js.native
trait SchemaListDicomStoresResponse extends js.Object {
  /**
    * The returned DICOM stores. Won&#39;t be more DICOM stores than the value
    * of page_size in the request.
    */
  var dicomStores: js.UndefOr[js.Array[SchemaDicomStore]] = js.native
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDicomStoresResponse {
  @scala.inline
  def apply(): SchemaListDicomStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDicomStoresResponse]
  }
  @scala.inline
  implicit class SchemaListDicomStoresResponseOps[Self <: SchemaListDicomStoresResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDicomStores(value: js.Array[SchemaDicomStore]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dicomStores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDicomStores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dicomStores")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

