package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.AnonPassword
import typingsSlinky.mongodb.mongodbStrings.DEFAULT
import typingsSlinky.mongodb.mongodbStrings.GSSAPI
import typingsSlinky.mongodb.mongodbStrings.PLAIN
import typingsSlinky.mongodb.mongodbStrings.`MONGODB-CR`
import typingsSlinky.mongodb.mongodbStrings.`MONGODB-X509`
import typingsSlinky.mongodb.mongodbStrings.`SCRAM-SHA-1`
import typingsSlinky.mongodb.mongodbStrings.`SCRAM-SHA-256`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mongodb.mod.HighAvailabilityOptions because var conflicts: domainsEnabled, haInterval, readPreference. Inlined ha, readPreferenceTags
- typingsSlinky.mongodb.mod.SSLOptions because Already inherited
- typingsSlinky.mongodb.mod.ReplSetOptions because var conflicts: checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, readPreference, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate. Inlined maxStalenessSeconds, replicaSet, secondaryAcceptableLatencyMS, connectWithNoPrimary
- typingsSlinky.mongodb.mod.MongosOptions because var conflicts: checkServerIdentity, ciphers, domainsEnabled, ecdhCurve, haInterval, minSize, poolSize, readPreference, servername, socketOptions, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate. Inlined acceptableLatencyMS */ @js.native
trait MongoClientOptions
  extends DbCreateOptions
     with ServerOptions
     with SocketOptions
     with TLSOptions {
  /**
    * Default: 15; Cutoff latency point in MS for MongoS proxy selection
    */
  var acceptableLatencyMS: js.UndefOr[scala.Double] = js.native
  /**
    * The name of the application that created this MongoClient instance.
    */
  var appname: js.UndefOr[String] = js.native
  /**
    * Authentication credentials
    */
  var auth: js.UndefOr[AnonPassword] = js.native
  /**
    * Mechanism for authentication: DEFAULT, GSSAPI, PLAIN, MONGODB-X509, 'MONGODB-CR', SCRAM-SHA-1 or SCRAM-SHA-256
    */
  var authMechanism: js.UndefOr[
    DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String
  ] = js.native
  var connectWithNoPrimary: js.UndefOr[Boolean] = js.native
  /**
    * Default: true; Turn on high availability monitoring.
    */
  var ha: js.UndefOr[Boolean] = js.native
  /**
    * Custom logger object
    */
  var logger: js.UndefOr[js.Object | log] = js.native
  /**
    * The logging level (error/warn/info/debug)
    */
  var loggerLevel: js.UndefOr[String] = js.native
  /**
    * The max staleness to secondary reads (values under 10 seconds cannot be guaranteed);
    */
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.native
  /**
    * number of retries for a tailable cursor
    * @default 5
    */
  var numberOfRetries: js.UndefOr[scala.Double] = js.native
  /** An object representing read preference tags, see: http://mongodb.github.io/node-mongodb-native/3.1/api/ReadPreference.html */
  var readPreferenceTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the replicaset to connect to.
    */
  var replicaSet: js.UndefOr[String] = js.native
  /**
    * Default: 15 ; Range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms)
    */
  var secondaryAcceptableLatencyMS: js.UndefOr[scala.Double] = js.native
  /**
    * With `useUnifiedTopology`, the MongoDB driver will try to find a server to send any given operation to
    * and keep retrying for `serverSelectionTimeoutMS` milliseconds.
    * Default: 30000
    */
  var serverSelectionTimeoutMS: js.UndefOr[scala.Double] = js.native
  /**
    * Determines whether or not to use the new url parser. Enables the new, spec-compliant
    * url parser shipped in the core driver. This url parser fixes a number of problems with
    * the original parser, and aims to outright replace that parser in the near future.
    */
  var useNewUrlParser: js.UndefOr[Boolean] = js.native
  /**
    * Enables the new unified topology layer
    */
  var useUnifiedTopology: js.UndefOr[Boolean] = js.native
  /**
    * Validate MongoClient passed in options for correctness.
    * Default: false
    */
  var validateOptions: js.UndefOr[js.Object | Boolean] = js.native
}

object MongoClientOptions {
  @scala.inline
  def apply(): MongoClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoClientOptions]
  }
  @scala.inline
  implicit class MongoClientOptionsOps[Self <: MongoClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptableLatencyMS(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptableLatencyMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptableLatencyMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptableLatencyMS")(js.undefined)
        ret
    }
    @scala.inline
    def withAppname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appname")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: AnonPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthMechanism(
      value: DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMechanism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthMechanism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMechanism")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectWithNoPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectWithNoPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectWithNoPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectWithNoPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withHa(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ha")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggerFunction2(value: (/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLogger(value: js.Object | log): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggerLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggerLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggerLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggerLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxStalenessSeconds(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStalenessSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStalenessSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStalenessSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfRetries(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withReadPreferenceTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreferenceTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadPreferenceTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreferenceTags")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaSet")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryAcceptableLatencyMS(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryAcceptableLatencyMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryAcceptableLatencyMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryAcceptableLatencyMS")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSelectionTimeoutMS(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSelectionTimeoutMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSelectionTimeoutMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSelectionTimeoutMS")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNewUrlParser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNewUrlParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNewUrlParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNewUrlParser")(js.undefined)
        ret
    }
    @scala.inline
    def withUseUnifiedTopology(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUnifiedTopology")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseUnifiedTopology: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUnifiedTopology")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOptions(value: js.Object | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOptions")(js.undefined)
        ret
    }
  }
  
}

