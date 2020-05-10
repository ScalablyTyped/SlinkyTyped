package typingsSlinky.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonObjectType extends js.Object {
  /** The HTML-formatted content, suitable for display. */
  var content: js.UndefOr[String] = js.native
  /**
    * The object type of this comment. Possible values are:
    * - "comment" - A comment in reply to an activity.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * The content (text) as provided by the author, stored without any HTML formatting. When creating or updating a comment, this value must be supplied as
    * plain text in the request.
    */
  var originalContent: js.UndefOr[String] = js.native
}

object AnonObjectType {
  @scala.inline
  def apply(): AnonObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonObjectType]
  }
  @scala.inline
  implicit class AnonObjectTypeOps[Self <: AnonObjectType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalContent")(js.undefined)
        ret
    }
  }
  
}

