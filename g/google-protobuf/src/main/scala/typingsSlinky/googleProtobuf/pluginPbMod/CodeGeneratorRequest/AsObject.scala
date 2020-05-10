package typingsSlinky.googleProtobuf.pluginPbMod.CodeGeneratorRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var compilerVersion: js.UndefOr[typingsSlinky.googleProtobuf.pluginPbMod.Version.AsObject] = js.native
  var fileToGenerateList: js.Array[String] = js.native
  var parameter: js.UndefOr[String] = js.native
  var protoFileList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    fileToGenerateList: js.Array[String],
    protoFileList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(fileToGenerateList = fileToGenerateList.asInstanceOf[js.Any], protoFileList = protoFileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileToGenerateList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileToGenerateList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtoFileList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protoFileList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilerVersion(value: typingsSlinky.googleProtobuf.pluginPbMod.Version.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(js.undefined)
        ret
    }
  }
  
}

