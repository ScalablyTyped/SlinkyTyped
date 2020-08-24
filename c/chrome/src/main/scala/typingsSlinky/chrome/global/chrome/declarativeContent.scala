package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.anon.ImageData
import typingsSlinky.chrome.chrome.declarativeContent.PageChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Declarative Content
////////////////////
/**
  * Use the chrome.declarativeContent API to take actions depending on the content of a page, without requiring permission to read the page's content.
  * Availability: Since Chrome 33.
  * Permissions:  "declarativeContent"
  */
@JSGlobal("chrome.declarativeContent")
@js.native
object declarativeContent extends js.Object {
  @js.native
  class PageStateMatcher protected ()
    extends typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcher {
    def this(options: typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcherProperties) = this()
  }
  
  @js.native
  class PageStateMatcherProperties ()
    extends typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcherProperties
  
  @js.native
  class SetIcon ()
    extends typingsSlinky.chrome.chrome.declarativeContent.SetIcon {
    def this(options: ImageData) = this()
  }
  
  @js.native
  class ShowPageAction ()
    extends typingsSlinky.chrome.chrome.declarativeContent.ShowPageAction
  
  var onPageChanged: PageChangedEvent = js.native
}

