package typingsSlinky.ldapjs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchEntryRaw
  extends /* p */ StringDictionary[String | Buffer | js.Array[Buffer]] {
  var controls: js.Array[Control] = js.native
  var dn: String = js.native
}

object SearchEntryRaw {
  @scala.inline
  def apply(controls: js.Array[Control], dn: String): SearchEntryRaw = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], dn = dn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchEntryRaw]
  }
  @scala.inline
  implicit class SearchEntryRawOps[Self <: SearchEntryRaw] (val x: Self) extends AnyVal {
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

