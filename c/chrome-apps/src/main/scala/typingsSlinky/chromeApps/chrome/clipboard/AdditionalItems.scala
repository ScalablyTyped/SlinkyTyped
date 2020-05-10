package typingsSlinky.chromeApps.chrome.clipboard

import typingsSlinky.chromeApps.AnonTEXTHTML
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.TEXT_HTML
import typingsSlinky.chromeApps.chromeAppsStrings.TEXT_PLAIN
import typingsSlinky.chromeApps.chromeAppsStrings.textHtml
import typingsSlinky.chromeApps.chromeAppsStrings.textPlain
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalItems extends js.Object {
  /**
    * Content of the additional data item.
    * Either the plain text string if *type* is 'textPlain' or
    * markup string if *type* is 'textHtml'.
    * The data can not exceed 2MB.
    */
  var data: String = js.native
  /**
    * Type of the additional data item.
    * @see DataItemType
    */
  var `type`: ToStringLiteral[
    AnonTEXTHTML, 
    /* keyof chrome-apps.AnonTEXTHTML */ TEXT_PLAIN | TEXT_HTML, 
    Exclude[/* keyof chrome-apps.AnonTEXTHTML */ TEXT_PLAIN | TEXT_HTML, textPlain | textHtml]
  ] = js.native
}

object AdditionalItems {
  @scala.inline
  def apply(
    data: String,
    `type`: ToStringLiteral[
      AnonTEXTHTML, 
      /* keyof chrome-apps.AnonTEXTHTML */ TEXT_PLAIN | TEXT_HTML, 
      Exclude[/* keyof chrome-apps.AnonTEXTHTML */ TEXT_PLAIN | TEXT_HTML, textPlain | textHtml]
    ]
  ): AdditionalItems = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalItems]
  }
  @scala.inline
  implicit class AdditionalItemsOps[Self <: AdditionalItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(
      value: ToStringLiteral[
          AnonTEXTHTML, 
          /* keyof chrome-apps.AnonTEXTHTML */ TEXT_PLAIN | TEXT_HTML, 
          Exclude[/* keyof chrome-apps.AnonTEXTHTML */ TEXT_PLAIN | TEXT_HTML, textPlain | textHtml]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

