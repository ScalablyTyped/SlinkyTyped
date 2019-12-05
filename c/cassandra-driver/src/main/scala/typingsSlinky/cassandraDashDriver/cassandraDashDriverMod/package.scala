package typingsSlinky.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cassandraDashDriverMod {
  import org.scalablytyped.runtime.StringDictionary

  type ArrayOrObject = js.Array[js.Any] | StringDictionary[js.Any]
  type EmptyCallback = js.Function1[/* err */ js.Error, Unit]
  type ValueCallback[T] = js.Function2[/* err */ js.Error, /* val */ T, Unit]
}
