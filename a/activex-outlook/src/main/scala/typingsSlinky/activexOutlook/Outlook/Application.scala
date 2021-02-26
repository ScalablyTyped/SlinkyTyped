package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.activexOutlook.activexOutlookNumbers.`0`
import typingsSlinky.activexOutlook.activexOutlookNumbers.`11`
import typingsSlinky.activexOutlook.activexOutlookNumbers.`12`
import typingsSlinky.activexOutlook.activexOutlookNumbers.`1`
import typingsSlinky.activexOutlook.activexOutlookNumbers.`2`
import typingsSlinky.activexOutlook.activexOutlookNumbers.`3`
import typingsSlinky.activexOutlook.activexOutlookNumbers.`4`
import typingsSlinky.activexOutlook.activexOutlookNumbers.`5`
import typingsSlinky.activexOutlook.activexOutlookNumbers.`6`
import typingsSlinky.activexOutlook.activexOutlookNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends StObject {
  
  def ActiveExplorer(): Explorer = js.native
  
  def ActiveInspector(): Inspector = js.native
  
  def ActiveWindow(): js.Any = js.native
  
  def AdvancedSearch(Scope: String): Search = js.native
  def AdvancedSearch(
    Scope: String,
    Filter: js.UndefOr[scala.Nothing],
    SearchSubFolders: js.UndefOr[scala.Nothing],
    Tag: js.Any
  ): Search = js.native
  def AdvancedSearch(Scope: String, Filter: js.UndefOr[scala.Nothing], SearchSubFolders: js.Any): Search = js.native
  def AdvancedSearch(Scope: String, Filter: js.UndefOr[scala.Nothing], SearchSubFolders: js.Any, Tag: js.Any): Search = js.native
  def AdvancedSearch(Scope: String, Filter: js.Any): Search = js.native
  def AdvancedSearch(Scope: String, Filter: js.Any, SearchSubFolders: js.UndefOr[scala.Nothing], Tag: js.Any): Search = js.native
  def AdvancedSearch(Scope: String, Filter: js.Any, SearchSubFolders: js.Any): Search = js.native
  def AdvancedSearch(Scope: String, Filter: js.Any, SearchSubFolders: js.Any, Tag: js.Any): Search = js.native
  
  val AnswerWizard: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.AnswerWizard */ js.Any = js.native
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Assistance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.IAssistance */ js.Any = js.native
  
  val Assistant: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.Assistant */ js.Any = js.native
  
  val COMAddIns: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.COMAddIns */ js.Any = js.native
  
  val Class: OlObjectClass = js.native
  
  def CopyFile(FilePath: String, DestFolderPath: String): js.Any = js.native
  
  def CreateItemFromTemplate(TemplatePath: String): js.Any = js.native
  def CreateItemFromTemplate(TemplatePath: String, InFolder: js.Any): js.Any = js.native
  
  @JSName("CreateItem")
  def CreateItem_0(ItemType: `0`): MailItem = js.native
  @JSName("CreateItem")
  def CreateItem_1(ItemType: `1`): AppointmentItem = js.native
  @JSName("CreateItem")
  def CreateItem_11(ItemType: `11`): MobileItem = js.native
  @JSName("CreateItem")
  def CreateItem_12(ItemType: `12`): MobileItem = js.native
  @JSName("CreateItem")
  def CreateItem_2(ItemType: `2`): ContactItem = js.native
  @JSName("CreateItem")
  def CreateItem_3(ItemType: `3`): TaskItem = js.native
  @JSName("CreateItem")
  def CreateItem_4(ItemType: `4`): JournalItem = js.native
  @JSName("CreateItem")
  def CreateItem_5(ItemType: `5`): NoteItem = js.native
  @JSName("CreateItem")
  def CreateItem_6(ItemType: `6`): PostItem = js.native
  @JSName("CreateItem")
  def CreateItem_7(ItemType: `7`): DistListItem = js.native
  
  def CreateObject(ObjectName: String): js.Any = js.native
  
  val DefaultProfileName: String = js.native
  
  val Explorers: typingsSlinky.activexOutlook.Outlook.Explorers = js.native
  
  var FeatureInstall: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.MsoFeatureInstall */ js.Any = js.native
  
  def GetNamespace(Type: String): NameSpace = js.native
  
  def GetNewNickNames(pvar: js.Any): Unit = js.native
  
  def GetObjectReference(Item: js.Any, ReferenceType: OlReferenceType): js.Any = js.native
  
  val Inspectors: typingsSlinky.activexOutlook.Outlook.Inspectors = js.native
  
  def IsSearchSynchronous(LookInFolders: String): Boolean = js.native
  
  val IsTrusted: Boolean = js.native
  
  val LanguageSettings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.LanguageSettings */ js.Any = js.native
  
  val Name: String = js.native
  
  @JSName("Outlook.Application_typekey")
  var OutlookDotApplication_typekey: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Parent: js.Any = js.native
  
  val PickerDialog: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.PickerDialog */ js.Any = js.native
  
  val ProductCode: String = js.native
  
  def Quit(): Unit = js.native
  
  def RefreshFormRegionDefinition(RegionName: String): Unit = js.native
  
  val Reminders: typingsSlinky.activexOutlook.Outlook.Reminders = js.native
  
  val Session: NameSpace = js.native
  
  val TimeZones: typingsSlinky.activexOutlook.Outlook.TimeZones = js.native
  
  val Version: String = js.native
}
