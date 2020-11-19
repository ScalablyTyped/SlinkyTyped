package typingsSlinky.electronPublish.mod

import typingsSlinky.builderUtil.archMod.Arch
import typingsSlinky.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron-publish", "HttpPublisher")
@js.native
abstract class HttpPublisher protected () extends Publisher {
  protected def this(context: PublishContext) = this()
  protected def this(context: PublishContext, useSafeArtifactName: Boolean) = this()
  
  /* protected */ def doUpload(
    fileName: String,
    arch: Arch,
    dataLength: Double,
    requestProcessor: js.Function2[
      /* request */ ClientRequest, 
      /* reject */ js.Function1[/* error */ js.Error, Unit], 
      Unit
    ]
  ): js.Promise[_] = js.native
  /* protected */ def doUpload(
    fileName: String,
    arch: Arch,
    dataLength: Double,
    requestProcessor: js.Function2[
      /* request */ ClientRequest, 
      /* reject */ js.Function1[/* error */ js.Error, Unit], 
      Unit
    ],
    file: String
  ): js.Promise[_] = js.native
  
  val useSafeArtifactName: js.Any = js.native
}
