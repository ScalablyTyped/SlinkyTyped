package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends js.Object {
  
  /**
    * A list of named parameters (key/value), depending on the condition's type. Notes:
    * - For binary operators, include parameters named arg0 and arg1 for specifying the left and right operands, respectively.
    * - At this time, the left operand (arg0) must be a reference to a variable.
    * - For case-insensitive Regex matching, include a boolean parameter named ignore_case that is set to true. If not specified or set to any other value,
    * the matching will be case sensitive.
    * - To negate an operator, include a boolean parameter named negate boolean parameter that is set to true.
    */
  var parameter: js.UndefOr[js.Array[Parameter]] = js.native
  
  /** The type of operator for this condition. */
  var `type`: js.UndefOr[String] = js.native
}
object Condition {
  
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    
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
    def setParameterVarargs(value: Parameter*): Self = this.set("parameter", js.Array(value :_*))
    
    @scala.inline
    def setParameter(value: js.Array[Parameter]): Self = this.set("parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
