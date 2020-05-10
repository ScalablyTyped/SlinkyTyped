package typingsSlinky.astTypes.pathVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathVisitor extends js.Object {
  var AbortRequest: js.Any = js.native
  var Context: js.Any = js.native
  var _abortRequested: Boolean = js.native
  var _changeReported: js.Any = js.native
  var _methodNameTable: js.Any = js.native
  var _reusableContextStack: js.Any = js.native
  var _shouldVisitComments: js.Any = js.native
  var _visiting: js.Any = js.native
  var visitor: js.Any = js.native
  def abort(): Unit = js.native
  def acquireContext(path: js.Any): js.Any = js.native
  def releaseContext(context: js.Any): Unit = js.native
  def reportChanged(): Unit = js.native
  def reset(args: js.Any*): js.Any = js.native
  def visit(args: js.Any*): js.Any = js.native
  def visitWithoutReset(path: js.Any): js.Any = js.native
  def wasChangeReported(): js.Any = js.native
}

object PathVisitor {
  @scala.inline
  def apply(
    AbortRequest: js.Any,
    Context: js.Any,
    _abortRequested: Boolean,
    _changeReported: js.Any,
    _methodNameTable: js.Any,
    _reusableContextStack: js.Any,
    _shouldVisitComments: js.Any,
    _visiting: js.Any,
    abort: () => Unit,
    acquireContext: js.Any => js.Any,
    releaseContext: js.Any => Unit,
    reportChanged: () => Unit,
    reset: /* repeated */ js.Any => js.Any,
    visit: /* repeated */ js.Any => js.Any,
    visitWithoutReset: js.Any => js.Any,
    visitor: js.Any,
    wasChangeReported: () => js.Any
  ): PathVisitor = {
    val __obj = js.Dynamic.literal(AbortRequest = AbortRequest.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], _abortRequested = _abortRequested.asInstanceOf[js.Any], _changeReported = _changeReported.asInstanceOf[js.Any], _methodNameTable = _methodNameTable.asInstanceOf[js.Any], _reusableContextStack = _reusableContextStack.asInstanceOf[js.Any], _shouldVisitComments = _shouldVisitComments.asInstanceOf[js.Any], _visiting = _visiting.asInstanceOf[js.Any], abort = js.Any.fromFunction0(abort), acquireContext = js.Any.fromFunction1(acquireContext), releaseContext = js.Any.fromFunction1(releaseContext), reportChanged = js.Any.fromFunction0(reportChanged), reset = js.Any.fromFunction1(reset), visit = js.Any.fromFunction1(visit), visitWithoutReset = js.Any.fromFunction1(visitWithoutReset), visitor = visitor.asInstanceOf[js.Any], wasChangeReported = js.Any.fromFunction0(wasChangeReported))
    __obj.asInstanceOf[PathVisitor]
  }
  @scala.inline
  implicit class PathVisitorOps[Self <: PathVisitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortRequest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbortRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_abortRequested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_abortRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_changeReported(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_changeReported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_methodNameTable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_methodNameTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_reusableContextStack(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_reusableContextStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_shouldVisitComments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_shouldVisitComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_visiting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_visiting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAcquireContext(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquireContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReleaseContext(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReportChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisit(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitWithoutReset(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitWithoutReset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisitor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWasChangeReported(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasChangeReported")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

