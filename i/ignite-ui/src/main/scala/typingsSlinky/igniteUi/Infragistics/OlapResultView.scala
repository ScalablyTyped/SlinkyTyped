package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapResultView extends js.Object {
  /**
  	 * Creates a new $.ig.OlapResultView object with result object having the same structure as the original one and new visibleResult where the tuples which appear as children under specified tuple and member index are no longer present.
  	 *
  	 * @param axisName
  	 * @param tupleIndex
  	 * @param memberIndex
  	 */
  def collapseTupleMember(axisName: js.Object, tupleIndex: js.Object, memberIndex: js.Object): js.Object = js.native
  /**
  	 * Creates a $.ig.OlapResultView view object with result object having the same structure as the original one and new visibleResult where the tuples which appear as children under specified tuple and member index are accessible as part of the visibleResult.
  	 *
  	 * @param axisName
  	 * @param tupleIndex
  	 * @param memberIndex
  	 */
  def expandTupleMember(axisName: js.Object, tupleIndex: js.Object, memberIndex: js.Object): js.Object = js.native
  /**
  	 * Creates a new $.ig.OlapResultView object as the axis specified by axisName of the original result object is extended with the tuples of the same axis found into supplied partialResult object.
  	 *
  	 * @param partialResult
  	 * @param axisName
  	 */
  def extend(partialResult: js.Object, axisName: js.Object): js.Object = js.native
}

object OlapResultView {
  @scala.inline
  def apply(
    collapseTupleMember: (js.Object, js.Object, js.Object) => js.Object,
    expandTupleMember: (js.Object, js.Object, js.Object) => js.Object,
    extend: (js.Object, js.Object) => js.Object
  ): OlapResultView = {
    val __obj = js.Dynamic.literal(collapseTupleMember = js.Any.fromFunction3(collapseTupleMember), expandTupleMember = js.Any.fromFunction3(expandTupleMember), extend = js.Any.fromFunction2(extend))
    __obj.asInstanceOf[OlapResultView]
  }
  @scala.inline
  implicit class OlapResultViewOps[Self <: OlapResultView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseTupleMember(value: (js.Object, js.Object, js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTupleMember")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withExpandTupleMember(value: (js.Object, js.Object, js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTupleMember")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withExtend(value: (js.Object, js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

