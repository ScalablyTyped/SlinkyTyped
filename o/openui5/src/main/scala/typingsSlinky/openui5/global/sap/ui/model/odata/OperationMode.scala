package typingsSlinky.openui5.global.sap.ui.model.odata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.model.odata.OperationMode")
@js.native
object OperationMode extends js.Object {
  
  /**
    * With OperationMode "Auto", operations are either processed on the client or on the server, depending
    * on the given binding threshold.Please be aware, that the combination of OperationMode.Auto and
    * CountMode.None is not supported.There are two possibilities which can happen, when using the "Auto"
    * mode, depending on the configured "CountMode":1. CountMode "Request" and "Both"Initially the binding
    * will issue a $count request without any filters/sorters.a) If the count is lower or equal to the
    * threshold, the binding will behave like in operation mode "Client", and a data request for all
    * entries is issued.b) If the count exceeds the threshold, the binding will behave like in operation
    * mode "Server".2. CountModes "Inline" or "InlineRepeat"The initial request tries to fetch as many
    * entries as the configured threshold, without any filters/sorters. In addition a $inlinecount is
    * added.The binding assumes, that the threshold given by the application can be met. If this is not
    * the case additional data requests might be needed.So the application has to have the necessary
    * confidence that the threshold is high enough to make sure, that the data is not requested twice.a)
    * If this request returns fewer (or just as many) entries as the threshold, the binding will behave
    * exactly like when usingthe "Client" operation mode. Initially configured filters/sorters will be
    * applied afterwards on the client.b) If the $inlinecount is higher than the threshold, the binding
    * will behave like in operation mode "Server". In this case a new data requestcontaining the initially
    * set filters/sorters will be issued.
    */
  var Auto: js.Any = js.native
  
  /**
    * Operations are executed on the client, all entries must be avilable to be able to do so.The initial
    * request fetches the complete collection, filtering and sorting does not trigger further requests
    */
  var Client: js.Any = js.native
  
  /**
    * Operations are executed on the Odata service, by appending corresponding URL parameters ($filter,
    * $orderby).Each change in filtering or sorting is triggering a new request to the server.
    */
  var Server: js.Any = js.native
}
