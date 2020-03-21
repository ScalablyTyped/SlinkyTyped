package typingsSlinky.ddTrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plugins {
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
    * [connect](https://github.com/senchalabs/connect) module.
    */
  type connect = typingsSlinky.ddTrace.mod.plugins.HttpServer
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
    * This plugin patches the [generic-pool](https://github.com/coopernurse/node-pool)
    * module to bind the callbacks the the caller context.
    */
  type genericPool = typingsSlinky.ddTrace.mod.plugins.Integration
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
    * [router](https://github.com/pillarjs/router) module.
    */
  type router = typingsSlinky.ddTrace.mod.plugins.Integration
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
