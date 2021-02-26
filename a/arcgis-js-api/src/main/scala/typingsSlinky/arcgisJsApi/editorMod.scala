package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Editor
import typingsSlinky.arcgisJsApi.esri.EditorConstructor
import typingsSlinky.arcgisJsApi.esri.EditorProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor", JSImport.Namespace)
  @js.native
  val ^ : EditorConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor", JSImport.Namespace)
  @js.native
  /**
    * This widget provides an out-of-the-box editing experience to help streamline the editing experience within a web application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html)
    */
  class Class () extends Editor {
    def this(properties: EditorProperties) = this()
  }
  
  type _To = EditorConstructor
  
  /* This means you don't have to write `^`, but can instead just say `editorMod.foo` */
  override def _to: EditorConstructor = ^
}
