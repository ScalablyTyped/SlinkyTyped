package typingsSlinky.interpret.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionDescriptor extends Extension {
  var module: String = js.native
  @JSName("register")
  var register_Original: RegisterFn = js.native
  def register(hook: Hook): Unit = js.native
}

