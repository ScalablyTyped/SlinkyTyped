package typingsSlinky.nodeSchedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JobCallback = js.Function1[/* fireDate */ js.Date, scala.Unit]
  type Timezone = java.lang.String
}
