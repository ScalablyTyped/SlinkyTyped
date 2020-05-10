package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfigurableMapOptions extends js.Object {
  /** Initial map options. */
  var mapOptions: IMapOptions = js.native
  /** List of configuration modules to load. */
  var modules: js.Array[IConfigurableMapModule] = js.native
}

object IConfigurableMapOptions {
  @scala.inline
  def apply(mapOptions: IMapOptions, modules: js.Array[IConfigurableMapModule]): IConfigurableMapOptions = {
    val __obj = js.Dynamic.literal(mapOptions = mapOptions.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigurableMapOptions]
  }
  @scala.inline
  implicit class IConfigurableMapOptionsOps[Self <: IConfigurableMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMapOptions(value: IMapOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: js.Array[IConfigurableMapModule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

