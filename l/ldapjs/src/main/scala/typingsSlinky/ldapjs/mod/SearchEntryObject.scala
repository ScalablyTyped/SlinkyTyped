package typingsSlinky.ldapjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchEntryObject
  extends /* p */ StringDictionary[String | js.Array[String]] {
  var controls: js.Array[Control] = js.native
  var dn: String = js.native
}

object SearchEntryObject {
  @scala.inline
  def apply(controls: js.Array[Control], dn: String): SearchEntryObject = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], dn = dn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchEntryObject]
  }
  @scala.inline
  implicit class SearchEntryObjectOps[Self <: SearchEntryObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControls(value: js.Array[Control]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

