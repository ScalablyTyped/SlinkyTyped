package typingsSlinky.glTexture2d

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLTexture
import typingsSlinky.ndarray.mod.ndarray
import typingsSlinky.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, array: ndarray[Double]): Texture = js.native
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double]): Texture = js.native
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  def apply(
    gl: WebGLRenderingContext,
    input: js.Tuple2[Double, Double],
    format: js.UndefOr[scala.Nothing],
    `type`: GLenum
  ): Texture = js.native
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double], format: GLenum): Texture = js.native
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, input: js.Tuple2[Double, Double], format: GLenum, `type`: GLenum): Texture = js.native
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, input: InputType): Texture = js.native
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, input: InputType, format: js.UndefOr[scala.Nothing], `type`: GLenum): Texture = js.native
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, input: InputType, format: GLenum): Texture = js.native
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, input: InputType, format: GLenum, `type`: GLenum): Texture = js.native
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, input: RawObject): Texture = js.native
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, input: RawObject, format: js.UndefOr[scala.Nothing], `type`: GLenum): Texture = js.native
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, input: RawObject, format: GLenum): Texture = js.native
  @JSImport("gl-texture2d", JSImport.Namespace)
  @js.native
  def apply(gl: WebGLRenderingContext, input: RawObject, format: GLenum, `type`: GLenum): Texture = js.native
  
  type GLenum = Double
  
  type InputType = ImageData | HTMLCanvasElement | HTMLImageElement | HTMLVideoElement
  
  @js.native
  trait RawObject extends StObject {
    
    var height: Double = js.native
    
    var raw: js.typedarray.ArrayBufferView | InputType | ImageBitmap = js.native
    
    var width: Double = js.native
  }
  object RawObject {
    
    @scala.inline
    def apply(height: Double, raw: js.typedarray.ArrayBufferView | InputType | ImageBitmap, width: Double): RawObject = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawObject]
    }
    
    @scala.inline
    implicit class RawObjectMutableBuilder[Self <: RawObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: js.typedarray.ArrayBufferView | InputType | ImageBitmap): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawArrayBufferView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawHTMLCanvasElement(value: HTMLCanvasElement): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawHTMLImageElement(value: HTMLImageElement): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawHTMLVideoElement(value: HTMLVideoElement): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawImageData(value: ImageData): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Texture extends StObject {
    
    def bind(): Double = js.native
    def bind(id: Double): Double = js.native
    
    def dispose(): Unit = js.native
    
    val format: GLenum = js.native
    
    def generateMipmap(): Unit = js.native
    
    val gl: WebGLRenderingContext = js.native
    
    val handle: WebGLTexture = js.native
    
    var magFilter: GLenum = js.native
    
    var minFilter: GLenum = js.native
    
    var mipSamples: GLenum = js.native
    
    def setPixels(data: InputType): Unit = js.native
    def setPixels(data: InputType, offset: js.UndefOr[scala.Nothing], mipLevel: GLenum): Unit = js.native
    def setPixels(data: InputType, offset: js.Tuple2[Double, Double]): Unit = js.native
    def setPixels(data: InputType, offset: js.Tuple2[Double, Double], mipLevel: GLenum): Unit = js.native
    def setPixels(data: RawObject): Unit = js.native
    def setPixels(data: RawObject, offset: js.UndefOr[scala.Nothing], mipLevel: GLenum): Unit = js.native
    def setPixels(data: RawObject, offset: js.Tuple2[Double, Double]): Unit = js.native
    def setPixels(data: RawObject, offset: js.Tuple2[Double, Double], mipLevel: GLenum): Unit = js.native
    def setPixels(data: ndarray[Double]): Unit = js.native
    def setPixels(data: ndarray[Double], offset: js.UndefOr[scala.Nothing], mipLevel: GLenum): Unit = js.native
    def setPixels(data: ndarray[Double], offset: js.Tuple2[Double, Double]): Unit = js.native
    def setPixels(data: ndarray[Double], offset: js.Tuple2[Double, Double], mipLevel: GLenum): Unit = js.native
    
    var shape: js.Tuple2[Double, Double] = js.native
    
    val `type`: GLenum = js.native
    
    var wrap: js.Tuple2[GLenum, GLenum] = js.native
  }
}
