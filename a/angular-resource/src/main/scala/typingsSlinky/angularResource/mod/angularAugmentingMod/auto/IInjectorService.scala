package typingsSlinky.angularResource.mod.angularAugmentingMod.auto

import typingsSlinky.angularResource.angularResourceStrings.$resource
import typingsSlinky.angularResource.mod.angularAugmentingMod.resource.IResourceService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInjectorService extends js.Object {
  @JSName("get")
  def get_resource(name: $resource): IResourceService
}

object IInjectorService {
  @scala.inline
  def apply(get: $resource => IResourceService): IInjectorService = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[IInjectorService]
  }
}

