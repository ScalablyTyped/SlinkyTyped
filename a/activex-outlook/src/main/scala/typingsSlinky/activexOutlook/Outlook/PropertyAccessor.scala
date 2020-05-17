package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyAccessor extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  @JSName("Outlook.PropertyAccessor_typekey")
  var OutlookDotPropertyAccessor_typekey: PropertyAccessor = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def BinaryToString(Value: js.Any): String = js.native
  def DeleteProperties(SchemaNames: js.Any): js.Any = js.native
  def DeleteProperty(SchemaName: String): Unit = js.native
  def GetProperties(SchemaNames: js.Any): js.Any = js.native
  def GetProperty(SchemaName: String): js.Any = js.native
  def LocalTimeToUTC(Value: VarDate): VarDate = js.native
  def SetProperties(SchemaNames: js.Any, Values: js.Any): js.Any = js.native
  def SetProperty(SchemaName: String, Value: js.Any): Unit = js.native
  def StringToBinary(Value: String): js.Any = js.native
  def UTCToLocalTime(Value: VarDate): VarDate = js.native
}

object PropertyAccessor {
  @scala.inline
  def apply(
    Application: Application,
    BinaryToString: js.Any => String,
    Class: OlObjectClass,
    DeleteProperties: js.Any => js.Any,
    DeleteProperty: String => Unit,
    GetProperties: js.Any => js.Any,
    GetProperty: String => js.Any,
    LocalTimeToUTC: VarDate => VarDate,
    OutlookDotPropertyAccessor_typekey: PropertyAccessor,
    Parent: js.Any,
    Session: NameSpace,
    SetProperties: (js.Any, js.Any) => js.Any,
    SetProperty: (String, js.Any) => Unit,
    StringToBinary: String => js.Any,
    UTCToLocalTime: VarDate => VarDate
  ): PropertyAccessor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BinaryToString = js.Any.fromFunction1(BinaryToString), Class = Class.asInstanceOf[js.Any], DeleteProperties = js.Any.fromFunction1(DeleteProperties), DeleteProperty = js.Any.fromFunction1(DeleteProperty), GetProperties = js.Any.fromFunction1(GetProperties), GetProperty = js.Any.fromFunction1(GetProperty), LocalTimeToUTC = js.Any.fromFunction1(LocalTimeToUTC), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetProperties = js.Any.fromFunction2(SetProperties), SetProperty = js.Any.fromFunction2(SetProperty), StringToBinary = js.Any.fromFunction1(StringToBinary), UTCToLocalTime = js.Any.fromFunction1(UTCToLocalTime))
    __obj.updateDynamic("Outlook.PropertyAccessor_typekey")(OutlookDotPropertyAccessor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyAccessor]
  }
  @scala.inline
  implicit class PropertyAccessorOps[Self <: PropertyAccessor] (val x: Self) extends AnyVal {
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
    def withBinaryToString(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryToString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteProperties(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteProperty(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProperties(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProperty(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocalTimeToUTC(value: VarDate => VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalTimeToUTC")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutlookDotPropertyAccessor_typekey(value: PropertyAccessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.PropertyAccessor_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetProperties(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetProperties")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetProperty(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStringToBinary(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringToBinary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUTCToLocalTime(value: VarDate => VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UTCToLocalTime")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

