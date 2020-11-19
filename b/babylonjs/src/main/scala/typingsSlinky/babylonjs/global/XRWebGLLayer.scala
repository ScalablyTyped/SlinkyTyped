package typingsSlinky.babylonjs.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.babylonjs.WebGLRenderingContext
import typingsSlinky.babylonjs.XRSession
import typingsSlinky.babylonjs.XRWebGLLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("XRWebGLLayer")
@js.native
class XRWebGLLayer protected ()
  extends typingsSlinky.babylonjs.XRWebGLLayer {
  def this(session: XRSession) = this()
  def this(session: XRSession, context: WebGLRenderingContext) = this()
  def this(session: XRSession, context: js.UndefOr[scala.Nothing], options: XRWebGLLayerOptions) = this()
  def this(session: XRSession, context: WebGLRenderingContext, options: XRWebGLLayerOptions) = this()
}
@JSGlobal("XRWebGLLayer")
@js.native
object XRWebGLLayer
  extends Instantiable1[/* session */ XRSession, typingsSlinky.babylonjs.XRWebGLLayer]
     with Instantiable2[
      /* session */ XRSession, 
      /* context */ WebGLRenderingContext, 
      typingsSlinky.babylonjs.XRWebGLLayer
    ]
     with Instantiable3[
      /* session */ XRSession, 
      js.UndefOr[/* context */ WebGLRenderingContext], 
      /* options */ XRWebGLLayerOptions, 
      typingsSlinky.babylonjs.XRWebGLLayer
    ]
