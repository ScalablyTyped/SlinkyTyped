package typingsSlinky.qIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object QioHTTP {
  
  type Application = js.Function1[/* req */ typingsSlinky.qIo.QioHTTP.Request, typingsSlinky.q.mod.Promise[js.Any]]
  
  type Body = typingsSlinky.qIo.Qio.Stream
  
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
}
