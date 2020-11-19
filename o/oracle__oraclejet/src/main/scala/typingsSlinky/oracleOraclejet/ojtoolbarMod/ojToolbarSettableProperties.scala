package typingsSlinky.oracleOraclejet.ojtoolbarMod

import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.full
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.half
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojToolbarSettableProperties extends baseComponentSettableProperties {
  
  var chroming: full | half | outlined = js.native
}
object ojToolbarSettableProperties {
  
  @scala.inline
  def apply(chroming: full | half | outlined): ojToolbarSettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojToolbarSettableProperties]
  }
  
  @scala.inline
  implicit class ojToolbarSettablePropertiesOps[Self <: ojToolbarSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setChroming(value: full | half | outlined): Self = this.set("chroming", value.asInstanceOf[js.Any])
  }
}
