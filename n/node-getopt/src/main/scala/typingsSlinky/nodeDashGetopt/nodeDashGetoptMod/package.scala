package typingsSlinky.nodeDashGetopt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashGetoptMod {
  import org.scalablytyped.runtime.NumberDictionary
  import org.scalablytyped.runtime.StringDictionary

  type ErrorFunc = js.Function1[/* exception */ js.Error, Unit]
  type EventCallback = js.Function2[/* args */ js.Array[String], /* options */ OptionMap, Unit]
  type OptionConfigurationArray = NumberDictionary[js.Array[String]]
  type OptionMap = StringDictionary[String | js.Array[String] | Boolean]
}
