package typingsSlinky.grunt.grunt

import typingsSlinky.grunt.grunt.fail.ErrorCode
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("grunt.fail")
@js.native
object fail extends js.Object {
  @js.native
  sealed trait ErrorCode extends js.Object
  
  @js.native
  trait FailModule extends js.Object {
    /**
      * Display a warning and abort Grunt immediately.
      */
    def fatal(error: java.lang.String): Unit = js.native
    def fatal(error: java.lang.String, errorCode: ErrorCode): Unit = js.native
    def fatal(error: Error): Unit = js.native
    def fatal(error: Error, errorCode: ErrorCode): Unit = js.native
    /**
      * Display a warning and abort Grunt immediately.
      * Grunt will continue processing tasks if the --force command-line option was specified.
      */
    def warn(error: java.lang.String): Unit = js.native
    def warn(error: java.lang.String, errorCode: ErrorCode): Unit = js.native
    def warn(error: Error): Unit = js.native
    def warn(error: Error, errorCode: ErrorCode): Unit = js.native
  }
  
  @js.native
  object ErrorCode extends js.Object {
    @js.native
    sealed trait Autocomplete extends ErrorCode
    
    @js.native
    sealed trait Fatal extends ErrorCode
    
    @js.native
    sealed trait MissingGruntfile extends ErrorCode
    
    @js.native
    sealed trait NoError extends ErrorCode
    
    @js.native
    sealed trait Task extends ErrorCode
    
    @js.native
    sealed trait Template extends ErrorCode
    
    @js.native
    sealed trait Warning extends ErrorCode
    
    /* 5 */ val Autocomplete: typingsSlinky.grunt.grunt.fail.ErrorCode.Autocomplete with Double = js.native
    /* 1 */ val Fatal: typingsSlinky.grunt.grunt.fail.ErrorCode.Fatal with Double = js.native
    /* 2 */ val MissingGruntfile: typingsSlinky.grunt.grunt.fail.ErrorCode.MissingGruntfile with Double = js.native
    /* 0 */ val NoError: typingsSlinky.grunt.grunt.fail.ErrorCode.NoError with Double = js.native
    /* 3 */ val Task: typingsSlinky.grunt.grunt.fail.ErrorCode.Task with Double = js.native
    /* 4 */ val Template: typingsSlinky.grunt.grunt.fail.ErrorCode.Template with Double = js.native
    /* 6 */ val Warning: typingsSlinky.grunt.grunt.fail.ErrorCode.Warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorCode with Double] = js.native
  }
  
}

