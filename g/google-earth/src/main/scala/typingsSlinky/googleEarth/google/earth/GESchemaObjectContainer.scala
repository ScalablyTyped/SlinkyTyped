package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GESchemaObjectContainer[T /* <: KmlObject */] extends js.Object {
  /**
    * Adds a node to the end of the list of children of a specified feature.
    * Returns the appended object.
    */
  def appendChild(`object`: T): Unit = js.native
  /**
    * List of features (for KmlContainer), or list of features, styles, and schemas (for KmlDocument).
    * Returns true if there are any child nodes.
    */
  def getChildNodes(): KmlObjectList[T] = js.native
  /**
    * First child in the list of objects.
    */
  def getFirstChild(): T = js.native
  /**
    * Last child in the list of objects.
    */
  def getLastChild(): T = js.native
  /**
    * Returns true if the container is not empty.
    */
  def hasChildNodes(): Boolean = js.native
  /**
    * Inserts a child before the referenced child in the list of objects.
    */
  def insertBefore(newChild: T, refChild: T): Unit = js.native
  /**
    * Removes a node from the list of children of a specified object.
    */
  def removeChild(oldChild: T): Unit = js.native
  /**
    * Replaces existing child in the list of features.
    * Returns the old child.
    */
  def replaceChild(newChild: T, oldChild: T): Unit = js.native
}

object GESchemaObjectContainer {
  @scala.inline
  def apply[T](
    appendChild: T => Unit,
    getChildNodes: () => KmlObjectList[T],
    getFirstChild: () => T,
    getLastChild: () => T,
    hasChildNodes: () => Boolean,
    insertBefore: (T, T) => Unit,
    removeChild: T => Unit,
    replaceChild: (T, T) => Unit
  ): GESchemaObjectContainer[T] = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), getChildNodes = js.Any.fromFunction0(getChildNodes), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild))
    __obj.asInstanceOf[GESchemaObjectContainer[T]]
  }
  @scala.inline
  implicit class GESchemaObjectContainerOps[Self[t] <: GESchemaObjectContainer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAppendChild(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChildNodes(value: () => KmlObjectList[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFirstChild(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirstChild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLastChild(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastChild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasChildNodes(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertBefore(value: (T, T) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveChild(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceChild(value: (T, T) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChild")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

