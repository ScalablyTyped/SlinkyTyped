package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A particular message pertaining to a Dataflow job.
  */
@js.native
trait SchemaJobMessage extends js.Object {
  /**
    * Deprecated.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Importance level of the message.
    */
  var messageImportance: js.UndefOr[String] = js.native
  /**
    * The text of the message.
    */
  var messageText: js.UndefOr[String] = js.native
  /**
    * The timestamp of the message.
    */
  var time: js.UndefOr[String] = js.native
}

object SchemaJobMessage {
  @scala.inline
  def apply(): SchemaJobMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobMessage]
  }
  @scala.inline
  implicit class SchemaJobMessageOps[Self <: SchemaJobMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageImportance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageImportance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageImportance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageImportance")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageText")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

