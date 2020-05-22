package typingsSlinky.ol.gpxMod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var readExtensions: js.UndefOr[
    js.Function2[
      /* p0 */ typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default], 
      /* p1 */ Node, 
      Unit
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    readExtensions: (/* p0 */ typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default], /* p1 */ Node) => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (readExtensions != null) __obj.updateDynamic("readExtensions")(js.Any.fromFunction2(readExtensions))
    __obj.asInstanceOf[Options]
  }
}

