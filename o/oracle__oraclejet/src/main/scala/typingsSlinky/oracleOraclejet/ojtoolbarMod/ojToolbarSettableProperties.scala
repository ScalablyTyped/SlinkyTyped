package typingsSlinky.oracleOraclejet.ojtoolbarMod

import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.full
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.half
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withChroming(value: full | half | outlined): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chroming")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

