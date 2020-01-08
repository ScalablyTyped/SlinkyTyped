package typingsSlinky.centra

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object centraMod {
  import org.scalajs.dom.experimental.URL

  type CentraFactory = js.Function2[/* url */ URL | String, /* method */ js.UndefOr[String], Request]
}
