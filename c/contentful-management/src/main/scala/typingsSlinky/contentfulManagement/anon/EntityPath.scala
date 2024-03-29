package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.axios.mod.AxiosPromise
import typingsSlinky.axios.mod.AxiosRequestConfig
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityPath[T] extends StObject {
  
  var entityPath: String = js.native
  
  var headers: js.UndefOr[Record[String, _]] = js.native
  
  def http(config: AxiosRequestConfig): AxiosPromise[_] = js.native
  def http(url: String): AxiosPromise[_] = js.native
  def http(url: String, config: AxiosRequestConfig): AxiosPromise[_] = js.native
  @JSName("http")
  var http_Original: AxiosInstance = js.native
  
  def wrapperMethod(http: AxiosInstance, data: js.Any): T = js.native
  @JSName("wrapperMethod")
  var wrapperMethod_Original: typingsSlinky.contentfulManagement.instanceActionsMod.WrapperMethod[T, AxiosInstance] = js.native
}
