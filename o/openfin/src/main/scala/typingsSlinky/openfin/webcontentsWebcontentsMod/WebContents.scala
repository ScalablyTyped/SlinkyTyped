package typingsSlinky.openfin.webcontentsWebcontentsMod

import typingsSlinky.openfin.anon.EmitSynthFocused
import typingsSlinky.openfin.baseMod.EmitterBase
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.transportMod.default
import typingsSlinky.openfin.webcontentsMod.WebContentsEventMapping
import typingsSlinky.openfin.windowWindowMod.FindInPageOptions
import typingsSlinky.openfin.windowWindowMod.PrintOptions
import typingsSlinky.openfin.windowWindowMod.PrinterInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
