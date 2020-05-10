package typingsSlinky.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBaseLayer extends js.Object {
  var BaseLayer: js.UndefOr[String] = js.native
  var Layers: js.UndefOr[js.Array[String]] = js.native
  var Type: String = js.native
}

object AnonBaseLayer {
  @scala.inline
  def apply(Type: String): AnonBaseLayer = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseLayer]
  }
  @scala.inline
  implicit class AnonBaseLayerOps[Self <: AnonBaseLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseLayer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layers")(js.undefined)
        ret
    }
  }
  
}

