package typingsSlinky.jsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAce extends js.Object {
  var ace: AnonTheme = js.native
  var epiceditor: AnonBasePath = js.native
  var sceditor: AnonEmoticonsEnabled = js.native
  var selectize: AnonEnable = js.native
}

object AnonAce {
  @scala.inline
  def apply(ace: AnonTheme, epiceditor: AnonBasePath, sceditor: AnonEmoticonsEnabled, selectize: AnonEnable): AnonAce = {
    val __obj = js.Dynamic.literal(ace = ace.asInstanceOf[js.Any], epiceditor = epiceditor.asInstanceOf[js.Any], sceditor = sceditor.asInstanceOf[js.Any], selectize = selectize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAce]
  }
  @scala.inline
  implicit class AnonAceOps[Self <: AnonAce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAce(value: AnonTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEpiceditor(value: AnonBasePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epiceditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSceditor(value: AnonEmoticonsEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectize(value: AnonEnable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

