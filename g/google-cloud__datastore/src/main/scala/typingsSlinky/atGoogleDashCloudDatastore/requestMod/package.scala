package typingsSlinky.atGoogleDashCloudDatastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestMod {
  import typingsSlinky.atGoogleDashCloudDatastore.entityMod.DatastoreKey

  type AllocateIdsCallback = js.Function2[/* err */ js.Error, /* keys */ js.Array[DatastoreKey], Unit]
  type AllocateIdsResult = js.Array[js.Array[DatastoreKey]]
  type CommitCallback = js.Function2[/* err */ js.Error, /* result */ CommitResponse, Unit]
  type CommitResult = js.Array[CommitResponse]
  type GetCallback[T] = js.Function2[/* err */ js.Error, /* entity */ T, Unit]
}
