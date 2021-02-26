package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.BufferParameters
import typingsSlinky.arcgisJsApi.esri.BufferParametersConstructor
import typingsSlinky.arcgisJsApi.esri.BufferParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/BufferParameters", JSImport.Namespace)
  @js.native
  val ^ : BufferParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/BufferParameters", JSImport.Namespace)
  @js.native
  class Class () extends BufferParameters {
    def this(properties: BufferParametersProperties) = this()
  }
  
  type _To = BufferParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `bufferParametersMod.foo` */
  override def _to: BufferParametersConstructor = ^
}
