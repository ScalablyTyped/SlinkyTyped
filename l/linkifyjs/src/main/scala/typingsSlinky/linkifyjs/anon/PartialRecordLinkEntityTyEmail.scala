package typingsSlinky.linkifyjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, (href : string): string>> */
@js.native
trait PartialRecordLinkEntityTyEmail extends js.Object {
  var email: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
  var hashtag: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
  var mention: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
  var url: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
}

object PartialRecordLinkEntityTyEmail {
  @scala.inline
  def apply(): PartialRecordLinkEntityTyEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordLinkEntityTyEmail]
  }
  @scala.inline
  implicit class PartialRecordLinkEntityTyEmailOps[Self <: PartialRecordLinkEntityTyEmail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: /* value */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withHashtag(value: /* value */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHashtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(js.undefined)
        ret
    }
    @scala.inline
    def withMention(value: /* value */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mention")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mention")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: /* value */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

