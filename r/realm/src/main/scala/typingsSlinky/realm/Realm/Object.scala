package typingsSlinky.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Object.html }
  */
@js.native
trait Object extends js.Object {
  /**
    * @returns void
    */
  def addListener(callback: ObjectChangeCallback): Unit = js.native
  /**
    * @returns boolean
    */
  def isValid(): Boolean = js.native
  /**
    * @returns Results<T>
    */
  def linkingObjects[T](objectType: String, property: String): Results[T with Object] = js.native
  /**
    * @returns number
    */
  def linkingObjectsCount(): Double = js.native
  /**
    * @returns ObjectSchema
    */
  def objectSchema(): ObjectSchema = js.native
  def removeAllListeners(): Unit = js.native
  def removeListener(callback: ObjectChangeCallback): Unit = js.native
}

object Object {
  @scala.inline
  def apply(
    addListener: ObjectChangeCallback => Unit,
    isValid: () => Boolean,
    linkingObjects: (String, String) => Results[js.Any with Object],
    linkingObjectsCount: () => Double,
    objectSchema: () => ObjectSchema,
    removeAllListeners: () => Unit,
    removeListener: ObjectChangeCallback => Unit
  ): Object = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), isValid = js.Any.fromFunction0(isValid), linkingObjects = js.Any.fromFunction2(linkingObjects), linkingObjectsCount = js.Any.fromFunction0(linkingObjectsCount), objectSchema = js.Any.fromFunction0(objectSchema), removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  implicit class ObjectOps[Self <: Object] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddListener(value: ObjectChangeCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsValid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLinkingObjects(value: (String, String) => Results[js.Any with Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkingObjects")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLinkingObjectsCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkingObjectsCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObjectSchema(value: () => ObjectSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveAllListeners(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveListener(value: ObjectChangeCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

