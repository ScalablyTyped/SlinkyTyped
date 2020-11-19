package typingsSlinky.feathersjsErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@feathersjs/errors", "BadGateway")
@js.native
class BadGateway () extends FeathersError {
  def this(msg: String) = this()
  def this(msg: js.Error) = this()
  def this(msg: js.UndefOr[scala.Nothing], data: js.Any) = this()
  def this(msg: String, data: js.Any) = this()
  def this(msg: js.Error, data: js.Any) = this()
}
