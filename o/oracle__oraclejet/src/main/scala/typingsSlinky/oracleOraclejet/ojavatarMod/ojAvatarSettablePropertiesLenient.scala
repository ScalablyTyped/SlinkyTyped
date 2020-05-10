package typingsSlinky.oracleOraclejet.ojavatarMod

import org.scalablytyped.runtime.StringDictionary
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojavatar.ojAvatarSettableProperties> */
@js.native
trait ojAvatarSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var initials: js.UndefOr[String] = js.native
  var size: js.UndefOr[xxs | xs | sm | md | lg | xl | xxl] = js.native
  var src: js.UndefOr[String] = js.native
}

object ojAvatarSettablePropertiesLenient {
  @scala.inline
  def apply(): ojAvatarSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojAvatarSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojAvatarSettablePropertiesLenientOps[Self <: ojAvatarSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def withoutInitials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initials")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: xxs | xs | sm | md | lg | xl | xxl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
  }
  
}

