package typingsSlinky.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rethinkdb.mod.Expression[U]
  - js.Array[typingsSlinky.rethinkdb.mod.Expression[U]]
  - js.Function1[
/ * doc * / typingsSlinky.rethinkdb.mod.Expression[js.Any], 
typingsSlinky.rethinkdb.mod.Expression[U] | js.Array[typingsSlinky.rethinkdb.mod.Expression[U]]]
*/
trait IndexFunction[U] extends js.Object

object IndexFunction {
  @scala.inline
  implicit def apply[U](value: js.Array[Expression[U]]): IndexFunction[U] = value.asInstanceOf[IndexFunction[U]]
  @scala.inline
  implicit def apply[U](value: Expression[U]): IndexFunction[U] = value.asInstanceOf[IndexFunction[U]]
  @scala.inline
  implicit def apply[U](value: js.Function1[/* doc */ Expression[js.Any], Expression[U] | js.Array[Expression[U]]]): IndexFunction[U] = value.asInstanceOf[IndexFunction[U]]
}

