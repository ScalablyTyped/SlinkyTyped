package typingsSlinky.promiseMemoize.mod

import typingsSlinky.promiseMemoize.promiseMemoizeStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.promiseMemoize.promiseMemoizeStrings.simple
  - typingsSlinky.promiseMemoize.promiseMemoizeStrings.json
  - js.Function1[/ * args * / js.Array[js.Any], js.Any]
  - js.Array[
typingsSlinky.promiseMemoize.promiseMemoizeStrings.json | (js.Function1[/ * arg * / js.Any, js.Any])]
*/
trait KeyResolver extends js.Object

object KeyResolver {
  @scala.inline
  def simple: typingsSlinky.promiseMemoize.promiseMemoizeStrings.simple = "simple".asInstanceOf[typingsSlinky.promiseMemoize.promiseMemoizeStrings.simple]
  @scala.inline
  def json: typingsSlinky.promiseMemoize.promiseMemoizeStrings.json = "json".asInstanceOf[typingsSlinky.promiseMemoize.promiseMemoizeStrings.json]
  @scala.inline
  implicit def apply(value: js.Array[json | (js.Function1[/* arg */ js.Any, js.Any])]): KeyResolver = value.asInstanceOf[KeyResolver]
  @scala.inline
  implicit def apply(value: js.Function1[/* args */ js.Array[js.Any], js.Any]): KeyResolver = value.asInstanceOf[KeyResolver]
}

