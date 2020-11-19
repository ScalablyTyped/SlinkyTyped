package typingsSlinky.compression.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("compression", "filter")
@js.native
object filter extends js.Object {
  
  /**
    * The default `filter` function. This is used to construct a custom filter function that is an extension of the default function.
    *
    * ```js
    * var compression = require('compression')
    * var express = require('express')
    *
    * var app = express()
    * app.use(compression({ filter: shouldCompress }))
    *
    * function shouldCompress (req, res) {
    *   if (req.headers['x-no-compression']) {
    *     // don't compress responses with this request header
    *     return false
    *   }
    *
    *   // fallback to standard filter function
    *   return compression.filter(req, res)
    * }
    * ```
    *
    * @see {@link https://github.com/expressjs/compression#filter-1|`.filter` documentation}
    */
  def apply(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Boolean = js.native
}
