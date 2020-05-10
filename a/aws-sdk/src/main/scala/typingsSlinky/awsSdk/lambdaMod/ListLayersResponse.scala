package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLayersResponse extends js.Object {
  /**
    * A list of function layers.
    */
  var Layers: js.UndefOr[LayersList] = js.native
  /**
    * A pagination token returned when the response doesn't contain all layers.
    */
  var NextMarker: js.UndefOr[String] = js.native
}

object ListLayersResponse {
  @scala.inline
  def apply(): ListLayersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLayersResponse]
  }
  @scala.inline
  implicit class ListLayersResponseOps[Self <: ListLayersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayers(value: LayersList): Self = {
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
    @scala.inline
    def withNextMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(js.undefined)
        ret
    }
  }
  
}

