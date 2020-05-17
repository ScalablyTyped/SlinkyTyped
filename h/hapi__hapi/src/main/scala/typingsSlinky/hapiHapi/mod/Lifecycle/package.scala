package typingsSlinky.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Lifecycle {
  /**
    * Lifecycle methods are the interface between the framework and the application. Many of the request lifecycle steps:
    * extensions, authentication, handlers, pre-handler methods, and failAction function values are lifecyle methods
    * provided by the developer and executed by the framework.
    * Each lifecycle method is a function with the signature await function(request, h, [err]) where:
    * * request - the request object.
    * * h - the response toolkit the handler must call to set a response and return control back to the framework.
    * * err - an error object availble only when the method is used as a failAction value.
    */
  type Method = js.Function3[
    /* request */ typingsSlinky.hapiHapi.mod.Request, 
    /* h */ typingsSlinky.hapiHapi.mod.ResponseToolkit, 
    /* err */ js.UndefOr[js.Error], 
    typingsSlinky.hapiHapi.mod.Lifecycle.ReturnValue
  ]
}
