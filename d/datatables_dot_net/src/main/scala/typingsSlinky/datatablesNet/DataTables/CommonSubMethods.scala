package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "util-methods"
@js.native
trait CommonSubMethods extends js.Object {
  /**
    * Get the DataTables cached data for the selected cell
    *
    * @param t Specify which cache the data should be read from. Can take one of two values: search or order
    */
  def cache(t: String): Api = js.native
}

object CommonSubMethods {
  @scala.inline
  def apply(cache: String => Api): CommonSubMethods = {
    val __obj = js.Dynamic.literal(cache = js.Any.fromFunction1(cache))
    __obj.asInstanceOf[CommonSubMethods]
  }
  @scala.inline
  implicit class CommonSubMethodsOps[Self <: CommonSubMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: String => Api): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

