package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.jestTypesStrings.hook_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hook extends Event {
  var hook: typingsSlinky.jestTypes.circusMod.Hook
  var name: hook_start
}

object Hook {
  @scala.inline
  def apply(hook: typingsSlinky.jestTypes.circusMod.Hook, name: hook_start): Hook = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hook]
  }
}

