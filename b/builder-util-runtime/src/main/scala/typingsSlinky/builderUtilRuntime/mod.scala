package typingsSlinky.builderUtilRuntime

import typingsSlinky.builderUtilRuntime.builderUtilRuntimeBooleans.`false`
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.DELETE
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.GET
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.PUT
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.base64
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.hex
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.installerDotexe
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.latin1
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.packageDot7z
import typingsSlinky.builderUtilRuntime.progressCallbackTransformMod.ProgressInfo
import typingsSlinky.builderUtilRuntime.publishOptionsMod.GithubOptions
import typingsSlinky.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CancellationError ()
    extends typingsSlinky.builderUtilRuntime.cancellationTokenMod.CancellationError
  
  @js.native
  class CancellationToken ()
    extends typingsSlinky.builderUtilRuntime.cancellationTokenMod.CancellationToken {
    def this(parent: typingsSlinky.builderUtilRuntime.cancellationTokenMod.CancellationToken) = this()
  }
  
  @js.native
  class DigestTransform protected ()
    extends typingsSlinky.builderUtilRuntime.httpExecutorMod.DigestTransform {
    def this(expected: String) = this()
    def this(expected: String, algorithm: String) = this()
    def this(expected: String, algorithm: String, encoding: base64) = this()
    def this(expected: String, algorithm: String, encoding: hex) = this()
    def this(expected: String, algorithm: String, encoding: latin1) = this()
  }
  
  @js.native
  class HttpError protected ()
    extends typingsSlinky.builderUtilRuntime.httpExecutorMod.HttpError {
    def this(statusCode: Double) = this()
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: String, description: js.Any) = this()
  }
  
  @js.native
  abstract class HttpExecutor[REQUEST] ()
    extends typingsSlinky.builderUtilRuntime.httpExecutorMod.HttpExecutor[REQUEST]
  
  @js.native
  class ProgressCallbackTransform protected ()
    extends typingsSlinky.builderUtilRuntime.progressCallbackTransformMod.ProgressCallbackTransform {
    def this(
      total: Double,
      cancellationToken: typingsSlinky.builderUtilRuntime.cancellationTokenMod.CancellationToken,
      onProgress: js.Function1[/* info */ ProgressInfo, _]
    ) = this()
  }
  
  @js.native
  class UUID protected ()
    extends typingsSlinky.builderUtilRuntime.uuidMod.UUID {
    def this(uuid: String) = this()
    def this(uuid: Buffer) = this()
  }
  
  @js.native
  class XElement protected ()
    extends typingsSlinky.builderUtilRuntime.xmlMod.XElement {
    def this(name: String) = this()
  }
  
  val CURRENT_APP_INSTALLER_FILE_NAME: installerDotexe = js.native
  val CURRENT_APP_PACKAGE_FILE_NAME: packageDot7z = js.native
  def asArray[T](): js.Array[T] = js.native
  def asArray[T](v: T): js.Array[T] = js.native
  def asArray[T](v: js.Array[T]): js.Array[T] = js.native
  def configureRequestOptions(options: RequestOptions): RequestOptions = js.native
  def configureRequestOptions(options: RequestOptions, token: String): RequestOptions = js.native
  def configureRequestOptionsFromUrl(url: String, options: RequestOptions): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_DELETE(options: RequestOptions, token: String, method: DELETE): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_DELETE(options: RequestOptions, token: Null, method: DELETE): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_GET(options: RequestOptions, token: String, method: GET): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_GET(options: RequestOptions, token: Null, method: GET): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_PUT(options: RequestOptions, token: String, method: PUT): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_PUT(options: RequestOptions, token: Null, method: PUT): RequestOptions = js.native
  def configureRequestUrl(url: URL_, options: RequestOptions): Unit = js.native
  def createHttpError(response: IncomingMessage): typingsSlinky.builderUtilRuntime.httpExecutorMod.HttpError = js.native
  def createHttpError(response: IncomingMessage, description: js.Any): typingsSlinky.builderUtilRuntime.httpExecutorMod.HttpError = js.native
  def getS3LikeProviderBaseUrl(configuration: PublishConfiguration): String = js.native
  def githubUrl(options: GithubOptions): String = js.native
  def githubUrl(options: GithubOptions, defaultHost: String): String = js.native
  def newError(message: String, code: String): js.Error = js.native
  def parseDn(seq: String): Map[String, String] = js.native
  def parseJson(result: js.Promise[String | Null]): js.Promise[_] = js.native
  def parseXml(data: String): typingsSlinky.builderUtilRuntime.xmlMod.XElement = js.native
  def safeGetHeader(response: js.Any, headerKey: String): js.Any = js.native
  def safeStringifyJson(data: js.Any): String = js.native
  def safeStringifyJson(data: js.Any, skippedNames: Set[String]): String = js.native
  /* static members */
  @js.native
  object HttpExecutor extends js.Object {
    def prepareRedirectUrlOptions(redirectUrl: String, options: RequestOptions): RequestOptions = js.native
  }
  
  /* static members */
  @js.native
  object UUID extends js.Object {
    val OID: Buffer = js.native
    def check(uuid: String): `false` | AnonFormat | AnonVariant = js.native
    def check(uuid: String, offset: Double): `false` | AnonFormat | AnonVariant = js.native
    def check(uuid: Buffer): `false` | AnonFormat | AnonVariant = js.native
    def check(uuid: Buffer, offset: Double): `false` | AnonFormat | AnonVariant = js.native
    def parse(input: String): Buffer = js.native
    def v5(name: String, namespace: Buffer): js.Any = js.native
    def v5(name: Buffer, namespace: Buffer): js.Any = js.native
  }
  
}

