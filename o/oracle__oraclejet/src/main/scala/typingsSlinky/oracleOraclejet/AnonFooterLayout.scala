package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings._empty
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.image
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFooterLayout extends js.Object {
  var footerLayout: _empty | now
  var showOn: focus | image
  var timeIncrement: String
}

object AnonFooterLayout {
  @scala.inline
  def apply(footerLayout: _empty | now, showOn: focus | image, timeIncrement: String): AnonFooterLayout = {
    val __obj = js.Dynamic.literal(footerLayout = footerLayout.asInstanceOf[js.Any], showOn = showOn.asInstanceOf[js.Any], timeIncrement = timeIncrement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFooterLayout]
  }
}

