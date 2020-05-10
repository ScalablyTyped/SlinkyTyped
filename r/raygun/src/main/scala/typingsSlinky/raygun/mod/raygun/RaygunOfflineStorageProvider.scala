package typingsSlinky.raygun.mod.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaygunOfflineStorageProvider[TTransportItem, TStorageItem] extends js.Object {
  def init(options: js.Any): RaygunOfflineStorageProvider[RaygunPayload, String] = js.native
  def retrieve(callback: js.Function2[/* error */ js.Error, /* storageItems */ js.Array[TStorageItem], Unit]): Unit = js.native
  def save(item: TTransportItem, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def send(callback: js.Function2[/* error */ js.Error, /* sendItems */ js.Array[TStorageItem], Unit]): Unit = js.native
}

object RaygunOfflineStorageProvider {
  @scala.inline
  def apply[TTransportItem, TStorageItem](
    init: js.Any => RaygunOfflineStorageProvider[RaygunPayload, String],
    retrieve: js.Function2[/* error */ js.Error, /* storageItems */ js.Array[TStorageItem], Unit] => Unit,
    save: (TTransportItem, js.Function1[/* error */ js.UndefOr[js.Error], Unit]) => Unit,
    send: js.Function2[/* error */ js.Error, /* sendItems */ js.Array[TStorageItem], Unit] => Unit
  ): RaygunOfflineStorageProvider[TTransportItem, TStorageItem] = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), retrieve = js.Any.fromFunction1(retrieve), save = js.Any.fromFunction2(save), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[RaygunOfflineStorageProvider[TTransportItem, TStorageItem]]
  }
  @scala.inline
  implicit class RaygunOfflineStorageProviderOps[Self[ttransportitem, tstorageitem] <: RaygunOfflineStorageProvider[ttransportitem, tstorageitem], TTransportItem, TStorageItem] (val x: Self[TTransportItem, TStorageItem]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTransportItem, TStorageItem] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTransportItem, TStorageItem]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TTransportItem, TStorageItem]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TTransportItem, TStorageItem]) with Other]
    @scala.inline
    def withInit(value: js.Any => RaygunOfflineStorageProvider[RaygunPayload, String]): Self[TTransportItem, TStorageItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRetrieve(value: js.Function2[/* error */ js.Error, /* storageItems */ js.Array[TStorageItem], Unit] => Unit): Self[TTransportItem, TStorageItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSave(value: (TTransportItem, js.Function1[/* error */ js.UndefOr[js.Error], Unit]) => Unit): Self[TTransportItem, TStorageItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSend(value: js.Function2[/* error */ js.Error, /* sendItems */ js.Array[TStorageItem], Unit] => Unit): Self[TTransportItem, TStorageItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

