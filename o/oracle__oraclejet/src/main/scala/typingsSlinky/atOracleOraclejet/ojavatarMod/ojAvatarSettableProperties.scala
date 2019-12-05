package typingsSlinky.atOracleOraclejet.ojavatarMod

import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lg
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.md
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.sm
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.xl
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.xs
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.xxl
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.xxs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojAvatarSettableProperties extends JetSettableProperties {
  var initials: String
  var size: xxs | xs | sm | md | lg | xl | xxl
  var src: String
}

object ojAvatarSettableProperties {
  @scala.inline
  def apply(initials: String, size: xxs | xs | sm | md | lg | xl | xxl, src: String): ojAvatarSettableProperties = {
    val __obj = js.Dynamic.literal(initials = initials.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojAvatarSettableProperties]
  }
}

