package typingsSlinky.gridstack

import org.scalajs.dom.raw.Event
import typingsSlinky.gridstack.anon.TypeofGridStackDD
import typingsSlinky.gridstack.mod.GridStack
import typingsSlinky.gridstack.mod.GridStackElement
import typingsSlinky.gridstack.typesMod.DDDragInOpt
import typingsSlinky.gridstack.typesMod.GridItemHTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridstackDdMod {
  
  @JSImport("gridstack/dist/gridstack-dd", "GridStackDD")
  @js.native
  class GridStackDD protected () extends StObject {
    def this(grid: GridStack) = this()
    
    def dragIn(el: GridStackElement, opts: DDDragInOpt): GridStackDD = js.native
    
    def draggable(el: GridItemHTMLElement, opts: DDOpts): GridStackDD = js.native
    def draggable(el: GridItemHTMLElement, opts: DDOpts, key: js.UndefOr[DDKey], value: DDValue): GridStackDD = js.native
    def draggable(el: GridItemHTMLElement, opts: DDOpts, key: DDKey): GridStackDD = js.native
    
    def droppable(el: GridItemHTMLElement, opts: DDDropOpt): GridStackDD = js.native
    def droppable(el: GridItemHTMLElement, opts: DDDropOpt, key: js.UndefOr[DDKey], value: DDValue): GridStackDD = js.native
    def droppable(el: GridItemHTMLElement, opts: DDDropOpt, key: DDKey): GridStackDD = js.native
    def droppable(el: GridItemHTMLElement, opts: DDOpts): GridStackDD = js.native
    def droppable(el: GridItemHTMLElement, opts: DDOpts, key: js.UndefOr[DDKey], value: DDValue): GridStackDD = js.native
    def droppable(el: GridItemHTMLElement, opts: DDOpts, key: DDKey): GridStackDD = js.native
    
    var grid: GridStack = js.native
    
    def isDraggable(el: GridStackElement): Boolean = js.native
    
    def isDroppable(el: GridItemHTMLElement): Boolean = js.native
    
    def off(el: GridItemHTMLElement, eventName: String): GridStackDD = js.native
    
    def on(el: GridItemHTMLElement, eventName: String, callback: DDCallback): GridStackDD = js.native
    
    /** removes any drag&drop present (called during destroy) */
    def remove(el: GridItemHTMLElement): GridStackDD = js.native
    
    def resizable(el: GridItemHTMLElement, opts: DDOpts): GridStackDD = js.native
    def resizable(el: GridItemHTMLElement, opts: DDOpts, key: js.UndefOr[DDKey], value: DDValue): GridStackDD = js.native
    def resizable(el: GridItemHTMLElement, opts: DDOpts, key: DDKey): GridStackDD = js.native
  }
  /* static members */
  object GridStackDD {
    
    @JSImport("gridstack/dist/gridstack-dd", "GridStackDD")
    @js.native
    val ^ : js.Any = js.native
    
    /** get the current registered plugin to use */
    @JSImport("gridstack/dist/gridstack-dd", "GridStackDD.get")
    @js.native
    def get(): TypeofGridStackDD = js.native
    
    /** call this method to register your plugin instead of the default no-op one */
    @JSImport("gridstack/dist/gridstack-dd", "GridStackDD.registerPlugin")
    @js.native
    def registerPlugin(pluginClass: TypeofGridStackDD): Unit = js.native
    
    @JSImport("gridstack/dist/gridstack-dd", "GridStackDD.registeredPlugins")
    @js.native
    def registeredPlugins: TypeofGridStackDD = js.native
    @scala.inline
    def registeredPlugins_=(x: TypeofGridStackDD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registeredPlugins")(x.asInstanceOf[js.Any])
  }
  
  type DDCallback = js.Function3[
    /* event */ Event, 
    /* arg2 */ GridItemHTMLElement, 
    /* helper */ js.UndefOr[GridItemHTMLElement], 
    Unit
  ]
  
  @js.native
  trait DDDropOpt extends StObject {
    
    /** function or class type that this grid will accept as dropped items (see GridStackOptions.acceptWidgets) */
    var accept: js.UndefOr[js.Function1[/* el */ GridItemHTMLElement, Boolean]] = js.native
  }
  object DDDropOpt {
    
    @scala.inline
    def apply(): DDDropOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDDropOpt]
    }
    
    @scala.inline
    implicit class DDDropOptMutableBuilder[Self <: DDDropOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: /* el */ GridItemHTMLElement => Boolean): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.gridstack.gridstackStrings.minWidth
    - typingsSlinky.gridstack.gridstackStrings.minHeight
    - java.lang.String
  */
  type DDKey = _DDKey | String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.gridstack.gridstackStrings.enable
    - typingsSlinky.gridstack.gridstackStrings.disable
    - typingsSlinky.gridstack.gridstackStrings.destroy
    - typingsSlinky.gridstack.gridstackStrings.option
    - java.lang.String
    - js.Any
  */
  type DDOpts = _DDOpts | String | js.Any
  
  type DDValue = Double | String
  
  trait _DDKey extends StObject
  
  trait _DDOpts extends StObject
}
