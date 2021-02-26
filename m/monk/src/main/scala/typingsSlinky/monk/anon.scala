package typingsSlinky.monk

import typingsSlinky.mongodb.anon.Compressors
import typingsSlinky.mongodb.anon.Password
import typingsSlinky.mongodb.mod.ClientSession
import typingsSlinky.mongodb.mod.LoggerState
import typingsSlinky.mongodb.mod.ReadConcern
import typingsSlinky.mongodb.mod.ReadPreferenceOrMode
import typingsSlinky.mongodb.mod.SocketOptions
import typingsSlinky.mongodb.mod.log
import typingsSlinky.monk.mod.CollectionOptions
import typingsSlinky.monk.mod.ICollection
import typingsSlinky.monk.mod.IMonkManager
import typingsSlinky.monk.mod.IObjectID
import typingsSlinky.monk.monkBooleans.`false`
import typingsSlinky.monk.monkBooleans.`true`
import typingsSlinky.monk.monkNumbers.`4`
import typingsSlinky.monk.monkNumbers.`6`
import typingsSlinky.monk.monkStrings.DEFAULT
import typingsSlinky.monk.monkStrings.GSSAPI
import typingsSlinky.monk.monkStrings.PLAIN
import typingsSlinky.monk.monkStrings.`MONGODB-CR`
import typingsSlinky.monk.monkStrings.`MONGODB-X509`
import typingsSlinky.monk.monkStrings.`SCRAM-SHA-1`
import typingsSlinky.monk.monkStrings.`SCRAM-SHA-256`
import typingsSlinky.monk.monkStrings.majority
import typingsSlinky.node.Buffer
import typingsSlinky.node.tlsMod.PeerCertificate
import typingsSlinky.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var replaceOne: `true` = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(replaceOne: `true`): `0` = {
      val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplaceOne(value: `true`): Self = StObject.set(x, "replaceOne", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Close extends StObject {
    
    def close(): Unit = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
  }
  object Close {
    
    @scala.inline
    def apply(close: () => Unit, pause: () => Unit, resume: () => Unit): Close = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume))
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit class CloseMutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Collection extends StObject {
    
    var collection: ICollection[_] = js.native
    
    var monkInstance: IMonkManager = js.native
  }
  object Collection {
    
    @scala.inline
    def apply(collection: ICollection[_], monkInstance: IMonkManager): Collection = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], monkInstance = monkInstance.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collection]
    }
    
    @scala.inline
    implicit class CollectionMutableBuilder[Self <: Collection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: ICollection[_]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonkInstance(value: IMonkManager): Self = StObject.set(x, "monkInstance", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var _id: IObjectID = js.native
  }
  object Id {
    
    @scala.inline
    def apply(_id: IObjectID): Id = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_id(value: IObjectID): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined mongodb.mongodb.MongoClientOptions & {  collectionOptions :monk.monk.CollectionOptions | undefined} */
  @js.native
  trait MongoClientOptionscollect extends StObject {
    
    /**
      * Default: 15; Cutoff latency point in MS for MongoS proxy selection
      */
    var acceptableLatencyMS: js.UndefOr[Double] = js.native
    
    /**
      * The name of the application that created this MongoClient instance.
      */
    var appname: js.UndefOr[String] = js.native
    
    /**
      * Authentication credentials
      */
    var auth: js.UndefOr[Password] = js.native
    
    /**
      * Mechanism for authentication: DEFAULT, GSSAPI, PLAIN, MONGODB-X509, 'MONGODB-CR', SCRAM-SHA-1 or SCRAM-SHA-256
      */
    var authMechanism: js.UndefOr[
        DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String
      ] = js.native
    
    /**
      * If the database authentication is dependent on another databaseName.
      */
    var authSource: js.UndefOr[String] = js.native
    
    /**
      * Reconnect on error.
      * @default true
      */
    var autoReconnect: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets a cap on how many operations the driver will buffer up before giving up on getting a
      * working connection, default is -1 which is unlimited.
      */
    var bufferMaxEntries: js.UndefOr[Double] = js.native
    
    /**
      * Default: true; Server identity checking during SSL
      */
    var checkServerIdentity: js.UndefOr[
        Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[js.Error]])
      ] = js.native
    
    /**
      * Passed directly through to tls.createSecureContext. See https://nodejs.org/dist/latest-v9.x/docs/api/tls.html#tls_tls_createsecurecontext_options for more info.
      */
    var ciphers: js.UndefOr[String] = js.native
    
    var collectionOptions: js.UndefOr[CollectionOptions] = js.native
    
    /** Type of compression to use */
    var compression: js.UndefOr[Compressors] = js.native
    
    /**
      * TCP Connection timeout setting.
      * @default 10000
      */
    var connectTimeoutMS: js.UndefOr[Double] = js.native
    
    var connectWithNoPrimary: js.UndefOr[Boolean] = js.native
    
    /**
      * @default false
      */
    /**
      * Default: false;
      */
    /**
      * Default: false;
      */
    /**
      * Default: false;
      */
    var domainsEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Passed directly through to tls.createSecureContext. See https://nodejs.org/dist/latest-v9.x/docs/api/tls.html#tls_tls_createsecurecontext_options for more info.
      */
    var ecdhCurve: js.UndefOr[String] = js.native
    
    /**
      * Version of IP stack. Can be 4, 6 or null.
      * @default null
      *
      * If null, will attempt to connect with IPv6, and will fall back to IPv4 on failure
      * refer to http://mongodb.github.io/node-mongodb-native/3.6/api/MongoClient.html
      */
    var family: js.UndefOr[`4` | `6` | Null] = js.native
    
    /**
      * Default: false; Force server to create _id fields instead of client.
      */
    var forceServerObjectId: js.UndefOr[Boolean] = js.native
    
    /**
      * Specify a file sync write concern
      * @default false
      */
    var fsync: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: true; Turn on high availability monitoring.
      */
    var ha: js.UndefOr[Boolean] = js.native
    
    /**
      * The High availability period for replicaset inquiry
      * @default 10000
      */
    /**
      * Default: 10000; The High availability period for replicaset inquiry
      */
    /**
      * Default: 10000; The High availability period for replicaset inquiry
      */
    /**
      * Default: 10000; The High availability period for replicaset inquiry
      */
    var haInterval: js.UndefOr[Double] = js.native
    
    /**
      * **Only applies to the unified topology**
      * The frequency with which topology updates are scheduled
      * @default 10000
      */
    var heartbeatFrequencyMS: js.UndefOr[Double] = js.native
    
    /**
      * Specify if the BSON serializer should ignore undefined fields.
      */
    var ignoreUndefined: js.UndefOr[Boolean] = js.native
    
    /**
      * requests acknowledgement from MongoDB that the write operation has
      * been written to the journal
      * @default false
      */
    var j: js.UndefOr[Boolean] = js.native
    
    /**
      * TCP KeepAlive enabled on the socket.
      * @default true
      */
    var keepAlive: js.UndefOr[Boolean] = js.native
    
    /**
      * TCP KeepAlive initial delay before sending first keep-alive packet when idle.
      * @default 30000
      */
    var keepAliveInitialDelay: js.UndefOr[Double] = js.native
    
    /**
      * **Only applies to the unified topology**
      * The size of the latency window for selecting among multiple suitable servers
      * @default 15
      */
    var localThresholdMS: js.UndefOr[Double] = js.native
    
    /**
      * Custom logger object
      */
    var logger: js.UndefOr[js.Object | log] = js.native
    
    /**
      * The logging level (error/warn/info/debug)
      */
    var loggerLevel: js.UndefOr[String] = js.native
    
    /**
      * **Only applies to the unified topology**
      * The maximum amount of time a connection should remain idle in the connection pool before being marked idle.
      * @default Infinity
      */
    var maxIdleTimeMS: js.UndefOr[Double] = js.native
    
    /**
      *  **Only applies to the unified topology**
      * The maximum number of connections that may be associated with a pool at a given time.
      * This includes in use and available connections
      * @default 10
      */
    var maxPoolSize: js.UndefOr[Double] = js.native
    
    /**
      * The max staleness to secondary reads (values under 10 seconds cannot be guaranteed);
      */
    var maxStalenessSeconds: js.UndefOr[Double] = js.native
    
    /**
      * **Only applies to the unified topology**
      * The minimum number of connections that MUST exist at any moment in a single connection pool.
      * @default 0
      */
    var minPoolSize: js.UndefOr[Double] = js.native
    
    /**
      * If present, the connection pool will be initialized with minSize connections, and will never dip below minSize connections
      */
    var minSize: js.UndefOr[Double] = js.native
    
    /**
      * Enable command monitoring for this client
      * @default false
      */
    var monitorCommands: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var monitoring: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false; Use c++ bson parser.
      */
    var native_parser: js.UndefOr[Boolean] = js.native
    
    /**
      * TCP Socket NoDelay option.
      * @default true
      */
    var noDelay: js.UndefOr[Boolean] = js.native
    
    /**
      * number of retries for a tailable cursor
      * @default 5
      */
    var numberOfRetries: js.UndefOr[Double] = js.native
    
    /**
      * Custom primary key factory to generate _id values (see Custom primary keys).
      */
    var pkFactory: js.UndefOr[js.Object] = js.native
    
    /**
      * Default:5; Number of connections for each server instance; set to 5 as default for legacy reasons.
      */
    var poolSize: js.UndefOr[Double] = js.native
    
    /**
      * ES6 compatible promise constructor
      */
    var promiseLibrary: js.UndefOr[PromiseConstructor] = js.native
    
    /**
      * Default: false; Promotes Binary BSON values to native Node Buffers
      */
    var promoteBuffers: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: true; Promotes Long values to number if they fit inside the 53 bits resolution.
      */
    var promoteLongs: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: true; Promotes BSON values to native types where possible, set to false to only receive wrapper types.
      */
    var promoteValues: js.UndefOr[Boolean] = js.native
    
    /**
      * Return document results as raw BSON buffers.
      */
    var raw: js.UndefOr[Boolean] = js.native
    
    /**
      * https://docs.mongodb.com/manual/reference/read-concern/#read-concern
      */
    var readConcern: js.UndefOr[ReadConcern | String] = js.native
    
    /**
      * the prefered read preference. use 'ReadPreference' class.
      */
    /** The ReadPreference mode as listed here: http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html */
    /** The ReadPreference mode as listed here: http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html */
    /** The ReadPreference mode as listed here: http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html */
    var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
    
    /** An object representing read preference tags, see: http://mongodb.github.io/node-mongodb-native/3.1/api/ReadPreference.html */
    var readPreferenceTags: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Will wait # milliseconds between retries
      * @default 1000
      */
    var reconnectInterval: js.UndefOr[Double] = js.native
    
    /**
      * If you're connected to a single server or mongos proxy (as opposed to a replica set),
      * the MongoDB driver will try to reconnect every reconnectInterval milliseconds for reconnectTries
      * times, and give up afterward. When the driver gives up, the mongoose connection emits a
      * reconnectFailed event.
      * @default 30
      */
    var reconnectTries: js.UndefOr[Double] = js.native
    
    /**
      * The name of the replicaset to connect to.
      */
    var replicaSet: js.UndefOr[String] = js.native
    
    /**
      * Default: 15 ; Range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms)
      */
    var secondaryAcceptableLatencyMS: js.UndefOr[Double] = js.native
    
    /**
      * Serialize functions on any object.
      */
    var serializeFunctions: js.UndefOr[Boolean] = js.native
    
    /**
      * With `useUnifiedTopology`, the MongoDB driver will try to find a server to send any given operation to
      * and keep retrying for `serverSelectionTimeoutMS` milliseconds.
      * Default: 30000
      */
    var serverSelectionTimeoutMS: js.UndefOr[Double] = js.native
    
    /**
      * String containing the server name requested via TLS SNI.
      */
    var servername: js.UndefOr[String] = js.native
    
    var session: js.UndefOr[ClientSession] = js.native
    
    /**
      * Socket Options
      */
    var socketOptions: js.UndefOr[SocketOptions] = js.native
    
    /**
      * TCP Socket timeout setting.
      * @default 360000
      */
    var socketTimeoutMS: js.UndefOr[Double] = js.native
    
    /**
      * Use ssl connection (needs to have a mongod server with ssl support)
      */
    var ssl: js.UndefOr[Boolean] = js.native
    
    /**
      * Array of valid certificates either as Buffers or Strings
      */
    var sslCA: js.UndefOr[js.Array[Buffer | String]] = js.native
    
    /**
      * SSL Certificate revocation list binary buffer
      */
    var sslCRL: js.UndefOr[js.Array[Buffer | String]] = js.native
    
    /**
      * SSL Certificate binary buffer
      */
    var sslCert: js.UndefOr[Buffer | String] = js.native
    
    /**
      * SSL Key file binary buffer
      */
    var sslKey: js.UndefOr[Buffer | String] = js.native
    
    /**
      * SSL Certificate pass phrase
      */
    var sslPass: js.UndefOr[Buffer | String] = js.native
    
    /**
      * Default: true; Validate mongod server certificate against ca (mongod server >=2.4 with ssl support required)
      */
    var sslValidate: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable TLS connections
      * @default false
      */
    var tls: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies whether or not the driver should error when the server’s TLS certificate is invalid
      */
    var tlsAllowInvalidCertificates: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies whether or not the driver should error when there is a mismatch between the server’s hostname
      * and the hostname specified by the TLS certificate
      */
    var tlsAllowInvalidHostnames: js.UndefOr[Boolean] = js.native
    
    /**
      * path to file with either a single or bundle of certificate authorities
      * to be considered trusted when making a TLS connection
      */
    var tlsCAFile: js.UndefOr[String] = js.native
    
    /**
      * path to the client certificate file or the client private key file;
      * in the case that they both are needed, the files should be concatenated
      */
    var tlsCertificateKeyFile: js.UndefOr[String] = js.native
    
    /**
      * The password to decrypt the client private key to be used for TLS connections
      */
    var tlsCertificateKeyFilePassword: js.UndefOr[String] = js.native
    
    /**
      * Relax TLS constraints, disabling validation
      * @default false
      */
    var tlsInsecure: js.UndefOr[Boolean] = js.native
    
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
    
    /**
      * requests acknowledgement that the write operation has
      * propagated to a specified number of mongod hosts
      * @default 1
      */
    var w: js.UndefOr[Double | majority | String] = js.native
    
    /**
      * **Only applies to the unified topology**
      * The maximum amount of time operation execution should wait for a connection to become available.
      * The default is 0 which means there is no limit.
      * @default 0
      */
    var waitQueueTimeoutMS: js.UndefOr[Double] = js.native
    
    /**
      * a time limit, in milliseconds, for the write concern
      */
    var wtimeout: js.UndefOr[Double] = js.native
  }
  object MongoClientOptionscollect {
    
    @scala.inline
    def apply(): MongoClientOptionscollect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoClientOptionscollect]
    }
    
    @scala.inline
    implicit class MongoClientOptionscollectMutableBuilder[Self <: MongoClientOptionscollect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptableLatencyMS(value: Double): Self = StObject.set(x, "acceptableLatencyMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptableLatencyMSUndefined: Self = StObject.set(x, "acceptableLatencyMS", js.undefined)
      
      @scala.inline
      def setAppname(value: String): Self = StObject.set(x, "appname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppnameUndefined: Self = StObject.set(x, "appname", js.undefined)
      
      @scala.inline
      def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthMechanism(
        value: DEFAULT | GSSAPI | PLAIN | `MONGODB-X509` | `MONGODB-CR` | `SCRAM-SHA-1` | `SCRAM-SHA-256` | String
      ): Self = StObject.set(x, "authMechanism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthMechanismUndefined: Self = StObject.set(x, "authMechanism", js.undefined)
      
      @scala.inline
      def setAuthSource(value: String): Self = StObject.set(x, "authSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthSourceUndefined: Self = StObject.set(x, "authSource", js.undefined)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setAutoReconnect(value: Boolean): Self = StObject.set(x, "autoReconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoReconnectUndefined: Self = StObject.set(x, "autoReconnect", js.undefined)
      
      @scala.inline
      def setBufferMaxEntries(value: Double): Self = StObject.set(x, "bufferMaxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferMaxEntriesUndefined: Self = StObject.set(x, "bufferMaxEntries", js.undefined)
      
      @scala.inline
      def setCheckServerIdentity(
        value: Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[js.Error]])
      ): Self = StObject.set(x, "checkServerIdentity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckServerIdentityFunction2(value: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[js.Error]): Self = StObject.set(x, "checkServerIdentity", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setCollectionOptions(value: CollectionOptions): Self = StObject.set(x, "collectionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionOptionsUndefined: Self = StObject.set(x, "collectionOptions", js.undefined)
      
      @scala.inline
      def setCompression(value: Compressors): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setConnectTimeoutMS(value: Double): Self = StObject.set(x, "connectTimeoutMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutMSUndefined: Self = StObject.set(x, "connectTimeoutMS", js.undefined)
      
      @scala.inline
      def setConnectWithNoPrimary(value: Boolean): Self = StObject.set(x, "connectWithNoPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectWithNoPrimaryUndefined: Self = StObject.set(x, "connectWithNoPrimary", js.undefined)
      
      @scala.inline
      def setDomainsEnabled(value: Boolean): Self = StObject.set(x, "domainsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainsEnabledUndefined: Self = StObject.set(x, "domainsEnabled", js.undefined)
      
      @scala.inline
      def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      @scala.inline
      def setFamily(value: `4` | `6`): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyNull: Self = StObject.set(x, "family", null)
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setForceServerObjectId(value: Boolean): Self = StObject.set(x, "forceServerObjectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceServerObjectIdUndefined: Self = StObject.set(x, "forceServerObjectId", js.undefined)
      
      @scala.inline
      def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsyncUndefined: Self = StObject.set(x, "fsync", js.undefined)
      
      @scala.inline
      def setHa(value: Boolean): Self = StObject.set(x, "ha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHaInterval(value: Double): Self = StObject.set(x, "haInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHaIntervalUndefined: Self = StObject.set(x, "haInterval", js.undefined)
      
      @scala.inline
      def setHaUndefined: Self = StObject.set(x, "ha", js.undefined)
      
      @scala.inline
      def setHeartbeatFrequencyMS(value: Double): Self = StObject.set(x, "heartbeatFrequencyMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeatFrequencyMSUndefined: Self = StObject.set(x, "heartbeatFrequencyMS", js.undefined)
      
      @scala.inline
      def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
      
      @scala.inline
      def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJUndefined: Self = StObject.set(x, "j", js.undefined)
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveInitialDelay(value: Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setLocalThresholdMS(value: Double): Self = StObject.set(x, "localThresholdMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalThresholdMSUndefined: Self = StObject.set(x, "localThresholdMS", js.undefined)
      
      @scala.inline
      def setLogger(value: js.Object | log): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerFunction2(value: (/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState]) => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoggerLevel(value: String): Self = StObject.set(x, "loggerLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerLevelUndefined: Self = StObject.set(x, "loggerLevel", js.undefined)
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setMaxIdleTimeMS(value: Double): Self = StObject.set(x, "maxIdleTimeMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIdleTimeMSUndefined: Self = StObject.set(x, "maxIdleTimeMS", js.undefined)
      
      @scala.inline
      def setMaxPoolSize(value: Double): Self = StObject.set(x, "maxPoolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPoolSizeUndefined: Self = StObject.set(x, "maxPoolSize", js.undefined)
      
      @scala.inline
      def setMaxStalenessSeconds(value: Double): Self = StObject.set(x, "maxStalenessSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxStalenessSecondsUndefined: Self = StObject.set(x, "maxStalenessSeconds", js.undefined)
      
      @scala.inline
      def setMinPoolSize(value: Double): Self = StObject.set(x, "minPoolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPoolSizeUndefined: Self = StObject.set(x, "minPoolSize", js.undefined)
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      @scala.inline
      def setMonitorCommands(value: Boolean): Self = StObject.set(x, "monitorCommands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitorCommandsUndefined: Self = StObject.set(x, "monitorCommands", js.undefined)
      
      @scala.inline
      def setMonitoring(value: Boolean): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
      
      @scala.inline
      def setNative_parser(value: Boolean): Self = StObject.set(x, "native_parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNative_parserUndefined: Self = StObject.set(x, "native_parser", js.undefined)
      
      @scala.inline
      def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
      
      @scala.inline
      def setNumberOfRetries(value: Double): Self = StObject.set(x, "numberOfRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfRetriesUndefined: Self = StObject.set(x, "numberOfRetries", js.undefined)
      
      @scala.inline
      def setPkFactory(value: js.Object): Self = StObject.set(x, "pkFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkFactoryUndefined: Self = StObject.set(x, "pkFactory", js.undefined)
      
      @scala.inline
      def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
      
      @scala.inline
      def setPromiseLibrary(value: PromiseConstructor): Self = StObject.set(x, "promiseLibrary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseLibraryUndefined: Self = StObject.set(x, "promiseLibrary", js.undefined)
      
      @scala.inline
      def setPromoteBuffers(value: Boolean): Self = StObject.set(x, "promoteBuffers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromoteBuffersUndefined: Self = StObject.set(x, "promoteBuffers", js.undefined)
      
      @scala.inline
      def setPromoteLongs(value: Boolean): Self = StObject.set(x, "promoteLongs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromoteLongsUndefined: Self = StObject.set(x, "promoteLongs", js.undefined)
      
      @scala.inline
      def setPromoteValues(value: Boolean): Self = StObject.set(x, "promoteValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromoteValuesUndefined: Self = StObject.set(x, "promoteValues", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setReadConcern(value: ReadConcern | String): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
      
      @scala.inline
      def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadPreferenceTags(value: js.Array[String]): Self = StObject.set(x, "readPreferenceTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadPreferenceTagsUndefined: Self = StObject.set(x, "readPreferenceTags", js.undefined)
      
      @scala.inline
      def setReadPreferenceTagsVarargs(value: String*): Self = StObject.set(x, "readPreferenceTags", js.Array(value :_*))
      
      @scala.inline
      def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
      
      @scala.inline
      def setReconnectInterval(value: Double): Self = StObject.set(x, "reconnectInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectIntervalUndefined: Self = StObject.set(x, "reconnectInterval", js.undefined)
      
      @scala.inline
      def setReconnectTries(value: Double): Self = StObject.set(x, "reconnectTries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectTriesUndefined: Self = StObject.set(x, "reconnectTries", js.undefined)
      
      @scala.inline
      def setReplicaSet(value: String): Self = StObject.set(x, "replicaSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaSetUndefined: Self = StObject.set(x, "replicaSet", js.undefined)
      
      @scala.inline
      def setSecondaryAcceptableLatencyMS(value: Double): Self = StObject.set(x, "secondaryAcceptableLatencyMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryAcceptableLatencyMSUndefined: Self = StObject.set(x, "secondaryAcceptableLatencyMS", js.undefined)
      
      @scala.inline
      def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
      
      @scala.inline
      def setServerSelectionTimeoutMS(value: Double): Self = StObject.set(x, "serverSelectionTimeoutMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSelectionTimeoutMSUndefined: Self = StObject.set(x, "serverSelectionTimeoutMS", js.undefined)
      
      @scala.inline
      def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      @scala.inline
      def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setSocketOptions(value: SocketOptions): Self = StObject.set(x, "socketOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketOptionsUndefined: Self = StObject.set(x, "socketOptions", js.undefined)
      
      @scala.inline
      def setSocketTimeoutMS(value: Double): Self = StObject.set(x, "socketTimeoutMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketTimeoutMSUndefined: Self = StObject.set(x, "socketTimeoutMS", js.undefined)
      
      @scala.inline
      def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCA(value: js.Array[Buffer | String]): Self = StObject.set(x, "sslCA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCAUndefined: Self = StObject.set(x, "sslCA", js.undefined)
      
      @scala.inline
      def setSslCAVarargs(value: (Buffer | String)*): Self = StObject.set(x, "sslCA", js.Array(value :_*))
      
      @scala.inline
      def setSslCRL(value: js.Array[Buffer | String]): Self = StObject.set(x, "sslCRL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCRLUndefined: Self = StObject.set(x, "sslCRL", js.undefined)
      
      @scala.inline
      def setSslCRLVarargs(value: (Buffer | String)*): Self = StObject.set(x, "sslCRL", js.Array(value :_*))
      
      @scala.inline
      def setSslCert(value: Buffer | String): Self = StObject.set(x, "sslCert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCertUndefined: Self = StObject.set(x, "sslCert", js.undefined)
      
      @scala.inline
      def setSslKey(value: Buffer | String): Self = StObject.set(x, "sslKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslKeyUndefined: Self = StObject.set(x, "sslKey", js.undefined)
      
      @scala.inline
      def setSslPass(value: Buffer | String): Self = StObject.set(x, "sslPass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslPassUndefined: Self = StObject.set(x, "sslPass", js.undefined)
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setSslValidate(value: Boolean): Self = StObject.set(x, "sslValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslValidateUndefined: Self = StObject.set(x, "sslValidate", js.undefined)
      
      @scala.inline
      def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsAllowInvalidCertificates(value: Boolean): Self = StObject.set(x, "tlsAllowInvalidCertificates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsAllowInvalidCertificatesUndefined: Self = StObject.set(x, "tlsAllowInvalidCertificates", js.undefined)
      
      @scala.inline
      def setTlsAllowInvalidHostnames(value: Boolean): Self = StObject.set(x, "tlsAllowInvalidHostnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsAllowInvalidHostnamesUndefined: Self = StObject.set(x, "tlsAllowInvalidHostnames", js.undefined)
      
      @scala.inline
      def setTlsCAFile(value: String): Self = StObject.set(x, "tlsCAFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsCAFileUndefined: Self = StObject.set(x, "tlsCAFile", js.undefined)
      
      @scala.inline
      def setTlsCertificateKeyFile(value: String): Self = StObject.set(x, "tlsCertificateKeyFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsCertificateKeyFilePassword(value: String): Self = StObject.set(x, "tlsCertificateKeyFilePassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsCertificateKeyFilePasswordUndefined: Self = StObject.set(x, "tlsCertificateKeyFilePassword", js.undefined)
      
      @scala.inline
      def setTlsCertificateKeyFileUndefined: Self = StObject.set(x, "tlsCertificateKeyFile", js.undefined)
      
      @scala.inline
      def setTlsInsecure(value: Boolean): Self = StObject.set(x, "tlsInsecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsInsecureUndefined: Self = StObject.set(x, "tlsInsecure", js.undefined)
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      @scala.inline
      def setUseNewUrlParser(value: Boolean): Self = StObject.set(x, "useNewUrlParser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNewUrlParserUndefined: Self = StObject.set(x, "useNewUrlParser", js.undefined)
      
      @scala.inline
      def setUseUnifiedTopology(value: Boolean): Self = StObject.set(x, "useUnifiedTopology", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUnifiedTopologyUndefined: Self = StObject.set(x, "useUnifiedTopology", js.undefined)
      
      @scala.inline
      def setValidateOptions(value: js.Object | Boolean): Self = StObject.set(x, "validateOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateOptionsUndefined: Self = StObject.set(x, "validateOptions", js.undefined)
      
      @scala.inline
      def setW(value: Double | majority | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      @scala.inline
      def setWaitQueueTimeoutMS(value: Double): Self = StObject.set(x, "waitQueueTimeoutMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitQueueTimeoutMSUndefined: Self = StObject.set(x, "waitQueueTimeoutMS", js.undefined)
      
      @scala.inline
      def setWtimeout(value: Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
    }
  }
  
  @js.native
  trait RawCursor extends StObject {
    
    var rawCursor: `true` = js.native
  }
  object RawCursor {
    
    @scala.inline
    def apply(rawCursor: `true`): RawCursor = {
      val __obj = js.Dynamic.literal(rawCursor = rawCursor.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawCursor]
    }
    
    @scala.inline
    implicit class RawCursorMutableBuilder[Self <: RawCursor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRawCursor(value: `true`): Self = StObject.set(x, "rawCursor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReplaceOne extends StObject {
    
    var replaceOne: js.UndefOr[`false`] = js.native
  }
  object ReplaceOne {
    
    @scala.inline
    def apply(): ReplaceOne = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplaceOne]
    }
    
    @scala.inline
    implicit class ReplaceOneMutableBuilder[Self <: ReplaceOne] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplaceOne(value: `false`): Self = StObject.set(x, "replaceOne", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceOneUndefined: Self = StObject.set(x, "replaceOne", js.undefined)
    }
  }
}
