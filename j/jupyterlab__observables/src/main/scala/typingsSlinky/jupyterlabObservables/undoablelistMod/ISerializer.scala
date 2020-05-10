package typingsSlinky.jupyterlabObservables.undoablelistMod

import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISerializer[T] extends js.Object {
  /**
    * Deserialize the object from JSON.
    */
  def fromJSON(value: JSONValue): T = js.native
  /**
    * Convert the object to JSON.
    */
  def toJSON(value: T): JSONValue = js.native
}

object ISerializer {
  @scala.inline
  def apply[T](fromJSON: JSONValue => T, toJSON: T => JSONValue): ISerializer[T] = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[ISerializer[T]]
  }
  @scala.inline
  implicit class ISerializerOps[Self[t] <: ISerializer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFromJSON(value: JSONValue => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromJSON")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: T => JSONValue): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

