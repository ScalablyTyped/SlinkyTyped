package typingsSlinky.elasticElasticsearch.helpersMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.elasticElasticsearch.anon.OmitSearchRequestBodyReco
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsearchHelper
  extends js.Promise[Unit] {
  def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: String): js.Promise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: String, callback: callbackFn[TResponse, TContext]): Unit = js.native
  def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: Buffer): js.Promise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: Buffer, callback: callbackFn[TResponse, TContext]): Unit = js.native
  def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: Readable): js.Promise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: Readable, callback: callbackFn[TResponse, TContext]): Unit = js.native
  def search[TResponse, TRequestBody /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.MsearchHelper with TopLevel[js.Any] */, TContext](header: OmitSearchRequestBodyReco, body: TRequestBody): js.Promise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TRequestBody /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.MsearchHelper with TopLevel[js.Any] */, TContext](header: OmitSearchRequestBodyReco, body: TRequestBody, callback: callbackFn[TResponse, TContext]): Unit = js.native
  def stop(): Unit = js.native
  def stop(error: js.Error): Unit = js.native
}

