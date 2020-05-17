package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to call a solver for a model that is defined by spreadsheet cells. */
@js.native
trait XSolver extends XInterface {
  var Constraints: SafeArray[SolverConstraint] = js.native
  var Document: XSpreadsheetDocument = js.native
  var Maximize: Boolean = js.native
  var Objective: CellAddress = js.native
  var ResultValue: Double = js.native
  /** contains the solution's value for each of the variables, if a solution was found. */
  var Solution: SafeArray[Double] = js.native
  var Success: Boolean = js.native
  var Variables: SafeArray[CellAddress] = js.native
  def solve(): Unit = js.native
}

object XSolver {
  @scala.inline
  def apply(
    Constraints: SafeArray[SolverConstraint],
    Document: XSpreadsheetDocument,
    Maximize: Boolean,
    Objective: CellAddress,
    ResultValue: Double,
    Solution: SafeArray[Double],
    Success: Boolean,
    Variables: SafeArray[CellAddress],
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    solve: () => Unit
  ): XSolver = {
    val __obj = js.Dynamic.literal(Constraints = Constraints.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], Maximize = Maximize.asInstanceOf[js.Any], Objective = Objective.asInstanceOf[js.Any], ResultValue = ResultValue.asInstanceOf[js.Any], Solution = Solution.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any], Variables = Variables.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), solve = js.Any.fromFunction0(solve))
    __obj.asInstanceOf[XSolver]
  }
  @scala.inline
  implicit class XSolverOps[Self <: XSolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: SafeArray[SolverConstraint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: XSpreadsheetDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Maximize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjective(value: CellAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Objective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSolution(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Solution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: SafeArray[CellAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSolve(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solve")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

