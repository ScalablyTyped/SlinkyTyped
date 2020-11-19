package typingsSlinky.pendoIoBrowser.pendo

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.pendoIoBrowser.anon.Steps
import typingsSlinky.pendoIoBrowser.anon.Until
import typingsSlinky.pendoIoBrowser.pendoIoBrowserBooleans.`false`
import typingsSlinky.pendoIoBrowser.pendoIoBrowserBooleans.`true`
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.No
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.Yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pendo extends js.Object {
  
  var debugging: Debugging = js.native
  
  def disableDebugging(): Unit = js.native
  
  def dom(input: js.Any): HTMLElement = js.native
  
  // Debugging
  def enableDebugging(): Unit = js.native
  
  // Events
  var events: Events = js.native
  
  def findGuideById(id: String): Guide | Unit = js.native
  
  // Guides and Guide Center
  def findGuideByName(name: String): Guide | Unit = js.native
  
  def flushNow(): js.Promise[_] = js.native
  
  def getAccountId(): String = js.native
  
  def getCurrentUrl(): String = js.native
  
  def getVersion(): String = js.native
  
  def getVisitorId(): String = js.native
  
  def identify(identity: Identity): Unit = js.native
  def identify(visitorId: String): Unit = js.native
  def identify(visitorId: String, accountId: String): Unit = js.native
  
  // Initialization and Identification
  def initialize(): Unit = js.native
  def initialize(options: InitOptions): Unit = js.native
  
  def isDebuggingEnabled(): Yes | No = js.native
  @JSName("isDebuggingEnabled")
  def isDebuggingEnabled_false(coerce: `false`): Yes | No = js.native
  @JSName("isDebuggingEnabled")
  def isDebuggingEnabled_true(coerce: `true`): Boolean = js.native
  
  def isReady(): Boolean = js.native
  
  // Troubleshooting
  def loadGuides(): Unit = js.native
  
  // Guide Events
  def onGuideAdvanced(): Unit = js.native
  def onGuideAdvanced(steps: Steps): Unit = js.native
  def onGuideAdvanced(step: GuideStep): Unit = js.native
  
  def onGuideDismissed(): Unit = js.native
  def onGuideDismissed(step: GuideStep): Unit = js.native
  def onGuideDismissed(until: Until): Unit = js.native
  
  def onGuidePrevious(): Unit = js.native
  def onGuidePrevious(step: GuideStep): Unit = js.native
  
  def removeLauncher(): Unit = js.native
  
  def showGuideById(id: String): Unit = js.native
  
  def showGuideByName(name: String): Unit = js.native
  
  def startGuides(): Unit = js.native
  
  def stopGuides(): Unit = js.native
  
  def toggleLauncher(): Unit = js.native
  
  def track(trackType: String): Unit = js.native
  def track(trackType: String, metadata: Metadata): Unit = js.native
  
  def updateOptions(options: Identity): Unit = js.native
  
  // Other
  def validateInstall(): Unit = js.native
}
