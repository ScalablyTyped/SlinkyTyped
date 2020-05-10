package typingsSlinky.pusherJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Members[T] extends js.Object {
  var count: Double = js.native
  var me: Member[T] = js.native
  var members: StringDictionary[Member[T]] = js.native
  var myID: String = js.native
  /**
    * Calls back for each member in unspecified order.
    */
  def each(callback: js.Function1[/* member */ Member[T], Unit]): Unit = js.native
  /**
    * Returns member's info for given id.
    *
    * Resulting object containts two fields - id and info.
    */
  def get(id: String): Null | T = js.native
}

object Members {
  @scala.inline
  def apply[T](
    count: Double,
    each: js.Function1[/* member */ Member[T], Unit] => Unit,
    get: String => Null | T,
    me: Member[T],
    members: StringDictionary[Member[T]],
    myID: String
  ): Members[T] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], each = js.Any.fromFunction1(each), get = js.Any.fromFunction1(get), me = me.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], myID = myID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Members[T]]
  }
  @scala.inline
  implicit class MembersOps[Self[t] <: Members[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEach(value: js.Function1[/* member */ Member[T], Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => Null | T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMe(value: Member[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("me")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers(value: StringDictionary[Member[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMyID(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("myID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

