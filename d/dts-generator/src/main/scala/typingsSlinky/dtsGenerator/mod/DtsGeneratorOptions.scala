package typingsSlinky.dtsGenerator.mod

import typingsSlinky.typescript.mod.ModuleResolutionKind
import typingsSlinky.typescript.mod.ScriptTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DtsGeneratorOptions extends js.Object {
  /**
    * The base directory for the package being bundled. Any dependencies discovered outside this directory will be excluded
    * from the bundle.
    * Note this is no longer the preferred way to configure dts-generator, please see project.
    */
  var baseDir: js.UndefOr[String] = js.native
  /** The end-of-line character that should be used when outputting code. Defaults to os.EOL. */
  var eol: js.UndefOr[String] = js.native
  /**
    * A list of glob patterns, relative to baseDir, that should be excluded from the bundle.
    * Use the --exclude flag one or more times on the command-line. Defaults to [ "node_modules\/ **\/ *.d.ts" ].
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of external module reference paths that should be inserted as reference comments.
    * Use the --extern flag one or more times on the command-line.
    */
  var externs: js.UndefOr[js.Array[String]] = js.native
  /** A list of files from the baseDir to bundle. */
  var files: js.UndefOr[js.Array[String]] = js.native
  /** The character(s) that should be used to indent the declarations in the output. Defaults to \t. */
  var indent: js.UndefOr[String] = js.native
  /** The module ID that should be used as the exported value of the package’s “main” module. */
  var main: js.UndefOr[String] = js.native
  /** The type of module resolution to use when generating the bundle. */
  var moduleResolution: js.UndefOr[ModuleResolutionKind] = js.native
  /** The name of the package. Used to determine the correct exported package name for modules. */
  var name: String = js.native
  /** The filename where the generated bundle will be created. */
  var out: String = js.native
  /**
    * The base directory for the project being bundled. It is assumed that this directory contains a
    * tsconfig.json which will be parsed to determine the files that should be bundled as well as
    * other configuration information like target
    */
  var project: js.UndefOr[String] = js.native
  /**
    * An optional callback provided by the invoker to customize the declared module ids the output d.ts files.
    * @see {@link https://github.com/SitePen/dts-generator/blob/master/docs/resolving-module-ids.md Resolving Module Ids}
    */
  var resolveModuleId: js.UndefOr[js.Function1[/* params */ ResolveModuleIdParams, String]] = js.native
  /**
    * An optional callback provided by the invoker to customize the imported module ids in the output d.ts files.
    * @see {@link https://github.com/SitePen/dts-generator/blob/master/docs/resolving-module-ids.md Resolving Module Ids}
    */
  var resolveModuleImport: js.UndefOr[js.Function1[/* params */ ResolveModuleImportParams, String]] = js.native
  /** The target environment for generated code. Defaults to ts.ScriptTarget.Latest. */
  var target: js.UndefOr[ScriptTarget] = js.native
  /**
    * A list of external @types package dependencies that should be inserted as reference comments.
    * Use the --types flag one or more times on the command-line.
    */
  var types: js.UndefOr[js.Array[String]] = js.native
}

object DtsGeneratorOptions {
  @scala.inline
  def apply(name: String, out: String): DtsGeneratorOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtsGeneratorOptions]
  }
  @scala.inline
  implicit class DtsGeneratorOptionsOps[Self <: DtsGeneratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(js.undefined)
        ret
    }
    @scala.inline
    def withEol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externs")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withMain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleResolution(value: ModuleResolutionKind): Self = {
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
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveModuleId(value: /* params */ ResolveModuleIdParams => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResolveModuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleId")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveModuleImport(value: /* params */ ResolveModuleImportParams => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleImport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResolveModuleImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleImport")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: ScriptTarget): Self = {
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
    def withTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

