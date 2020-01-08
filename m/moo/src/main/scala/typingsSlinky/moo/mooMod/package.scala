package typingsSlinky.moo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mooMod {
  import org.scalablytyped.runtime.StringDictionary

  type Rules = StringDictionary[js.RegExp | String | (js.Array[Rule | String]) | Rule | ErrorRule | FallbackRule]
  type TypeMapper = js.Function1[/* x */ String, String]
}
