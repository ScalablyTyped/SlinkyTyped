package typingsSlinky.devextreme.mod.DevExpress.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalStoreOptions extends ArrayStoreOptions[LocalStore] {
  /** Specifies a delay in milliseconds between when data changes and the moment these changes are saved in the local storage. Applies only if immediate is false. */
  var flushInterval: js.UndefOr[Double] = js.native
  /** Specifies whether the LocalStore saves changes in the local storage immediately. */
  var immediate: js.UndefOr[Boolean] = js.native
  /** Specifies the name under which data should be saved in the local storage. The `dx-data-localStore-` prefix will be added to the name. */
  var name: js.UndefOr[String] = js.native
}

object LocalStoreOptions {
  @scala.inline
  def apply(): LocalStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalStoreOptions]
  }
  @scala.inline
  implicit class LocalStoreOptionsOps[Self <: LocalStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlushInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlushInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withImmediate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

