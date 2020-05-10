package typingsSlinky.dialogflow.mod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FileDescriptorProto. */
@js.native
trait IFileDescriptorProto extends js.Object {
  /** FileDescriptorProto package */
  @JSName("package")
  var _package: js.UndefOr[String | Null] = js.native
  /** FileDescriptorProto dependency */
  var dependency: js.UndefOr[js.Array[String] | Null] = js.native
  /** FileDescriptorProto enumType */
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto] | Null] = js.native
  /** FileDescriptorProto extension */
  var extension: js.UndefOr[js.Array[IFieldDescriptorProto] | Null] = js.native
  /** FileDescriptorProto messageType */
  var messageType: js.UndefOr[js.Array[IDescriptorProto] | Null] = js.native
  /** FileDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.native
  /** FileDescriptorProto options */
  var options: js.UndefOr[IFileOptions | Null] = js.native
  /** FileDescriptorProto publicDependency */
  var publicDependency: js.UndefOr[js.Array[Double] | Null] = js.native
  /** FileDescriptorProto service */
  var service: js.UndefOr[js.Array[IServiceDescriptorProto] | Null] = js.native
  /** FileDescriptorProto sourceCodeInfo */
  var sourceCodeInfo: js.UndefOr[ISourceCodeInfo | Null] = js.native
  /** FileDescriptorProto syntax */
  var syntax: js.UndefOr[String | Null] = js.native
  /** FileDescriptorProto weakDependency */
  var weakDependency: js.UndefOr[js.Array[Double] | Null] = js.native
}

object IFileDescriptorProto {
  @scala.inline
  def apply(): IFileDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileDescriptorProto]
  }
  @scala.inline
  implicit class IFileDescriptorProtoOps[Self <: IFileDescriptorProto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_package: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(js.undefined)
        ret
    }
    @scala.inline
    def with_packageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(null)
        ret
    }
    @scala.inline
    def withDependency(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependency")(js.undefined)
        ret
    }
    @scala.inline
    def withDependencyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependency")(null)
        ret
    }
    @scala.inline
    def withEnumType(value: js.Array[IEnumDescriptorProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnumType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumType")(js.undefined)
        ret
    }
    @scala.inline
    def withEnumTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumType")(null)
        ret
    }
    @scala.inline
    def withExtension(value: js.Array[IFieldDescriptorProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(null)
        ret
    }
    @scala.inline
    def withMessageType(value: js.Array[IDescriptorProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(null)
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
    def withOptions(value: IFileOptions): Self = {
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
    def withPublicDependency(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicDependency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicDependency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicDependency")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicDependencyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicDependency")(null)
        ret
    }
    @scala.inline
    def withService(value: js.Array[IServiceDescriptorProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(null)
        ret
    }
    @scala.inline
    def withSourceCodeInfo(value: ISourceCodeInfo): Self = {
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
    def withSourceCodeInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeInfo")(null)
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
    @scala.inline
    def withSyntaxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(null)
        ret
    }
    @scala.inline
    def withWeakDependency(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weakDependency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeakDependency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weakDependency")(js.undefined)
        ret
    }
    @scala.inline
    def withWeakDependencyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weakDependency")(null)
        ret
    }
  }
  
}

