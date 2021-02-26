package typingsSlinky.restartHooks

import typingsSlinky.restartHooks.anon.FnCall
import typingsSlinky.restartHooks.anon.PartialRecordDefaultBreak
import typingsSlinky.restartHooks.restartHooksBooleans.`true`
import typingsSlinky.restartHooks.restartHooksStrings.down
import typingsSlinky.restartHooks.restartHooksStrings.up
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useBreakpointMod {
  
  @JSImport("@restart/hooks/cjs/useBreakpoint", JSImport.Default)
  @js.native
  def default(breakpointMap: PartialRecordDefaultBreak): Boolean = js.native
  @JSImport("@restart/hooks/cjs/useBreakpoint", JSImport.Default)
  @js.native
  def default(breakpoint: DefaultBreakpoints): Boolean = js.native
  
  @JSImport("@restart/hooks/cjs/useBreakpoint", "createBreakpointHook")
  @js.native
  def createBreakpointHook[TKey /* <: String */](breakpointValues: Record[TKey, String | Double]): FnCall[TKey] = js.native
  
  @JSImport("@restart/hooks/cjs/useBreakpoint", JSImport.Default)
  @js.native
  def default_down(breakpoint: DefaultBreakpoints, direction: down): Boolean = js.native
  @JSImport("@restart/hooks/cjs/useBreakpoint", JSImport.Default)
  @js.native
  def default_true(breakpoint: DefaultBreakpoints, direction: `true`): Boolean = js.native
  @JSImport("@restart/hooks/cjs/useBreakpoint", JSImport.Default)
  @js.native
  def default_up(breakpoint: DefaultBreakpoints, direction: up): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.restartHooks.restartHooksBooleans.`true`
    - typingsSlinky.restartHooks.restartHooksStrings.up
    - typingsSlinky.restartHooks.restartHooksStrings.down
  */
  trait BreakpointDirection extends StObject
  object BreakpointDirection {
    
    @scala.inline
    def down: typingsSlinky.restartHooks.restartHooksStrings.down = "down".asInstanceOf[typingsSlinky.restartHooks.restartHooksStrings.down]
    
    @scala.inline
    def `true`: typingsSlinky.restartHooks.restartHooksBooleans.`true` = true.asInstanceOf[typingsSlinky.restartHooks.restartHooksBooleans.`true`]
    
    @scala.inline
    def up: typingsSlinky.restartHooks.restartHooksStrings.up = "up".asInstanceOf[typingsSlinky.restartHooks.restartHooksStrings.up]
  }
  
  type BreakpointMap[TKey /* <: String */] = Partial[Record[TKey, BreakpointDirection]]
  
  /* Inlined @restart/hooks.@restart/hooks/cjs/useBreakpoint.BreakpointMap<@restart/hooks.@restart/hooks/cjs/useBreakpoint.DefaultBreakpoints> */
  @js.native
  trait DefaultBreakpointMap extends StObject {
    
    var lg: js.UndefOr[BreakpointDirection] = js.native
    
    var md: js.UndefOr[BreakpointDirection] = js.native
    
    var sm: js.UndefOr[BreakpointDirection] = js.native
    
    var xl: js.UndefOr[BreakpointDirection] = js.native
    
    var xs: js.UndefOr[BreakpointDirection] = js.native
  }
  object DefaultBreakpointMap {
    
    @scala.inline
    def apply(): DefaultBreakpointMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultBreakpointMap]
    }
    
    @scala.inline
    implicit class DefaultBreakpointMapMutableBuilder[Self <: DefaultBreakpointMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLg(value: BreakpointDirection): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: BreakpointDirection): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setSm(value: BreakpointDirection): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setXl(value: BreakpointDirection): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: BreakpointDirection): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.restartHooks.restartHooksStrings.xs
    - typingsSlinky.restartHooks.restartHooksStrings.sm
    - typingsSlinky.restartHooks.restartHooksStrings.md
    - typingsSlinky.restartHooks.restartHooksStrings.lg
    - typingsSlinky.restartHooks.restartHooksStrings.xl
  */
  trait DefaultBreakpoints extends StObject
  object DefaultBreakpoints {
    
    @scala.inline
    def lg: typingsSlinky.restartHooks.restartHooksStrings.lg = "lg".asInstanceOf[typingsSlinky.restartHooks.restartHooksStrings.lg]
    
    @scala.inline
    def md: typingsSlinky.restartHooks.restartHooksStrings.md = "md".asInstanceOf[typingsSlinky.restartHooks.restartHooksStrings.md]
    
    @scala.inline
    def sm: typingsSlinky.restartHooks.restartHooksStrings.sm = "sm".asInstanceOf[typingsSlinky.restartHooks.restartHooksStrings.sm]
    
    @scala.inline
    def xl: typingsSlinky.restartHooks.restartHooksStrings.xl = "xl".asInstanceOf[typingsSlinky.restartHooks.restartHooksStrings.xl]
    
    @scala.inline
    def xs: typingsSlinky.restartHooks.restartHooksStrings.xs = "xs".asInstanceOf[typingsSlinky.restartHooks.restartHooksStrings.xs]
  }
}
