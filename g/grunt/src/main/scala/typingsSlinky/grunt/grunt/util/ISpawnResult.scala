package typingsSlinky.grunt.grunt.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @note When result is coerced to a string, the value is stdout if the exit code
  *       was zero, the fallback if the exit code was non-zero and a fallback was
  *       specified, or stderr if the exit code was non-zero and a fallback was
  *       not specified.
  */
@js.native
trait ISpawnResult extends js.Object {
  
  var code: Double = js.native
  
  var stderr: String = js.native
  
  var stdout: String = js.native
}
object ISpawnResult {
  
  @scala.inline
  def apply(code: Double, stderr: String, stdout: String): ISpawnResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpawnResult]
  }
  
  @scala.inline
  implicit class ISpawnResultOps[Self <: ISpawnResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderr(value: String): Self = this.set("stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdout(value: String): Self = this.set("stdout", value.asInstanceOf[js.Any])
  }
}
