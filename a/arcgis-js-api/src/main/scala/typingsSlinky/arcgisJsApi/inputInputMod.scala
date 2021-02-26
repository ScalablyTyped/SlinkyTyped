package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.inputInput
import typingsSlinky.arcgisJsApi.esri.inputInputConstructor
import typingsSlinky.arcgisJsApi.esri.inputInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputInputMod extends Shortcut {
  
  @JSImport("esri/views/input/Input", JSImport.Namespace)
  @js.native
  val ^ : inputInputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/input/Input", JSImport.Namespace)
  @js.native
  class Class () extends inputInput {
    def this(properties: inputInputProperties) = this()
  }
  
  type _To = inputInputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `inputInputMod.foo` */
  override def _to: inputInputConstructor = ^
}
