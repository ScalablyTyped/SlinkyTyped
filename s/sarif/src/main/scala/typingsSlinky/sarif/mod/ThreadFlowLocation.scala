package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sarif.mod.ThreadFlowLocation.importance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadFlowLocation extends StObject {
  
  /**
    * An integer representing the temporal order in which execution reached this location.
    */
  var executionOrder: js.UndefOr[Double] = js.native
  
  /**
    * The Coordinated Universal Time (UTC) date and time at which this location was executed.
    */
  var executionTimeUtc: js.UndefOr[String] = js.native
  
  /**
    * Specifies the importance of this location in understanding the code flow in which it occurs. The order from most
    * to least important is "essential", "important", "unimportant". Default: "important".
    */
  var importance: js.UndefOr[importance] = js.native
  
  /**
    * The index within the run threadFlowLocations array.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * A set of distinct strings that categorize the thread flow location. Well-known kinds include 'acquire',
    * 'release', 'enter', 'exit', 'call', 'return', 'branch', 'implicit', 'false', 'true', 'caution', 'danger',
    * 'unknown', 'unreachable', 'taint', 'function', 'handler', 'lock', 'memory', 'resource', 'scope' and 'value'.
    */
  var kinds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The code location.
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * The name of the module that contains the code that is executing.
    */
  var module: js.UndefOr[String] = js.native
  
  /**
    * An integer representing a containment hierarchy within the thread flow.
    */
  var nestingLevel: js.UndefOr[Double] = js.native
  
  /**
    * Key/value pairs that provide additional information about the threadflow location.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * The call stack leading to this location.
    */
  var stack: js.UndefOr[Stack] = js.native
  
  /**
    * A dictionary, each of whose keys specifies a variable or expression, the associated value of which represents
    * the variable or expression value. For an annotation of kind 'continuation', for example, this dictionary might
    * hold the current assumed values of a set of global variables.
    */
  var state: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  
  /**
    * An array of references to rule or taxonomy reporting descriptors that are applicable to the thread flow
    * location.
    */
  var taxa: js.UndefOr[js.Array[ReportingDescriptorReference]] = js.native
  
  /**
    * A web request associated with this thread flow location.
    */
  var webRequest: js.UndefOr[WebRequest] = js.native
  
  /**
    * A web response associated with this thread flow location.
    */
  var webResponse: js.UndefOr[WebResponse] = js.native
}
object ThreadFlowLocation {
  
  @scala.inline
  def apply(): ThreadFlowLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreadFlowLocation]
  }
  
  @scala.inline
  implicit class ThreadFlowLocationMutableBuilder[Self <: ThreadFlowLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionOrder(value: Double): Self = StObject.set(x, "executionOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionOrderUndefined: Self = StObject.set(x, "executionOrder", js.undefined)
    
    @scala.inline
    def setExecutionTimeUtc(value: String): Self = StObject.set(x, "executionTimeUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionTimeUtcUndefined: Self = StObject.set(x, "executionTimeUtc", js.undefined)
    
    @scala.inline
    def setImportance(value: importance): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setKinds(value: js.Array[String]): Self = StObject.set(x, "kinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindsUndefined: Self = StObject.set(x, "kinds", js.undefined)
    
    @scala.inline
    def setKindsVarargs(value: String*): Self = StObject.set(x, "kinds", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    @scala.inline
    def setNestingLevel(value: Double): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setStack(value: Stack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setState(value: StringDictionary[MultiformatMessageString]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTaxa(value: js.Array[ReportingDescriptorReference]): Self = StObject.set(x, "taxa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxaUndefined: Self = StObject.set(x, "taxa", js.undefined)
    
    @scala.inline
    def setTaxaVarargs(value: ReportingDescriptorReference*): Self = StObject.set(x, "taxa", js.Array(value :_*))
    
    @scala.inline
    def setWebRequest(value: WebRequest): Self = StObject.set(x, "webRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebRequestUndefined: Self = StObject.set(x, "webRequest", js.undefined)
    
    @scala.inline
    def setWebResponse(value: WebResponse): Self = StObject.set(x, "webResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebResponseUndefined: Self = StObject.set(x, "webResponse", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sarif.sarifStrings.important
    - typingsSlinky.sarif.sarifStrings.essential
    - typingsSlinky.sarif.sarifStrings.unimportant
  */
  trait importance extends StObject
  object importance {
    
    @scala.inline
    def essential: typingsSlinky.sarif.sarifStrings.essential = "essential".asInstanceOf[typingsSlinky.sarif.sarifStrings.essential]
    
    @scala.inline
    def important: typingsSlinky.sarif.sarifStrings.important = "important".asInstanceOf[typingsSlinky.sarif.sarifStrings.important]
    
    @scala.inline
    def unimportant: typingsSlinky.sarif.sarifStrings.unimportant = "unimportant".asInstanceOf[typingsSlinky.sarif.sarifStrings.unimportant]
  }
}
