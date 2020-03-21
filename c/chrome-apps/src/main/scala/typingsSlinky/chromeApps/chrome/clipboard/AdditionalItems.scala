package typingsSlinky.chromeApps.chrome.clipboard

import typingsSlinky.chromeApps.AnonTEXTHTML
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.textHtml
import typingsSlinky.chromeApps.chromeAppsStrings.textPlain
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalItems extends js.Object {
  /**
    * Content of the additional data item.
    * Either the plain text string if *type* is 'textPlain' or
    * markup string if *type* is 'textHtml'.
    * The data can not exceed 2MB.
    */
  var data: String
  /**
    * Type of the additional data item.
    * @see DataItemType
    */
  var `type`: ToStringLiteral[AnonTEXTHTML, String, Exclude[String, textPlain | textHtml]]
}

object AdditionalItems {
  @scala.inline
  def apply(data: String, `type`: ToStringLiteral[AnonTEXTHTML, String, Exclude[String, textPlain | textHtml]]): AdditionalItems = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalItems]
  }
}

