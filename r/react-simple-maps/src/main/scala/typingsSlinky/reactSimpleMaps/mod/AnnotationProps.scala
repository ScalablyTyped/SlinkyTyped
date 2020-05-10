package typingsSlinky.reactSimpleMaps.mod

import org.scalajs.dom.raw.SVGGElement
import org.scalajs.dom.raw.SVGPathElement
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.SVGAttributes
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationProps
  extends SVGAttributes[SVGGElement]
     with ClassAttributes[SVGGElement] {
  var connectorProps: SVGProps[SVGPathElement] = js.native
  /**
    * @default 0
    */
  var curve: js.UndefOr[Double] = js.native
  var subject: js.UndefOr[Point] = js.native
}

object AnnotationProps {
  @scala.inline
  def apply(connectorProps: SVGProps[SVGPathElement]): AnnotationProps = {
    val __obj = js.Dynamic.literal(connectorProps = connectorProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationProps]
  }
  @scala.inline
  implicit class AnnotationPropsOps[Self <: AnnotationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectorProps(value: SVGProps[SVGPathElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurve(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
  }
  
}

