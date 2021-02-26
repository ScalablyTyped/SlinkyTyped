package typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogEntrySourceLocation extends StObject {
  
  /** Optional. Source file name. Depending on the runtime environment, this might be a simple name or a fully-qualified name. */
  var file: js.UndefOr[String] = js.native
  
  /**
    * Optional. Human-readable name of the function or method being invoked, with optional context such as the class or package name. This information may be used in contexts such as the
    * logs viewer, where a file and line number are less meaningful. The format can vary by language. For example: qual.if.ied.Class.method (Java), dir/package.func (Go), function
    * (Python).
    */
  var function: js.UndefOr[String] = js.native
  
  /** Optional. Line within the source file. 1-based; 0 indicates no line number available. */
  var line: js.UndefOr[String] = js.native
}
object LogEntrySourceLocation {
  
  @scala.inline
  def apply(): LogEntrySourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEntrySourceLocation]
  }
  
  @scala.inline
  implicit class LogEntrySourceLocationMutableBuilder[Self <: LogEntrySourceLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    @scala.inline
    def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
