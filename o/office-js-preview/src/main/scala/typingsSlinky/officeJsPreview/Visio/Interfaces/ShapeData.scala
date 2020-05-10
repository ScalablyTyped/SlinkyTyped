package typingsSlinky.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shape.toJSON()". */
@js.native
trait ShapeData extends js.Object {
  /**
    *
    * Returns the Comments Collection. Read-only.
    *
    * [Api set:  1.1]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.native
  /**
    *
    * Returns the Hyperlinks collection for a Shape object. Read-only.
    *
    * [Api set:  1.1]
    */
  var hyperlinks: js.UndefOr[js.Array[HyperlinkData]] = js.native
  /**
    *
    * Shape's identifier. Read-only.
    *
    * [Api set:  1.1]
    */
  var id: js.UndefOr[Double] = js.native
  /**
    *
    * Shape's name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Returns true, if shape is selected. User can set true to select the shape explicitly.
    *
    * [Api set:  1.1]
    */
  var select: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the Shape's Data Section. Read-only.
    *
    * [Api set:  1.1]
    */
  var shapeDataItems: js.UndefOr[js.Array[ShapeDataItemData]] = js.native
  /**
    *
    * Gets SubShape Collection. Read-only.
    *
    * [Api set:  1.1]
    */
  var subShapes: js.UndefOr[js.Array[ShapeData]] = js.native
  /**
    *
    * Shape's text. Read-only.
    *
    * [Api set:  1.1]
    */
  var text: js.UndefOr[String] = js.native
  /**
    *
    * Returns the view of the shape. Read-only.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[ShapeViewData] = js.native
}

object ShapeData {
  @scala.inline
  def apply(): ShapeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeData]
  }
  @scala.inline
  implicit class ShapeDataOps[Self <: ShapeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: js.Array[CommentData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlinks(value: js.Array[HyperlinkData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeDataItems(value: js.Array[ShapeDataItemData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeDataItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeDataItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeDataItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSubShapes(value: js.Array[ShapeData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subShapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subShapes")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: ShapeViewData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

