package typingsSlinky.istanbulLibCoverage.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileCoverageData extends js.Object {
  var b: StringDictionary[js.Array[Double]] = js.native
  var branchMap: StringDictionary[BranchMapping] = js.native
  var f: StringDictionary[Double] = js.native
  var fnMap: StringDictionary[FunctionMapping] = js.native
  var path: String = js.native
  var s: StringDictionary[Double] = js.native
  var statementMap: StringDictionary[Range] = js.native
}

object FileCoverageData {
  @scala.inline
  def apply(
    b: StringDictionary[js.Array[Double]],
    branchMap: StringDictionary[BranchMapping],
    f: StringDictionary[Double],
    fnMap: StringDictionary[FunctionMapping],
    path: String,
    s: StringDictionary[Double],
    statementMap: StringDictionary[Range]
  ): FileCoverageData = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], branchMap = branchMap.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], fnMap = fnMap.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], statementMap = statementMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCoverageData]
  }
  @scala.inline
  implicit class FileCoverageDataOps[Self <: FileCoverageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB(value: StringDictionary[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranchMap(value: StringDictionary[BranchMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFnMap(value: StringDictionary[FunctionMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fnMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatementMap(value: StringDictionary[Range]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

