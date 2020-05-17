package typingsSlinky.go.anon

import typingsSlinky.go.mod.BrushLike
import typingsSlinky.go.mod.Iterable
import typingsSlinky.go.mod.MarginLike
import typingsSlinky.go.mod.Part
import typingsSlinky.go.mod.Point
import typingsSlinky.go.mod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Background extends js.Object {
  var background: js.UndefOr[BrushLike] = js.native
  var details: js.UndefOr[js.Any] = js.native
  var document: js.UndefOr[org.scalajs.dom.raw.Document] = js.native
  var maxSize: js.UndefOr[Size] = js.native
  var padding: js.UndefOr[MarginLike] = js.native
  var parts: js.UndefOr[Iterable[Part]] = js.native
  var position: js.UndefOr[Point] = js.native
  var scale: js.UndefOr[Double] = js.native
  var showGrid: js.UndefOr[Boolean] = js.native
  var showTemporary: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Size] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Background {
  @scala.inline
  def apply(): Background = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Background]
  }
  @scala.inline
  implicit class BackgroundOps[Self <: Background] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: BrushLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument(value: org.scalajs.dom.raw.Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: MarginLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withParts(value: Iterable[Part]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTemporary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTemporary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTemporary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTemporary")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

