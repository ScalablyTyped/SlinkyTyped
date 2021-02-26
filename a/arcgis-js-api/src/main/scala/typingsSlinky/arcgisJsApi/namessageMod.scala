package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.NAMessage
import typingsSlinky.arcgisJsApi.esri.NAMessageConstructor
import typingsSlinky.arcgisJsApi.esri.NAMessageProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namessageMod extends Shortcut {
  
  @JSImport("esri/tasks/support/NAMessage", JSImport.Namespace)
  @js.native
  val ^ : NAMessageConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/NAMessage", JSImport.Namespace)
  @js.native
  class Class () extends NAMessage {
    def this(properties: NAMessageProperties) = this()
  }
  
  type _To = NAMessageConstructor
  
  /* This means you don't have to write `^`, but can instead just say `namessageMod.foo` */
  override def _to: NAMessageConstructor = ^
}
