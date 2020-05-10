package typingsSlinky.mapsjs

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.mapsjs.mod.geometry
import typingsSlinky.mapsjs.mod.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRenderBitmap extends js.Object {
  var renderBitmap: js.UndefOr[
    js.Function4[
      /* img */ HTMLElement, 
      /* context */ CanvasRenderingContext2D, 
      /* contextSize */ Double, 
      /* bleed */ Double, 
      Unit
    ]
  ] = js.native
  var renderGeometry: js.UndefOr[js.Function2[/* shape */ geometry, /* context */ CanvasRenderingContext2D, Unit]] = js.native
  var renderPoint: js.UndefOr[js.Function2[/* pt */ point, /* context */ CanvasRenderingContext2D, Unit]] = js.native
}

object AnonRenderBitmap {
  @scala.inline
  def apply(): AnonRenderBitmap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRenderBitmap]
  }
  @scala.inline
  implicit class AnonRenderBitmapOps[Self <: AnonRenderBitmap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderBitmap(
      value: (/* img */ HTMLElement, /* context */ CanvasRenderingContext2D, /* contextSize */ Double, /* bleed */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBitmap")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRenderBitmap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBitmap")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderGeometry(value: (/* shape */ geometry, /* context */ CanvasRenderingContext2D) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderGeometry")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderGeometry")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderPoint(value: (/* pt */ point, /* context */ CanvasRenderingContext2D) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPoint")(js.undefined)
        ret
    }
  }
  
}

