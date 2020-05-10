package typingsSlinky.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the ShapeDataItem.
  *
  * [Api set:  1.1]
  */
@js.native
trait ShapeDataItemLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * A string that specifies the format of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var format: js.UndefOr[Boolean] = js.native
  /**
    *
    * A string that specifies the formatted value of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var formattedValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * A string that specifies the label of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var label: js.UndefOr[Boolean] = js.native
  /**
    *
    * A string that specifies the value of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var value: js.UndefOr[Boolean] = js.native
}

object ShapeDataItemLoadOptions {
  @scala.inline
  def apply(): ShapeDataItemLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeDataItemLoadOptions]
  }
  @scala.inline
  implicit class ShapeDataItemLoadOptionsOps[Self <: ShapeDataItemLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

