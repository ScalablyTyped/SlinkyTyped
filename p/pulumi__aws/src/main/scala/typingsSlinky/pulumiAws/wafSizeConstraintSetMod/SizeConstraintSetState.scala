package typingsSlinky.pulumiAws.wafSizeConstraintSetMod

import typingsSlinky.pulumiAws.inputMod.waf.SizeConstraintSetSizeConstraint
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeConstraintSetState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name or description of the Size Constraint Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the parts of web requests that you want to inspect the size of.
    */
  val sizeConstraints: js.UndefOr[Input[js.Array[Input[SizeConstraintSetSizeConstraint]]]] = js.native
}
object SizeConstraintSetState {
  
  @scala.inline
  def apply(): SizeConstraintSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeConstraintSetState]
  }
  
  @scala.inline
  implicit class SizeConstraintSetStateOps[Self <: SizeConstraintSetState] (val x: Self) extends AnyVal {
    
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
    def setSizeConstraintsVarargs(value: Input[SizeConstraintSetSizeConstraint]*): Self = this.set("sizeConstraints", js.Array(value :_*))
    
    @scala.inline
    def setSizeConstraints(value: Input[js.Array[Input[SizeConstraintSetSizeConstraint]]]): Self = this.set("sizeConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeConstraints: Self = this.set("sizeConstraints", js.undefined)
  }
}
