package typingsSlinky.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layers extends js.Object {
  /** A layer should appear here if and only if the layer exists for this book. */
  var layers: js.UndefOr[js.Array[VolumeAnnotationsVersion]] = js.native
}

object Layers {
  @scala.inline
  def apply(): Layers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layers]
  }
  @scala.inline
  implicit class LayersOps[Self <: Layers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayers(value: js.Array[VolumeAnnotationsVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
  }
  
}

