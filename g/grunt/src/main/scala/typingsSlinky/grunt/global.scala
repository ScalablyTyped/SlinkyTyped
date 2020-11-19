package typingsSlinky.grunt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /* GRUNT CONFIGURATION
    *********************/
  @js.native
  object grunt extends js.Object {
    
    @js.native
    object fail extends js.Object {
      
      @js.native
      object ErrorCode extends js.Object {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsSlinky.grunt.grunt.fail.ErrorCode with Double] = js.native
        
        /* 5 */ val Autocomplete: typingsSlinky.grunt.grunt.fail.ErrorCode.Autocomplete with Double = js.native
        
        /* 1 */ val Fatal: typingsSlinky.grunt.grunt.fail.ErrorCode.Fatal with Double = js.native
        
        /* 2 */ val MissingGruntfile: typingsSlinky.grunt.grunt.fail.ErrorCode.MissingGruntfile with Double = js.native
        
        /* 0 */ val NoError: typingsSlinky.grunt.grunt.fail.ErrorCode.NoError with Double = js.native
        
        /* 3 */ val Task: typingsSlinky.grunt.grunt.fail.ErrorCode.Task with Double = js.native
        
        /* 4 */ val Template: typingsSlinky.grunt.grunt.fail.ErrorCode.Template with Double = js.native
        
        /* 6 */ val Warning: typingsSlinky.grunt.grunt.fail.ErrorCode.Warning with Double = js.native
      }
    }
  }
  
  /**
    * {@link https://github.com/isaacs/minimatch}
    */
  @js.native
  object minimatch extends js.Object
}
