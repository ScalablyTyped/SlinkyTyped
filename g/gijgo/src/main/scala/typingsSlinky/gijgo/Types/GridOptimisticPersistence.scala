package typingsSlinky.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOptimisticPersistence extends js.Object {
  var localStorage: js.Array[String] = js.native
  var sessionStorage: js.Array[String] = js.native
}

object GridOptimisticPersistence {
  @scala.inline
  def apply(localStorage: js.Array[String], sessionStorage: js.Array[String]): GridOptimisticPersistence = {
    val __obj = js.Dynamic.literal(localStorage = localStorage.asInstanceOf[js.Any], sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptimisticPersistence]
  }
  @scala.inline
  implicit class GridOptimisticPersistenceOps[Self <: GridOptimisticPersistence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalStorage(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionStorage(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionStorage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

