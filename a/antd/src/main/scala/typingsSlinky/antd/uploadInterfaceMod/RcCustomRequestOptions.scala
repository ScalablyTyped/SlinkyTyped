package typingsSlinky.antd.uploadInterfaceMod

import typingsSlinky.antd.anon.PercentNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RcCustomRequestOptions extends js.Object {
  
  var action: String = js.native
  
  var data: js.Object = js.native
  
  var file: RcFile = js.native
  
  var filename: String = js.native
  
  var headers: js.Object = js.native
  
  def onError(error: js.Error): Unit = js.native
  def onError(error: js.Error, response: js.UndefOr[scala.Nothing], file: RcFile): Unit = js.native
  def onError(error: js.Error, response: js.Any): Unit = js.native
  def onError(error: js.Error, response: js.Any, file: RcFile): Unit = js.native
  
  def onProgress(event: PercentNumber, file: RcFile): Unit = js.native
  
  def onSuccess(response: js.Object, file: RcFile): Unit = js.native
  
  var withCredentials: Boolean = js.native
}
