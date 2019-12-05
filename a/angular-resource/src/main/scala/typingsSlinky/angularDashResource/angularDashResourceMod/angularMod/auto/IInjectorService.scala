package typingsSlinky.angularDashResource.angularDashResourceMod.angularMod.auto

import typingsSlinky.angularDashResource.angularDashResourceMod.angularMod.resource.IResourceService
import typingsSlinky.angularDashResource.angularDashResourceStrings.DOLLARresource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInjectorService extends js.Object {
  @JSName("get")
  def get_resource(name: DOLLARresource): IResourceService
}

object IInjectorService {
  @scala.inline
  def apply(get: DOLLARresource => IResourceService): IInjectorService = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[IInjectorService]
  }
}

