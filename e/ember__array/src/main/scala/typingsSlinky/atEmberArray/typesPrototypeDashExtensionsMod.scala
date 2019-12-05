package typingsSlinky.atEmberArray

import typingsSlinky.atEmberArray.mutableMod.MutableArray
import typingsSlinky.atEmberObject.dashPrivateCopyableMod.Copyable
import typingsSlinky.atEmberObject.observableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/array/types/prototype-extensions", JSImport.Namespace)
@js.native
object typesPrototypeDashExtensionsMod extends js.Object {
  @js.native
  trait ArrayPrototypeExtensions[T]
    extends MutableArray[T]
       with Observable
       with Copyable
  
}

