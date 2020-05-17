package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTagType extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val FriendlyName: String = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val SmartTagActions: typingsSlinky.activexWord.Word.SmartTagActions = js.native
  val SmartTagRecognizers: typingsSlinky.activexWord.Word.SmartTagRecognizers = js.native
  @JSName("Word.SmartTagType_typekey")
  var WordDotSmartTagType_typekey: SmartTagType = js.native
}

object SmartTagType {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    FriendlyName: String,
    Name: String,
    Parent: js.Any,
    SmartTagActions: SmartTagActions,
    SmartTagRecognizers: SmartTagRecognizers,
    WordDotSmartTagType_typekey: SmartTagType
  ): SmartTagType = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FriendlyName = FriendlyName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SmartTagActions = SmartTagActions.asInstanceOf[js.Any], SmartTagRecognizers = SmartTagRecognizers.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SmartTagType_typekey")(WordDotSmartTagType_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagType]
  }
  @scala.inline
  implicit class SmartTagTypeOps[Self <: SmartTagType] (val x: Self) extends AnyVal {
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
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FriendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmartTagActions(value: SmartTagActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmartTagActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmartTagRecognizers(value: SmartTagRecognizers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmartTagRecognizers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotSmartTagType_typekey(value: SmartTagType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.SmartTagType_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

