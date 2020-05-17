package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealBezierSegment2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides access to a graphic device, such as a printer, or a screen device. Every canvas (
  * @see XCanvas) has exactly one associated graphic device, into which its output is rendered. For a typical windowing system, the graphic device is equi
  */
@js.native
trait XGraphicDevice extends XInterface {
  /**
    * Query the controller for multi buffering functionality on this graphic device.
    *
    * If there is no such functionality available, the NULL reference is returned.
    */
  val BufferController: XBufferController = js.native
  /**
    * Query the color space interface for this graphic device.
    *
    * This is to be used when interpreting or setting device color values.
    */
  val DeviceColorSpace: XColorSpace = js.native
  /**
    * Get a reference to this device's parametric polygon factory.
    * @returns a reference to this device's parametric polygon factory. Although it is possible to use parametric polygons on all canvases, regardless of the as
    */
  val ParametricPolyPolygonFactory: XMultiServiceFactory = js.native
  /**
    * Query the physical resolution of the device in pixel per millimeter.
    *
    * A special floating point value of +infinity here indicates "unknown", i.e. at the time of rendering undetermined or possibly infinite resolution along
    * the corresponding direction.
    */
  val PhysicalResolution: RealSize2D = js.native
  /**
    * Query the physical dimensions of the device in millimeter.
    *
    * A special floating point value of +infinity here indicates "unknown", i.e. at the time of rendering undetermined or possibly infinite resolution along
    * the corresponding direction.
    * @see XBitmap.getSize()
    */
  val PhysicalSize: RealSize2D = js.native
  /**
    * Create a bitmap with alpha channel whose memory layout and sample model is compatible to the graphic device.
    * @param size Size of the requested bitmap in pixel. Both components of the size must be greater than 0
    */
  def createCompatibleAlphaBitmap(size: IntegerSize2D): XBitmap = js.native
  /**
    * Create a Bezier poly-polygon which can internally use device-optimized representations already.
    * @param points The points of the poly-polygon, in a separate array for every polygon.
    */
  def createCompatibleBezierPolyPolygon(points: SeqEquiv[SeqEquiv[RealBezierSegment2D]]): XBezierPolyPolygon2D = js.native
  /**
    * Create a bitmap whose memory layout and sample model is compatible to the graphic device.
    * @param size Size of the requested bitmap in pixel. Both components of the size must be greater than 0
    */
  def createCompatibleBitmap(size: IntegerSize2D): XBitmap = js.native
  /**
    * Create a line poly-polygon which can internally use device-optimized representations already.
    * @param points The points of the poly-polygon, in a separate array for every polygon.
    */
  def createCompatibleLinePolyPolygon(points: SeqEquiv[SeqEquiv[RealPoint2D]]): XLinePolyPolygon2D = js.native
  /**
    * Create a volatile bitmap with alpha channel that is usable with this graphic device.
    *
    * A volatile bitmap's difference in comparison to a plain bitmap (e.g. generated via {@link createCompatibleBitmap()} ) is the fact that its content
    * might vanish at any point in time (making any operation with them produce a {@link VolatileContentDestroyedException} ). The benefit, on the other
    * hand, is that they might be easy to hardware-accelerate on certain platforms, without the need to keep a safety copy of the content internally.
    * @param size Size of the requested bitmap in pixel. Both components of the size must be greater than 0
    */
  def createVolatileAlphaBitmap(size: IntegerSize2D): XVolatileBitmap = js.native
  /**
    * Create a volatile bitmap that is usable with this graphic device.
    *
    * A volatile bitmap's difference in comparison to a plain bitmap (e.g. generated via {@link createCompatibleBitmap()} ) is the fact that its content
    * might vanish at any point in time (making any operation with them produce a {@link VolatileContentDestroyedException} ). The benefit, on the other
    * hand, is that they might be easy to hardware-accelerate on certain platforms, without the need to keep a safety copy of the content internally.
    * @param size Size of the requested bitmap in pixel. Both components of the size must be greater than 0
    */
  def createVolatileBitmap(size: IntegerSize2D): XVolatileBitmap = js.native
  /** Enter or leave the fullscreen mode, if possible. The return value denotes the success of the operation. */
  def enterFullScreenMode(bEnter: Boolean): Boolean = js.native
  /**
    * Query the controller for multi buffering functionality on this graphic device.
    *
    * If there is no such functionality available, the NULL reference is returned.
    */
  def getBufferController(): XBufferController = js.native
  /**
    * Query the color space interface for this graphic device.
    *
    * This is to be used when interpreting or setting device color values.
    */
  def getDeviceColorSpace(): XColorSpace = js.native
  /**
    * Get a reference to this device's parametric polygon factory.
    * @returns a reference to this device's parametric polygon factory. Although it is possible to use parametric polygons on all canvases, regardless of the as
    */
  def getParametricPolyPolygonFactory(): XMultiServiceFactory = js.native
  /**
    * Query the physical resolution of the device in pixel per millimeter.
    *
    * A special floating point value of +infinity here indicates "unknown", i.e. at the time of rendering undetermined or possibly infinite resolution along
    * the corresponding direction.
    */
  def getPhysicalResolution(): RealSize2D = js.native
  /**
    * Query the physical dimensions of the device in millimeter.
    *
    * A special floating point value of +infinity here indicates "unknown", i.e. at the time of rendering undetermined or possibly infinite resolution along
    * the corresponding direction.
    * @see XBitmap.getSize()
    */
  def getPhysicalSize(): RealSize2D = js.native
  /** Tells whether this graphic device has a full screen mode, i.e. whether a window can cover the whole screen exclusively. */
  def hasFullScreenMode(): Boolean = js.native
}

