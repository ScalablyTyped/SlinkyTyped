package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Categories: typingsSlinky.activexOutlook.Outlook.Categories = js.native
  val Class: OlObjectClass = js.native
  val DisplayName: String = js.native
  val ExchangeStoreType: OlExchangeStoreType = js.native
  val FilePath: String = js.native
  val IsCachedExchange: Boolean = js.native
  val IsConversationEnabled: Boolean = js.native
  val IsDataFileStore: Boolean = js.native
  val IsInstantSearchEnabled: Boolean = js.native
  val IsOpen: Boolean = js.native
  val MAPIOBJECT: js.Any = js.native
  @JSName("Outlook.Store_typekey")
  var OutlookDotStore_typekey: Store = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typingsSlinky.activexOutlook.Outlook.PropertyAccessor = js.native
  val Session: NameSpace = js.native
  val StoreID: String = js.native
  def GetDefaultFolder(FolderType: OlDefaultFolders): Folder = js.native
  def GetRootFolder(): Folder = js.native
  def GetRules(): Rules = js.native
  def GetSearchFolders(): Folders = js.native
  def GetSpecialFolder(FolderType: OlSpecialFolders): Folder = js.native
  def RefreshQuotaDisplay(): Unit = js.native
}

object Store {
  @scala.inline
  def apply(
    Application: Application,
    Categories: Categories,
    Class: OlObjectClass,
    DisplayName: String,
    ExchangeStoreType: OlExchangeStoreType,
    FilePath: String,
    GetDefaultFolder: OlDefaultFolders => Folder,
    GetRootFolder: () => Folder,
    GetRules: () => Rules,
    GetSearchFolders: () => Folders,
    GetSpecialFolder: OlSpecialFolders => Folder,
    IsCachedExchange: Boolean,
    IsConversationEnabled: Boolean,
    IsDataFileStore: Boolean,
    IsInstantSearchEnabled: Boolean,
    IsOpen: Boolean,
    MAPIOBJECT: js.Any,
    OutlookDotStore_typekey: Store,
    Parent: js.Any,
    PropertyAccessor: PropertyAccessor,
    RefreshQuotaDisplay: () => Unit,
    Session: NameSpace,
    StoreID: String
  ): Store = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Categories = Categories.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ExchangeStoreType = ExchangeStoreType.asInstanceOf[js.Any], FilePath = FilePath.asInstanceOf[js.Any], GetDefaultFolder = js.Any.fromFunction1(GetDefaultFolder), GetRootFolder = js.Any.fromFunction0(GetRootFolder), GetRules = js.Any.fromFunction0(GetRules), GetSearchFolders = js.Any.fromFunction0(GetSearchFolders), GetSpecialFolder = js.Any.fromFunction1(GetSpecialFolder), IsCachedExchange = IsCachedExchange.asInstanceOf[js.Any], IsConversationEnabled = IsConversationEnabled.asInstanceOf[js.Any], IsDataFileStore = IsDataFileStore.asInstanceOf[js.Any], IsInstantSearchEnabled = IsInstantSearchEnabled.asInstanceOf[js.Any], IsOpen = IsOpen.asInstanceOf[js.Any], MAPIOBJECT = MAPIOBJECT.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertyAccessor = PropertyAccessor.asInstanceOf[js.Any], RefreshQuotaDisplay = js.Any.fromFunction0(RefreshQuotaDisplay), Session = Session.asInstanceOf[js.Any], StoreID = StoreID.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Store_typekey")(OutlookDotStore_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
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
    def withCategories(value: Categories): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExchangeStoreType(value: OlExchangeStoreType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExchangeStoreType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDefaultFolder(value: OlDefaultFolders => Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDefaultFolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRootFolder(value: () => Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetRootFolder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRules(value: () => Rules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetRules")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSearchFolders(value: () => Folders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSearchFolders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSpecialFolder(value: OlSpecialFolders => Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSpecialFolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsCachedExchange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCachedExchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsConversationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsConversationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDataFileStore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDataFileStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInstantSearchEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsInstantSearchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAPIOBJECT(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAPIOBJECT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotStore_typekey(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.Store_typekey")(value.asInstanceOf[js.Any])
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
    def withRefreshQuotaDisplay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshQuotaDisplay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoreID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoreID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

