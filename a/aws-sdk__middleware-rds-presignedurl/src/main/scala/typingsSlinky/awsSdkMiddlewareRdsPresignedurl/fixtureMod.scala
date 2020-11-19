package typingsSlinky.awsSdkMiddlewareRdsPresignedurl

import typingsSlinky.awsSdkMiddlewareRdsPresignedurl.anon.AccessKeyId
import typingsSlinky.awsSdkMiddlewareRdsPresignedurl.anon.Hostname
import typingsSlinky.awsSdkTypes.cryptoMod.SourceData
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-rds-presignedurl/build/fixture", JSImport.Namespace)
@js.native
object fixtureMod extends js.Object {
  
  val context: HandlerExecutionContext = js.native
  
  def credentials(): js.Promise[AccessKeyId] = js.native
  
  def endpoint(): js.Promise[Hostname] = js.native
  
  val fromUtf8: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<{}> */ js.Any = js.native
  
  def region(): js.Promise[String] = js.native
  
  val toBase64: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<{}> */ js.Any = js.native
  
  @js.native
  class MockSha256 () extends js.Object {
    def this(secret: String) = this()
    def this(secret: js.typedarray.ArrayBuffer) = this()
    def this(secret: js.typedarray.ArrayBufferView) = this()
    
    def digest(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def update(): Unit = js.native
    def update(data: SourceData): Unit = js.native
  }
}
