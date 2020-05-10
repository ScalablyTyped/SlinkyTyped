package typingsSlinky.lovefield.mod.schema

import typingsSlinky.lovefield.mod.raw.BackStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectOptions extends js.Object {
  var onUpgrade: js.UndefOr[js.Function1[/* rawDb */ BackStore, js.Promise[Unit]]] = js.native
  var storeType: js.UndefOr[DataStoreType] = js.native
  var webSqlDbSize: js.UndefOr[Double] = js.native
}

object ConnectOptions {
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnUpgrade(value: /* rawDb */ BackStore => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpgrade")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreType(value: DataStoreType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeType")(js.undefined)
        ret
    }
    @scala.inline
    def withWebSqlDbSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSqlDbSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSqlDbSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSqlDbSize")(js.undefined)
        ret
    }
  }
  
}

