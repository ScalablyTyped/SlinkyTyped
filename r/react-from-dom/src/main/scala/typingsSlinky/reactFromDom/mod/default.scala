package typingsSlinky.reactFromDom.mod

import org.scalajs.dom.raw.Node
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-from-dom", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(input: String): ReactElement | Node = js.native
  def apply(input: String, options: Options): ReactElement | Node = js.native
  def apply(input: Node): ReactElement | Node = js.native
  def apply(input: Node, options: Options): ReactElement | Node = js.native
}
