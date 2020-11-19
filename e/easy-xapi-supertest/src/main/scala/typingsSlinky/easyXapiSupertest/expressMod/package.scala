package typingsSlinky.easyXapiSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object expressMod {
  
  type Errback = js.Function1[/* err */ js.Error, scala.Unit]
  
  type ErrorRequestHandler = js.Function4[
    /* err */ js.Any, 
    /* req */ typingsSlinky.easyXapiSupertest.expressMod.Request, 
    /* res */ typingsSlinky.easyXapiSupertest.expressMod.Response, 
    /* next */ js.Function, 
    js.Any
  ]
  
  type Handler = typingsSlinky.easyXapiSupertest.expressMod.RequestHandler
  
  type RequestHandler = js.Function3[
    /* req */ typingsSlinky.easyXapiSupertest.expressMod.Request, 
    /* res */ typingsSlinky.easyXapiSupertest.expressMod.Response, 
    /* next */ js.Function, 
    js.Any
  ]
  
  type RequestParamHandler = js.Function4[
    /* req */ typingsSlinky.easyXapiSupertest.expressMod.Request, 
    /* res */ typingsSlinky.easyXapiSupertest.expressMod.Response, 
    /* next */ js.Function, 
    /* param */ js.Any, 
    js.Any
  ]
}
