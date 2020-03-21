package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.builderTypeMod.BuilderType
import typingsSlinky.ol.canvasMod.DeclutterGroups
import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/BuilderGroup", JSImport.Namespace)
@js.native
object builderGroupMod extends js.Object {
  @js.native
  trait BuilderGroup extends js.Object {
    def addDeclutter(group: Boolean): DeclutterGroups = js.native
    def finish(): StringDictionary[typingsSlinky.ol.olStrings.BuilderGroup with js.Any] = js.native
    def getBuilder(zIndex: js.UndefOr[scala.Nothing], builderType: BuilderType): typingsSlinky.ol.vectorContextMod.default = js.native
    def getBuilder(zIndex: Double, builderType: BuilderType): typingsSlinky.ol.vectorContextMod.default = js.native
  }
  
  @js.native
  class default protected () extends BuilderGroup {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double, declutter: Boolean) = this()
  }
  
}

