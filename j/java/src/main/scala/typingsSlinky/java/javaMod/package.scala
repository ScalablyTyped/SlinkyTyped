package typingsSlinky.java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object javaMod {
  import org.scalablytyped.runtime.StringDictionary

  type Callback[T] = js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], Unit]
  type Promisify = js.Function2[/* funct */ js.Function, /* receiver */ js.UndefOr[js.Any], js.Function]
  type ProxyFunctions = StringDictionary[js.Function]
}
