package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxModel extends js.Object {
  /** Border box, represented as an array of {x, y} points. */
  var border: js.Array[Box] = js.native
  /** Content box, represented as an array of {x, y} points. */
  var content: js.Array[Box] = js.native
  var height: Double = js.native
  /** Margin box, represented as an array of {x, y} points. */
  var margin: js.Array[Box] = js.native
  /** Padding box, represented as an array of {x, y} points. */
  var padding: js.Array[Box] = js.native
  var width: Double = js.native
}

object BoxModel {
  @scala.inline
  def apply(
    border: js.Array[Box],
    content: js.Array[Box],
    height: Double,
    margin: js.Array[Box],
    padding: js.Array[Box],
    width: Double
  ): BoxModel = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxModel]
  }
  @scala.inline
  implicit class BoxModelOps[Self <: BoxModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: js.Array[Box]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: js.Array[Box]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMargin(value: js.Array[Box]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: js.Array[Box]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

