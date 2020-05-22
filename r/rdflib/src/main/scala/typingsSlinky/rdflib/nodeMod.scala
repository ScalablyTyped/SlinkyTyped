package typingsSlinky.rdflib

import typingsSlinky.rdflib.typesMod.FromValueReturns
import typingsSlinky.rdflib.typesMod.ValueType
import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  @js.native
  abstract class default protected ()
    extends typingsSlinky.rdflib.nodeInternalMod.default {
    protected def this(value: String) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def fromValue[T /* <: FromValueReturns[_] */](value: ValueType): T = js.native
    def toJS(term: js.Any): js.Date | Number | String | Boolean | js.Object | (js.Array[js.Date | Number | String | Boolean | js.Object]) = js.native
  }
  
}

