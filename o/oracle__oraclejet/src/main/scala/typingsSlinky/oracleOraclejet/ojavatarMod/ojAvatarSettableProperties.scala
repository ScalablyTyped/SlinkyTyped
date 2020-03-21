package typingsSlinky.oracleOraclejet.ojavatarMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lg
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.md
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.sm
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.xl
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.xs
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.xxl
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.xxs
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

