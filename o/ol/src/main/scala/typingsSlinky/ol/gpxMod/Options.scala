package typingsSlinky.ol.gpxMod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var readExtensions: js.UndefOr[
    js.Function2[
      /* p0 */ typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default], 
      /* p1 */ Node, 
      Unit
    ]
  ] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadExtensions(
      value: (/* p0 */ typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default], /* p1 */ Node) => Unit
    ): Self = {
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

