package typingsSlinky.katex.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("katex", "render")
@js.native
object render extends js.Object {
  def apply(tex: String, element: HTMLElement): Unit = js.native
  def apply(tex: String, element: HTMLElement, options: KatexOptions): Unit = js.native
}

