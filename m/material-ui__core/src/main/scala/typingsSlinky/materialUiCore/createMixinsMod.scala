package typingsSlinky.materialUiCore

import typingsSlinky.materialUiCore.createBreakpointsMod.Breakpoints
import typingsSlinky.materialUiCore.spacingMod.Spacing
import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMixinsMod {
  
  @JSImport("@material-ui/core/styles/createMixins", JSImport.Default)
  @js.native
  def default(breakpoints: Breakpoints, spacing: Spacing, mixins: MixinsOptions): Mixins = js.native
  
  @js.native
  trait Mixins extends StObject {
    
    def gutters(): CSSProperties = js.native
    def gutters(styles: CSSProperties): CSSProperties = js.native
    
    var toolbar: CSSProperties = js.native
  }
  
  /* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createMixins.Mixins> */
  @js.native
  trait MixinsOptions extends StObject {
    
    var gutters: js.UndefOr[js.Function1[/* styles */ js.UndefOr[CSSProperties], CSSProperties]] = js.native
    
    var toolbar: js.UndefOr[CSSProperties] = js.native
  }
  object MixinsOptions {
    
    @scala.inline
    def apply(): MixinsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MixinsOptions]
    }
    
    @scala.inline
    implicit class MixinsOptionsMutableBuilder[Self <: MixinsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGutters(value: /* styles */ js.UndefOr[CSSProperties] => CSSProperties): Self = StObject.set(x, "gutters", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
      
      @scala.inline
      def setToolbar(value: CSSProperties): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    }
  }
}
