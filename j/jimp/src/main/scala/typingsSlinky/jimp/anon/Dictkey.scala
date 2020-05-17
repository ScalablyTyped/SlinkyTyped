package typingsSlinky.jimp.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jimp.jimpStrings.`before-change`
import typingsSlinky.jimp.jimpStrings.changed
import typingsSlinky.jimp.mod.ListenableName
import typingsSlinky.jimp.mod.ListenerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey[T /* <: ListenableName */]
  extends /* key */ StringDictionary[js.Any]
     with ListenerData[T] {
  var eventName: `before-change` | changed = js.native
  var methodName: T = js.native
}

object Dictkey {
  @scala.inline
  def apply[T](eventName: `before-change` | changed, methodName: T): Dictkey[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey[T]]
  }
  @scala.inline
  implicit class DictkeyOps[Self[t] <: Dictkey[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEventName(value: `before-change` | changed): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodName(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

