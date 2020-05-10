package typingsSlinky.protonNative.mod

import typingsSlinky.protonNative.protonNativeStrings.evenodd
import typingsSlinky.protonNative.protonNativeStrings.nonzero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaPathProps extends AreaBaseProps {
  /**
    * A string describing the path (uses SVG's path syntax, explanation @see https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths).
    *
    * A warning is displayed whan an unimplemented shaped are used (Quadratic Beziers and Arcs).
    */
  var d: String = js.native
  /**
    * Sets the methods how to determine wheter to fill a path. Explanation @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/fill-rule.
    */
  var fillMode: nonzero | evenodd = js.native
}

object AreaPathProps {
  @scala.inline
  def apply(d: String, fillMode: nonzero | evenodd): AreaPathProps = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], fillMode = fillMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaPathProps]
  }
  @scala.inline
  implicit class AreaPathPropsOps[Self <: AreaPathProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillMode(value: nonzero | evenodd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

