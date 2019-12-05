package typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.OneofDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.OneofOptions.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    name: String = null,
    options: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.OneofOptions.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

