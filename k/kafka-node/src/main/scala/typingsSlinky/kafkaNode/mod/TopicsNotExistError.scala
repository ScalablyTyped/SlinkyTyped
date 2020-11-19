package typingsSlinky.kafkaNode.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "TopicsNotExistError")
@js.native
class TopicsNotExistError () extends Error {
  
  var topics: String | js.Array[String] = js.native
}
