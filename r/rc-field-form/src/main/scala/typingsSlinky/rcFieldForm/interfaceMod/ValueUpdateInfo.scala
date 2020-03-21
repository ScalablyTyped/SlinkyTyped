package typingsSlinky.rcFieldForm.interfaceMod

import typingsSlinky.rcFieldForm.rcFieldFormStrings.external
import typingsSlinky.rcFieldForm.rcFieldFormStrings.internal
import typingsSlinky.rcFieldForm.rcFieldFormStrings.valueUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueUpdateInfo extends NotifyInfo {
  var source: internal | external
  var `type`: valueUpdate
}

object ValueUpdateInfo {
  @scala.inline
  def apply(source: internal | external, `type`: valueUpdate): ValueUpdateInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueUpdateInfo]
  }
}

