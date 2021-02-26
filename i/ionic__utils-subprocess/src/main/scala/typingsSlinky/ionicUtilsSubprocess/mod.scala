package typingsSlinky.ionicUtilsSubprocess

import typingsSlinky.ionicUtilsSubprocess.anon.ForkOptionsPickSpawnOptio
import typingsSlinky.ionicUtilsSubprocess.anon.PromisevoidpChildProcess
import typingsSlinky.ionicUtilsSubprocess.anon.ReadonlySpawnOptions
import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.childProcessMod.SpawnOptions
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-subprocess", "ERROR_COMMAND_NOT_FOUND")
  @js.native
  val ERROR_COMMAND_NOT_FOUND: /* "ERR_SUBPROCESS_COMMAND_NOT_FOUND" */ String = js.native
  
  @JSImport("@ionic/utils-subprocess", "ERROR_NON_ZERO_EXIT")
  @js.native
  val ERROR_NON_ZERO_EXIT: /* "ERR_SUBPROCESS_NON_ZERO_EXIT" */ String = js.native
  
  @JSImport("@ionic/utils-subprocess", "ERROR_SIGNAL_EXIT")
  @js.native
  val ERROR_SIGNAL_EXIT: /* "ERR_SUBPROCESS_SIGNAL_EXIT" */ String = js.native
  
  @JSImport("@ionic/utils-subprocess", "Subprocess")
  @js.native
  class Subprocess protected () extends StObject {
    def this(name: String, args: js.Array[String]) = this()
    def this(name: String, args: js.Array[String], options: SubprocessOptions) = this()
    
    var _options: SpawnOptions = js.native
    
    var args: js.Array[String] = js.native
    
    def bashify(): String = js.native
    def bashify(hasMaskArgv0MaskArgv1ShiftArgv0: SubprocessBashifyOptions): String = js.native
    
    def bashifyArg(arg: String): String = js.native
    
    def combinedOutput(): js.Promise[String] = js.native
    
    def maskArg(arg: String): String = js.native
    
    var name: String = js.native
    
    def options: ReadonlySpawnOptions = js.native
    
    def output(): js.Promise[String] = js.native
    
    val path: js.UndefOr[String] = js.native
    
    def run(): PromisevoidpChildProcess = js.native
    
    def spawn(): ChildProcess = js.native
  }
  
  @JSImport("@ionic/utils-subprocess", "SubprocessError")
  @js.native
  class SubprocessError protected () extends Error {
    def this(message: String) = this()
    
    var code: js.UndefOr[/* "ERR_SUBPROCESS_COMMAND_NOT_FOUND" */ String] = js.native
    
    var error: js.UndefOr[js.Error] = js.native
    
    var exitCode: js.UndefOr[Double] = js.native
    
    var output: js.UndefOr[String] = js.native
    
    var signal: js.UndefOr[String] = js.native
    
    @JSName("stack")
    var stack_SubprocessError: String = js.native
  }
  
  @JSImport("@ionic/utils-subprocess", "TILDE_PATH_REGEX")
  @js.native
  val TILDE_PATH_REGEX: js.RegExp = js.native
  
  @JSImport("@ionic/utils-subprocess", "convertPATH")
  @js.native
  def convertPATH(): String = js.native
  @JSImport("@ionic/utils-subprocess", "convertPATH")
  @js.native
  def convertPATH(path: String): String = js.native
  
  @JSImport("@ionic/utils-subprocess", "expandTildePath")
  @js.native
  def expandTildePath(p: String): String = js.native
  
  @JSImport("@ionic/utils-subprocess", "findExecutables")
  @js.native
  def findExecutables(program: String): js.Promise[js.Array[String]] = js.native
  @JSImport("@ionic/utils-subprocess", "findExecutables")
  @js.native
  def findExecutables(program: String, hasPATHPATHEXT: WhichOptions): js.Promise[js.Array[String]] = js.native
  
  @JSImport("@ionic/utils-subprocess", "fork")
  @js.native
  def fork(modulePath: String): ChildProcess = js.native
  @JSImport("@ionic/utils-subprocess", "fork")
  @js.native
  def fork(modulePath: String, args: js.UndefOr[scala.Nothing], options: ForkOptionsPickSpawnOptio): ChildProcess = js.native
  @JSImport("@ionic/utils-subprocess", "fork")
  @js.native
  def fork(modulePath: String, args: js.Array[String]): ChildProcess = js.native
  @JSImport("@ionic/utils-subprocess", "fork")
  @js.native
  def fork(modulePath: String, args: js.Array[String], options: ForkOptionsPickSpawnOptio): ChildProcess = js.native
  
  @JSImport("@ionic/utils-subprocess", "spawn")
  @js.native
  def spawn(command: String): ChildProcess = js.native
  @JSImport("@ionic/utils-subprocess", "spawn")
  @js.native
  def spawn(command: String, args: js.UndefOr[scala.Nothing], options: SpawnOptions): ChildProcess = js.native
  @JSImport("@ionic/utils-subprocess", "spawn")
  @js.native
  def spawn(command: String, args: js.Array[String]): ChildProcess = js.native
  @JSImport("@ionic/utils-subprocess", "spawn")
  @js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  
  @JSImport("@ionic/utils-subprocess", "which")
  @js.native
  def which(program: String): js.Promise[String] = js.native
  @JSImport("@ionic/utils-subprocess", "which")
  @js.native
  def which(program: String, hasPATHPATHEXT: WhichOptions): js.Promise[String] = js.native
  
  @js.native
  trait SubprocessBashifyOptions extends StObject {
    
    /**
      * Mask file path to first argument.
      *
      * The first argument to subprocesses is the program name or path, e.g.
      * `/path/to/bin/my-program`. If `true`, `bashify()` will return the program
      * name without a file path, e.g. `my-program`.
      *
      * The default is `true`.
      */
    var maskArgv0: js.UndefOr[Boolean] = js.native
    
    /**
      * Mask file path to second argument.
      *
      * In some subprocesses, the second argument is a script file to run, e.g.
      * `node ./scripts/post-install`. If `true`, `bashify()` will return the
      * script name without a file path, e.g. `node post-install`.
      *
      * The default is `false`.
      */
    var maskArgv1: js.UndefOr[Boolean] = js.native
    
    /**
      * Remove the first argument from output.
      *
      * Useful to make a command such as `node ./scripts/post-install` appear as
      * simply `post-install`.
      *
      * The default is `false`.
      */
    var shiftArgv0: js.UndefOr[Boolean] = js.native
  }
  object SubprocessBashifyOptions {
    
    @scala.inline
    def apply(): SubprocessBashifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubprocessBashifyOptions]
    }
    
    @scala.inline
    implicit class SubprocessBashifyOptionsMutableBuilder[Self <: SubprocessBashifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaskArgv0(value: Boolean): Self = StObject.set(x, "maskArgv0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskArgv0Undefined: Self = StObject.set(x, "maskArgv0", js.undefined)
      
      @scala.inline
      def setMaskArgv1(value: Boolean): Self = StObject.set(x, "maskArgv1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskArgv1Undefined: Self = StObject.set(x, "maskArgv1", js.undefined)
      
      @scala.inline
      def setShiftArgv0(value: Boolean): Self = StObject.set(x, "shiftArgv0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftArgv0Undefined: Self = StObject.set(x, "shiftArgv0", js.undefined)
    }
  }
  
  type SubprocessOptions = SpawnOptions
  
  @js.native
  trait WhichOptions extends StObject {
    
    var PATH: js.UndefOr[String] = js.native
    
    var PATHEXT: js.UndefOr[String] = js.native
  }
  object WhichOptions {
    
    @scala.inline
    def apply(): WhichOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhichOptions]
    }
    
    @scala.inline
    implicit class WhichOptionsMutableBuilder[Self <: WhichOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPATH(value: String): Self = StObject.set(x, "PATH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPATHEXT(value: String): Self = StObject.set(x, "PATHEXT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPATHEXTUndefined: Self = StObject.set(x, "PATHEXT", js.undefined)
      
      @scala.inline
      def setPATHUndefined: Self = StObject.set(x, "PATH", js.undefined)
    }
  }
}
