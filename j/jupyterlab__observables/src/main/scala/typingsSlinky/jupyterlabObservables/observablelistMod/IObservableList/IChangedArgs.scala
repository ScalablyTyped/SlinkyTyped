package typingsSlinky.jupyterlabObservables.observablelistMod.IObservableList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The changed args object which is emitted by an observable list.
  */
@js.native
trait IChangedArgs[T] extends js.Object {
  /**
    * The new index associated with the change.
    */
  var newIndex: Double = js.native
  /**
    * The new values associated with the change.
    *
    * #### Notes
    * The values will be contiguous starting at the `newIndex`.
    */
  var newValues: js.Array[T] = js.native
  /**
    * The old index associated with the change.
    */
  var oldIndex: Double = js.native
  /**
    * The old values associated with the change.
    *
    * #### Notes
    * The values will be contiguous starting at the `oldIndex`.
    */
  var oldValues: js.Array[T] = js.native
  /**
    * The type of change undergone by the vector.
    */
  var `type`: ChangeType = js.native
}

object IChangedArgs {
  @scala.inline
  def apply[T](
    newIndex: Double,
    newValues: js.Array[T],
    oldIndex: Double,
    oldValues: js.Array[T],
    `type`: ChangeType
  ): IChangedArgs[T] = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], newValues = newValues.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldValues = oldValues.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs[T]]
  }
  @scala.inline
  implicit class IChangedArgsOps[Self[t] <: IChangedArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNewIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValues(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValues(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ChangeType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

