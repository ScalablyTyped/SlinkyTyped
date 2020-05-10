package typingsSlinky.angularResource.mod.angularAugmentingMod.auto

import typingsSlinky.angularResource.angularResourceStrings.$resource
import typingsSlinky.angularResource.mod.angularAugmentingMod.resource.IResourceService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInjectorService extends js.Object {
  @JSName("get")
  def get_resource(name: $resource): IResourceService = js.native
}

object IInjectorService {
  @scala.inline
  def apply(get: $resource => IResourceService): IInjectorService = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[IInjectorService]
  }
  @scala.inline
  implicit class IInjectorServiceOps[Self <: IInjectorService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: $resource => IResourceService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

