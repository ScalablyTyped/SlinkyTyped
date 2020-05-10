package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note: This struct is deprecated (not recommended to use).
  */
@js.native
trait INxStreamListEntry extends js.Object {
  /**
    * Identifier of the stream
    */
  var qId: String = js.native
  /**
    * Name of the stream
    */
  var qName: String = js.native
}

object INxStreamListEntry {
  @scala.inline
  def apply(qId: String, qName: String): INxStreamListEntry = {
    val __obj = js.Dynamic.literal(qId = qId.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxStreamListEntry]
  }
  @scala.inline
  implicit class INxStreamListEntryOps[Self <: INxStreamListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

