package typingsSlinky.gulpTypescript.projectMod

import typingsSlinky.gulpTypescript.Typeofts
import typingsSlinky.gulpTypescript.compilerMod.ICompiler
import typingsSlinky.gulpTypescript.inputMod.FileCache
import typingsSlinky.gulpTypescript.outputMod.Output
import typingsSlinky.gulpTypescript.reporterMod.Reporter
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectInfo extends js.Object {
  var compiler: ICompiler = js.native
  var directory: String = js.native
  var input: FileCache = js.native
  var options: CompilerOptions = js.native
  var output: Output = js.native
  var projectReferences: js.Array[ProjectReference] = js.native
  var reporter: Reporter = js.native
  var singleOutput: Boolean = js.native
  var typescript: Typeofts = js.native
}

object ProjectInfo {
  @scala.inline
  def apply(
    compiler: ICompiler,
    directory: String,
    input: FileCache,
    options: CompilerOptions,
    output: Output,
    projectReferences: js.Array[ProjectReference],
    reporter: Reporter,
    singleOutput: Boolean,
    typescript: Typeofts
  ): ProjectInfo = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], projectReferences = projectReferences.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], singleOutput = singleOutput.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectInfo]
  }
  @scala.inline
  implicit class ProjectInfoOps[Self <: ProjectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompiler(value: ICompiler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: FileCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: CompilerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: Output): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectReferences(value: js.Array[ProjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReporter(value: Reporter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypescript(value: Typeofts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescript")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

