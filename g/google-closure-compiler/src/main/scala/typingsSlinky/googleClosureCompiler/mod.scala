package typingsSlinky.googleClosureCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("google-closure-compiler", "compiler")
  @js.native
  class compiler protected () extends Compiler_ {
    def this(opts: js.Array[String]) = this()
    def this(opts: CompileOptions) = this()
    def this(opts: js.Array[String], extraCommandArgs: js.Array[String]) = this()
    def this(opts: CompileOptions, extraCommandArgs: js.Array[String]) = this()
  }
  object compiler {
    
    @JSImport("google-closure-compiler", "compiler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("google-closure-compiler", "compiler.COMPILER_PATH")
    @js.native
    def COMPILER_PATH: String = js.native
    @scala.inline
    def COMPILER_PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPILER_PATH")(x.asInstanceOf[js.Any])
    
    @JSImport("google-closure-compiler", "compiler.CONTRIB_PATH")
    @js.native
    def CONTRIB_PATH: String = js.native
    @scala.inline
    def CONTRIB_PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTRIB_PATH")(x.asInstanceOf[js.Any])
    
    @JSImport("google-closure-compiler", "compiler.JAR_PATH")
    @js.native
    def JAR_PATH: String = js.native
    @scala.inline
    def JAR_PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JAR_PATH")(x.asInstanceOf[js.Any])
  }
  
  type CompileOption = String | Boolean
  
  type CompileOptions = js.Array[String] | (StringDictionary[CompileOption | js.Array[CompileOption]])
  
  @js.native
  trait Compiler_ extends StObject {
    
    def getFullCommand(): String = js.native
    
    var javaPath: String = js.native
    
    def logger(args: js.Any*): Unit = js.native
    
    def run(): ChildProcess = js.native
    def run(callback: js.Function3[/* exitCode */ Double, /* stdout */ String, /* stderr */ String, Unit]): ChildProcess = js.native
    
    var spawnOptions: StringDictionary[String] = js.native
  }
  
  // The "json_streams" compiler flag lets the compiler accept/produce
  // arrays of JSON objects in this shape for input/output.
  @js.native
  trait JSONStreamFile extends StObject {
    
    var path: String = js.native
    
    var src: String = js.native
    
    var srcmap: js.UndefOr[String] = js.native
  }
  object JSONStreamFile {
    
    @scala.inline
    def apply(path: String, src: String): JSONStreamFile = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONStreamFile]
    }
    
    @scala.inline
    implicit class JSONStreamFileMutableBuilder[Self <: JSONStreamFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcmap(value: String): Self = StObject.set(x, "srcmap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcmapUndefined: Self = StObject.set(x, "srcmap", js.undefined)
    }
  }
}
