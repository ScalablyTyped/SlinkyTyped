package typingsSlinky.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highlight.js", "highlight")
@js.native
object highlight extends js.Object {
  
  def apply(name: String, value: String): IHighlightResult = js.native
  def apply(
    name: String,
    value: String,
    ignore_illegals: js.UndefOr[scala.Nothing],
    continuation: ICompiledMode
  ): IHighlightResult = js.native
  def apply(name: String, value: String, ignore_illegals: Boolean): IHighlightResult = js.native
  def apply(name: String, value: String, ignore_illegals: Boolean, continuation: ICompiledMode): IHighlightResult = js.native
}
