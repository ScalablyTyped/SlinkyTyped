package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An embedded object in the document.
  */
@js.native
trait SchemaEmbeddedObject extends js.Object {
  /**
    * The description of the embedded object. The `title` and `description` are
    * both combined to display alt text.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The properties of an embedded drawing.
    */
  var embeddedDrawingProperties: js.UndefOr[SchemaEmbeddedDrawingProperties] = js.native
  /**
    * The border of the embedded object.
    */
  var embeddedObjectBorder: js.UndefOr[SchemaEmbeddedObjectBorder] = js.native
  /**
    * The properties of an image.
    */
  var imageProperties: js.UndefOr[SchemaImageProperties] = js.native
  /**
    * A reference to the external linked source content. For example, it
    * contains a reference to the source Sheets chart when the embedded object
    * is a linked chart.  If unset, then the embedded object is not linked.
    */
  var linkedContentReference: js.UndefOr[SchemaLinkedContentReference] = js.native
  /**
    * The bottom margin of the embedded object.
    */
  var marginBottom: js.UndefOr[SchemaDimension] = js.native
  /**
    * The left margin of the embedded object.
    */
  var marginLeft: js.UndefOr[SchemaDimension] = js.native
  /**
    * The right margin of the embedded object.
    */
  var marginRight: js.UndefOr[SchemaDimension] = js.native
  /**
    * The top margin of the embedded object.
    */
  var marginTop: js.UndefOr[SchemaDimension] = js.native
  /**
    * The size of the embedded object.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  /**
    * The title of the embedded object. The `title` and `description` are both
    * combined to display alt text.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaEmbeddedObject {
  @scala.inline
  def apply(): SchemaEmbeddedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObject]
  }
  @scala.inline
  implicit class SchemaEmbeddedObjectOps[Self <: SchemaEmbeddedObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddedDrawingProperties(value: SchemaEmbeddedDrawingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedDrawingProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddedDrawingProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedDrawingProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddedObjectBorder(value: SchemaEmbeddedObjectBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedObjectBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddedObjectBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedObjectBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withImageProperties(value: SchemaImageProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedContentReference(value: SchemaLinkedContentReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedContentReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedContentReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedContentReference")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginBottom(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginLeft(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginRight(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTop(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: SchemaSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

