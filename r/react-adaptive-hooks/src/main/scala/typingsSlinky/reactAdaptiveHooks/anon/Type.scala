package typingsSlinky.reactAdaptiveHooks.anon

import typingsSlinky.reactAdaptiveHooks.reactAdaptiveHooksStrings.`media-source`
import typingsSlinky.reactAdaptiveHooks.reactAdaptiveHooksStrings.file
import typingsSlinky.reactAdaptiveHooks.reactAdaptiveHooksStrings.record
import typingsSlinky.reactAdaptiveHooks.reactAdaptiveHooksStrings.transmission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: file | record | transmission | `media-source`
}

object Type {
  @scala.inline
  def apply(`type`: file | record | transmission | `media-source`): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

