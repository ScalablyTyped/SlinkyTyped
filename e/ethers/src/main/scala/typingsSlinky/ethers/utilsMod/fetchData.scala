package typingsSlinky.ethers.utilsMod

import typingsSlinky.ethersprojectWeb.mod.ConnectionInfo
import typingsSlinky.ethersprojectWeb.mod.FetchJsonResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/utils", "_fetchData")
@js.native
object fetchData extends js.Object {
  
  def apply[T](connection: String): js.Promise[T] = js.native
  def apply[T](
    connection: String,
    body: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  def apply[T](connection: String, body: js.typedarray.Uint8Array): js.Promise[T] = js.native
  def apply[T](
    connection: String,
    body: js.typedarray.Uint8Array,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  def apply[T](connection: ConnectionInfo): js.Promise[T] = js.native
  def apply[T](
    connection: ConnectionInfo,
    body: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  def apply[T](connection: ConnectionInfo, body: js.typedarray.Uint8Array): js.Promise[T] = js.native
  def apply[T](
    connection: ConnectionInfo,
    body: js.typedarray.Uint8Array,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
}
