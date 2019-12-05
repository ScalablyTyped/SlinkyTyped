package typingsSlinky.parse5DashSaxDashParser.parse5DashSaxDashParserMod

import typingsSlinky.parse5.parse5Mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndTagToken extends js.Object {
  /**
    * End tag source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.undefined
  /**
    * Tag name.
    */
  var tagName: String
}

object EndTagToken {
  @scala.inline
  def apply(tagName: String, sourceCodeLocation: Location = null): EndTagToken = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndTagToken]
  }
}

