package typingsSlinky.firebaseFirestore.simpleDbMod

import org.scalajs.dom.raw.IDBDatabase
import org.scalajs.dom.raw.IDBTransaction
import typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleDbSchemaConverter extends js.Object {
  def createOrUpgrade(db: IDBDatabase, txn: IDBTransaction, fromVersion: Double, toVersion: Double): PersistencePromise[Unit] = js.native
}

object SimpleDbSchemaConverter {
  @scala.inline
  def apply(createOrUpgrade: (IDBDatabase, IDBTransaction, Double, Double) => PersistencePromise[Unit]): SimpleDbSchemaConverter = {
    val __obj = js.Dynamic.literal(createOrUpgrade = js.Any.fromFunction4(createOrUpgrade))
    __obj.asInstanceOf[SimpleDbSchemaConverter]
  }
  @scala.inline
  implicit class SimpleDbSchemaConverterOps[Self <: SimpleDbSchemaConverter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateOrUpgrade(value: (IDBDatabase, IDBTransaction, Double, Double) => PersistencePromise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOrUpgrade")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

