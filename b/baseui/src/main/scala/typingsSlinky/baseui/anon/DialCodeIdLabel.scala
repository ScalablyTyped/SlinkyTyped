package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.AD
import typingsSlinky.baseui.baseuiStrings.Andorra
import typingsSlinky.baseui.baseuiStrings.Plussign376
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialCodeIdLabel extends js.Object {
  var dialCode: Plussign376
  var id: AD
  var label: Andorra
}

object DialCodeIdLabel {
  @scala.inline
  def apply(dialCode: Plussign376, id: AD, label: Andorra): DialCodeIdLabel = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialCodeIdLabel]
  }
}

