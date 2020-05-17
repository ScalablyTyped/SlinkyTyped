package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestVertexNormals extends js.Object {
  var requestVertexNormals: js.UndefOr[Boolean] = js.native
  var requestWaterMask: js.UndefOr[Boolean] = js.native
}

object RequestVertexNormals {
  @scala.inline
  def apply(): RequestVertexNormals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestVertexNormals]
  }
  @scala.inline
  implicit class RequestVertexNormalsOps[Self <: RequestVertexNormals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestVertexNormals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVertexNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestVertexNormals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVertexNormals")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestWaterMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestWaterMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestWaterMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestWaterMask")(js.undefined)
        ret
    }
  }
  
}

