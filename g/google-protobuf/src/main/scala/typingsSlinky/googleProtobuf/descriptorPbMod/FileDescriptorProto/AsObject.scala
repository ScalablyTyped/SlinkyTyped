package typingsSlinky.googleProtobuf.descriptorPbMod.FileDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var dependencyList: js.Array[String] = js.native
  var enumTypeList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject] = js.native
  var extensionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject] = js.native
  var messageTypeList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.AsObject] = js.native
  var name: js.UndefOr[String] = js.native
  var options: js.UndefOr[typingsSlinky.googleProtobuf.descriptorPbMod.FileOptions.AsObject] = js.native
  var pb_package: js.UndefOr[String] = js.native
  var publicDependencyList: js.Array[Double] = js.native
  var serviceList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.ServiceDescriptorProto.AsObject] = js.native
  var sourceCodeInfo: js.UndefOr[typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.AsObject] = js.native
  var syntax: js.UndefOr[String] = js.native
  var weakDependencyList: js.Array[Double] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    dependencyList: js.Array[String],
    enumTypeList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject],
    extensionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject],
    messageTypeList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.AsObject],
    publicDependencyList: js.Array[Double],
    serviceList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.ServiceDescriptorProto.AsObject],
    weakDependencyList: js.Array[Double]
  ): AsObject = {
    val __obj = js.Dynamic.literal(dependencyList = dependencyList.asInstanceOf[js.Any], enumTypeList = enumTypeList.asInstanceOf[js.Any], extensionList = extensionList.asInstanceOf[js.Any], messageTypeList = messageTypeList.asInstanceOf[js.Any], publicDependencyList = publicDependencyList.asInstanceOf[js.Any], serviceList = serviceList.asInstanceOf[js.Any], weakDependencyList = weakDependencyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencyList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnumTypeList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumTypeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageTypeList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTypeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicDependencyList(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicDependencyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.ServiceDescriptorProto.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeakDependencyList(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weakDependencyList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: typingsSlinky.googleProtobuf.descriptorPbMod.FileOptions.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPb_package(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pb_package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPb_package: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pb_package")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCodeInfo(value: typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCodeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSyntax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyntax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(js.undefined)
        ret
    }
  }
  
}

