package typingsSlinky.ddTrace.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object plugins {
  
  /**
    * This plugin automatically instruments the
    * [amqp10](https://github.com/noodlefrenzy/node-amqp10) module.
    */
  type amqp10 = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin automatically instruments the
    * [amqplib](https://github.com/squaremo/amqp.node) module.
    */
  type amqplib = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin patches the [bluebird](https://github.com/petkaantonov/bluebird)
    * module to bind the promise callback the the caller context.
    */
  type bluebird = typingsSlinky.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin patches the [bunyan](https://github.com/trentm/node-bunyan)
    * to automatically inject trace identifiers in log records when the
    * [logInjection](interfaces/traceroptions.html#logInjection) option is enabled
    * on the tracer.
    */
  type bunyan = typingsSlinky.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin automatically instruments the
    * [cassandra-driver](https://github.com/datastax/nodejs-driver) module.
    */
  type cassandraDriver = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin automatically instruments the
    * [connect](https://github.com/senchalabs/connect) module.
    */
  type connect = typingsSlinky.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin automatically instruments the
    * [couchbase](https://www.npmjs.com/package/couchbase) module.
    */
  type couchbase = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin automatically instruments the
    * [dns](https://nodejs.org/api/dns.html) module.
    */
  type dns = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin automatically instruments the
    * [express](http://expressjs.com/) module.
    */
  type express = typingsSlinky.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin automatically instruments the
    * [fastify](https://www.fastify.io/) module.
    */
  type fastify = typingsSlinky.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin automatically instruments the
    * [fs](https://nodejs.org/api/fs.html) module.
    */
  type fs = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin patches the [generic-pool](https://github.com/coopernurse/node-pool)
    * module to bind the callbacks the the caller context.
    */
  type genericPool = typingsSlinky.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin automatically instruments the
    * [@google-cloud/pubsub](https://github.com/googleapis/nodejs-pubsub) module.
    */
  type googleCloudPubsub = typingsSlinky.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin automatically instruments the
    * [hapi](https://hapijs.com/) module.
    */
  type hapi = typingsSlinky.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin patches the [knex](https://knexjs.org/)
    * module to bind the promise callback the the caller context.
    */
  type knex = typingsSlinky.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin automatically instruments the
    * [koa](https://koajs.com/) module.
    */
  type koa = typingsSlinky.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin automatically instruments the
    * [limitd-client](https://github.com/limitd/node-client) module.
    */
  type limitdClient = typingsSlinky.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin automatically instruments the
    * [memcached](https://github.com/3rd-Eden/memcached) module.
    */
  type memcached = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin automatically instruments the
    * [microgateway-core](https://github.com/apigee/microgateway-core) module.
    */
  type microgatewayCore = typingsSlinky.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin automatically instruments the
    * [mongodb-core](https://github.com/mongodb-js/mongodb-core) module.
    */
  type mongodbCore = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin automatically instruments the
    * [mongoose](https://mongoosejs.com/) module.
    */
  type mongoose = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin automatically instruments the
    * [mysql](https://github.com/mysqljs/mysql) module.
    */
  type mysql = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin automatically instruments the
    * [mysql2](https://github.com/brianmario/mysql2) module.
    */
  type mysql2 = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin automatically instruments the
    * [net](https://nodejs.org/api/net.html) module.
    */
  type net = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin automatically instruments the
    * [paperplane](https://github.com/articulate/paperplane) module.
    */
  type paperplane = typingsSlinky.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin patches the [pino](http://getpino.io)
    * to automatically inject trace identifiers in log records when the
    * [logInjection](interfaces/traceroptions.html#logInjection) option is enabled
    * on the tracer.
    */
  type pino = typingsSlinky.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin patches the [promise](https://github.com/then/promise)
    * module to bind the promise callback the the caller context.
    */
  type promise = typingsSlinky.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin patches the [promise-js](https://github.com/kevincennis/promise)
    * module to bind the promise callback the the caller context.
    */
  type promiseJs = typingsSlinky.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin patches the [q](https://github.com/kriskowal/q)
    * module to bind the promise callback the the caller context.
    */
  type q = typingsSlinky.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin automatically instruments the
    * [restify](http://restify.com/) module.
    */
  type restify = typingsSlinky.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin automatically instruments the
    * [rhea](https://github.com/amqp/rhea) module.
    */
  type rhea = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin automatically instruments the
    * [router](https://github.com/pillarjs/router) module.
    */
  type router = typingsSlinky.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin automatically instruments the
    * [tedious](https://github.com/tediousjs/tedious/) module.
    */
  type tedious = typingsSlinky.ddTrace.mod.plugins.Instrumentation
  
  /**
    * This plugin patches the [when](https://github.com/cujojs/when)
    * module to bind the promise callback the the caller context.
    */
  type when = typingsSlinky.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin patches the [winston](https://github.com/winstonjs/winston)
    * to automatically inject trace identifiers in log records when the
    * [logInjection](interfaces/traceroptions.html#logInjection) option is enabled
    * on the tracer.
    */
  type winston = typingsSlinky.ddTrace.mod.plugins.Integration
}
