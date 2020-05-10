package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sarif.mod.ThreadFlowLocation.importance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadFlowLocation_ extends js.Object {
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

object ThreadFlowLocation_ {
  @scala.inline
  def apply(): ThreadFlowLocation_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreadFlowLocation_]
  }
  @scala.inline
  implicit class ThreadFlowLocation_Ops[Self <: ThreadFlowLocation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionTimeUtc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionTimeUtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionTimeUtc")(js.undefined)
        ret
    }
    @scala.inline
    def withImportance(value: importance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importance")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withKinds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinds")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(js.undefined)
        ret
    }
    @scala.inline
    def withNestingLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: Stack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: StringDictionary[MultiformatMessageString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxa(value: js.Array[ReportingDescriptorReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxa")(js.undefined)
        ret
    }
    @scala.inline
    def withWebRequest(value: WebRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withWebResponse(value: WebResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webResponse")(js.undefined)
        ret
    }
  }
  
}

