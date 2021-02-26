package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Edits
import typingsSlinky.arcgisJsApi.esri.EditsConstructor
import typingsSlinky.arcgisJsApi.esri.EditsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editsMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/Edits", JSImport.Namespace)
  @js.native
  val ^ : EditsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/Edits", JSImport.Namespace)
  @js.native
  class Class () extends Edits {
    def this(properties: EditsProperties) = this()
  }
  
  type _To = EditsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `editsMod.foo` */
  override def _to: EditsConstructor = ^
}
