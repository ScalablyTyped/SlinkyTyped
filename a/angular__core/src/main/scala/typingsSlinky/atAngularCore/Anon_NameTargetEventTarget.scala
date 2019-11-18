package typingsSlinky.atAngularCore

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.atAngularCore.atAngularCoreMod.GlobalTargetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTargetEventTarget extends js.Object {
  var name: GlobalTargetName
  var target: EventTarget
}

object Anon_NameTargetEventTarget {
  @scala.inline
  def apply(name: GlobalTargetName, target: EventTarget): Anon_NameTargetEventTarget = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NameTargetEventTarget]
  }
}

