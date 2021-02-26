package typingsSlinky.awsSdkMiddlewareRdsPresignedurl

import typingsSlinky.awsSdkMiddlewareRdsPresignedurl.anon.AccessKeyId
import typingsSlinky.awsSdkMiddlewareRdsPresignedurl.anon.Hostname
import typingsSlinky.awsSdkTypes.cryptoMod.SourceData
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixtureMod {
  
  @JSImport("@aws-sdk/middleware-rds-presignedurl/build/fixture", "MockSha256")
  @js.native
  class MockSha256 () extends StObject {
    def this(secret: String) = this()
    def this(secret: js.typedarray.ArrayBuffer) = this()
    def this(secret: js.typedarray.ArrayBufferView) = this()
    
    def digest(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def update(): Unit = js.native
    def update(data: SourceData): Unit = js.native
  }
  
  @JSImport("@aws-sdk/middleware-rds-presignedurl/build/fixture", "context")
  @js.native
  val context: HandlerExecutionContext = js.native
  
  @JSImport("@aws-sdk/middleware-rds-presignedurl/build/fixture", "credentials")
  @js.native
  def credentials(): js.Promise[AccessKeyId] = js.native
  
  @JSImport("@aws-sdk/middleware-rds-presignedurl/build/fixture", "endpoint")
  @js.native
  def endpoint(): js.Promise[Hostname] = js.native
  
  @JSImport("@aws-sdk/middleware-rds-presignedurl/build/fixture", "fromUtf8")
  @js.native
  val fromUtf8: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<{}> */ js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-rds-presignedurl/build/fixture", "region")
  @js.native
  def region(): js.Promise[String] = js.native
  
  @JSImport("@aws-sdk/middleware-rds-presignedurl/build/fixture", "toBase64")
  @js.native
  val toBase64: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<{}> */ js.Any = js.native
}
