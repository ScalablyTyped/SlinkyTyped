package typingsSlinky.httpRx.mod

import typingsSlinky.request.mod.CoreOptions
import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRx extends js.Object {
  
  def delete(url: String): Observable_[ResponseWrapper] = js.native
  def delete(url: String, options: CoreOptions): Observable_[ResponseWrapper] = js.native
  
  def get(url: String): Observable_[ResponseWrapper] = js.native
  def get(url: String, options: CoreOptions): Observable_[ResponseWrapper] = js.native
  
  def head(url: String): Observable_[ResponseWrapper] = js.native
  def head(url: String, options: CoreOptions): Observable_[ResponseWrapper] = js.native
  
  def patch(url: String): Observable_[ResponseWrapper] = js.native
  def patch(url: String, options: CoreOptions): Observable_[ResponseWrapper] = js.native
  
  def post(url: String): Observable_[ResponseWrapper] = js.native
  def post(url: String, options: CoreOptions): Observable_[ResponseWrapper] = js.native
  
  def put(url: String): Observable_[ResponseWrapper] = js.native
  def put(url: String, options: CoreOptions): Observable_[ResponseWrapper] = js.native
}
