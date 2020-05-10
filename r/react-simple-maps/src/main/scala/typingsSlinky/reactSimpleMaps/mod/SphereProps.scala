package typingsSlinky.reactSimpleMaps.mod

import org.scalajs.dom.raw.SVGPathElement
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SphereProps
  extends SVGAttributes[SVGPathElement]
     with ClassAttributes[SVGPathElement] {
  /**
    * @default "transparent"
    */
  @JSName("fill")
  var fill_SphereProps: String = js.native
  /**
    * @default "rsm-sphere"
    */
  @JSName("id")
  var id_SphereProps: String = js.native
  /**
    * @default 0.5
    */
  @JSName("strokeWidth")
  var strokeWidth_SphereProps: Double = js.native
  /**
    * @default "currentcolor"
    */
  @JSName("stroke")
  var stroke_SphereProps: String = js.native
}

object SphereProps {
  @scala.inline
  def apply(fill: String, id: String, stroke: String, strokeWidth: Double): SphereProps = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SphereProps]
  }
  @scala.inline
  implicit class SpherePropsOps[Self <: SphereProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

