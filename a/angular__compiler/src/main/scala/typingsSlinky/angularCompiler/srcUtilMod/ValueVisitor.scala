package typingsSlinky.angularCompiler.srcUtilMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueVisitor extends js.Object {
  def visitArray(arr: js.Array[_], context: js.Any): js.Any = js.native
  def visitOther(value: js.Any, context: js.Any): js.Any = js.native
  def visitPrimitive(value: js.Any, context: js.Any): js.Any = js.native
  def visitStringMap(map: StringDictionary[js.Any], context: js.Any): js.Any = js.native
}

object ValueVisitor {
  @scala.inline
  def apply(
    visitArray: (js.Array[_], js.Any) => js.Any,
    visitOther: (js.Any, js.Any) => js.Any,
    visitPrimitive: (js.Any, js.Any) => js.Any,
    visitStringMap: (StringDictionary[js.Any], js.Any) => js.Any
  ): ValueVisitor = {
    val __obj = js.Dynamic.literal(visitArray = js.Any.fromFunction2(visitArray), visitOther = js.Any.fromFunction2(visitOther), visitPrimitive = js.Any.fromFunction2(visitPrimitive), visitStringMap = js.Any.fromFunction2(visitStringMap))
    __obj.asInstanceOf[ValueVisitor]
  }
  @scala.inline
  implicit class ValueVisitorOps[Self <: ValueVisitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisitArray(value: (js.Array[_], js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitArray")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitOther(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitOther")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitPrimitive(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitPrimitive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisitStringMap(value: (StringDictionary[js.Any], js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitStringMap")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

