package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.c128
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.c64
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.f32
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.f64
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.s16
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.s32
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.s8
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u1
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u16
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u2
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u32
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u4
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u8
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterFunction
  extends Accessor
     with JSONSupport {
  /**
    * The arguments for the raster function. The structure depends on the function specified. See [raster functions](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm) for a list of functions and their arguments. Also parses the arguments of RFT format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionArguments)
    */
  var functionArguments: js.Any = js.native
  /**
    * The raster function name. See [raster functions](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm) for a list of functions and their arguments. The name in the raster function in RFT JSON format is also parsed to functionName.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionName)
    */
  var functionName: String = js.native
  /**
    * Defines the pixel type of the output image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#outputPixelType)
    *
    * @default unknown
    */
  var outputPixelType: c128 | c64 | f32 | f64 | s16 | s32 | s8 | u1 | u16 | u2 | u32 | u4 | u8 | unknown = js.native
  /**
    * The variable name for the raster function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#variableName)
    */
  var variableName: String = js.native
}

@JSGlobal("__esri.RasterFunction")
@js.native
object RasterFunction extends TopLevel[RasterFunctionConstructor]

