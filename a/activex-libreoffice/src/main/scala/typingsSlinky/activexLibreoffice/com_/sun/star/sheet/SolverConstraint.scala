package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to specify a constraint for a solver model. */
@js.native
trait SolverConstraint extends js.Object {
  var Left: CellAddress = js.native
  var Operator: SolverConstraintOperator = js.native
  /** The comparison value, of type `double` or {@link com.sun.star.table.CellAddress} . */
  var Right: js.Any = js.native
}

object SolverConstraint {
  @scala.inline
  def apply(Left: CellAddress, Operator: SolverConstraintOperator, Right: js.Any): SolverConstraint = {
    val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolverConstraint]
  }
  @scala.inline
  implicit class SolverConstraintOps[Self <: SolverConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: CellAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: SolverConstraintOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Right")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

