package typingsSlinky.handbrakeJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Stderr extends StObject {
    
    var stderr: String = js.native
    
    var stdout: String = js.native
  }
  object Stderr {
    
    @scala.inline
    def apply(stderr: String, stdout: String): Stderr = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stderr]
    }
    
    @scala.inline
    implicit class StderrMutableBuilder[Self <: Stderr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
}
