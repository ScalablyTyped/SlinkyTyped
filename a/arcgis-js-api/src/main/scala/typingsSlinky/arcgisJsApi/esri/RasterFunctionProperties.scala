package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.c128
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.c64
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.f32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.f64
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.s16
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.s32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.s8
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u1
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u16
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u2
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u4
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.u8
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterFunctionProperties extends StObject {
  
  /**
    * The arguments for the raster function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionArguments)
    */
  var functionArguments: js.UndefOr[js.Any] = js.native
  
  /**
    * The raster function name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionName)
    */
  var functionName: js.UndefOr[String] = js.native
  
  /**
    * Defines the pixel type of the output image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#outputPixelType)
    */
  var outputPixelType: js.UndefOr[
    c128 | c64 | f32 | f64 | s16 | s32 | s8 | u1 | u16 | u2 | u32 | u4 | u8 | unknown
  ] = js.native
  
  /**
    * The variable name for the raster function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#variableName)
    */
  var variableName: js.UndefOr[String] = js.native
}
object RasterFunctionProperties {
  
  @scala.inline
  def apply(): RasterFunctionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterFunctionProperties]
  }
  
  @scala.inline
  implicit class RasterFunctionPropertiesMutableBuilder[Self <: RasterFunctionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionArguments(value: js.Any): Self = StObject.set(x, "functionArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionArgumentsUndefined: Self = StObject.set(x, "functionArguments", js.undefined)
    
    @scala.inline
    def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    @scala.inline
    def setOutputPixelType(value: c128 | c64 | f32 | f64 | s16 | s32 | s8 | u1 | u16 | u2 | u32 | u4 | u8 | unknown): Self = StObject.set(x, "outputPixelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputPixelTypeUndefined: Self = StObject.set(x, "outputPixelType", js.undefined)
    
    @scala.inline
    def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableNameUndefined: Self = StObject.set(x, "variableName", js.undefined)
  }
}
