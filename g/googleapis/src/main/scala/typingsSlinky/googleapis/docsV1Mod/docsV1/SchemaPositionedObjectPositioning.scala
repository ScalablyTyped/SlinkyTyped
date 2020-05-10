package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The positioning of a PositionedObject. The positioned object is positioned
  * relative to the beginning of the Paragraph it is tethered to.
  */
@js.native
trait SchemaPositionedObjectPositioning extends js.Object {
  /**
    * The layout of this positioned object.
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * The offset of the left edge of the positioned object relative to the
    * beginning of the Paragraph it is tethered to. The exact positioning of
    * the object can depend on other content in the document and the
    * document&#39;s styling.
    */
  var leftOffset: js.UndefOr[SchemaDimension] = js.native
  /**
    * The offset of the top edge of the positioned object relative to the
    * beginning of the Paragraph it is tethered to. The exact positioning of
    * the object can depend on other content in the document and the
    * document&#39;s styling.
    */
  var topOffset: js.UndefOr[SchemaDimension] = js.native
}

object SchemaPositionedObjectPositioning {
  @scala.inline
  def apply(): SchemaPositionedObjectPositioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObjectPositioning]
  }
  @scala.inline
  implicit class SchemaPositionedObjectPositioningOps[Self <: SchemaPositionedObjectPositioning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftOffset(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTopOffset(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffset")(js.undefined)
        ret
    }
  }
  
}

