package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceUri extends js.Object {
  var sourceUri: js.UndefOr[String] = js.native
}

object SourceUri {
  @scala.inline
  def apply(): SourceUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceUri]
  }
  @scala.inline
  implicit class SourceUriOps[Self <: SourceUri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(js.undefined)
        ret
    }
  }
  
}

