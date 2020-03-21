package typingsSlinky.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapiHapi.hapiHapiBooleans.`false`
  - typingsSlinky.hapiHapi.hapiHapiStrings.None
  - typingsSlinky.hapiHapi.hapiHapiStrings.Lax
  - typingsSlinky.hapiHapi.hapiHapiStrings.Strict
*/
trait SameSitePolicy extends js.Object

object SameSitePolicy {
  @scala.inline
  def Lax: typingsSlinky.hapiHapi.hapiHapiStrings.Lax = this.cast("Lax")
  @scala.inline
  def None: typingsSlinky.hapiHapi.hapiHapiStrings.None = this.cast("None")
  @scala.inline
  def Strict: typingsSlinky.hapiHapi.hapiHapiStrings.Strict = this.cast("Strict")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typingsSlinky.hapiHapi.hapiHapiBooleans.`false` = this.cast(false)
}

