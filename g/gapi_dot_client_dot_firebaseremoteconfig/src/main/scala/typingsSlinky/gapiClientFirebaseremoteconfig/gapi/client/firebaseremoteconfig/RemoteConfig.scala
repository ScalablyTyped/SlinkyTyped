package typingsSlinky.gapiClientFirebaseremoteconfig.gapi.client.firebaseremoteconfig

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteConfig extends js.Object {
  
  /**
    * The list of named conditions. The order &#42;does&#42; affect the semantics.
    * The condition_name values of these entries must be unique.
    *
    * The resolved value of a config parameter P is determined as follow:
    * &#42; Let Y be the set of values from the submap of P that refer to conditions
    * that evaluate to <code>true</code>.
    * &#42; If Y is non empty, the value is taken from the specific submap in Y whose
    * condition_name is the earliest in this condition list.
    * &#42; Else, if P has a default value option (condition_name is empty) then
    * the value is taken from that option.
    * &#42; Else, parameter P has no value and is omitted from the config result.
    *
    * Example: parameter key "p1", default value "v1", submap specified as
    * {"c1": v2, "c2": v3} where "c1" and "c2" are names of conditions in the
    * condition list (where "c1" in this example appears before "c2").  The
    * value of p1 would be v2 as long as c1 is true.  Otherwise, if c2 is true,
    * p1 would evaluate to v3, and if c1 and c2 are both false, p1 would evaluate
    * to v1.  If no default value was specified, and c1 and c2 were both false,
    * no value for p1 would be generated.
    */
  var conditions: js.UndefOr[js.Array[RemoteConfigCondition]] = js.native
  
  /**
    * Map of parameter keys to their optional default values and optional submap
    * of (condition name : value). Order doesn't affect semantics, and so is
    * sorted by the server. The 'key' values of the params must be unique.
    */
  var parameters: js.UndefOr[Record[String, RemoteConfigParameter]] = js.native
}
object RemoteConfig {
  
  @scala.inline
  def apply(): RemoteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteConfig]
  }
  
  @scala.inline
  implicit class RemoteConfigOps[Self <: RemoteConfig] (val x: Self) extends AnyVal {
    
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
    def setConditionsVarargs(value: RemoteConfigCondition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[RemoteConfigCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setParameters(value: Record[String, RemoteConfigParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
