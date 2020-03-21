package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.AnonLogErroredRequests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "tracker")
@js.native
object tracker extends js.Object {
  @js.native
  class RequestLogger protected ()
    extends typingsSlinky.cassandraDriver.trackerMod.tracker.RequestLogger {
    def this(options: AnonLogErroredRequests) = this()
  }
  
}

