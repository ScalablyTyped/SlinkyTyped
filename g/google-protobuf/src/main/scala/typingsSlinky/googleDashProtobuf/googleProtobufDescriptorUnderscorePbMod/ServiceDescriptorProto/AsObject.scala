package typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var methodList: js.Array[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProto.AsObject
  ]
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[
    typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.ServiceOptions.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    methodList: js.Array[
      typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProto.AsObject
    ],
    name: String = null,
    options: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.ServiceOptions.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(methodList = methodList.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

