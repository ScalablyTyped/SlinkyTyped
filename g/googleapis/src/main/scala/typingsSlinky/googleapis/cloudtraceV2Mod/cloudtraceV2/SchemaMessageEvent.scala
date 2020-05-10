package typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event describing a message sent/received between Spans.
  */
@js.native
trait SchemaMessageEvent extends js.Object {
  /**
    * The number of compressed bytes sent or received. If missing assumed to be
    * the same size as uncompressed.
    */
  var compressedSizeBytes: js.UndefOr[String] = js.native
  /**
    * An identifier for the MessageEvent&#39;s message that can be used to
    * match SENT and RECEIVED MessageEvents. It is recommended to be unique
    * within a Span.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of MessageEvent. Indicates whether the message was sent or received.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The number of uncompressed bytes sent or received.
    */
  var uncompressedSizeBytes: js.UndefOr[String] = js.native
}

object SchemaMessageEvent {
  @scala.inline
  def apply(): SchemaMessageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessageEvent]
  }
  @scala.inline
  implicit class SchemaMessageEventOps[Self <: SchemaMessageEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompressedSizeBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressedSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressedSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressedSizeBytes")(js.undefined)
        ret
    }
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUncompressedSizeBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncompressedSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncompressedSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncompressedSizeBytes")(js.undefined)
        ret
    }
  }
  
}

