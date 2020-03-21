package typingsSlinky.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArrayOrObject = js.Array[js.Any] | org.scalablytyped.runtime.StringDictionary[js.Any]
  type EmptyCallback = js.Function1[/* err */ js.Error, scala.Unit]
  type ValueCallback[T] = js.Function2[/* err */ js.Error, /* val */ T, scala.Unit]
}