object XGraphicDevice {
  @scala.inline
  def apply(
    BufferController: XBufferController,
    DeviceColorSpace: XColorSpace,
    ParametricPolyPolygonFactory: XMultiServiceFactory,
    PhysicalResolution: RealSize2D,
    PhysicalSize: RealSize2D,
    acquire: () => Unit,
    createCompatibleAlphaBitmap: IntegerSize2D => XBitmap,
    createCompatibleBezierPolyPolygon: SeqEquiv[SeqEquiv[RealBezierSegment2D]] => XBezierPolyPolygon2D,
    createCompatibleBitmap: IntegerSize2D => XBitmap,
    createCompatibleLinePolyPolygon: SeqEquiv[SeqEquiv[RealPoint2D]] => XLinePolyPolygon2D,
    createVolatileAlphaBitmap: IntegerSize2D => XVolatileBitmap,
    createVolatileBitmap: IntegerSize2D => XVolatileBitmap,
    enterFullScreenMode: Boolean => Boolean,
    getBufferController: () => XBufferController,
    getDeviceColorSpace: () => XColorSpace,
    getParametricPolyPolygonFactory: () => XMultiServiceFactory,
    getPhysicalResolution: () => RealSize2D,
    getPhysicalSize: () => RealSize2D,
    hasFullScreenMode: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGraphicDevice = {
    val __obj = js.Dynamic.literal(BufferController = BufferController.asInstanceOf[js.Any], DeviceColorSpace = DeviceColorSpace.asInstanceOf[js.Any], ParametricPolyPolygonFactory = ParametricPolyPolygonFactory.asInstanceOf[js.Any], PhysicalResolution = PhysicalResolution.asInstanceOf[js.Any], PhysicalSize = PhysicalSize.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createCompatibleAlphaBitmap = js.Any.fromFunction1(createCompatibleAlphaBitmap), createCompatibleBezierPolyPolygon = js.Any.fromFunction1(createCompatibleBezierPolyPolygon), createCompatibleBitmap = js.Any.fromFunction1(createCompatibleBitmap), createCompatibleLinePolyPolygon = js.Any.fromFunction1(createCompatibleLinePolyPolygon), createVolatileAlphaBitmap = js.Any.fromFunction1(createVolatileAlphaBitmap), createVolatileBitmap = js.Any.fromFunction1(createVolatileBitmap), enterFullScreenMode = js.Any.fromFunction1(enterFullScreenMode), getBufferController = js.Any.fromFunction0(getBufferController), getDeviceColorSpace = js.Any.fromFunction0(getDeviceColorSpace), getParametricPolyPolygonFactory = js.Any.fromFunction0(getParametricPolyPolygonFactory), getPhysicalResolution = js.Any.fromFunction0(getPhysicalResolution), getPhysicalSize = js.Any.fromFunction0(getPhysicalSize), hasFullScreenMode = js.Any.fromFunction0(hasFullScreenMode), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGraphicDevice]
  }
  @scala.inline
  implicit class XGraphicDeviceOps[Self <: XGraphicDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferController(value: XBufferController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufferController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceColorSpace(value: XColorSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceColorSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParametricPolyPolygonFactory(value: XMultiServiceFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParametricPolyPolygonFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysicalResolution(value: RealSize2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysicalSize(value: RealSize2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateCompatibleAlphaBitmap(value: IntegerSize2D => XBitmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCompatibleAlphaBitmap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateCompatibleBezierPolyPolygon(value: SeqEquiv[SeqEquiv[RealBezierSegment2D]] => XBezierPolyPolygon2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCompatibleBezierPolyPolygon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateCompatibleBitmap(value: IntegerSize2D => XBitmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCompatibleBitmap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateCompatibleLinePolyPolygon(value: SeqEquiv[SeqEquiv[RealPoint2D]] => XLinePolyPolygon2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCompatibleLinePolyPolygon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateVolatileAlphaBitmap(value: IntegerSize2D => XVolatileBitmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createVolatileAlphaBitmap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateVolatileBitmap(value: IntegerSize2D => XVolatileBitmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createVolatileBitmap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnterFullScreenMode(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterFullScreenMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBufferController(value: () => XBufferController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBufferController")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDeviceColorSpace(value: () => XColorSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceColorSpace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParametricPolyPolygonFactory(value: () => XMultiServiceFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParametricPolyPolygonFactory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPhysicalResolution(value: () => RealSize2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPhysicalResolution")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPhysicalSize(value: () => RealSize2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPhysicalSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasFullScreenMode(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFullScreenMode")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

