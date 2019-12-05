package typingsSlinky.sane

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object saneMod {
  type AnymatchMatcher = String | js.RegExp | (js.Function1[/* repeated */ String, Boolean])
  type Watcher = SaneWatcher
}
