package typingsSlinky.rcFieldForm.interfaceMod

import typingsSlinky.rcFieldForm.rcFieldFormStrings.dependenciesUpdate
import typingsSlinky.rcFieldForm.rcFieldFormStrings.external
import typingsSlinky.rcFieldForm.rcFieldFormStrings.internal
import typingsSlinky.rcFieldForm.rcFieldFormStrings.reset
import typingsSlinky.rcFieldForm.rcFieldFormStrings.setField
import typingsSlinky.rcFieldForm.rcFieldFormStrings.validateFinish
import typingsSlinky.rcFieldForm.rcFieldFormStrings.valueUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcFieldForm.interfaceMod.ValueUpdateInfo
  - typingsSlinky.rcFieldForm.AnonType
  - typingsSlinky.rcFieldForm.AnonData
  - typingsSlinky.rcFieldForm.AnonRelatedFields
*/
trait NotifyInfo extends js.Object

object NotifyInfo {
  @scala.inline
  def ValueUpdateInfo(source: internal | external, `type`: valueUpdate): NotifyInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
  @scala.inline
  def AnonType(`type`: validateFinish | reset): NotifyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
  @scala.inline
  def AnonData(data: FieldData, `type`: setField): NotifyInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
  @scala.inline
  def AnonRelatedFields(relatedFields: js.Array[InternalNamePath], `type`: dependenciesUpdate): NotifyInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
}

