package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnenotePatchContentCommand extends js.Object {
  // The action to perform on the target element. The possible values are: replace, append, delete, insert, or prepend.
  var action: js.UndefOr[OnenotePatchActionType] = js.native
  /**
    * A string of well-formed HTML to add to the page, and any image or file binary data. If the content contains binary
    * data, the request must be sent using the multipart/form-data content type with a 'Commands' part.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The location to add the supplied content, relative to the target element. The possible values are: after (default) or
    * before.
    */
  var position: js.UndefOr[OnenotePatchInsertPosition] = js.native
  /**
    * The element to update. Must be the #&amp;lt;data-id&amp;gt; or the generated &amp;lt;id&amp;gt; of the element, or the
    * body or title keyword.
    */
  var target: js.UndefOr[String] = js.native
}

object OnenotePatchContentCommand {
  @scala.inline
  def apply(): OnenotePatchContentCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenotePatchContentCommand]
  }
  @scala.inline
  implicit class OnenotePatchContentCommandOps[Self <: OnenotePatchContentCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: OnenotePatchActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: OnenotePatchInsertPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

