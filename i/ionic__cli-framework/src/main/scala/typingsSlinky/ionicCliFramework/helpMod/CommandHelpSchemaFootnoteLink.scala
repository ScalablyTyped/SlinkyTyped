package typingsSlinky.ionicCliFramework.helpMod

import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandHelpSchemaFootnoteLink extends CommandHelpSchemaFootnote {
  val id: String | Double = js.native
  val shortUrl: js.UndefOr[String] = js.native
  val `type`: link = js.native
  val url: String = js.native
}

object CommandHelpSchemaFootnoteLink {
  @scala.inline
  def apply(id: String | Double, `type`: link, url: String): CommandHelpSchemaFootnoteLink = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaFootnoteLink]
  }
  @scala.inline
  implicit class CommandHelpSchemaFootnoteLinkOps[Self <: CommandHelpSchemaFootnoteLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortUrl")(js.undefined)
        ret
    }
  }
  
}

