package typingsSlinky.cesium

import typingsSlinky.cesium.mod.ComponentDatatype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponentDatatype extends js.Object {
  var componentDatatype: js.UndefOr[ComponentDatatype] = js.native
  var componentsPerAttribute: js.UndefOr[Double] = js.native
  var normalize: js.UndefOr[Boolean] = js.native
  var values: js.UndefOr[js.Array[Double]] = js.native
}

object AnonComponentDatatype {
  @scala.inline
  def apply(): AnonComponentDatatype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonComponentDatatype]
  }
  @scala.inline
  implicit class AnonComponentDatatypeOps[Self <: AnonComponentDatatype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentDatatype(value: ComponentDatatype): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDatatype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentDatatype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDatatype")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentsPerAttribute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentsPerAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentsPerAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentsPerAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

