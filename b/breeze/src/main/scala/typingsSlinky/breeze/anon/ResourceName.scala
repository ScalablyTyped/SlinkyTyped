package typingsSlinky.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceName extends js.Object {
  var dataService: typingsSlinky.breeze.breeze.DataService
  var resourceName: String
}

object ResourceName {
  @scala.inline
  def apply(dataService: typingsSlinky.breeze.breeze.DataService, resourceName: String): ResourceName = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceName]
  }
}

