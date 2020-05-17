package typingsSlinky.koaHbs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofUtils extends js.Object {
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
  def createFrame(`object`: js.Any): js.Any = js.native
  def escapeExpression(str: String): String = js.native
  def extend(obj: js.Any, source: js.Any*): js.Any = js.native
  def isArray(obj: js.Any): Boolean = js.native
  def isEmpty(obj: js.Any): Boolean = js.native
  def isFunction(obj: js.Any): Boolean = js.native
  def toString(obj: js.Any): String = js.native
}

object TypeofUtils {
  @scala.inline
  def apply(
    blockParams: (js.Array[_], js.Array[_]) => js.Array[_],
    createFrame: js.Any => js.Any,
    escapeExpression: String => String,
    extend: (js.Any, /* repeated */ js.Any) => js.Any,
    isArray: js.Any => Boolean,
    isEmpty: js.Any => Boolean,
    isFunction: js.Any => Boolean,
    toString: js.Any => String
  ): TypeofUtils = {
    val __obj = js.Dynamic.literal(blockParams = js.Any.fromFunction2(blockParams), createFrame = js.Any.fromFunction1(createFrame), escapeExpression = js.Any.fromFunction1(escapeExpression), extend = js.Any.fromFunction2(extend), isArray = js.Any.fromFunction1(isArray), isEmpty = js.Any.fromFunction1(isEmpty), isFunction = js.Any.fromFunction1(isFunction), toString = js.Any.fromFunction1(toString))
    __obj.asInstanceOf[TypeofUtils]
  }
  @scala.inline
  implicit class TypeofUtilsOps[Self <: TypeofUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockParams(value: (js.Array[_], js.Array[_]) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockParams")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateFrame(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEscapeExpression(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtend(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsArray(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFunction(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToString(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

