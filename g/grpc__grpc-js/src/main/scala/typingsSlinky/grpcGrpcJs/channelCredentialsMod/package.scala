package typingsSlinky.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object channelCredentialsMod {
  type CheckServerIdentityCallback = js.Function2[
    /* hostname */ java.lang.String, 
    /* cert */ typingsSlinky.grpcGrpcJs.channelCredentialsMod.Certificate, 
    js.UndefOr[js.Error]
  ]
}
