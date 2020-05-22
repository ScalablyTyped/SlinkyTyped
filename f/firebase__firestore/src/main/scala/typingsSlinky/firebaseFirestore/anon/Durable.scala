package typingsSlinky.firebaseFirestore.anon

import typingsSlinky.firebaseFirestore.coreFirestoreClientMod.PersistenceSettings
import typingsSlinky.firebaseFirestore.firebaseFirestoreBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Durable
  extends PersistenceSettings
     with typingsSlinky.firebaseFirestore.firestoreClientMod.PersistenceSettings {
  val durable: `false`
}

object Durable {
  @scala.inline
  def apply(durable: `false`): Durable = {
    val __obj = js.Dynamic.literal(durable = durable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Durable]
  }
}

