package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.anon.LogErroredRequests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "tracker")
@js.native
object tracker extends js.Object {
  
  @js.native
  class RequestLogger protected ()
    extends typingsSlinky.cassandraDriver.trackerMod.tracker.RequestLogger {
    def this(options: LogErroredRequests) = this()
  }
}
