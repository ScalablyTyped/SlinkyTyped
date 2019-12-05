package typingsSlinky.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCallDashCredentialsMod {
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata

  type CallMetadataGenerator = js.Function2[
    /* options */ CallMetadataOptions, 
    /* cb */ js.Function2[/* err */ js.Error | Null, /* metadata */ js.UndefOr[Metadata], Unit], 
    Unit
  ]
}
