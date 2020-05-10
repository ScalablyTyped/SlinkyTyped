package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicsStatsBucket extends js.Object {
  /** Number of frames in the bucket. */
  var frameCount: js.UndefOr[String] = js.native
  /** Lower bound of render time in milliseconds. */
  var renderMillis: js.UndefOr[String] = js.native
}

object GraphicsStatsBucket {
  @scala.inline
  def apply(): GraphicsStatsBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphicsStatsBucket]
  }
  @scala.inline
  implicit class GraphicsStatsBucketOps[Self <: GraphicsStatsBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMillis")(js.undefined)
        ret
    }
  }
  
}

