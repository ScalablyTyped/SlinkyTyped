package typingsSlinky.openfin.utilsMod

import org.scalajs.dom.raw.ClientRect
import typingsSlinky.openfin.shapesMod.Bounds
import typingsSlinky.openfin.v2MainMod.View
import typingsSlinky.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/utils", "setViewBoundsByRect")
@js.native
object setViewBoundsByRect extends js.Object {
  def apply(rect: Bounds, ofView: View): js.Promise[View] = js.native
  def apply(rect: ClientRect, ofView: View): js.Promise[View] = js.native
  def apply(rect: DOMRect, ofView: View): js.Promise[View] = js.native
}

