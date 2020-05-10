package typingsSlinky.istanbulLibReport.mod

import typingsSlinky.istanbulLibCoverage.mod.CoverageSummary
import typingsSlinky.istanbulLibCoverage.mod.FileCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportNode extends Node {
  var children: js.Array[ReportNode] = js.native
  var fileCoverage: FileCoverage = js.native
  var parent: ReportNode | Null = js.native
  var path: String = js.native
  def addChild(child: ReportNode): Unit = js.native
  def asRelative(p: String): String = js.native
  def getChildren(): js.Array[Node] = js.native
  def getCoverageSummary(filesOnly: Boolean): CoverageSummary = js.native
  def getFileCoverage(): FileCoverage = js.native
  def getParent(): Node = js.native
  def getQualifiedName(): String = js.native
  def getRelativeName(): String = js.native
  def isSummary(): Boolean = js.native
}

object ReportNode {
  @scala.inline
  def apply(
    addChild: ReportNode => Unit,
    asRelative: String => String,
    children: js.Array[ReportNode],
    fileCoverage: FileCoverage,
    getChildren: () => js.Array[Node],
    getCoverageSummary: Boolean => CoverageSummary,
    getFileCoverage: () => FileCoverage,
    getParent: () => Node,
    getQualifiedName: () => String,
    getRelativeName: () => String,
    isRoot: () => Boolean,
    isSummary: () => Boolean,
    path: String,
    visit: (Visitor[Node], js.Any) => Unit
  ): ReportNode = {
    val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), asRelative = js.Any.fromFunction1(asRelative), children = children.asInstanceOf[js.Any], fileCoverage = fileCoverage.asInstanceOf[js.Any], getChildren = js.Any.fromFunction0(getChildren), getCoverageSummary = js.Any.fromFunction1(getCoverageSummary), getFileCoverage = js.Any.fromFunction0(getFileCoverage), getParent = js.Any.fromFunction0(getParent), getQualifiedName = js.Any.fromFunction0(getQualifiedName), getRelativeName = js.Any.fromFunction0(getRelativeName), isRoot = js.Any.fromFunction0(isRoot), isSummary = js.Any.fromFunction0(isSummary), path = path.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[ReportNode]
  }
  @scala.inline
  implicit class ReportNodeOps[Self <: ReportNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddChild(value: ReportNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAsRelative(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asRelative")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[ReportNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileCoverage(value: FileCoverage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetChildren(value: () => js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildren")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCoverageSummary(value: Boolean => CoverageSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCoverageSummary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFileCoverage(value: () => FileCoverage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileCoverage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParent(value: () => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetQualifiedName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQualifiedName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRelativeName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRelativeName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSummary(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSummary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ReportNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
  }
  
}

