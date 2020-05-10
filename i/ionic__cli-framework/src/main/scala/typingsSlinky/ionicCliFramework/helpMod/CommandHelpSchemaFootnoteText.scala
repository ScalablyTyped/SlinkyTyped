package typingsSlinky.ionicCliFramework.helpMod

import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandHelpSchemaFootnoteText extends CommandHelpSchemaFootnote {
  val id: String | Double = js.native
  val text: String = js.native
  val `type`: typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.text = js.native
}

object CommandHelpSchemaFootnoteText {
  @scala.inline
  def apply(id: String | Double, text: String, `type`: text): CommandHelpSchemaFootnoteText = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaFootnoteText]
  }
  @scala.inline
  implicit class CommandHelpSchemaFootnoteTextOps[Self <: CommandHelpSchemaFootnoteText] (val x: Self) extends AnyVal {
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
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

