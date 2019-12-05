package typingsSlinky.ddDashTrace.ddDashTraceMod

import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.amqp10
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.amqplib
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.bluebird
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.bunyan
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.cassandra_driver
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.connect
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.couchbase
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.dns
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.elasticsearch
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.express
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.fastify
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.generic_pool
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.graphql
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.grpc
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.hapi
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.http
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.http2
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.ioredis
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.knex
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.koa
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.limitd_client
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.memcached
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.mongodb_core
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.mysql
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.mysql2
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.net
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.paperplane
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.pg
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.pino
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.promise
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.promise_js
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.q
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.redis
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.restify
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.router
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.tedious
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.when
import typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.winston
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait Plugins extends js.Object {
  var amqp10: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.amqp10
  var amqplib: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.amqplib
  var bluebird: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.bluebird
  var bunyan: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.bunyan
  var `cassandra-driver`: cassandra_driver
  var connect: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.connect
  var couchbase: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.couchbase
  var dns: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.dns
  var elasticsearch: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.elasticsearch
  var express: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.express
  var fastify: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.fastify
  var `generic-pool`: generic_pool
  var graphql: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.graphql
  var grpc: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.grpc
  var hapi: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.hapi
  var http: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.http
  var http2: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.http2
  var ioredis: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.ioredis
  var knex: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.knex
  var koa: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.koa
  var `limitd-client`: limitd_client
  var memcached: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.memcached
  var `mongodb-core`: mongodb_core
  var mysql: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.mysql
  var mysql2: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.mysql2
  var net: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.net
  var paperplane: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.paperplane
  var pg: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.pg
  var pino: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.pino
  var promise: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.promise
  var `promise-js`: promise_js
  var q: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.q
  var redis: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.redis
  var restify: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.restify
  var router: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.router
  var tedious: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.tedious
  var when: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.when
  var winston: typingsSlinky.ddDashTrace.ddDashTraceMod.plugins.winston
}

object Plugins {
  @scala.inline
  def apply(
    amqp10: amqp10,
    amqplib: amqplib,
    bluebird: bluebird,
    bunyan: bunyan,
    `cassandra-driver`: cassandra_driver,
    connect: connect,
    couchbase: couchbase,
    dns: dns,
    elasticsearch: elasticsearch,
    express: express,
    fastify: fastify,
    `generic-pool`: generic_pool,
    graphql: graphql,
    grpc: grpc,
    hapi: hapi,
    http: http,
    http2: http2,
    ioredis: ioredis,
    knex: knex,
    koa: koa,
    `limitd-client`: limitd_client,
    memcached: memcached,
    `mongodb-core`: mongodb_core,
    mysql: mysql,
    mysql2: mysql2,
    net: net,
    paperplane: paperplane,
    pg: pg,
    pino: pino,
    promise: promise,
    `promise-js`: promise_js,
    q: q,
    redis: redis,
    restify: restify,
    router: router,
    tedious: tedious,
    when: when,
    winston: winston
  ): Plugins = {
    val __obj = js.Dynamic.literal(amqp10 = amqp10.asInstanceOf[js.Any], amqplib = amqplib.asInstanceOf[js.Any], bluebird = bluebird.asInstanceOf[js.Any], bunyan = bunyan.asInstanceOf[js.Any], connect = connect.asInstanceOf[js.Any], couchbase = couchbase.asInstanceOf[js.Any], dns = dns.asInstanceOf[js.Any], elasticsearch = elasticsearch.asInstanceOf[js.Any], express = express.asInstanceOf[js.Any], fastify = fastify.asInstanceOf[js.Any], graphql = graphql.asInstanceOf[js.Any], grpc = grpc.asInstanceOf[js.Any], hapi = hapi.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], http2 = http2.asInstanceOf[js.Any], ioredis = ioredis.asInstanceOf[js.Any], knex = knex.asInstanceOf[js.Any], koa = koa.asInstanceOf[js.Any], memcached = memcached.asInstanceOf[js.Any], mysql = mysql.asInstanceOf[js.Any], mysql2 = mysql2.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], paperplane = paperplane.asInstanceOf[js.Any], pg = pg.asInstanceOf[js.Any], pino = pino.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any], restify = restify.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], tedious = tedious.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any], winston = winston.asInstanceOf[js.Any])
    __obj.updateDynamic("cassandra-driver")(`cassandra-driver`.asInstanceOf[js.Any])
    __obj.updateDynamic("generic-pool")(`generic-pool`.asInstanceOf[js.Any])
    __obj.updateDynamic("limitd-client")(`limitd-client`.asInstanceOf[js.Any])
    __obj.updateDynamic("mongodb-core")(`mongodb-core`.asInstanceOf[js.Any])
    __obj.updateDynamic("promise-js")(`promise-js`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
}

