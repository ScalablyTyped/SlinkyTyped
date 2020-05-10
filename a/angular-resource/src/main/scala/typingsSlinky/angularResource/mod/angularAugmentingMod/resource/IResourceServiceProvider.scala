package typingsSlinky.angularResource.mod.angularAugmentingMod.resource

import typingsSlinky.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// IResourceServiceProvider used to configure global settings
@js.native
trait IResourceServiceProvider extends IServiceProvider {
  var defaults: IResourceOptions = js.native
}

object IResourceServiceProvider {
  @scala.inline
  def apply($get: js.Any, defaults: IResourceOptions): IResourceServiceProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceServiceProvider]
  }
  @scala.inline
  implicit class IResourceServiceProviderOps[Self <: IResourceServiceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: IResourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

