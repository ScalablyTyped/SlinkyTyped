package typingsSlinky.sarif.mod

import typingsSlinky.sarif.mod.Log.version
import typingsSlinky.sarif.sarifStrings.`2Dot1Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Log extends StObject {
  
  /**
    * The URI of the JSON schema corresponding to the version.
    */
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.native
  
  /**
    * References to external property files that share data between runs.
    */
  var inlineExternalProperties: js.UndefOr[js.Array[ExternalProperties]] = js.native
  
  /**
    * Key/value pairs that provide additional information about the log file.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * The set of runs contained in this log file.
    */
  var runs: js.Array[Run] = js.native
  
  /**
    * The SARIF format version of this log file.
    */
  var version: version = js.native
}
object Log {
  
  @scala.inline
  def apply(runs: js.Array[Run], version: version): Log = {
    val __obj = js.Dynamic.literal(runs = runs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  
  @scala.inline
  implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
    @scala.inline
    def setInlineExternalProperties(value: js.Array[ExternalProperties]): Self = StObject.set(x, "inlineExternalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineExternalPropertiesUndefined: Self = StObject.set(x, "inlineExternalProperties", js.undefined)
    
    @scala.inline
    def setInlineExternalPropertiesVarargs(value: ExternalProperties*): Self = StObject.set(x, "inlineExternalProperties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRuns(value: js.Array[Run]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunsVarargs(value: Run*): Self = StObject.set(x, "runs", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
  
  type version = `2Dot1Dot0`
}
