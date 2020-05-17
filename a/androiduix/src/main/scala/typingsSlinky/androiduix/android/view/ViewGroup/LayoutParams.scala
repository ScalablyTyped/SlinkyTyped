package typingsSlinky.androiduix.android.view.ViewGroup

import typingsSlinky.androiduix.android.content.res.TypedArray
import typingsSlinky.androiduix.androidui.attr.AttrBinder
import typingsSlinky.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import typingsSlinky.androiduix.java_.lang.JavaObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutParams extends JavaObject {
  var _attrBinder: js.Any = js.native
  var height: Double = js.native
  var width: Double = js.native
  /* protected */ def createClassAttrBinder(): ClassBinderMap = js.native
  def getAttrBinder(): AttrBinder = js.native
  /* private */ def initBindAttr(): js.Any = js.native
  /* protected */ def setBaseAttributes(a: TypedArray, widthAttr: String, heightAttr: String): Unit = js.native
}

object LayoutParams {
  @scala.inline
  def apply(
    _attrBinder: js.Any,
    createClassAttrBinder: () => ClassBinderMap,
    equals: js.Any => Boolean,
    getAttrBinder: () => AttrBinder,
    hash: js.Any,
    height: Double,
    initBindAttr: () => js.Any,
    setBaseAttributes: (TypedArray, String, String) => Unit,
    width: Double
  ): LayoutParams = {
    val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), equals = js.Any.fromFunction1(equals), getAttrBinder = js.Any.fromFunction0(getAttrBinder), hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutParams]
  }
  @scala.inline
  implicit class LayoutParamsOps[Self <: LayoutParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_attrBinder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attrBinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateClassAttrBinder(value: () => ClassBinderMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createClassAttrBinder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttrBinder(value: () => AttrBinder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttrBinder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitBindAttr(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initBindAttr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBaseAttributes(value: (TypedArray, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBaseAttributes")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

