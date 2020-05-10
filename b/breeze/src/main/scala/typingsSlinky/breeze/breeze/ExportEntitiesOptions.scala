package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportEntitiesOptions extends js.Object {
  var asString: Boolean = js.native
    // default true
  var includeMetadata: Boolean = js.native
}

object ExportEntitiesOptions {
  @scala.inline
  def apply(asString: Boolean, includeMetadata: Boolean): ExportEntitiesOptions = {
    val __obj = js.Dynamic.literal(asString = asString.asInstanceOf[js.Any], includeMetadata = includeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportEntitiesOptions]
  }
  @scala.inline
  implicit class ExportEntitiesOptionsOps[Self <: ExportEntitiesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMetadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

