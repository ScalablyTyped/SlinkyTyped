package typingsSlinky.openfin.utilsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.openfin.anon.Height
import typingsSlinky.openfin.anon.PartialBounds
import typingsSlinky.openfin.anon.ScreenX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/utils", "getOutOfWindowDropBounds")
@js.native
object getOutOfWindowDropBounds extends js.Object {
  def apply(e: ScreenX, container: HTMLElement, dimensions: Height): PartialBounds = js.native
}

