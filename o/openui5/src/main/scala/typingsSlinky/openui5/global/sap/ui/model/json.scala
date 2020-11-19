package typingsSlinky.openui5.global.sap.ui.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.model.json")
@js.native
object json extends js.Object {
  
  @js.native
  class JSONModel protected ()
    extends typingsSlinky.openui5.sap.ui.model.json.JSONModel {
    /**
      * Constructor for a new JSONModel.
      * @param oData either the URL where to load the JSON from or a JS object
      * @param bObserve whether to observe the JSON data for property changes (experimental)
      */
    def this(oData: js.Any) = this()
    def this(oData: js.Any, bObserve: Boolean) = this()
  }
}
