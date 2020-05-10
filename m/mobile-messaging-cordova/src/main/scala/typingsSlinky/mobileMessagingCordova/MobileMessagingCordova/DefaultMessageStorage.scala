package typingsSlinky.mobileMessagingCordova.MobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultMessageStorage extends js.Object {
  def delete(messageId: String, callback: js.Function0[Unit]): Unit = js.native
  def deleteAll(callback: js.Function0[Unit]): Unit = js.native
  def find(messageId: String, callback: js.Function1[/* message */ Message, Unit]): Unit = js.native
  def findAll(callback: js.Function1[/* messages */ js.Array[Message], Unit]): Unit = js.native
}

object DefaultMessageStorage {
  @scala.inline
  def apply(
    delete: (String, js.Function0[Unit]) => Unit,
    deleteAll: js.Function0[Unit] => Unit,
    find: (String, js.Function1[/* message */ Message, Unit]) => Unit,
    findAll: js.Function1[/* messages */ js.Array[Message], Unit] => Unit
  ): DefaultMessageStorage = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction2(delete), deleteAll = js.Any.fromFunction1(deleteAll), find = js.Any.fromFunction2(find), findAll = js.Any.fromFunction1(findAll))
    __obj.asInstanceOf[DefaultMessageStorage]
  }
  @scala.inline
  implicit class DefaultMessageStorageOps[Self <: DefaultMessageStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: (String, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteAll(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFind(value: (String, js.Function1[/* message */ Message, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFindAll(value: js.Function1[/* messages */ js.Array[Message], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findAll")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

