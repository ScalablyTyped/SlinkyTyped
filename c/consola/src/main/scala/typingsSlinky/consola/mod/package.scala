package typingsSlinky.consola

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BrowserReporterOptions = js.Object
  
  type ConsolaMock = js.Function1[/* args */ js.Any, scala.Unit]
  
  type ConsolaMockFn = js.Function2[
    /* type */ typingsSlinky.consola.mod.logType, 
    /* defaults */ typingsSlinky.consola.mod.ConsolaLogObject, 
    typingsSlinky.consola.mod.ConsolaMock
  ]
  
  type Winston = js.Any
}
