package typingsSlinky.minecraftScriptingTypesShared

import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.event_data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventData[T] extends IMinecraftObject {
  /**
    * The identifier of the event
    */
  val __identifier__ : String = js.native
  /**
    * The type of the object
    */
  val __type__ : event_data = js.native
  var data: T = js.native
}

object IEventData {
  @scala.inline
  def apply[T](__identifier__ : String, __type__ : event_data, data: T): IEventData[T] = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventData[T]]
  }
  @scala.inline
  implicit class IEventDataOps[Self[t] <: IEventData[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with__identifier__(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__identifier__")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__type__(value: event_data): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__type__")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

