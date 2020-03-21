package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cypress.cypressStrings.portrait
  - typingsSlinky.cypress.cypressStrings.landscape
*/
trait ViewportOrientation extends js.Object

object ViewportOrientation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def landscape: typingsSlinky.cypress.cypressStrings.landscape = this.cast("landscape")
  @scala.inline
  def portrait: typingsSlinky.cypress.cypressStrings.portrait = this.cast("portrait")
}

