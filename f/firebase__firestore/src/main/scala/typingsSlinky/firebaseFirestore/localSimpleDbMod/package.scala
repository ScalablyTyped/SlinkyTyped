package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object localSimpleDbMod {
  type IterateCallback[KeyType, ValueType] = js.Function3[
    /* key */ KeyType, 
    /* value */ ValueType, 
    /* control */ typingsSlinky.firebaseFirestore.localSimpleDbMod.IterationController, 
    scala.Unit | typingsSlinky.firebaseFirestore.localPersistencePromiseMod.PersistencePromise[scala.Unit]
  ]
}
