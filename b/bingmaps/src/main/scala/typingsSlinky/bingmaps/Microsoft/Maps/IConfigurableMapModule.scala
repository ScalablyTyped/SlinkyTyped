package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfigurableMapModule extends js.Object {
  /** Name of the module to load. Supported values: "Microsoft.Maps.GeoXml", "Microsoft.Maps.GeoJson". */
  var moduleName: String = js.native
  /** A set of steps to execute after a module is loaded. */
  var moduleOptions: PostModuleAction | js.Array[PostModuleAction] = js.native
}

object IConfigurableMapModule {
  @scala.inline
  def apply(moduleName: String, moduleOptions: PostModuleAction | js.Array[PostModuleAction]): IConfigurableMapModule = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], moduleOptions = moduleOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigurableMapModule]
  }
  @scala.inline
  implicit class IConfigurableMapModuleOps[Self <: IConfigurableMapModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleOptions(value: PostModuleAction | js.Array[PostModuleAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

