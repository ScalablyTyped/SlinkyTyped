package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.Clonable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify/dts/container/lookup", JSImport.Namespace)
@js.native
object lookupMod extends js.Object {
  
  @js.native
  class Lookup[T /* <: Clonable[T] */] ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.Lookup[T] {
    
    var _map: js.Any = js.native
  }
}
