package typingsSlinky.openui5.global.sap.ui.model.odata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.model.odata.CountMode")
@js.native
object CountMode extends js.Object {
  
  /**
    * Count is retrieved by a separate request upfront and inline with each data request
    */
  var Both: js.Any = js.native
  
  /**
    * Count is retrieved by adding $inlinecount=allpages and is included in the data request
    */
  var Inline: js.Any = js.native
  
  /**
    * Count is retrieved by adding $inlinecount=allpages and is included in every data request
    */
  var InlineRepeat: js.Any = js.native
  
  /**
    * Count is not requested from the server
    */
  var None: js.Any = js.native
  
  /**
    * Count is retrieved by sending a separate $count request, before requesting data
    */
  var Request: js.Any = js.native
}
