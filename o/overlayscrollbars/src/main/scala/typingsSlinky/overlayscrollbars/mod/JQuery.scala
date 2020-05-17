package typingsSlinky.overlayscrollbars.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends Coordinates {
  def overlayScrollbars(): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def overlayScrollbars(filter: String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def overlayScrollbars(filter: js.Function2[/* element */ Element, /* instance */ OverlayScrollbars, Boolean]): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def overlayScrollbars(options: Options): JQuery = js.native
  def overlayScrollbars(options: Options, extensions: Extensions): JQuery = js.native
}

