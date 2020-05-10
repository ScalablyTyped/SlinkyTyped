package typingsSlinky.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocalStorage extends js.Object {
  var localStorage: js.UndefOr[js.Any] = js.native
}

object AnonLocalStorage {
  @scala.inline
  def apply(): AnonLocalStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLocalStorage]
  }
  @scala.inline
  implicit class AnonLocalStorageOps[Self <: AnonLocalStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalStorage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(js.undefined)
        ret
    }
  }
  
}

