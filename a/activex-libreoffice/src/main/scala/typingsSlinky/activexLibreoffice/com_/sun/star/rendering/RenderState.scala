package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure contains information passed to each {@link XCanvas} render operation.
  *
  * This structure contains information considered as the render state, i.e. the common setup required to render each individual {@link XCanvas}
  * primitive.
  * @since OOo 2.0
  */
@js.native
trait RenderState extends js.Object {
  
  /**
    * The affine transform associated with this render operation.
    *
    * This is used to transform coordinates of canvas primitives from user space to view space (from which they are subsequently transformed to device space
    * by the view transform).
    */
  var AffineTransform: AffineMatrix2D = js.native
  
  /**
    * The clipping area associated with this render operation.
    *
    * This clipping is interpreted in the user coordinate system, i.e. subject to the render state transform followed by the view transform before mapped to
    * device coordinate space.
    *
    * Specifying an empty interface denotes no clipping, i.e. everything rendered to the canvas will be visible (subject to device-dependent constraints, of
    * course). Specifying an empty {@link XPolyPolygon2D} , i.e. a poly-polygon containing zero polygons, or an {@link XPolyPolygon2D} with any number of
    * empty sub-polygons, denotes the NULL clip. That means, nothing rendered to the canvas will be visible.
    */
  var Clip: XPolyPolygon2D = js.native
  
  /**
    * The composition mode associated with this render operation.
    *
    * The composite mode determines in which way the primitive and possibly existing background is combined. The permissible values must be one out of the
    * {@link CompositeOperation} constants.
    */
  var CompositeOperation: Double = js.native
  
  /**
    * The device color associated with this render operation.
    *
    * Note that this need not be RGB here, but depends on the active device color space.
    * @see XGraphicDevice
    * @see XColorSpace
    */
  var DeviceColor: SafeArray[ColorComponent] = js.native
}
object RenderState {
  
  @scala.inline
  def apply(
    AffineTransform: AffineMatrix2D,
    Clip: XPolyPolygon2D,
    CompositeOperation: Double,
    DeviceColor: SafeArray[ColorComponent]
  ): RenderState = {
    val __obj = js.Dynamic.literal(AffineTransform = AffineTransform.asInstanceOf[js.Any], Clip = Clip.asInstanceOf[js.Any], CompositeOperation = CompositeOperation.asInstanceOf[js.Any], DeviceColor = DeviceColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderState]
  }
  
  @scala.inline
  implicit class RenderStateOps[Self <: RenderState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAffineTransform(value: AffineMatrix2D): Self = this.set("AffineTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClip(value: XPolyPolygon2D): Self = this.set("Clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeOperation(value: Double): Self = this.set("CompositeOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceColor(value: SafeArray[ColorComponent]): Self = this.set("DeviceColor", value.asInstanceOf[js.Any])
  }
}
