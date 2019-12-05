package typingsSlinky.restify.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plugins {
  import typingsSlinky.restify.restifyMod.Request
  import typingsSlinky.restify.restifyMod.Response
  import typingsSlinky.restify.restifyMod.Route

  type AuditLoggerContext = js.Function4[/* req */ Request, /* res */ Response, /* route */ js.Any, /* error */ js.Any, js.Any]
  type MetricsCallback = js.Function5[
    /* err */ js.Error, 
    /* metrics */ MetricsCallbackOptions, 
    /* req */ Request, 
    /* res */ Response, 
    /* route */ Route, 
    Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.restify.restifyStrings.close
    - typings.restify.restifyStrings.aborted
    - `js.undefined`
    - scala.Nothing
  */
  type TMetricsCallback = js.UndefOr[_TMetricsCallback]
}
