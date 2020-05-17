package typingsSlinky.androiduix.android.content.res

import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedArray extends js.Object {
  var attrMap: js.Any = js.native
  var attrMapKeysCache: js.Any = js.native
  var mRecycled: js.Any = js.native
  var mResources: js.Any = js.native
  /* private */ def checkRecycled(): js.Any = js.native
  def getAttrValue(attrName: String): String = js.native
  def getBoolean(attrName: String, defValue: Boolean): Boolean = js.native
  def getColor(attrName: String, defValue: Double): Double = js.native
  def getColorStateList(attrName: String): ColorStateList = js.native
  def getDimension(attrName: String, defValue: Double): Double = js.native
  def getDimensionPixelOffset(attrName: String, defValue: Double): Double = js.native
  def getDimensionPixelSize(attrName: String, defValue: Double): Double = js.native
  def getDrawable(attrName: String): Drawable = js.native
  def getFloat(attrName: String, defValue: Double): Double = js.native
  def getIndex(keyIndex: Double): String = js.native
  def getInt(attrName: String, defValue: Double): Double = js.native
  def getInteger(attrName: String, defValue: Double): Double = js.native
  def getLayoutDimension(attrName: String, defValue: Double): Double = js.native
  def getLowerCaseNoNamespaceAttrNames(): js.Array[String] = js.native
  def getResourceId(attrName: String, defaultResourceId: String): String = js.native
  def getResources(): Resources = js.native
  def getString(attrName: String): String = js.native
  def getText(attrName: String): String = js.native
  def getTextArray(attrName: String): js.Array[String] = js.native
  def hasValue(attrName: String): Boolean = js.native
  def hasValueOrEmpty(attrName: String): Boolean = js.native
  def length(): Double = js.native
  def recycle(): Unit = js.native
}

object TypedArray {
  @scala.inline
  def apply(
    attrMap: js.Any,
    attrMapKeysCache: js.Any,
    checkRecycled: () => js.Any,
    getAttrValue: String => String,
    getBoolean: (String, Boolean) => Boolean,
    getColor: (String, Double) => Double,
    getColorStateList: String => ColorStateList,
    getDimension: (String, Double) => Double,
    getDimensionPixelOffset: (String, Double) => Double,
    getDimensionPixelSize: (String, Double) => Double,
    getDrawable: String => Drawable,
    getFloat: (String, Double) => Double,
    getIndex: Double => String,
    getInt: (String, Double) => Double,
    getInteger: (String, Double) => Double,
    getLayoutDimension: (String, Double) => Double,
    getLowerCaseNoNamespaceAttrNames: () => js.Array[String],
    getResourceId: (String, String) => String,
    getResources: () => Resources,
    getString: String => String,
    getText: String => String,
    getTextArray: String => js.Array[String],
    hasValue: String => Boolean,
    hasValueOrEmpty: String => Boolean,
    length: () => Double,
    mRecycled: js.Any,
    mResources: js.Any,
    recycle: () => Unit
  ): TypedArray = {
    val __obj = js.Dynamic.literal(attrMap = attrMap.asInstanceOf[js.Any], attrMapKeysCache = attrMapKeysCache.asInstanceOf[js.Any], checkRecycled = js.Any.fromFunction0(checkRecycled), getAttrValue = js.Any.fromFunction1(getAttrValue), getBoolean = js.Any.fromFunction2(getBoolean), getColor = js.Any.fromFunction2(getColor), getColorStateList = js.Any.fromFunction1(getColorStateList), getDimension = js.Any.fromFunction2(getDimension), getDimensionPixelOffset = js.Any.fromFunction2(getDimensionPixelOffset), getDimensionPixelSize = js.Any.fromFunction2(getDimensionPixelSize), getDrawable = js.Any.fromFunction1(getDrawable), getFloat = js.Any.fromFunction2(getFloat), getIndex = js.Any.fromFunction1(getIndex), getInt = js.Any.fromFunction2(getInt), getInteger = js.Any.fromFunction2(getInteger), getLayoutDimension = js.Any.fromFunction2(getLayoutDimension), getLowerCaseNoNamespaceAttrNames = js.Any.fromFunction0(getLowerCaseNoNamespaceAttrNames), getResourceId = js.Any.fromFunction2(getResourceId), getResources = js.Any.fromFunction0(getResources), getString = js.Any.fromFunction1(getString), getText = js.Any.fromFunction1(getText), getTextArray = js.Any.fromFunction1(getTextArray), hasValue = js.Any.fromFunction1(hasValue), hasValueOrEmpty = js.Any.fromFunction1(hasValueOrEmpty), length = js.Any.fromFunction0(length), mRecycled = mRecycled.asInstanceOf[js.Any], mResources = mResources.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle))
    __obj.asInstanceOf[TypedArray]
  }
  @scala.inline
  implicit class TypedArrayOps[Self <: TypedArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrMapKeysCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrMapKeysCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckRecycled(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkRecycled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttrValue(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttrValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBoolean(value: (String, Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoolean")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetColor(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetColorStateList(value: String => ColorStateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColorStateList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDimension(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDimension")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDimensionPixelOffset(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDimensionPixelOffset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDimensionPixelSize(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDimensionPixelSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDrawable(value: String => Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDrawable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFloat(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFloat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetIndex(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetInt(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetInteger(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInteger")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetLayoutDimension(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayoutDimension")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetLowerCaseNoNamespaceAttrNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLowerCaseNoNamespaceAttrNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetResourceId(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResourceId")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetResources(value: () => Resources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResources")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetString(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetText(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTextArray(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasValue(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasValueOrEmpty(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasValueOrEmpty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMRecycled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mRecycled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMResources(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecycle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recycle")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

