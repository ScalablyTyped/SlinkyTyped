package typingsSlinky.atGoogleDashCloudDatastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queryMod {
  import typingsSlinky.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreStrings.MORE_RESULTS_AFTER_CURSOR
  import typingsSlinky.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreStrings.MORE_RESULTS_AFTER_LIMIT
  import typingsSlinky.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreStrings.NO_MORE_RESULTS

  type MoreResultsAfterCursor = MORE_RESULTS_AFTER_CURSOR
  type MoreResultsAfterLimit = MORE_RESULTS_AFTER_LIMIT
  type NoMoreResults = NO_MORE_RESULTS
  type QueryCallback = js.Function3[/* err */ js.Error, /* entities */ js.Array[js.Object], /* info */ QueryInfo, Unit]
  type QueryResult = js.Tuple2[js.Array[js.Object], QueryInfo]
}
