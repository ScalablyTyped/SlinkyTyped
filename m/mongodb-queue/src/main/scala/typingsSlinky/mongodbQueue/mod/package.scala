package typingsSlinky.mongodbQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type QueueCallback[T] = js.Function2[
    /* err */ typingsSlinky.mongodb.mod.MongoError | js.Error, 
    /* result */ T, 
    scala.Unit
  ]
}
