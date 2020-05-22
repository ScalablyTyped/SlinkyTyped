package typingsSlinky.rdflib.mod

import typingsSlinky.rdflib.nodeMod.default
import typingsSlinky.rdflib.typesMod.FromValueReturns
import typingsSlinky.rdflib.typesMod.ValueType
import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Node")
@js.native
abstract class Node protected () extends default {
  protected def this(value: String) = this()
}

/* static members */
@JSImport("rdflib", "Node")
@js.native
object Node extends js.Object {
  def fromValue[T /* <: FromValueReturns[_] */](value: ValueType): T = js.native
  def toJS(term: js.Any): js.Date | Number | String | Boolean | js.Object | (js.Array[js.Date | Number | String | Boolean | js.Object]) = js.native
}

