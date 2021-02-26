package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.DataFile
import typingsSlinky.arcgisJsApi.esri.DataFileConstructor
import typingsSlinky.arcgisJsApi.esri.DataFileProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataFileMod extends Shortcut {
  
  @JSImport("esri/tasks/support/DataFile", JSImport.Namespace)
  @js.native
  val ^ : DataFileConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/DataFile", JSImport.Namespace)
  @js.native
  class Class () extends DataFile {
    def this(properties: DataFileProperties) = this()
  }
  
  type _To = DataFileConstructor
  
  /* This means you don't have to write `^`, but can instead just say `dataFileMod.foo` */
  override def _to: DataFileConstructor = ^
}
