package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.devtools.inspectedWindow.EvalOptions
import typingsSlinky.chrome.chrome.devtools.inspectedWindow.EvaluationExceptionInfo
import typingsSlinky.chrome.chrome.devtools.inspectedWindow.ReloadOptions
import typingsSlinky.chrome.chrome.devtools.inspectedWindow.Resource
import typingsSlinky.chrome.chrome.devtools.inspectedWindow.ResourceAddedEvent
import typingsSlinky.chrome.chrome.devtools.inspectedWindow.ResourceContentCommittedEvent
import typingsSlinky.chrome.chrome.devtools.network.HARLog
import typingsSlinky.chrome.chrome.devtools.network.NavigatedEvent
import typingsSlinky.chrome.chrome.devtools.network.RequestFinishedEvent
import typingsSlinky.chrome.chrome.devtools.panels.ElementsPanel
import typingsSlinky.chrome.chrome.devtools.panels.ExtensionPanel
import typingsSlinky.chrome.chrome.devtools.panels.SourcesPanel
import typingsSlinky.chrome.chromeStrings.dark
import typingsSlinky.chrome.chromeStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.devtools")
@js.native
object devtools extends js.Object {
  
  ////////////////////
  // Dev Tools - Inspected Window
  ////////////////////
  /**
    * Use the chrome.devtools.inspectedWindow API to interact with the inspected window: obtain the tab ID for the inspected page, evaluate the code in the context of the inspected window, reload the page, or obtain the list of resources within the page.
    * Availability: Since Chrome 18.
    */
  @js.native
  object inspectedWindow extends js.Object {
    
    def eval[T](expression: String): Unit = js.native
    def eval[T](
      expression: String,
      callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
    ): Unit = js.native
    def eval[T](expression: String, options: EvalOptions): Unit = js.native
    def eval[T](
      expression: String,
      options: EvalOptions,
      callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
    ): Unit = js.native
    
    def getResources(callback: js.Function1[/* resources */ js.Array[Resource], Unit]): Unit = js.native
    
    var onResourceAdded: ResourceAddedEvent = js.native
    
    var onResourceContentCommitted: ResourceContentCommittedEvent = js.native
    
    def reload(reloadOptions: ReloadOptions): Unit = js.native
    
    var tabId: Double = js.native
  }
  
  ////////////////////
  // Dev Tools - Network
  ////////////////////
  /**
    * Use the chrome.devtools.network API to retrieve the information about network requests displayed by the Developer Tools in the Network panel.
    * Availability: Since Chrome 18.
    */
  @js.native
  object network extends js.Object {
    
    def getHAR(callback: js.Function1[/* harLog */ HARLog, Unit]): Unit = js.native
    
    var onNavigated: NavigatedEvent = js.native
    
    var onRequestFinished: RequestFinishedEvent = js.native
  }
  
  ////////////////////
  // Dev Tools - Panels
  ////////////////////
  /**
    * Use the chrome.devtools.panels API to integrate your extension into Developer Tools window UI: create your own panels, access existing panels, and add sidebars.
    * Availability: Since Chrome 18.
    */
  @js.native
  object panels extends js.Object {
    
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
}
