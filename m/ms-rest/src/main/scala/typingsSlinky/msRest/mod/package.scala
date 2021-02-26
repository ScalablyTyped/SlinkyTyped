package typingsSlinky.msRest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ServiceCallback[TResult] = js.Function4[
    /* err */ js.Error | typingsSlinky.msRest.mod.ServiceError, 
    /* result */ js.UndefOr[TResult], 
    /* request */ js.UndefOr[typingsSlinky.msRest.mod.WebResource], 
    /* response */ js.UndefOr[typingsSlinky.node.httpMod.IncomingMessage], 
    scala.Unit
  ]
}
