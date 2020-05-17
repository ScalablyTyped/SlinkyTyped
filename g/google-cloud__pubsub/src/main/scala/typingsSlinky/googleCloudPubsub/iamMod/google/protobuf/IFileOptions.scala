package typingsSlinky.googleCloudPubsub.iamMod.google.protobuf

import typingsSlinky.googleCloudPubsub.iamMod.google.protobuf.FileOptions.OptimizeMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FileOptions. */
@js.native
trait IFileOptions extends js.Object {
  /** FileOptions ccEnableArenas */
  var ccEnableArenas: js.UndefOr[Boolean | Null] = js.native
  /** FileOptions ccGenericServices */
  var ccGenericServices: js.UndefOr[Boolean | Null] = js.native
  /** FileOptions csharpNamespace */
  var csharpNamespace: js.UndefOr[String | Null] = js.native
  /** FileOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.native
  /** FileOptions goPackage */
  var goPackage: js.UndefOr[String | Null] = js.native
  /** FileOptions javaGenerateEqualsAndHash */
  var javaGenerateEqualsAndHash: js.UndefOr[Boolean | Null] = js.native
  /** FileOptions javaGenericServices */
  var javaGenericServices: js.UndefOr[Boolean | Null] = js.native
  /** FileOptions javaMultipleFiles */
  var javaMultipleFiles: js.UndefOr[Boolean | Null] = js.native
  /** FileOptions javaOuterClassname */
  var javaOuterClassname: js.UndefOr[String | Null] = js.native
  /** FileOptions javaPackage */
  var javaPackage: js.UndefOr[String | Null] = js.native
  /** FileOptions javaStringCheckUtf8 */
  var javaStringCheckUtf8: js.UndefOr[Boolean | Null] = js.native
  /** FileOptions objcClassPrefix */
  var objcClassPrefix: js.UndefOr[String | Null] = js.native
  /** FileOptions optimizeFor */
  var optimizeFor: js.UndefOr[OptimizeMode | Null] = js.native
  /** FileOptions phpClassPrefix */
  var phpClassPrefix: js.UndefOr[String | Null] = js.native
  /** FileOptions pyGenericServices */
  var pyGenericServices: js.UndefOr[Boolean | Null] = js.native
  /** FileOptions swiftPrefix */
  var swiftPrefix: js.UndefOr[String | Null] = js.native
  /** FileOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.native
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
    def withCcEnableArenasNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccEnableArenas")(null)
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
    def withCcGenericServicesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccGenericServices")(null)
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
    def withCsharpNamespaceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csharpNamespace")(null)
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
    def withDeprecatedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(null)
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
    def withGoPackageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goPackage")(null)
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
    def withJavaGenerateEqualsAndHashNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaGenerateEqualsAndHash")(null)
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
    def withJavaGenericServicesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaGenericServices")(null)
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
    def withJavaMultipleFilesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaMultipleFiles")(null)
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
    def withJavaOuterClassnameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaOuterClassname")(null)
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
    def withJavaPackageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaPackage")(null)
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
    def withJavaStringCheckUtf8Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaStringCheckUtf8")(null)
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
    def withObjcClassPrefixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objcClassPrefix")(null)
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
    def withOptimizeForNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeFor")(null)
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
    def withPhpClassPrefixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phpClassPrefix")(null)
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
    def withPyGenericServicesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyGenericServices")(null)
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
    @scala.inline
    def withSwiftPrefixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swiftPrefix")(null)
        ret
    }
    @scala.inline
    def withUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninterpretedOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(js.undefined)
        ret
    }
    @scala.inline
    def withUninterpretedOptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(null)
        ret
    }
  }
  
}

