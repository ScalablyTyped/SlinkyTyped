package typingsSlinky.emberArray

import typingsSlinky.emberArray.mutableMod.MutableArray
import typingsSlinky.emberObject.copyableMod.Copyable
import typingsSlinky.emberObject.observableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/array/types/prototype-extensions", JSImport.Namespace)
@js.native
object prototypeExtensionsMod extends js.Object {
  @js.native
  trait ArrayPrototypeExtensions[T]
    extends MutableArray[T]
       with Observable
       with Copyable
  
}

