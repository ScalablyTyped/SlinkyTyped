package typingsSlinky.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialPropertiesListobject
  extends /* key */ StringDictionary[js.Any]
     with InitialProperties {
  var qListobjectDef: ListobjectDef = js.native
}

object InitialPropertiesListobject {
  @scala.inline
  def apply(qListobjectDef: ListobjectDef): InitialPropertiesListobject = {
    val __obj = js.Dynamic.literal(qListobjectDef = qListobjectDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialPropertiesListobject]
  }
  @scala.inline
  implicit class InitialPropertiesListobjectOps[Self <: InitialPropertiesListobject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQListobjectDef(value: ListobjectDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qListobjectDef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

