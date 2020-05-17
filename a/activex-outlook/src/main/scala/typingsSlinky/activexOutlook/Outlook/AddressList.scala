package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressList extends js.Object {
  val AddressEntries: typingsSlinky.activexOutlook.Outlook.AddressEntries = js.native
  val AddressListType: OlAddressListType = js.native
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ID: String = js.native
  val Index: Double = js.native
  val IsInitialAddressList: Boolean = js.native
  val IsReadOnly: Boolean = js.native
  val Name: String = js.native
  @JSName("Outlook.AddressList_typekey")
  var OutlookDotAddressList_typekey: AddressList = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typingsSlinky.activexOutlook.Outlook.PropertyAccessor = js.native
  val ResolutionOrder: Double = js.native
  val Session: NameSpace = js.native
  def GetContactsFolder(): Folder = js.native
}

object AddressList {
  @scala.inline
  def apply(
    AddressEntries: AddressEntries,
    AddressListType: OlAddressListType,
    Application: Application,
    Class: OlObjectClass,
    GetContactsFolder: () => Folder,
    ID: String,
    Index: Double,
    IsInitialAddressList: Boolean,
    IsReadOnly: Boolean,
    Name: String,
    OutlookDotAddressList_typekey: AddressList,
    Parent: js.Any,
    PropertyAccessor: PropertyAccessor,
    ResolutionOrder: Double,
    Session: NameSpace
  ): AddressList = {
    val __obj = js.Dynamic.literal(AddressEntries = AddressEntries.asInstanceOf[js.Any], AddressListType = AddressListType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], GetContactsFolder = js.Any.fromFunction0(GetContactsFolder), ID = ID.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], IsInitialAddressList = IsInitialAddressList.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertyAccessor = PropertyAccessor.asInstanceOf[js.Any], ResolutionOrder = ResolutionOrder.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AddressList_typekey")(OutlookDotAddressList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressList]
  }
  @scala.inline
  implicit class AddressListOps[Self <: AddressList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressEntries(value: AddressEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddressListType(value: OlAddressListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressListType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContactsFolder(value: () => Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetContactsFolder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInitialAddressList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsInitialAddressList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotAddressList_typekey(value: AddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.AddressList_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyAccessor(value: PropertyAccessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyAccessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolutionOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolutionOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

