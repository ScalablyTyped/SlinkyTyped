package typingsSlinky.ol

import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/reproj/Image", JSImport.Namespace)
@js.native
object reprojImageMod extends js.Object {
  @js.native
  trait ReprojImage
    extends typingsSlinky.ol.imageBaseMod.default {
    def getProjection(): typingsSlinky.ol.projProjectionMod.default = js.native
  }
  
  @js.native
  class default protected () extends ReprojImage {
    def this(
      sourceProj: typingsSlinky.ol.projProjectionMod.default,
      targetProj: typingsSlinky.ol.projProjectionMod.default,
      targetExtent: Extent,
      targetResolution: Double,
      pixelRatio: Double,
      getImageFunction: FunctionType
    ) = this()
  }
  
  type FunctionType = js.Function3[
    /* p0 */ Extent, 
    /* p1 */ Double, 
    /* p2 */ Double, 
    typingsSlinky.ol.imageBaseMod.default
  ]
}

