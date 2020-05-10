package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating a named range.
  */
@js.native
trait SchemaCreateNamedRangeResponse extends js.Object {
  /**
    * The ID of the created named range.
    */
  var namedRangeId: js.UndefOr[String] = js.native
}

object SchemaCreateNamedRangeResponse {
  @scala.inline
  def apply(): SchemaCreateNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateNamedRangeResponse]
  }
  @scala.inline
  implicit class SchemaCreateNamedRangeResponseOps[Self <: SchemaCreateNamedRangeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamedRangeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRangeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedRangeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRangeId")(js.undefined)
        ret
    }
  }
  
}

