package typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The changed args object which is emitted by an observable map.
  */
@js.native
trait IChangedArgs[T] extends js.Object {
  /**
    * The key of the change.
    */
  var key: String = js.native
  /**
    * The new value of the change.
    */
  var newValue: js.UndefOr[T] = js.native
  /**
    * The old value of the change.
    */
  var oldValue: js.UndefOr[T] = js.native
  /**
    * The type of change undergone by the map.
    */
  var `type`: ChangeType = js.native
}

object IChangedArgs {
  @scala.inline
  def apply[T](key: String, `type`: ChangeType): IChangedArgs[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
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
    def withKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ChangeType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOldValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(js.undefined)
        ret
    }
  }
  
}

