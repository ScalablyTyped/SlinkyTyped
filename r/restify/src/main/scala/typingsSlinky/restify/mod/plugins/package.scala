package typingsSlinky.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plugins {
  type AuditLoggerContext = js.Function4[
    /* req */ typingsSlinky.restify.mod.Request, 
    /* res */ typingsSlinky.restify.mod.Response, 
    /* route */ js.Any, 
    /* error */ js.Any, 
    js.Any
  ]
  type MetricsCallback = js.Function5[
    /* err */ js.Error, 
    /* metrics */ typingsSlinky.restify.mod.plugins.MetricsCallbackOptions, 
    /* req */ typingsSlinky.restify.mod.Request, 
    /* res */ typingsSlinky.restify.mod.Response, 
    /* route */ typingsSlinky.restify.mod.Route, 
    scala.Unit
  ]
}
