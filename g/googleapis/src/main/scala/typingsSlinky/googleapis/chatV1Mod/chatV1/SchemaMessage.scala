package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message in Hangouts Chat.
  */
@js.native
trait SchemaMessage extends js.Object {
  /**
    * Input only. Parameters that a bot can use to configure how its response
    * is posted.
    */
  var actionResponse: js.UndefOr[SchemaActionResponse] = js.native
  /**
    * Output only. Annotations associated with the text in this message.
    */
  var annotations: js.UndefOr[js.Array[SchemaAnnotation]] = js.native
  /**
    * Plain-text body of the message with all bot mentions stripped out.
    */
  var argumentText: js.UndefOr[String] = js.native
  /**
    * Rich, formatted and interactive cards that can be used to display UI
    * elements such as: formatted texts, buttons, clickable images. Cards are
    * normally displayed below the plain-text body of the message.
    */
  var cards: js.UndefOr[js.Array[SchemaCard]] = js.native
  /**
    * Output only. The time at which the message was created in Hangouts Chat
    * server.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * A plain-text description of the message&#39;s cards, used when the actual
    * cards cannot be displayed (e.g. mobile notifications).
    */
  var fallbackText: js.UndefOr[String] = js.native
  /**
    * Resource name, in the form &quot;spaces/x/messages/ *&quot;.  Example:
    * spaces/AAAAMpdlehY/messages/UMxbHmzDlr4.UMxbHmzDlr4
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Text for generating preview chips. This text will not be displayed to the
    * user, but any links to images, web pages, videos, etc. included here will
    * generate preview chips.
    */
  var previewText: js.UndefOr[String] = js.native
  /**
    * The user who created the message.
    */
  var sender: js.UndefOr[SchemaUser] = js.native
  /**
    * The space the message belongs to.
    */
  var space: js.UndefOr[SchemaSpace] = js.native
  /**
    * Plain-text body of the message.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * The thread the message belongs to.
    */
  var thread: js.UndefOr[SchemaThread] = js.native
}

object SchemaMessage {
  @scala.inline
  def apply(): SchemaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessage]
  }
  @scala.inline
  implicit class SchemaMessageOps[Self <: SchemaMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionResponse(value: SchemaActionResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotations(value: js.Array[SchemaAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withArgumentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentText")(js.undefined)
        ret
    }
    @scala.inline
    def withCards(value: js.Array[SchemaCard]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cards")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackText")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewText")(js.undefined)
        ret
    }
    @scala.inline
    def withSender(value: SchemaUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: SchemaSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withThread(value: SchemaThread): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread")(js.undefined)
        ret
    }
  }
  
}

