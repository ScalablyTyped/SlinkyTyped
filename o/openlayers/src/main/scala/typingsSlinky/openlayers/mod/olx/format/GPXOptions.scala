package typingsSlinky.openlayers.mod.olx.format

import org.scalajs.dom.raw.Node
import typingsSlinky.openlayers.mod.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPXOptions extends js.Object {
  var readExtensions: js.UndefOr[js.Function2[/* feature */ Feature, /* node */ Node, _]] = js.native
}

object GPXOptions {
  @scala.inline
  def apply(): GPXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPXOptions]
  }
  @scala.inline
  implicit class GPXOptionsOps[Self <: GPXOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadExtensions(value: (/* feature */ Feature, /* node */ Node) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readExtensions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReadExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readExtensions")(js.undefined)
        ret
    }
  }
  
}

