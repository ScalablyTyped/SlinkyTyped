package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DivItemLayout extends js.Object {
  /**
  		 * Matches the CSS style key and its available values.
  		 */
  var CSSStyles: js.UndefOr[StringDictionary[String]] = js.native
  /**
  		 * Matches the order CSS property and its available values.
  		 */
  var order: js.UndefOr[Double] = js.native
}

object DivItemLayout {
  @scala.inline
  def apply(): DivItemLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivItemLayout]
  }
  @scala.inline
  implicit class DivItemLayoutOps[Self <: DivItemLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCSSStyles(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSSStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCSSStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSSStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
  }
  
}

