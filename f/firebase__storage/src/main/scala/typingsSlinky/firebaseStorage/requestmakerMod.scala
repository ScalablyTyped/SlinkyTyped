package typingsSlinky.firebaseStorage

import typingsSlinky.firebaseStorage.requestMod.Request
import typingsSlinky.firebaseStorage.requestinfoMod.RequestInfo
import typingsSlinky.firebaseStorage.xhriopoolMod.XhrIoPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/requestmaker", JSImport.Namespace)
@js.native
object requestmakerMod extends js.Object {
  type requestMaker = js.Function4[
    /* requestInfo */ RequestInfo[js.Any], 
    /* appId */ String | Null, 
    /* authToken */ String | Null, 
    /* pool */ XhrIoPool, 
    Request[js.Any]
  ]
}

