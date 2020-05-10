package typingsSlinky.pulumiAws.wafSizeConstraintSetMod

import typingsSlinky.pulumiAws.inputMod.waf.SizeConstraintSetSizeConstraint
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeConstraintSetArgs extends js.Object {
  /**
    * The name or description of the Size Constraint Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the parts of web requests that you want to inspect the size of.
    */
  val sizeConstraints: js.UndefOr[Input[js.Array[Input[SizeConstraintSetSizeConstraint]]]] = js.native
}

object SizeConstraintSetArgs {
  @scala.inline
  def apply(): SizeConstraintSetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeConstraintSetArgs]
  }
  @scala.inline
  implicit class SizeConstraintSetArgsOps[Self <: SizeConstraintSetArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeConstraints(value: Input[js.Array[Input[SizeConstraintSetSizeConstraint]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeConstraints")(js.undefined)
        ret
    }
  }
  
}

