package typingsSlinky.getUri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GetUriCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* res */ js.UndefOr[typingsSlinky.node.streamMod.Readable], 
    scala.Unit
  ]
  
  type GetUriProtocol = js.Function2[
    /* parsed */ typingsSlinky.node.urlMod.UrlWithStringQuery, 
    /* opts */ typingsSlinky.getUri.mod.GetUriOptions, 
    js.Promise[typingsSlinky.node.streamMod.Readable]
  ]
}
