package typingsSlinky.datatablesNetButtons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DataTables {
  type ButtonSelectorTypes = java.lang.String | scala.Double | typingsSlinky.datatablesNet.JQuery
  /**
    * A function that will be executed upon creation of the buttons.
    */
  type FunctionButtom = js.Function1[
    /* dt */ typingsSlinky.datatablesNetButtons.DataTables.Api, 
    typingsSlinky.datatablesNetButtons.DataTables.ButtomSettingsCommon
  ]
  type FunctionButtonAction = js.Function4[
    /* e */ js.Any, 
    /* dt */ typingsSlinky.datatablesNetButtons.DataTables.Api, 
    /* node */ typingsSlinky.datatablesNet.JQuery, 
    /* config */ typingsSlinky.datatablesNetButtons.DataTables.ButtonSettings, 
    scala.Unit
  ]
  type FunctionButtonAvailable = js.Function2[
    /* dt */ typingsSlinky.datatablesNetButtons.DataTables.Api, 
    /* config */ js.Any, 
    scala.Boolean
  ]
  type FunctionButtonColvisColumnText = js.Function3[
    /* dt */ typingsSlinky.datatablesNetButtons.DataTables.Api, 
    /* i */ scala.Double, 
    /* title */ java.lang.String, 
    java.lang.String
  ]
  type FunctionButtonCustomize = js.Function1[/* win */ typingsSlinky.std.Window_ | java.lang.String, scala.Unit]
  type FunctionButtonCustomizeData = js.Function1[/* content */ js.Any, scala.Unit]
  type FunctionButtonInit = js.Function3[
    /* dt */ typingsSlinky.datatablesNetButtons.DataTables.Api, 
    /* node */ typingsSlinky.datatablesNet.JQuery, 
    /* config */ js.Any, 
    scala.Unit
  ]
  type FunctionButtonText = js.Function3[
    /* dt */ typingsSlinky.datatablesNetButtons.DataTables.Api, 
    /* node */ typingsSlinky.datatablesNet.JQuery, 
    /* config */ js.Any, 
    java.lang.String
  ]
  type FunctionExtButtonsCollectionText = js.Function1[/* a */ js.Any, java.lang.String]
}
