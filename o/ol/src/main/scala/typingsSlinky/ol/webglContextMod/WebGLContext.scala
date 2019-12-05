package typingsSlinky.ol.webglContextMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLContext
  extends typingsSlinky.ol.disposableMod.default {
  def bindBuffer(target: Double, buf: typingsSlinky.ol.webglBufferMod.default): Unit = js.native
  def deleteBuffer(buf: typingsSlinky.ol.webglBufferMod.default): Unit = js.native
  def getCanvas(): HTMLCanvasElement = js.native
  def getGL(): WebGLRenderingContext = js.native
  def getHitDetectionFramebuffer(): WebGLFramebuffer = js.native
  def getProgram(
    fragmentShaderObject: typingsSlinky.ol.webglFragmentMod.default,
    vertexShaderObject: typingsSlinky.ol.webglVertexMod.default
  ): WebGLProgram = js.native
  def getShader(shaderObject: typingsSlinky.ol.webglShaderMod.default): typingsSlinky.ol.webglShaderMod.default = js.native
  def handleWebGLContextLost(): Unit = js.native
  def handleWebGLContextRestored(): Unit = js.native
  def useProgram(program: WebGLProgram): Boolean = js.native
}

