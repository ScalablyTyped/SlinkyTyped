package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the Annotation stores in the given dataset.
  */
@js.native
trait SchemaListAnnotationStoresResponse extends js.Object {
  /**
    * The returned Annotation stores. Won&#39;t be more Annotation stores than
    * the value of page_size in the request.
    */
  var annotationStores: js.UndefOr[js.Array[SchemaAnnotationStore]] = js.native
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAnnotationStoresResponse {
  @scala.inline
  def apply(): SchemaListAnnotationStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAnnotationStoresResponse]
  }
  @scala.inline
  implicit class SchemaListAnnotationStoresResponseOps[Self <: SchemaListAnnotationStoresResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationStores(value: js.Array[SchemaAnnotationStore]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationStores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationStores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationStores")(js.undefined)
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

