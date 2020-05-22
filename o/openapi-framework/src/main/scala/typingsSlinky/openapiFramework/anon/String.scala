package typingsSlinky.openapiFramework.anon

import typingsSlinky.openapiTypes.mod.IJsonSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  var string: IJsonSchema
}

object String {
  @scala.inline
  def apply(string: IJsonSchema): String = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
}

