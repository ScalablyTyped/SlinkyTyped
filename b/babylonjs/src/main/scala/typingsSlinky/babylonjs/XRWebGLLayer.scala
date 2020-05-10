package typingsSlinky.babylonjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalajs.dom.raw.WebGLFramebuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRWebGLLayer extends js.Object {
  var framebuffer: WebGLFramebuffer = js.native
  var framebufferHeight: Double = js.native
  var framebufferWidth: Double = js.native
  var getViewport: js.Function = js.native
}

@JSGlobal("XRWebGLLayer")
@js.native
object XRWebGLLayer
  extends Instantiable1[/* session */ XRSession, XRWebGLLayer]
     with Instantiable2[/* session */ XRSession, /* context */ WebGLRenderingContext, XRWebGLLayer]
     with Instantiable3[
      /* session */ XRSession, 
      js.UndefOr[/* context */ WebGLRenderingContext], 
      /* options */ XRWebGLLayerOptions, 
      XRWebGLLayer
    ]

