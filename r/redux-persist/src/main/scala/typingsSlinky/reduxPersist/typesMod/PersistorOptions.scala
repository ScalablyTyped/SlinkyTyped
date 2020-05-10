package typingsSlinky.reduxPersist.typesMod

import typingsSlinky.redux.mod.StoreEnhancer
import typingsSlinky.redux.mod.StoreEnhancerStoreCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistorOptions extends js.Object {
  var enhancer: js.UndefOr[StoreEnhancer[_, js.Object]] = js.native
}

object PersistorOptions {
  @scala.inline
  def apply(): PersistorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistorOptions]
  }
  @scala.inline
  implicit class PersistorOptionsOps[Self <: PersistorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnhancer(
      value: /* next */ StoreEnhancerStoreCreator[js.Object, js.Object] => StoreEnhancerStoreCreator[_, js.Object]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancer")(js.undefined)
        ret
    }
  }
  
}

