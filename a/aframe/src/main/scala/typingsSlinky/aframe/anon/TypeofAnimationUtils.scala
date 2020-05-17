package typingsSlinky.aframe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofAnimationUtils extends js.Object {
  def arraySlice(array: js.Any, from: Double, to: Double): js.Any = js.native
  def convertArray(array: js.Any, `type`: js.Any, forceClone: Boolean): js.Any = js.native
  def flattenJSON(jsonKeys: js.Array[String], times: js.Array[_], values: js.Array[_], valuePropertyName: String): Unit = js.native
  def getKeyFrameOrder(times: Double): js.Array[Double] = js.native
  def isTypedArray(`object`: js.Any): Boolean = js.native
  def sortedArray(values: js.Array[_], stride: Double, order: js.Array[Double]): js.Array[_] = js.native
}

object TypeofAnimationUtils {
  @scala.inline
  def apply(
    arraySlice: (js.Any, Double, Double) => js.Any,
    convertArray: (js.Any, js.Any, Boolean) => js.Any,
    flattenJSON: (js.Array[String], js.Array[_], js.Array[_], String) => Unit,
    getKeyFrameOrder: Double => js.Array[Double],
    isTypedArray: js.Any => Boolean,
    sortedArray: (js.Array[_], Double, js.Array[Double]) => js.Array[_]
  ): TypeofAnimationUtils = {
    val __obj = js.Dynamic.literal(arraySlice = js.Any.fromFunction3(arraySlice), convertArray = js.Any.fromFunction3(convertArray), flattenJSON = js.Any.fromFunction4(flattenJSON), getKeyFrameOrder = js.Any.fromFunction1(getKeyFrameOrder), isTypedArray = js.Any.fromFunction1(isTypedArray), sortedArray = js.Any.fromFunction3(sortedArray))
    __obj.asInstanceOf[TypeofAnimationUtils]
  }
  @scala.inline
  implicit class TypeofAnimationUtilsOps[Self <: TypeofAnimationUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArraySlice(value: (js.Any, Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arraySlice")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withConvertArray(value: (js.Any, js.Any, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertArray")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFlattenJSON(value: (js.Array[String], js.Array[_], js.Array[_], String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenJSON")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetKeyFrameOrder(value: Double => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeyFrameOrder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsTypedArray(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypedArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSortedArray(value: (js.Array[_], Double, js.Array[Double]) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedArray")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

