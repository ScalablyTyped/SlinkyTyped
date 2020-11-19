package typingsSlinky.ejWebAll.ej

import typingsSlinky.ejWebAll.JQueryParam
import typingsSlinky.ejWebAll.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adaptor extends js.Object {
  
  def convertToQueryString(req: js.Any, query: Query, dm: DataManager): JQueryParam = js.native
  
  def extend(overrides: js.Any): Adaptor = js.native
  
  var options: AdaptorOptions = js.native
  
  def processQuery(dm: DataManager, query: Query): js.Any = js.native
  
  def processResponse(data: js.Any, ds: js.Any, query: Query, xhr: JQueryXHR): js.Any = js.native
  def processResponse(
    data: js.Any,
    ds: js.Any,
    query: Query,
    xhr: JQueryXHR,
    request: js.UndefOr[scala.Nothing],
    changes: Changes
  ): js.Any = js.native
  def processResponse(data: js.Any, ds: js.Any, query: Query, xhr: JQueryXHR, request: js.Any): js.Any = js.native
  def processResponse(data: js.Any, ds: js.Any, query: Query, xhr: JQueryXHR, request: js.Any, changes: Changes): js.Any = js.native
  
  var pvt: js.Any = js.native
  
  var `type`: Adaptor = js.native
}
