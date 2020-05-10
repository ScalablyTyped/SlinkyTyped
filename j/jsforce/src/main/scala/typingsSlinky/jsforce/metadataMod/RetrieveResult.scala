package typingsSlinky.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrieveResult extends js.Object {
  var fileProperties: js.Array[FileProperties] = js.native
  var id: String = js.native
  var messages: js.Array[RetrieveMessage] = js.native
  var zipFile: String = js.native
}

object RetrieveResult {
  @scala.inline
  def apply(
    fileProperties: js.Array[FileProperties],
    id: String,
    messages: js.Array[RetrieveMessage],
    zipFile: String
  ): RetrieveResult = {
    val __obj = js.Dynamic.literal(fileProperties = fileProperties.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], zipFile = zipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveResult]
  }
  @scala.inline
  implicit class RetrieveResultOps[Self <: RetrieveResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileProperties(value: js.Array[FileProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessages(value: js.Array[RetrieveMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZipFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipFile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

