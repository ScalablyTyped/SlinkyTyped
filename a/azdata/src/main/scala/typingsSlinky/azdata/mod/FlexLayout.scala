package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexLayout extends js.Object {
  /**
  		 * Matches the align-content CSS property.
  		 */
  var alignContent: js.UndefOr[AlignContentType] = js.native
  /**
  		 * Matches the align-items CSS property.
  		 */
  var alignItems: js.UndefOr[AlignItemsType] = js.native
  /**
  		 * Matches the flex-flow CSS property and its available values.
  		 * To layout as a vertical view use "column", and for horizontal
  		 * use "row".
  		 */
  var flexFlow: js.UndefOr[String] = js.native
  /**
  		 *  Matches the flex-wrap CSS property.
  		 */
  var flexWrap: js.UndefOr[FlexWrapType] = js.native
  /**
  		 * Container Height
  		 */
  var height: js.UndefOr[Double | String] = js.native
  /**
  		 * Matches the justify-content CSS property.
  		 */
  var justifyContent: js.UndefOr[JustifyContentType] = js.native
  /**
  		 * The position CSS property. Empty by default.
  		 * This is particularly useful if laying out components inside a FlexContainer and
  		 * the size of the component is meant to be a fixed size. In this case the position must be
  		 * set to 'absolute', with the parent FlexContainer having 'relative' position.
  		 * Without this the component will fail to correctly size itself.
  		 */
  var position: js.UndefOr[PositionType] = js.native
  /**
  		 * Matches the text-align CSS property.
  		 */
  var textAlign: js.UndefOr[TextAlignType] = js.native
  /**
  		 * Container Width
  		 */
  var width: js.UndefOr[Double | String] = js.native
}

object FlexLayout {
  @scala.inline
  def apply(): FlexLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexLayout]
  }
  @scala.inline
  implicit class FlexLayoutOps[Self <: FlexLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignContent(value: AlignContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignItems(value: AlignItemsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexFlow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexFlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexFlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexFlow")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexWrap(value: FlexWrapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withJustifyContent(value: JustifyContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifyContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PositionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: TextAlignType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

