package typingsSlinky.nodeCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* err */ js.Any, /* data */ js.UndefOr[T], scala.Unit]
  type Data = org.scalablytyped.runtime.StringDictionary[typingsSlinky.nodeCache.mod.WrappedValue[js.Any]]
}
