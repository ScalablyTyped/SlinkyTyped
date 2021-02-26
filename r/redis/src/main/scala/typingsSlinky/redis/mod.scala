package typingsSlinky.redis

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.redis.redisStrings.AFTER
import typingsSlinky.redis.redisStrings.ASYNC
import typingsSlinky.redis.redisStrings.BEFORE
import typingsSlinky.redis.redisStrings.OK
import typingsSlinky.redis.redisStrings.message
import typingsSlinky.redis.redisStrings.message_buffer
import typingsSlinky.redis.redisStrings.pmessage
import typingsSlinky.redis.redisStrings.pmessage_buffer
import typingsSlinky.redis.redisStrings.psubscribe
import typingsSlinky.redis.redisStrings.punsubscribe
import typingsSlinky.redis.redisStrings.subscribe
import typingsSlinky.redis.redisStrings.unsubscribe
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redis", "AbortError")
  @js.native
  class AbortError () extends RedisError {
    
    var args: js.UndefOr[js.Array[_]] = js.native
    
    var code: js.UndefOr[String] = js.native
    
    var command: String = js.native
  }
  
  @JSImport("redis", "AggregateError")
  @js.native
  class AggregateError () extends AbortError
  
  @js.native
  trait Multi
    extends Commands[typingsSlinky.redis.mod.Multi] {
    
    def EXEC(): Boolean = js.native
    def EXEC(cb: Callback[js.Array[_]]): Boolean = js.native
    
    def EXEC_ATOMIC(): Boolean = js.native
    def EXEC_ATOMIC(cb: Callback[js.Array[_]]): Boolean = js.native
    
    def exec(): Boolean = js.native
    def exec(cb: Callback[js.Array[_]]): Boolean = js.native
    
    def exec_atomic(): Boolean = js.native
    def exec_atomic(cb: Callback[js.Array[_]]): Boolean = js.native
  }
  @JSImport("redis", "Multi")
  @js.native
  val Multi: Instantiable0[typingsSlinky.redis.mod.Multi] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("redis", "Multi")
  @js.native
  class MultiCls ()
    extends typingsSlinky.redis.mod.Multi
  
  @JSImport("redis", "ParserError")
  @js.native
  class ParserError () extends RedisError {
    
    var buffer: Buffer = js.native
    
    var offset: Double = js.native
  }
  
  @js.native
  trait RedisClient
    extends EventEmitter
       with Commands[Boolean] {
    
    def BATCH(): typingsSlinky.redis.mod.Multi = js.native
    def BATCH(args: js.Array[js.Array[String | Double | Callback[_]]]): typingsSlinky.redis.mod.Multi = js.native
    
    def MULTI(): typingsSlinky.redis.mod.Multi = js.native
    def MULTI(args: js.Array[js.Array[String | Double | Callback[_]]]): typingsSlinky.redis.mod.Multi = js.native
    
    def addCommand(command: String): Unit = js.native
    
    def add_command(command: String): Unit = js.native
    
    def batch(): typingsSlinky.redis.mod.Multi = js.native
    def batch(args: js.Array[js.Array[String | Double | Callback[_]]]): typingsSlinky.redis.mod.Multi = js.native
    
    var command_queue: js.Array[_] = js.native
    
    var command_queue_length: Double = js.native
    
    var connected: Boolean = js.native
    
    var connection_id: Double = js.native
    
    def cork(): Unit = js.native
    
    def duplicate(): typingsSlinky.redis.mod.RedisClient = js.native
    def duplicate(options: js.UndefOr[scala.Nothing], cb: Callback[typingsSlinky.redis.mod.RedisClient]): typingsSlinky.redis.mod.RedisClient = js.native
    def duplicate(options: ClientOpts): typingsSlinky.redis.mod.RedisClient = js.native
    def duplicate(options: ClientOpts, cb: Callback[typingsSlinky.redis.mod.RedisClient]): typingsSlinky.redis.mod.RedisClient = js.native
    
    /**
      * Client methods.
      */
    def end(): Unit = js.native
    def end(flush: Boolean): Unit = js.native
    
    /**
      * Mark the start of a transaction block.
      */
    def multi(): typingsSlinky.redis.mod.Multi = js.native
    def multi(args: js.Array[js.Array[String | Double | Callback[_]]]): typingsSlinky.redis.mod.Multi = js.native
    
    var offline_queue: js.Array[_] = js.native
    
    var offline_queue_length: Double = js.native
    
    @JSName("on")
    def on_message(event: message, listener: js.Function2[/* channel */ String, /* message */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_messagebuffer(event: message_buffer, listener: js.Function2[/* channel */ String, /* message */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_pmessage(
      event: pmessage,
      listener: js.Function3[/* pattern */ String, /* channel */ String, /* message */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_pmessagebuffer(
      event: pmessage_buffer,
      listener: js.Function3[/* pattern */ String, /* channel */ String, /* message */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_psubscribe(event: psubscribe, listener: js.Function2[/* pattern */ String, /* count */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_punsubscribe(event: punsubscribe, listener: js.Function2[/* pattern */ String, /* count */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_subscribe(event: subscribe, listener: js.Function2[/* channel */ String, /* count */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_unsubscribe(event: unsubscribe, listener: js.Function2[/* channel */ String, /* count */ Double, Unit]): this.type = js.native
    
    var retry_backoff: Double = js.native
    
    var retry_delay: Double | js.Error = js.native
    
    def sendCommand(command: String): Boolean = js.native
    def sendCommand(command: String, args: js.UndefOr[scala.Nothing], cb: Callback[_]): Boolean = js.native
    def sendCommand(command: String, args: js.Array[_]): Boolean = js.native
    def sendCommand(command: String, args: js.Array[_], cb: Callback[_]): Boolean = js.native
    def sendCommand(command: String, cb: Callback[_]): Boolean = js.native
    
    def send_command(command: String): Boolean = js.native
    def send_command(command: String, args: js.UndefOr[scala.Nothing], cb: Callback[_]): Boolean = js.native
    def send_command(command: String, args: js.Array[_]): Boolean = js.native
    def send_command(command: String, args: js.Array[_], cb: Callback[_]): Boolean = js.native
    def send_command(command: String, cb: Callback[_]): Boolean = js.native
    
    var server_info: ServerInfo = js.native
    
    var stream: Duplex = js.native
    
    def uncork(): Unit = js.native
    
    def unref(): Unit = js.native
  }
  @JSImport("redis", "RedisClient")
  @js.native
  val RedisClient: Instantiable1[/* options */ ClientOpts, typingsSlinky.redis.mod.RedisClient] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("redis", "RedisClient")
  @js.native
  class RedisClientCls protected ()
    extends typingsSlinky.redis.mod.RedisClient {
    def this(options: ClientOpts) = this()
  }
  
  @JSImport("redis", "RedisError")
  @js.native
  class RedisError () extends Error
  
  @JSImport("redis", "ReplyError")
  @js.native
  class ReplyError () extends RedisError {
    
    var args: js.UndefOr[js.Array[_]] = js.native
    
    var code: String = js.native
    
    var command: String = js.native
  }
  
  @JSImport("redis", "createClient")
  @js.native
  def createClient(): typingsSlinky.redis.mod.RedisClient = js.native
  @JSImport("redis", "createClient")
  @js.native
  def createClient(options: ClientOpts): typingsSlinky.redis.mod.RedisClient = js.native
  @JSImport("redis", "createClient")
  @js.native
  def createClient(port: Double): typingsSlinky.redis.mod.RedisClient = js.native
  @JSImport("redis", "createClient")
  @js.native
  def createClient(port: Double, host: js.UndefOr[scala.Nothing], options: ClientOpts): typingsSlinky.redis.mod.RedisClient = js.native
  @JSImport("redis", "createClient")
  @js.native
  def createClient(port: Double, host: String): typingsSlinky.redis.mod.RedisClient = js.native
  @JSImport("redis", "createClient")
  @js.native
  def createClient(port: Double, host: String, options: ClientOpts): typingsSlinky.redis.mod.RedisClient = js.native
  @JSImport("redis", "createClient")
  @js.native
  def createClient(unix_socket: String): typingsSlinky.redis.mod.RedisClient = js.native
  @JSImport("redis", "createClient")
  @js.native
  def createClient(unix_socket: String, options: ClientOpts): typingsSlinky.redis.mod.RedisClient = js.native
  
  @JSImport("redis", "debug_mode")
  @js.native
  def debugMode: Boolean = js.native
  
  @scala.inline
  def debugMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug_mode")(x.asInstanceOf[js.Any])
  
  @JSImport("redis", "print")
  @js.native
  def print(err: js.Error, reply: js.Any): Unit = js.native
  @JSImport("redis", "print")
  @js.native
  def print(err: Null, reply: js.Any): Unit = js.native
  
  type Callback[T] = js.Function2[/* err */ js.Error | Null, /* reply */ T, Unit]
  
  @js.native
  trait ClientOpts extends StObject {
    
    var auth_pass: js.UndefOr[String] = js.native
    
    var connect_timeout: js.UndefOr[Double] = js.native
    
    /**
      * If set, client will run Redis **select** command on connect.
      * @default null
      */
    var db: js.UndefOr[String | Double] = js.native
    
    /**
      * If set to `true`, then replies will be sent to callbacks as Buffers.
      * This option lets you switch between Buffers and Strings on a per-command basis,
      * whereas `return_buffers` applies to every command on a client.\
      * **Note**: This doesn't work properly with the pubsub mode.
      * A subscriber has to either always return Strings or Buffers.
      * @default false
      */
    var detect_buffers: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to `true`, a client won't resubscribe after disconnecting.
      * @default false
      */
    var disable_resubscribing: js.UndefOr[Boolean] = js.native
    
    /**
      * By default, if there is no active connection to the Redis server,
      * commands are added to a queue and are executed once the connection has been established.
      * Setting `enable_offline_queue` to `false` will disable this feature
      * and the callback will be executed immediately with an error,
      * or an error will be emitted if no callback is specified.
      * @default true
      */
    var enable_offline_queue: js.UndefOr[Boolean] = js.native
    
    /**
      * You can force using IPv6 if you set the family to **IPv6**.
      * @see Node.js [net](https://nodejs.org/api/net.html)
      * or [dns](https://nodejs.org/api/dns.html)
      * modules on how to use the family type.
      * @default IPv4
      */
    var family: js.UndefOr[String] = js.native
    
    /**
      * IP address of the Redis server.
      * @default 127.0.0.1
      */
    var host: js.UndefOr[String] = js.native
    
    var max_attempts: js.UndefOr[Double] = js.native
    
    /**
      * When a connection is established to the Redis server,
      * the server might still be loading the database from disk.
      * While loading, the server will not respond to any commands.
      * To work around this, Node Redis has a "ready check" which sends the **INFO** command to the server.
      * The response from the **INFO** command indicates whether the server is ready for more commands.
      * When ready, **node_redis** emits a **ready** event.
      * Setting `no_ready_check` to `true` will inhibit this check.
      * @default false
      */
    var no_ready_check: js.UndefOr[Boolean] = js.native
    
    var parser: js.UndefOr[String] = js.native
    
    /**
      * If set, client will run Redis auth command on connect.
      * Alias `auth_pass`.\
      * **Note**: Node Redis < 2.5 must use `auth_pass`.
      * @default null
      */
    var password: js.UndefOr[String] = js.native
    
    /**
      * The UNIX socket string of the Redis server.
      * @default null
      */
    var path: js.UndefOr[String] = js.native
    
    /**
      * Port of the Redis server.
      * @default 6379
      */
    var port: js.UndefOr[Double] = js.native
    
    /**
      * A string used to prefix all used keys (e.g. namespace:test).
      * Please be aware that the **keys** command will not be prefixed.
      * The **keys** command has a "pattern" as argument and no key
      * and it would be impossible to determine the existing keys in Redis if this would be prefixed.
      * @default null
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * Passing an object with renamed commands to use instead of the original functions.
      * For example, if you renamed the command **KEYS** to "DO-NOT-USE"
      * then the `rename_commands` object would be: { KEYS : "DO-NOT-USE" }.
      * @see the [Redis security topics](http://redis.io/topics/security) for more info.
      * @default null
      */
    var rename_commands: js.UndefOr[StringDictionary[String] | Null] = js.native
    
    var retry_max_delay: js.UndefOr[Double] = js.native
    
    /**
      * A function that receives an options object as parameter including the retry `attempt`,
      * the `total_retry_time` indicating how much time passed since the last time connected,
      * the **error** why the connection was lost and the number of `times_connected` in total.
      * If you return a number from this function, the retry will happen after that time in milliseconds.
      * If you return a non-number, no further retry will happen
      * and all offline commands are flushed with errors.
      * Return an error to return that specific error to all offline commands.
      * @default function
      * @see interface `RetryStrategyOptions`
      * @example
      * const client = redis.createClient({
      *   retry_strategy: function(options) {
      *   if (options.error && options.error.code === "ECONNREFUSED") {
      *     // End reconnecting on a specific error and flush all commands with
      *     // a individual error
      *     return new Error("The server refused the connection");
      *   }
      *   if (options.total_retry_time > 1000 * 60 * 60) {
      *     // End reconnecting after a specific timeout and flush all commands
      *     // with a individual error
      *     return new Error("Retry time exhausted");
      *   }
      *   if (options.attempt > 10) {
      *     // End reconnecting with built in error
      *     return undefined;
      *   }
      *   // reconnect after
      *   return Math.min(options.attempt * 100, 3000);
      *   }
      * });
      */
    var retry_strategy: js.UndefOr[RetryStrategy] = js.native
    
    /**
      * If set to `true`, all commands that were unfulfilled while the connection is lost
      * will be retried after the connection has been reestablished.
      * Use this with caution if you use state altering commands (e.g. incr).
      * This is especially useful if you use blocking commands.
      * @default false
      */
    var retry_unfulfilled_commands: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to `true`, then all replies will be sent to callbacks as Buffers instead of Strings.
      * @default false
      */
    var return_buffers: js.UndefOr[Boolean] = js.native
    
    /**
      * Initial Delay in milliseconds.
      * This will also set the initial delay for keep-alive packets being sent to Redis.
      * @default 0
      */
    var socket_initial_delay: js.UndefOr[Double] = js.native
    
    /**
      * If set to `true`, the keep-alive functionality is enabled on the underlying socket.
      * @default true
      */
    var socket_keepalive: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to `true`, Node Redis will return Redis number values as Strings instead of javascript Numbers.
      * Useful if you need to handle big numbers (above `Number.MAX_SAFE_INTEGER` === 2^53).
      * Hiredis is incapable of this behavior, so setting this option to `true`
      * will result in the built-in javascript parser being used no matter
      * the value of the `parser` option.
      * @default null
      */
    var string_numbers: js.UndefOr[Boolean] = js.native
    
    /**
      * An object containing options to pass to
      * [tls.connect](http://nodejs.org/api/tls.html#tls_tls_connect_port_host_options_callback)
      * to set up a TLS connection to Redis
      * (if, for example, it is set up to be accessible via a tunnel).
      * @default null
      */
    var tls: js.UndefOr[js.Any] = js.native
    
    /**
      * The URL of the Redis server.\
      * Format:
      * [redis[s]:]//[[user][:password@]][host][:port][/db-number][?db=db-number[&password=bar[&option=value]]]\
      * More info avaliable at [IANA](http://www.iana.org/assignments/uri-schemes/prov/redis).
      * @default null
      */
    var url: js.UndefOr[String] = js.native
  }
  object ClientOpts {
    
    @scala.inline
    def apply(): ClientOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOpts]
    }
    
    @scala.inline
    implicit class ClientOptsMutableBuilder[Self <: ClientOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth_pass(value: String): Self = StObject.set(x, "auth_pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuth_passUndefined: Self = StObject.set(x, "auth_pass", js.undefined)
      
      @scala.inline
      def setConnect_timeout(value: Double): Self = StObject.set(x, "connect_timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnect_timeoutUndefined: Self = StObject.set(x, "connect_timeout", js.undefined)
      
      @scala.inline
      def setDb(value: String | Double): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      @scala.inline
      def setDetect_buffers(value: Boolean): Self = StObject.set(x, "detect_buffers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetect_buffersUndefined: Self = StObject.set(x, "detect_buffers", js.undefined)
      
      @scala.inline
      def setDisable_resubscribing(value: Boolean): Self = StObject.set(x, "disable_resubscribing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_resubscribingUndefined: Self = StObject.set(x, "disable_resubscribing", js.undefined)
      
      @scala.inline
      def setEnable_offline_queue(value: Boolean): Self = StObject.set(x, "enable_offline_queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnable_offline_queueUndefined: Self = StObject.set(x, "enable_offline_queue", js.undefined)
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setMax_attempts(value: Double): Self = StObject.set(x, "max_attempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_attemptsUndefined: Self = StObject.set(x, "max_attempts", js.undefined)
      
      @scala.inline
      def setNo_ready_check(value: Boolean): Self = StObject.set(x, "no_ready_check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_ready_checkUndefined: Self = StObject.set(x, "no_ready_check", js.undefined)
      
      @scala.inline
      def setParser(value: String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRename_commands(value: StringDictionary[String]): Self = StObject.set(x, "rename_commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRename_commandsNull: Self = StObject.set(x, "rename_commands", null)
      
      @scala.inline
      def setRename_commandsUndefined: Self = StObject.set(x, "rename_commands", js.undefined)
      
      @scala.inline
      def setRetry_max_delay(value: Double): Self = StObject.set(x, "retry_max_delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_max_delayUndefined: Self = StObject.set(x, "retry_max_delay", js.undefined)
      
      @scala.inline
      def setRetry_strategy(value: /* options */ RetryStrategyOptions => Double | js.Error | js.Any): Self = StObject.set(x, "retry_strategy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRetry_strategyUndefined: Self = StObject.set(x, "retry_strategy", js.undefined)
      
      @scala.inline
      def setRetry_unfulfilled_commands(value: Boolean): Self = StObject.set(x, "retry_unfulfilled_commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_unfulfilled_commandsUndefined: Self = StObject.set(x, "retry_unfulfilled_commands", js.undefined)
      
      @scala.inline
      def setReturn_buffers(value: Boolean): Self = StObject.set(x, "return_buffers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturn_buffersUndefined: Self = StObject.set(x, "return_buffers", js.undefined)
      
      @scala.inline
      def setSocket_initial_delay(value: Double): Self = StObject.set(x, "socket_initial_delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocket_initial_delayUndefined: Self = StObject.set(x, "socket_initial_delay", js.undefined)
      
      @scala.inline
      def setSocket_keepalive(value: Boolean): Self = StObject.set(x, "socket_keepalive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocket_keepaliveUndefined: Self = StObject.set(x, "socket_keepalive", js.undefined)
      
      @scala.inline
      def setString_numbers(value: Boolean): Self = StObject.set(x, "string_numbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString_numbersUndefined: Self = StObject.set(x, "string_numbers", js.undefined)
      
      @scala.inline
      def setTls(value: js.Any): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Commands[R] extends StObject {
    
    def APPEND(key: String, value: String): R = js.native
    def APPEND(key: String, value: String, cb: Callback[Double]): R = js.native
    
    def AUTH(password: String): R = js.native
    def AUTH(password: String, callback: Callback[String]): R = js.native
    
    def BGREWRITEAOF(): R = js.native
    @JSName("BGREWRITEAOF")
    def BGREWRITEAOF_OK(cb: Callback[OK]): R = js.native
    
    def BGSAVE(): R = js.native
    def BGSAVE(cb: Callback[String]): R = js.native
    
    def BITCOUNT(key: String): R = js.native
    def BITCOUNT(key: String, cb: Callback[Double]): R = js.native
    def BITCOUNT(key: String, start: Double, end: Double): R = js.native
    def BITCOUNT(key: String, start: Double, end: Double, cb: Callback[Double]): R = js.native
    
    def BITFIELD(args: (String | Double | (Callback[js.Tuple2[Double, Double]]))*): R = js.native
    def BITFIELD(key: String, arg1: String | Double): R = js.native
    def BITFIELD(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[js.Tuple2[Double, Double]]]
    ): R = js.native
    def BITFIELD(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[js.Tuple2[Double, Double]]]
    ): R = js.native
    def BITFIELD(key: String, arg1: String | Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: String): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def BITFIELD(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def BITFIELD(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: String, arg3: Double): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def BITFIELD(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def BITFIELD(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: String, arg3: Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: String, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: Double): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: Double, arg3: String): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def BITFIELD(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def BITFIELD(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: Double, arg3: String, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: Double, arg3: Double): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def BITFIELD(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def BITFIELD(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: Double, arg3: Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, arg1: String, arg2: Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, arg1: js.Array[String | Double]): R = js.native
    def BITFIELD(key: String, arg1: js.Array[String | Double], cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: String): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: String, arg3: String): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def BITFIELD(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def BITFIELD(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: String, arg3: String, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: String, arg3: Double): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def BITFIELD(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def BITFIELD(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: String, arg3: Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: String, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: Double): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: Double, arg3: String): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def BITFIELD(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def BITFIELD(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: Double, arg3: String, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: Double, arg3: Double): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def BITFIELD(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def BITFIELD(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: Double, arg3: Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, arg1: Double, arg2: Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def BITFIELD(key: String, args: (String | Double | (Callback[js.Tuple2[Double, Double]]))*): R = js.native
    @JSName("BITFIELD")
    var BITFIELD_Original: OverloadedKeyCommand[String | Double, js.Tuple2[Double, Double], R] = js.native
    
    def BITOP(operation: String, destkey: String, args: (String | Callback[Double])*): R = js.native
    def BITOP(operation: String, destkey: String, key1: String, key2: String): R = js.native
    def BITOP(operation: String, destkey: String, key1: String, key2: String, cb: Callback[Double]): R = js.native
    def BITOP(operation: String, destkey: String, key1: String, key2: String, key3: String): R = js.native
    def BITOP(operation: String, destkey: String, key1: String, key2: String, key3: String, cb: Callback[Double]): R = js.native
    def BITOP(operation: String, destkey: String, key: String): R = js.native
    def BITOP(operation: String, destkey: String, key: String, cb: Callback[Double]): R = js.native
    
    def BITPOS(key: String, bit: Double): R = js.native
    def BITPOS(key: String, bit: Double, cb: Callback[Double]): R = js.native
    def BITPOS(key: String, bit: Double, start: Double): R = js.native
    def BITPOS(key: String, bit: Double, start: Double, cb: Callback[Double]): R = js.native
    def BITPOS(key: String, bit: Double, start: Double, end: Double): R = js.native
    def BITPOS(key: String, bit: Double, start: Double, end: Double, cb: Callback[Double]): R = js.native
    
    def BLPOP(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: Double): R = js.native
    def BLPOP(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: Double,
      cb: Callback[js.Tuple2[String, String]]
    ): R = js.native
    def BLPOP(arg1: String, arg2: String, arg3: String, arg4: String, arg5: Double): R = js.native
    def BLPOP(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: Double,
      cb: Callback[js.Tuple2[String, String]]
    ): R = js.native
    def BLPOP(arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def BLPOP(arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[js.Tuple2[String, String]]): R = js.native
    def BLPOP(arg1: String, arg2: String, arg3: Double): R = js.native
    def BLPOP(arg1: String, arg2: String, arg3: Double, cb: Callback[js.Tuple2[String, String]]): R = js.native
    def BLPOP(arg1: String, arg2: js.Array[String | Double]): R = js.native
    def BLPOP(arg1: String, arg2: js.Array[String | Double], cb: Callback[js.Tuple2[String, String]]): R = js.native
    def BLPOP(arg1: String, arg2: Double): R = js.native
    def BLPOP(arg1: String, arg2: Double, cb: Callback[js.Tuple2[String, String]]): R = js.native
    def BLPOP(args: (String | Double | (Callback[js.Tuple2[String, String]]))*): R = js.native
    def BLPOP(args: js.Array[String | Double]): R = js.native
    def BLPOP(args: js.Array[String | Double], cb: Callback[js.Tuple2[String, String]]): R = js.native
    @JSName("BLPOP")
    var BLPOP_Original: OverloadedLastCommand[String, Double, js.Tuple2[String, String], R] = js.native
    
    def BRPOP(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: Double): R = js.native
    def BRPOP(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: Double,
      cb: Callback[js.Tuple2[String, String]]
    ): R = js.native
    def BRPOP(arg1: String, arg2: String, arg3: String, arg4: String, arg5: Double): R = js.native
    def BRPOP(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: Double,
      cb: Callback[js.Tuple2[String, String]]
    ): R = js.native
    def BRPOP(arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def BRPOP(arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[js.Tuple2[String, String]]): R = js.native
    def BRPOP(arg1: String, arg2: String, arg3: Double): R = js.native
    def BRPOP(arg1: String, arg2: String, arg3: Double, cb: Callback[js.Tuple2[String, String]]): R = js.native
    def BRPOP(arg1: String, arg2: js.Array[String | Double]): R = js.native
    def BRPOP(arg1: String, arg2: js.Array[String | Double], cb: Callback[js.Tuple2[String, String]]): R = js.native
    def BRPOP(arg1: String, arg2: Double): R = js.native
    def BRPOP(arg1: String, arg2: Double, cb: Callback[js.Tuple2[String, String]]): R = js.native
    def BRPOP(args: (String | Double | (Callback[js.Tuple2[String, String]]))*): R = js.native
    def BRPOP(args: js.Array[String | Double]): R = js.native
    def BRPOP(args: js.Array[String | Double], cb: Callback[js.Tuple2[String, String]]): R = js.native
    
    def BRPOPLPUSH(source: String, destination: String, timeout: Double): R = js.native
    def BRPOPLPUSH(source: String, destination: String, timeout: Double, cb: Callback[String | Null]): R = js.native
    
    @JSName("BRPOP")
    var BRPOP_Original: OverloadedLastCommand[String, Double, js.Tuple2[String, String], R] = js.native
    
    def CLIENT(arg1: String): R = js.native
    def CLIENT(arg1: String, arg2: String): R = js.native
    def CLIENT(arg1: String, arg2: String, arg3: String): R = js.native
    def CLIENT(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def CLIENT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def CLIENT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def CLIENT(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[_]
    ): R = js.native
    def CLIENT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[_]): R = js.native
    def CLIENT(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def CLIENT(arg1: String, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def CLIENT(arg1: String, arg2: String, cb: Callback[_]): R = js.native
    def CLIENT(arg1: String, arg2: js.Array[String]): R = js.native
    def CLIENT(arg1: String, arg2: js.Array[String], cb: Callback[_]): R = js.native
    def CLIENT(arg1: String, cb: Callback[_]): R = js.native
    def CLIENT(arg1: js.Array[String]): R = js.native
    def CLIENT(arg1: js.Array[String], cb: Callback[_]): R = js.native
    def CLIENT(args: (String | Callback[_])*): R = js.native
    @JSName("CLIENT")
    var CLIENT_Original: OverloadedCommand[String, _, R] = js.native
    
    def CLUSTER(arg1: String): this.type = js.native
    def CLUSTER(arg1: String, arg2: String): this.type = js.native
    def CLUSTER(arg1: String, arg2: String, arg3: String): this.type = js.native
    def CLUSTER(arg1: String, arg2: String, arg3: String, arg4: String): this.type = js.native
    def CLUSTER(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): this.type = js.native
    def CLUSTER(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): this.type = js.native
    def CLUSTER(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[_]
    ): this.type = js.native
    def CLUSTER(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[_]): this.type = js.native
    def CLUSTER(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[_]): this.type = js.native
    def CLUSTER(arg1: String, arg2: String, arg3: String, cb: Callback[_]): this.type = js.native
    def CLUSTER(arg1: String, arg2: String, cb: Callback[_]): this.type = js.native
    def CLUSTER(arg1: String, arg2: js.Array[String]): this.type = js.native
    def CLUSTER(arg1: String, arg2: js.Array[String], cb: Callback[_]): this.type = js.native
    def CLUSTER(arg1: String, cb: Callback[_]): this.type = js.native
    def CLUSTER(arg1: js.Array[String]): this.type = js.native
    def CLUSTER(arg1: js.Array[String], cb: Callback[_]): this.type = js.native
    def CLUSTER(args: (String | Callback[_])*): this.type = js.native
    @JSName("CLUSTER")
    var CLUSTER_Original: OverloadedCommand[String, _, this.type] = js.native
    
    def COMMAND(): R = js.native
    def COMMAND(cb: Callback[js.Array[js.Tuple6[String, Double, js.Array[String], Double, Double, Double]]]): R = js.native
    
    def CONFIG(arg1: String): R = js.native
    def CONFIG(arg1: String, arg2: String): R = js.native
    def CONFIG(arg1: String, arg2: String, arg3: String): R = js.native
    def CONFIG(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def CONFIG(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def CONFIG(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def CONFIG(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Boolean]
    ): R = js.native
    def CONFIG(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Boolean]): R = js.native
    def CONFIG(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Boolean]): R = js.native
    def CONFIG(arg1: String, arg2: String, arg3: String, cb: Callback[Boolean]): R = js.native
    def CONFIG(arg1: String, arg2: String, cb: Callback[Boolean]): R = js.native
    def CONFIG(arg1: String, arg2: js.Array[String]): R = js.native
    def CONFIG(arg1: String, arg2: js.Array[String], cb: Callback[Boolean]): R = js.native
    def CONFIG(arg1: String, cb: Callback[Boolean]): R = js.native
    def CONFIG(arg1: js.Array[String]): R = js.native
    def CONFIG(arg1: js.Array[String], cb: Callback[Boolean]): R = js.native
    def CONFIG(args: (String | Callback[Boolean])*): R = js.native
    @JSName("CONFIG")
    var CONFIG_Original: OverloadedCommand[String, Boolean, R] = js.native
    
    def DBSIZE(): R = js.native
    def DBSIZE(cb: Callback[Double]): R = js.native
    
    def DEBUG(arg1: String): R = js.native
    def DEBUG(arg1: String, arg2: String): R = js.native
    def DEBUG(arg1: String, arg2: String, arg3: String): R = js.native
    def DEBUG(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def DEBUG(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def DEBUG(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def DEBUG(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Boolean]
    ): R = js.native
    def DEBUG(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Boolean]): R = js.native
    def DEBUG(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Boolean]): R = js.native
    def DEBUG(arg1: String, arg2: String, arg3: String, cb: Callback[Boolean]): R = js.native
    def DEBUG(arg1: String, arg2: String, cb: Callback[Boolean]): R = js.native
    def DEBUG(arg1: String, arg2: js.Array[String]): R = js.native
    def DEBUG(arg1: String, arg2: js.Array[String], cb: Callback[Boolean]): R = js.native
    def DEBUG(arg1: String, cb: Callback[Boolean]): R = js.native
    def DEBUG(arg1: js.Array[String]): R = js.native
    def DEBUG(arg1: js.Array[String], cb: Callback[Boolean]): R = js.native
    def DEBUG(args: (String | Callback[Boolean])*): R = js.native
    @JSName("DEBUG")
    var DEBUG_Original: OverloadedCommand[String, Boolean, R] = js.native
    
    def DECR(key: String): R = js.native
    def DECR(key: String, cb: Callback[Double]): R = js.native
    
    def DECRBY(key: String, decrement: Double): R = js.native
    def DECRBY(key: String, decrement: Double, cb: Callback[Double]): R = js.native
    
    def DEL(arg1: String): R = js.native
    def DEL(arg1: String, arg2: String): R = js.native
    def DEL(arg1: String, arg2: String, arg3: String): R = js.native
    def DEL(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def DEL(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def DEL(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def DEL(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def DEL(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def DEL(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def DEL(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def DEL(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def DEL(arg1: String, arg2: js.Array[String]): R = js.native
    def DEL(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def DEL(arg1: String, cb: Callback[Double]): R = js.native
    def DEL(arg1: js.Array[String]): R = js.native
    def DEL(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def DEL(args: (String | Callback[Double])*): R = js.native
    @JSName("DEL")
    var DEL_Original: OverloadedCommand[String, Double, R] = js.native
    
    def DISCARD(): R = js.native
    @JSName("DISCARD")
    def DISCARD_OK(cb: Callback[OK]): R = js.native
    
    def DUMP(key: String): R = js.native
    def DUMP(key: String, cb: Callback[String]): R = js.native
    
    def ECHO[T /* <: String */](message: T): R = js.native
    def ECHO[T /* <: String */](message: T, cb: Callback[T]): R = js.native
    
    def EVAL(arg1: String | Double): R = js.native
    def EVAL(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[_]]
    ): R = js.native
    def EVAL(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[_]]
    ): R = js.native
    def EVAL(arg1: String | Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: String | Double): R = js.native
    def EVAL(arg1: String, arg2: String | Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: String, arg3: String): R = js.native
    def EVAL(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def EVAL(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def EVAL(arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: String, arg3: Double): R = js.native
    def EVAL(arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def EVAL(arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def EVAL(arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: String, arg3: Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: js.Array[String | Double]): R = js.native
    def EVAL(arg1: String, arg2: js.Array[String | Double], cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: Double, arg3: String): R = js.native
    def EVAL(arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def EVAL(arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def EVAL(arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: Double, arg3: String, cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: Double, arg3: Double): R = js.native
    def EVAL(arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def EVAL(arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def EVAL(arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: String, arg2: Double, arg3: Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: js.Array[String | Double]): R = js.native
    def EVAL(arg1: js.Array[String | Double], cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: String | Double): R = js.native
    def EVAL(arg1: Double, arg2: String | Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: String, arg3: String): R = js.native
    def EVAL(arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def EVAL(arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def EVAL(arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: String, arg3: Double): R = js.native
    def EVAL(arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def EVAL(arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def EVAL(arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: String, arg3: Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: js.Array[String | Double]): R = js.native
    def EVAL(arg1: Double, arg2: js.Array[String | Double], cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: Double, arg3: String): R = js.native
    def EVAL(arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def EVAL(arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def EVAL(arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: Double, arg3: String, cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: Double, arg3: Double): R = js.native
    def EVAL(arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def EVAL(arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def EVAL(arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def EVAL(arg1: Double, arg2: Double, arg3: Double, cb: Callback[_]): R = js.native
    def EVAL(args: (String | Double | Callback[_])*): R = js.native
    
    def EVALSHA(arg1: String | Double): R = js.native
    def EVALSHA(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[_]]
    ): R = js.native
    def EVALSHA(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[_]]
    ): R = js.native
    def EVALSHA(arg1: String | Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: String | Double): R = js.native
    def EVALSHA(arg1: String, arg2: String | Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: String, arg3: String): R = js.native
    def EVALSHA(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def EVALSHA(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def EVALSHA(arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: String, arg3: Double): R = js.native
    def EVALSHA(arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def EVALSHA(arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def EVALSHA(arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: String, arg3: Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: js.Array[String | Double]): R = js.native
    def EVALSHA(arg1: String, arg2: js.Array[String | Double], cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: Double, arg3: String): R = js.native
    def EVALSHA(arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def EVALSHA(arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def EVALSHA(arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: Double, arg3: String, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: Double, arg3: Double): R = js.native
    def EVALSHA(arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def EVALSHA(arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def EVALSHA(arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: String, arg2: Double, arg3: Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: js.Array[String | Double]): R = js.native
    def EVALSHA(arg1: js.Array[String | Double], cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: String | Double): R = js.native
    def EVALSHA(arg1: Double, arg2: String | Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: String, arg3: String): R = js.native
    def EVALSHA(arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def EVALSHA(arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def EVALSHA(arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: String, arg3: Double): R = js.native
    def EVALSHA(arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def EVALSHA(arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def EVALSHA(arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: String, arg3: Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: js.Array[String | Double]): R = js.native
    def EVALSHA(arg1: Double, arg2: js.Array[String | Double], cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: Double, arg3: String): R = js.native
    def EVALSHA(arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def EVALSHA(arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def EVALSHA(arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: Double, arg3: String, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: Double, arg3: Double): R = js.native
    def EVALSHA(arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def EVALSHA(arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def EVALSHA(arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def EVALSHA(arg1: Double, arg2: Double, arg3: Double, cb: Callback[_]): R = js.native
    def EVALSHA(args: (String | Double | Callback[_])*): R = js.native
    @JSName("EVALSHA")
    var EVALSHA_Original: OverloadedCommand[String | Double, _, R] = js.native
    
    @JSName("EVAL")
    var EVAL_Original: OverloadedCommand[String | Double, _, R] = js.native
    
    def EXISTS(arg1: String): R = js.native
    def EXISTS(arg1: String, arg2: String): R = js.native
    def EXISTS(arg1: String, arg2: String, arg3: String): R = js.native
    def EXISTS(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def EXISTS(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def EXISTS(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def EXISTS(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def EXISTS(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def EXISTS(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def EXISTS(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def EXISTS(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def EXISTS(arg1: String, arg2: js.Array[String]): R = js.native
    def EXISTS(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def EXISTS(arg1: String, cb: Callback[Double]): R = js.native
    def EXISTS(arg1: js.Array[String]): R = js.native
    def EXISTS(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def EXISTS(args: (String | Callback[Double])*): R = js.native
    @JSName("EXISTS")
    var EXISTS_Original: OverloadedCommand[String, Double, R] = js.native
    
    def EXPIRE(key: String, seconds: Double): R = js.native
    def EXPIRE(key: String, seconds: Double, cb: Callback[Double]): R = js.native
    
    def EXPIREAT(key: String, timestamp: Double): R = js.native
    def EXPIREAT(key: String, timestamp: Double, cb: Callback[Double]): R = js.native
    
    def FLUSHALL(): R = js.native
    def FLUSHALL(cb: Callback[String]): R = js.native
    @JSName("FLUSHALL")
    def FLUSHALL_ASYNC(async: ASYNC): R = js.native
    @JSName("FLUSHALL")
    def FLUSHALL_ASYNC(async: ASYNC, cb: Callback[String]): R = js.native
    
    def FLUSHDB(): R = js.native
    @JSName("FLUSHDB")
    def FLUSHDB_ASYNC(async: ASYNC): R = js.native
    @JSName("FLUSHDB")
    def FLUSHDB_ASYNC(async: ASYNC, cb: Callback[String]): R = js.native
    @JSName("FLUSHDB")
    def FLUSHDB_OK(cb: Callback[OK]): R = js.native
    
    def GEOADD(args: (String | Double | Callback[Double])*): R = js.native
    def GEOADD(key: String, arg1: String | Double): R = js.native
    def GEOADD(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    def GEOADD(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    def GEOADD(key: String, arg1: String | Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String, arg3: Double): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double, arg3: String): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double, arg3: Double): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: String, arg2: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: js.Array[String | Double]): R = js.native
    def GEOADD(key: String, arg1: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String, arg3: String): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String, arg3: Double): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double, arg3: String): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double, arg3: Double): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, arg1: Double, arg2: Double, cb: Callback[Double]): R = js.native
    def GEOADD(key: String, args: (String | Double | Callback[Double])*): R = js.native
    @JSName("GEOADD")
    var GEOADD_Original: OverloadedKeyCommand[String | Double, Double, R] = js.native
    
    def GEODIST(args: (String | Callback[String])*): R = js.native
    def GEODIST(key: String, arg1: String): R = js.native
    def GEODIST(key: String, arg1: String, arg2: String): R = js.native
    def GEODIST(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def GEODIST(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def GEODIST(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def GEODIST(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def GEODIST(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def GEODIST(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[String]
    ): R = js.native
    def GEODIST(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def GEODIST(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def GEODIST(key: String, arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def GEODIST(key: String, arg1: String, cb: Callback[String]): R = js.native
    def GEODIST(key: String, arg1: js.Array[String]): R = js.native
    def GEODIST(key: String, arg1: js.Array[String], cb: Callback[String]): R = js.native
    def GEODIST(key: String, args: (String | Callback[String])*): R = js.native
    @JSName("GEODIST")
    var GEODIST_Original: OverloadedKeyCommand[String, String, R] = js.native
    
    def GEOHASH(args: (String | Callback[String])*): R = js.native
    def GEOHASH(key: String, arg1: String): R = js.native
    def GEOHASH(key: String, arg1: String, arg2: String): R = js.native
    def GEOHASH(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def GEOHASH(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def GEOHASH(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def GEOHASH(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def GEOHASH(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def GEOHASH(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[String]
    ): R = js.native
    def GEOHASH(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def GEOHASH(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def GEOHASH(key: String, arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def GEOHASH(key: String, arg1: String, cb: Callback[String]): R = js.native
    def GEOHASH(key: String, arg1: js.Array[String]): R = js.native
    def GEOHASH(key: String, arg1: js.Array[String], cb: Callback[String]): R = js.native
    def GEOHASH(key: String, args: (String | Callback[String])*): R = js.native
    @JSName("GEOHASH")
    var GEOHASH_Original: OverloadedKeyCommand[String, String, R] = js.native
    
    def GEOPOS(args: (String | (Callback[js.Array[js.Tuple2[Double, Double]]]))*): R = js.native
    def GEOPOS(key: String, arg1: String): R = js.native
    def GEOPOS(key: String, arg1: String, arg2: String): R = js.native
    def GEOPOS(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def GEOPOS(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def GEOPOS(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def GEOPOS(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def GEOPOS(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[js.Tuple2[Double, Double]]]
    ): R = js.native
    def GEOPOS(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[js.Tuple2[Double, Double]]]
    ): R = js.native
    def GEOPOS(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[js.Tuple2[Double, Double]]]
    ): R = js.native
    def GEOPOS(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Array[js.Tuple2[Double, Double]]]
    ): R = js.native
    def GEOPOS(key: String, arg1: String, arg2: String, cb: Callback[js.Array[js.Tuple2[Double, Double]]]): R = js.native
    def GEOPOS(key: String, arg1: String, cb: Callback[js.Array[js.Tuple2[Double, Double]]]): R = js.native
    def GEOPOS(key: String, arg1: js.Array[String]): R = js.native
    def GEOPOS(key: String, arg1: js.Array[String], cb: Callback[js.Array[js.Tuple2[Double, Double]]]): R = js.native
    def GEOPOS(key: String, args: (String | (Callback[js.Array[js.Tuple2[Double, Double]]]))*): R = js.native
    @JSName("GEOPOS")
    var GEOPOS_Original: OverloadedKeyCommand[String, js.Array[js.Tuple2[Double, Double]], R] = js.native
    
    def GEORADIUS(
      args: (String | Double | (Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]))*
    ): R = js.native
    def GEORADIUS(key: String, arg1: String | Double): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[
          Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
        ]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[
          Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
        ]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String | Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: String): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: String, arg3: Double): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: Double): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: Double, arg3: String): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: Double, arg3: Double): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: String,
      arg2: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: js.Array[String | Double]): R = js.native
    def GEORADIUS(
      key: String,
      arg1: js.Array[String | Double],
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: String): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: String, arg3: String): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: String, arg3: Double): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: Double): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: Double, arg3: String): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: Double, arg3: Double): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(
      key: String,
      arg1: Double,
      arg2: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUS(
      key: String,
      args: (String | Double | (Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]))*
    ): R = js.native
    
    def GEORADIUSBYMEMBER(
      args: (String | Double | (Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]))*
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String | Double): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[
          Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
        ]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[
          Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
        ]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String | Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: String): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: String, arg3: Double): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: Double): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: Double, arg3: String): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: Double, arg3: Double): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: String,
      arg2: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: js.Array[String | Double]): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: js.Array[String | Double],
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: String): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: String, arg3: String): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: String, arg3: Double): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: Double): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: Double, arg3: String): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: Double, arg3: Double): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      arg1: Double,
      arg2: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def GEORADIUSBYMEMBER(
      key: String,
      args: (String | Double | (Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]))*
    ): R = js.native
    @JSName("GEORADIUSBYMEMBER")
    var GEORADIUSBYMEMBER_Original: OverloadedKeyCommand[
        String | Double, 
        js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])], 
        R
      ] = js.native
    
    @JSName("GEORADIUS")
    var GEORADIUS_Original: OverloadedKeyCommand[
        String | Double, 
        js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])], 
        R
      ] = js.native
    
    def GET(key: String): R = js.native
    def GET(key: String, cb: Callback[String | Null]): R = js.native
    
    def GETBIT(key: String, offset: Double): R = js.native
    def GETBIT(key: String, offset: Double, cb: Callback[Double]): R = js.native
    
    def GETRANGE(key: String, start: Double, end: Double): R = js.native
    def GETRANGE(key: String, start: Double, end: Double, cb: Callback[String]): R = js.native
    
    def GETSET(key: String, value: String): R = js.native
    def GETSET(key: String, value: String, cb: Callback[String]): R = js.native
    
    def HDEL(args: (String | Callback[Double])*): R = js.native
    def HDEL(key: String, arg1: String): R = js.native
    def HDEL(key: String, arg1: String, arg2: String): R = js.native
    def HDEL(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def HDEL(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def HDEL(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def HDEL(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def HDEL(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def HDEL(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def HDEL(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def HDEL(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def HDEL(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def HDEL(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def HDEL(key: String, arg1: js.Array[String]): R = js.native
    def HDEL(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def HDEL(key: String, args: (String | Callback[Double])*): R = js.native
    @JSName("HDEL")
    var HDEL_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    def HEXISTS(key: String, field: String): R = js.native
    def HEXISTS(key: String, field: String, cb: Callback[Double]): R = js.native
    
    def HGET(key: String, field: String): R = js.native
    def HGET(key: String, field: String, cb: Callback[String]): R = js.native
    
    def HGETALL(key: String): R = js.native
    def HGETALL(key: String, cb: Callback[StringDictionary[String]]): R = js.native
    
    def HINCRBY(key: String, field: String, increment: Double): R = js.native
    def HINCRBY(key: String, field: String, increment: Double, cb: Callback[Double]): R = js.native
    
    def HINCRBYFLOAT(key: String, field: String, increment: Double): R = js.native
    def HINCRBYFLOAT(key: String, field: String, increment: Double, cb: Callback[String]): R = js.native
    
    def HKEYS(key: String): R = js.native
    def HKEYS(key: String, cb: Callback[js.Array[String]]): R = js.native
    
    def HLEN(key: String): R = js.native
    def HLEN(key: String, cb: Callback[Double]): R = js.native
    
    def HMGET(args: (String | Callback[js.Array[String]])*): R = js.native
    def HMGET(key: String, arg1: String): R = js.native
    def HMGET(key: String, arg1: String, arg2: String): R = js.native
    def HMGET(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def HMGET(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def HMGET(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def HMGET(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def HMGET(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def HMGET(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def HMGET(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def HMGET(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[js.Array[String]]): R = js.native
    def HMGET(key: String, arg1: String, arg2: String, cb: Callback[js.Array[String]]): R = js.native
    def HMGET(key: String, arg1: String, cb: Callback[js.Array[String]]): R = js.native
    def HMGET(key: String, arg1: js.Array[String]): R = js.native
    def HMGET(key: String, arg1: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def HMGET(key: String, args: (String | Callback[js.Array[String]])*): R = js.native
    @JSName("HMGET")
    var HMGET_Original: OverloadedKeyCommand[String, js.Array[String], R] = js.native
    
    def HMSET(args: Array[String | Double]): R = js.native
    def HMSET(key: String, arg1: String | Double): R = js.native
    def HMSET(key: String, arg1: String, arg2: String): R = js.native
    def HMSET(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def HMSET(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def HMSET(key: String, arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def HMSET(key: String, arg1: String, arg2: String, arg3: Double): R = js.native
    def HMSET(key: String, arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def HMSET(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def HMSET(key: String, arg1: String, arg2: Double): R = js.native
    def HMSET(key: String, arg1: String, arg2: Double, arg3: String): R = js.native
    def HMSET(key: String, arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def HMSET(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def HMSET(key: String, arg1: String, arg2: Double, arg3: Double): R = js.native
    def HMSET(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def HMSET(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def HMSET(key: String, arg1: js.Array[String | Double]): R = js.native
    def HMSET(key: String, arg1: StringDictionary[String | Double]): R = js.native
    def HMSET(key: String, arg1: Double, arg2: String): R = js.native
    def HMSET(key: String, arg1: Double, arg2: String, arg3: String): R = js.native
    def HMSET(key: String, arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def HMSET(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def HMSET(key: String, arg1: Double, arg2: String, arg3: Double): R = js.native
    def HMSET(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def HMSET(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def HMSET(key: String, arg1: Double, arg2: Double): R = js.native
    def HMSET(key: String, arg1: Double, arg2: Double, arg3: String): R = js.native
    def HMSET(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def HMSET(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def HMSET(key: String, arg1: Double, arg2: Double, arg3: Double): R = js.native
    def HMSET(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def HMSET(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    @JSName("HMSET")
    def HMSET_OK(args: Array[String | Double], cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[OK]]
    ): R = js.native
    @JSName("HMSET")
    def HMSET_OK(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[OK]]
    ): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String | Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: String, arg3: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: Double, arg3: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: Double, arg3: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: String, arg2: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: js.Array[String | Double], cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: StringDictionary[String | Double], cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: String, arg3: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: String, arg3: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: Double, arg3: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: Double, arg3: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, arg1: Double, arg2: Double, cb: Callback[OK]): R = js.native
    @JSName("HMSET")
    def HMSET_OK(key: String, args: (String | Double | Callback[OK])*): R = js.native
    @JSName("HMSET")
    var HMSET_Original: OverloadedSetCommand[String | Double, OK, R] = js.native
    
    def HSCAN(args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    def HSCAN(key: String, arg1: String): R = js.native
    def HSCAN(key: String, arg1: String, arg2: String): R = js.native
    def HSCAN(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def HSCAN(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def HSCAN(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def HSCAN(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def HSCAN(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def HSCAN(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def HSCAN(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def HSCAN(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def HSCAN(key: String, arg1: String, arg2: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def HSCAN(key: String, arg1: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def HSCAN(key: String, arg1: js.Array[String]): R = js.native
    def HSCAN(key: String, arg1: js.Array[String], cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def HSCAN(key: String, args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    @JSName("HSCAN")
    var HSCAN_Original: OverloadedKeyCommand[String, js.Tuple2[String, js.Array[String]], R] = js.native
    
    def HSET(args: Array[String]): R = js.native
    def HSET(args: Array[String], cb: Callback[Double]): R = js.native
    def HSET(key: String, arg1: String): R = js.native
    def HSET(key: String, arg1: String, arg2: String): R = js.native
    def HSET(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def HSET(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def HSET(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def HSET(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def HSET(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def HSET(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def HSET(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def HSET(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def HSET(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def HSET(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def HSET(key: String, arg1: js.Array[String]): R = js.native
    def HSET(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def HSET(key: String, arg1: StringDictionary[String]): R = js.native
    def HSET(key: String, arg1: StringDictionary[String], cb: Callback[Double]): R = js.native
    def HSET(key: String, args: (String | Callback[Double])*): R = js.native
    
    def HSETNX(key: String, field: String, value: String): R = js.native
    def HSETNX(key: String, field: String, value: String, cb: Callback[Double]): R = js.native
    
    @JSName("HSET")
    var HSET_Original: OverloadedSetCommand[String, Double, R] = js.native
    
    def HSTRLEN(key: String, field: String): R = js.native
    def HSTRLEN(key: String, field: String, cb: Callback[Double]): R = js.native
    
    def HVALS(key: String): R = js.native
    def HVALS(key: String, cb: Callback[js.Array[String]]): R = js.native
    
    def INCR(key: String): R = js.native
    def INCR(key: String, cb: Callback[Double]): R = js.native
    
    def INCRBY(key: String, increment: Double): R = js.native
    def INCRBY(key: String, increment: Double, cb: Callback[Double]): R = js.native
    
    def INCRBYFLOAT(key: String, increment: Double): R = js.native
    def INCRBYFLOAT(key: String, increment: Double, cb: Callback[String]): R = js.native
    
    def INFO(): R = js.native
    def INFO(cb: Callback[ServerInfo]): R = js.native
    def INFO(section: js.UndefOr[scala.Nothing], cb: Callback[ServerInfo]): R = js.native
    def INFO(section: String): R = js.native
    def INFO(section: String, cb: Callback[ServerInfo]): R = js.native
    def INFO(section: js.Array[String]): R = js.native
    def INFO(section: js.Array[String], cb: Callback[ServerInfo]): R = js.native
    
    def KEYS(pattern: String): R = js.native
    def KEYS(pattern: String, cb: Callback[js.Array[String]]): R = js.native
    
    def LASTSAVE(): R = js.native
    def LASTSAVE(cb: Callback[Double]): R = js.native
    
    def LINDEX(key: String, index: Double): R = js.native
    def LINDEX(key: String, index: Double, cb: Callback[String]): R = js.native
    
    @JSName("LINSERT")
    def LINSERT_AFTER(key: String, dir: AFTER, pivot: String, value: String): R = js.native
    @JSName("LINSERT")
    def LINSERT_AFTER(key: String, dir: AFTER, pivot: String, value: String, cb: Callback[String]): R = js.native
    @JSName("LINSERT")
    def LINSERT_BEFORE(key: String, dir: BEFORE, pivot: String, value: String): R = js.native
    @JSName("LINSERT")
    def LINSERT_BEFORE(key: String, dir: BEFORE, pivot: String, value: String, cb: Callback[String]): R = js.native
    
    def LLEN(key: String): R = js.native
    def LLEN(key: String, cb: Callback[Double]): R = js.native
    
    def LPOP(key: String): R = js.native
    def LPOP(key: String, cb: Callback[String]): R = js.native
    
    def LPUSH(args: (String | Callback[Double])*): R = js.native
    def LPUSH(key: String, arg1: String): R = js.native
    def LPUSH(key: String, arg1: String, arg2: String): R = js.native
    def LPUSH(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def LPUSH(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def LPUSH(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def LPUSH(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def LPUSH(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def LPUSH(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def LPUSH(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def LPUSH(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def LPUSH(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def LPUSH(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def LPUSH(key: String, arg1: js.Array[String]): R = js.native
    def LPUSH(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def LPUSH(key: String, args: (String | Callback[Double])*): R = js.native
    
    def LPUSHX(key: String, value: String): R = js.native
    def LPUSHX(key: String, value: String, cb: Callback[Double]): R = js.native
    
    @JSName("LPUSH")
    var LPUSH_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    def LRANGE(key: String, start: Double, stop: Double): R = js.native
    def LRANGE(key: String, start: Double, stop: Double, cb: Callback[js.Array[String]]): R = js.native
    
    def LREM(key: String, count: Double, value: String): R = js.native
    def LREM(key: String, count: Double, value: String, cb: Callback[Double]): R = js.native
    
    def LSET(key: String, index: Double, value: String): R = js.native
    @JSName("LSET")
    def LSET_OK(key: String, index: Double, value: String, cb: Callback[OK]): R = js.native
    
    def LTRIM(key: String, start: Double, stop: Double): R = js.native
    @JSName("LTRIM")
    def LTRIM_OK(key: String, start: Double, stop: Double, cb: Callback[OK]): R = js.native
    
    def MGET(arg1: String): R = js.native
    def MGET(arg1: String, arg2: String): R = js.native
    def MGET(arg1: String, arg2: String, arg3: String): R = js.native
    def MGET(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def MGET(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def MGET(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def MGET(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def MGET(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def MGET(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[js.Array[String]]): R = js.native
    def MGET(arg1: String, arg2: String, arg3: String, cb: Callback[js.Array[String]]): R = js.native
    def MGET(arg1: String, arg2: String, cb: Callback[js.Array[String]]): R = js.native
    def MGET(arg1: String, arg2: js.Array[String]): R = js.native
    def MGET(arg1: String, arg2: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def MGET(arg1: String, cb: Callback[js.Array[String]]): R = js.native
    def MGET(arg1: js.Array[String]): R = js.native
    def MGET(arg1: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def MGET(args: (String | Callback[js.Array[String]])*): R = js.native
    @JSName("MGET")
    var MGET_Original: OverloadedCommand[String, js.Array[String], R] = js.native
    
    def MIGRATE(arg1: String): R = js.native
    def MIGRATE(arg1: String, arg2: String): R = js.native
    def MIGRATE(arg1: String, arg2: String, arg3: String): R = js.native
    def MIGRATE(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def MIGRATE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def MIGRATE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def MIGRATE(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Boolean]
    ): R = js.native
    def MIGRATE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Boolean]): R = js.native
    def MIGRATE(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Boolean]): R = js.native
    def MIGRATE(arg1: String, arg2: String, arg3: String, cb: Callback[Boolean]): R = js.native
    def MIGRATE(arg1: String, arg2: String, cb: Callback[Boolean]): R = js.native
    def MIGRATE(arg1: String, arg2: js.Array[String]): R = js.native
    def MIGRATE(arg1: String, arg2: js.Array[String], cb: Callback[Boolean]): R = js.native
    def MIGRATE(arg1: String, cb: Callback[Boolean]): R = js.native
    def MIGRATE(arg1: js.Array[String]): R = js.native
    def MIGRATE(arg1: js.Array[String], cb: Callback[Boolean]): R = js.native
    def MIGRATE(args: (String | Callback[Boolean])*): R = js.native
    @JSName("MIGRATE")
    var MIGRATE_Original: OverloadedCommand[String, Boolean, R] = js.native
    
    def MONITOR(): R = js.native
    def MONITOR(cb: Callback[js.UndefOr[scala.Nothing]]): R = js.native
    
    def MOVE(key: String, db: String): R = js.native
    def MOVE(key: String, db: Double): R = js.native
    
    def MSET(arg1: String): R = js.native
    def MSET(arg1: String, arg2: String): R = js.native
    def MSET(arg1: String, arg2: String, arg3: String): R = js.native
    def MSET(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def MSET(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def MSET(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def MSET(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Boolean]
    ): R = js.native
    def MSET(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Boolean]): R = js.native
    def MSET(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Boolean]): R = js.native
    def MSET(arg1: String, arg2: String, arg3: String, cb: Callback[Boolean]): R = js.native
    def MSET(arg1: String, arg2: String, cb: Callback[Boolean]): R = js.native
    def MSET(arg1: String, arg2: js.Array[String]): R = js.native
    def MSET(arg1: String, arg2: js.Array[String], cb: Callback[Boolean]): R = js.native
    def MSET(arg1: String, cb: Callback[Boolean]): R = js.native
    def MSET(arg1: js.Array[String]): R = js.native
    def MSET(arg1: js.Array[String], cb: Callback[Boolean]): R = js.native
    def MSET(args: (String | Callback[Boolean])*): R = js.native
    
    def MSETNX(arg1: String): R = js.native
    def MSETNX(arg1: String, arg2: String): R = js.native
    def MSETNX(arg1: String, arg2: String, arg3: String): R = js.native
    def MSETNX(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def MSETNX(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def MSETNX(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def MSETNX(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Boolean]
    ): R = js.native
    def MSETNX(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Boolean]): R = js.native
    def MSETNX(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Boolean]): R = js.native
    def MSETNX(arg1: String, arg2: String, arg3: String, cb: Callback[Boolean]): R = js.native
    def MSETNX(arg1: String, arg2: String, cb: Callback[Boolean]): R = js.native
    def MSETNX(arg1: String, arg2: js.Array[String]): R = js.native
    def MSETNX(arg1: String, arg2: js.Array[String], cb: Callback[Boolean]): R = js.native
    def MSETNX(arg1: String, cb: Callback[Boolean]): R = js.native
    def MSETNX(arg1: js.Array[String]): R = js.native
    def MSETNX(arg1: js.Array[String], cb: Callback[Boolean]): R = js.native
    def MSETNX(args: (String | Callback[Boolean])*): R = js.native
    @JSName("MSETNX")
    var MSETNX_Original: OverloadedCommand[String, Boolean, R] = js.native
    
    @JSName("MSET")
    var MSET_Original: OverloadedCommand[String, Boolean, R] = js.native
    
    def OBJECT(arg1: String): R = js.native
    def OBJECT(arg1: String, arg2: String): R = js.native
    def OBJECT(arg1: String, arg2: String, arg3: String): R = js.native
    def OBJECT(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def OBJECT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def OBJECT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def OBJECT(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[_]
    ): R = js.native
    def OBJECT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[_]): R = js.native
    def OBJECT(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def OBJECT(arg1: String, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def OBJECT(arg1: String, arg2: String, cb: Callback[_]): R = js.native
    def OBJECT(arg1: String, arg2: js.Array[String]): R = js.native
    def OBJECT(arg1: String, arg2: js.Array[String], cb: Callback[_]): R = js.native
    def OBJECT(arg1: String, cb: Callback[_]): R = js.native
    def OBJECT(arg1: js.Array[String]): R = js.native
    def OBJECT(arg1: js.Array[String], cb: Callback[_]): R = js.native
    def OBJECT(args: (String | Callback[_])*): R = js.native
    @JSName("OBJECT")
    var OBJECT_Original: OverloadedCommand[String, _, R] = js.native
    
    def PERSIST(key: String): R = js.native
    def PERSIST(key: String, cb: Callback[Double]): R = js.native
    
    def PEXPIRE(key: String, milliseconds: Double): R = js.native
    def PEXPIRE(key: String, milliseconds: Double, cb: Callback[Double]): R = js.native
    
    def PEXPIREAT(key: String, millisecondsTimestamp: Double): R = js.native
    def PEXPIREAT(key: String, millisecondsTimestamp: Double, cb: Callback[Double]): R = js.native
    
    def PFADD(args: (String | Callback[Double])*): R = js.native
    def PFADD(key: String, arg1: String): R = js.native
    def PFADD(key: String, arg1: String, arg2: String): R = js.native
    def PFADD(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def PFADD(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def PFADD(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def PFADD(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def PFADD(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def PFADD(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def PFADD(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def PFADD(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def PFADD(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def PFADD(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def PFADD(key: String, arg1: js.Array[String]): R = js.native
    def PFADD(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def PFADD(key: String, args: (String | Callback[Double])*): R = js.native
    @JSName("PFADD")
    var PFADD_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    def PFCOUNT(arg1: String): R = js.native
    def PFCOUNT(arg1: String, arg2: String): R = js.native
    def PFCOUNT(arg1: String, arg2: String, arg3: String): R = js.native
    def PFCOUNT(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def PFCOUNT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def PFCOUNT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def PFCOUNT(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def PFCOUNT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def PFCOUNT(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def PFCOUNT(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def PFCOUNT(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def PFCOUNT(arg1: String, arg2: js.Array[String]): R = js.native
    def PFCOUNT(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def PFCOUNT(arg1: String, cb: Callback[Double]): R = js.native
    def PFCOUNT(arg1: js.Array[String]): R = js.native
    def PFCOUNT(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def PFCOUNT(args: (String | Callback[Double])*): R = js.native
    @JSName("PFCOUNT")
    var PFCOUNT_Original: OverloadedCommand[String, Double, R] = js.native
    
    def PFMERGE(arg1: String): R = js.native
    def PFMERGE(arg1: String, arg2: String): R = js.native
    def PFMERGE(arg1: String, arg2: String, arg3: String): R = js.native
    def PFMERGE(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def PFMERGE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def PFMERGE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def PFMERGE(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Boolean]
    ): R = js.native
    def PFMERGE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Boolean]): R = js.native
    def PFMERGE(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Boolean]): R = js.native
    def PFMERGE(arg1: String, arg2: String, arg3: String, cb: Callback[Boolean]): R = js.native
    def PFMERGE(arg1: String, arg2: String, cb: Callback[Boolean]): R = js.native
    def PFMERGE(arg1: String, arg2: js.Array[String]): R = js.native
    def PFMERGE(arg1: String, arg2: js.Array[String], cb: Callback[Boolean]): R = js.native
    def PFMERGE(arg1: String, cb: Callback[Boolean]): R = js.native
    def PFMERGE(arg1: js.Array[String]): R = js.native
    def PFMERGE(arg1: js.Array[String], cb: Callback[Boolean]): R = js.native
    def PFMERGE(args: (String | Callback[Boolean])*): R = js.native
    @JSName("PFMERGE")
    var PFMERGE_Original: OverloadedCommand[String, Boolean, R] = js.native
    
    def PING(): R = js.native
    def PING(callback: Callback[String]): R = js.native
    def PING(message: String): R = js.native
    def PING(message: String, callback: Callback[String]): R = js.native
    
    def PSETEX(key: String, milliseconds: Double, value: String): R = js.native
    @JSName("PSETEX")
    def PSETEX_OK(key: String, milliseconds: Double, value: String, cb: Callback[OK]): R = js.native
    
    def PSUBSCRIBE(arg1: String): R = js.native
    def PSUBSCRIBE(arg1: String, arg2: String): R = js.native
    def PSUBSCRIBE(arg1: String, arg2: String, arg3: String): R = js.native
    def PSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def PSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def PSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def PSUBSCRIBE(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def PSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[String]): R = js.native
    def PSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def PSUBSCRIBE(arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def PSUBSCRIBE(arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def PSUBSCRIBE(arg1: String, cb: Callback[String]): R = js.native
    def PSUBSCRIBE(arg1: js.Array[String]): R = js.native
    def PSUBSCRIBE(arg1: js.Array[String], cb: Callback[String]): R = js.native
    def PSUBSCRIBE(args: (String | Callback[String])*): R = js.native
    @JSName("PSUBSCRIBE")
    var PSUBSCRIBE_Original: OverloadedListCommand[String, String, R] = js.native
    
    def PTTL(key: String): R = js.native
    def PTTL(key: String, cb: Callback[Double]): R = js.native
    
    def PUBLISH(channel: String, value: String): R = js.native
    def PUBLISH(channel: String, value: String, cb: Callback[Double]): R = js.native
    
    def PUBSUB(arg1: String): R = js.native
    def PUBSUB(arg1: String, arg2: String): R = js.native
    def PUBSUB(arg1: String, arg2: String, arg3: String): R = js.native
    def PUBSUB(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def PUBSUB(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def PUBSUB(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def PUBSUB(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def PUBSUB(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def PUBSUB(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def PUBSUB(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def PUBSUB(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def PUBSUB(arg1: String, arg2: js.Array[String]): R = js.native
    def PUBSUB(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def PUBSUB(arg1: String, cb: Callback[Double]): R = js.native
    def PUBSUB(arg1: js.Array[String]): R = js.native
    def PUBSUB(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def PUBSUB(args: (String | Callback[Double])*): R = js.native
    @JSName("PUBSUB")
    var PUBSUB_Original: OverloadedCommand[String, Double, R] = js.native
    
    def PUNSUBSCRIBE(arg1: String): R = js.native
    def PUNSUBSCRIBE(arg1: String, arg2: String): R = js.native
    def PUNSUBSCRIBE(arg1: String, arg2: String, arg3: String): R = js.native
    def PUNSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def PUNSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def PUNSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def PUNSUBSCRIBE(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def PUNSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[String]): R = js.native
    def PUNSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def PUNSUBSCRIBE(arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def PUNSUBSCRIBE(arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def PUNSUBSCRIBE(arg1: String, cb: Callback[String]): R = js.native
    def PUNSUBSCRIBE(arg1: js.Array[String]): R = js.native
    def PUNSUBSCRIBE(arg1: js.Array[String], cb: Callback[String]): R = js.native
    def PUNSUBSCRIBE(args: (String | Callback[String])*): R = js.native
    @JSName("PUNSUBSCRIBE")
    var PUNSUBSCRIBE_Original: OverloadedListCommand[String, String, R] = js.native
    
    def QUIT(): R = js.native
    @JSName("QUIT")
    def QUIT_OK(cb: Callback[OK]): R = js.native
    
    def RANDOMKEY(): R = js.native
    def RANDOMKEY(cb: Callback[String]): R = js.native
    
    def READONLY(): R = js.native
    def READONLY(cb: Callback[String]): R = js.native
    
    def READWRITE(): R = js.native
    def READWRITE(cb: Callback[String]): R = js.native
    
    def RENAME(key: String, newkey: String): R = js.native
    
    def RENAMENX(key: String, newkey: String): R = js.native
    def RENAMENX(key: String, newkey: String, cb: Callback[Double]): R = js.native
    
    @JSName("RENAME")
    def RENAME_OK(key: String, newkey: String, cb: Callback[OK]): R = js.native
    
    def RESTORE(key: String, ttl: Double, serializedValue: String): R = js.native
    @JSName("RESTORE")
    def RESTORE_OK(key: String, ttl: Double, serializedValue: String, cb: Callback[OK]): R = js.native
    
    def ROLE(): R = js.native
    def ROLE(cb: Callback[js.Tuple3[String, Double, js.Array[js.Tuple3[String, String, String]]]]): R = js.native
    
    def RPOP(key: String): R = js.native
    def RPOP(key: String, cb: Callback[String]): R = js.native
    
    def RPOPLPUSH(source: String, destination: String): R = js.native
    def RPOPLPUSH(source: String, destination: String, cb: Callback[String]): R = js.native
    
    def RPUSH(args: (String | Callback[Double])*): R = js.native
    def RPUSH(key: String, arg1: String): R = js.native
    def RPUSH(key: String, arg1: String, arg2: String): R = js.native
    def RPUSH(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def RPUSH(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def RPUSH(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def RPUSH(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def RPUSH(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def RPUSH(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def RPUSH(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def RPUSH(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def RPUSH(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def RPUSH(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def RPUSH(key: String, arg1: js.Array[String]): R = js.native
    def RPUSH(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def RPUSH(key: String, args: (String | Callback[Double])*): R = js.native
    
    def RPUSHX(key: String, value: String): R = js.native
    def RPUSHX(key: String, value: String, cb: Callback[Double]): R = js.native
    
    @JSName("RPUSH")
    var RPUSH_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    def SADD(args: (String | Callback[Double])*): R = js.native
    def SADD(key: String, arg1: String): R = js.native
    def SADD(key: String, arg1: String, arg2: String): R = js.native
    def SADD(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def SADD(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SADD(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SADD(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SADD(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def SADD(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def SADD(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def SADD(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def SADD(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def SADD(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def SADD(key: String, arg1: js.Array[String]): R = js.native
    def SADD(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def SADD(key: String, args: (String | Callback[Double])*): R = js.native
    @JSName("SADD")
    var SADD_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    def SAVE(): R = js.native
    def SAVE(cb: Callback[String]): R = js.native
    
    def SCAN(arg1: String): R = js.native
    def SCAN(arg1: String, arg2: String): R = js.native
    def SCAN(arg1: String, arg2: String, arg3: String): R = js.native
    def SCAN(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SCAN(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SCAN(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SCAN(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def SCAN(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def SCAN(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def SCAN(arg1: String, arg2: String, arg3: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def SCAN(arg1: String, arg2: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def SCAN(arg1: String, arg2: js.Array[String]): R = js.native
    def SCAN(arg1: String, arg2: js.Array[String], cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def SCAN(arg1: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def SCAN(arg1: js.Array[String]): R = js.native
    def SCAN(arg1: js.Array[String], cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def SCAN(args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    @JSName("SCAN")
    var SCAN_Original: OverloadedCommand[String, js.Tuple2[String, js.Array[String]], R] = js.native
    
    def SCARD(key: String): R = js.native
    def SCARD(key: String, cb: Callback[Double]): R = js.native
    
    def SCRIPT(arg1: String): R = js.native
    def SCRIPT(arg1: String, arg2: String): R = js.native
    def SCRIPT(arg1: String, arg2: String, arg3: String): R = js.native
    def SCRIPT(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SCRIPT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SCRIPT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SCRIPT(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[_]
    ): R = js.native
    def SCRIPT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[_]): R = js.native
    def SCRIPT(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def SCRIPT(arg1: String, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def SCRIPT(arg1: String, arg2: String, cb: Callback[_]): R = js.native
    def SCRIPT(arg1: String, arg2: js.Array[String]): R = js.native
    def SCRIPT(arg1: String, arg2: js.Array[String], cb: Callback[_]): R = js.native
    def SCRIPT(arg1: String, cb: Callback[_]): R = js.native
    def SCRIPT(arg1: js.Array[String]): R = js.native
    def SCRIPT(arg1: js.Array[String], cb: Callback[_]): R = js.native
    def SCRIPT(args: (String | Callback[_])*): R = js.native
    @JSName("SCRIPT")
    var SCRIPT_Original: OverloadedCommand[String, _, R] = js.native
    
    def SDIFF(arg1: String): R = js.native
    def SDIFF(arg1: String, arg2: String): R = js.native
    def SDIFF(arg1: String, arg2: String, arg3: String): R = js.native
    def SDIFF(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SDIFF(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SDIFF(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SDIFF(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def SDIFF(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def SDIFF(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[js.Array[String]]): R = js.native
    def SDIFF(arg1: String, arg2: String, arg3: String, cb: Callback[js.Array[String]]): R = js.native
    def SDIFF(arg1: String, arg2: String, cb: Callback[js.Array[String]]): R = js.native
    def SDIFF(arg1: String, arg2: js.Array[String]): R = js.native
    def SDIFF(arg1: String, arg2: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def SDIFF(arg1: String, cb: Callback[js.Array[String]]): R = js.native
    def SDIFF(arg1: js.Array[String]): R = js.native
    def SDIFF(arg1: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def SDIFF(args: (String | Callback[js.Array[String]])*): R = js.native
    
    def SDIFFSTORE(args: (String | Callback[Double])*): R = js.native
    def SDIFFSTORE(key: String, arg1: String): R = js.native
    def SDIFFSTORE(key: String, arg1: String, arg2: String): R = js.native
    def SDIFFSTORE(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def SDIFFSTORE(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SDIFFSTORE(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SDIFFSTORE(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SDIFFSTORE(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def SDIFFSTORE(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def SDIFFSTORE(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def SDIFFSTORE(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def SDIFFSTORE(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def SDIFFSTORE(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def SDIFFSTORE(key: String, arg1: js.Array[String]): R = js.native
    def SDIFFSTORE(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def SDIFFSTORE(key: String, args: (String | Callback[Double])*): R = js.native
    @JSName("SDIFFSTORE")
    var SDIFFSTORE_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    @JSName("SDIFF")
    var SDIFF_Original: OverloadedCommand[String, js.Array[String], R] = js.native
    
    def SELECT(index: String): R = js.native
    def SELECT(index: String, cb: Callback[String]): R = js.native
    def SELECT(index: Double): R = js.native
    def SELECT(index: Double, cb: Callback[String]): R = js.native
    
    def SET(key: String, value: String): R = js.native
    def SET(key: String, value: String, flag: String): R = js.native
    def SET(key: String, value: String, flag: String, mode: String, duration: Double): R = js.native
    def SET(key: String, value: String, mode: String, duration: Double): R = js.native
    def SET(key: String, value: String, mode: String, duration: Double, flag: String): R = js.native
    
    def SETBIT(key: String, offset: Double, value: String): R = js.native
    def SETBIT(key: String, offset: Double, value: String, cb: Callback[Double]): R = js.native
    
    def SETEX(key: String, seconds: Double, value: String): R = js.native
    def SETEX(key: String, seconds: Double, value: String, cb: Callback[String]): R = js.native
    
    def SETNX(key: String, value: String): R = js.native
    def SETNX(key: String, value: String, cb: Callback[Double]): R = js.native
    
    def SETRANGE(key: String, offset: Double, value: String): R = js.native
    def SETRANGE(key: String, offset: Double, value: String, cb: Callback[Double]): R = js.native
    
    @JSName("SET")
    def SET_OK(key: String, value: String, cb: Callback[OK]): R = js.native
    @JSName("SET")
    def SET_OK(key: String, value: String, flag: String, cb: Callback[OK]): R = js.native
    @JSName("SET")
    def SET_OK(
      key: String,
      value: String,
      flag: String,
      mode: String,
      duration: Double,
      cb: Callback[js.UndefOr[OK]]
    ): R = js.native
    @JSName("SET")
    def SET_OK(key: String, value: String, mode: String, duration: Double, cb: Callback[js.UndefOr[OK]]): R = js.native
    @JSName("SET")
    def SET_OK(
      key: String,
      value: String,
      mode: String,
      duration: Double,
      flag: String,
      cb: Callback[js.UndefOr[OK]]
    ): R = js.native
    
    def SHUTDOWN(arg1: String): R = js.native
    def SHUTDOWN(arg1: String, arg2: String): R = js.native
    def SHUTDOWN(arg1: String, arg2: String, arg3: String): R = js.native
    def SHUTDOWN(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SHUTDOWN(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SHUTDOWN(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SHUTDOWN(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def SHUTDOWN(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[String]): R = js.native
    def SHUTDOWN(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def SHUTDOWN(arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def SHUTDOWN(arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def SHUTDOWN(arg1: String, arg2: js.Array[String]): R = js.native
    def SHUTDOWN(arg1: String, arg2: js.Array[String], cb: Callback[String]): R = js.native
    def SHUTDOWN(arg1: String, cb: Callback[String]): R = js.native
    def SHUTDOWN(arg1: js.Array[String]): R = js.native
    def SHUTDOWN(arg1: js.Array[String], cb: Callback[String]): R = js.native
    def SHUTDOWN(args: (String | Callback[String])*): R = js.native
    @JSName("SHUTDOWN")
    var SHUTDOWN_Original: OverloadedCommand[String, String, R] = js.native
    
    def SINTER(args: (String | Callback[js.Array[String]])*): R = js.native
    def SINTER(key: String, arg1: String): R = js.native
    def SINTER(key: String, arg1: String, arg2: String): R = js.native
    def SINTER(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def SINTER(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SINTER(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SINTER(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SINTER(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def SINTER(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def SINTER(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def SINTER(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[js.Array[String]]): R = js.native
    def SINTER(key: String, arg1: String, arg2: String, cb: Callback[js.Array[String]]): R = js.native
    def SINTER(key: String, arg1: String, cb: Callback[js.Array[String]]): R = js.native
    def SINTER(key: String, arg1: js.Array[String]): R = js.native
    def SINTER(key: String, arg1: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def SINTER(key: String, args: (String | Callback[js.Array[String]])*): R = js.native
    
    def SINTERSTORE(arg1: String): R = js.native
    def SINTERSTORE(arg1: String, arg2: String): R = js.native
    def SINTERSTORE(arg1: String, arg2: String, arg3: String): R = js.native
    def SINTERSTORE(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SINTERSTORE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SINTERSTORE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SINTERSTORE(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def SINTERSTORE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def SINTERSTORE(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def SINTERSTORE(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def SINTERSTORE(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def SINTERSTORE(arg1: String, arg2: js.Array[String]): R = js.native
    def SINTERSTORE(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def SINTERSTORE(arg1: String, cb: Callback[Double]): R = js.native
    def SINTERSTORE(arg1: js.Array[String]): R = js.native
    def SINTERSTORE(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def SINTERSTORE(args: (String | Callback[Double])*): R = js.native
    @JSName("SINTERSTORE")
    var SINTERSTORE_Original: OverloadedCommand[String, Double, R] = js.native
    
    @JSName("SINTER")
    var SINTER_Original: OverloadedKeyCommand[String, js.Array[String], R] = js.native
    
    def SISMEMBER(key: String, member: String): R = js.native
    def SISMEMBER(key: String, member: String, cb: Callback[Double]): R = js.native
    
    def SLAVEOF(host: String, port: String): R = js.native
    def SLAVEOF(host: String, port: String, cb: Callback[String]): R = js.native
    def SLAVEOF(host: String, port: Double): R = js.native
    def SLAVEOF(host: String, port: Double, cb: Callback[String]): R = js.native
    
    def SLOWLOG(arg1: String): R = js.native
    def SLOWLOG(arg1: String, arg2: String): R = js.native
    def SLOWLOG(arg1: String, arg2: String, arg3: String): R = js.native
    def SLOWLOG(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SLOWLOG(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SLOWLOG(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SLOWLOG(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    def SLOWLOG(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    def SLOWLOG(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    def SLOWLOG(
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    def SLOWLOG(
      arg1: String,
      arg2: String,
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    def SLOWLOG(arg1: String, arg2: js.Array[String]): R = js.native
    def SLOWLOG(
      arg1: String,
      arg2: js.Array[String],
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    def SLOWLOG(arg1: String, cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]): R = js.native
    def SLOWLOG(arg1: js.Array[String]): R = js.native
    def SLOWLOG(
      arg1: js.Array[String],
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    def SLOWLOG(args: (String | (Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]))*): R = js.native
    @JSName("SLOWLOG")
    var SLOWLOG_Original: OverloadedCommand[String, js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]], R] = js.native
    
    def SMEMBERS(key: String): R = js.native
    def SMEMBERS(key: String, cb: Callback[js.Array[String]]): R = js.native
    
    def SMOVE(source: String, destination: String, member: String): R = js.native
    def SMOVE(source: String, destination: String, member: String, cb: Callback[Double]): R = js.native
    
    def SORT(arg1: String): R = js.native
    def SORT(arg1: String, arg2: String): R = js.native
    def SORT(arg1: String, arg2: String, arg3: String): R = js.native
    def SORT(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SORT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SORT(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SORT(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def SORT(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def SORT(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[js.Array[String]]): R = js.native
    def SORT(arg1: String, arg2: String, arg3: String, cb: Callback[js.Array[String]]): R = js.native
    def SORT(arg1: String, arg2: String, cb: Callback[js.Array[String]]): R = js.native
    def SORT(arg1: String, arg2: js.Array[String]): R = js.native
    def SORT(arg1: String, arg2: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def SORT(arg1: String, cb: Callback[js.Array[String]]): R = js.native
    def SORT(arg1: js.Array[String]): R = js.native
    def SORT(arg1: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def SORT(args: (String | Callback[js.Array[String]])*): R = js.native
    @JSName("SORT")
    var SORT_Original: OverloadedCommand[String, js.Array[String], R] = js.native
    
    def SPOP(key: String): R = js.native
    def SPOP(key: String, cb: Callback[String]): R = js.native
    def SPOP(key: String, count: Double): R = js.native
    def SPOP(key: String, count: Double, cb: Callback[js.Array[String]]): R = js.native
    
    def SRANDMEMBER(key: String): R = js.native
    def SRANDMEMBER(key: String, cb: Callback[String]): R = js.native
    def SRANDMEMBER(key: String, count: Double): R = js.native
    def SRANDMEMBER(key: String, count: Double, cb: Callback[js.Array[String]]): R = js.native
    
    def SREM(args: (String | Callback[Double])*): R = js.native
    def SREM(key: String, arg1: String): R = js.native
    def SREM(key: String, arg1: String, arg2: String): R = js.native
    def SREM(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def SREM(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SREM(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SREM(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SREM(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def SREM(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def SREM(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def SREM(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def SREM(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def SREM(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def SREM(key: String, arg1: js.Array[String]): R = js.native
    def SREM(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def SREM(key: String, args: (String | Callback[Double])*): R = js.native
    @JSName("SREM")
    var SREM_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    def SSCAN(args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    def SSCAN(key: String, arg1: String): R = js.native
    def SSCAN(key: String, arg1: String, arg2: String): R = js.native
    def SSCAN(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def SSCAN(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SSCAN(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SSCAN(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SSCAN(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def SSCAN(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def SSCAN(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def SSCAN(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def SSCAN(key: String, arg1: String, arg2: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def SSCAN(key: String, arg1: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def SSCAN(key: String, arg1: js.Array[String]): R = js.native
    def SSCAN(key: String, arg1: js.Array[String], cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def SSCAN(key: String, args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    @JSName("SSCAN")
    var SSCAN_Original: OverloadedKeyCommand[String, js.Tuple2[String, js.Array[String]], R] = js.native
    
    def STRLEN(key: String): R = js.native
    def STRLEN(key: String, cb: Callback[Double]): R = js.native
    
    def SUBSCRIBE(arg1: String): R = js.native
    def SUBSCRIBE(arg1: String, arg2: String): R = js.native
    def SUBSCRIBE(arg1: String, arg2: String, arg3: String): R = js.native
    def SUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SUBSCRIBE(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def SUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[String]): R = js.native
    def SUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def SUBSCRIBE(arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def SUBSCRIBE(arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def SUBSCRIBE(arg1: String, cb: Callback[String]): R = js.native
    def SUBSCRIBE(arg1: js.Array[String]): R = js.native
    def SUBSCRIBE(arg1: js.Array[String], cb: Callback[String]): R = js.native
    def SUBSCRIBE(args: (String | Callback[String])*): R = js.native
    @JSName("SUBSCRIBE")
    var SUBSCRIBE_Original: OverloadedListCommand[String, String, R] = js.native
    
    def SUNION(arg1: String): R = js.native
    def SUNION(arg1: String, arg2: String): R = js.native
    def SUNION(arg1: String, arg2: String, arg3: String): R = js.native
    def SUNION(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SUNION(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SUNION(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SUNION(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def SUNION(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def SUNION(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[js.Array[String]]): R = js.native
    def SUNION(arg1: String, arg2: String, arg3: String, cb: Callback[js.Array[String]]): R = js.native
    def SUNION(arg1: String, arg2: String, cb: Callback[js.Array[String]]): R = js.native
    def SUNION(arg1: String, arg2: js.Array[String]): R = js.native
    def SUNION(arg1: String, arg2: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def SUNION(arg1: String, cb: Callback[js.Array[String]]): R = js.native
    def SUNION(arg1: js.Array[String]): R = js.native
    def SUNION(arg1: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def SUNION(args: (String | Callback[js.Array[String]])*): R = js.native
    
    def SUNIONSTORE(arg1: String): R = js.native
    def SUNIONSTORE(arg1: String, arg2: String): R = js.native
    def SUNIONSTORE(arg1: String, arg2: String, arg3: String): R = js.native
    def SUNIONSTORE(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def SUNIONSTORE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def SUNIONSTORE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def SUNIONSTORE(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def SUNIONSTORE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def SUNIONSTORE(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def SUNIONSTORE(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def SUNIONSTORE(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def SUNIONSTORE(arg1: String, arg2: js.Array[String]): R = js.native
    def SUNIONSTORE(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def SUNIONSTORE(arg1: String, cb: Callback[Double]): R = js.native
    def SUNIONSTORE(arg1: js.Array[String]): R = js.native
    def SUNIONSTORE(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def SUNIONSTORE(args: (String | Callback[Double])*): R = js.native
    @JSName("SUNIONSTORE")
    var SUNIONSTORE_Original: OverloadedCommand[String, Double, R] = js.native
    
    @JSName("SUNION")
    var SUNION_Original: OverloadedCommand[String, js.Array[String], R] = js.native
    
    def SYNC(): R = js.native
    def SYNC(cb: Callback[js.UndefOr[scala.Nothing]]): R = js.native
    
    def TIME(): R = js.native
    def TIME(cb: Callback[js.Tuple2[String, String]]): R = js.native
    
    def TTL(key: String): R = js.native
    def TTL(key: String, cb: Callback[Double]): R = js.native
    
    def TYPE(key: String): R = js.native
    def TYPE(key: String, cb: Callback[String]): R = js.native
    
    def UNLINK(arg1: String): R = js.native
    def UNLINK(arg1: String, arg2: String): R = js.native
    def UNLINK(arg1: String, arg2: String, arg3: String): R = js.native
    def UNLINK(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def UNLINK(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def UNLINK(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def UNLINK(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def UNLINK(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def UNLINK(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def UNLINK(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def UNLINK(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def UNLINK(arg1: String, arg2: js.Array[String]): R = js.native
    def UNLINK(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def UNLINK(arg1: String, cb: Callback[Double]): R = js.native
    def UNLINK(arg1: js.Array[String]): R = js.native
    def UNLINK(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def UNLINK(args: (String | Callback[Double])*): R = js.native
    @JSName("UNLINK")
    var UNLINK_Original: OverloadedCommand[String, Double, R] = js.native
    
    def UNSUBSCRIBE(arg1: String): R = js.native
    def UNSUBSCRIBE(arg1: String, arg2: String): R = js.native
    def UNSUBSCRIBE(arg1: String, arg2: String, arg3: String): R = js.native
    def UNSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def UNSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def UNSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def UNSUBSCRIBE(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def UNSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[String]): R = js.native
    def UNSUBSCRIBE(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def UNSUBSCRIBE(arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def UNSUBSCRIBE(arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def UNSUBSCRIBE(arg1: String, cb: Callback[String]): R = js.native
    def UNSUBSCRIBE(arg1: js.Array[String]): R = js.native
    def UNSUBSCRIBE(arg1: js.Array[String], cb: Callback[String]): R = js.native
    def UNSUBSCRIBE(args: (String | Callback[String])*): R = js.native
    @JSName("UNSUBSCRIBE")
    var UNSUBSCRIBE_Original: OverloadedListCommand[String, String, R] = js.native
    
    def UNWATCH(): R = js.native
    @JSName("UNWATCH")
    def UNWATCH_OK(cb: Callback[OK]): R = js.native
    
    def WAIT(numslaves: Double, timeout: Double): R = js.native
    def WAIT(numslaves: Double, timeout: Double, cb: Callback[Double]): R = js.native
    
    def WATCH(arg1: String): R = js.native
    def WATCH(arg1: String, arg2: String): R = js.native
    def WATCH(arg1: String, arg2: String, arg3: String): R = js.native
    def WATCH(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def WATCH(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def WATCH(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def WATCH(arg1: String, arg2: js.Array[String]): R = js.native
    def WATCH(arg1: js.Array[String]): R = js.native
    @JSName("WATCH")
    def WATCH_OK(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[OK]
    ): R = js.native
    @JSName("WATCH")
    def WATCH_OK(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[OK]): R = js.native
    @JSName("WATCH")
    def WATCH_OK(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("WATCH")
    def WATCH_OK(arg1: String, arg2: String, arg3: String, cb: Callback[OK]): R = js.native
    @JSName("WATCH")
    def WATCH_OK(arg1: String, arg2: String, cb: Callback[OK]): R = js.native
    @JSName("WATCH")
    def WATCH_OK(arg1: String, arg2: js.Array[String], cb: Callback[OK]): R = js.native
    @JSName("WATCH")
    def WATCH_OK(arg1: String, cb: Callback[OK]): R = js.native
    @JSName("WATCH")
    def WATCH_OK(arg1: js.Array[String], cb: Callback[OK]): R = js.native
    @JSName("WATCH")
    def WATCH_OK(args: (String | Callback[OK])*): R = js.native
    @JSName("WATCH")
    var WATCH_Original: OverloadedCommand[String, OK, R] = js.native
    
    def ZADD(args: (String | Double | Callback[Double])*): R = js.native
    def ZADD(key: String, arg1: String | Double): R = js.native
    def ZADD(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    def ZADD(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    def ZADD(key: String, arg1: String | Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: String): R = js.native
    def ZADD(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def ZADD(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def ZADD(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def ZADD(key: String, arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: String, arg3: Double): R = js.native
    def ZADD(key: String, arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def ZADD(key: String, arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def ZADD(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double, arg3: String): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double, arg3: Double): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: String, arg2: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: js.Array[String | Double]): R = js.native
    def ZADD(key: String, arg1: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String, arg3: String): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String, arg3: Double): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double, arg3: String): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double, arg3: Double): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, arg1: Double, arg2: Double, cb: Callback[Double]): R = js.native
    def ZADD(key: String, args: (String | Double | Callback[Double])*): R = js.native
    @JSName("ZADD")
    var ZADD_Original: OverloadedKeyCommand[String | Double, Double, R] = js.native
    
    def ZCARD(key: String): R = js.native
    def ZCARD(key: String, cb: Callback[Double]): R = js.native
    
    def ZCOUNT(key: String, min: String, max: String): R = js.native
    def ZCOUNT(key: String, min: String, max: String, cb: Callback[Double]): R = js.native
    def ZCOUNT(key: String, min: String, max: Double): R = js.native
    def ZCOUNT(key: String, min: String, max: Double, cb: Callback[Double]): R = js.native
    def ZCOUNT(key: String, min: Double, max: String): R = js.native
    def ZCOUNT(key: String, min: Double, max: String, cb: Callback[Double]): R = js.native
    def ZCOUNT(key: String, min: Double, max: Double): R = js.native
    def ZCOUNT(key: String, min: Double, max: Double, cb: Callback[Double]): R = js.native
    
    def ZINCRBY(key: String, increment: Double, member: String): R = js.native
    def ZINCRBY(key: String, increment: Double, member: String, cb: Callback[String]): R = js.native
    
    def ZINTERSTORE(arg1: String | Double): R = js.native
    def ZINTERSTORE(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    def ZINTERSTORE(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    def ZINTERSTORE(arg1: String | Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String | Double): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String | Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String, arg3: String): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String, arg3: Double): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: js.Array[String | Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: Double, arg3: String): R = js.native
    def ZINTERSTORE(arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def ZINTERSTORE(arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def ZINTERSTORE(arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: Double, arg3: Double): R = js.native
    def ZINTERSTORE(arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def ZINTERSTORE(arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def ZINTERSTORE(arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: String, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: js.Array[String | Double]): R = js.native
    def ZINTERSTORE(arg1: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String | Double): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String | Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String, arg3: String): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String, arg3: Double): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: js.Array[String | Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: Double, arg3: String): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: Double, arg3: Double): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(arg1: Double, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def ZINTERSTORE(args: (String | Double | Callback[Double])*): R = js.native
    @JSName("ZINTERSTORE")
    var ZINTERSTORE_Original: OverloadedCommand[String | Double, Double, R] = js.native
    
    def ZLEXCOUNT(key: String, min: String, max: String): R = js.native
    def ZLEXCOUNT(key: String, min: String, max: String, cb: Callback[Double]): R = js.native
    
    def ZRANGE(key: String, start: Double, stop: Double): R = js.native
    def ZRANGE(key: String, start: Double, stop: Double, cb: Callback[js.Array[String]]): R = js.native
    def ZRANGE(key: String, start: Double, stop: Double, withscores: String): R = js.native
    def ZRANGE(key: String, start: Double, stop: Double, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    
    def ZRANGEBYLEX(key: String, min: String, max: String): R = js.native
    def ZRANGEBYLEX(key: String, min: String, max: String, cb: Callback[js.Array[String]]): R = js.native
    def ZRANGEBYLEX(key: String, min: String, max: String, limit: String, offset: Double, count: Double): R = js.native
    def ZRANGEBYLEX(
      key: String,
      min: String,
      max: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    
    def ZRANGEBYSCORE(key: String, min: String, max: String): R = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: String, cb: Callback[js.Array[String]]): R = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: String, limit: String, offset: Double, count: Double): R = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: String,
      max: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: String, withscores: String): R = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: String, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: String,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: String,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: Double): R = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: Double, cb: Callback[js.Array[String]]): R = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: Double, limit: String, offset: Double, count: Double): R = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: String,
      max: Double,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: Double, withscores: String): R = js.native
    def ZRANGEBYSCORE(key: String, min: String, max: Double, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: String,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: String,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: String): R = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: String, cb: Callback[js.Array[String]]): R = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: String, limit: String, offset: Double, count: Double): R = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: Double,
      max: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: String, withscores: String): R = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: String, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: Double,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: Double,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: Double): R = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: Double, cb: Callback[js.Array[String]]): R = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: Double, limit: String, offset: Double, count: Double): R = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: Double,
      max: Double,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: Double, withscores: String): R = js.native
    def ZRANGEBYSCORE(key: String, min: Double, max: Double, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: Double,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def ZRANGEBYSCORE(
      key: String,
      min: Double,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    
    def ZRANK(key: String, member: String): R = js.native
    def ZRANK(key: String, member: String, cb: Callback[Double | Null]): R = js.native
    
    def ZREM(args: (String | Callback[Double])*): R = js.native
    def ZREM(key: String, arg1: String): R = js.native
    def ZREM(key: String, arg1: String, arg2: String): R = js.native
    def ZREM(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def ZREM(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def ZREM(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def ZREM(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def ZREM(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def ZREM(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def ZREM(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def ZREM(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def ZREM(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def ZREM(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def ZREM(key: String, arg1: js.Array[String]): R = js.native
    def ZREM(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def ZREM(key: String, args: (String | Callback[Double])*): R = js.native
    
    def ZREMRANGEBYLEX(key: String, min: String, max: String): R = js.native
    def ZREMRANGEBYLEX(key: String, min: String, max: String, cb: Callback[Double]): R = js.native
    
    def ZREMRANGEBYRANK(key: String, start: Double, stop: Double): R = js.native
    def ZREMRANGEBYRANK(key: String, start: Double, stop: Double, cb: Callback[Double]): R = js.native
    
    def ZREMRANGEBYSCORE(key: String, min: String, max: String): R = js.native
    def ZREMRANGEBYSCORE(key: String, min: String, max: String, cb: Callback[Double]): R = js.native
    def ZREMRANGEBYSCORE(key: String, min: String, max: Double): R = js.native
    def ZREMRANGEBYSCORE(key: String, min: String, max: Double, cb: Callback[Double]): R = js.native
    def ZREMRANGEBYSCORE(key: String, min: Double, max: String): R = js.native
    def ZREMRANGEBYSCORE(key: String, min: Double, max: String, cb: Callback[Double]): R = js.native
    def ZREMRANGEBYSCORE(key: String, min: Double, max: Double): R = js.native
    def ZREMRANGEBYSCORE(key: String, min: Double, max: Double, cb: Callback[Double]): R = js.native
    
    @JSName("ZREM")
    var ZREM_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    def ZREVRANGE(key: String, start: Double, stop: Double): R = js.native
    def ZREVRANGE(key: String, start: Double, stop: Double, cb: Callback[js.Array[String]]): R = js.native
    def ZREVRANGE(key: String, start: Double, stop: Double, withscores: String): R = js.native
    def ZREVRANGE(key: String, start: Double, stop: Double, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    
    def ZREVRANGEBYLEX(key: String, min: String, max: String): R = js.native
    def ZREVRANGEBYLEX(key: String, min: String, max: String, cb: Callback[js.Array[String]]): R = js.native
    def ZREVRANGEBYLEX(key: String, min: String, max: String, limit: String, offset: Double, count: Double): R = js.native
    def ZREVRANGEBYLEX(
      key: String,
      min: String,
      max: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    
    def ZREVRANGEBYSCORE(key: String, min: String, max: String): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: String, cb: Callback[js.Array[String]]): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: String, limit: String, offset: Double, count: Double): R = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: String,
      max: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: String, withscores: String): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: String, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: String,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: String,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: Double): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: Double, cb: Callback[js.Array[String]]): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: Double, limit: String, offset: Double, count: Double): R = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: String,
      max: Double,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: Double, withscores: String): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: String, max: Double, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: String,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: String,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: String): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: String, cb: Callback[js.Array[String]]): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: String, limit: String, offset: Double, count: Double): R = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: Double,
      max: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: String, withscores: String): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: String, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: Double,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: Double,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: Double): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: Double, cb: Callback[js.Array[String]]): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: Double, limit: String, offset: Double, count: Double): R = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: Double,
      max: Double,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: Double, withscores: String): R = js.native
    def ZREVRANGEBYSCORE(key: String, min: Double, max: Double, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: Double,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def ZREVRANGEBYSCORE(
      key: String,
      min: Double,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    
    def ZREVRANK(key: String, member: String): R = js.native
    def ZREVRANK(key: String, member: String, cb: Callback[Double | Null]): R = js.native
    
    def ZSCAN(args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    def ZSCAN(key: String, arg1: String): R = js.native
    def ZSCAN(key: String, arg1: String, arg2: String): R = js.native
    def ZSCAN(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    def ZSCAN(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def ZSCAN(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    def ZSCAN(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def ZSCAN(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def ZSCAN(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def ZSCAN(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def ZSCAN(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def ZSCAN(key: String, arg1: String, arg2: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def ZSCAN(key: String, arg1: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def ZSCAN(key: String, arg1: js.Array[String]): R = js.native
    def ZSCAN(key: String, arg1: js.Array[String], cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def ZSCAN(key: String, args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    @JSName("ZSCAN")
    var ZSCAN_Original: OverloadedKeyCommand[String, js.Tuple2[String, js.Array[String]], R] = js.native
    
    def ZSCORE(key: String, member: String): R = js.native
    def ZSCORE(key: String, member: String, cb: Callback[String]): R = js.native
    
    def ZUNIONSTORE(arg1: String | Double): R = js.native
    def ZUNIONSTORE(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    def ZUNIONSTORE(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    def ZUNIONSTORE(arg1: String | Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String | Double): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String | Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String, arg3: String): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String, arg3: Double): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: js.Array[String | Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: Double, arg3: String): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: Double, arg3: Double): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: String, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: js.Array[String | Double]): R = js.native
    def ZUNIONSTORE(arg1: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String | Double): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String | Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String, arg3: String): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String, arg3: Double): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: js.Array[String | Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: Double, arg3: String): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: Double, arg3: Double): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(arg1: Double, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def ZUNIONSTORE(args: (String | Double | Callback[Double])*): R = js.native
    @JSName("ZUNIONSTORE")
    var ZUNIONSTORE_Original: OverloadedCommand[String | Double, Double, R] = js.native
    
    /**
      * Append a value to a key.
      */
    def append(key: String, value: String): R = js.native
    def append(key: String, value: String, cb: Callback[Double]): R = js.native
    
    /**
      * Authenticate to the server.
      */
    def auth(password: String): R = js.native
    def auth(password: String, callback: Callback[String]): R = js.native
    
    /**
      * Asynchronously rewrite the append-only file.
      */
    def bgrewriteaof(): R = js.native
    @JSName("bgrewriteaof")
    def bgrewriteaof_OK(cb: Callback[OK]): R = js.native
    
    /**
      * Asynchronously save the dataset to disk.
      */
    def bgsave(): R = js.native
    def bgsave(cb: Callback[String]): R = js.native
    
    /**
      * Count set bits in a string.
      */
    def bitcount(key: String): R = js.native
    def bitcount(key: String, cb: Callback[Double]): R = js.native
    def bitcount(key: String, start: Double, end: Double): R = js.native
    def bitcount(key: String, start: Double, end: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Perform arbitrary bitfield integer operations on strings.
      */
    def bitfield(args: (String | Double | (Callback[js.Tuple2[Double, Double]]))*): R = js.native
    /**
      * Perform arbitrary bitfield integer operations on strings.
      */
    def bitfield(key: String, arg1: String | Double): R = js.native
    /**
      * Perform arbitrary bitfield integer operations on strings.
      */
    def bitfield(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[js.Tuple2[Double, Double]]]
    ): R = js.native
    /**
      * Perform arbitrary bitfield integer operations on strings.
      */
    def bitfield(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[js.Tuple2[Double, Double]]]
    ): R = js.native
    def bitfield(key: String, arg1: String | Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    /**
      * Perform arbitrary bitfield integer operations on strings.
      */
    def bitfield(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Perform arbitrary bitfield integer operations on strings.
      */
    def bitfield(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Perform arbitrary bitfield integer operations on strings.
      */
    def bitfield(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def bitfield(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def bitfield(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def bitfield(key: String, arg1: String, arg2: String, arg3: Double): R = js.native
    def bitfield(key: String, arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def bitfield(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def bitfield(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: String, arg2: String, arg3: Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def bitfield(key: String, arg1: String, arg2: String, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def bitfield(key: String, arg1: String, arg2: Double): R = js.native
    def bitfield(key: String, arg1: String, arg2: Double, arg3: String): R = js.native
    def bitfield(key: String, arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def bitfield(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def bitfield(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: String, arg2: Double, arg3: String, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def bitfield(key: String, arg1: String, arg2: Double, arg3: Double): R = js.native
    def bitfield(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def bitfield(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def bitfield(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: String, arg2: Double, arg3: Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def bitfield(key: String, arg1: String, arg2: Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def bitfield(key: String, arg1: js.Array[String | Double]): R = js.native
    def bitfield(key: String, arg1: js.Array[String | Double], cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def bitfield(key: String, arg1: Double, arg2: String): R = js.native
    def bitfield(key: String, arg1: Double, arg2: String, arg3: String): R = js.native
    def bitfield(key: String, arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def bitfield(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def bitfield(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: Double, arg2: String, arg3: String, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def bitfield(key: String, arg1: Double, arg2: String, arg3: Double): R = js.native
    def bitfield(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def bitfield(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def bitfield(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: Double, arg2: String, arg3: Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def bitfield(key: String, arg1: Double, arg2: String, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def bitfield(key: String, arg1: Double, arg2: Double): R = js.native
    def bitfield(key: String, arg1: Double, arg2: Double, arg3: String): R = js.native
    def bitfield(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def bitfield(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def bitfield(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: Double, arg2: Double, arg3: String, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def bitfield(key: String, arg1: Double, arg2: Double, arg3: Double): R = js.native
    def bitfield(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def bitfield(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def bitfield(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Tuple2[Double, Double]]
    ): R = js.native
    def bitfield(key: String, arg1: Double, arg2: Double, arg3: Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    def bitfield(key: String, arg1: Double, arg2: Double, cb: Callback[js.Tuple2[Double, Double]]): R = js.native
    /**
      * Perform arbitrary bitfield integer operations on strings.
      */
    def bitfield(key: String, args: (String | Double | (Callback[js.Tuple2[Double, Double]]))*): R = js.native
    /**
      * Perform arbitrary bitfield integer operations on strings.
      */
    @JSName("bitfield")
    var bitfield_Original: OverloadedKeyCommand[String | Double, js.Tuple2[Double, Double], R] = js.native
    
    def bitop(operation: String, destkey: String, args: (String | Callback[Double])*): R = js.native
    def bitop(operation: String, destkey: String, key1: String, key2: String): R = js.native
    def bitop(operation: String, destkey: String, key1: String, key2: String, cb: Callback[Double]): R = js.native
    /**
      * Perform bitwise operations between strings.
      */
    def bitop(operation: String, destkey: String, key1: String, key2: String, key3: String): R = js.native
    def bitop(operation: String, destkey: String, key1: String, key2: String, key3: String, cb: Callback[Double]): R = js.native
    def bitop(operation: String, destkey: String, key: String): R = js.native
    def bitop(operation: String, destkey: String, key: String, cb: Callback[Double]): R = js.native
    
    def bitpos(key: String, bit: Double): R = js.native
    def bitpos(key: String, bit: Double, cb: Callback[Double]): R = js.native
    def bitpos(key: String, bit: Double, start: Double): R = js.native
    def bitpos(key: String, bit: Double, start: Double, cb: Callback[Double]): R = js.native
    /**
      * Find first bit set or clear in a string.
      */
    def bitpos(key: String, bit: Double, start: Double, end: Double): R = js.native
    def bitpos(key: String, bit: Double, start: Double, end: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Remove and get the first element in a list, or block until one is available.
      */
    def blpop(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: Double): R = js.native
    def blpop(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: Double,
      cb: Callback[js.Tuple2[String, String]]
    ): R = js.native
    /**
      * Remove and get the first element in a list, or block until one is available.
      */
    def blpop(arg1: String, arg2: String, arg3: String, arg4: String, arg5: Double): R = js.native
    def blpop(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: Double,
      cb: Callback[js.Tuple2[String, String]]
    ): R = js.native
    /**
      * Remove and get the first element in a list, or block until one is available.
      */
    def blpop(arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def blpop(arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[js.Tuple2[String, String]]): R = js.native
    /**
      * Remove and get the first element in a list, or block until one is available.
      */
    def blpop(arg1: String, arg2: String, arg3: Double): R = js.native
    def blpop(arg1: String, arg2: String, arg3: Double, cb: Callback[js.Tuple2[String, String]]): R = js.native
    def blpop(arg1: String, arg2: js.Array[String | Double]): R = js.native
    def blpop(arg1: String, arg2: js.Array[String | Double], cb: Callback[js.Tuple2[String, String]]): R = js.native
    /**
      * Remove and get the first element in a list, or block until one is available.
      */
    def blpop(arg1: String, arg2: Double): R = js.native
    def blpop(arg1: String, arg2: Double, cb: Callback[js.Tuple2[String, String]]): R = js.native
    /**
      * Remove and get the first element in a list, or block until one is available.
      */
    def blpop(args: (String | Double | (Callback[js.Tuple2[String, String]]))*): R = js.native
    /**
      * Remove and get the first element in a list, or block until one is available.
      */
    def blpop(args: js.Array[String | Double]): R = js.native
    def blpop(args: js.Array[String | Double], cb: Callback[js.Tuple2[String, String]]): R = js.native
    /**
      * Remove and get the first element in a list, or block until one is available.
      */
    @JSName("blpop")
    var blpop_Original: OverloadedLastCommand[String, Double, js.Tuple2[String, String], R] = js.native
    
    /**
      * Remove and get the last element in a list, or block until one is available.
      */
    def brpop(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: Double): R = js.native
    def brpop(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: Double,
      cb: Callback[js.Tuple2[String, String]]
    ): R = js.native
    /**
      * Remove and get the last element in a list, or block until one is available.
      */
    def brpop(arg1: String, arg2: String, arg3: String, arg4: String, arg5: Double): R = js.native
    def brpop(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: Double,
      cb: Callback[js.Tuple2[String, String]]
    ): R = js.native
    /**
      * Remove and get the last element in a list, or block until one is available.
      */
    def brpop(arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def brpop(arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[js.Tuple2[String, String]]): R = js.native
    /**
      * Remove and get the last element in a list, or block until one is available.
      */
    def brpop(arg1: String, arg2: String, arg3: Double): R = js.native
    def brpop(arg1: String, arg2: String, arg3: Double, cb: Callback[js.Tuple2[String, String]]): R = js.native
    def brpop(arg1: String, arg2: js.Array[String | Double]): R = js.native
    def brpop(arg1: String, arg2: js.Array[String | Double], cb: Callback[js.Tuple2[String, String]]): R = js.native
    /**
      * Remove and get the last element in a list, or block until one is available.
      */
    def brpop(arg1: String, arg2: Double): R = js.native
    def brpop(arg1: String, arg2: Double, cb: Callback[js.Tuple2[String, String]]): R = js.native
    /**
      * Remove and get the last element in a list, or block until one is available.
      */
    def brpop(args: (String | Double | (Callback[js.Tuple2[String, String]]))*): R = js.native
    /**
      * Remove and get the last element in a list, or block until one is available.
      */
    def brpop(args: js.Array[String | Double]): R = js.native
    def brpop(args: js.Array[String | Double], cb: Callback[js.Tuple2[String, String]]): R = js.native
    /**
      * Remove and get the last element in a list, or block until one is available.
      */
    @JSName("brpop")
    var brpop_Original: OverloadedLastCommand[String, Double, js.Tuple2[String, String], R] = js.native
    
    /**
      * Pop a value from a list, push it to another list and return it; or block until one is available.
      */
    def brpoplpush(source: String, destination: String, timeout: Double): R = js.native
    def brpoplpush(source: String, destination: String, timeout: Double, cb: Callback[String | Null]): R = js.native
    
    /**
      * KILL - Kill the connection of a client.
      * LIST - Get the list of client connections.
      * GETNAME - Get the current connection name.
      * PAUSE - Stop processing commands from clients for some time.
      * REPLY - Instruct the server whether to reply to commands.
      * SETNAME - Set the current connection name.
      */
    def client(arg1: String): R = js.native
    /**
      * KILL - Kill the connection of a client.
      * LIST - Get the list of client connections.
      * GETNAME - Get the current connection name.
      * PAUSE - Stop processing commands from clients for some time.
      * REPLY - Instruct the server whether to reply to commands.
      * SETNAME - Set the current connection name.
      */
    def client(arg1: String, arg2: String): R = js.native
    /**
      * KILL - Kill the connection of a client.
      * LIST - Get the list of client connections.
      * GETNAME - Get the current connection name.
      * PAUSE - Stop processing commands from clients for some time.
      * REPLY - Instruct the server whether to reply to commands.
      * SETNAME - Set the current connection name.
      */
    def client(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * KILL - Kill the connection of a client.
      * LIST - Get the list of client connections.
      * GETNAME - Get the current connection name.
      * PAUSE - Stop processing commands from clients for some time.
      * REPLY - Instruct the server whether to reply to commands.
      * SETNAME - Set the current connection name.
      */
    def client(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * KILL - Kill the connection of a client.
      * LIST - Get the list of client connections.
      * GETNAME - Get the current connection name.
      * PAUSE - Stop processing commands from clients for some time.
      * REPLY - Instruct the server whether to reply to commands.
      * SETNAME - Set the current connection name.
      */
    def client(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * KILL - Kill the connection of a client.
      * LIST - Get the list of client connections.
      * GETNAME - Get the current connection name.
      * PAUSE - Stop processing commands from clients for some time.
      * REPLY - Instruct the server whether to reply to commands.
      * SETNAME - Set the current connection name.
      */
    def client(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def client(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[_]
    ): R = js.native
    def client(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[_]): R = js.native
    def client(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def client(arg1: String, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def client(arg1: String, arg2: String, cb: Callback[_]): R = js.native
    def client(arg1: String, arg2: js.Array[String]): R = js.native
    def client(arg1: String, arg2: js.Array[String], cb: Callback[_]): R = js.native
    def client(arg1: String, cb: Callback[_]): R = js.native
    def client(arg1: js.Array[String]): R = js.native
    def client(arg1: js.Array[String], cb: Callback[_]): R = js.native
    /**
      * KILL - Kill the connection of a client.
      * LIST - Get the list of client connections.
      * GETNAME - Get the current connection name.
      * PAUSE - Stop processing commands from clients for some time.
      * REPLY - Instruct the server whether to reply to commands.
      * SETNAME - Set the current connection name.
      */
    def client(args: (String | Callback[_])*): R = js.native
    /**
      * KILL - Kill the connection of a client.
      * LIST - Get the list of client connections.
      * GETNAME - Get the current connection name.
      * PAUSE - Stop processing commands from clients for some time.
      * REPLY - Instruct the server whether to reply to commands.
      * SETNAME - Set the current connection name.
      */
    @JSName("client")
    var client_Original: OverloadedCommand[String, _, R] = js.native
    
    /**
      * ADDSLOTS - Assign new hash slots to receiving node.
      * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
      * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
      * DELSLOTS - Set hash slots as unbound in receiving node.
      * FAILOVER - Forces a slave to perform a manual failover of its master.
      * FORGET - Remove a node from the nodes table.
      * GETKEYSINSLOT - Return local key names in the specified hash slot.
      * INFO - Provides info about Redis Cluster node state.
      * KEYSLOT - Returns the hash slot of the specified key.
      * MEET - Force a node cluster to handshake with another node.
      * NODES - Get cluster config for the node.
      * REPLICATE - Reconfigure a node as a slave of the specified master node.
      * RESET - Reset a Redis Cluster node.
      * SAVECONFIG - Forces the node to save cluster state on disk.
      * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
      * SETSLOT - Bind a hash slot to a specified node.
      * SLAVES - List slave nodes of the specified master node.
      * SLOTS - Get array of Cluster slot to node mappings.
      */
    def cluster(arg1: String): this.type = js.native
    /**
      * ADDSLOTS - Assign new hash slots to receiving node.
      * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
      * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
      * DELSLOTS - Set hash slots as unbound in receiving node.
      * FAILOVER - Forces a slave to perform a manual failover of its master.
      * FORGET - Remove a node from the nodes table.
      * GETKEYSINSLOT - Return local key names in the specified hash slot.
      * INFO - Provides info about Redis Cluster node state.
      * KEYSLOT - Returns the hash slot of the specified key.
      * MEET - Force a node cluster to handshake with another node.
      * NODES - Get cluster config for the node.
      * REPLICATE - Reconfigure a node as a slave of the specified master node.
      * RESET - Reset a Redis Cluster node.
      * SAVECONFIG - Forces the node to save cluster state on disk.
      * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
      * SETSLOT - Bind a hash slot to a specified node.
      * SLAVES - List slave nodes of the specified master node.
      * SLOTS - Get array of Cluster slot to node mappings.
      */
    def cluster(arg1: String, arg2: String): this.type = js.native
    /**
      * ADDSLOTS - Assign new hash slots to receiving node.
      * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
      * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
      * DELSLOTS - Set hash slots as unbound in receiving node.
      * FAILOVER - Forces a slave to perform a manual failover of its master.
      * FORGET - Remove a node from the nodes table.
      * GETKEYSINSLOT - Return local key names in the specified hash slot.
      * INFO - Provides info about Redis Cluster node state.
      * KEYSLOT - Returns the hash slot of the specified key.
      * MEET - Force a node cluster to handshake with another node.
      * NODES - Get cluster config for the node.
      * REPLICATE - Reconfigure a node as a slave of the specified master node.
      * RESET - Reset a Redis Cluster node.
      * SAVECONFIG - Forces the node to save cluster state on disk.
      * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
      * SETSLOT - Bind a hash slot to a specified node.
      * SLAVES - List slave nodes of the specified master node.
      * SLOTS - Get array of Cluster slot to node mappings.
      */
    def cluster(arg1: String, arg2: String, arg3: String): this.type = js.native
    /**
      * ADDSLOTS - Assign new hash slots to receiving node.
      * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
      * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
      * DELSLOTS - Set hash slots as unbound in receiving node.
      * FAILOVER - Forces a slave to perform a manual failover of its master.
      * FORGET - Remove a node from the nodes table.
      * GETKEYSINSLOT - Return local key names in the specified hash slot.
      * INFO - Provides info about Redis Cluster node state.
      * KEYSLOT - Returns the hash slot of the specified key.
      * MEET - Force a node cluster to handshake with another node.
      * NODES - Get cluster config for the node.
      * REPLICATE - Reconfigure a node as a slave of the specified master node.
      * RESET - Reset a Redis Cluster node.
      * SAVECONFIG - Forces the node to save cluster state on disk.
      * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
      * SETSLOT - Bind a hash slot to a specified node.
      * SLAVES - List slave nodes of the specified master node.
      * SLOTS - Get array of Cluster slot to node mappings.
      */
    def cluster(arg1: String, arg2: String, arg3: String, arg4: String): this.type = js.native
    /**
      * ADDSLOTS - Assign new hash slots to receiving node.
      * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
      * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
      * DELSLOTS - Set hash slots as unbound in receiving node.
      * FAILOVER - Forces a slave to perform a manual failover of its master.
      * FORGET - Remove a node from the nodes table.
      * GETKEYSINSLOT - Return local key names in the specified hash slot.
      * INFO - Provides info about Redis Cluster node state.
      * KEYSLOT - Returns the hash slot of the specified key.
      * MEET - Force a node cluster to handshake with another node.
      * NODES - Get cluster config for the node.
      * REPLICATE - Reconfigure a node as a slave of the specified master node.
      * RESET - Reset a Redis Cluster node.
      * SAVECONFIG - Forces the node to save cluster state on disk.
      * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
      * SETSLOT - Bind a hash slot to a specified node.
      * SLAVES - List slave nodes of the specified master node.
      * SLOTS - Get array of Cluster slot to node mappings.
      */
    def cluster(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): this.type = js.native
    /**
      * ADDSLOTS - Assign new hash slots to receiving node.
      * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
      * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
      * DELSLOTS - Set hash slots as unbound in receiving node.
      * FAILOVER - Forces a slave to perform a manual failover of its master.
      * FORGET - Remove a node from the nodes table.
      * GETKEYSINSLOT - Return local key names in the specified hash slot.
      * INFO - Provides info about Redis Cluster node state.
      * KEYSLOT - Returns the hash slot of the specified key.
      * MEET - Force a node cluster to handshake with another node.
      * NODES - Get cluster config for the node.
      * REPLICATE - Reconfigure a node as a slave of the specified master node.
      * RESET - Reset a Redis Cluster node.
      * SAVECONFIG - Forces the node to save cluster state on disk.
      * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
      * SETSLOT - Bind a hash slot to a specified node.
      * SLAVES - List slave nodes of the specified master node.
      * SLOTS - Get array of Cluster slot to node mappings.
      */
    def cluster(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): this.type = js.native
    def cluster(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[_]
    ): this.type = js.native
    def cluster(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[_]): this.type = js.native
    def cluster(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[_]): this.type = js.native
    def cluster(arg1: String, arg2: String, arg3: String, cb: Callback[_]): this.type = js.native
    def cluster(arg1: String, arg2: String, cb: Callback[_]): this.type = js.native
    def cluster(arg1: String, arg2: js.Array[String]): this.type = js.native
    def cluster(arg1: String, arg2: js.Array[String], cb: Callback[_]): this.type = js.native
    def cluster(arg1: String, cb: Callback[_]): this.type = js.native
    def cluster(arg1: js.Array[String]): this.type = js.native
    def cluster(arg1: js.Array[String], cb: Callback[_]): this.type = js.native
    /**
      * ADDSLOTS - Assign new hash slots to receiving node.
      * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
      * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
      * DELSLOTS - Set hash slots as unbound in receiving node.
      * FAILOVER - Forces a slave to perform a manual failover of its master.
      * FORGET - Remove a node from the nodes table.
      * GETKEYSINSLOT - Return local key names in the specified hash slot.
      * INFO - Provides info about Redis Cluster node state.
      * KEYSLOT - Returns the hash slot of the specified key.
      * MEET - Force a node cluster to handshake with another node.
      * NODES - Get cluster config for the node.
      * REPLICATE - Reconfigure a node as a slave of the specified master node.
      * RESET - Reset a Redis Cluster node.
      * SAVECONFIG - Forces the node to save cluster state on disk.
      * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
      * SETSLOT - Bind a hash slot to a specified node.
      * SLAVES - List slave nodes of the specified master node.
      * SLOTS - Get array of Cluster slot to node mappings.
      */
    def cluster(args: (String | Callback[_])*): this.type = js.native
    /**
      * ADDSLOTS - Assign new hash slots to receiving node.
      * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
      * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
      * DELSLOTS - Set hash slots as unbound in receiving node.
      * FAILOVER - Forces a slave to perform a manual failover of its master.
      * FORGET - Remove a node from the nodes table.
      * GETKEYSINSLOT - Return local key names in the specified hash slot.
      * INFO - Provides info about Redis Cluster node state.
      * KEYSLOT - Returns the hash slot of the specified key.
      * MEET - Force a node cluster to handshake with another node.
      * NODES - Get cluster config for the node.
      * REPLICATE - Reconfigure a node as a slave of the specified master node.
      * RESET - Reset a Redis Cluster node.
      * SAVECONFIG - Forces the node to save cluster state on disk.
      * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
      * SETSLOT - Bind a hash slot to a specified node.
      * SLAVES - List slave nodes of the specified master node.
      * SLOTS - Get array of Cluster slot to node mappings.
      */
    @JSName("cluster")
    var cluster_Original: OverloadedCommand[String, _, this.type] = js.native
    
    /**
      * Get array of Redis command details.
      *
      * COUNT - Get total number of Redis commands.
      * GETKEYS - Extract keys given a full Redis command.
      * INFO - Get array of specific REdis command details.
      */
    def command(): R = js.native
    def command(cb: Callback[js.Array[js.Tuple6[String, Double, js.Array[String], Double, Double, Double]]]): R = js.native
    
    /**
      * Get array of Redis command details.
      *
      * COUNT - Get array of Redis command details.
      * GETKEYS - Extract keys given a full Redis command.
      * INFO - Get array of specific Redis command details.
      * GET - Get the value of a configuration parameter.
      * REWRITE - Rewrite the configuration file with the in memory configuration.
      * SET - Set a configuration parameter to the given value.
      * RESETSTAT - Reset the stats returned by INFO.
      */
    def config(arg1: String): R = js.native
    /**
      * Get array of Redis command details.
      *
      * COUNT - Get array of Redis command details.
      * GETKEYS - Extract keys given a full Redis command.
      * INFO - Get array of specific Redis command details.
      * GET - Get the value of a configuration parameter.
      * REWRITE - Rewrite the configuration file with the in memory configuration.
      * SET - Set a configuration parameter to the given value.
      * RESETSTAT - Reset the stats returned by INFO.
      */
    def config(arg1: String, arg2: String): R = js.native
    /**
      * Get array of Redis command details.
      *
      * COUNT - Get array of Redis command details.
      * GETKEYS - Extract keys given a full Redis command.
      * INFO - Get array of specific Redis command details.
      * GET - Get the value of a configuration parameter.
      * REWRITE - Rewrite the configuration file with the in memory configuration.
      * SET - Set a configuration parameter to the given value.
      * RESETSTAT - Reset the stats returned by INFO.
      */
    def config(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Get array of Redis command details.
      *
      * COUNT - Get array of Redis command details.
      * GETKEYS - Extract keys given a full Redis command.
      * INFO - Get array of specific Redis command details.
      * GET - Get the value of a configuration parameter.
      * REWRITE - Rewrite the configuration file with the in memory configuration.
      * SET - Set a configuration parameter to the given value.
      * RESETSTAT - Reset the stats returned by INFO.
      */
    def config(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Get array of Redis command details.
      *
      * COUNT - Get array of Redis command details.
      * GETKEYS - Extract keys given a full Redis command.
      * INFO - Get array of specific Redis command details.
      * GET - Get the value of a configuration parameter.
      * REWRITE - Rewrite the configuration file with the in memory configuration.
      * SET - Set a configuration parameter to the given value.
      * RESETSTAT - Reset the stats returned by INFO.
      */
    def config(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Get array of Redis command details.
      *
      * COUNT - Get array of Redis command details.
      * GETKEYS - Extract keys given a full Redis command.
      * INFO - Get array of specific Redis command details.
      * GET - Get the value of a configuration parameter.
      * REWRITE - Rewrite the configuration file with the in memory configuration.
      * SET - Set a configuration parameter to the given value.
      * RESETSTAT - Reset the stats returned by INFO.
      */
    def config(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def config(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Boolean]
    ): R = js.native
    def config(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Boolean]): R = js.native
    def config(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Boolean]): R = js.native
    def config(arg1: String, arg2: String, arg3: String, cb: Callback[Boolean]): R = js.native
    def config(arg1: String, arg2: String, cb: Callback[Boolean]): R = js.native
    def config(arg1: String, arg2: js.Array[String]): R = js.native
    def config(arg1: String, arg2: js.Array[String], cb: Callback[Boolean]): R = js.native
    def config(arg1: String, cb: Callback[Boolean]): R = js.native
    def config(arg1: js.Array[String]): R = js.native
    def config(arg1: js.Array[String], cb: Callback[Boolean]): R = js.native
    /**
      * Get array of Redis command details.
      *
      * COUNT - Get array of Redis command details.
      * GETKEYS - Extract keys given a full Redis command.
      * INFO - Get array of specific Redis command details.
      * GET - Get the value of a configuration parameter.
      * REWRITE - Rewrite the configuration file with the in memory configuration.
      * SET - Set a configuration parameter to the given value.
      * RESETSTAT - Reset the stats returned by INFO.
      */
    def config(args: (String | Callback[Boolean])*): R = js.native
    /**
      * Get array of Redis command details.
      *
      * COUNT - Get array of Redis command details.
      * GETKEYS - Extract keys given a full Redis command.
      * INFO - Get array of specific Redis command details.
      * GET - Get the value of a configuration parameter.
      * REWRITE - Rewrite the configuration file with the in memory configuration.
      * SET - Set a configuration parameter to the given value.
      * RESETSTAT - Reset the stats returned by INFO.
      */
    @JSName("config")
    var config_Original: OverloadedCommand[String, Boolean, R] = js.native
    
    /**
      * Return the number of keys in the selected database.
      */
    def dbsize(): R = js.native
    def dbsize(cb: Callback[Double]): R = js.native
    
    /**
      * OBJECT - Get debugging information about a key.
      * SEGFAULT - Make the server crash.
      */
    def debug(arg1: String): R = js.native
    /**
      * OBJECT - Get debugging information about a key.
      * SEGFAULT - Make the server crash.
      */
    def debug(arg1: String, arg2: String): R = js.native
    /**
      * OBJECT - Get debugging information about a key.
      * SEGFAULT - Make the server crash.
      */
    def debug(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * OBJECT - Get debugging information about a key.
      * SEGFAULT - Make the server crash.
      */
    def debug(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * OBJECT - Get debugging information about a key.
      * SEGFAULT - Make the server crash.
      */
    def debug(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * OBJECT - Get debugging information about a key.
      * SEGFAULT - Make the server crash.
      */
    def debug(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def debug(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Boolean]
    ): R = js.native
    def debug(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Boolean]): R = js.native
    def debug(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Boolean]): R = js.native
    def debug(arg1: String, arg2: String, arg3: String, cb: Callback[Boolean]): R = js.native
    def debug(arg1: String, arg2: String, cb: Callback[Boolean]): R = js.native
    def debug(arg1: String, arg2: js.Array[String]): R = js.native
    def debug(arg1: String, arg2: js.Array[String], cb: Callback[Boolean]): R = js.native
    def debug(arg1: String, cb: Callback[Boolean]): R = js.native
    def debug(arg1: js.Array[String]): R = js.native
    def debug(arg1: js.Array[String], cb: Callback[Boolean]): R = js.native
    /**
      * OBJECT - Get debugging information about a key.
      * SEGFAULT - Make the server crash.
      */
    def debug(args: (String | Callback[Boolean])*): R = js.native
    /**
      * OBJECT - Get debugging information about a key.
      * SEGFAULT - Make the server crash.
      */
    @JSName("debug")
    var debug_Original: OverloadedCommand[String, Boolean, R] = js.native
    
    /**
      * Decrement the integer value of a key by one.
      */
    def decr(key: String): R = js.native
    def decr(key: String, cb: Callback[Double]): R = js.native
    
    /**
      * Decrement the integer value of a key by the given number.
      */
    def decrby(key: String, decrement: Double): R = js.native
    def decrby(key: String, decrement: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Delete a key.
      */
    def del(arg1: String): R = js.native
    /**
      * Delete a key.
      */
    def del(arg1: String, arg2: String): R = js.native
    /**
      * Delete a key.
      */
    def del(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Delete a key.
      */
    def del(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Delete a key.
      */
    def del(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Delete a key.
      */
    def del(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def del(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def del(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def del(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def del(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def del(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def del(arg1: String, arg2: js.Array[String]): R = js.native
    def del(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def del(arg1: String, cb: Callback[Double]): R = js.native
    def del(arg1: js.Array[String]): R = js.native
    def del(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Delete a key.
      */
    def del(args: (String | Callback[Double])*): R = js.native
    /**
      * Delete a key.
      */
    @JSName("del")
    var del_Original: OverloadedCommand[String, Double, R] = js.native
    
    /**
      * Discard all commands issued after MULTI.
      */
    def discard(): R = js.native
    @JSName("discard")
    def discard_OK(cb: Callback[OK]): R = js.native
    
    /**
      * Return a serialized version of the value stored at the specified key.
      */
    def dump(key: String): R = js.native
    def dump(key: String, cb: Callback[String]): R = js.native
    
    /**
      * Echo the given string.
      */
    def echo[T /* <: String */](message: T): R = js.native
    def echo[T /* <: String */](message: T, cb: Callback[T]): R = js.native
    
    /**
      * Execute a Lua script server side.
      */
    def eval(arg1: String | Double): R = js.native
    /**
      * Execute a Lua script server side.
      */
    def eval(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[_]]
    ): R = js.native
    /**
      * Execute a Lua script server side.
      */
    def eval(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[_]]
    ): R = js.native
    def eval(arg1: String | Double, cb: Callback[_]): R = js.native
    /**
      * Execute a Lua script server side.
      */
    def eval(arg1: String, arg2: String | Double): R = js.native
    def eval(arg1: String, arg2: String | Double, cb: Callback[_]): R = js.native
    /**
      * Execute a Lua script server side.
      */
    def eval(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Execute a Lua script server side.
      */
    def eval(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def eval(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def eval(arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def eval(arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def eval(arg1: String, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def eval(arg1: String, arg2: String, arg3: Double): R = js.native
    def eval(arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def eval(arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def eval(arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def eval(arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def eval(arg1: String, arg2: String, arg3: Double, cb: Callback[_]): R = js.native
    def eval(arg1: String, arg2: js.Array[String | Double]): R = js.native
    def eval(arg1: String, arg2: js.Array[String | Double], cb: Callback[_]): R = js.native
    def eval(arg1: String, arg2: Double, arg3: String): R = js.native
    def eval(arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def eval(arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def eval(arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def eval(arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def eval(arg1: String, arg2: Double, arg3: String, cb: Callback[_]): R = js.native
    def eval(arg1: String, arg2: Double, arg3: Double): R = js.native
    def eval(arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def eval(arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def eval(arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def eval(arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def eval(arg1: String, arg2: Double, arg3: Double, cb: Callback[_]): R = js.native
    def eval(arg1: js.Array[String | Double]): R = js.native
    def eval(arg1: js.Array[String | Double], cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: String | Double): R = js.native
    def eval(arg1: Double, arg2: String | Double, cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: String, arg3: String): R = js.native
    def eval(arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def eval(arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def eval(arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: String, arg3: Double): R = js.native
    def eval(arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def eval(arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def eval(arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: String, arg3: Double, cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: js.Array[String | Double]): R = js.native
    def eval(arg1: Double, arg2: js.Array[String | Double], cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: Double, arg3: String): R = js.native
    def eval(arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def eval(arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def eval(arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: Double, arg3: String, cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: Double, arg3: Double): R = js.native
    def eval(arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def eval(arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def eval(arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def eval(arg1: Double, arg2: Double, arg3: Double, cb: Callback[_]): R = js.native
    /**
      * Execute a Lua script server side.
      */
    def eval(args: (String | Double | Callback[_])*): R = js.native
    /**
      * Execute a Lua script server side.
      */
    @JSName("eval")
    var eval_Original: OverloadedCommand[String | Double, _, R] = js.native
    
    /**
      * Execute a Lue script server side.
      */
    def evalsha(arg1: String | Double): R = js.native
    /**
      * Execute a Lue script server side.
      */
    def evalsha(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[_]]
    ): R = js.native
    /**
      * Execute a Lue script server side.
      */
    def evalsha(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[_]]
    ): R = js.native
    def evalsha(arg1: String | Double, cb: Callback[_]): R = js.native
    /**
      * Execute a Lue script server side.
      */
    def evalsha(arg1: String, arg2: String | Double): R = js.native
    def evalsha(arg1: String, arg2: String | Double, cb: Callback[_]): R = js.native
    /**
      * Execute a Lue script server side.
      */
    def evalsha(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Execute a Lue script server side.
      */
    def evalsha(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def evalsha(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def evalsha(arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def evalsha(arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def evalsha(arg1: String, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def evalsha(arg1: String, arg2: String, arg3: Double): R = js.native
    def evalsha(arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def evalsha(arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def evalsha(arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def evalsha(arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def evalsha(arg1: String, arg2: String, arg3: Double, cb: Callback[_]): R = js.native
    def evalsha(arg1: String, arg2: js.Array[String | Double]): R = js.native
    def evalsha(arg1: String, arg2: js.Array[String | Double], cb: Callback[_]): R = js.native
    def evalsha(arg1: String, arg2: Double, arg3: String): R = js.native
    def evalsha(arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def evalsha(arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def evalsha(arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def evalsha(arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def evalsha(arg1: String, arg2: Double, arg3: String, cb: Callback[_]): R = js.native
    def evalsha(arg1: String, arg2: Double, arg3: Double): R = js.native
    def evalsha(arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def evalsha(arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def evalsha(arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def evalsha(arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def evalsha(arg1: String, arg2: Double, arg3: Double, cb: Callback[_]): R = js.native
    def evalsha(arg1: js.Array[String | Double]): R = js.native
    def evalsha(arg1: js.Array[String | Double], cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: String | Double): R = js.native
    def evalsha(arg1: Double, arg2: String | Double, cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: String, arg3: String): R = js.native
    def evalsha(arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def evalsha(arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def evalsha(arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: String, arg3: Double): R = js.native
    def evalsha(arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def evalsha(arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def evalsha(arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: String, arg3: Double, cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: js.Array[String | Double]): R = js.native
    def evalsha(arg1: Double, arg2: js.Array[String | Double], cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: Double, arg3: String): R = js.native
    def evalsha(arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def evalsha(arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def evalsha(arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: Double, arg3: String, cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: Double, arg3: Double): R = js.native
    def evalsha(arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def evalsha(arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def evalsha(arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[_]): R = js.native
    def evalsha(arg1: Double, arg2: Double, arg3: Double, cb: Callback[_]): R = js.native
    /**
      * Execute a Lue script server side.
      */
    def evalsha(args: (String | Double | Callback[_])*): R = js.native
    /**
      * Execute a Lue script server side.
      */
    @JSName("evalsha")
    var evalsha_Original: OverloadedCommand[String | Double, _, R] = js.native
    
    /**
      * Determine if a key exists.
      */
    def exists(arg1: String): R = js.native
    /**
      * Determine if a key exists.
      */
    def exists(arg1: String, arg2: String): R = js.native
    /**
      * Determine if a key exists.
      */
    def exists(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Determine if a key exists.
      */
    def exists(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Determine if a key exists.
      */
    def exists(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Determine if a key exists.
      */
    def exists(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def exists(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def exists(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def exists(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def exists(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def exists(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def exists(arg1: String, arg2: js.Array[String]): R = js.native
    def exists(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def exists(arg1: String, cb: Callback[Double]): R = js.native
    def exists(arg1: js.Array[String]): R = js.native
    def exists(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Determine if a key exists.
      */
    def exists(args: (String | Callback[Double])*): R = js.native
    /**
      * Determine if a key exists.
      */
    @JSName("exists")
    var exists_Original: OverloadedCommand[String, Double, R] = js.native
    
    /**
      * Set a key's time to live in seconds.
      */
    def expire(key: String, seconds: Double): R = js.native
    def expire(key: String, seconds: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Set the expiration for a key as a UNIX timestamp.
      */
    def expireat(key: String, timestamp: Double): R = js.native
    def expireat(key: String, timestamp: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Remove all keys from all databases.
      */
    def flushall(): R = js.native
    def flushall(cb: Callback[String]): R = js.native
    @JSName("flushall")
    def flushall_ASYNC(async: ASYNC): R = js.native
    @JSName("flushall")
    def flushall_ASYNC(async: ASYNC, cb: Callback[String]): R = js.native
    
    /**
      * Remove all keys from the current database.
      */
    def flushdb(): R = js.native
    @JSName("flushdb")
    def flushdb_ASYNC(async: ASYNC): R = js.native
    @JSName("flushdb")
    def flushdb_ASYNC(async: ASYNC, cb: Callback[String]): R = js.native
    @JSName("flushdb")
    def flushdb_OK(cb: Callback[OK]): R = js.native
    
    /**
      * Add one or more geospatial items in the geospatial index represented using a sorted set.
      */
    def geoadd(args: (String | Double | Callback[Double])*): R = js.native
    /**
      * Add one or more geospatial items in the geospatial index represented using a sorted set.
      */
    def geoadd(key: String, arg1: String | Double): R = js.native
    /**
      * Add one or more geospatial items in the geospatial index represented using a sorted set.
      */
    def geoadd(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    /**
      * Add one or more geospatial items in the geospatial index represented using a sorted set.
      */
    def geoadd(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    def geoadd(key: String, arg1: String | Double, cb: Callback[Double]): R = js.native
    /**
      * Add one or more geospatial items in the geospatial index represented using a sorted set.
      */
    def geoadd(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Add one or more geospatial items in the geospatial index represented using a sorted set.
      */
    def geoadd(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Add one or more geospatial items in the geospatial index represented using a sorted set.
      */
    def geoadd(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def geoadd(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def geoadd(key: String, arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: String, arg2: String, arg3: Double): R = js.native
    def geoadd(key: String, arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def geoadd(key: String, arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def geoadd(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: String, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double, arg3: String): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double, arg3: Double): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: String, arg2: Double, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: js.Array[String | Double]): R = js.native
    def geoadd(key: String, arg1: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String, arg3: String): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String, arg3: Double): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double, arg3: String): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double, arg3: Double): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def geoadd(key: String, arg1: Double, arg2: Double, cb: Callback[Double]): R = js.native
    /**
      * Add one or more geospatial items in the geospatial index represented using a sorted set.
      */
    def geoadd(key: String, args: (String | Double | Callback[Double])*): R = js.native
    /**
      * Add one or more geospatial items in the geospatial index represented using a sorted set.
      */
    @JSName("geoadd")
    var geoadd_Original: OverloadedKeyCommand[String | Double, Double, R] = js.native
    
    /**
      * Returns the distance between two members of a geospatial index.
      */
    def geodist(args: (String | Callback[String])*): R = js.native
    /**
      * Returns the distance between two members of a geospatial index.
      */
    def geodist(key: String, arg1: String): R = js.native
    /**
      * Returns the distance between two members of a geospatial index.
      */
    def geodist(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Returns the distance between two members of a geospatial index.
      */
    def geodist(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Returns the distance between two members of a geospatial index.
      */
    def geodist(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Returns the distance between two members of a geospatial index.
      */
    def geodist(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Returns the distance between two members of a geospatial index.
      */
    def geodist(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def geodist(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def geodist(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[String]
    ): R = js.native
    def geodist(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def geodist(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def geodist(key: String, arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def geodist(key: String, arg1: String, cb: Callback[String]): R = js.native
    def geodist(key: String, arg1: js.Array[String]): R = js.native
    def geodist(key: String, arg1: js.Array[String], cb: Callback[String]): R = js.native
    /**
      * Returns the distance between two members of a geospatial index.
      */
    def geodist(key: String, args: (String | Callback[String])*): R = js.native
    /**
      * Returns the distance between two members of a geospatial index.
      */
    @JSName("geodist")
    var geodist_Original: OverloadedKeyCommand[String, String, R] = js.native
    
    /**
      * Returns members of a geospatial index as standard geohash strings.
      */
    def geohash(args: (String | Callback[String])*): R = js.native
    /**
      * Returns members of a geospatial index as standard geohash strings.
      */
    def geohash(key: String, arg1: String): R = js.native
    /**
      * Returns members of a geospatial index as standard geohash strings.
      */
    def geohash(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Returns members of a geospatial index as standard geohash strings.
      */
    def geohash(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Returns members of a geospatial index as standard geohash strings.
      */
    def geohash(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Returns members of a geospatial index as standard geohash strings.
      */
    def geohash(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Returns members of a geospatial index as standard geohash strings.
      */
    def geohash(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def geohash(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def geohash(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[String]
    ): R = js.native
    def geohash(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def geohash(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def geohash(key: String, arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def geohash(key: String, arg1: String, cb: Callback[String]): R = js.native
    def geohash(key: String, arg1: js.Array[String]): R = js.native
    def geohash(key: String, arg1: js.Array[String], cb: Callback[String]): R = js.native
    /**
      * Returns members of a geospatial index as standard geohash strings.
      */
    def geohash(key: String, args: (String | Callback[String])*): R = js.native
    /**
      * Returns members of a geospatial index as standard geohash strings.
      */
    @JSName("geohash")
    var geohash_Original: OverloadedKeyCommand[String, String, R] = js.native
    
    /**
      * Returns longitude and latitude of members of a geospatial index.
      */
    def geopos(args: (String | (Callback[js.Array[js.Tuple2[Double, Double]]]))*): R = js.native
    /**
      * Returns longitude and latitude of members of a geospatial index.
      */
    def geopos(key: String, arg1: String): R = js.native
    /**
      * Returns longitude and latitude of members of a geospatial index.
      */
    def geopos(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Returns longitude and latitude of members of a geospatial index.
      */
    def geopos(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Returns longitude and latitude of members of a geospatial index.
      */
    def geopos(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Returns longitude and latitude of members of a geospatial index.
      */
    def geopos(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Returns longitude and latitude of members of a geospatial index.
      */
    def geopos(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def geopos(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[js.Tuple2[Double, Double]]]
    ): R = js.native
    def geopos(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[js.Tuple2[Double, Double]]]
    ): R = js.native
    def geopos(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[js.Tuple2[Double, Double]]]
    ): R = js.native
    def geopos(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Array[js.Tuple2[Double, Double]]]
    ): R = js.native
    def geopos(key: String, arg1: String, arg2: String, cb: Callback[js.Array[js.Tuple2[Double, Double]]]): R = js.native
    def geopos(key: String, arg1: String, cb: Callback[js.Array[js.Tuple2[Double, Double]]]): R = js.native
    def geopos(key: String, arg1: js.Array[String]): R = js.native
    def geopos(key: String, arg1: js.Array[String], cb: Callback[js.Array[js.Tuple2[Double, Double]]]): R = js.native
    /**
      * Returns longitude and latitude of members of a geospatial index.
      */
    def geopos(key: String, args: (String | (Callback[js.Array[js.Tuple2[Double, Double]]]))*): R = js.native
    /**
      * Returns longitude and latitude of members of a geospatial index.
      */
    @JSName("geopos")
    var geopos_Original: OverloadedKeyCommand[String, js.Array[js.Tuple2[Double, Double]], R] = js.native
    
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
      */
    def georadius(
      args: (String | Double | (Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]))*
    ): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
      */
    def georadius(key: String, arg1: String | Double): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
      */
    def georadius(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[
          Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
        ]
    ): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
      */
    def georadius(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[
          Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
        ]
    ): R = js.native
    def georadius(
      key: String,
      arg1: String | Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
      */
    def georadius(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
      */
    def georadius(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
      */
    def georadius(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: String, arg2: String, arg3: Double): R = js.native
    def georadius(key: String, arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: String, arg2: Double): R = js.native
    def georadius(key: String, arg1: String, arg2: Double, arg3: String): R = js.native
    def georadius(key: String, arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: String, arg2: Double, arg3: Double): R = js.native
    def georadius(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(
      key: String,
      arg1: String,
      arg2: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: js.Array[String | Double]): R = js.native
    def georadius(
      key: String,
      arg1: js.Array[String | Double],
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: Double, arg2: String): R = js.native
    def georadius(key: String, arg1: Double, arg2: String, arg3: String): R = js.native
    def georadius(key: String, arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: Double, arg2: String, arg3: Double): R = js.native
    def georadius(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: Double, arg2: Double): R = js.native
    def georadius(key: String, arg1: Double, arg2: Double, arg3: String): R = js.native
    def georadius(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: Double, arg2: Double, arg3: Double): R = js.native
    def georadius(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadius(
      key: String,
      arg1: Double,
      arg2: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
      */
    def georadius(
      key: String,
      args: (String | Double | (Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]))*
    ): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
      */
    @JSName("georadius")
    var georadius_Original: OverloadedKeyCommand[
        String | Double, 
        js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])], 
        R
      ] = js.native
    
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
      */
    def georadiusbymember(
      args: (String | Double | (Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]))*
    ): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
      */
    def georadiusbymember(key: String, arg1: String | Double): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
      */
    def georadiusbymember(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[
          Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
        ]
    ): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
      */
    def georadiusbymember(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[
          Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
        ]
    ): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String | Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
      */
    def georadiusbymember(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
      */
    def georadiusbymember(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
      */
    def georadiusbymember(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: String, arg2: String, arg3: Double): R = js.native
    def georadiusbymember(key: String, arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: String,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: String, arg2: Double): R = js.native
    def georadiusbymember(key: String, arg1: String, arg2: Double, arg3: String): R = js.native
    def georadiusbymember(key: String, arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: String, arg2: Double, arg3: Double): R = js.native
    def georadiusbymember(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: Double,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(
      key: String,
      arg1: String,
      arg2: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: js.Array[String | Double]): R = js.native
    def georadiusbymember(
      key: String,
      arg1: js.Array[String | Double],
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: String): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: String, arg3: String): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: String, arg3: Double): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: String,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: Double): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: Double, arg3: String): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: Double, arg3: Double): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      arg4: String,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      arg4: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: Double,
      arg3: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    def georadiusbymember(
      key: String,
      arg1: Double,
      arg2: Double,
      cb: Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]
    ): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
      */
    def georadiusbymember(
      key: String,
      args: (String | Double | (Callback[js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])]]))*
    ): R = js.native
    /**
      * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
      */
    @JSName("georadiusbymember")
    var georadiusbymember_Original: OverloadedKeyCommand[
        String | Double, 
        js.Array[String | (js.Tuple2[String, String | (js.Tuple2[String, String])])], 
        R
      ] = js.native
    
    /**
      * Get the value of a key.
      */
    def get(key: String): R = js.native
    def get(key: String, cb: Callback[String | Null]): R = js.native
    
    /**
      * Returns the bit value at offset in the string value stored at key.
      */
    def getbit(key: String, offset: Double): R = js.native
    def getbit(key: String, offset: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Get a substring of the string stored at a key.
      */
    def getrange(key: String, start: Double, end: Double): R = js.native
    def getrange(key: String, start: Double, end: Double, cb: Callback[String]): R = js.native
    
    /**
      * Set the string value of a key and return its old value.
      */
    def getset(key: String, value: String): R = js.native
    def getset(key: String, value: String, cb: Callback[String]): R = js.native
    
    /**
      * Delete on or more hash fields.
      */
    def hdel(args: (String | Callback[Double])*): R = js.native
    /**
      * Delete on or more hash fields.
      */
    def hdel(key: String, arg1: String): R = js.native
    /**
      * Delete on or more hash fields.
      */
    def hdel(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Delete on or more hash fields.
      */
    def hdel(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Delete on or more hash fields.
      */
    def hdel(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Delete on or more hash fields.
      */
    def hdel(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Delete on or more hash fields.
      */
    def hdel(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def hdel(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def hdel(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def hdel(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def hdel(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def hdel(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def hdel(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def hdel(key: String, arg1: js.Array[String]): R = js.native
    def hdel(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Delete on or more hash fields.
      */
    def hdel(key: String, args: (String | Callback[Double])*): R = js.native
    /**
      * Delete on or more hash fields.
      */
    @JSName("hdel")
    var hdel_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    /**
      * Determine if a hash field exists.
      */
    def hexists(key: String, field: String): R = js.native
    def hexists(key: String, field: String, cb: Callback[Double]): R = js.native
    
    /**
      * Get the value of a hash field.
      */
    def hget(key: String, field: String): R = js.native
    def hget(key: String, field: String, cb: Callback[String]): R = js.native
    
    /**
      * Get all fields and values in a hash.
      */
    def hgetall(key: String): R = js.native
    def hgetall(key: String, cb: Callback[StringDictionary[String]]): R = js.native
    
    /**
      * Increment the integer value of a hash field by the given number.
      */
    def hincrby(key: String, field: String, increment: Double): R = js.native
    def hincrby(key: String, field: String, increment: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Increment the float value of a hash field by the given amount.
      */
    def hincrbyfloat(key: String, field: String, increment: Double): R = js.native
    def hincrbyfloat(key: String, field: String, increment: Double, cb: Callback[String]): R = js.native
    
    /**
      * Get all the fields of a hash.
      */
    def hkeys(key: String): R = js.native
    def hkeys(key: String, cb: Callback[js.Array[String]]): R = js.native
    
    /**
      * Get the number of fields in a hash.
      */
    def hlen(key: String): R = js.native
    def hlen(key: String, cb: Callback[Double]): R = js.native
    
    /**
      * Get the values of all the given hash fields.
      */
    def hmget(args: (String | Callback[js.Array[String]])*): R = js.native
    /**
      * Get the values of all the given hash fields.
      */
    def hmget(key: String, arg1: String): R = js.native
    /**
      * Get the values of all the given hash fields.
      */
    def hmget(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Get the values of all the given hash fields.
      */
    def hmget(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Get the values of all the given hash fields.
      */
    def hmget(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Get the values of all the given hash fields.
      */
    def hmget(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Get the values of all the given hash fields.
      */
    def hmget(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def hmget(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def hmget(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def hmget(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def hmget(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[js.Array[String]]): R = js.native
    def hmget(key: String, arg1: String, arg2: String, cb: Callback[js.Array[String]]): R = js.native
    def hmget(key: String, arg1: String, cb: Callback[js.Array[String]]): R = js.native
    def hmget(key: String, arg1: js.Array[String]): R = js.native
    def hmget(key: String, arg1: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    /**
      * Get the values of all the given hash fields.
      */
    def hmget(key: String, args: (String | Callback[js.Array[String]])*): R = js.native
    /**
      * Get the values of all the given hash fields.
      */
    @JSName("hmget")
    var hmget_Original: OverloadedKeyCommand[String, js.Array[String], R] = js.native
    
    /**
      * Set multiple hash fields to multiple values.
      */
    def hmset(args: Array[String | Double]): R = js.native
    /**
      * Set multiple hash fields to multiple values.
      */
    def hmset(key: String, arg1: String | Double): R = js.native
    /**
      * Set multiple hash fields to multiple values.
      */
    def hmset(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Set multiple hash fields to multiple values.
      */
    def hmset(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Set multiple hash fields to multiple values.
      */
    def hmset(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def hmset(key: String, arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def hmset(key: String, arg1: String, arg2: String, arg3: Double): R = js.native
    def hmset(key: String, arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def hmset(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def hmset(key: String, arg1: String, arg2: Double): R = js.native
    def hmset(key: String, arg1: String, arg2: Double, arg3: String): R = js.native
    def hmset(key: String, arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def hmset(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def hmset(key: String, arg1: String, arg2: Double, arg3: Double): R = js.native
    def hmset(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def hmset(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def hmset(key: String, arg1: js.Array[String | Double]): R = js.native
    def hmset(key: String, arg1: StringDictionary[String | Double]): R = js.native
    def hmset(key: String, arg1: Double, arg2: String): R = js.native
    def hmset(key: String, arg1: Double, arg2: String, arg3: String): R = js.native
    def hmset(key: String, arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def hmset(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def hmset(key: String, arg1: Double, arg2: String, arg3: Double): R = js.native
    def hmset(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def hmset(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def hmset(key: String, arg1: Double, arg2: Double): R = js.native
    def hmset(key: String, arg1: Double, arg2: Double, arg3: String): R = js.native
    def hmset(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def hmset(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def hmset(key: String, arg1: Double, arg2: Double, arg3: Double): R = js.native
    def hmset(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def hmset(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    @JSName("hmset")
    def hmset_OK(args: Array[String | Double], cb: Callback[OK]): R = js.native
    /**
      * Set multiple hash fields to multiple values.
      */
    @JSName("hmset")
    def hmset_OK(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[OK]]
    ): R = js.native
    /**
      * Set multiple hash fields to multiple values.
      */
    @JSName("hmset")
    def hmset_OK(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[OK]]
    ): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String | Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: String, arg3: Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: Double, arg3: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: Double, arg3: Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: String, arg2: Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: js.Array[String | Double], cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: StringDictionary[String | Double], cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: String, arg3: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: String, arg3: Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: Double, arg3: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: Double, arg3: Double, cb: Callback[OK]): R = js.native
    @JSName("hmset")
    def hmset_OK(key: String, arg1: Double, arg2: Double, cb: Callback[OK]): R = js.native
    /**
      * Set multiple hash fields to multiple values.
      */
    @JSName("hmset")
    def hmset_OK(key: String, args: (String | Double | Callback[OK])*): R = js.native
    /**
      * Set multiple hash fields to multiple values.
      */
    @JSName("hmset")
    var hmset_Original: OverloadedSetCommand[String | Double, OK, R] = js.native
    
    /**
      * Incrementally iterate hash fields and associated values.
      */
    def hscan(args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    /**
      * Incrementally iterate hash fields and associated values.
      */
    def hscan(key: String, arg1: String): R = js.native
    /**
      * Incrementally iterate hash fields and associated values.
      */
    def hscan(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Incrementally iterate hash fields and associated values.
      */
    def hscan(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Incrementally iterate hash fields and associated values.
      */
    def hscan(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Incrementally iterate hash fields and associated values.
      */
    def hscan(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Incrementally iterate hash fields and associated values.
      */
    def hscan(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def hscan(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def hscan(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def hscan(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def hscan(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def hscan(key: String, arg1: String, arg2: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def hscan(key: String, arg1: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def hscan(key: String, arg1: js.Array[String]): R = js.native
    def hscan(key: String, arg1: js.Array[String], cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    /**
      * Incrementally iterate hash fields and associated values.
      */
    def hscan(key: String, args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    /**
      * Incrementally iterate hash fields and associated values.
      */
    @JSName("hscan")
    var hscan_Original: OverloadedKeyCommand[String, js.Tuple2[String, js.Array[String]], R] = js.native
    
    /**
      * Set the string value of a hash field.
      */
    def hset(args: Array[String]): R = js.native
    def hset(args: Array[String], cb: Callback[Double]): R = js.native
    /**
      * Set the string value of a hash field.
      */
    def hset(key: String, arg1: String): R = js.native
    /**
      * Set the string value of a hash field.
      */
    def hset(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Set the string value of a hash field.
      */
    def hset(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Set the string value of a hash field.
      */
    def hset(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Set the string value of a hash field.
      */
    def hset(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Set the string value of a hash field.
      */
    def hset(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def hset(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def hset(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def hset(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def hset(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def hset(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def hset(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def hset(key: String, arg1: js.Array[String]): R = js.native
    def hset(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    def hset(key: String, arg1: StringDictionary[String]): R = js.native
    def hset(key: String, arg1: StringDictionary[String], cb: Callback[Double]): R = js.native
    /**
      * Set the string value of a hash field.
      */
    def hset(key: String, args: (String | Callback[Double])*): R = js.native
    /**
      * Set the string value of a hash field.
      */
    @JSName("hset")
    var hset_Original: OverloadedSetCommand[String, Double, R] = js.native
    
    /**
      * Set the value of a hash field, only if the field does not exist.
      */
    def hsetnx(key: String, field: String, value: String): R = js.native
    def hsetnx(key: String, field: String, value: String, cb: Callback[Double]): R = js.native
    
    /**
      * Get the length of the value of a hash field.
      */
    def hstrlen(key: String, field: String): R = js.native
    def hstrlen(key: String, field: String, cb: Callback[Double]): R = js.native
    
    /**
      * Get all the values of a hash.
      */
    def hvals(key: String): R = js.native
    def hvals(key: String, cb: Callback[js.Array[String]]): R = js.native
    
    /**
      * Increment the integer value of a key by one.
      */
    def incr(key: String): R = js.native
    def incr(key: String, cb: Callback[Double]): R = js.native
    
    /**
      * Increment the integer value of a key by the given amount.
      */
    def incrby(key: String, increment: Double): R = js.native
    def incrby(key: String, increment: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Increment the float value of a key by the given amount.
      */
    def incrbyfloat(key: String, increment: Double): R = js.native
    def incrbyfloat(key: String, increment: Double, cb: Callback[String]): R = js.native
    
    /**
      * Get information and statistics about the server.
      */
    def info(): R = js.native
    def info(cb: Callback[ServerInfo]): R = js.native
    def info(section: js.UndefOr[scala.Nothing], cb: Callback[ServerInfo]): R = js.native
    def info(section: String): R = js.native
    def info(section: String, cb: Callback[ServerInfo]): R = js.native
    def info(section: js.Array[String]): R = js.native
    def info(section: js.Array[String], cb: Callback[ServerInfo]): R = js.native
    
    /**
      * Find all keys matching the given pattern.
      */
    def keys(pattern: String): R = js.native
    def keys(pattern: String, cb: Callback[js.Array[String]]): R = js.native
    
    /**
      * Get the UNIX time stamp of the last successful save to disk.
      */
    def lastsave(): R = js.native
    def lastsave(cb: Callback[Double]): R = js.native
    
    /**
      * Get an element from a list by its index.
      */
    def lindex(key: String, index: Double): R = js.native
    def lindex(key: String, index: Double, cb: Callback[String]): R = js.native
    
    @JSName("linsert")
    def linsert_AFTER(key: String, dir: AFTER, pivot: String, value: String): R = js.native
    @JSName("linsert")
    def linsert_AFTER(key: String, dir: AFTER, pivot: String, value: String, cb: Callback[String]): R = js.native
    /**
      * Insert an element before or after another element in a list.
      */
    @JSName("linsert")
    def linsert_BEFORE(key: String, dir: BEFORE, pivot: String, value: String): R = js.native
    @JSName("linsert")
    def linsert_BEFORE(key: String, dir: BEFORE, pivot: String, value: String, cb: Callback[String]): R = js.native
    
    /**
      * Get the length of a list.
      */
    def llen(key: String): R = js.native
    def llen(key: String, cb: Callback[Double]): R = js.native
    
    /**
      * Remove and get the first element in a list.
      */
    def lpop(key: String): R = js.native
    def lpop(key: String, cb: Callback[String]): R = js.native
    
    /**
      * Prepend one or multiple values to a list.
      */
    def lpush(args: (String | Callback[Double])*): R = js.native
    /**
      * Prepend one or multiple values to a list.
      */
    def lpush(key: String, arg1: String): R = js.native
    /**
      * Prepend one or multiple values to a list.
      */
    def lpush(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Prepend one or multiple values to a list.
      */
    def lpush(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Prepend one or multiple values to a list.
      */
    def lpush(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Prepend one or multiple values to a list.
      */
    def lpush(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Prepend one or multiple values to a list.
      */
    def lpush(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def lpush(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def lpush(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def lpush(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def lpush(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def lpush(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def lpush(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def lpush(key: String, arg1: js.Array[String]): R = js.native
    def lpush(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Prepend one or multiple values to a list.
      */
    def lpush(key: String, args: (String | Callback[Double])*): R = js.native
    /**
      * Prepend one or multiple values to a list.
      */
    @JSName("lpush")
    var lpush_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    /**
      * Prepend a value to a list, only if the list exists.
      */
    def lpushx(key: String, value: String): R = js.native
    def lpushx(key: String, value: String, cb: Callback[Double]): R = js.native
    
    /**
      * Get a range of elements from a list.
      */
    def lrange(key: String, start: Double, stop: Double): R = js.native
    def lrange(key: String, start: Double, stop: Double, cb: Callback[js.Array[String]]): R = js.native
    
    /**
      * Remove elements from a list.
      */
    def lrem(key: String, count: Double, value: String): R = js.native
    def lrem(key: String, count: Double, value: String, cb: Callback[Double]): R = js.native
    
    /**
      * Set the value of an element in a list by its index.
      */
    def lset(key: String, index: Double, value: String): R = js.native
    @JSName("lset")
    def lset_OK(key: String, index: Double, value: String, cb: Callback[OK]): R = js.native
    
    /**
      * Trim a list to the specified range.
      */
    def ltrim(key: String, start: Double, stop: Double): R = js.native
    @JSName("ltrim")
    def ltrim_OK(key: String, start: Double, stop: Double, cb: Callback[OK]): R = js.native
    
    /**
      * Get the values of all given keys.
      */
    def mget(arg1: String): R = js.native
    /**
      * Get the values of all given keys.
      */
    def mget(arg1: String, arg2: String): R = js.native
    /**
      * Get the values of all given keys.
      */
    def mget(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Get the values of all given keys.
      */
    def mget(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Get the values of all given keys.
      */
    def mget(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Get the values of all given keys.
      */
    def mget(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def mget(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def mget(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def mget(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[js.Array[String]]): R = js.native
    def mget(arg1: String, arg2: String, arg3: String, cb: Callback[js.Array[String]]): R = js.native
    def mget(arg1: String, arg2: String, cb: Callback[js.Array[String]]): R = js.native
    def mget(arg1: String, arg2: js.Array[String]): R = js.native
    def mget(arg1: String, arg2: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def mget(arg1: String, cb: Callback[js.Array[String]]): R = js.native
    def mget(arg1: js.Array[String]): R = js.native
    def mget(arg1: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    /**
      * Get the values of all given keys.
      */
    def mget(args: (String | Callback[js.Array[String]])*): R = js.native
    /**
      * Get the values of all given keys.
      */
    @JSName("mget")
    var mget_Original: OverloadedCommand[String, js.Array[String], R] = js.native
    
    /**
      * Atomically tranfer a key from a Redis instance to another one.
      */
    def migrate(arg1: String): R = js.native
    /**
      * Atomically tranfer a key from a Redis instance to another one.
      */
    def migrate(arg1: String, arg2: String): R = js.native
    /**
      * Atomically tranfer a key from a Redis instance to another one.
      */
    def migrate(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Atomically tranfer a key from a Redis instance to another one.
      */
    def migrate(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Atomically tranfer a key from a Redis instance to another one.
      */
    def migrate(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Atomically tranfer a key from a Redis instance to another one.
      */
    def migrate(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def migrate(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Boolean]
    ): R = js.native
    def migrate(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Boolean]): R = js.native
    def migrate(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Boolean]): R = js.native
    def migrate(arg1: String, arg2: String, arg3: String, cb: Callback[Boolean]): R = js.native
    def migrate(arg1: String, arg2: String, cb: Callback[Boolean]): R = js.native
    def migrate(arg1: String, arg2: js.Array[String]): R = js.native
    def migrate(arg1: String, arg2: js.Array[String], cb: Callback[Boolean]): R = js.native
    def migrate(arg1: String, cb: Callback[Boolean]): R = js.native
    def migrate(arg1: js.Array[String]): R = js.native
    def migrate(arg1: js.Array[String], cb: Callback[Boolean]): R = js.native
    /**
      * Atomically tranfer a key from a Redis instance to another one.
      */
    def migrate(args: (String | Callback[Boolean])*): R = js.native
    /**
      * Atomically tranfer a key from a Redis instance to another one.
      */
    @JSName("migrate")
    var migrate_Original: OverloadedCommand[String, Boolean, R] = js.native
    
    /**
      * Listen for all requests received by the server in real time.
      */
    def monitor(): R = js.native
    def monitor(cb: Callback[js.UndefOr[scala.Nothing]]): R = js.native
    
    /**
      * Move a key to another database.
      */
    def move(key: String, db: String): R = js.native
    def move(key: String, db: Double): R = js.native
    
    /**
      * Set multiple keys to multiple values.
      */
    def mset(arg1: String): R = js.native
    /**
      * Set multiple keys to multiple values.
      */
    def mset(arg1: String, arg2: String): R = js.native
    /**
      * Set multiple keys to multiple values.
      */
    def mset(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Set multiple keys to multiple values.
      */
    def mset(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Set multiple keys to multiple values.
      */
    def mset(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Set multiple keys to multiple values.
      */
    def mset(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def mset(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Boolean]
    ): R = js.native
    def mset(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Boolean]): R = js.native
    def mset(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Boolean]): R = js.native
    def mset(arg1: String, arg2: String, arg3: String, cb: Callback[Boolean]): R = js.native
    def mset(arg1: String, arg2: String, cb: Callback[Boolean]): R = js.native
    def mset(arg1: String, arg2: js.Array[String]): R = js.native
    def mset(arg1: String, arg2: js.Array[String], cb: Callback[Boolean]): R = js.native
    def mset(arg1: String, cb: Callback[Boolean]): R = js.native
    def mset(arg1: js.Array[String]): R = js.native
    def mset(arg1: js.Array[String], cb: Callback[Boolean]): R = js.native
    /**
      * Set multiple keys to multiple values.
      */
    def mset(args: (String | Callback[Boolean])*): R = js.native
    /**
      * Set multiple keys to multiple values.
      */
    @JSName("mset")
    var mset_Original: OverloadedCommand[String, Boolean, R] = js.native
    
    /**
      * Set multiple keys to multiple values, only if none of the keys exist.
      */
    def msetnx(arg1: String): R = js.native
    /**
      * Set multiple keys to multiple values, only if none of the keys exist.
      */
    def msetnx(arg1: String, arg2: String): R = js.native
    /**
      * Set multiple keys to multiple values, only if none of the keys exist.
      */
    def msetnx(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Set multiple keys to multiple values, only if none of the keys exist.
      */
    def msetnx(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Set multiple keys to multiple values, only if none of the keys exist.
      */
    def msetnx(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Set multiple keys to multiple values, only if none of the keys exist.
      */
    def msetnx(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def msetnx(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Boolean]
    ): R = js.native
    def msetnx(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Boolean]): R = js.native
    def msetnx(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Boolean]): R = js.native
    def msetnx(arg1: String, arg2: String, arg3: String, cb: Callback[Boolean]): R = js.native
    def msetnx(arg1: String, arg2: String, cb: Callback[Boolean]): R = js.native
    def msetnx(arg1: String, arg2: js.Array[String]): R = js.native
    def msetnx(arg1: String, arg2: js.Array[String], cb: Callback[Boolean]): R = js.native
    def msetnx(arg1: String, cb: Callback[Boolean]): R = js.native
    def msetnx(arg1: js.Array[String]): R = js.native
    def msetnx(arg1: js.Array[String], cb: Callback[Boolean]): R = js.native
    /**
      * Set multiple keys to multiple values, only if none of the keys exist.
      */
    def msetnx(args: (String | Callback[Boolean])*): R = js.native
    /**
      * Set multiple keys to multiple values, only if none of the keys exist.
      */
    @JSName("msetnx")
    var msetnx_Original: OverloadedCommand[String, Boolean, R] = js.native
    
    /**
      * Inspect the internals of Redis objects.
      */
    def `object`(arg1: String): R = js.native
    /**
      * Inspect the internals of Redis objects.
      */
    def `object`(arg1: String, arg2: String): R = js.native
    /**
      * Inspect the internals of Redis objects.
      */
    def `object`(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Inspect the internals of Redis objects.
      */
    def `object`(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Inspect the internals of Redis objects.
      */
    def `object`(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Inspect the internals of Redis objects.
      */
    def `object`(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def `object`(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[_]
    ): R = js.native
    def `object`(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[_]): R = js.native
    def `object`(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def `object`(arg1: String, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def `object`(arg1: String, arg2: String, cb: Callback[_]): R = js.native
    def `object`(arg1: String, arg2: js.Array[String]): R = js.native
    def `object`(arg1: String, arg2: js.Array[String], cb: Callback[_]): R = js.native
    def `object`(arg1: String, cb: Callback[_]): R = js.native
    def `object`(arg1: js.Array[String]): R = js.native
    def `object`(arg1: js.Array[String], cb: Callback[_]): R = js.native
    /**
      * Inspect the internals of Redis objects.
      */
    def `object`(args: (String | Callback[_])*): R = js.native
    /**
      * Inspect the internals of Redis objects.
      */
    @JSName("object")
    var object_Original: OverloadedCommand[String, _, R] = js.native
    
    /**
      * Remove the expiration from a key.
      */
    def persist(key: String): R = js.native
    def persist(key: String, cb: Callback[Double]): R = js.native
    
    /**
      * Remove a key's time to live in milliseconds.
      */
    def pexpire(key: String, milliseconds: Double): R = js.native
    def pexpire(key: String, milliseconds: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Set the expiration for a key as a UNIX timestamp specified in milliseconds.
      */
    def pexpireat(key: String, millisecondsTimestamp: Double): R = js.native
    def pexpireat(key: String, millisecondsTimestamp: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Adds the specified elements to the specified HyperLogLog.
      */
    def pfadd(args: (String | Callback[Double])*): R = js.native
    /**
      * Adds the specified elements to the specified HyperLogLog.
      */
    def pfadd(key: String, arg1: String): R = js.native
    /**
      * Adds the specified elements to the specified HyperLogLog.
      */
    def pfadd(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Adds the specified elements to the specified HyperLogLog.
      */
    def pfadd(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Adds the specified elements to the specified HyperLogLog.
      */
    def pfadd(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Adds the specified elements to the specified HyperLogLog.
      */
    def pfadd(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Adds the specified elements to the specified HyperLogLog.
      */
    def pfadd(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def pfadd(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def pfadd(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def pfadd(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def pfadd(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def pfadd(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def pfadd(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def pfadd(key: String, arg1: js.Array[String]): R = js.native
    def pfadd(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Adds the specified elements to the specified HyperLogLog.
      */
    def pfadd(key: String, args: (String | Callback[Double])*): R = js.native
    /**
      * Adds the specified elements to the specified HyperLogLog.
      */
    @JSName("pfadd")
    var pfadd_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    /**
      * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
      */
    def pfcount(arg1: String): R = js.native
    /**
      * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
      */
    def pfcount(arg1: String, arg2: String): R = js.native
    /**
      * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
      */
    def pfcount(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
      */
    def pfcount(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
      */
    def pfcount(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
      */
    def pfcount(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def pfcount(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def pfcount(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def pfcount(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def pfcount(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def pfcount(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def pfcount(arg1: String, arg2: js.Array[String]): R = js.native
    def pfcount(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def pfcount(arg1: String, cb: Callback[Double]): R = js.native
    def pfcount(arg1: js.Array[String]): R = js.native
    def pfcount(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
      */
    def pfcount(args: (String | Callback[Double])*): R = js.native
    /**
      * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
      */
    @JSName("pfcount")
    var pfcount_Original: OverloadedCommand[String, Double, R] = js.native
    
    /**
      * Merge N different HyperLogLogs into a single one.
      */
    def pfmerge(arg1: String): R = js.native
    /**
      * Merge N different HyperLogLogs into a single one.
      */
    def pfmerge(arg1: String, arg2: String): R = js.native
    /**
      * Merge N different HyperLogLogs into a single one.
      */
    def pfmerge(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Merge N different HyperLogLogs into a single one.
      */
    def pfmerge(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Merge N different HyperLogLogs into a single one.
      */
    def pfmerge(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Merge N different HyperLogLogs into a single one.
      */
    def pfmerge(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def pfmerge(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Boolean]
    ): R = js.native
    def pfmerge(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Boolean]): R = js.native
    def pfmerge(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Boolean]): R = js.native
    def pfmerge(arg1: String, arg2: String, arg3: String, cb: Callback[Boolean]): R = js.native
    def pfmerge(arg1: String, arg2: String, cb: Callback[Boolean]): R = js.native
    def pfmerge(arg1: String, arg2: js.Array[String]): R = js.native
    def pfmerge(arg1: String, arg2: js.Array[String], cb: Callback[Boolean]): R = js.native
    def pfmerge(arg1: String, cb: Callback[Boolean]): R = js.native
    def pfmerge(arg1: js.Array[String]): R = js.native
    def pfmerge(arg1: js.Array[String], cb: Callback[Boolean]): R = js.native
    /**
      * Merge N different HyperLogLogs into a single one.
      */
    def pfmerge(args: (String | Callback[Boolean])*): R = js.native
    /**
      * Merge N different HyperLogLogs into a single one.
      */
    @JSName("pfmerge")
    var pfmerge_Original: OverloadedCommand[String, Boolean, R] = js.native
    
    /**
      * Ping the server.
      */
    def ping(): R = js.native
    def ping(callback: Callback[String]): R = js.native
    def ping(message: String): R = js.native
    def ping(message: String, callback: Callback[String]): R = js.native
    
    /**
      * Set the value and expiration in milliseconds of a key.
      */
    def psetex(key: String, milliseconds: Double, value: String): R = js.native
    @JSName("psetex")
    def psetex_OK(key: String, milliseconds: Double, value: String, cb: Callback[OK]): R = js.native
    
    /**
      * Listen for messages published to channels matching the given patterns.
      */
    def psubscribe(arg1: String): R = js.native
    /**
      * Listen for messages published to channels matching the given patterns.
      */
    def psubscribe(arg1: String, arg2: String): R = js.native
    /**
      * Listen for messages published to channels matching the given patterns.
      */
    def psubscribe(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Listen for messages published to channels matching the given patterns.
      */
    def psubscribe(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Listen for messages published to channels matching the given patterns.
      */
    def psubscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Listen for messages published to channels matching the given patterns.
      */
    def psubscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def psubscribe(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def psubscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[String]): R = js.native
    def psubscribe(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def psubscribe(arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def psubscribe(arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def psubscribe(arg1: String, cb: Callback[String]): R = js.native
    def psubscribe(arg1: js.Array[String]): R = js.native
    def psubscribe(arg1: js.Array[String], cb: Callback[String]): R = js.native
    /**
      * Listen for messages published to channels matching the given patterns.
      */
    def psubscribe(args: (String | Callback[String])*): R = js.native
    /**
      * Listen for messages published to channels matching the given patterns.
      */
    @JSName("psubscribe")
    var psubscribe_Original: OverloadedListCommand[String, String, R] = js.native
    
    /**
      * Get the time to live for a key in milliseconds.
      */
    def pttl(key: String): R = js.native
    def pttl(key: String, cb: Callback[Double]): R = js.native
    
    /**
      * Post a message to a channel.
      */
    def publish(channel: String, value: String): R = js.native
    def publish(channel: String, value: String, cb: Callback[Double]): R = js.native
    
    /**
      * Inspect the state of the Pub/Sub subsytem.
      */
    def pubsub(arg1: String): R = js.native
    /**
      * Inspect the state of the Pub/Sub subsytem.
      */
    def pubsub(arg1: String, arg2: String): R = js.native
    /**
      * Inspect the state of the Pub/Sub subsytem.
      */
    def pubsub(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Inspect the state of the Pub/Sub subsytem.
      */
    def pubsub(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Inspect the state of the Pub/Sub subsytem.
      */
    def pubsub(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Inspect the state of the Pub/Sub subsytem.
      */
    def pubsub(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def pubsub(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def pubsub(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def pubsub(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def pubsub(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def pubsub(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def pubsub(arg1: String, arg2: js.Array[String]): R = js.native
    def pubsub(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def pubsub(arg1: String, cb: Callback[Double]): R = js.native
    def pubsub(arg1: js.Array[String]): R = js.native
    def pubsub(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Inspect the state of the Pub/Sub subsytem.
      */
    def pubsub(args: (String | Callback[Double])*): R = js.native
    /**
      * Inspect the state of the Pub/Sub subsytem.
      */
    @JSName("pubsub")
    var pubsub_Original: OverloadedCommand[String, Double, R] = js.native
    
    /**
      * Stop listening for messages posted to channels matching the given patterns.
      */
    def punsubscribe(arg1: String): R = js.native
    /**
      * Stop listening for messages posted to channels matching the given patterns.
      */
    def punsubscribe(arg1: String, arg2: String): R = js.native
    /**
      * Stop listening for messages posted to channels matching the given patterns.
      */
    def punsubscribe(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Stop listening for messages posted to channels matching the given patterns.
      */
    def punsubscribe(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Stop listening for messages posted to channels matching the given patterns.
      */
    def punsubscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Stop listening for messages posted to channels matching the given patterns.
      */
    def punsubscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def punsubscribe(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def punsubscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[String]): R = js.native
    def punsubscribe(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def punsubscribe(arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def punsubscribe(arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def punsubscribe(arg1: String, cb: Callback[String]): R = js.native
    def punsubscribe(arg1: js.Array[String]): R = js.native
    def punsubscribe(arg1: js.Array[String], cb: Callback[String]): R = js.native
    /**
      * Stop listening for messages posted to channels matching the given patterns.
      */
    def punsubscribe(args: (String | Callback[String])*): R = js.native
    /**
      * Stop listening for messages posted to channels matching the given patterns.
      */
    @JSName("punsubscribe")
    var punsubscribe_Original: OverloadedListCommand[String, String, R] = js.native
    
    /**
      * Close the connection.
      */
    def quit(): R = js.native
    @JSName("quit")
    def quit_OK(cb: Callback[OK]): R = js.native
    
    /**
      * Return a random key from the keyspace.
      */
    def randomkey(): R = js.native
    def randomkey(cb: Callback[String]): R = js.native
    
    /**
      * Enables read queries for a connection to a cluster slave node.
      */
    def readonly(): R = js.native
    def readonly(cb: Callback[String]): R = js.native
    
    /**
      * Disables read queries for a connection to cluster slave node.
      */
    def readwrite(): R = js.native
    def readwrite(cb: Callback[String]): R = js.native
    
    /**
      * Rename a key.
      */
    def rename(key: String, newkey: String): R = js.native
    @JSName("rename")
    def rename_OK(key: String, newkey: String, cb: Callback[OK]): R = js.native
    
    /**
      * Rename a key, only if the new key does not exist.
      */
    def renamenx(key: String, newkey: String): R = js.native
    def renamenx(key: String, newkey: String, cb: Callback[Double]): R = js.native
    
    /**
      * Create a key using the provided serialized value, previously obtained using DUMP.
      */
    def restore(key: String, ttl: Double, serializedValue: String): R = js.native
    @JSName("restore")
    def restore_OK(key: String, ttl: Double, serializedValue: String, cb: Callback[OK]): R = js.native
    
    /**
      * Return the role of the instance in the context of replication.
      */
    def role(): R = js.native
    def role(cb: Callback[js.Tuple3[String, Double, js.Array[js.Tuple3[String, String, String]]]]): R = js.native
    
    /**
      * Remove and get the last element in a list.
      */
    def rpop(key: String): R = js.native
    def rpop(key: String, cb: Callback[String]): R = js.native
    
    /**
      * Remove the last element in a list, prepend it to another list and return it.
      */
    def rpoplpush(source: String, destination: String): R = js.native
    def rpoplpush(source: String, destination: String, cb: Callback[String]): R = js.native
    
    /**
      * Append one or multiple values to a list.
      */
    def rpush(args: (String | Callback[Double])*): R = js.native
    /**
      * Append one or multiple values to a list.
      */
    def rpush(key: String, arg1: String): R = js.native
    /**
      * Append one or multiple values to a list.
      */
    def rpush(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Append one or multiple values to a list.
      */
    def rpush(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Append one or multiple values to a list.
      */
    def rpush(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Append one or multiple values to a list.
      */
    def rpush(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Append one or multiple values to a list.
      */
    def rpush(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def rpush(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def rpush(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def rpush(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def rpush(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def rpush(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def rpush(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def rpush(key: String, arg1: js.Array[String]): R = js.native
    def rpush(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Append one or multiple values to a list.
      */
    def rpush(key: String, args: (String | Callback[Double])*): R = js.native
    /**
      * Append one or multiple values to a list.
      */
    @JSName("rpush")
    var rpush_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    /**
      * Append a value to a list, only if the list exists.
      */
    def rpushx(key: String, value: String): R = js.native
    def rpushx(key: String, value: String, cb: Callback[Double]): R = js.native
    
    /**
      * Append one or multiple members to a set.
      */
    def sadd(args: (String | Callback[Double])*): R = js.native
    /**
      * Append one or multiple members to a set.
      */
    def sadd(key: String, arg1: String): R = js.native
    /**
      * Append one or multiple members to a set.
      */
    def sadd(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Append one or multiple members to a set.
      */
    def sadd(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Append one or multiple members to a set.
      */
    def sadd(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Append one or multiple members to a set.
      */
    def sadd(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Append one or multiple members to a set.
      */
    def sadd(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def sadd(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def sadd(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def sadd(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def sadd(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def sadd(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def sadd(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def sadd(key: String, arg1: js.Array[String]): R = js.native
    def sadd(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Append one or multiple members to a set.
      */
    def sadd(key: String, args: (String | Callback[Double])*): R = js.native
    /**
      * Append one or multiple members to a set.
      */
    @JSName("sadd")
    var sadd_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    /**
      * Synchronously save the dataset to disk.
      */
    def save(): R = js.native
    def save(cb: Callback[String]): R = js.native
    
    /**
      * Incrementally iterate the keys space.
      */
    def scan(arg1: String): R = js.native
    /**
      * Incrementally iterate the keys space.
      */
    def scan(arg1: String, arg2: String): R = js.native
    /**
      * Incrementally iterate the keys space.
      */
    def scan(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Incrementally iterate the keys space.
      */
    def scan(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Incrementally iterate the keys space.
      */
    def scan(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Incrementally iterate the keys space.
      */
    def scan(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def scan(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def scan(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def scan(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def scan(arg1: String, arg2: String, arg3: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def scan(arg1: String, arg2: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def scan(arg1: String, arg2: js.Array[String]): R = js.native
    def scan(arg1: String, arg2: js.Array[String], cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def scan(arg1: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def scan(arg1: js.Array[String]): R = js.native
    def scan(arg1: js.Array[String], cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    /**
      * Incrementally iterate the keys space.
      */
    def scan(args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    /**
      * Incrementally iterate the keys space.
      */
    @JSName("scan")
    var scan_Original: OverloadedCommand[String, js.Tuple2[String, js.Array[String]], R] = js.native
    
    /**
      * Get the number of members in a set.
      */
    def scard(key: String): R = js.native
    def scard(key: String, cb: Callback[Double]): R = js.native
    
    /**
      * DEBUG - Set the debug mode for executed scripts.
      * EXISTS - Check existence of scripts in the script cache.
      * FLUSH - Remove all scripts from the script cache.
      * KILL - Kill the script currently in execution.
      * LOAD - Load the specified Lua script into the script cache.
      */
    def script(arg1: String): R = js.native
    /**
      * DEBUG - Set the debug mode for executed scripts.
      * EXISTS - Check existence of scripts in the script cache.
      * FLUSH - Remove all scripts from the script cache.
      * KILL - Kill the script currently in execution.
      * LOAD - Load the specified Lua script into the script cache.
      */
    def script(arg1: String, arg2: String): R = js.native
    /**
      * DEBUG - Set the debug mode for executed scripts.
      * EXISTS - Check existence of scripts in the script cache.
      * FLUSH - Remove all scripts from the script cache.
      * KILL - Kill the script currently in execution.
      * LOAD - Load the specified Lua script into the script cache.
      */
    def script(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * DEBUG - Set the debug mode for executed scripts.
      * EXISTS - Check existence of scripts in the script cache.
      * FLUSH - Remove all scripts from the script cache.
      * KILL - Kill the script currently in execution.
      * LOAD - Load the specified Lua script into the script cache.
      */
    def script(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * DEBUG - Set the debug mode for executed scripts.
      * EXISTS - Check existence of scripts in the script cache.
      * FLUSH - Remove all scripts from the script cache.
      * KILL - Kill the script currently in execution.
      * LOAD - Load the specified Lua script into the script cache.
      */
    def script(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * DEBUG - Set the debug mode for executed scripts.
      * EXISTS - Check existence of scripts in the script cache.
      * FLUSH - Remove all scripts from the script cache.
      * KILL - Kill the script currently in execution.
      * LOAD - Load the specified Lua script into the script cache.
      */
    def script(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def script(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[_]
    ): R = js.native
    def script(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[_]): R = js.native
    def script(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[_]): R = js.native
    def script(arg1: String, arg2: String, arg3: String, cb: Callback[_]): R = js.native
    def script(arg1: String, arg2: String, cb: Callback[_]): R = js.native
    def script(arg1: String, arg2: js.Array[String]): R = js.native
    def script(arg1: String, arg2: js.Array[String], cb: Callback[_]): R = js.native
    def script(arg1: String, cb: Callback[_]): R = js.native
    def script(arg1: js.Array[String]): R = js.native
    def script(arg1: js.Array[String], cb: Callback[_]): R = js.native
    /**
      * DEBUG - Set the debug mode for executed scripts.
      * EXISTS - Check existence of scripts in the script cache.
      * FLUSH - Remove all scripts from the script cache.
      * KILL - Kill the script currently in execution.
      * LOAD - Load the specified Lua script into the script cache.
      */
    def script(args: (String | Callback[_])*): R = js.native
    /**
      * DEBUG - Set the debug mode for executed scripts.
      * EXISTS - Check existence of scripts in the script cache.
      * FLUSH - Remove all scripts from the script cache.
      * KILL - Kill the script currently in execution.
      * LOAD - Load the specified Lua script into the script cache.
      */
    @JSName("script")
    var script_Original: OverloadedCommand[String, _, R] = js.native
    
    /**
      * Subtract multiple sets.
      */
    def sdiff(arg1: String): R = js.native
    /**
      * Subtract multiple sets.
      */
    def sdiff(arg1: String, arg2: String): R = js.native
    /**
      * Subtract multiple sets.
      */
    def sdiff(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Subtract multiple sets.
      */
    def sdiff(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Subtract multiple sets.
      */
    def sdiff(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Subtract multiple sets.
      */
    def sdiff(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def sdiff(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def sdiff(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def sdiff(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[js.Array[String]]): R = js.native
    def sdiff(arg1: String, arg2: String, arg3: String, cb: Callback[js.Array[String]]): R = js.native
    def sdiff(arg1: String, arg2: String, cb: Callback[js.Array[String]]): R = js.native
    def sdiff(arg1: String, arg2: js.Array[String]): R = js.native
    def sdiff(arg1: String, arg2: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def sdiff(arg1: String, cb: Callback[js.Array[String]]): R = js.native
    def sdiff(arg1: js.Array[String]): R = js.native
    def sdiff(arg1: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    /**
      * Subtract multiple sets.
      */
    def sdiff(args: (String | Callback[js.Array[String]])*): R = js.native
    /**
      * Subtract multiple sets.
      */
    @JSName("sdiff")
    var sdiff_Original: OverloadedCommand[String, js.Array[String], R] = js.native
    
    /**
      * Subtract multiple sets and store the resulting set in a key.
      */
    def sdiffstore(args: (String | Callback[Double])*): R = js.native
    /**
      * Subtract multiple sets and store the resulting set in a key.
      */
    def sdiffstore(key: String, arg1: String): R = js.native
    /**
      * Subtract multiple sets and store the resulting set in a key.
      */
    def sdiffstore(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Subtract multiple sets and store the resulting set in a key.
      */
    def sdiffstore(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Subtract multiple sets and store the resulting set in a key.
      */
    def sdiffstore(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Subtract multiple sets and store the resulting set in a key.
      */
    def sdiffstore(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Subtract multiple sets and store the resulting set in a key.
      */
    def sdiffstore(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def sdiffstore(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def sdiffstore(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def sdiffstore(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def sdiffstore(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def sdiffstore(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def sdiffstore(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def sdiffstore(key: String, arg1: js.Array[String]): R = js.native
    def sdiffstore(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Subtract multiple sets and store the resulting set in a key.
      */
    def sdiffstore(key: String, args: (String | Callback[Double])*): R = js.native
    /**
      * Subtract multiple sets and store the resulting set in a key.
      */
    @JSName("sdiffstore")
    var sdiffstore_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    def select(index: String): R = js.native
    def select(index: String, cb: Callback[String]): R = js.native
    /**
      * Change the selected database for the current connection.
      */
    def select(index: Double): R = js.native
    def select(index: Double, cb: Callback[String]): R = js.native
    
    /**
      * Set the string value of a key.
      */
    def set(key: String, value: String): R = js.native
    def set(key: String, value: String, flag: String): R = js.native
    def set(key: String, value: String, flag: String, mode: String, duration: Double): R = js.native
    def set(key: String, value: String, mode: String, duration: Double): R = js.native
    def set(key: String, value: String, mode: String, duration: Double, flag: String): R = js.native
    @JSName("set")
    def set_OK(key: String, value: String, cb: Callback[OK]): R = js.native
    @JSName("set")
    def set_OK(key: String, value: String, flag: String, cb: Callback[OK]): R = js.native
    @JSName("set")
    def set_OK(
      key: String,
      value: String,
      flag: String,
      mode: String,
      duration: Double,
      cb: Callback[js.UndefOr[OK]]
    ): R = js.native
    @JSName("set")
    def set_OK(key: String, value: String, mode: String, duration: Double, cb: Callback[js.UndefOr[OK]]): R = js.native
    @JSName("set")
    def set_OK(
      key: String,
      value: String,
      mode: String,
      duration: Double,
      flag: String,
      cb: Callback[js.UndefOr[OK]]
    ): R = js.native
    
    /**
      * Sets or clears the bit at offset in the string value stored at key.
      */
    def setbit(key: String, offset: Double, value: String): R = js.native
    def setbit(key: String, offset: Double, value: String, cb: Callback[Double]): R = js.native
    
    /**
      * Set the value and expiration of a key.
      */
    def setex(key: String, seconds: Double, value: String): R = js.native
    def setex(key: String, seconds: Double, value: String, cb: Callback[String]): R = js.native
    
    /**
      * Set the value of a key, only if the key does not exist.
      */
    def setnx(key: String, value: String): R = js.native
    def setnx(key: String, value: String, cb: Callback[Double]): R = js.native
    
    /**
      * Overwrite part of a string at key starting at the specified offset.
      */
    def setrange(key: String, offset: Double, value: String): R = js.native
    def setrange(key: String, offset: Double, value: String, cb: Callback[Double]): R = js.native
    
    /**
      * Synchronously save the dataset to disk and then shut down the server.
      */
    def shutdown(arg1: String): R = js.native
    /**
      * Synchronously save the dataset to disk and then shut down the server.
      */
    def shutdown(arg1: String, arg2: String): R = js.native
    /**
      * Synchronously save the dataset to disk and then shut down the server.
      */
    def shutdown(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Synchronously save the dataset to disk and then shut down the server.
      */
    def shutdown(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Synchronously save the dataset to disk and then shut down the server.
      */
    def shutdown(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Synchronously save the dataset to disk and then shut down the server.
      */
    def shutdown(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def shutdown(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def shutdown(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[String]): R = js.native
    def shutdown(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def shutdown(arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def shutdown(arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def shutdown(arg1: String, arg2: js.Array[String]): R = js.native
    def shutdown(arg1: String, arg2: js.Array[String], cb: Callback[String]): R = js.native
    def shutdown(arg1: String, cb: Callback[String]): R = js.native
    def shutdown(arg1: js.Array[String]): R = js.native
    def shutdown(arg1: js.Array[String], cb: Callback[String]): R = js.native
    /**
      * Synchronously save the dataset to disk and then shut down the server.
      */
    def shutdown(args: (String | Callback[String])*): R = js.native
    /**
      * Synchronously save the dataset to disk and then shut down the server.
      */
    @JSName("shutdown")
    var shutdown_Original: OverloadedCommand[String, String, R] = js.native
    
    /**
      * Intersect multiple sets.
      */
    def sinter(args: (String | Callback[js.Array[String]])*): R = js.native
    /**
      * Intersect multiple sets.
      */
    def sinter(key: String, arg1: String): R = js.native
    /**
      * Intersect multiple sets.
      */
    def sinter(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Intersect multiple sets.
      */
    def sinter(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Intersect multiple sets.
      */
    def sinter(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Intersect multiple sets.
      */
    def sinter(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Intersect multiple sets.
      */
    def sinter(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def sinter(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def sinter(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def sinter(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def sinter(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[js.Array[String]]): R = js.native
    def sinter(key: String, arg1: String, arg2: String, cb: Callback[js.Array[String]]): R = js.native
    def sinter(key: String, arg1: String, cb: Callback[js.Array[String]]): R = js.native
    def sinter(key: String, arg1: js.Array[String]): R = js.native
    def sinter(key: String, arg1: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    /**
      * Intersect multiple sets.
      */
    def sinter(key: String, args: (String | Callback[js.Array[String]])*): R = js.native
    /**
      * Intersect multiple sets.
      */
    @JSName("sinter")
    var sinter_Original: OverloadedKeyCommand[String, js.Array[String], R] = js.native
    
    /**
      * Intersect multiple sets and store the resulting set in a key.
      */
    def sinterstore(arg1: String): R = js.native
    /**
      * Intersect multiple sets and store the resulting set in a key.
      */
    def sinterstore(arg1: String, arg2: String): R = js.native
    /**
      * Intersect multiple sets and store the resulting set in a key.
      */
    def sinterstore(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Intersect multiple sets and store the resulting set in a key.
      */
    def sinterstore(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Intersect multiple sets and store the resulting set in a key.
      */
    def sinterstore(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Intersect multiple sets and store the resulting set in a key.
      */
    def sinterstore(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def sinterstore(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def sinterstore(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def sinterstore(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def sinterstore(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def sinterstore(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def sinterstore(arg1: String, arg2: js.Array[String]): R = js.native
    def sinterstore(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def sinterstore(arg1: String, cb: Callback[Double]): R = js.native
    def sinterstore(arg1: js.Array[String]): R = js.native
    def sinterstore(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Intersect multiple sets and store the resulting set in a key.
      */
    def sinterstore(args: (String | Callback[Double])*): R = js.native
    /**
      * Intersect multiple sets and store the resulting set in a key.
      */
    @JSName("sinterstore")
    var sinterstore_Original: OverloadedCommand[String, Double, R] = js.native
    
    /**
      * Determine if a given value is a member of a set.
      */
    def sismember(key: String, member: String): R = js.native
    def sismember(key: String, member: String, cb: Callback[Double]): R = js.native
    
    /**
      * Make the server a slave of another instance, or promote it as master.
      */
    def slaveof(host: String, port: String): R = js.native
    def slaveof(host: String, port: String, cb: Callback[String]): R = js.native
    def slaveof(host: String, port: Double): R = js.native
    def slaveof(host: String, port: Double, cb: Callback[String]): R = js.native
    
    /**
      * Manages the Redis slow queries log.
      */
    def slowlog(arg1: String): R = js.native
    /**
      * Manages the Redis slow queries log.
      */
    def slowlog(arg1: String, arg2: String): R = js.native
    /**
      * Manages the Redis slow queries log.
      */
    def slowlog(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Manages the Redis slow queries log.
      */
    def slowlog(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Manages the Redis slow queries log.
      */
    def slowlog(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Manages the Redis slow queries log.
      */
    def slowlog(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def slowlog(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    def slowlog(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    def slowlog(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    def slowlog(
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    def slowlog(
      arg1: String,
      arg2: String,
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    def slowlog(arg1: String, arg2: js.Array[String]): R = js.native
    def slowlog(
      arg1: String,
      arg2: js.Array[String],
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    def slowlog(arg1: String, cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]): R = js.native
    def slowlog(arg1: js.Array[String]): R = js.native
    def slowlog(
      arg1: js.Array[String],
      cb: Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]
    ): R = js.native
    /**
      * Manages the Redis slow queries log.
      */
    def slowlog(args: (String | (Callback[js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]]]))*): R = js.native
    /**
      * Manages the Redis slow queries log.
      */
    @JSName("slowlog")
    var slowlog_Original: OverloadedCommand[String, js.Array[js.Tuple4[Double, Double, Double, js.Array[String]]], R] = js.native
    
    /**
      * Get all the members in a set.
      */
    def smembers(key: String): R = js.native
    def smembers(key: String, cb: Callback[js.Array[String]]): R = js.native
    
    /**
      * Move a member from one set to another.
      */
    def smove(source: String, destination: String, member: String): R = js.native
    def smove(source: String, destination: String, member: String, cb: Callback[Double]): R = js.native
    
    /**
      * Sort the elements in a list, set or sorted set.
      */
    def sort(arg1: String): R = js.native
    /**
      * Sort the elements in a list, set or sorted set.
      */
    def sort(arg1: String, arg2: String): R = js.native
    /**
      * Sort the elements in a list, set or sorted set.
      */
    def sort(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Sort the elements in a list, set or sorted set.
      */
    def sort(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Sort the elements in a list, set or sorted set.
      */
    def sort(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Sort the elements in a list, set or sorted set.
      */
    def sort(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def sort(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def sort(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def sort(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[js.Array[String]]): R = js.native
    def sort(arg1: String, arg2: String, arg3: String, cb: Callback[js.Array[String]]): R = js.native
    def sort(arg1: String, arg2: String, cb: Callback[js.Array[String]]): R = js.native
    def sort(arg1: String, arg2: js.Array[String]): R = js.native
    def sort(arg1: String, arg2: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def sort(arg1: String, cb: Callback[js.Array[String]]): R = js.native
    def sort(arg1: js.Array[String]): R = js.native
    def sort(arg1: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    /**
      * Sort the elements in a list, set or sorted set.
      */
    def sort(args: (String | Callback[js.Array[String]])*): R = js.native
    /**
      * Sort the elements in a list, set or sorted set.
      */
    @JSName("sort")
    var sort_Original: OverloadedCommand[String, js.Array[String], R] = js.native
    
    /**
      * Remove and return one or multiple random members from a set.
      */
    def spop(key: String): R = js.native
    def spop(key: String, cb: Callback[String]): R = js.native
    def spop(key: String, count: Double): R = js.native
    def spop(key: String, count: Double, cb: Callback[js.Array[String]]): R = js.native
    
    /**
      * Get one or multiple random members from a set.
      */
    def srandmember(key: String): R = js.native
    def srandmember(key: String, cb: Callback[String]): R = js.native
    def srandmember(key: String, count: Double): R = js.native
    def srandmember(key: String, count: Double, cb: Callback[js.Array[String]]): R = js.native
    
    /**
      * Remove one or more members from a set.
      */
    def srem(args: (String | Callback[Double])*): R = js.native
    /**
      * Remove one or more members from a set.
      */
    def srem(key: String, arg1: String): R = js.native
    /**
      * Remove one or more members from a set.
      */
    def srem(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Remove one or more members from a set.
      */
    def srem(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Remove one or more members from a set.
      */
    def srem(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Remove one or more members from a set.
      */
    def srem(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Remove one or more members from a set.
      */
    def srem(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def srem(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def srem(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def srem(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def srem(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def srem(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def srem(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def srem(key: String, arg1: js.Array[String]): R = js.native
    def srem(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Remove one or more members from a set.
      */
    def srem(key: String, args: (String | Callback[Double])*): R = js.native
    /**
      * Remove one or more members from a set.
      */
    @JSName("srem")
    var srem_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    /**
      * Incrementally iterate Set elements.
      */
    def sscan(args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    /**
      * Incrementally iterate Set elements.
      */
    def sscan(key: String, arg1: String): R = js.native
    /**
      * Incrementally iterate Set elements.
      */
    def sscan(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Incrementally iterate Set elements.
      */
    def sscan(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Incrementally iterate Set elements.
      */
    def sscan(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Incrementally iterate Set elements.
      */
    def sscan(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Incrementally iterate Set elements.
      */
    def sscan(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def sscan(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def sscan(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def sscan(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def sscan(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def sscan(key: String, arg1: String, arg2: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def sscan(key: String, arg1: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def sscan(key: String, arg1: js.Array[String]): R = js.native
    def sscan(key: String, arg1: js.Array[String], cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    /**
      * Incrementally iterate Set elements.
      */
    def sscan(key: String, args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    /**
      * Incrementally iterate Set elements.
      */
    @JSName("sscan")
    var sscan_Original: OverloadedKeyCommand[String, js.Tuple2[String, js.Array[String]], R] = js.native
    
    /**
      * Get the length of the value stored in a key.
      */
    def strlen(key: String): R = js.native
    def strlen(key: String, cb: Callback[Double]): R = js.native
    
    /**
      * Listen for messages published to the given channels.
      */
    def subscribe(arg1: String): R = js.native
    /**
      * Listen for messages published to the given channels.
      */
    def subscribe(arg1: String, arg2: String): R = js.native
    /**
      * Listen for messages published to the given channels.
      */
    def subscribe(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Listen for messages published to the given channels.
      */
    def subscribe(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Listen for messages published to the given channels.
      */
    def subscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Listen for messages published to the given channels.
      */
    def subscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def subscribe(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def subscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[String]): R = js.native
    def subscribe(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def subscribe(arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def subscribe(arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def subscribe(arg1: String, cb: Callback[String]): R = js.native
    def subscribe(arg1: js.Array[String]): R = js.native
    def subscribe(arg1: js.Array[String], cb: Callback[String]): R = js.native
    /**
      * Listen for messages published to the given channels.
      */
    def subscribe(args: (String | Callback[String])*): R = js.native
    /**
      * Listen for messages published to the given channels.
      */
    @JSName("subscribe")
    var subscribe_Original: OverloadedListCommand[String, String, R] = js.native
    
    /**
      * Add multiple sets.
      */
    def sunion(arg1: String): R = js.native
    /**
      * Add multiple sets.
      */
    def sunion(arg1: String, arg2: String): R = js.native
    /**
      * Add multiple sets.
      */
    def sunion(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Add multiple sets.
      */
    def sunion(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Add multiple sets.
      */
    def sunion(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Add multiple sets.
      */
    def sunion(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def sunion(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def sunion(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def sunion(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[js.Array[String]]): R = js.native
    def sunion(arg1: String, arg2: String, arg3: String, cb: Callback[js.Array[String]]): R = js.native
    def sunion(arg1: String, arg2: String, cb: Callback[js.Array[String]]): R = js.native
    def sunion(arg1: String, arg2: js.Array[String]): R = js.native
    def sunion(arg1: String, arg2: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    def sunion(arg1: String, cb: Callback[js.Array[String]]): R = js.native
    def sunion(arg1: js.Array[String]): R = js.native
    def sunion(arg1: js.Array[String], cb: Callback[js.Array[String]]): R = js.native
    /**
      * Add multiple sets.
      */
    def sunion(args: (String | Callback[js.Array[String]])*): R = js.native
    /**
      * Add multiple sets.
      */
    @JSName("sunion")
    var sunion_Original: OverloadedCommand[String, js.Array[String], R] = js.native
    
    /**
      * Add multiple sets and store the resulting set in a key.
      */
    def sunionstore(arg1: String): R = js.native
    /**
      * Add multiple sets and store the resulting set in a key.
      */
    def sunionstore(arg1: String, arg2: String): R = js.native
    /**
      * Add multiple sets and store the resulting set in a key.
      */
    def sunionstore(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Add multiple sets and store the resulting set in a key.
      */
    def sunionstore(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Add multiple sets and store the resulting set in a key.
      */
    def sunionstore(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Add multiple sets and store the resulting set in a key.
      */
    def sunionstore(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def sunionstore(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def sunionstore(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def sunionstore(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def sunionstore(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def sunionstore(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def sunionstore(arg1: String, arg2: js.Array[String]): R = js.native
    def sunionstore(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def sunionstore(arg1: String, cb: Callback[Double]): R = js.native
    def sunionstore(arg1: js.Array[String]): R = js.native
    def sunionstore(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Add multiple sets and store the resulting set in a key.
      */
    def sunionstore(args: (String | Callback[Double])*): R = js.native
    /**
      * Add multiple sets and store the resulting set in a key.
      */
    @JSName("sunionstore")
    var sunionstore_Original: OverloadedCommand[String, Double, R] = js.native
    
    /**
      * Internal command used for replication.
      */
    def sync(): R = js.native
    def sync(cb: Callback[js.UndefOr[scala.Nothing]]): R = js.native
    
    /**
      * Return the current server time.
      */
    def time(): R = js.native
    def time(cb: Callback[js.Tuple2[String, String]]): R = js.native
    
    /**
      * Get the time to live for a key.
      */
    def ttl(key: String): R = js.native
    def ttl(key: String, cb: Callback[Double]): R = js.native
    
    /**
      * Determine the type stored at key.
      */
    def `type`(key: String): R = js.native
    def `type`(key: String, cb: Callback[String]): R = js.native
    
    /**
      * Deletes a key in a non-blocking manner.
      * Very similar to DEL, but actual memory reclamation
      * happens in a different thread, making this non-blocking.
      */
    def unlink(arg1: String): R = js.native
    /**
      * Deletes a key in a non-blocking manner.
      * Very similar to DEL, but actual memory reclamation
      * happens in a different thread, making this non-blocking.
      */
    def unlink(arg1: String, arg2: String): R = js.native
    /**
      * Deletes a key in a non-blocking manner.
      * Very similar to DEL, but actual memory reclamation
      * happens in a different thread, making this non-blocking.
      */
    def unlink(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Deletes a key in a non-blocking manner.
      * Very similar to DEL, but actual memory reclamation
      * happens in a different thread, making this non-blocking.
      */
    def unlink(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Deletes a key in a non-blocking manner.
      * Very similar to DEL, but actual memory reclamation
      * happens in a different thread, making this non-blocking.
      */
    def unlink(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Deletes a key in a non-blocking manner.
      * Very similar to DEL, but actual memory reclamation
      * happens in a different thread, making this non-blocking.
      */
    def unlink(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def unlink(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def unlink(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): R = js.native
    def unlink(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def unlink(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def unlink(arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def unlink(arg1: String, arg2: js.Array[String]): R = js.native
    def unlink(arg1: String, arg2: js.Array[String], cb: Callback[Double]): R = js.native
    def unlink(arg1: String, cb: Callback[Double]): R = js.native
    def unlink(arg1: js.Array[String]): R = js.native
    def unlink(arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Deletes a key in a non-blocking manner.
      * Very similar to DEL, but actual memory reclamation
      * happens in a different thread, making this non-blocking.
      */
    def unlink(args: (String | Callback[Double])*): R = js.native
    /**
      * Deletes a key in a non-blocking manner.
      * Very similar to DEL, but actual memory reclamation
      * happens in a different thread, making this non-blocking.
      */
    @JSName("unlink")
    var unlink_Original: OverloadedCommand[String, Double, R] = js.native
    
    /**
      * Stop listening for messages posted to the given channels.
      */
    def unsubscribe(arg1: String): R = js.native
    /**
      * Stop listening for messages posted to the given channels.
      */
    def unsubscribe(arg1: String, arg2: String): R = js.native
    /**
      * Stop listening for messages posted to the given channels.
      */
    def unsubscribe(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Stop listening for messages posted to the given channels.
      */
    def unsubscribe(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Stop listening for messages posted to the given channels.
      */
    def unsubscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Stop listening for messages posted to the given channels.
      */
    def unsubscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def unsubscribe(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[String]
    ): R = js.native
    def unsubscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[String]): R = js.native
    def unsubscribe(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[String]): R = js.native
    def unsubscribe(arg1: String, arg2: String, arg3: String, cb: Callback[String]): R = js.native
    def unsubscribe(arg1: String, arg2: String, cb: Callback[String]): R = js.native
    def unsubscribe(arg1: String, cb: Callback[String]): R = js.native
    def unsubscribe(arg1: js.Array[String]): R = js.native
    def unsubscribe(arg1: js.Array[String], cb: Callback[String]): R = js.native
    /**
      * Stop listening for messages posted to the given channels.
      */
    def unsubscribe(args: (String | Callback[String])*): R = js.native
    /**
      * Stop listening for messages posted to the given channels.
      */
    @JSName("unsubscribe")
    var unsubscribe_Original: OverloadedListCommand[String, String, R] = js.native
    
    /**
      * Forget about all watched keys.
      */
    def unwatch(): R = js.native
    @JSName("unwatch")
    def unwatch_OK(cb: Callback[OK]): R = js.native
    
    /**
      * Wait for the synchronous replication of all the write commands sent in the context of the current connection.
      */
    def wait(numslaves: Double, timeout: Double): R = js.native
    def wait(numslaves: Double, timeout: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Watch the given keys to determine execution of the MULTI/EXEC block.
      */
    def watch(arg1: String): R = js.native
    /**
      * Watch the given keys to determine execution of the MULTI/EXEC block.
      */
    def watch(arg1: String, arg2: String): R = js.native
    /**
      * Watch the given keys to determine execution of the MULTI/EXEC block.
      */
    def watch(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Watch the given keys to determine execution of the MULTI/EXEC block.
      */
    def watch(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Watch the given keys to determine execution of the MULTI/EXEC block.
      */
    def watch(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Watch the given keys to determine execution of the MULTI/EXEC block.
      */
    def watch(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def watch(arg1: String, arg2: js.Array[String]): R = js.native
    def watch(arg1: js.Array[String]): R = js.native
    @JSName("watch")
    def watch_OK(
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[OK]
    ): R = js.native
    @JSName("watch")
    def watch_OK(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[OK]): R = js.native
    @JSName("watch")
    def watch_OK(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[OK]): R = js.native
    @JSName("watch")
    def watch_OK(arg1: String, arg2: String, arg3: String, cb: Callback[OK]): R = js.native
    @JSName("watch")
    def watch_OK(arg1: String, arg2: String, cb: Callback[OK]): R = js.native
    @JSName("watch")
    def watch_OK(arg1: String, arg2: js.Array[String], cb: Callback[OK]): R = js.native
    @JSName("watch")
    def watch_OK(arg1: String, cb: Callback[OK]): R = js.native
    @JSName("watch")
    def watch_OK(arg1: js.Array[String], cb: Callback[OK]): R = js.native
    /**
      * Watch the given keys to determine execution of the MULTI/EXEC block.
      */
    @JSName("watch")
    def watch_OK(args: (String | Callback[OK])*): R = js.native
    /**
      * Watch the given keys to determine execution of the MULTI/EXEC block.
      */
    @JSName("watch")
    var watch_Original: OverloadedCommand[String, OK, R] = js.native
    
    /**
      * Add one or more members to a sorted set, or update its score if it already exists.
      */
    def zadd(args: (String | Double | Callback[Double])*): R = js.native
    /**
      * Add one or more members to a sorted set, or update its score if it already exists.
      */
    def zadd(key: String, arg1: String | Double): R = js.native
    /**
      * Add one or more members to a sorted set, or update its score if it already exists.
      */
    def zadd(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    /**
      * Add one or more members to a sorted set, or update its score if it already exists.
      */
    def zadd(
      key: String,
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    def zadd(key: String, arg1: String | Double, cb: Callback[Double]): R = js.native
    /**
      * Add one or more members to a sorted set, or update its score if it already exists.
      */
    def zadd(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Add one or more members to a sorted set, or update its score if it already exists.
      */
    def zadd(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Add one or more members to a sorted set, or update its score if it already exists.
      */
    def zadd(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def zadd(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def zadd(key: String, arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: String, arg2: String, arg3: Double): R = js.native
    def zadd(key: String, arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def zadd(key: String, arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def zadd(key: String, arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: String, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: String, arg2: Double): R = js.native
    def zadd(key: String, arg1: String, arg2: Double, arg3: String): R = js.native
    def zadd(key: String, arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def zadd(key: String, arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def zadd(key: String, arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: String, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: String, arg2: Double, arg3: Double): R = js.native
    def zadd(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def zadd(key: String, arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def zadd(key: String, arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: String, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: String, arg2: Double, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: js.Array[String | Double]): R = js.native
    def zadd(key: String, arg1: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: String): R = js.native
    def zadd(key: String, arg1: Double, arg2: String, arg3: String): R = js.native
    def zadd(key: String, arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def zadd(key: String, arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def zadd(key: String, arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: String, arg3: Double): R = js.native
    def zadd(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def zadd(key: String, arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def zadd(key: String, arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double, arg3: String): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double, arg3: Double): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def zadd(key: String, arg1: Double, arg2: Double, cb: Callback[Double]): R = js.native
    /**
      * Add one or more members to a sorted set, or update its score if it already exists.
      */
    def zadd(key: String, args: (String | Double | Callback[Double])*): R = js.native
    /**
      * Add one or more members to a sorted set, or update its score if it already exists.
      */
    @JSName("zadd")
    var zadd_Original: OverloadedKeyCommand[String | Double, Double, R] = js.native
    
    /**
      * Get the number of members in a sorted set.
      */
    def zcard(key: String): R = js.native
    def zcard(key: String, cb: Callback[Double]): R = js.native
    
    def zcount(key: String, min: String, max: String): R = js.native
    def zcount(key: String, min: String, max: String, cb: Callback[Double]): R = js.native
    def zcount(key: String, min: String, max: Double): R = js.native
    def zcount(key: String, min: String, max: Double, cb: Callback[Double]): R = js.native
    def zcount(key: String, min: Double, max: String): R = js.native
    def zcount(key: String, min: Double, max: String, cb: Callback[Double]): R = js.native
    /**
      * Count the members in a sorted set with scores between the given values.
      */
    def zcount(key: String, min: Double, max: Double): R = js.native
    def zcount(key: String, min: Double, max: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Increment the score of a member in a sorted set.
      */
    def zincrby(key: String, increment: Double, member: String): R = js.native
    def zincrby(key: String, increment: Double, member: String, cb: Callback[String]): R = js.native
    
    /**
      * Intersect multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zinterstore(arg1: String | Double): R = js.native
    /**
      * Intersect multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zinterstore(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    /**
      * Intersect multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zinterstore(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    def zinterstore(arg1: String | Double, cb: Callback[Double]): R = js.native
    /**
      * Intersect multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zinterstore(arg1: String, arg2: String | Double): R = js.native
    def zinterstore(arg1: String, arg2: String | Double, cb: Callback[Double]): R = js.native
    /**
      * Intersect multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zinterstore(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Intersect multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zinterstore(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def zinterstore(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def zinterstore(arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: String, arg2: String, arg3: Double): R = js.native
    def zinterstore(arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def zinterstore(arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def zinterstore(arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: String, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: String, arg2: js.Array[String | Double]): R = js.native
    def zinterstore(arg1: String, arg2: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def zinterstore(arg1: String, arg2: Double, arg3: String): R = js.native
    def zinterstore(arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def zinterstore(arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def zinterstore(arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: String, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: String, arg2: Double, arg3: Double): R = js.native
    def zinterstore(arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def zinterstore(arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def zinterstore(arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: String, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: js.Array[String | Double]): R = js.native
    def zinterstore(arg1: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: String | Double): R = js.native
    def zinterstore(arg1: Double, arg2: String | Double, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: String, arg3: String): R = js.native
    def zinterstore(arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def zinterstore(arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def zinterstore(arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: String, arg3: Double): R = js.native
    def zinterstore(arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def zinterstore(arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def zinterstore(arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: js.Array[String | Double]): R = js.native
    def zinterstore(arg1: Double, arg2: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: Double, arg3: String): R = js.native
    def zinterstore(arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def zinterstore(arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def zinterstore(arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: Double, arg3: Double): R = js.native
    def zinterstore(arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def zinterstore(arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def zinterstore(arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def zinterstore(arg1: Double, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    /**
      * Intersect multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zinterstore(args: (String | Double | Callback[Double])*): R = js.native
    /**
      * Intersect multiple sorted sets and store the resulting sorted set in a new key.
      */
    @JSName("zinterstore")
    var zinterstore_Original: OverloadedCommand[String | Double, Double, R] = js.native
    
    /**
      * Count the number of members in a sorted set between a given lexicographic range.
      */
    def zlexcount(key: String, min: String, max: String): R = js.native
    def zlexcount(key: String, min: String, max: String, cb: Callback[Double]): R = js.native
    
    /**
      * Return a range of members in a sorted set, by index.
      */
    def zrange(key: String, start: Double, stop: Double): R = js.native
    def zrange(key: String, start: Double, stop: Double, cb: Callback[js.Array[String]]): R = js.native
    def zrange(key: String, start: Double, stop: Double, withscores: String): R = js.native
    def zrange(key: String, start: Double, stop: Double, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    
    /**
      * Return a range of members in a sorted set, by lexicographical range.
      */
    def zrangebylex(key: String, min: String, max: String): R = js.native
    def zrangebylex(key: String, min: String, max: String, cb: Callback[js.Array[String]]): R = js.native
    def zrangebylex(key: String, min: String, max: String, limit: String, offset: Double, count: Double): R = js.native
    def zrangebylex(
      key: String,
      min: String,
      max: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    
    def zrangebyscore(key: String, min: String, max: String): R = js.native
    def zrangebyscore(key: String, min: String, max: String, cb: Callback[js.Array[String]]): R = js.native
    def zrangebyscore(key: String, min: String, max: String, limit: String, offset: Double, count: Double): R = js.native
    def zrangebyscore(
      key: String,
      min: String,
      max: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def zrangebyscore(key: String, min: String, max: String, withscores: String): R = js.native
    def zrangebyscore(key: String, min: String, max: String, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def zrangebyscore(
      key: String,
      min: String,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def zrangebyscore(
      key: String,
      min: String,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def zrangebyscore(key: String, min: String, max: Double): R = js.native
    def zrangebyscore(key: String, min: String, max: Double, cb: Callback[js.Array[String]]): R = js.native
    def zrangebyscore(key: String, min: String, max: Double, limit: String, offset: Double, count: Double): R = js.native
    def zrangebyscore(
      key: String,
      min: String,
      max: Double,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def zrangebyscore(key: String, min: String, max: Double, withscores: String): R = js.native
    def zrangebyscore(key: String, min: String, max: Double, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def zrangebyscore(
      key: String,
      min: String,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def zrangebyscore(
      key: String,
      min: String,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def zrangebyscore(key: String, min: Double, max: String): R = js.native
    def zrangebyscore(key: String, min: Double, max: String, cb: Callback[js.Array[String]]): R = js.native
    def zrangebyscore(key: String, min: Double, max: String, limit: String, offset: Double, count: Double): R = js.native
    def zrangebyscore(
      key: String,
      min: Double,
      max: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def zrangebyscore(key: String, min: Double, max: String, withscores: String): R = js.native
    def zrangebyscore(key: String, min: Double, max: String, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def zrangebyscore(
      key: String,
      min: Double,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def zrangebyscore(
      key: String,
      min: Double,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    /**
      * Return a range of members in a sorted set, by score.
      */
    def zrangebyscore(key: String, min: Double, max: Double): R = js.native
    def zrangebyscore(key: String, min: Double, max: Double, cb: Callback[js.Array[String]]): R = js.native
    def zrangebyscore(key: String, min: Double, max: Double, limit: String, offset: Double, count: Double): R = js.native
    def zrangebyscore(
      key: String,
      min: Double,
      max: Double,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def zrangebyscore(key: String, min: Double, max: Double, withscores: String): R = js.native
    def zrangebyscore(key: String, min: Double, max: Double, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def zrangebyscore(
      key: String,
      min: Double,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def zrangebyscore(
      key: String,
      min: Double,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    
    /**
      * Determine the index of a member in a sorted set.
      */
    def zrank(key: String, member: String): R = js.native
    def zrank(key: String, member: String, cb: Callback[Double | Null]): R = js.native
    
    /**
      * Remove one or more members from a sorted set.
      */
    def zrem(args: (String | Callback[Double])*): R = js.native
    /**
      * Remove one or more members from a sorted set.
      */
    def zrem(key: String, arg1: String): R = js.native
    /**
      * Remove one or more members from a sorted set.
      */
    def zrem(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Remove one or more members from a sorted set.
      */
    def zrem(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Remove one or more members from a sorted set.
      */
    def zrem(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Remove one or more members from a sorted set.
      */
    def zrem(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Remove one or more members from a sorted set.
      */
    def zrem(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def zrem(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[Double]
    ): R = js.native
    def zrem(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[Double]
    ): R = js.native
    def zrem(key: String, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def zrem(key: String, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def zrem(key: String, arg1: String, arg2: String, cb: Callback[Double]): R = js.native
    def zrem(key: String, arg1: String, cb: Callback[Double]): R = js.native
    def zrem(key: String, arg1: js.Array[String]): R = js.native
    def zrem(key: String, arg1: js.Array[String], cb: Callback[Double]): R = js.native
    /**
      * Remove one or more members from a sorted set.
      */
    def zrem(key: String, args: (String | Callback[Double])*): R = js.native
    /**
      * Remove one or more members from a sorted set.
      */
    @JSName("zrem")
    var zrem_Original: OverloadedKeyCommand[String, Double, R] = js.native
    
    /**
      * Remove all members in a sorted set between the given lexicographical range.
      */
    def zremrangebylex(key: String, min: String, max: String): R = js.native
    def zremrangebylex(key: String, min: String, max: String, cb: Callback[Double]): R = js.native
    
    /**
      * Remove all members in a sorted set within the given indexes.
      */
    def zremrangebyrank(key: String, start: Double, stop: Double): R = js.native
    def zremrangebyrank(key: String, start: Double, stop: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Remove all members in a sorted set within the given indexes.
      */
    def zremrangebyscore(key: String, min: String, max: String): R = js.native
    def zremrangebyscore(key: String, min: String, max: String, cb: Callback[Double]): R = js.native
    def zremrangebyscore(key: String, min: String, max: Double): R = js.native
    def zremrangebyscore(key: String, min: String, max: Double, cb: Callback[Double]): R = js.native
    def zremrangebyscore(key: String, min: Double, max: String): R = js.native
    def zremrangebyscore(key: String, min: Double, max: String, cb: Callback[Double]): R = js.native
    def zremrangebyscore(key: String, min: Double, max: Double): R = js.native
    def zremrangebyscore(key: String, min: Double, max: Double, cb: Callback[Double]): R = js.native
    
    /**
      * Return a range of members in a sorted set, by index, with scores ordered from high to low.
      */
    def zrevrange(key: String, start: Double, stop: Double): R = js.native
    def zrevrange(key: String, start: Double, stop: Double, cb: Callback[js.Array[String]]): R = js.native
    def zrevrange(key: String, start: Double, stop: Double, withscores: String): R = js.native
    def zrevrange(key: String, start: Double, stop: Double, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    
    /**
      * Return a range of members in a sorted set, by lexicographical range, ordered from higher to lower strings.
      */
    def zrevrangebylex(key: String, min: String, max: String): R = js.native
    def zrevrangebylex(key: String, min: String, max: String, cb: Callback[js.Array[String]]): R = js.native
    def zrevrangebylex(key: String, min: String, max: String, limit: String, offset: Double, count: Double): R = js.native
    def zrevrangebylex(
      key: String,
      min: String,
      max: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    
    def zrevrangebyscore(key: String, min: String, max: String): R = js.native
    def zrevrangebyscore(key: String, min: String, max: String, cb: Callback[js.Array[String]]): R = js.native
    def zrevrangebyscore(key: String, min: String, max: String, limit: String, offset: Double, count: Double): R = js.native
    def zrevrangebyscore(
      key: String,
      min: String,
      max: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def zrevrangebyscore(key: String, min: String, max: String, withscores: String): R = js.native
    def zrevrangebyscore(key: String, min: String, max: String, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def zrevrangebyscore(
      key: String,
      min: String,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def zrevrangebyscore(
      key: String,
      min: String,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def zrevrangebyscore(key: String, min: String, max: Double): R = js.native
    def zrevrangebyscore(key: String, min: String, max: Double, cb: Callback[js.Array[String]]): R = js.native
    def zrevrangebyscore(key: String, min: String, max: Double, limit: String, offset: Double, count: Double): R = js.native
    def zrevrangebyscore(
      key: String,
      min: String,
      max: Double,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def zrevrangebyscore(key: String, min: String, max: Double, withscores: String): R = js.native
    def zrevrangebyscore(key: String, min: String, max: Double, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def zrevrangebyscore(
      key: String,
      min: String,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def zrevrangebyscore(
      key: String,
      min: String,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def zrevrangebyscore(key: String, min: Double, max: String): R = js.native
    def zrevrangebyscore(key: String, min: Double, max: String, cb: Callback[js.Array[String]]): R = js.native
    def zrevrangebyscore(key: String, min: Double, max: String, limit: String, offset: Double, count: Double): R = js.native
    def zrevrangebyscore(
      key: String,
      min: Double,
      max: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def zrevrangebyscore(key: String, min: Double, max: String, withscores: String): R = js.native
    def zrevrangebyscore(key: String, min: Double, max: String, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def zrevrangebyscore(
      key: String,
      min: Double,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def zrevrangebyscore(
      key: String,
      min: Double,
      max: String,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    /**
      * Return a range of members in a sorted set, by score, with scores ordered from high to low.
      */
    def zrevrangebyscore(key: String, min: Double, max: Double): R = js.native
    def zrevrangebyscore(key: String, min: Double, max: Double, cb: Callback[js.Array[String]]): R = js.native
    def zrevrangebyscore(key: String, min: Double, max: Double, limit: String, offset: Double, count: Double): R = js.native
    def zrevrangebyscore(
      key: String,
      min: Double,
      max: Double,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    def zrevrangebyscore(key: String, min: Double, max: Double, withscores: String): R = js.native
    def zrevrangebyscore(key: String, min: Double, max: Double, withscores: String, cb: Callback[js.Array[String]]): R = js.native
    def zrevrangebyscore(
      key: String,
      min: Double,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double
    ): R = js.native
    def zrevrangebyscore(
      key: String,
      min: Double,
      max: Double,
      withscores: String,
      limit: String,
      offset: Double,
      count: Double,
      cb: Callback[js.Array[String]]
    ): R = js.native
    
    /**
      * Determine the index of a member in a sorted set, with scores ordered from high to low.
      */
    def zrevrank(key: String, member: String): R = js.native
    def zrevrank(key: String, member: String, cb: Callback[Double | Null]): R = js.native
    
    /**
      * Incrementally iterate sorted sets elements and associated scores.
      */
    def zscan(args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    /**
      * Incrementally iterate sorted sets elements and associated scores.
      */
    def zscan(key: String, arg1: String): R = js.native
    /**
      * Incrementally iterate sorted sets elements and associated scores.
      */
    def zscan(key: String, arg1: String, arg2: String): R = js.native
    /**
      * Incrementally iterate sorted sets elements and associated scores.
      */
    def zscan(key: String, arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Incrementally iterate sorted sets elements and associated scores.
      */
    def zscan(key: String, arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    /**
      * Incrementally iterate sorted sets elements and associated scores.
      */
    def zscan(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String): R = js.native
    /**
      * Incrementally iterate sorted sets elements and associated scores.
      */
    def zscan(key: String, arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, arg6: String): R = js.native
    def zscan(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      arg6: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def zscan(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      arg5: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def zscan(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      arg4: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def zscan(
      key: String,
      arg1: String,
      arg2: String,
      arg3: String,
      cb: Callback[js.Tuple2[String, js.Array[String]]]
    ): R = js.native
    def zscan(key: String, arg1: String, arg2: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def zscan(key: String, arg1: String, cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    def zscan(key: String, arg1: js.Array[String]): R = js.native
    def zscan(key: String, arg1: js.Array[String], cb: Callback[js.Tuple2[String, js.Array[String]]]): R = js.native
    /**
      * Incrementally iterate sorted sets elements and associated scores.
      */
    def zscan(key: String, args: (String | (Callback[js.Tuple2[String, js.Array[String]]]))*): R = js.native
    /**
      * Incrementally iterate sorted sets elements and associated scores.
      */
    @JSName("zscan")
    var zscan_Original: OverloadedKeyCommand[String, js.Tuple2[String, js.Array[String]], R] = js.native
    
    /**
      * Get the score associated with the given member in a sorted set.
      */
    def zscore(key: String, member: String): R = js.native
    def zscore(key: String, member: String, cb: Callback[String]): R = js.native
    
    /**
      * Add multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zunionstore(arg1: String | Double): R = js.native
    /**
      * Add multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zunionstore(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      arg6: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    /**
      * Add multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zunionstore(
      arg1: String | Double,
      arg2: String | Double,
      arg3: String | Double,
      arg4: String | Double,
      arg5: String | Double,
      cb: js.UndefOr[Callback[Double]]
    ): R = js.native
    def zunionstore(arg1: String | Double, cb: Callback[Double]): R = js.native
    /**
      * Add multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zunionstore(arg1: String, arg2: String | Double): R = js.native
    def zunionstore(arg1: String, arg2: String | Double, cb: Callback[Double]): R = js.native
    /**
      * Add multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zunionstore(arg1: String, arg2: String, arg3: String): R = js.native
    /**
      * Add multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zunionstore(arg1: String, arg2: String, arg3: String, arg4: String): R = js.native
    def zunionstore(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: String, arg2: String, arg3: String, arg4: Double): R = js.native
    def zunionstore(arg1: String, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: String, arg2: String, arg3: Double): R = js.native
    def zunionstore(arg1: String, arg2: String, arg3: Double, arg4: String): R = js.native
    def zunionstore(arg1: String, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: String, arg2: String, arg3: Double, arg4: Double): R = js.native
    def zunionstore(arg1: String, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: String, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: String, arg2: js.Array[String | Double]): R = js.native
    def zunionstore(arg1: String, arg2: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def zunionstore(arg1: String, arg2: Double, arg3: String): R = js.native
    def zunionstore(arg1: String, arg2: Double, arg3: String, arg4: String): R = js.native
    def zunionstore(arg1: String, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: String, arg2: Double, arg3: String, arg4: Double): R = js.native
    def zunionstore(arg1: String, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: String, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: String, arg2: Double, arg3: Double): R = js.native
    def zunionstore(arg1: String, arg2: Double, arg3: Double, arg4: String): R = js.native
    def zunionstore(arg1: String, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: String, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def zunionstore(arg1: String, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: String, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: js.Array[String | Double]): R = js.native
    def zunionstore(arg1: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: String | Double): R = js.native
    def zunionstore(arg1: Double, arg2: String | Double, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: String, arg3: String): R = js.native
    def zunionstore(arg1: Double, arg2: String, arg3: String, arg4: String): R = js.native
    def zunionstore(arg1: Double, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: String, arg3: String, arg4: Double): R = js.native
    def zunionstore(arg1: Double, arg2: String, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: String, arg3: String, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: String, arg3: Double): R = js.native
    def zunionstore(arg1: Double, arg2: String, arg3: Double, arg4: String): R = js.native
    def zunionstore(arg1: Double, arg2: String, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: String, arg3: Double, arg4: Double): R = js.native
    def zunionstore(arg1: Double, arg2: String, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: String, arg3: Double, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: js.Array[String | Double]): R = js.native
    def zunionstore(arg1: Double, arg2: js.Array[String | Double], cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: Double, arg3: String): R = js.native
    def zunionstore(arg1: Double, arg2: Double, arg3: String, arg4: String): R = js.native
    def zunionstore(arg1: Double, arg2: Double, arg3: String, arg4: String, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: Double, arg3: String, arg4: Double): R = js.native
    def zunionstore(arg1: Double, arg2: Double, arg3: String, arg4: Double, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: Double, arg3: String, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: Double, arg3: Double): R = js.native
    def zunionstore(arg1: Double, arg2: Double, arg3: Double, arg4: String): R = js.native
    def zunionstore(arg1: Double, arg2: Double, arg3: Double, arg4: String, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: Double, arg3: Double, arg4: Double): R = js.native
    def zunionstore(arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): R = js.native
    def zunionstore(arg1: Double, arg2: Double, arg3: Double, cb: Callback[Double]): R = js.native
    /**
      * Add multiple sorted sets and store the resulting sorted set in a new key.
      */
    def zunionstore(args: (String | Double | Callback[Double])*): R = js.native
    /**
      * Add multiple sorted sets and store the resulting sorted set in a new key.
      */
    @JSName("zunionstore")
    var zunionstore_Original: OverloadedCommand[String | Double, Double, R] = js.native
  }
  
  @js.native
  trait OverloadedCommand[T, U, R] extends StObject {
    
    def apply(arg1: T): R = js.native
    def apply(arg1: T, arg2: T): R = js.native
    def apply(arg1: T, arg2: T, arg3: T): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, arg4: T): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T, cb: Callback[U]): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, cb: Callback[U]): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, arg4: T, cb: Callback[U]): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, cb: Callback[U]): R = js.native
    def apply(arg1: T, arg2: T, cb: Callback[U]): R = js.native
    def apply(arg1: T, arg2: js.Array[T]): R = js.native
    def apply(arg1: T, arg2: js.Array[T], cb: Callback[U]): R = js.native
    def apply(arg1: T, cb: Callback[U]): R = js.native
    def apply(arg1: js.Array[T]): R = js.native
    def apply(arg1: js.Array[T], cb: Callback[U]): R = js.native
    def apply(args: (T | Callback[U])*): R = js.native
  }
  
  @js.native
  trait OverloadedKeyCommand[T, U, R] extends StObject {
    
    def apply(args: (String | T | Callback[U])*): R = js.native
    def apply(key: String, arg1: T): R = js.native
    def apply(key: String, arg1: T, arg2: T): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T, cb: Callback[U]): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, cb: Callback[U]): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, cb: Callback[U]): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, cb: Callback[U]): R = js.native
    def apply(key: String, arg1: T, arg2: T, cb: Callback[U]): R = js.native
    def apply(key: String, arg1: T, cb: Callback[U]): R = js.native
    def apply(key: String, arg1: js.Array[T]): R = js.native
    def apply(key: String, arg1: js.Array[T], cb: Callback[U]): R = js.native
    def apply(key: String, args: (T | Callback[U])*): R = js.native
  }
  
  @js.native
  trait OverloadedLastCommand[T1, T2, U, R] extends StObject {
    
    def apply(arg1: T1, arg2: T1, arg3: T1, arg4: T1, arg5: T1, arg6: T2): R = js.native
    def apply(arg1: T1, arg2: T1, arg3: T1, arg4: T1, arg5: T1, arg6: T2, cb: Callback[U]): R = js.native
    def apply(arg1: T1, arg2: T1, arg3: T1, arg4: T1, arg5: T2): R = js.native
    def apply(arg1: T1, arg2: T1, arg3: T1, arg4: T1, arg5: T2, cb: Callback[U]): R = js.native
    def apply(arg1: T1, arg2: T1, arg3: T1, arg4: T2): R = js.native
    def apply(arg1: T1, arg2: T1, arg3: T1, arg4: T2, cb: Callback[U]): R = js.native
    def apply(arg1: T1, arg2: T1, arg3: T2): R = js.native
    def apply(arg1: T1, arg2: T1, arg3: T2, cb: Callback[U]): R = js.native
    def apply(arg1: T1, arg2: T2): R = js.native
    def apply(arg1: T1, arg2: T2, cb: Callback[U]): R = js.native
    def apply(arg1: T1, arg2: js.Array[T1 | T2]): R = js.native
    def apply(arg1: T1, arg2: js.Array[T1 | T2], cb: Callback[U]): R = js.native
    def apply(args: (T1 | T2 | Callback[U])*): R = js.native
    def apply(args: js.Array[T1 | T2]): R = js.native
    def apply(args: js.Array[T1 | T2], cb: Callback[U]): R = js.native
  }
  
  @js.native
  trait OverloadedListCommand[T, U, R] extends StObject {
    
    def apply(arg1: T): R = js.native
    def apply(arg1: T, arg2: T): R = js.native
    def apply(arg1: T, arg2: T, arg3: T): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, arg4: T): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T, cb: Callback[U]): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, cb: Callback[U]): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, arg4: T, cb: Callback[U]): R = js.native
    def apply(arg1: T, arg2: T, arg3: T, cb: Callback[U]): R = js.native
    def apply(arg1: T, arg2: T, cb: Callback[U]): R = js.native
    def apply(arg1: T, cb: Callback[U]): R = js.native
    def apply(arg1: js.Array[T]): R = js.native
    def apply(arg1: js.Array[T], cb: Callback[U]): R = js.native
    def apply(args: (T | Callback[U])*): R = js.native
  }
  
  @js.native
  trait OverloadedSetCommand[T, U, R] extends StObject {
    
    def apply(args: Array[String | T]): R = js.native
    def apply(args: Array[String | T], cb: Callback[U]): R = js.native
    def apply(key: String, arg1: T): R = js.native
    def apply(key: String, arg1: T, arg2: T): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T, cb: Callback[U]): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, cb: Callback[U]): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, cb: Callback[U]): R = js.native
    def apply(key: String, arg1: T, arg2: T, arg3: T, cb: Callback[U]): R = js.native
    def apply(key: String, arg1: T, arg2: T, cb: Callback[U]): R = js.native
    def apply(key: String, arg1: T, cb: Callback[U]): R = js.native
    def apply(key: String, arg1: js.Array[T]): R = js.native
    def apply(key: String, arg1: js.Array[T], cb: Callback[U]): R = js.native
    def apply(key: String, arg1: StringDictionary[T]): R = js.native
    def apply(key: String, arg1: StringDictionary[T], cb: Callback[U]): R = js.native
    def apply(key: String, args: (T | Callback[U])*): R = js.native
  }
  
  type RetryStrategy = js.Function1[/* options */ RetryStrategyOptions, Double | js.Error | js.Any]
  
  @js.native
  trait RetryStrategyOptions extends StObject {
    
    var attempt: Double = js.native
    
    var error: ErrnoException = js.native
    
    var times_connected: Double = js.native
    
    var total_retry_time: Double = js.native
  }
  object RetryStrategyOptions {
    
    @scala.inline
    def apply(attempt: Double, error: ErrnoException, times_connected: Double, total_retry_time: Double): RetryStrategyOptions = {
      val __obj = js.Dynamic.literal(attempt = attempt.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], times_connected = times_connected.asInstanceOf[js.Any], total_retry_time = total_retry_time.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryStrategyOptions]
    }
    
    @scala.inline
    implicit class RetryStrategyOptionsMutableBuilder[Self <: RetryStrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttempt(value: Double): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: ErrnoException): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimes_connected(value: Double): Self = StObject.set(x, "times_connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_retry_time(value: Double): Self = StObject.set(x, "total_retry_time", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServerInfo extends StObject {
    
    var redis_version: String = js.native
    
    var versions: js.Array[Double] = js.native
  }
  object ServerInfo {
    
    @scala.inline
    def apply(redis_version: String, versions: js.Array[Double]): ServerInfo = {
      val __obj = js.Dynamic.literal(redis_version = redis_version.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerInfo]
    }
    
    @scala.inline
    implicit class ServerInfoMutableBuilder[Self <: ServerInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedis_version(value: String): Self = StObject.set(x, "redis_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersions(value: js.Array[Double]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionsVarargs(value: Double*): Self = StObject.set(x, "versions", js.Array(value :_*))
    }
  }
}
