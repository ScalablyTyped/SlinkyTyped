package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A transformation of a document.
  */
@js.native
trait SchemaDocumentTransform extends js.Object {
  /**
    * The name of the document to transform.
    */
  var document: js.UndefOr[String] = js.native
  /**
    * The list of transformations to apply to the fields of the document, in
    * order. This must not be empty.
    */
  var fieldTransforms: js.UndefOr[js.Array[SchemaFieldTransform]] = js.native
}

object SchemaDocumentTransform {
  @scala.inline
  def apply(): SchemaDocumentTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentTransform]
  }
  @scala.inline
  implicit class SchemaDocumentTransformOps[Self <: SchemaDocumentTransform] (val x: Self) extends AnyVal {
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
    def withFieldTransforms(value: js.Array[SchemaFieldTransform]): Self = {
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

