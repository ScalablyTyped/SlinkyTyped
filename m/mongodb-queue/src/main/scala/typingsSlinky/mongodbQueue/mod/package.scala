package typingsSlinky.mongodbQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type QueueCallback[T] = js.Function2[
    /* err */ typingsSlinky.mongodb.mod.MongoError | js.Error, 
    /* result */ T, 
    scala.Unit
  ]
}
