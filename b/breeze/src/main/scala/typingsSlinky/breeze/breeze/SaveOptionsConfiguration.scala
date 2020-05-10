package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveOptionsConfiguration extends js.Object {
  var allowConcurrentSaves: js.UndefOr[Boolean] = js.native
  var dataService: js.UndefOr[DataService] = js.native
  var resourceName: js.UndefOr[String] = js.native
  var tag: js.UndefOr[js.Object] = js.native
}

object SaveOptionsConfiguration {
  @scala.inline
  def apply(): SaveOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptionsConfiguration]
  }
  @scala.inline
  implicit class SaveOptionsConfigurationOps[Self <: SaveOptionsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowConcurrentSaves(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowConcurrentSaves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowConcurrentSaves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowConcurrentSaves")(js.undefined)
        ret
    }
    @scala.inline
    def withDataService(value: DataService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataService")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

