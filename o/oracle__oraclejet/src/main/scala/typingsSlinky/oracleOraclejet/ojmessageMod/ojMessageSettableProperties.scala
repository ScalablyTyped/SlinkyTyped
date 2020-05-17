package typingsSlinky.oracleOraclejet.ojmessageMod

import typingsSlinky.oracleOraclejet.anon.CategoriesLabelCloseIcon
import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.ojmessageMod.ojMessage.DisplayOptions
import typingsSlinky.oracleOraclejet.ojmessageMod.ojMessage.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMessageSettableProperties extends JetSettableProperties {
  var displayOptions: DisplayOptions = js.native
  var message: Message = js.native
  var translations: CategoriesLabelCloseIcon = js.native
}

object ojMessageSettableProperties {
  @scala.inline
  def apply(displayOptions: DisplayOptions, message: Message, translations: CategoriesLabelCloseIcon): ojMessageSettableProperties = {
    val __obj = js.Dynamic.literal(displayOptions = displayOptions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMessageSettableProperties]
  }
  @scala.inline
  implicit class ojMessageSettablePropertiesOps[Self <: ojMessageSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayOptions(value: DisplayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: CategoriesLabelCloseIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

