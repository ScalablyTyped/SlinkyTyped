package typingsSlinky.officeUiFabricReact.shimmerTypesMod

import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.bottom
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.center
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerElement extends js.Object {
  /**
    * Sets the height of the element (ICircle, ILine, IGap) in pixels.
    * Read more details for each specific element.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Represents the possible type of the shimmer elements: Gap, Circle, Line.
    * Required for every element you intend to use.
    */
  var `type`: ShimmerElementType = js.native
  /**
    * Sets vertical alignment of the element (ICircle, ILine).
    * @defaultvalue center
    */
  var verticalAlign: js.UndefOr[top | center | bottom] = js.native
  /**
    * Sets the width value of the element (ILine, IGap) in pixels.
    * Read more details for each specific element.
    */
  var width: js.UndefOr[Double | String] = js.native
}

object IShimmerElement {
  @scala.inline
  def apply(`type`: ShimmerElementType): IShimmerElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerElement]
  }
  @scala.inline
  implicit class IShimmerElementOps[Self <: IShimmerElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: ShimmerElementType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withVerticalAlign(value: top | center | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
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

