package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.SegmentDrawAction
import typingsSlinky.arcgisJsApi.esri.SegmentDrawActionConstructor
import typingsSlinky.arcgisJsApi.esri.SegmentDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentDrawActionMod extends Shortcut {
  
  @JSImport("esri/views/draw/SegmentDrawAction", JSImport.Namespace)
  @js.native
  val ^ : SegmentDrawActionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/draw/SegmentDrawAction", JSImport.Namespace)
  @js.native
  class Class () extends SegmentDrawAction {
    def this(properties: SegmentDrawActionProperties) = this()
  }
  
  type _To = SegmentDrawActionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `segmentDrawActionMod.foo` */
  override def _to: SegmentDrawActionConstructor = ^
}
