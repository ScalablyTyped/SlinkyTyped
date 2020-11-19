package typingsSlinky.builderUtil.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util", "InvalidConfigurationError")
@js.native
class InvalidConfigurationError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
}
