package typingsSlinky.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCallDashStreamMod {
  import typingsSlinky.atGrpcGrpcDashJs.Anon_CancelWithStatus
  import typingsSlinky.atGrpcGrpcDashJs.atGrpcGrpcDashJsStrings.metadata
  import typingsSlinky.atGrpcGrpcDashJs.atGrpcGrpcDashJsStrings.status
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcEventsMod.EmitterAugmentation1
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectDuplex
  import typingsSlinky.node.Buffer
  import typingsSlinky.std.Partial

  type Call = Anon_CancelWithStatus with (EmitterAugmentation1[metadata, Metadata]) with (EmitterAugmentation1[status, StatusObject]) with (ObjectDuplex[WriteObject, Buffer])
  type Deadline = js.Date | Double
  type PartialCallStreamOptions = Partial[CallStreamOptions]
}
