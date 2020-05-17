package typingsSlinky.googleCloudPubsub.pubsubMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MethodDescriptorProto. */
@js.native
trait IMethodDescriptorProto extends js.Object {
  /** MethodDescriptorProto clientStreaming */
  var clientStreaming: js.UndefOr[Boolean | Null] = js.native
  /** MethodDescriptorProto inputType */
  var inputType: js.UndefOr[String | Null] = js.native
  /** MethodDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.native
  /** MethodDescriptorProto options */
  var options: js.UndefOr[IMethodOptions | Null] = js.native
  /** MethodDescriptorProto outputType */
  var outputType: js.UndefOr[String | Null] = js.native
  /** MethodDescriptorProto serverStreaming */
  var serverStreaming: js.UndefOr[Boolean | Null] = js.native
}

object IMethodDescriptorProto {
  @scala.inline
  def apply(): IMethodDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMethodDescriptorProto]
  }
  @scala.inline
  implicit class IMethodDescriptorProtoOps[Self <: IMethodDescriptorProto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientStreaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientStreaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientStreaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientStreaming")(js.undefined)
        ret
    }
    @scala.inline
    def withClientStreamingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientStreaming")(null)
        ret
    }
    @scala.inline
    def withInputType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(js.undefined)
        ret
    }
    @scala.inline
    def withInputTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(null)
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
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withOptions(value: IMethodOptions): Self = {
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
    def withOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(null)
        ret
    }
    @scala.inline
    def withOutputType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputType")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputType")(null)
        ret
    }
    @scala.inline
    def withServerStreaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverStreaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerStreaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverStreaming")(js.undefined)
        ret
    }
    @scala.inline
    def withServerStreamingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverStreaming")(null)
        ret
    }
  }
  
}

