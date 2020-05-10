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

@js.native
trait ojAvatarSettableProperties extends JetSettableProperties {
  var initials: String = js.native
  var size: xxs | xs | sm | md | lg | xl | xxl = js.native
  var src: String = js.native
}

object ojAvatarSettableProperties {
  @scala.inline
  def apply(initials: String, size: xxs | xs | sm | md | lg | xl | xxl, src: String): ojAvatarSettableProperties = {
    val __obj = js.Dynamic.literal(initials = initials.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojAvatarSettableProperties]
  }
  @scala.inline
  implicit class ojAvatarSettablePropertiesOps[Self <: ojAvatarSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: xxs | xs | sm | md | lg | xl | xxl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

