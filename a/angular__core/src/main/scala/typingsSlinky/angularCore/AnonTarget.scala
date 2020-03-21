package typingsSlinky.angularCore

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  var name: String
  var target: HTMLElement
}

object AnonTarget {
  @scala.inline
  def apply(name: String, target: HTMLElement): AnonTarget = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTarget]
  }
}

