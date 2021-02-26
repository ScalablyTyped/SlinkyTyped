package typingsSlinky.emberArray

import typingsSlinky.emberArray.mutableMod.MutableArray
import typingsSlinky.emberObject.copyableMod.Copyable
import typingsSlinky.emberObject.observableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prototypeExtensionsMod {
  
  @js.native
  trait ArrayPrototypeExtensions[T]
    extends MutableArray[T]
       with Observable
       with Copyable
}
