package typingsSlinky.parchment

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.Text
import typingsSlinky.parchment.registryMod.Scope
import typingsSlinky.parchment.textMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTextBlot extends Instantiable1[/* node */ Node, default] {
  var blotName: String = js.native
  var scope: Scope = js.native
  def create(value: String): Text = js.native
  def value(domNode: Text): String = js.native
}

