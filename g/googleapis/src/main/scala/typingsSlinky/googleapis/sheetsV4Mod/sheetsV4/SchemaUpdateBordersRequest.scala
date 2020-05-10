package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the borders of a range. If a field is not set in the request, that
  * means the border remains as-is. For example, with two subsequent
  * UpdateBordersRequest:   1. range: A1:A5 `{ top: RED, bottom: WHITE }`  2.
  * range: A1:A5 `{ left: BLUE }`  That would result in A1:A5 having a borders
  * of `{ top: RED, bottom: WHITE, left: BLUE }`. If you want to clear a
  * border, explicitly set the style to NONE.
  */
@js.native
trait SchemaUpdateBordersRequest extends js.Object {
  /**
    * The border to put at the bottom of the range.
    */
  var bottom: js.UndefOr[SchemaBorder] = js.native
  /**
    * The horizontal border to put within the range.
    */
  var innerHorizontal: js.UndefOr[SchemaBorder] = js.native
  /**
    * The vertical border to put within the range.
    */
  var innerVertical: js.UndefOr[SchemaBorder] = js.native
  /**
    * The border to put at the left of the range.
    */
  var left: js.UndefOr[SchemaBorder] = js.native
  /**
    * The range whose borders should be updated.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The border to put at the right of the range.
    */
  var right: js.UndefOr[SchemaBorder] = js.native
  /**
    * The border to put at the top of the range.
    */
  var top: js.UndefOr[SchemaBorder] = js.native
}

object SchemaUpdateBordersRequest {
  @scala.inline
  def apply(): SchemaUpdateBordersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateBordersRequest]
  }
  @scala.inline
  implicit class SchemaUpdateBordersRequestOps[Self <: SchemaUpdateBordersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: SchemaBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerHorizontal(value: SchemaBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerVertical(value: SchemaBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: SchemaBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: SchemaGridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: SchemaBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: SchemaBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}

