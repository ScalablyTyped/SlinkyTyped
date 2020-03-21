package typingsSlinky.remotedevSerialize

import typingsSlinky.remotedevSerialize.mod.DefaultReplacer
import typingsSlinky.remotedevSerialize.mod.DefaultReviver
import typingsSlinky.remotedevSerialize.mod.Options
import typingsSlinky.remotedevSerialize.mod.Replacer
import typingsSlinky.remotedevSerialize.mod.Reviver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOptions extends js.Object {
  var options: Options = js.native
  @JSName("replacer")
  var replacer_Original: Replacer = js.native
  @JSName("reviver")
  var reviver_Original: Reviver = js.native
  def replacer(key: String, value: js.Any, replacer: DefaultReplacer): js.Any = js.native
  def reviver(key: String, value: js.Any, reviver: DefaultReviver): js.Any = js.native
}

