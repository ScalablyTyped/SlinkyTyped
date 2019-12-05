package typingsSlinky.packageDashJson.packageDashJsonMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageNotFoundErrorClass extends Error {
  @JSName("name")
  val name_PackageNotFoundErrorClass: typingsSlinky.packageDashJson.packageDashJsonStrings.PackageNotFoundError
}

object PackageNotFoundErrorClass {
  @scala.inline
  def apply(
    message: String,
    name: typingsSlinky.packageDashJson.packageDashJsonStrings.PackageNotFoundError,
    stack: String = null
  ): PackageNotFoundErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageNotFoundErrorClass]
  }
}

