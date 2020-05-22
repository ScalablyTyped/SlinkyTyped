package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlImportance
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.activexOutlook.Outlook.OlRuleConditionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ImportanceRuleCondition")
@js.native
class ImportanceRuleCondition protected ()
  extends typingsSlinky.activexOutlook.Outlook.ImportanceRuleCondition {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val ConditionType: OlRuleConditionType = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  override var Importance: OlImportance = js.native
  /* CompleteClass */
  @JSName("Outlook.ImportanceRuleCondition_typekey")
  override var OutlookDotImportanceRuleCondition_typekey: typingsSlinky.activexOutlook.Outlook.ImportanceRuleCondition = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
}

