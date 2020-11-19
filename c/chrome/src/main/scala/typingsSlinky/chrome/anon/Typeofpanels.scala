package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.devtools.inspectedWindow.Resource
import typingsSlinky.chrome.chrome.devtools.panels.ElementsPanel
import typingsSlinky.chrome.chrome.devtools.panels.ExtensionPanel
import typingsSlinky.chrome.chrome.devtools.panels.SourcesPanel
import typingsSlinky.chrome.chromeStrings.dark
import typingsSlinky.chrome.chromeStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpanels extends js.Object {
  
  def create(title: String, iconPath: String, pagePath: String): Unit = js.native
  def create(
    title: String,
    iconPath: String,
    pagePath: String,
    callback: js.Function1[/* panel */ ExtensionPanel, Unit]
  ): Unit = js.native
  
  var elements: ElementsPanel = js.native
  
  def openResource(url: String, lineNumber: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def setOpenResourceHandler(): Unit = js.native
  def setOpenResourceHandler(callback: js.Function1[/* resource */ Resource, Unit]): Unit = js.native
  
  var sources: SourcesPanel = js.native
  
  var themeName: default | dark = js.native
}
