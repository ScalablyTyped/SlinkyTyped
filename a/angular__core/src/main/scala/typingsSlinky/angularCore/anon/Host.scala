package typingsSlinky.angularCore.anon

import typingsSlinky.typescript.mod.CompilerHost
import typingsSlinky.typescript.mod.ParsedCommandLine
import typingsSlinky.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Host extends StObject {
  
  var host: CompilerHost = js.native
  
  var parsed: ParsedCommandLine = js.native
  
  var program: Program = js.native
}
object Host {
  
  @scala.inline
  def apply(host: CompilerHost, parsed: ParsedCommandLine, program: Program): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
  
  @scala.inline
  implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: CompilerHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsed(value: ParsedCommandLine): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
  }
}
