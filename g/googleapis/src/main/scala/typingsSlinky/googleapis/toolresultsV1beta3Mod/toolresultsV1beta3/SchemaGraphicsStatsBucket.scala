package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGraphicsStatsBucket extends js.Object {
  /**
    * Number of frames in the bucket.
    */
  var frameCount: js.UndefOr[String] = js.native
  /**
    * Lower bound of render time in milliseconds.
    */
  var renderMillis: js.UndefOr[String] = js.native
}

object SchemaGraphicsStatsBucket {
  @scala.inline
  def apply(): SchemaGraphicsStatsBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGraphicsStatsBucket]
  }
  @scala.inline
  implicit class SchemaGraphicsStatsBucketOps[Self <: SchemaGraphicsStatsBucket] (val x: Self) extends AnyVal {
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

