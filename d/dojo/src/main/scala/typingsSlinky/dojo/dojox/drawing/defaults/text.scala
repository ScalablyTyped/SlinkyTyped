package typingsSlinky.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.text.html
  *
  * Style of text
  *
  */
@js.native
trait text extends js.Object {
  /**
    *
    */
  var color: String = js.native
  /**
    *
    */
  var deleteEmptyCreate: Boolean = js.native
  /**
    *
    */
  var deleteEmptyModify: Boolean = js.native
  /**
    *
    */
  var family: String = js.native
  /**
    *
    */
  var minWidth: Double = js.native
  /**
    *
    */
  var pad: Double = js.native
  /**
    *
    */
  var size: String = js.native
  /**
    *
    */
  var weight: String = js.native
}

object text {
  @scala.inline
  def apply(
    color: String,
    deleteEmptyCreate: Boolean,
    deleteEmptyModify: Boolean,
    family: String,
    minWidth: Double,
    pad: Double,
    size: String,
    weight: String
  ): text = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], deleteEmptyCreate = deleteEmptyCreate.asInstanceOf[js.Any], deleteEmptyModify = deleteEmptyModify.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[text]
  }
  @scala.inline
  implicit class textOps[Self <: text] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteEmptyCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEmptyCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteEmptyModify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEmptyModify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

