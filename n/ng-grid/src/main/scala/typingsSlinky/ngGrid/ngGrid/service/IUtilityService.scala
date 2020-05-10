package typingsSlinky.ngGrid.ngGrid.service

import typingsSlinky.ngGrid.ngGrid.IGridScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtilityService extends js.Object {
  def endsWith(str: String, suffix: String): Boolean = js.native
  def evalProperty(entity: js.Any, path: String): js.Any = js.native
  def forIn(obj: js.Any, action: js.Function2[/* value */ js.Any, /* property */ String, js.Object]): Unit = js.native
  def getElementsByClassName(cl: String): js.Array[_] = js.native
  def getInstanceType(o: js.Any): String = js.native
  def isNullOrUndefined(obj: js.Any): Boolean = js.native
  def newId(): String = js.native
  def seti18n($scope: IGridScope, language: String): Unit = js.native
  def visualLength(node: js.Any): Double = js.native
}

object IUtilityService {
  @scala.inline
  def apply(
    endsWith: (String, String) => Boolean,
    evalProperty: (js.Any, String) => js.Any,
    forIn: (js.Any, js.Function2[/* value */ js.Any, /* property */ String, js.Object]) => Unit,
    getElementsByClassName: String => js.Array[_],
    getInstanceType: js.Any => String,
    isNullOrUndefined: js.Any => Boolean,
    newId: () => String,
    seti18n: (IGridScope, String) => Unit,
    visualLength: js.Any => Double
  ): IUtilityService = {
    val __obj = js.Dynamic.literal(endsWith = js.Any.fromFunction2(endsWith), evalProperty = js.Any.fromFunction2(evalProperty), forIn = js.Any.fromFunction2(forIn), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getInstanceType = js.Any.fromFunction1(getInstanceType), isNullOrUndefined = js.Any.fromFunction1(isNullOrUndefined), newId = js.Any.fromFunction0(newId), seti18n = js.Any.fromFunction2(seti18n), visualLength = js.Any.fromFunction1(visualLength))
    __obj.asInstanceOf[IUtilityService]
  }
  @scala.inline
  implicit class IUtilityServiceOps[Self <: IUtilityService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndsWith(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsWith")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEvalProperty(value: (js.Any, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withForIn(value: (js.Any, js.Function2[/* value */ js.Any, /* property */ String, js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forIn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetElementsByClassName(value: String => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetInstanceType(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstanceType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsNullOrUndefined(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNullOrUndefined")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSeti18n(value: (IGridScope, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seti18n")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisualLength(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualLength")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

