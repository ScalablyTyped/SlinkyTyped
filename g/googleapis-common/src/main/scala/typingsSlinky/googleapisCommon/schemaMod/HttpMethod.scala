package typingsSlinky.googleapisCommon.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleapisCommon.googleapisCommonStrings.GET
  - typingsSlinky.googleapisCommon.googleapisCommonStrings.PATCH
  - typingsSlinky.googleapisCommon.googleapisCommonStrings.PUT
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def GET: typingsSlinky.googleapisCommon.googleapisCommonStrings.GET = this.cast("GET")
  @scala.inline
  def PATCH: typingsSlinky.googleapisCommon.googleapisCommonStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def PUT: typingsSlinky.googleapisCommon.googleapisCommonStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

