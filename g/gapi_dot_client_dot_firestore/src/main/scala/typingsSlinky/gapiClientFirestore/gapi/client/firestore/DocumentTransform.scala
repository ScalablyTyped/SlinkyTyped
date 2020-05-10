package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentTransform extends js.Object {
  /** The name of the document to transform. */
  var document: js.UndefOr[String] = js.native
  /**
    * The list of transformations to apply to the fields of the document, in
    * order.
    */
  var fieldTransforms: js.UndefOr[js.Array[FieldTransform]] = js.native
}

object DocumentTransform {
  @scala.inline
  def apply(): DocumentTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTransform]
  }
  @scala.inline
  implicit class DocumentTransformOps[Self <: DocumentTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldTransforms(value: js.Array[FieldTransform]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTransforms")(js.undefined)
        ret
    }
  }
  
}

