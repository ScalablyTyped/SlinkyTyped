package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outline extends js.Object {
  /** The dash style of the outline. */
  var dashStyle: js.UndefOr[String] = js.native
  /** The fill of the outline. */
  var outlineFill: js.UndefOr[OutlineFill] = js.native
  /**
    * The outline property state.
    *
    * Updating the the outline on a page element will implicitly update this
    * field to`RENDERED`, unless another value is specified in the same request.
    * To have no outline on a page element, set this field to `NOT_RENDERED`. In
    * this case, any other outline fields set in the same request will be
    * ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  /** The thickness of the outline. */
  var weight: js.UndefOr[Dimension] = js.native
}

object Outline {
  @scala.inline
  def apply(): Outline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outline]
  }
  @scala.inline
  implicit class OutlineOps[Self <: Outline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineFill(value: OutlineFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineFill")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyState")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

