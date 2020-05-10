package typingsSlinky.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used with connection.subscribe() to control a subscription.
  */
@js.native
trait SubscribeOptions extends js.Object {
  /** An array (bind by position) or object (bind by name) containing the bind values to use in the sql property. */
  var binds: js.UndefOr[BindParameters] = js.native
  /**
    * Enables CQN “client initiated” connections which internally use the same approach as normal connections to the database,
    * and do not require the database to be able to connect back to the application. Since client initiated connections
    * do not need additional network configuration, they have ease-of-use and security advantages.
    * 
    * @default false
    * @since 4.2
    */
  var clientInitiated: js.UndefOr[Boolean] = js.native
  /**
    * An integer mask which currently, if set, can only contain the value SUBSCR_GROUPING_CLASS_TIME.
    * If this value is set then notifications are grouped by time into a single notification.
    */
  var groupingClass: js.UndefOr[Double] = js.native
  /**
    * Either SUBSCR_GROUPING_TYPE_SUMMARY (the default) indicating notifications should be
    * grouped in a summary, or SUBSCR_GROUPING_TYPE_LAST indicating the last notification in the
    * group should be sent.
    */
  var groupingType: js.UndefOr[Double] = js.native
  /**
    * If groupingClass contains SUBSCR_GROUPING_CLASS_TIME then groupingValue can be used to
    * set the number of seconds over which notifications will be grouped together, invoking callback once.
    * If groupingClass is not set, then groupingValue is ignored.
    */
  var groupingValue: js.UndefOr[Double] = js.native
  /**
    * A string containing an IPv4 or IPv6 address on which the subscription should listen to receive notifications.
    * If not specified, then the Oracle Client library will select an IP address.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /** One of the Subscribe Namespace Constants. */
  var namespace: js.UndefOr[Double] = js.native
  /**
    * An integer mask containing one or more of the operation type CQN_OPCODE_* constants to
    * indicate what types of database change should generation notifications.
    */
  var operations: js.UndefOr[Double] = js.native
  /**
    * The port number on which the subscription should listen to receive notifications.
    * If not specified, then the Oracle Client library will select a port number.
    */
  var port: js.UndefOr[Double] = js.native
  /** An integer mask containing one or more of the quality of service SUBSCR_QOS_* constants. */
  var qos: js.UndefOr[Double] = js.native
  /** The SQL query string to use for notifications. */
  var sql: String = js.native
  /**
    * The number of seconds the subscription should remain active. Once this length of time has been reached,
    * the subscription is automatically unregistered and a deregistration notification is sent.
    */
  var timeout: js.UndefOr[Double] = js.native
  /** The notification callback that will be called whenever notifications are sent by the database. */
  def callback(message: SubscriptionMessage): Unit = js.native
}

object SubscribeOptions {
  @scala.inline
  def apply(callback: SubscriptionMessage => Unit, sql: String): SubscribeOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOptions]
  }
  @scala.inline
  implicit class SubscribeOptionsOps[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: SubscriptionMessage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSql(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinds(value: BindParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binds")(js.undefined)
        ret
    }
    @scala.inline
    def withClientInitiated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientInitiated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientInitiated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientInitiated")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupingClass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingClass")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupingType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingType")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupingValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withQos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qos")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

