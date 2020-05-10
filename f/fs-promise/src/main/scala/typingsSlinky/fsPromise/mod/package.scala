package typingsSlinky.fsPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JsonReplacer = typingsSlinky.fsPromise.mod.JsonReplacerArray | typingsSlinky.fsPromise.mod.JsonReplacerFunction
  type JsonReplacerArray = js.Array[scala.Double | java.lang.String]
  type JsonReplacerFunction = js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]
}
