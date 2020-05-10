package typingsSlinky.mysql.mod

import typingsSlinky.mysql.SecureContextOptionsrejec
import typingsSlinky.mysql.UntypedFieldInfotypestrin
import typingsSlinky.mysql.mysqlStrings.DATE
import typingsSlinky.mysql.mysqlStrings.DATETIME
import typingsSlinky.mysql.mysqlStrings.TIMESTAMP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionConfig extends ConnectionOptions {
  /**
    * Enabling both supportBigNumbers and bigNumberStrings forces big numbers (BIGINT and DECIMAL columns) to be
    * always returned as JavaScript String objects (Default: false). Enabling supportBigNumbers but leaving
    * bigNumberStrings disabled will return big numbers as String objects only when they cannot be accurately
    * represented with [JavaScript Number objects] (http://ecma262-5.com/ELS5_HTML.htm#Section_8.5)
    * (which happens when they exceed the [-2^53, +2^53] range), otherwise they will be returned as Number objects.
    * This option is ignored if supportBigNumbers is disabled.
    */
  var bigNumberStrings: js.UndefOr[Boolean] = js.native
  /**
    * The milliseconds before a timeout occurs during the initial connection to the MySQL server. (Default: 10 seconds)
    */
  var connectTimeout: js.UndefOr[Double] = js.native
  /**
    * Force date types (TIMESTAMP, DATETIME, DATE) to be returned as strings rather then inflated into JavaScript
    * Date objects. Can be true/false or an array of type names to keep as strings. (Default: false)
    */
  var dateStrings: js.UndefOr[Boolean | (js.Array[TIMESTAMP | DATETIME | DATE])] = js.native
  /**
    * This will print all incoming and outgoing packets on stdout.
    * You can also restrict debugging to packet types by passing an array of types (strings) to debug;
    *
    * (Default: false)
    */
  var debug: js.UndefOr[Boolean | (js.Array[String | Types])] = js.native
  /**
    * List of connection flags to use other than the default ones. It is also possible to blacklist default ones
    */
  var flags: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The hostname of the database you are connecting to. (Default: localhost)
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Allow connecting to MySQL instances that ask for the old (insecure) authentication method. (Default: false)
    */
  var insecureAuth: js.UndefOr[Boolean] = js.native
  /**
    * The source IP address to use for TCP connection
    */
  var localAddress: js.UndefOr[String] = js.native
  /**
    * Allow multiple mysql statements per query. Be careful with this, it exposes you to SQL injection attacks. (Default: false)
    */
  var multipleStatements: js.UndefOr[Boolean] = js.native
  /**
    * The port number to connect to. (Default: 3306)
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * A custom query format function
    */
  var queryFormat: js.UndefOr[js.Function2[/* query */ String, /* values */ js.Any, String]] = js.native
  /**
    * The path to a unix domain socket to connect to. When used host and port are ignored
    */
  var socketPath: js.UndefOr[String] = js.native
  /**
    * object with ssl parameters or a string containing name of ssl profile
    */
  var ssl: js.UndefOr[String | SecureContextOptionsrejec] = js.native
  /**
    * Stringify objects instead of converting to values. (Default: 'false')
    */
  var stringifyObjects: js.UndefOr[Boolean] = js.native
  /**
    * When dealing with big numbers (BIGINT and DECIMAL columns) in the database, you should enable this option
    * (Default: false)
    */
  var supportBigNumbers: js.UndefOr[Boolean] = js.native
  /**
    * The timezone used to store local dates. (Default: 'local')
    */
  var timezone: js.UndefOr[String] = js.native
  /**
    * Generates stack traces on errors to include call site of library entrance ("long stack traces"). Slight
    * performance penalty for most calls. (Default: true)
    */
  var trace: js.UndefOr[Boolean] = js.native
  /**
    * Determines if column values should be converted to native JavaScript types. It is not recommended (and may go away / change in the future)
    * to disable type casting, but you can currently do so on either the connection or query level. (Default: true)
    *
    * You can also specify a function (field: any, next: () => void) => {} to do the type casting yourself.
    *
    * WARNING: YOU MUST INVOKE the parser using one of these three field functions in your custom typeCast callback. They can only be called once.
    *
    * field.string()
    * field.buffer()
    * field.geometry()
    *
    * are aliases for
    *
    * parser.parseLengthCodedString()
    * parser.parseLengthCodedBuffer()
    * parser.parseGeometryValue()
    *
    * You can find which field function you need to use by looking at: RowDataPacket.prototype._typeCast
    */
  var typeCast: js.UndefOr[TypeCast] = js.native
}

object ConnectionConfig {
  @scala.inline
  def apply(): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionConfig]
  }
  @scala.inline
  implicit class ConnectionConfigOps[Self <: ConnectionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigNumberStrings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigNumberStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigNumberStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigNumberStrings")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDateStrings(value: Boolean | (js.Array[TIMESTAMP | DATETIME | DATE])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateStrings")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean | (js.Array[String | Types])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withInsecureAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecureAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsecureAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecureAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleStatements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleStatements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleStatements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleStatements")(js.undefined)
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
    def withQueryFormat(value: (/* query */ String, /* values */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFormat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutQueryFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: String | SecureContextOptionsrejec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withStringifyObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifyObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringifyObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifyObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportBigNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportBigNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportBigNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportBigNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeCastFunction2(value: (/* field */ UntypedFieldInfotypestrin, /* next */ js.Function0[Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCast")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTypeCast(value: TypeCast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeCast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCast")(js.undefined)
        ret
    }
  }
  
}

