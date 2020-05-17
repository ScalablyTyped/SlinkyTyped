package typingsSlinky.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceName extends js.Object {
  var dataService: typingsSlinky.breeze.breeze.DataService = js.native
  var resourceName: String = js.native
}

object ResourceName {
  @scala.inline
  def apply(dataService: typingsSlinky.breeze.breeze.DataService, resourceName: String): ResourceName = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceName]
  }
  @scala.inline
  implicit class ResourceNameOps[Self <: ResourceName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataService(value: typingsSlinky.breeze.breeze.DataService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

