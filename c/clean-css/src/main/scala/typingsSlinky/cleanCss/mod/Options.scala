package typingsSlinky.cleanCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Discriminant union of both sets of options types.  If you initialize without setting `returnPromise: true`
  *  and want to return a promise, you will need to cast to the correct options type so that TypeScript
  *  knows what the expected return type will be:
  *  `(options = options as CleanCSS.OptionsPromise).returnPromise = true`
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cleanCss.mod.OptionsPromise
  - typingsSlinky.cleanCss.mod.OptionsOutput
*/
trait Options extends js.Object

object Options {
  @scala.inline
  implicit def apply(value: OptionsOutput): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: OptionsPromise): Options = value.asInstanceOf[Options]
}

