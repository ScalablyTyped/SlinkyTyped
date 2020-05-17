package typingsSlinky.requestPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.requestPromise.mod.OptionsWithUri
  - typingsSlinky.requestPromise.mod.OptionsWithUrl
*/
trait Options extends js.Object

object Options {
  @scala.inline
  implicit def apply(value: OptionsWithUri): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: OptionsWithUrl): Options = value.asInstanceOf[Options]
}

