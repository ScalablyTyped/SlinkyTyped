package typingsSlinky.dexie.anon

import org.scalajs.dom.raw.IDBFactory
import typingsSlinky.dexie.mod.Dexie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Addons extends js.Object {
  var IDBKeyRange: js.UndefOr[Instantiable] = js.native
  var addons: js.UndefOr[js.Array[js.Function1[/* db */ Dexie, Unit]]] = js.native
  var autoOpen: js.UndefOr[Boolean] = js.native
  var indexedDB: js.UndefOr[IDBFactory] = js.native
}

object Addons {
  @scala.inline
  def apply(): Addons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Addons]
  }
  @scala.inline
  implicit class AddonsOps[Self <: Addons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIDBKeyRange(value: Instantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDBKeyRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIDBKeyRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDBKeyRange")(js.undefined)
        ret
    }
    @scala.inline
    def withAddons(value: js.Array[js.Function1[/* db */ Dexie, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addons")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexedDB(value: IDBFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexedDB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexedDB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexedDB")(js.undefined)
        ret
    }
  }
  
}

