package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapResultTupleOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" array of $.ig.OlapResultAxisMember objects which form the tuple object.
    */
  var members: js.UndefOr[js.Array[_]] = js.native
}
object OlapResultTupleOptions {
  
  @scala.inline
  def apply(): OlapResultTupleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapResultTupleOptions]
  }
  
  @scala.inline
  implicit class OlapResultTupleOptionsMutableBuilder[Self <: OlapResultTupleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: js.Any*): Self = StObject.set(x, "members", js.Array(value :_*))
  }
}
