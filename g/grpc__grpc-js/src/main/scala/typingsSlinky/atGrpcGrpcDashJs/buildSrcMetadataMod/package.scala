package typingsSlinky.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcMetadataMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.std.Map

  type MetadataObject = Map[String, js.Array[MetadataValue]]
  type MetadataValue = String | Buffer
}
