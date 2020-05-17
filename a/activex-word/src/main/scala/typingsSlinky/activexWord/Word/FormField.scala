package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormField extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var CalculateOnExit: Boolean = js.native
  val CheckBox: typingsSlinky.activexWord.Word.CheckBox = js.native
  val Creator: Double = js.native
  val DropDown: typingsSlinky.activexWord.Word.DropDown = js.native
  var Enabled: Boolean = js.native
  var EntryMacro: String = js.native
  var ExitMacro: String = js.native
  var HelpText: String = js.native
  var Name: String = js.native
  val Next: FormField = js.native
  var OwnHelp: Boolean = js.native
  var OwnStatus: Boolean = js.native
  val Parent: js.Any = js.native
  val Previous: FormField = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  var Result: String = js.native
  var StatusText: String = js.native
  val TextInput: typingsSlinky.activexWord.Word.TextInput = js.native
  val Type: WdFieldType = js.native
  @JSName("Word.FormField_typekey")
  var WordDotFormField_typekey: FormField = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

object FormField {
  @scala.inline
  def apply(
    Application: Application,
    CalculateOnExit: Boolean,
    CheckBox: CheckBox,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Delete: () => Unit,
    DropDown: DropDown,
    Enabled: Boolean,
    EntryMacro: String,
    ExitMacro: String,
    HelpText: String,
    Name: String,
    Next: FormField,
    OwnHelp: Boolean,
    OwnStatus: Boolean,
    Parent: js.Any,
    Previous: FormField,
    Range: Range,
    Result: String,
    Select: () => Unit,
    StatusText: String,
    TextInput: TextInput,
    Type: WdFieldType,
    WordDotFormField_typekey: FormField
  ): FormField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CalculateOnExit = CalculateOnExit.asInstanceOf[js.Any], CheckBox = CheckBox.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), DropDown = DropDown.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], EntryMacro = EntryMacro.asInstanceOf[js.Any], ExitMacro = ExitMacro.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], OwnHelp = OwnHelp.asInstanceOf[js.Any], OwnStatus = OwnStatus.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), StatusText = StatusText.asInstanceOf[js.Any], TextInput = TextInput.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FormField_typekey")(WordDotFormField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormField]
  }
  @scala.inline
  implicit class FormFieldOps[Self <: FormField] (val x: Self) extends AnyVal {
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
    def withCalculateOnExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalculateOnExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckBox(value: CheckBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDropDown(value: DropDown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryMacro(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntryMacro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExitMacro(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExitMacro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: FormField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnHelp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnHelp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious(value: FormField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStatusText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextInput(value: TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WdFieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotFormField_typekey(value: FormField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.FormField_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

