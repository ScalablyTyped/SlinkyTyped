package typingsSlinky.natUpnp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CB[T] = js.Function2[/* err */ js.Error | scala.Null, /* res */ js.UndefOr[T], scala.Unit]
  
  type DeletePortMappingOpts = typingsSlinky.natUpnp.mod.StandardOpts
  
  type RawResponse = typingsSlinky.std.Partial[typingsSlinky.std.Record[java.lang.String, typingsSlinky.natUpnp.anon.Dictkey]]
}
