package typingsSlinky.browserslist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Which statistics should be used.
  * Country code or custom statistics.
  * Pass `"my stats"` to load statistics
  * from `Browserslist` files
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.browserslist.mod.MyStats
  - typingsSlinky.browserslist.mod.Stats
*/
trait StatsOptions extends js.Object

object StatsOptions {
  @scala.inline
  implicit def apply(value: MyStats): StatsOptions = value.asInstanceOf[StatsOptions]
  @scala.inline
  implicit def apply(value: Stats): StatsOptions = value.asInstanceOf[StatsOptions]
  @scala.inline
  implicit def apply(value: String): StatsOptions = value.asInstanceOf[StatsOptions]
}

