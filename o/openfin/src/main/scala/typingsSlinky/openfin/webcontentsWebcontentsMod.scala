package typingsSlinky.openfin

import typingsSlinky.openfin.anon.EmitSynthFocused
import typingsSlinky.openfin.baseMod.EmitterBase
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.transportMod.default
import typingsSlinky.openfin.webcontentsMod.WebContentsEventMapping
import typingsSlinky.openfin.windowWindowMod.Area
import typingsSlinky.openfin.windowWindowMod.FindInPageOptions
import typingsSlinky.openfin.windowWindowMod.PrintOptions
import typingsSlinky.openfin.windowWindowMod.PrinterInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webcontentsWebcontentsMod {
  
  @JSImport("openfin/_v2/api/webcontents/webcontents", "WebContents")
  @js.native
  class WebContents[T /* <: WebContentsEventMapping[String, String] */] protected () extends EmitterBase[T] {
    def this(wire: default, identity: Identity, entityType: String) = this()
    
    def capturePage(): js.Promise[String] = js.native
    def capturePage(options: CapturePageOptions): js.Promise[String] = js.native
    
    var entityType: String = js.native
    
    def executeJavaScript(code: String): js.Promise[Unit] = js.native
    
    def findInPage(searchTerm: String): js.Promise[Unit] = js.native
    def findInPage(searchTerm: String, options: FindInPageOptions): js.Promise[Unit] = js.native
    
    def focus(): js.Promise[Unit] = js.native
    def focus(hasEmitSynthFocused: EmitSynthFocused): js.Promise[Unit] = js.native
    
    def getPrinters(): js.Promise[PrinterInfo] = js.native
    
    def getZoomLevel(): js.Promise[Double] = js.native
    
    def navigate(url: String): js.Promise[Unit] = js.native
    
    def navigateBack(): js.Promise[Unit] = js.native
    
    def navigateForward(): js.Promise[Unit] = js.native
    
    def print(): js.Promise[Unit] = js.native
    def print(options: PrintOptions): js.Promise[Unit] = js.native
    
    def reload(): js.Promise[Unit] = js.native
    def reload(ignoreCache: Boolean): js.Promise[Unit] = js.native
    
    def setZoomLevel(level: Double): js.Promise[Unit] = js.native
    
    def showDeveloperTools(): js.Promise[Unit] = js.native
    
    def stopFindInPage(action: String): js.Promise[Unit] = js.native
    
    def stopNavigation(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait CapturePageOptions extends StObject {
    
    var area: js.UndefOr[Area] = js.native
    
    var format: js.UndefOr[ImageFormat] = js.native
    
    var quality: js.UndefOr[Double] = js.native
  }
  object CapturePageOptions {
    
    @scala.inline
    def apply(): CapturePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CapturePageOptions]
    }
    
    @scala.inline
    implicit class CapturePageOptionsMutableBuilder[Self <: CapturePageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArea(value: Area): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      @scala.inline
      def setFormat(value: ImageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.openfin.openfinStrings.bmp
    - typingsSlinky.openfin.openfinStrings.jpg
    - typingsSlinky.openfin.openfinStrings.png
  */
  trait ImageFormat extends StObject
  object ImageFormat {
    
    @scala.inline
    def bmp: typingsSlinky.openfin.openfinStrings.bmp = "bmp".asInstanceOf[typingsSlinky.openfin.openfinStrings.bmp]
    
    @scala.inline
    def jpg: typingsSlinky.openfin.openfinStrings.jpg = "jpg".asInstanceOf[typingsSlinky.openfin.openfinStrings.jpg]
    
    @scala.inline
    def png: typingsSlinky.openfin.openfinStrings.png = "png".asInstanceOf[typingsSlinky.openfin.openfinStrings.png]
  }
}
