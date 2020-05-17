package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTagRecognizer extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Caption: String = js.native
  val Creator: Double = js.native
  var Enabled: Boolean = js.native
  val FullName: String = js.native
  val Parent: js.Any = js.native
  val ProgID: String = js.native
  @JSName("Word.SmartTagRecognizer_typekey")
  var WordDotSmartTagRecognizer_typekey: SmartTagRecognizer = js.native
}

object SmartTagRecognizer {
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Creator: Double,
    Enabled: Boolean,
    FullName: String,
    Parent: js.Any,
    ProgID: String,
    WordDotSmartTagRecognizer_typekey: SmartTagRecognizer
  ): SmartTagRecognizer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ProgID = ProgID.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SmartTagRecognizer_typekey")(WordDotSmartTagRecognizer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagRecognizer]
  }
  @scala.inline
  implicit class SmartTagRecognizerOps[Self <: SmartTagRecognizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotSmartTagRecognizer_typekey(value: SmartTagRecognizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.SmartTagRecognizer_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

