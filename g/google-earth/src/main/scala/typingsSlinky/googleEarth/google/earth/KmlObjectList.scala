package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlObjectList[T /* <: KmlObject */] extends js.Object {
  /**
    * Number of objects in collection.
    */
  def getLength(): Double = js.native
  /**
    * Gets an item from the object list. For example, list.item(0) returns the first object in the list.
    */
  def item(index: Double): T = js.native
}

object KmlObjectList {
  @scala.inline
  def apply[T](getLength: () => Double, item: Double => T): KmlObjectList[T] = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), item = js.Any.fromFunction1(item))
    __obj.asInstanceOf[KmlObjectList[T]]
  }
  @scala.inline
  implicit class KmlObjectListOps[Self[t] <: KmlObjectList[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetLength(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

