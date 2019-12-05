package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atArangodbFoxxQueuesMod {
  import typingsSlinky.arangodb.ArangoDB.Document

  type JobCallback = js.Function3[/* result */ js.Any, /* jobData */ js.Any, /* job */ Document[Job], Unit]
}
