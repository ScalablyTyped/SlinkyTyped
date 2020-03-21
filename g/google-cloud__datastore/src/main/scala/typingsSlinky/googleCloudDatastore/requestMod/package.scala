package typingsSlinky.googleCloudDatastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestMod {
  type AllocateIdsCallback = js.Function2[
    /* err */ js.Error, 
    /* keys */ js.Array[typingsSlinky.googleCloudDatastore.entityMod.DatastoreKey], 
    scala.Unit
  ]
  type AllocateIdsResult = js.Array[js.Array[typingsSlinky.googleCloudDatastore.entityMod.DatastoreKey]]
  type CommitCallback = js.Function2[
    /* err */ js.Error, 
    /* result */ typingsSlinky.googleCloudDatastore.requestMod.CommitResponse, 
    scala.Unit
  ]
  type CommitResult = js.Array[typingsSlinky.googleCloudDatastore.requestMod.CommitResponse]
  type GetCallback[T] = js.Function2[/* err */ js.Error, /* entity */ T, scala.Unit]
}
