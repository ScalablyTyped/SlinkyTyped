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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInitials(value: String): Self = this.set("initials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: xxs | xs | sm | md | lg | xl | xxl): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
  }
}
