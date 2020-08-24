package typingsSlinky.ddTrace.mod

import typingsSlinky.ddTrace.ddTraceStrings.`aws-sdk`
import typingsSlinky.ddTrace.ddTraceStrings.`cassandra-driver`
import typingsSlinky.ddTrace.ddTraceStrings.`generic-pool`
import typingsSlinky.ddTrace.ddTraceStrings.`google-cloud-pubsub`
import typingsSlinky.ddTrace.ddTraceStrings.`limitd-client`
import typingsSlinky.ddTrace.ddTraceStrings.`microgateway-core`
import typingsSlinky.ddTrace.ddTraceStrings.`mongodb-core`
import typingsSlinky.ddTrace.ddTraceStrings.`promise-js`
import typingsSlinky.ddTrace.ddTraceStrings.amqp10
import typingsSlinky.ddTrace.ddTraceStrings.amqplib
import typingsSlinky.ddTrace.ddTraceStrings.bluebird
import typingsSlinky.ddTrace.ddTraceStrings.bunyan
import typingsSlinky.ddTrace.ddTraceStrings.connect
import typingsSlinky.ddTrace.ddTraceStrings.couchbase
import typingsSlinky.ddTrace.ddTraceStrings.dns
import typingsSlinky.ddTrace.ddTraceStrings.elasticsearch
import typingsSlinky.ddTrace.ddTraceStrings.express
import typingsSlinky.ddTrace.ddTraceStrings.fastify
import typingsSlinky.ddTrace.ddTraceStrings.fs
import typingsSlinky.ddTrace.ddTraceStrings.graphql
import typingsSlinky.ddTrace.ddTraceStrings.grpc
import typingsSlinky.ddTrace.ddTraceStrings.hapi
import typingsSlinky.ddTrace.ddTraceStrings.http
import typingsSlinky.ddTrace.ddTraceStrings.http2
import typingsSlinky.ddTrace.ddTraceStrings.ioredis
import typingsSlinky.ddTrace.ddTraceStrings.knex
import typingsSlinky.ddTrace.ddTraceStrings.koa
import typingsSlinky.ddTrace.ddTraceStrings.memcached
import typingsSlinky.ddTrace.ddTraceStrings.mysql
import typingsSlinky.ddTrace.ddTraceStrings.mysql2
import typingsSlinky.ddTrace.ddTraceStrings.net
import typingsSlinky.ddTrace.ddTraceStrings.paperplane
import typingsSlinky.ddTrace.ddTraceStrings.pg
import typingsSlinky.ddTrace.ddTraceStrings.pino
import typingsSlinky.ddTrace.ddTraceStrings.promise
import typingsSlinky.ddTrace.ddTraceStrings.q
import typingsSlinky.ddTrace.ddTraceStrings.redis
import typingsSlinky.ddTrace.ddTraceStrings.restify
import typingsSlinky.ddTrace.ddTraceStrings.rhea
import typingsSlinky.ddTrace.ddTraceStrings.router
import typingsSlinky.ddTrace.ddTraceStrings.tedious
import typingsSlinky.ddTrace.ddTraceStrings.when
import typingsSlinky.ddTrace.ddTraceStrings.winston
import typingsSlinky.ddTrace.mod.plugins.awsSdk
import typingsSlinky.ddTrace.mod.plugins.cassandraDriver
import typingsSlinky.ddTrace.mod.plugins.genericPool
import typingsSlinky.ddTrace.mod.plugins.googleCloudPubsub
import typingsSlinky.ddTrace.mod.plugins.limitdClient
import typingsSlinky.ddTrace.mod.plugins.microgatewayCore
import typingsSlinky.ddTrace.mod.plugins.mongodbCore
import typingsSlinky.ddTrace.mod.plugins.promiseJs
import typingsSlinky.opentracing.tracerMod.SpanOptions
import typingsSlinky.opentracing.tracerMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracer_ extends Tracer {
  /**
    * Initializes the tracer. This should be called before importing other libraries.
    */
  def init(): this.type = js.native
  def init(options: TracerOptions): this.type = js.native
  /**
    * Injects the given SpanContext instance for cross-process propagation
    * within `carrier`
    * @param  {SpanContext} spanContext The SpanContext to inject into the
    *         carrier object. As a convenience, a Span instance may be passed
    *         in instead (in which case its .context() is used for the
    *         inject()).
    * @param  {string} format The format of the carrier.
    * @param  {any} carrier The carrier object.
    */
  def inject(spanContext: SpanContext, format: String, carrier: js.Any): Unit = js.native
  def inject(spanContext: Span, format: String, carrier: js.Any): Unit = js.native
  /**
    * Returns a reference to the current scope.
    */
  def scope(): Scope = js.native
  /**
    * Instruments a function by automatically creating a span activated on its
    * scope.
    *
    * The span will automatically be finished when one of these conditions is
    * met:
    *
    * * The function returns a promise, in which case the span will finish when
    * the promise is resolved or rejected.
    * * The function takes a callback as its second parameter, in which case the
    * span will finish when that callback is called.
    * * The function doesn't accept a callback and doesn't return a promise, in
    * which case the span will finish at the end of the function execution.
    *
    * If the `orphanable` option is set to false, the function will not be traced
    * unless there is already an active span or `childOf` option.
    */
  def trace[T](
    name: String,
    fn: js.Function2[
      /* span */ js.UndefOr[Span], 
      /* fn */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Error], _]], 
      T
    ]
  ): T = js.native
  def trace[T](
    name: String,
    options: TraceOptions with SpanOptions,
    fn: js.Function2[
      /* span */ js.UndefOr[Span], 
      /* done */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Error], String]], 
      T
    ]
  ): T = js.native
  /**
    * Enable and optionally configure a plugin.
    * @param plugin The name of a built-in plugin.
    * @param config Configuration options. Can also be `false` to disable the plugin.
    */
  @JSName("use")
  def use_amqp10(plugin: amqp10): this.type = js.native
  @JSName("use")
  def use_amqp10(plugin: amqp10, config: Boolean): this.type = js.native
  @JSName("use")
  def use_amqp10(plugin: amqp10, config: typingsSlinky.ddTrace.mod.plugins.amqp10): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: amqplib): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: amqplib, config: Boolean): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: amqplib, config: typingsSlinky.ddTrace.mod.plugins.amqplib): this.type = js.native
  @JSName("use")
  def use_awssdk(plugin: `aws-sdk`): this.type = js.native
  @JSName("use")
  def use_awssdk(plugin: `aws-sdk`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_awssdk(plugin: `aws-sdk`, config: awsSdk): this.type = js.native
  @JSName("use")
  def use_bluebird(plugin: bluebird): this.type = js.native
  @JSName("use")
  def use_bluebird(plugin: bluebird, config: Boolean): this.type = js.native
  @JSName("use")
  def use_bluebird(plugin: bluebird, config: typingsSlinky.ddTrace.mod.plugins.bluebird): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: bunyan): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: bunyan, config: Boolean): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: bunyan, config: typingsSlinky.ddTrace.mod.plugins.bunyan): this.type = js.native
  @JSName("use")
  def use_cassandradriver(plugin: `cassandra-driver`): this.type = js.native
  @JSName("use")
  def use_cassandradriver(plugin: `cassandra-driver`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_cassandradriver(plugin: `cassandra-driver`, config: cassandraDriver): this.type = js.native
  @JSName("use")
  def use_connect(plugin: connect): this.type = js.native
  @JSName("use")
  def use_connect(plugin: connect, config: Boolean): this.type = js.native
  @JSName("use")
  def use_connect(plugin: connect, config: typingsSlinky.ddTrace.mod.plugins.connect): this.type = js.native
  @JSName("use")
  def use_couchbase(plugin: couchbase): this.type = js.native
  @JSName("use")
  def use_couchbase(plugin: couchbase, config: Boolean): this.type = js.native
  @JSName("use")
  def use_couchbase(plugin: couchbase, config: typingsSlinky.ddTrace.mod.plugins.couchbase): this.type = js.native
  @JSName("use")
  def use_dns(plugin: dns): this.type = js.native
  @JSName("use")
  def use_dns(plugin: dns, config: Boolean): this.type = js.native
  @JSName("use")
  def use_dns(plugin: dns, config: typingsSlinky.ddTrace.mod.plugins.dns): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: elasticsearch): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: elasticsearch, config: Boolean): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: elasticsearch, config: typingsSlinky.ddTrace.mod.plugins.elasticsearch): this.type = js.native
  @JSName("use")
  def use_express(plugin: express): this.type = js.native
  @JSName("use")
  def use_express(plugin: express, config: Boolean): this.type = js.native
  @JSName("use")
  def use_express(plugin: express, config: typingsSlinky.ddTrace.mod.plugins.express): this.type = js.native
  @JSName("use")
  def use_fastify(plugin: fastify): this.type = js.native
  @JSName("use")
  def use_fastify(plugin: fastify, config: Boolean): this.type = js.native
  @JSName("use")
  def use_fastify(plugin: fastify, config: typingsSlinky.ddTrace.mod.plugins.fastify): this.type = js.native
  @JSName("use")
  def use_fs(plugin: fs): this.type = js.native
  @JSName("use")
  def use_fs(plugin: fs, config: Boolean): this.type = js.native
  @JSName("use")
  def use_fs(plugin: fs, config: typingsSlinky.ddTrace.mod.plugins.fs): this.type = js.native
  @JSName("use")
  def use_genericpool(plugin: `generic-pool`): this.type = js.native
  @JSName("use")
  def use_genericpool(plugin: `generic-pool`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_genericpool(plugin: `generic-pool`, config: genericPool): this.type = js.native
  @JSName("use")
  def use_googlecloudpubsub(plugin: `google-cloud-pubsub`): this.type = js.native
  @JSName("use")
  def use_googlecloudpubsub(plugin: `google-cloud-pubsub`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_googlecloudpubsub(plugin: `google-cloud-pubsub`, config: googleCloudPubsub): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: graphql): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: graphql, config: Boolean): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: graphql, config: typingsSlinky.ddTrace.mod.plugins.graphql): this.type = js.native
  @JSName("use")
  def use_grpc(plugin: grpc): this.type = js.native
  @JSName("use")
  def use_grpc(plugin: grpc, config: Boolean): this.type = js.native
  @JSName("use")
  def use_grpc(plugin: grpc, config: typingsSlinky.ddTrace.mod.plugins.grpc): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: hapi): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: hapi, config: Boolean): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: hapi, config: typingsSlinky.ddTrace.mod.plugins.hapi): this.type = js.native
  @JSName("use")
  def use_http(plugin: http): this.type = js.native
  @JSName("use")
  def use_http(plugin: http, config: Boolean): this.type = js.native
  @JSName("use")
  def use_http(plugin: http, config: typingsSlinky.ddTrace.mod.plugins.http): this.type = js.native
  @JSName("use")
  def use_http2(plugin: http2): this.type = js.native
  @JSName("use")
  def use_http2(plugin: http2, config: Boolean): this.type = js.native
  @JSName("use")
  def use_http2(plugin: http2, config: typingsSlinky.ddTrace.mod.plugins.http2): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ioredis): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ioredis, config: Boolean): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ioredis, config: typingsSlinky.ddTrace.mod.plugins.ioredis): this.type = js.native
  @JSName("use")
  def use_knex(plugin: knex): this.type = js.native
  @JSName("use")
  def use_knex(plugin: knex, config: Boolean): this.type = js.native
  @JSName("use")
  def use_knex(plugin: knex, config: typingsSlinky.ddTrace.mod.plugins.knex): this.type = js.native
  @JSName("use")
  def use_koa(plugin: koa): this.type = js.native
  @JSName("use")
  def use_koa(plugin: koa, config: Boolean): this.type = js.native
  @JSName("use")
  def use_koa(plugin: koa, config: typingsSlinky.ddTrace.mod.plugins.koa): this.type = js.native
  @JSName("use")
  def use_limitdclient(plugin: `limitd-client`): this.type = js.native
  @JSName("use")
  def use_limitdclient(plugin: `limitd-client`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_limitdclient(plugin: `limitd-client`, config: limitdClient): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: memcached): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: memcached, config: Boolean): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: memcached, config: typingsSlinky.ddTrace.mod.plugins.memcached): this.type = js.native
  @JSName("use")
  def use_microgatewaycore(plugin: `microgateway-core`): this.type = js.native
  @JSName("use")
  def use_microgatewaycore(plugin: `microgateway-core`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_microgatewaycore(plugin: `microgateway-core`, config: microgatewayCore): this.type = js.native
  @JSName("use")
  def use_mongodbcore(plugin: `mongodb-core`): this.type = js.native
  @JSName("use")
  def use_mongodbcore(plugin: `mongodb-core`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mongodbcore(plugin: `mongodb-core`, config: mongodbCore): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: mysql): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: mysql, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: mysql, config: typingsSlinky.ddTrace.mod.plugins.mysql): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: mysql2): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: mysql2, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: mysql2, config: typingsSlinky.ddTrace.mod.plugins.mysql2): this.type = js.native
  @JSName("use")
  def use_net(plugin: net): this.type = js.native
  @JSName("use")
  def use_net(plugin: net, config: Boolean): this.type = js.native
  @JSName("use")
  def use_net(plugin: net, config: typingsSlinky.ddTrace.mod.plugins.net): this.type = js.native
  @JSName("use")
  def use_paperplane(plugin: paperplane): this.type = js.native
  @JSName("use")
  def use_paperplane(plugin: paperplane, config: Boolean): this.type = js.native
  @JSName("use")
  def use_paperplane(plugin: paperplane, config: typingsSlinky.ddTrace.mod.plugins.paperplane): this.type = js.native
  @JSName("use")
  def use_pg(plugin: pg): this.type = js.native
  @JSName("use")
  def use_pg(plugin: pg, config: Boolean): this.type = js.native
  @JSName("use")
  def use_pg(plugin: pg, config: typingsSlinky.ddTrace.mod.plugins.pg): this.type = js.native
  @JSName("use")
  def use_pino(plugin: pino): this.type = js.native
  @JSName("use")
  def use_pino(plugin: pino, config: Boolean): this.type = js.native
  @JSName("use")
  def use_pino(plugin: pino, config: typingsSlinky.ddTrace.mod.plugins.pino): this.type = js.native
  @JSName("use")
  def use_promise(plugin: promise): this.type = js.native
  @JSName("use")
  def use_promise(plugin: promise, config: Boolean): this.type = js.native
  @JSName("use")
  def use_promise(plugin: promise, config: typingsSlinky.ddTrace.mod.plugins.promise): this.type = js.native
  @JSName("use")
  def use_promisejs(plugin: `promise-js`): this.type = js.native
  @JSName("use")
  def use_promisejs(plugin: `promise-js`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_promisejs(plugin: `promise-js`, config: promiseJs): this.type = js.native
  @JSName("use")
  def use_q(plugin: q): this.type = js.native
  @JSName("use")
  def use_q(plugin: q, config: Boolean): this.type = js.native
  @JSName("use")
  def use_q(plugin: q, config: typingsSlinky.ddTrace.mod.plugins.q): this.type = js.native
  @JSName("use")
  def use_redis(plugin: redis): this.type = js.native
  @JSName("use")
  def use_redis(plugin: redis, config: Boolean): this.type = js.native
  @JSName("use")
  def use_redis(plugin: redis, config: typingsSlinky.ddTrace.mod.plugins.redis): this.type = js.native
  @JSName("use")
  def use_restify(plugin: restify): this.type = js.native
  @JSName("use")
  def use_restify(plugin: restify, config: Boolean): this.type = js.native
  @JSName("use")
  def use_restify(plugin: restify, config: typingsSlinky.ddTrace.mod.plugins.restify): this.type = js.native
  @JSName("use")
  def use_rhea(plugin: rhea): this.type = js.native
  @JSName("use")
  def use_rhea(plugin: rhea, config: Boolean): this.type = js.native
  @JSName("use")
  def use_rhea(plugin: rhea, config: typingsSlinky.ddTrace.mod.plugins.rhea): this.type = js.native
  @JSName("use")
  def use_router(plugin: router): this.type = js.native
  @JSName("use")
  def use_router(plugin: router, config: Boolean): this.type = js.native
  @JSName("use")
  def use_router(plugin: router, config: typingsSlinky.ddTrace.mod.plugins.router): this.type = js.native
  @JSName("use")
  def use_tedious(plugin: tedious): this.type = js.native
  @JSName("use")
  def use_tedious(plugin: tedious, config: Boolean): this.type = js.native
  @JSName("use")
  def use_tedious(plugin: tedious, config: typingsSlinky.ddTrace.mod.plugins.tedious): this.type = js.native
  @JSName("use")
  def use_when(plugin: when): this.type = js.native
  @JSName("use")
  def use_when(plugin: when, config: Boolean): this.type = js.native
  @JSName("use")
  def use_when(plugin: when, config: typingsSlinky.ddTrace.mod.plugins.when): this.type = js.native
  @JSName("use")
  def use_winston(plugin: winston): this.type = js.native
  @JSName("use")
  def use_winston(plugin: winston, config: Boolean): this.type = js.native
  @JSName("use")
  def use_winston(plugin: winston, config: typingsSlinky.ddTrace.mod.plugins.winston): this.type = js.native
  /**
    * Wrap a function to automatically create a span activated on its
    * scope when it's called.
    *
    * The span will automatically be finished when one of these conditions is
    * met:
    *
    * * The function returns a promise, in which case the span will finish when
    * the promise is resolved or rejected.
    * * The function takes a callback as its last parameter, in which case the
    * span will finish when that callback is called.
    * * The function doesn't accept a callback and doesn't return a promise, in
    * which case the span will finish at the end of the function execution.
    */
  def wrap[T](name: String, fn: T): T = js.native
  def wrap[T](name: String, fn: T, requiresParent: Boolean): T = js.native
  def wrap[T](name: String, options: TraceOptions with SpanOptions, fn: T): T = js.native
  def wrap[T](name: String, options: js.Function1[/* repeated */ js.Any, TraceOptions with SpanOptions], fn: T): T = js.native
}

