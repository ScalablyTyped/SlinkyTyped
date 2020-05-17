package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Script extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var Extended: String = js.native
  var Id: String = js.native
  var Language: MsoScriptLanguage = js.native
  val Location: MsoScriptLocation = js.native
  @JSName("Office.Script_typekey")
  var OfficeDotScript_typekey: Script = js.native
  val Parent: js.Any = js.native
  var ScriptText: String = js.native
  val Shape: js.Any = js.native
  def Delete(): Unit = js.native
}

object Script {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Delete: () => Unit,
    Extended: String,
    Id: String,
    Language: MsoScriptLanguage,
    Location: MsoScriptLocation,
    OfficeDotScript_typekey: Script,
    Parent: js.Any,
    ScriptText: String,
    Shape: js.Any
  ): Script = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Extended = Extended.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ScriptText = ScriptText.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.Script_typekey")(OfficeDotScript_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Script]
  }
  @scala.inline
  implicit class ScriptOps[Self <: Script] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExtended(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: MsoScriptLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: MsoScriptLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotScript_typekey(value: Script): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.Script_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shape")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

