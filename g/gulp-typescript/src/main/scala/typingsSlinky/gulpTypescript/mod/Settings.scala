package typingsSlinky.gulpTypescript.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.gulpTypescript.anon.Typeofts
import typingsSlinky.gulpTypescript.typesMod.GetCustomTransformers
import typingsSlinky.typescript.mod.CustomTransformers
import typingsSlinky.typescript.mod.ModuleKind
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.ScriptTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings
  extends /* name */ StringDictionary[js.Any] {
  var allowNonTsExtensions: js.UndefOr[Boolean] = js.native
  var charset: js.UndefOr[String] = js.native
  var codepage: js.UndefOr[Double] = js.native
  var declaration: js.UndefOr[Boolean] = js.native
  var declarationFiles: js.UndefOr[Boolean] = js.native
  var experimentalDecorators: js.UndefOr[Boolean] = js.native
  var getCustomTransformers: js.UndefOr[GetCustomTransformers] = js.native
  var isolatedModules: js.UndefOr[Boolean] = js.native
  var jsx: js.UndefOr[String | Double] = js.native
  var lib: js.UndefOr[js.Array[String]] = js.native
  var locale: js.UndefOr[String] = js.native
  var mapRoot: js.UndefOr[String] = js.native
  var module: js.UndefOr[String | ModuleKind] = js.native
  var moduleResolution: js.UndefOr[String | Double] = js.native
  var noEmitOnError: js.UndefOr[Boolean] = js.native
  var noExternalResolve: js.UndefOr[Boolean] = js.native
  var noImplicitAny: js.UndefOr[Boolean] = js.native
  var noLib: js.UndefOr[Boolean] = js.native
  var noLibCheck: js.UndefOr[Boolean] = js.native
  var noResolve: js.UndefOr[Boolean] = js.native
  var out: js.UndefOr[String] = js.native
  var outDir: js.UndefOr[String] = js.native
  var outFile: js.UndefOr[String] = js.native
  var preserveConstEnums: js.UndefOr[Boolean] = js.native
  var removeComments: js.UndefOr[Boolean] = js.native
  var rootDir: js.UndefOr[String] = js.native
  var rootDirs: js.UndefOr[js.Any] = js.native
  var sortOutput: js.UndefOr[Boolean] = js.native
  var sourceRoot: js.UndefOr[String] = js.native
  var suppressImplicitAnyIndexErrors: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[String | ScriptTarget] = js.native
  var typescript: js.UndefOr[Typeofts] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNonTsExtensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNonTsExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNonTsExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNonTsExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(js.undefined)
        ret
    }
    @scala.inline
    def withCodepage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodepage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepage")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclaration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclarationFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarationFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclarationFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarationFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentalDecorators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalDecorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentalDecorators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalDecorators")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCustomTransformersFunction1(value: /* program */ js.UndefOr[Program] => js.UndefOr[CustomTransformers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomTransformers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCustomTransformers(value: GetCustomTransformers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomTransformers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetCustomTransformers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomTransformers")(js.undefined)
        ret
    }
    @scala.inline
    def withIsolatedModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolatedModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsolatedModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolatedModules")(js.undefined)
        ret
    }
    @scala.inline
    def withJsx(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsx")(js.undefined)
        ret
    }
    @scala.inline
    def withLib(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lib")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMapRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withModule(value: String | ModuleKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleResolution(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withNoEmitOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmitOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEmitOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmitOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withNoExternalResolve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExternalResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoExternalResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExternalResolve")(js.undefined)
        ret
    }
    @scala.inline
    def withNoImplicitAny(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitAny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoImplicitAny: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitAny")(js.undefined)
        ret
    }
    @scala.inline
    def withNoLib(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoLib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLib")(js.undefined)
        ret
    }
    @scala.inline
    def withNoLibCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLibCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoLibCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLibCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResolve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResolve")(js.undefined)
        ret
    }
    @scala.inline
    def withOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.undefined)
        ret
    }
    @scala.inline
    def withOutDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDir")(js.undefined)
        ret
    }
    @scala.inline
    def withOutFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFile")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveConstEnums(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveConstEnums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveConstEnums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveConstEnums")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeComments")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDirs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDirs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirs")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressImplicitAnyIndexErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressImplicitAnyIndexErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressImplicitAnyIndexErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressImplicitAnyIndexErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String | ScriptTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTypescript(value: Typeofts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypescript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescript")(js.undefined)
        ret
    }
  }
  
}

