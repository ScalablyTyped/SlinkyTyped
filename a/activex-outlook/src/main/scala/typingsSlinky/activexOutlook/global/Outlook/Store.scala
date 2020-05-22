package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlDefaultFolders
import typingsSlinky.activexOutlook.Outlook.OlExchangeStoreType
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.activexOutlook.Outlook.OlSpecialFolders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Store")
@js.native
class Store protected ()
  extends typingsSlinky.activexOutlook.Outlook.Store {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Categories: typingsSlinky.activexOutlook.Outlook.Categories = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val DisplayName: String = js.native
  /* CompleteClass */
  override val ExchangeStoreType: OlExchangeStoreType = js.native
  /* CompleteClass */
  override val FilePath: String = js.native
  /* CompleteClass */
  override val IsCachedExchange: Boolean = js.native
  /* CompleteClass */
  override val IsConversationEnabled: Boolean = js.native
  /* CompleteClass */
  override val IsDataFileStore: Boolean = js.native
  /* CompleteClass */
  override val IsInstantSearchEnabled: Boolean = js.native
  /* CompleteClass */
  override val IsOpen: Boolean = js.native
  /* CompleteClass */
  override val MAPIOBJECT: js.Any = js.native
  /* CompleteClass */
  @JSName("Outlook.Store_typekey")
  override var OutlookDotStore_typekey: typingsSlinky.activexOutlook.Outlook.Store = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val PropertyAccessor: typingsSlinky.activexOutlook.Outlook.PropertyAccessor = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override val StoreID: String = js.native
  /* CompleteClass */
  override def GetDefaultFolder(FolderType: OlDefaultFolders): typingsSlinky.activexOutlook.Outlook.Folder = js.native
  /* CompleteClass */
  override def GetRootFolder(): typingsSlinky.activexOutlook.Outlook.Folder = js.native
  /* CompleteClass */
  override def GetRules(): typingsSlinky.activexOutlook.Outlook.Rules = js.native
  /* CompleteClass */
  override def GetSearchFolders(): typingsSlinky.activexOutlook.Outlook.Folders = js.native
  /* CompleteClass */
  override def GetSpecialFolder(FolderType: OlSpecialFolders): typingsSlinky.activexOutlook.Outlook.Folder = js.native
  /* CompleteClass */
  override def RefreshQuotaDisplay(): Unit = js.native
}

