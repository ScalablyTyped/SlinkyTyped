package typingsSlinky.gulpTypescript

import typingsSlinky.gulpTypescript.anon.Typeofts
import typingsSlinky.gulpTypescript.compilerMod.ICompiler
import typingsSlinky.gulpTypescript.inputMod.FileCache
import typingsSlinky.gulpTypescript.outputMod.Output
import typingsSlinky.gulpTypescript.reporterMod.Reporter
import typingsSlinky.gulpTypescript.typesMod.FinalTransformers
import typingsSlinky.gulpTypescript.typesMod.TsConfig
import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectMod {
  
  @JSImport("gulp-typescript/release/project", "setupProject")
  @js.native
  def setupProject(
    projectDirectory: String,
    configFileName: String,
    rawConfig: js.Any,
    config: TsConfig,
    options: CompilerOptions,
    projectReferences: js.Array[ProjectReference],
    typescript: Typeofts,
    finalTransformers: FinalTransformers
  ): Project = js.native
  
  @js.native
  trait ICompileStream extends ReadWriteStream {
    
    var dts: Readable = js.native
    
    @JSName("js")
    var js_ : Readable = js.native
  }
  
  @js.native
  trait Project extends StObject {
    
    def apply(): ICompileStream = js.native
    def apply(reporter: Reporter): ICompileStream = js.native
    
    val config: TsConfig = js.native
    
    val configFileName: String = js.native
    
    val options: CompilerOptions = js.native
    
    val projectDirectory: String = js.native
    
    val projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
    
    val rawConfig: js.Any = js.native
    
    def src(): ReadWriteStream = js.native
    
    val typescript: js.UndefOr[Typeofts] = js.native
  }
  
  @js.native
  trait ProjectInfo extends StObject {
    
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
    implicit class ProjectInfoMutableBuilder[Self <: ProjectInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompiler(value: ICompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: FileCache): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectReferences(value: js.Array[ProjectReference]): Self = StObject.set(x, "projectReferences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectReferencesVarargs(value: ProjectReference*): Self = StObject.set(x, "projectReferences", js.Array(value :_*))
      
      @scala.inline
      def setReporter(value: Reporter): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleOutput(value: Boolean): Self = StObject.set(x, "singleOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypescript(value: Typeofts): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
    }
  }
}
