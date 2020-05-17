package typingsSlinky.oracledb.mod

import typingsSlinky.node.Buffer
import typingsSlinky.oracledb.anon.Tables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a subscription's notification.
  */
@js.native
trait SubscriptionMessage extends js.Object {
  /** Name of the database which sent the notification. */
  var dbName: js.UndefOr[String] = js.native
  /** Array of objects specifying the queries which were affected by the Query Change notification. */
  var queries: js.UndefOr[js.Array[Tables]] = js.native
  /**
    * Name of the Advanced Queue. Undefined for CQN.
    * 
    * @since 4.0
    */
  var queueName: js.UndefOr[String] = js.native
  /** Indicates whether the subscription is registered with the database. */
  var registered: Boolean = js.native
  /** Array of objects specifying the tables which were affected by the notification. */
  var tables: js.UndefOr[js.Array[SubscriptionTables]] = js.native
  /** Buffer containing the identifier of the transaction which spawned the notification. */
  var txId: Buffer = js.native
  /** Type of notification sent. One of the Subscribe Event Type Constants. */
  var `type`: Double = js.native
}

object SubscriptionMessage {
  @scala.inline
  def apply(registered: Boolean, txId: Buffer, `type`: Double): SubscriptionMessage = {
    val __obj = js.Dynamic.literal(registered = registered.asInstanceOf[js.Any], txId = txId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionMessage]
  }
  @scala.inline
  implicit class SubscriptionMessageOps[Self <: SubscriptionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTxId(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbName")(js.undefined)
        ret
    }
    @scala.inline
    def withQueries(value: js.Array[Tables]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueName")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: js.Array[SubscriptionTables]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
  }
  
}

