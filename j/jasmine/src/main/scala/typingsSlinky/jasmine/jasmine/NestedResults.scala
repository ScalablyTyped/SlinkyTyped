package typingsSlinky.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestedResults extends Result {
  var description: String = js.native
  var failedCount: Double = js.native
  var passedCount: Double = js.native
  var skipped: Boolean = js.native
  var totalCount: Double = js.native
  def addResult(result: Result): Unit = js.native
  def getItems(): js.Array[Result] = js.native
  def log(values: js.Any): Unit = js.native
  def passed(): Boolean = js.native
  def rollupCounts(result: NestedResults): Unit = js.native
}

object NestedResults {
  @scala.inline
  def apply(
    addResult: Result => Unit,
    description: String,
    failedCount: Double,
    getItems: () => js.Array[Result],
    log: js.Any => Unit,
    passed: () => Boolean,
    passedCount: Double,
    rollupCounts: NestedResults => Unit,
    skipped: Boolean,
    totalCount: Double,
    `type`: String
  ): NestedResults = {
    val __obj = js.Dynamic.literal(addResult = js.Any.fromFunction1(addResult), description = description.asInstanceOf[js.Any], failedCount = failedCount.asInstanceOf[js.Any], getItems = js.Any.fromFunction0(getItems), log = js.Any.fromFunction1(log), passed = js.Any.fromFunction0(passed), passedCount = passedCount.asInstanceOf[js.Any], rollupCounts = js.Any.fromFunction1(rollupCounts), skipped = skipped.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedResults]
  }
  @scala.inline
  implicit class NestedResultsOps[Self <: NestedResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddResult(value: Result => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetItems(value: () => js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLog(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPassed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPassedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollupCounts(value: NestedResults => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollupCounts")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

