package typingsSlinky.firefoxWebextBrowser.browser.extensionTypes

import typingsSlinky.firefoxWebextBrowser.anon.Code
import typingsSlinky.firefoxWebextBrowser.anon.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.anon.File
  - typingsSlinky.firefoxWebextBrowser.anon.Code
*/
trait ExtensionFileOrCode extends js.Object

object ExtensionFileOrCode {
  @scala.inline
  implicit def apply(value: Code): ExtensionFileOrCode = value.asInstanceOf[ExtensionFileOrCode]
  @scala.inline
  implicit def apply(value: File): ExtensionFileOrCode = value.asInstanceOf[ExtensionFileOrCode]
}

