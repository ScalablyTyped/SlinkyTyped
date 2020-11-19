package typingsSlinky.atom.mod

import org.scalajs.dom.raw.Node
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryCompatible[Element /* <: Node */] extends Iterable[Element] {
  
  var jquery: String = js.native
}
