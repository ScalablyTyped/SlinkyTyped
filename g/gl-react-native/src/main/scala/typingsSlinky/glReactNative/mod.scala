package typingsSlinky.glReactNative

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.glReactNative.glviewnativeMod.GLViewNative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-react-native", "Surface")
  @js.native
  class Surface protected ()
    extends typingsSlinky.glReact.mod.Surface[GLViewNative] {
    def this(props: typingsSlinky.glReact.mod.SurfaceProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsSlinky.glReact.mod.SurfaceProps, context: js.Any) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.glReactNative.glviewnativeMod.GLViewNativeProps because var conflicts: children, style. Inlined onContextCreate, onContextFailure */ @js.native
  trait SurfaceProps
    extends typingsSlinky.glReact.mod.SurfaceProps {
    
    var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
    
    var onContextFailure: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.native
  }
  object SurfaceProps {
    
    @scala.inline
    def apply(): SurfaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SurfaceProps]
    }
    
    @scala.inline
    implicit class SurfacePropsMutableBuilder[Self <: SurfaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnContextCreate(value: /* gl */ WebGLRenderingContext => Unit): Self = StObject.set(x, "onContextCreate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextCreateUndefined: Self = StObject.set(x, "onContextCreate", js.undefined)
      
      @scala.inline
      def setOnContextFailure(value: /* e */ js.Error => Unit): Self = StObject.set(x, "onContextFailure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextFailureUndefined: Self = StObject.set(x, "onContextFailure", js.undefined)
    }
  }
}
