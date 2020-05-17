package typingsSlinky.androiduix.androidui.attr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateAttrList extends js.Object {
  var mView: js.Any = js.native
  var matchedStateAttrList: js.Any = js.native
  var originStateAttrList: js.Any = js.native
  def addStatedAttr(attrName: String, attrValue: String): Unit = js.native
  /* private */ def addStatedAttrImpl(attrName: js.Any, attrValue: js.Any, inParseState: js.Any): js.Any = js.native
  def getMatchedStateAttr(state: js.Array[Double]): StateAttr = js.native
  /* private */ def getOrCreateStateAttr(state: js.Any): js.Any = js.native
  /* private */ def getStateAttr(state: js.Any): js.Any = js.native
  def removeAttrAllState(attrName: String): Unit = js.native
}

object StateAttrList {
  @scala.inline
  def apply(
    addStatedAttr: (String, String) => Unit,
    addStatedAttrImpl: (js.Any, js.Any, js.Any) => js.Any,
    getMatchedStateAttr: js.Array[Double] => StateAttr,
    getOrCreateStateAttr: js.Any => js.Any,
    getStateAttr: js.Any => js.Any,
    mView: js.Any,
    matchedStateAttrList: js.Any,
    originStateAttrList: js.Any,
    removeAttrAllState: String => Unit
  ): StateAttrList = {
    val __obj = js.Dynamic.literal(addStatedAttr = js.Any.fromFunction2(addStatedAttr), addStatedAttrImpl = js.Any.fromFunction3(addStatedAttrImpl), getMatchedStateAttr = js.Any.fromFunction1(getMatchedStateAttr), getOrCreateStateAttr = js.Any.fromFunction1(getOrCreateStateAttr), getStateAttr = js.Any.fromFunction1(getStateAttr), mView = mView.asInstanceOf[js.Any], matchedStateAttrList = matchedStateAttrList.asInstanceOf[js.Any], originStateAttrList = originStateAttrList.asInstanceOf[js.Any], removeAttrAllState = js.Any.fromFunction1(removeAttrAllState))
    __obj.asInstanceOf[StateAttrList]
  }
  @scala.inline
  implicit class StateAttrListOps[Self <: StateAttrList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddStatedAttr(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStatedAttr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddStatedAttrImpl(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStatedAttrImpl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetMatchedStateAttr(value: js.Array[Double] => StateAttr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMatchedStateAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOrCreateStateAttr(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateStateAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStateAttr(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStateAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchedStateAttrList(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedStateAttrList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginStateAttrList(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originStateAttrList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveAttrAllState(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttrAllState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

