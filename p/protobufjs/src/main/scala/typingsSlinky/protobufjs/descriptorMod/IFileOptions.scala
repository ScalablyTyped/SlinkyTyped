package typingsSlinky.protobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileOptions extends js.Object {
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
  var optimizeFor: js.UndefOr[IFileOptionsOptimizeMode] = js.native
  var pyGenericServices: js.UndefOr[Boolean] = js.native
}

object IFileOptions {
  @scala.inline
  def apply(): IFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileOptions]
  }
  @scala.inline
  implicit class IFileOptionsOps[Self <: IFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOptimizeFor(value: IFileOptionsOptimizeMode): Self = {
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
  }
  
}

