package typingsSlinky.googleProtobuf.descriptorPbMod.FileOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var ccEnableArenas: js.UndefOr[Boolean] = js.native
  var ccGenericServices: js.UndefOr[Boolean] = js.native
  var csharpNamespace: js.UndefOr[String] = js.native
  var deprecated: js.UndefOr[Boolean] = js.native
  var goPackage: js.UndefOr[String] = js.native
  var javaGenerateEqualsAndHash: js.UndefOr[Boolean] = js.native
  var javaGenericServices: js.UndefOr[Boolean] = js.native
  var javaMultipleFiles: js.UndefOr[Boolean] = js.native
  var javaOuterClassname: js.UndefOr[String] = js.native
  var javaPackage: js.UndefOr[String] = js.native
  var javaStringCheckUtf8: js.UndefOr[Boolean] = js.native
  var objcClassPrefix: js.UndefOr[String] = js.native
  var optimizeFor: js.UndefOr[OptimizeMode] = js.native
  var phpClassPrefix: js.UndefOr[String] = js.native
  var phpGenericServices: js.UndefOr[Boolean] = js.native
  var phpMetadataNamespace: js.UndefOr[String] = js.native
  var phpNamespace: js.UndefOr[String] = js.native
  var pyGenericServices: js.UndefOr[Boolean] = js.native
  var rubyPackage: js.UndefOr[String] = js.native
  var swiftPrefix: js.UndefOr[String] = js.native
  var uninterpretedOptionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUninterpretedOptionList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOptionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCcEnableArenas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccEnableArenas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcEnableArenas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccEnableArenas")(js.undefined)
        ret
    }
    @scala.inline
    def withCcGenericServices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccGenericServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcGenericServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccGenericServices")(js.undefined)
        ret
    }
    @scala.inline
    def withCsharpNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csharpNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsharpNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csharpNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
    @scala.inline
    def withGoPackage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withJavaGenerateEqualsAndHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaGenerateEqualsAndHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavaGenerateEqualsAndHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaGenerateEqualsAndHash")(js.undefined)
        ret
    }
    @scala.inline
    def withJavaGenericServices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaGenericServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavaGenericServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaGenericServices")(js.undefined)
        ret
    }
    @scala.inline
    def withJavaMultipleFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaMultipleFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavaMultipleFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaMultipleFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withJavaOuterClassname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaOuterClassname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavaOuterClassname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaOuterClassname")(js.undefined)
        ret
    }
    @scala.inline
    def withJavaPackage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavaPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withJavaStringCheckUtf8(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaStringCheckUtf8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavaStringCheckUtf8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaStringCheckUtf8")(js.undefined)
        ret
    }
    @scala.inline
    def withObjcClassPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objcClassPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjcClassPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objcClassPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeFor(value: OptimizeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeFor")(js.undefined)
        ret
    }
    @scala.inline
    def withPhpClassPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phpClassPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhpClassPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phpClassPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPhpGenericServices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phpGenericServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhpGenericServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phpGenericServices")(js.undefined)
        ret
    }
    @scala.inline
    def withPhpMetadataNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phpMetadataNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhpMetadataNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phpMetadataNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withPhpNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phpNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhpNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phpNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withPyGenericServices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyGenericServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPyGenericServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyGenericServices")(js.undefined)
        ret
    }
    @scala.inline
    def withRubyPackage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rubyPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRubyPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rubyPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withSwiftPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swiftPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwiftPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swiftPrefix")(js.undefined)
        ret
    }
  }
  
}

