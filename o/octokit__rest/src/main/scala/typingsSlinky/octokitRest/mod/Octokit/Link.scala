package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.anon.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.octokitRest.anon.Link
  - typingsSlinky.octokitRest.anon.Headers
  - java.lang.String
*/
trait Link extends js.Object

object Link {
  @scala.inline
  implicit def apply(value: Headers): Link = value.asInstanceOf[Link]
  @scala.inline
  implicit def apply(value: typingsSlinky.octokitRest.anon.Link): Link = value.asInstanceOf[Link]
  @scala.inline
  implicit def apply(value: String): Link = value.asInstanceOf[Link]
}

