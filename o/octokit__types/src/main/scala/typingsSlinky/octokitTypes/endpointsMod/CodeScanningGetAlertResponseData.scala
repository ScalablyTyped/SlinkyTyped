package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Dictk
import typingsSlinky.octokitTypes.anon.Severity
import typingsSlinky.octokitTypes.anon.Version
import typingsSlinky.octokitTypes.octokitTypesStrings.`false positive`
import typingsSlinky.octokitTypes.octokitTypesStrings.`used in tests`
import typingsSlinky.octokitTypes.octokitTypesStrings.`wonApostrophet fix`
import typingsSlinky.octokitTypes.octokitTypesStrings.dismissed
import typingsSlinky.octokitTypes.octokitTypesStrings.fixed
import typingsSlinky.octokitTypes.octokitTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeScanningGetAlertResponseData extends StObject {
  
  /**
    * The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var created_at: String = js.native
  
  /**
    * The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var dismissed_at: String = js.native
  
  var dismissed_by: Dictk | Null = js.native
  
  /**
    * **Required when the state is dismissed.** The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`, and `used in tests`.
    */
  var dismissed_reason: (`false positive`) | (`wonApostrophet fix`) | (`used in tests`) | Null = js.native
  
  /**
    * The GitHub URL of the alert resource.
    */
  var html_url: String = js.native
  
  var instances: js.Array[_] = js.native
  
  /**
    * The code scanning alert number.
    */
  var number: Double = js.native
  
  var rule: Severity = js.native
  
  /**
    * State of a code scanning alert.
    */
  var state: open | dismissed | fixed = js.native
  
  var tool: Version = js.native
  
  /**
    * The REST API URL of the alert resource.
    */
  var url: String = js.native
}
object CodeScanningGetAlertResponseData {
  
  @scala.inline
  def apply(
    created_at: String,
    dismissed_at: String,
    html_url: String,
    instances: js.Array[_],
    number: Double,
    rule: Severity,
    state: open | dismissed | fixed,
    tool: Version,
    url: String
  ): CodeScanningGetAlertResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], dismissed_at = dismissed_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningGetAlertResponseData]
  }
  
  @scala.inline
  implicit class CodeScanningGetAlertResponseDataMutableBuilder[Self <: CodeScanningGetAlertResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissed_at(value: String): Self = StObject.set(x, "dismissed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissed_by(value: Dictk): Self = StObject.set(x, "dismissed_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissed_byNull: Self = StObject.set(x, "dismissed_by", null)
    
    @scala.inline
    def setDismissed_reason(value: (`false positive`) | (`wonApostrophet fix`) | (`used in tests`)): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissed_reasonNull: Self = StObject.set(x, "dismissed_reason", null)
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstances(value: js.Array[_]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesVarargs(value: js.Any*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: Severity): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: open | dismissed | fixed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTool(value: Version): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
