package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VendorPropertiesFallback[TLength]
  extends VendorLonghandPropertiesFallback[TLength]
     with VendorShorthandPropertiesFallback[TLength]

object VendorPropertiesFallback {
  @scala.inline
  def apply[TLength](): VendorPropertiesFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorPropertiesFallback[TLength]]
  }
}

