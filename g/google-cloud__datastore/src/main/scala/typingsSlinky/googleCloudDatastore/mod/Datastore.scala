package typingsSlinky.googleCloudDatastore.mod

import typingsSlinky.googleCloudDatastore.entityMod.DatastoreCoords
import typingsSlinky.googleCloudDatastore.entityMod.DatastoreDouble
import typingsSlinky.googleCloudDatastore.entityMod.DatastoreGeopoint
import typingsSlinky.googleCloudDatastore.entityMod.DatastoreInt
import typingsSlinky.googleCloudDatastore.entityMod.DatastoreKey
import typingsSlinky.googleCloudDatastore.entityMod.DatastoreKeyOptions
import typingsSlinky.googleCloudDatastore.entityMod.DatastoreKeyPath
import typingsSlinky.googleCloudDatastore.queryMod.MoreResultsAfterCursor
import typingsSlinky.googleCloudDatastore.queryMod.MoreResultsAfterLimit
import typingsSlinky.googleCloudDatastore.queryMod.NoMoreResults
import typingsSlinky.googleCloudDatastore.queryMod.Query
import typingsSlinky.googleCloudDatastore.requestMod.DatastoreRequest
import typingsSlinky.googleCloudDatastore.transactionMod.DatastoreTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datastore extends DatastoreRequest {
  val KEY: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Datastore.KEY */ js.Any = js.native
  val MORE_RESULTS_AFTER_CURSOR: MoreResultsAfterCursor = js.native
  val MORE_RESULTS_AFTER_LIMIT: MoreResultsAfterLimit = js.native
  val NO_MORE_RESULTS: NoMoreResults = js.native
  def createQuery(kind: String): Query = js.native
  // tslint:disable-next-line unified-signatures (Arg is semantically different)
  def createQuery(namespace: String, kind: String): Query = js.native
  def determineBaseUrl_(): Unit = js.native
  def determineBaseUrl_(customApiEndpoint: String): Unit = js.native
  def double(value: String): DatastoreDouble = js.native
  def double(value: Double): DatastoreDouble = js.native
  def geoPoint(coordinates: DatastoreCoords): DatastoreGeopoint = js.native
  def int(value: String): DatastoreInt = js.native
  def int(value: Double): DatastoreInt = js.native
  def isDouble(value: js.Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreDouble */ Boolean = js.native
  def isGeoPoint(value: js.Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreGeopoint */ Boolean = js.native
  def isInt(value: js.Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreInt */ Boolean = js.native
  def isKey(value: js.Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreKey */ Boolean = js.native
  def key(pathOrOptions: DatastoreKeyOptions): DatastoreKey = js.native
  def key(pathOrOptions: DatastoreKeyPath): DatastoreKey = js.native
  def transaction(): DatastoreTransaction = js.native
}

