package typingsSlinky.glReactDom

import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.glReactDom.glviewdomMod.GLViewDOM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-react-dom", "Surface")
  @js.native
  class Surface protected ()
    extends typingsSlinky.glReact.mod.Surface[GLViewDOM] {
    def this(props: typingsSlinky.glReact.mod.SurfaceProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsSlinky.glReact.mod.SurfaceProps, context: js.Any) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.glReactDom.glviewdomMod.GLViewDOMProps because var conflicts: style. Inlined onContextCreate, onContextFailure, onContextLost, onContextRestored, webglContextAttributes, pixelRatio, width, height, debug */ @js.native
  trait SurfaceProps
    extends typingsSlinky.glReact.mod.SurfaceProps {
    
    var debug: js.UndefOr[Double] = js.native
    
    var height: Double = js.native
    
    var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
    
    var onContextFailure: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.native
    
    var onContextLost: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onContextRestored: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
    
    var pixelRatio: js.UndefOr[Double] = js.native
    
    var webglContextAttributes: js.UndefOr[WebGLContextAttributes] = js.native
    
    var width: Double = js.native
  }
  object SurfaceProps {
    
    @scala.inline
    def apply(height: Double, width: Double): SurfaceProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SurfaceProps]
    }
    
    @scala.inline
    implicit class SurfacePropsMutableBuilder[Self <: SurfaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnContextCreate(value: /* gl */ WebGLRenderingContext => Unit): Self = StObject.set(x, "onContextCreate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextCreateUndefined: Self = StObject.set(x, "onContextCreate", js.undefined)
      
      @scala.inline
      def setOnContextFailure(value: /* e */ js.Error => Unit): Self = StObject.set(x, "onContextFailure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextFailureUndefined: Self = StObject.set(x, "onContextFailure", js.undefined)
      
      @scala.inline
      def setOnContextLost(value: () => Unit): Self = StObject.set(x, "onContextLost", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnContextLostUndefined: Self = StObject.set(x, "onContextLost", js.undefined)
      
      @scala.inline
      def setOnContextRestored(value: /* gl */ WebGLRenderingContext => Unit): Self = StObject.set(x, "onContextRestored", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextRestoredUndefined: Self = StObject.set(x, "onContextRestored", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setWebglContextAttributes(value: WebGLContextAttributes): Self = StObject.set(x, "webglContextAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebglContextAttributesUndefined: Self = StObject.set(x, "webglContextAttributes", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
