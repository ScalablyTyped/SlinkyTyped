package typingsSlinky.glTexture2d.mod

import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLTexture
import typingsSlinky.ndarray.mod.ndarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Texture extends js.Object {
  
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
