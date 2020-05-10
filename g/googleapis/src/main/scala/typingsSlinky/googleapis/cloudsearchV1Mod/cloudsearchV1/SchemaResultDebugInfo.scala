package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Debugging information about the result.
  */
@js.native
trait SchemaResultDebugInfo extends js.Object {
  /**
    * General debug info formatted for display.
    */
  var formattedDebugInfo: js.UndefOr[String] = js.native
}

object SchemaResultDebugInfo {
  @scala.inline
  def apply(): SchemaResultDebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDebugInfo]
  }
  @scala.inline
  implicit class SchemaResultDebugInfoOps[Self <: SchemaResultDebugInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormattedDebugInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedDebugInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedDebugInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedDebugInfo")(js.undefined)
        ret
    }
  }
  
}

