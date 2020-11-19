package typingsSlinky.pulumiAws.planMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.backup.PlanRule
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanState extends js.Object {
  
  /**
    * The ARN of the backup plan.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The display name of a backup plan.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A rule object that specifies a scheduled task that is used to back up a selection of resources.
    */
  val rules: js.UndefOr[Input[js.Array[Input[PlanRule]]]] = js.native
  
  /**
    * Metadata that you can assign to help organize the plans you create.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
    */
  val version: js.UndefOr[Input[String]] = js.native
}
object PlanState {
  
  @scala.inline
  def apply(): PlanState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanState]
  }
  
  @scala.inline
  implicit class PlanStateOps[Self <: PlanState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Input[PlanRule]*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: Input[js.Array[Input[PlanRule]]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
