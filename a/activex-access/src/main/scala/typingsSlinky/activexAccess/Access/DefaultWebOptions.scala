package typingsSlinky.activexAccess.Access

import typingsSlinky.activexOffice.Office.MsoEncoding
import typingsSlinky.activexOffice.Office.MsoTargetBrowser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultWebOptions extends StObject {
  
  @JSName("Access.DefaultWebOptions_typekey")
  var AccessDotDefaultWebOptions_typekey: DefaultWebOptions = js.native
  
  var AlwaysSaveInDefaultEncoding: Boolean = js.native
  
  val Application: typingsSlinky.activexAccess.Access.Application = js.native
  
  var CheckIfOfficeIsHTMLEditor: Boolean = js.native
  
  var DownloadComponents: Boolean = js.native
  
  var Encoding: MsoEncoding = js.native
  
  val FolderSuffix: String = js.native
  
  var FollowedHyperlinkColor: AcColorIndex = js.native
  
  var HyperlinkColor: AcColorIndex = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var LocationOfComponents: String = js.native
  
  var OrganizeInFolder: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var TargetBrowser: MsoTargetBrowser = js.native
  
  var UnderlineHyperlinks: Boolean = js.native
  
  var UseLongFileNames: Boolean = js.native
}
object DefaultWebOptions {
  
  @scala.inline
  def apply(
    AccessDotDefaultWebOptions_typekey: DefaultWebOptions,
    AlwaysSaveInDefaultEncoding: Boolean,
    Application: Application,
    CheckIfOfficeIsHTMLEditor: Boolean,
    DownloadComponents: Boolean,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    FollowedHyperlinkColor: AcColorIndex,
    HyperlinkColor: AcColorIndex,
    IsMemberSafe: Double => Boolean,
    LocationOfComponents: String,
    OrganizeInFolder: Boolean,
    Parent: js.Any,
    TargetBrowser: MsoTargetBrowser,
    UnderlineHyperlinks: Boolean,
    UseLongFileNames: Boolean
  ): DefaultWebOptions = {
    val __obj = js.Dynamic.literal(AlwaysSaveInDefaultEncoding = AlwaysSaveInDefaultEncoding.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CheckIfOfficeIsHTMLEditor = CheckIfOfficeIsHTMLEditor.asInstanceOf[js.Any], DownloadComponents = DownloadComponents.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], FollowedHyperlinkColor = FollowedHyperlinkColor.asInstanceOf[js.Any], HyperlinkColor = HyperlinkColor.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), LocationOfComponents = LocationOfComponents.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UnderlineHyperlinks = UnderlineHyperlinks.asInstanceOf[js.Any], UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.DefaultWebOptions_typekey")(AccessDotDefaultWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultWebOptions]
  }
  
  @scala.inline
  implicit class DefaultWebOptionsMutableBuilder[Self <: DefaultWebOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotDefaultWebOptions_typekey(value: DefaultWebOptions): Self = StObject.set(x, "Access.DefaultWebOptions_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysSaveInDefaultEncoding(value: Boolean): Self = StObject.set(x, "AlwaysSaveInDefaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIfOfficeIsHTMLEditor(value: Boolean): Self = StObject.set(x, "CheckIfOfficeIsHTMLEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadComponents(value: Boolean): Self = StObject.set(x, "DownloadComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: MsoEncoding): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderSuffix(value: String): Self = StObject.set(x, "FolderSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowedHyperlinkColor(value: AcColorIndex): Self = StObject.set(x, "FollowedHyperlinkColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinkColor(value: AcColorIndex): Self = StObject.set(x, "HyperlinkColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocationOfComponents(value: String): Self = StObject.set(x, "LocationOfComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizeInFolder(value: Boolean): Self = StObject.set(x, "OrganizeInFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBrowser(value: MsoTargetBrowser): Self = StObject.set(x, "TargetBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineHyperlinks(value: Boolean): Self = StObject.set(x, "UnderlineHyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLongFileNames(value: Boolean): Self = StObject.set(x, "UseLongFileNames", value.asInstanceOf[js.Any])
  }
}
