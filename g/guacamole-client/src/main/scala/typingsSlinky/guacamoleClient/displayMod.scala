package typingsSlinky.guacamoleClient

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.guacamoleClient.guacCommonMod.Mimetype
import typingsSlinky.guacamoleClient.layerMod.Layer
import typingsSlinky.guacamoleClient.layerMod.Layer.LineCap
import typingsSlinky.guacamoleClient.layerMod.Layer.LineJoin
import typingsSlinky.guacamoleClient.layerMod.Layer.Pixel
import typingsSlinky.guacamoleClient.visibleLayerMod.VisibleLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayMod {
  
  @JSImport("guacamole-client/lib/Display", "Display")
  @js.native
  class Display () extends StObject {
    
    /**
      * Add the specified arc to the current path.
      * @param layer The layer to draw upon.
      * @param x The X coordinate of the center of the circle which will contain the arc.
      * @param y The Y coordinate of the center of the circle which will contain the arc.
      * @param radius The radius of the circle.
      * @param startAngle The starting angle of the arc, in radians.
      * @param endAngle The ending angle of the arc, in radians.
      * @param negative Whether the arc should be drawn in order of decreasing angle.
      */
    def arc(
      layer: Layer,
      x: Double,
      y: Double,
      radius: Double,
      startAngle: Double,
      endAngle: Double,
      negative: Boolean
    ): Unit = js.native
    
    /**
      * Clip all future drawing operations by the current path. The current path
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as fillColor()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      * @param layer The layer to affect.
      */
    def clip(layer: Layer): Unit = js.native
    
    /**
      * Closes the current path by connecting the end point with the start point (if any) with a straight line.
      * @param layer The layer to draw upon.
      */
    def close(layer: Layer): Unit = js.native
    
    /**
      * Copy a rectangle of image data from one Layer to this Layer. This
      * operation will copy exactly the image data that will be drawn once all
      * operations of the source Layer that were pending at the time this
      * function was called are complete. This operation will not alter the
      * size of the source Layer even if its autosize property is set to true.
      * @param srcLayer The Layer to copy image data from.
      * @param srcx The X coordinate of the upper-left corner of the
      * rectangle within the source Layer's coordinate space to copy data from.
      * @param srcy The Y coordinate of the upper-left corner of the
      * rectangle within the source Layer's coordinate space to copy data from.
      * @param srcw The width of the rectangle within the source Layer's
      * coordinate space to copy data from.
      * @param srch The height of the rectangle within the source
      * Layer's coordinate space to copy data from.
      * @param dstLayer The layer to draw upon.
      * @param x The destination X coordinate.
      * @param y The destination Y coordinate.
      */
    def copy(
      srcLayer: Layer,
      srcx: Double,
      srcy: Double,
      srcw: Double,
      srch: Double,
      dstLayer: Layer,
      x: Double,
      y: Double
    ): Unit = js.native
    
    /**
      * Creates a new buffer. Buffers are invisible, off-screen surfaces. They
      * are implemented in the same manner as layers, but do not provide the
      * same nesting semantics.
      * @return The newly-created buffer.
      */
    def createBuffer(): Layer = js.native
    
    /**
      * Creates a new layer. The new layer will be a direct child of the default
      * layer, but can be moved to be a child of any other layer. Layers returned
      * by this function are visible.
      * @return The newly-created layer.
      */
    def createLayer(): VisibleLayer = js.native
    
    /**
      * The X coordinate of the hotspot of the mouse cursor. The hotspot is
      * the relative location within the image of the mouse cursor at which
      * each click occurs.
      */
    var cursorHotspotX: Double = js.native
    
    /**
      * The Y coordinate of the hotspot of the mouse cursor. The hotspot is
      * the relative location within the image of the mouse cursor at which
      * each click occurs.
      */
    var cursorHotspotY: Double = js.native
    
    /**
      * The current X coordinate of the local mouse cursor. This is not
      * necessarily the location of the actual mouse - it refers only to
      * the location of the cursor image within the Guacamole display, as
      * last set by moveCursor().
      */
    var cursorX: Double = js.native
    
    /**
      * The current X coordinate of the local mouse cursor. This is not
      * necessarily the location of the actual mouse - it refers only to
      * the location of the cursor image within the Guacamole display, as
      * last set by moveCursor().
      */
    var cursorY: Double = js.native
    
    /**
      * Starts a new path at the specified point.
      * @param layer The layer to draw upon.
      * @param cp1x The X coordinate of the first control point.
      * @param cp1y The Y coordinate of the first control point.
      * @param cp2x The X coordinate of the second control point.
      * @param cp2y The Y coordinate of the second control point.
      * @param x The X coordinate of the endpoint of the curve.
      * @param y The Y coordinate of the endpoint of the curve.
      */
    def curveTo(layer: Layer, cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
    
    /**
      * Removes the given layer container entirely, such that it is no longer
      * contained within its parent layer, if any.
      * @param layer The layer being removed from its parent.
      */
    def dispose(layer: Layer): Unit = js.native
    
    /**
      * Applies the given affine transform (defined with six values from the
      * transform's matrix) to the given layer.
      * @param layer The layer being distorted.
      * @param a The first value in the affine transform's matrix.
      * @param b The second value in the affine transform's matrix.
      * @param c The third value in the affine transform's matrix.
      * @param d The fourth value in the affine transform's matrix.
      * @param e The fifth value in the affine transform's matrix.
      * @param f The sixth value in the affine transform's matrix.
      */
    def distort(layer: Layer, a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
    
    /**
      * Draws the image at the specified URL at the given coordinates. The image
      * will be loaded automatically, and this and any future operations will
      * wait for the image to finish loading.
      * @param layer The layer to draw upon.
      * @param x The destination X coordinate.
      * @param y The destination Y coordinate.
      * @param url The URL of the image to draw.
      */
    def draw(layer: Layer, x: Double, y: Double, url: String): Unit = js.native
    
    /**
      * Draws the image contained within the specified Blob at the given
      * coordinates. The Blob specified must already be populated with image data.
      * @param layer The layer to draw upon.
      * @param x The destination X coordinate.
      * @param y The destination Y coordinate.
      * @param blob The Blob containing the image data to draw.
      */
    def drawBlob(layer: Layer, x: Double, y: Double, blob: Blob): Unit = js.native
    
    /**
      * Draws the specified image at the given coordinates. The image specified
      * must already be loaded.
      * @param layer The layer to draw upon.
      * @param x The destination X coordinate.
      * @param y The destination Y coordinate.
      * @param image The image to draw. Note that this is an Image object - not a URL.
      */
    def drawImage(layer: Layer, x: Double, y: Double, image: HTMLImageElement): Unit = js.native
    
    /**
      * Fills the current path with the specified color. The current path
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as clip()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      * @param layer The layer to draw upon.
      * @param r The red component of the color to fill.
      * @param g The green component of the color to fill.
      * @param b The blue component of the color to fill.
      * @param a The alpha component of the color to fill.
      */
    def fillColor(layer: Layer, r: Double, g: Double, b: Double, a: Double): Unit = js.native
    
    /**
      * Fills the current path with the image within the specified layer. The
      * image data will be tiled infinitely within the stroke. The current path
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as clip()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      * @param layer The layer to draw upon.
      * @param srcLayer The layer to use as a repeating pattern within the fill.
      */
    def fillLayer(layer: Layer, srcLayer: Layer): Unit = js.native
    
    /**
      * Returns a canvas element containing the entire display, with all child
      * layers composited within.
      * @return A new canvas element containing a copy of the display.
      */
    def flatten(): Unit = js.native
    
    /**
      * Flush all pending draw tasks, if possible, as a new frame. If the entire
      * frame is not ready, the flush will wait until all required tasks are unblocked.
      * @param callback The function to call when this frame is
      * flushed. This may happen immediately, or
      * later when blocked tasks become unblocked.
      */
    def flush(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Returns the cursor layer of this display. Each Guacamole display contains
      * a layer for the image of the mouse cursor. This layer is a special case
      * and exists above all other layers, similar to the hardware mouse cursor.
      * @return The cursor layer.
      */
    def getCursorLayer(): VisibleLayer = js.native
    
    /**
      * Returns the default layer of this display. Each Guacamole display always
      * has at least one layer. Other layers can optionally be created within
      * this layer, but the default layer cannot be removed and is the absolute
      * ancestor of all other layers.
      * @return The default layer.
      */
    def getDefaultLayer(): VisibleLayer = js.native
    
    /**
      * Returns the element which contains the Guacamole display.
      */
    def getElement(): HTMLElement = js.native
    
    /**
      * Returns the height of this display.
      */
    def getHeight(): Double = js.native
    
    /**
      * Returns the scale of the display.
      */
    def getScale(): Double = js.native
    
    /**
      * Returns the width of this display.
      */
    def getWidth(): Double = js.native
    
    /**
      * Add the specified line to the current path.
      * @param layer The layer to draw upon.
      * @param x The X coordinate of the endpoint of the line to draw.
      * @param y The Y coordinate of the endpoint of the line to draw.
      */
    def lineTo(layer: Layer, x: Double, y: Double): Unit = js.native
    
    /**
      * Moves the upper-left corner of the given layer to the given X and Y
      * coordinate, sets the Z stacking order, and reparents the layer
      * to the given parent layer.
      * @param layer The layer being moved.
      * @param parent The parent to set.
      * @param x The X coordinate to move to.
      * @param y The Y coordinate to move to.
      * @param z The Z coordinate to move to.
      */
    def move(layer: VisibleLayer, parent: VisibleLayer, x: Double, y: Double, z: Double): Unit = js.native
    
    /**
      * Sets the location of the local cursor to the given coordinates. For the
      * sake of responsiveness, this function performs its action immediately.
      * Cursor motion is not maintained within atomic frames.
      * @param x The X coordinate to move the cursor to.
      * @param y The Y coordinate to move the cursor to.
      */
    def moveCursor(x: Double, y: Double): Unit = js.native
    
    /**
      * Fired whenever the local cursor image is changed. This can be used to
      * implement special handling of the client-side cursor, or to override
      * the default use of a software cursor layer.
      * @event
      * @param cursorCanvas The cursor image.
      * @param x The X-coordinate of the cursor hotspot.
      * @param y The Y-coordinate of the cursor hotspot.
      */
    var oncursor: Null | (js.Function3[/* cursorCanvas */ HTMLCanvasElement, /* x */ Double, /* y */ Double, Unit]) = js.native
    
    /**
      * Fired when the default layer (and thus the entire Guacamole display) is resized.
      * @event
      * @param width The new width of the Guacamole display.
      * @param height The new height of the Guacamole display.
      */
    var onresize: Null | (js.Function2[/* width */ Double, /* height */ Double, Unit]) = js.native
    
    /**
      * Plays the video at the specified URL within this layer. The video
      * will be loaded automatically, and this and any future operations will
      * wait for the video to finish loading. Future operations will not be
      * executed until the video finishes playing.
      * @param layer The layer to draw upon.
      * @param mimetype The mimetype of the video to play.
      * @param duration The duration of the video in milliseconds.
      * @param url The URL of the video to play.
      */
    def play(layer: Layer, mimetype: Mimetype, duration: Double, url: String): Unit = js.native
    
    /**
      * Pop layer state off stack.
      * @param layer The layer to draw upon.
      */
    def pop(layer: Layer): Unit = js.native
    
    /**
      * Push current layer state onto stack.
      * @param layer The layer to draw upon.
      */
    def push(layer: Layer): Unit = js.native
    
    /**
      * Put a rectangle of image data from one Layer to this Layer directly
      * without performing any alpha blending. Simply copy the data.
      * @param srcLayer The Layer to copy image data from.
      * @param srcx The X coordinate of the upper-left corner of the
      * rectangle within the source Layer's coordinate space to copy data from.
      * @param srcy The Y coordinate of the upper-left corner of the
      * rectangle within the source Layer's coordinate space to copy data from.
      * @param srcw The width of the rectangle within the source Layer's
      * coordinate space to copy data from.
      * @param srch The height of the rectangle within the source
      * Layer's coordinate space to copy data from.
      * @param dstLayer The layer to draw upon.
      * @param x The destination X coordinate.
      * @param y The destination Y coordinate.
      */
    def put(
      srcLayer: Layer,
      srcx: Double,
      srcy: Double,
      srcw: Double,
      srch: Double,
      dstLayer: Layer,
      x: Double,
      y: Double
    ): Unit = js.native
    
    /**
      * Add the specified rectangle to the current path.
      * @param layer The layer to draw upon.
      * @param x The X coordinate of the upper-left corner of the rectangle to draw.
      * @param y The Y coordinate of the upper-left corner of the rectangle to draw.
      * @param w The width of the rectangle to draw.
      * @param h The height of the rectangle to draw.
      */
    def rect(layer: Layer, x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    /**
      * Reset the layer, clearing the stack, the current path, and any transform matrix.
      * @param layer The layer to draw upon.
      */
    def reset(layer: Layer): Unit = js.native
    
    /**
      * Changes the size of the given Layer to the given width and height.
      * Resizing is only attempted if the new size provided is actually different
      * from the current size.
      * @param layer The layer to resize.
      * @param width The new width.
      * @param height The new height.
      */
    def resize(layer: Layer, width: Double, height: Double): Unit = js.native
    
    /**
      * Sets the scale of the client display element such that it renders at
      * a relatively smaller or larger size, without affecting the true
      * resolution of the display.
      * @param scale The scale to resize to, where 1.0 is normal size (1:1 scale).
      */
    def scale(scale: Double): Unit = js.native
    
    /**
      * Sets the channel mask for future operations on this Layer.
      * The channel mask is a Guacamole-specific compositing operation identifier
      * with a single bit representing each of four channels (in order): source
      * image where destination transparent, source where destination opaque,
      * destination where source transparent, and destination where source opaque.
      * @param layer The layer to modify.
      * @param mask The channel mask for future operations on this Layer.
      */
    def setChannelMask(layer: Layer, mask: Double): Unit = js.native
    
    /**
      * Sets the hotspot and image of the mouse cursor displayed within the
      * Guacamole display.
      * @param hotspotX The X coordinate of the cursor hotspot.
      * @param hotspotY The Y coordinate of the cursor hotspot.
      * @param layer The source layer containing the data which should be used as the mouse cursor image.
      * @param srcx The X coordinate of the upper-left corner of the
      * rectangle within the source layer's coordinate space to copy data from.
      * @param srcy The Y coordinate of the upper-left corner of the
      * rectangle within the source layer's coordinate space to copy data from.
      * @param srcw The width of the rectangle within the source layer's coordinate space to copy data from.
      * @param srch The height of the rectangle within the source layer's coordinate space to copy data from.
      */
    def setCursor(
      hotspotX: Double,
      hotspotY: Double,
      layer: Layer,
      srcx: Double,
      srcy: Double,
      srcw: Double,
      srch: Double
    ): Unit = js.native
    
    /**
      * Sets the miter limit for stroke operations using the miter join. This
      * limit is the maximum ratio of the size of the miter join to the stroke
      * width. If this ratio is exceeded, the miter will not be drawn for that
      * joint of the path.
      * @param layer The layer to modify.
      * @param limit The miter limit for stroke operations using the miter join.
      */
    def setMeterLimit(layer: Layer, limit: Double): Unit = js.native
    
    /**
      * Sets the given affine transform (defined with six values from the transform's matrix).
      * @param layer The layer to modify.
      * @param a The first value in the affine transform's matrix.
      * @param b The second value in the affine transform's matrix.
      * @param c The third value in the affine transform's matrix.
      * @param d The fourth value in the affine transform's matrix.
      * @param e The fifth value in the affine transform's matrix.
      * @param f The sixth value in the affine transform's matrix.
      */
    def setTransform(layer: Layer, a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
    
    /**
      * Sets the opacity of the given layer to the given value, where 255 is
      * fully opaque and 0 is fully transparent.
      * @param layer The layer whose opacity should be set.
      * @param alpha The opacity to set.
      */
    def shade(layer: VisibleLayer, alpha: Double): Unit = js.native
    
    /**
      * Sets whether the software-rendered cursor is shown. This cursor differs
      * from the hardware cursor in that it is built into the Guacamole.Display,
      * and relies on its own Guacamole layer to render.
      * @param [shown=true] Whether to show the software cursor.
      */
    def showCursor(shown: Boolean): Unit = js.native
    
    /**
      * Stroke the current path with the specified color. The current path
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as clip()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      * @param layer The layer to draw upon.
      * @param cap The line cap style. Can be "round", "square", or "butt".
      * @param join The line join style. Can be "round", "bevel", or "miter".
      * @param thickness The line thickness in pixels.
      * @param r The red component of the color to fill.
      * @param g The green component of the color to fill.
      * @param b The blue component of the color to fill.
      * @param a The alpha component of the color to fill.
      */
    def strokeColor(
      layer: Layer,
      cap: LineCap,
      join: LineJoin,
      thickness: Double,
      r: Double,
      g: Double,
      b: Double,
      a: Double
    ): Unit = js.native
    
    /**
      * Stroke the current path with the image within the specified layer. The
      * image data will be tiled infinitely within the stroke. The current path
      * is implicitly closed. The current path can continue to be reused
      * for other operations (such as clip()) but a new path will be started
      * once a path drawing operation (path() or rect()) is used.
      * @param layer The layer to draw upon.
      * @param cap The line cap style. Can be "round", "square", or "butt".
      * @param join The line join style. Can be "round", "bevel", or "miter".
      * @param thickness The line thickness in pixels.
      * @param srcLayer The layer to use as a repeating pattern within the stroke.
      */
    def strokeLayer(layer: Layer, cap: LineCap, join: LineJoin, thickness: Double, srcLayer: Layer): Unit = js.native
    
    /**
      * Transfer a rectangle of image data from one Layer to this Layer using the
      * specified transfer function.
      * @param srcLayer The Layer to copy image data from.
      * @param srcx The X coordinate of the upper-left corner of the
      * rectangle within the source Layer's coordinate space to copy data from.
      * @param srcy The Y coordinate of the upper-left corner of the
      * rectangle within the source Layer's coordinate space to copy data from.
      * @param srcw The width of the rectangle within the source Layer's
      * coordinate space to copy data from.
      * @param  srch The height of the rectangle within the source
      * Layer's coordinate space to copy data from.
      * @param dstLayer The layer to draw upon.
      * @param x The destination X coordinate.
      * @param y The destination Y coordinate.
      * @param transferFunction The transfer function to use to
      * transfer data from source to destination.
      */
    def transfer(
      srcLayer: Layer,
      srcx: Double,
      srcy: Double,
      srcw: Double,
      srch: Double,
      dstLayer: Layer,
      x: Double,
      y: Double,
      transferFunction: js.Function2[/* srcPixel */ Pixel, /* dstPixel */ Pixel, Unit]
    ): Unit = js.native
    
    /**
      * Applies the given affine transform (defined with six values from the transform's matrix).
      * @param layer The layer to modify.
      * @param a The first value in the affine transform's matrix.
      * @param b The second value in the affine transform's matrix.
      * @param c The third value in the affine transform's matrix.
      * @param d The fourth value in the affine transform's matrix.
      * @param e The fifth value in the affine transform's matrix.
      * @param f The sixth value in the affine transform's matrix.
      */
    def transform(layer: Layer, a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  }
  object Display {
    
    type VisibleLayer = Instantiable2[
        /* width */ Double, 
        /* height */ Double, 
        typingsSlinky.guacamoleClient.visibleLayerMod.VisibleLayer
      ]
  }
}
