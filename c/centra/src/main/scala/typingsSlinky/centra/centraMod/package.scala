package typingsSlinky.centra

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object centraMod {
  import typingsSlinky.node.urlMod.URL

  type CentraFactory = js.Function2[/* url */ URL | String, /* method */ js.UndefOr[String], Request]
}
