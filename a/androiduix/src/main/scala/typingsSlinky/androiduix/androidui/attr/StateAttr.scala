package typingsSlinky.androiduix.androidui.attr

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateAttr extends js.Object {
  var attributes: js.Any = js.native
  var stateSpec: js.Any = js.native
  def createDiffKeyAsNullValueAttrMap(another: StateAttr): Map[String, String] = js.native
  def getAttrMap(): Map[String, String] = js.native
  def hasAttr(name: String): Boolean = js.native
  def isDefaultState(): Boolean = js.native
  def isStateEquals(state: js.Array[Double]): Boolean = js.native
  def isStateMatch(state: js.Array[Double]): Boolean = js.native
  def putAll(stateAttr: StateAttr): Unit = js.native
  def setAttr(name: String, value: String): Unit = js.native
}

object StateAttr {
  @scala.inline
  def apply(
    attributes: js.Any,
    createDiffKeyAsNullValueAttrMap: StateAttr => Map[String, String],
    getAttrMap: () => Map[String, String],
    hasAttr: String => Boolean,
    isDefaultState: () => Boolean,
    isStateEquals: js.Array[Double] => Boolean,
    isStateMatch: js.Array[Double] => Boolean,
    putAll: StateAttr => Unit,
    setAttr: (String, String) => Unit,
    stateSpec: js.Any
  ): StateAttr = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], createDiffKeyAsNullValueAttrMap = js.Any.fromFunction1(createDiffKeyAsNullValueAttrMap), getAttrMap = js.Any.fromFunction0(getAttrMap), hasAttr = js.Any.fromFunction1(hasAttr), isDefaultState = js.Any.fromFunction0(isDefaultState), isStateEquals = js.Any.fromFunction1(isStateEquals), isStateMatch = js.Any.fromFunction1(isStateMatch), putAll = js.Any.fromFunction1(putAll), setAttr = js.Any.fromFunction2(setAttr), stateSpec = stateSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateAttr]
  }
  @scala.inline
  implicit class StateAttrOps[Self <: StateAttr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDiffKeyAsNullValueAttrMap(value: StateAttr => Map[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDiffKeyAsNullValueAttrMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttrMap(value: () => Map[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttrMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasAttr(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsDefaultState(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsStateEquals(value: js.Array[Double] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStateEquals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsStateMatch(value: js.Array[Double] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStateMatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPutAll(value: StateAttr => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAttr(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStateSpec(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSpec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

