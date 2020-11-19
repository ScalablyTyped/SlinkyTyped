package typingsSlinky.builderUtilRuntime.bintrayMod

import typingsSlinky.builderUtilRuntime.cancellationTokenMod.CancellationToken
import typingsSlinky.builderUtilRuntime.httpExecutorMod.HttpExecutor
import typingsSlinky.builderUtilRuntime.httpExecutorMod.RequestHeaders
import typingsSlinky.builderUtilRuntime.publishOptionsMod.BintrayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util-runtime/out/bintray", "BintrayClient")
@js.native
class BintrayClient protected () extends js.Object {
  def this(options: BintrayOptions, httpExecutor: HttpExecutor[_], cancellationToken: CancellationToken) = this()
  def this(
    options: BintrayOptions,
    httpExecutor: HttpExecutor[_],
    cancellationToken: CancellationToken,
    apiKey: String
  ) = this()
  
  val auth: String | Null = js.native
  
  val basePath: js.Any = js.native
  
  var bintrayRequest: js.Any = js.native
  
  val cancellationToken: js.Any = js.native
  
  val component: String | Null = js.native
  
  def createVersion(version: String): js.Promise[_] = js.native
  
  def deleteVersion(version: String): js.Promise[_] = js.native
  
  val distribution: String | Null = js.native
  
  def getVersion(version: String): js.Promise[Version] = js.native
  
  def getVersionFiles(version: String): js.Promise[js.Array[File]] = js.native
  
  val httpExecutor: js.Any = js.native
  
  val owner: String = js.native
  
  val packageName: String = js.native
  
  val repo: String = js.native
  
  var requestHeaders: js.Any = js.native
  
  def setRequestHeaders(): Unit = js.native
  def setRequestHeaders(value: RequestHeaders): Unit = js.native
  
  val user: String = js.native
}
