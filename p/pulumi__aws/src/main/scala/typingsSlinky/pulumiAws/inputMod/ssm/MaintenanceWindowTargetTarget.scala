package typingsSlinky.pulumiAws.inputMod.ssm

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTargetTarget extends js.Object {
  
  var key: Input[String] = js.native
  
  var values: Input[js.Array[Input[String]]] = js.native
}
object MaintenanceWindowTargetTarget {
  
  @scala.inline
  def apply(key: Input[String], values: Input[js.Array[Input[String]]]): MaintenanceWindowTargetTarget = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTargetTarget]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTargetTargetOps[Self <: MaintenanceWindowTargetTarget] (val x: Self) extends AnyVal {
    
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
    def setKey(value: Input[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Input[String]*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: Input[js.Array[Input[String]]]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
