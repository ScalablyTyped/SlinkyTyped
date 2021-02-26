package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoEncoding
import typingsSlinky.activexOffice.Office.MsoScreenSize
import typingsSlinky.activexOffice.Office.MsoTargetBrowser
import typingsSlinky.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebOptions extends StObject {
  
  var AllowPNG: MsoTriState = js.native
  
  var Encoding: MsoEncoding = js.native
  
  val FolderSuffix: String = js.native
  
  var FrameColors: PpFrameColors = js.native
  
  var HTMLVersion: PpHTMLVersion = js.native
  
  var IncludeNavigation: MsoTriState = js.native
  
  var OrganizeInFolder: MsoTriState = js.native
  
  @JSName("PowerPoint.WebOptions_typekey")
  var PowerPointDotWebOptions_typekey: WebOptions = js.native
  
  var RelyOnVML: MsoTriState = js.native
  
  var ResizeGraphics: MsoTriState = js.native
  
  var ScreenSize: MsoScreenSize = js.native
  
  var ShowSlideAnimation: MsoTriState = js.native
  
  var TargetBrowser: MsoTargetBrowser = js.native
  
  def UseDefaultFolderSuffix(): Unit = js.native
  
  var UseLongFileNames: MsoTriState = js.native
}
object WebOptions {
  
  @scala.inline
  def apply(
    AllowPNG: MsoTriState,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    FrameColors: PpFrameColors,
    HTMLVersion: PpHTMLVersion,
    IncludeNavigation: MsoTriState,
    OrganizeInFolder: MsoTriState,
    PowerPointDotWebOptions_typekey: WebOptions,
    RelyOnVML: MsoTriState,
    ResizeGraphics: MsoTriState,
    ScreenSize: MsoScreenSize,
    ShowSlideAnimation: MsoTriState,
    TargetBrowser: MsoTargetBrowser,
    UseDefaultFolderSuffix: () => Unit,
    UseLongFileNames: MsoTriState
  ): WebOptions = {
    val __obj = js.Dynamic.literal(AllowPNG = AllowPNG.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], FrameColors = FrameColors.asInstanceOf[js.Any], HTMLVersion = HTMLVersion.asInstanceOf[js.Any], IncludeNavigation = IncludeNavigation.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], RelyOnVML = RelyOnVML.asInstanceOf[js.Any], ResizeGraphics = ResizeGraphics.asInstanceOf[js.Any], ScreenSize = ScreenSize.asInstanceOf[js.Any], ShowSlideAnimation = ShowSlideAnimation.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UseDefaultFolderSuffix = js.Any.fromFunction0(UseDefaultFolderSuffix), UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.WebOptions_typekey")(PowerPointDotWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebOptions]
  }
  
  @scala.inline
  implicit class WebOptionsMutableBuilder[Self <: WebOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPNG(value: MsoTriState): Self = StObject.set(x, "AllowPNG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: MsoEncoding): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderSuffix(value: String): Self = StObject.set(x, "FolderSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameColors(value: PpFrameColors): Self = StObject.set(x, "FrameColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLVersion(value: PpHTMLVersion): Self = StObject.set(x, "HTMLVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNavigation(value: MsoTriState): Self = StObject.set(x, "IncludeNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizeInFolder(value: MsoTriState): Self = StObject.set(x, "OrganizeInFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotWebOptions_typekey(value: WebOptions): Self = StObject.set(x, "PowerPoint.WebOptions_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelyOnVML(value: MsoTriState): Self = StObject.set(x, "RelyOnVML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeGraphics(value: MsoTriState): Self = StObject.set(x, "ResizeGraphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenSize(value: MsoScreenSize): Self = StObject.set(x, "ScreenSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSlideAnimation(value: MsoTriState): Self = StObject.set(x, "ShowSlideAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBrowser(value: MsoTargetBrowser): Self = StObject.set(x, "TargetBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultFolderSuffix(value: () => Unit): Self = StObject.set(x, "UseDefaultFolderSuffix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUseLongFileNames(value: MsoTriState): Self = StObject.set(x, "UseLongFileNames", value.asInstanceOf[js.Any])
  }
}
