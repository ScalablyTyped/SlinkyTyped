package typingsSlinky.breeze.breeze.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdapterInstancesConfig extends js.Object {
  /** the name of a previously registered "ajax" adapter */
  var ajax: js.UndefOr[String] = js.native
  /** the name of a previously registered "dataService" adapter */
  var dataService: js.UndefOr[String] = js.native
  /** the name of a previously registered "modelLibrary" adapter */
  var modelLibary: js.UndefOr[String] = js.native
  /** the name of a previously registered "uriBuilder" adapter */
  var uriBuilder: js.UndefOr[String] = js.native
}

object AdapterInstancesConfig {
  @scala.inline
  def apply(): AdapterInstancesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdapterInstancesConfig]
  }
  @scala.inline
  implicit class AdapterInstancesConfigOps[Self <: AdapterInstancesConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.undefined)
        ret
    }
    @scala.inline
    def withDataService(value: String): Self = {
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
    def withModelLibary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelLibary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelLibary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelLibary")(js.undefined)
        ret
    }
    @scala.inline
    def withUriBuilder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriBuilder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUriBuilder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriBuilder")(js.undefined)
        ret
    }
  }
  
}

