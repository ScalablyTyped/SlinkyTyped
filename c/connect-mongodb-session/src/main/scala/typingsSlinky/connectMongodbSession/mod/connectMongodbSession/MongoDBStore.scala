package typingsSlinky.connectMongodbSession.mod.connectMongodbSession

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.expressSession.mod.Store
import typingsSlinky.mongodb.mod.MongoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoDBStore
  extends Store
     with Instantiable0[MongoDBStore]
     with Instantiable1[/* connection */ ConnectionInfo, MongoDBStore]
     with Instantiable2[
      js.UndefOr[/* connection */ ConnectionInfo], 
      /* callback */ js.Function1[/* error */ js.Error, Unit], 
      MongoDBStore
    ] {
  var client: MongoClient = js.native
}

