package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.anon.ImageData
import typingsSlinky.chrome.chrome.declarativeContent.PageChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Declarative Content
////////////////////
/**
  * Use the chrome.declarativeContent API to take actions depending on the content of a page, without requiring permission to read the page's content.
  * Availability: Since Chrome 33.
  * Permissions:  "declarativeContent"
  */
object declarativeContent {
  
  @JSGlobal("chrome.declarativeContent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.declarativeContent.PageStateMatcher")
  @js.native
  class PageStateMatcher protected ()
    extends typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcher {
    def this(options: typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcherProperties) = this()
  }
  
  @JSGlobal("chrome.declarativeContent.PageStateMatcherProperties")
  @js.native
  class PageStateMatcherProperties ()
    extends typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcherProperties
  
  @JSGlobal("chrome.declarativeContent.SetIcon")
  @js.native
  class SetIcon ()
    extends typingsSlinky.chrome.chrome.declarativeContent.SetIcon {
    def this(options: ImageData) = this()
  }
  
  @JSGlobal("chrome.declarativeContent.ShowPageAction")
  @js.native
  class ShowPageAction ()
    extends typingsSlinky.chrome.chrome.declarativeContent.ShowPageAction
  
  @JSGlobal("chrome.declarativeContent.onPageChanged")
  @js.native
  def onPageChanged: PageChangedEvent = js.native
  @scala.inline
  def onPageChanged_=(x: PageChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPageChanged")(x.asInstanceOf[js.Any])
}
