package typingsSlinky.reactBootstrapTypeahead

import typingsSlinky.csstype.mod.BoxSizingProperty
import typingsSlinky.csstype.mod.WidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react.react.CSSProperties, 'boxSizing' | 'width'> */
@js.native
trait PickCSSPropertiesboxSizin extends js.Object {
  var boxSizing: js.UndefOr[BoxSizingProperty] = js.native
  var width: js.UndefOr[WidthProperty[String | Double]] = js.native
}

object PickCSSPropertiesboxSizin {
  @scala.inline
  def apply(): PickCSSPropertiesboxSizin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCSSPropertiesboxSizin]
  }
  @scala.inline
  implicit class PickCSSPropertiesboxSizinOps[Self <: PickCSSPropertiesboxSizin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxSizing(value: BoxSizingProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxSizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxSizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxSizing")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: WidthProperty[String | Double]): Self = {
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

