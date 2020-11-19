package typingsSlinky.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oracledb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * The oracledb.Promise property is no longer used in node-oracledb 5 and has no effect.
    * 
    * Node-oracledb supports Promises on all methods. The native Promise library is used.
    * 
    * @deprecated 5.0
    */
  var Promise: js.Promise[js.Any] = js.native
  
  /**
    * If true, the transaction in the current connection is automatically committed at the end of statement execution.
    * This property may be overridden in an execute() call.
    *
    * @default false
    * @since 0.5
    */
  var autoCommit: Boolean = js.native
  
  /**
    * The user-chosen Connection class value defines a logical name for connections.
    * Most single purpose applications should set connectionClass when using a connection pool or DRCP.
    *
    * When a pooled session has a connection class, Oracle ensures that the session is not shared outside of that connection class.
    *
    * The connection class value is similarly used by Database Resident Connection Pooling (DRCP) to allow or disallow sharing of sessions.
    *
    * For example, where two different kinds of users share one pool, you might set connectionClass to ‘HRPOOL’ for connections that
    * access a Human Resources system, and it might be set to ‘OEPOOL’ for users of an Order Entry system.
    * Users will only be given sessions of the appropriate class, allowing maximal reuse of resources in each case,
    * and preventing any session information leaking between the two systems.
    *
    * If connectionClass is set for a non-pooled connection, the driver name is not recorded in V$ views.
    */
  var connectionClass: String = js.native
  
  /**
    * Sets the name used for Edition-Based Redefinition by connections.
    *
    * @since 2.2
    */
  var edition: String = js.native
  
  /**
    * Determines whether Oracle Client events mode should be enabled.
    *
    * This property can be overridden in the oracledb.createPool() call and when getting a standalone connection from oracledb.getConnection().
    *
    * Events mode is required for Continuous Query Notification, Fast Application Notification (FAN) and Runtime Load Balancing (RLB).
    *
    * @default true
    * @since 2.2
    */
  var events: Boolean = js.native
  
  /**
    * Determines whether additional metadata is available for queries and for REF CURSORs returned from PL/SQL blocks.
    *
    * With this value, the result.metaData result.resultSet.metaData objects only include column names.
    *
    * If extendedMetaData is true then metaData will contain additional attributes.
    *
    * This property may be overridden in an execute() call.
    *
    * @default false
    * @since 1.10
    */
  var extendedMetaData: Boolean = js.native
  
  /**
    * If true, connections will be established using external authentication.
    *
    * The user and password properties should not be set when externalAuth is true.
    *
    * This property can be overridden in the oracledb.createPool() call and when getting a standalone connection from oracledb.getConnection().
    *
    * @default false
    * @since 0.5
    */
  var externalAuth: Boolean = js.native
  
  /**
    * This property sets the size of an internal buffer used for fetching query rows from Oracle Database.
    * Changing it may affect query performance but does not affect how many rows are returned to the application.
    *
    * The property is used during the default direct fetches, during ResultSet getRow() calls, and for queryStream(). It is not used for getRows().
    *
    * Increasing this value reduces the number of round-trips to the database but increases memory usage for each data fetch.
    * For queries that return a large number of rows, higher values of fetchArraySize may give better performance.
    * For queries that only return a few rows, reduce the value of fetchArraySize to minimize the amount of memory management during data fetches.
    * JavaScript memory fragmentation may occur in some cases.
    *
    * For direct fetches (those using execute() option resultSet: false), the internal buffer size will be based on the lesser of maxRows and fetchArraySize.
    *
    * @default 100
    * @since 2.0
    */
  var fetchArraySize: Double = js.native
  
  /**
    * Configure data types to be returned as a Buffer instead of the default representation when queried with execute() or queryStream().
    *
    * Currently the only valid type is oracledb.BLOB.
    *
    * By default in node-oracledb, all columns are returned as native types or as Lob instances, in the case of CLOB and BLOB types.
    *
    * Individual query columns in execute() or queryStream() calls can override the fetchAsBuffer global setting by using fetchInfo.
    *
    * @since 1.13
    */
  var fetchAsBuffer: js.Array[Double] = js.native
  
  /**
    * An array of node-oracledb types. The valid types are oracledb.DATE, oracledb.NUMBER, oracledb.BUFFER, and oracledb.CLOB.
    * When any column having one of the specified types is queried with execute() or queryStream(), the column data is returned as a string instead of the default representation.
    *
    * By default in node-oracledb, all columns are returned as native types or as Lob instances, in the case of CLOB and BLOB types.
    *
    * This property helps avoid situations where using JavaScript types can lead to numeric precision loss, or where date conversion is unwanted.
    *
    * For raw data returned as a string, Oracle returns the data as a hex-encoded string.
    * For dates and numbers returned as a string, the maximum length of a string created by this mapping is 200 bytes.
    * Strings created for CLOB columns will generally be limited by Node.js and V8 memory restrictions.
    *
    * Individual query columns in execute() or queryStream() calls can override the fetchAsString global setting by using fetchInfo.
    *
    * For non-CLOB types, the conversion to string is handled by Oracle client libraries and is often referred to as defining the fetch type.
    */
  var fetchAsString: js.Array[Double] = js.native
  
  /**
    * The maximum number of rows that are fetched by a query with connection.execute() when not using a ResultSet.
    * Rows beyond this limit are not fetched from the database. A value of 0 means there is no limit.
    *
    * This property may be overridden in an execute() call.
    *
    * To improve database efficiency, SQL queries should use a row limiting clause like OFFSET / FETCH or equivalent.
    * The maxRows property can be used to stop badly coded queries from returning unexpectedly large numbers of rows.
    *
    * When the number of query rows is relatively big, or can not be predicted, it is recommended to use
    * a ResultSet or queryStream(). This allows applications to process rows in smaller chunks or individually,
    * preventing the Node.js memory limit being exceeded or query results being unexpectedly truncated by a
    * maxRows limit.
    *
    * @default 0 (unlimited)
    */
  var maxRows: Double = js.native
  
  /**
    * The format of query rows fetched when using connection.execute() or connection.queryStream().
    * It affects both ResultSet and non-ResultSet queries. It can be used for top level queries and REF CURSOR output.
    *
    * This can be either of the Oracledb constants oracledb.ARRAY or oracledb.OBJECT.
    *
    * If specified as oracledb.ARRAY, each row is fetched as an array of column values.
    *
    * If specified as oracledb.OBJECT, each row is fetched as a JavaScript object.
    * The object has a property for each column name, with the property value set to the respective column value.
    * The property name follows Oracle’s standard name-casing rules. It will commonly be uppercase,
    * since most applications create tables using unquoted, case-insensitive names.
    *
    * This property may be overridden in an execute() or queryStream() call.
    *
    * @default ARRAY
    */
  var outFormat: Double = js.native
  
  /**
    * The number of connections that are opened whenever a connection request exceeds the number of currently open connections.
    *
    * This property may be overridden when creating a connection pool.
    *
    * @default 1
    */
  var poolIncrement: Double = js.native
  
  /**
    * The maximum number of connections to which a connection pool can grow.
    *
    * This property may be overridden when creating a connection pool.
    *
    * Importantly, if you increase poolMax you should also increase the number of threads available to node-oracledb.
    *
    * @default 4
    */
  var poolMax: Double = js.native
  
  /**
    * The maximum number of connections per shard for connection pools. This ensures that the pool is balanced towards each shard.
    * 
    * This property may be overridden when creating a connection pool.
    * 
    * When this property is set, and a new connection request would cause the number of connections to the target shard to exceed the limit,
    * then that new connection request will block until a suitable connection has been released back to the pool.
    * Importantly, when blocked, the queueTimeout value will be ignored and the pending connection request will consume one worker thread.
    * 
    * @since 4.1
    */
  var poolMaxPerShard: Double = js.native
  
  /**
    * The minimum number of connections a connection pool maintains, even when there is no activity to the target database.
    *
    * This property may be overridden when creating a connection pool.
    *
    * For pools created with External Authentication or with homogeneous set to false, the number of
    * connections initially created is zero even if a larger value is specified for poolMin.
    * The pool increment is always 1, regardless of the value of poolIncrement.
    * Once the number of open connections exceeds poolMin and connections are idle for more than
    * the poolTimeout seconds, then the number of open connections does not fall below poolMin.
    *
    * @default 0
    */
  var poolMin: Double = js.native
  
  /**
    * When a pool getConnection() is called and the connection has been idle in the pool for at least
    * poolPingInterval seconds, node-oracledb internally “pings” the database to check the connection is alive.
    * After a ping, an unusable connection is destroyed and a usable one is returned by getConnection().
    * Connection pinging improves the chance a pooled connection is valid when it is first used because
    * identified unusable connections will not be returned to the application.
    *
    * This property may be overridden when creating a connection pool.
    *
    * @default 60
    * @since 1.12
    */
  var poolPingInterval: Double = js.native
  
  /**
    * The number of seconds after which idle connections (unused in the pool) are terminated.
    * Idle connections are terminated only when the pool is accessed. If the poolTimeout is set to 0,
    * then idle connections are never terminated.
    *
    * This property may be overridden when creating a connection pool.
    *
    * @default 60
    */
  var poolTimeout: Double = js.native
  
  /**
    * This is a query tuning option to set the number of additional rows the underlying Oracle Client library
    * fetches during the internal initial statement execution phase of a query. The prefetch size does not affect when, or how many,
    * rows are returned by node-oracledb to the application.
    * 
    * The prefetchRows attribute can be used in conjunction with oracledb.fetchArraySize to tune query performance, memory use,
    * and to reduce the number of round-trip calls needed to return query results.
    * 
    * The prefetchRows value is ignored in some cases, such as when the query involves a LOB.
    * 
    * This property may be overridden in an connection.execute() call, which is preferred usage if you need to change the value.
    * 
    * This attribute is not used in node-oracledb version 2, 3 or 4. In those versions use only oracledb.fetchArraySize instead.
    * 
    * @default 2
    * @see https://oracle.github.io/node-oracledb/doc/api.html#rowfetching
    */
  var prefetchRows: Double = js.native
  
  /**
    * The maximum number of pending pool.getConnection() calls that can be queued.
    * 
    * When the number of pool.getConnection() calls that have been queued waiting for an available connection reaches queueMax,
    * then any future pool.getConnection() calls will immediately return an error and will not be queued.
    * 
    * If queueMax is -1, then the queue length is not limited.
    * 
    * This property may be overridden when creating a connection pool.
    * 
    * @default 500
    */
  var queueMax: Double = js.native
  
  /**
    * This property was removed in node-oracledb 3.0 and queuing was always enabled.
    * In node-oracledb 5.0, set queueMax to 0 to disable queuing.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#connpoolqueue
    */
  var queueRequests: Double = js.native
  
  /**
    * The number of milliseconds after which connection requests waiting in the connection request queue are terminated.
    * If queueTimeout is 0, then queued connection requests are never terminated.
    *
    * This property may be overridden when creating a connection pool.
    *
    * @default 60000
    * @since 1.7
    */
  var queueTimeout: Double = js.native
  
  /**
    * The number of statements that are cached in the statement cache of each connection.
    *
    * This property may be overridden for specific Pool or Connection objects.
    *
    * In general, set the statement cache to the size of the working set of statements being
    * executed by the application. Statement caching can be disabled by setting the size to 0.
    *
    * @default 30
    */
  var stmtCacheSize: Double = js.native
}
