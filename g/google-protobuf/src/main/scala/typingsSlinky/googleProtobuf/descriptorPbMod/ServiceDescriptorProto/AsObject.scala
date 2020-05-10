package typingsSlinky.googleProtobuf.descriptorPbMod.ServiceDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var methodList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.MethodDescriptorProto.AsObject] = js.native
  var name: js.UndefOr[String] = js.native
  var options: js.UndefOr[typingsSlinky.googleProtobuf.descriptorPbMod.ServiceOptions.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(methodList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.MethodDescriptorProto.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(methodList = methodList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethodList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.MethodDescriptorProto.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodList")(value.asInstanceOf[js.Any])
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
    def withOptions(value: typingsSlinky.googleProtobuf.descriptorPbMod.ServiceOptions.AsObject): Self = {
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
  }
  
}

