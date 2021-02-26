package typingsSlinky.reactThreeFiber

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactThreeFiber.canvasMod.CanvasProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeCanvasMod {
  
  @JSImport("react-three-fiber/targets/native/canvas", "Canvas")
  @js.native
  val Canvas: ReactComponentClass[js.Function1[/* props */ NativeCanvasProps, ReactElement]] = js.native
  
  @js.native
  trait NativeCanvasProps extends CanvasProps {
    
    var nativeRef_EXPERIMENTAL: js.UndefOr[MutableRefObject[_]] = js.native
    
    var onContextCreated: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExpoWebGLRenderingContext */ /* gl */ js.Any, 
          js.Promise[_] | Unit
        ]
      ] = js.native
    
    var style: js.UndefOr[ViewStyle] = js.native
  }
  object NativeCanvasProps {
    
    @scala.inline
    def apply(): NativeCanvasProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeCanvasProps]
    }
    
    @scala.inline
    implicit class NativeCanvasPropsMutableBuilder[Self <: NativeCanvasProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeRef_EXPERIMENTAL(value: MutableRefObject[_]): Self = StObject.set(x, "nativeRef_EXPERIMENTAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeRef_EXPERIMENTALUndefined: Self = StObject.set(x, "nativeRef_EXPERIMENTAL", js.undefined)
      
      @scala.inline
      def setOnContextCreated(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExpoWebGLRenderingContext */ /* gl */ js.Any => js.Promise[_] | Unit
      ): Self = StObject.set(x, "onContextCreated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextCreatedUndefined: Self = StObject.set(x, "onContextCreated", js.undefined)
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
