package typingsSlinky.ol.helperMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WebGLShader
import org.scalajs.dom.raw.WebGLTexture
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.ol.olMod.Transform
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLHelper
  extends typingsSlinky.ol.disposableMod.default {
  
  def bindBuffer(buffer: typingsSlinky.ol.bufferMod.default): Unit = js.native
  
  def compileShader(source: String, `type`: ShaderType): WebGLShader = js.native
  
  def createTexture(size: js.Array[Double]): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: js.UndefOr[scala.Nothing], opt_texture: WebGLTexture): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: HTMLCanvasElement): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: HTMLCanvasElement, opt_texture: WebGLTexture): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: HTMLImageElement): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: HTMLImageElement, opt_texture: WebGLTexture): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: ImageData): WebGLTexture = js.native
  def createTexture(size: js.Array[Double], opt_data: ImageData, opt_texture: WebGLTexture): WebGLTexture = js.native
  
  def deleteBuffer(buf: typingsSlinky.ol.bufferMod.default): Unit = js.native
  
  def drawElements(start: Double, end: Double): Unit = js.native
  
  def enableAttributes(attributes: js.Array[AttributeDescription]): Unit = js.native
  
  def finalizeDraw(frameState: FrameState): Unit = js.native
  
  def flushBufferData(buffer: typingsSlinky.ol.bufferMod.default): Unit = js.native
  
  def getAttributeLocation(name: String): Double = js.native
  
  def getCanvas(): HTMLCanvasElement = js.native
  
  def getGL(): WebGLRenderingContext = js.native
  
  def getProgram(fragmentShaderSource: String, vertexShaderSource: String): WebGLProgram = js.native
  
  def getShaderCompileErrors(): String = js.native
  
  def getUniformLocation(name: String): WebGLUniformLocation = js.native
  
  def makeProjectionTransform(frameState: FrameState, transform: Transform): Transform = js.native
  
  def prepareDraw(frameState: FrameState): Unit = js.native
  
  def prepareDrawToRenderTarget(frameState: FrameState, renderTarget: typingsSlinky.ol.renderTargetMod.default): Unit = js.native
  def prepareDrawToRenderTarget(
    frameState: FrameState,
    renderTarget: typingsSlinky.ol.renderTargetMod.default,
    opt_disableAlphaBlend: Boolean
  ): Unit = js.native
  
  def setUniformFloatValue(uniform: String, value: Double): Unit = js.native
  
  def setUniformMatrixValue(uniform: String, value: js.Array[Double]): Unit = js.native
  
  def useProgram(program: WebGLProgram): Boolean = js.native
}
