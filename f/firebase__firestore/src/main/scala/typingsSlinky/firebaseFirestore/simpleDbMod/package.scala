package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object simpleDbMod {
  type IterateCallback[KeyType, ValueType] = js.Function3[
    /* key */ KeyType, 
    /* value */ ValueType, 
    /* control */ typingsSlinky.firebaseFirestore.simpleDbMod.IterationController, 
    scala.Unit | typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise[scala.Unit]
  ]
}
