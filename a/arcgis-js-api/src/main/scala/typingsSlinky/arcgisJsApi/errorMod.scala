package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Error
import typingsSlinky.arcgisJsApi.esri.ErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod extends Shortcut {
  
  @JSImport("esri/core/Error", JSImport.Namespace)
  @js.native
  val ^ : ErrorConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/core/Error", JSImport.Namespace)
  @js.native
  class Class protected () extends Error {
    def this(name: String) = this()
    def this(name: String, message: String) = this()
    def this(name: String, message: js.UndefOr[scala.Nothing], details: js.Any) = this()
    def this(name: String, message: String, details: js.Any) = this()
  }
  
  type _To = ErrorConstructor
  
  /* This means you don't have to write `^`, but can instead just say `errorMod.foo` */
  override def _to: ErrorConstructor = ^
}
