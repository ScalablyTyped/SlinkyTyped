package typingsSlinky.activexFaxcomexlib

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxDocument
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("FaxComEx.FaxDocument")
  var FaxComExDotFaxDocument: FaxDocument = js.native
  @JSName("FaxComEx.FaxServer")
  var FaxComExDotFaxServer: FaxServer = js.native
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(FaxComExDotFaxDocument: FaxDocument, FaxComExDotFaxServer: FaxServer): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FaxComEx.FaxDocument")(FaxComExDotFaxDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("FaxComEx.FaxServer")(FaxComExDotFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaxComExDotFaxDocument(value: FaxDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaxComEx.FaxDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaxComExDotFaxServer(value: FaxServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaxComEx.FaxServer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

