package typingsSlinky.dragula

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Element
import typingsSlinky.dragula.dragulaStrings.cancel
import typingsSlinky.dragula.dragulaStrings.cloned
import typingsSlinky.dragula.dragulaStrings.copy
import typingsSlinky.dragula.dragulaStrings.drag
import typingsSlinky.dragula.dragulaStrings.dragend
import typingsSlinky.dragula.dragulaStrings.drop
import typingsSlinky.dragula.dragulaStrings.mirror
import typingsSlinky.dragula.dragulaStrings.out
import typingsSlinky.dragula.dragulaStrings.over
import typingsSlinky.dragula.dragulaStrings.remove
import typingsSlinky.dragula.dragulaStrings.shadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("dragula", JSImport.Namespace)
  @js.native
  val ^ : Dragula = js.native
  
  @js.native
  trait Dragula extends StObject {
    
    def apply(): Drake = js.native
    def apply(containers: js.Array[Element]): Drake = js.native
    def apply(containers: js.Array[Element], options: DragulaOptions): Drake = js.native
    def apply(containers: Element, options: DragulaOptions): Drake = js.native
    def apply(options: DragulaOptions): Drake = js.native
  }
  
  @js.native
  trait DragulaOptions extends StObject {
    
    var accepts: js.UndefOr[
        js.Function4[
          /* el */ js.UndefOr[Element], 
          /* target */ js.UndefOr[Element], 
          /* source */ js.UndefOr[Element], 
          /* sibling */ js.UndefOr[Element], 
          Boolean
        ]
      ] = js.native
    
    var containers: js.UndefOr[js.Array[Element]] = js.native
    
    var copy: js.UndefOr[(js.Function2[/* el */ Element, /* source */ Element, Boolean]) | Boolean] = js.native
    
    var copySortSource: js.UndefOr[Boolean] = js.native
    
    var delay: js.UndefOr[Boolean | Double] = js.native
    
    var direction: js.UndefOr[String] = js.native
    
    var ignoreInputTextSelection: js.UndefOr[Boolean] = js.native
    
    var invalid: js.UndefOr[
        js.Function2[/* el */ js.UndefOr[Element], /* target */ js.UndefOr[Element], Boolean]
      ] = js.native
    
    var isContainer: js.UndefOr[js.Function1[/* el */ js.UndefOr[Element], Boolean]] = js.native
    
    var mirrorContainer: js.UndefOr[Element] = js.native
    
    var moves: js.UndefOr[
        js.Function4[
          /* el */ js.UndefOr[Element], 
          /* container */ js.UndefOr[Element], 
          /* handle */ js.UndefOr[Element], 
          /* sibling */ js.UndefOr[Element], 
          Boolean
        ]
      ] = js.native
    
    var removeOnSpill: js.UndefOr[Boolean] = js.native
    
    var revertOnSpill: js.UndefOr[Boolean] = js.native
  }
  object DragulaOptions {
    
    @scala.inline
    def apply(): DragulaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragulaOptions]
    }
    
    @scala.inline
    implicit class DragulaOptionsMutableBuilder[Self <: DragulaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepts(
        value: (/* el */ js.UndefOr[Element], /* target */ js.UndefOr[Element], /* source */ js.UndefOr[Element], /* sibling */ js.UndefOr[Element]) => Boolean
      ): Self = StObject.set(x, "accepts", js.Any.fromFunction4(value))
      
      @scala.inline
      def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      @scala.inline
      def setContainers(value: js.Array[Element]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
      
      @scala.inline
      def setContainersVarargs(value: Element*): Self = StObject.set(x, "containers", js.Array(value :_*))
      
      @scala.inline
      def setCopy(value: (js.Function2[/* el */ Element, /* source */ Element, Boolean]) | Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyFunction2(value: (/* el */ Element, /* source */ Element) => Boolean): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCopySortSource(value: Boolean): Self = StObject.set(x, "copySortSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopySortSourceUndefined: Self = StObject.set(x, "copySortSource", js.undefined)
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setDelay(value: Boolean | Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setIgnoreInputTextSelection(value: Boolean): Self = StObject.set(x, "ignoreInputTextSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreInputTextSelectionUndefined: Self = StObject.set(x, "ignoreInputTextSelection", js.undefined)
      
      @scala.inline
      def setInvalid(value: (/* el */ js.UndefOr[Element], /* target */ js.UndefOr[Element]) => Boolean): Self = StObject.set(x, "invalid", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setIsContainer(value: /* el */ js.UndefOr[Element] => Boolean): Self = StObject.set(x, "isContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsContainerUndefined: Self = StObject.set(x, "isContainer", js.undefined)
      
      @scala.inline
      def setMirrorContainer(value: Element): Self = StObject.set(x, "mirrorContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirrorContainerUndefined: Self = StObject.set(x, "mirrorContainer", js.undefined)
      
      @scala.inline
      def setMoves(
        value: (/* el */ js.UndefOr[Element], /* container */ js.UndefOr[Element], /* handle */ js.UndefOr[Element], /* sibling */ js.UndefOr[Element]) => Boolean
      ): Self = StObject.set(x, "moves", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMovesUndefined: Self = StObject.set(x, "moves", js.undefined)
      
      @scala.inline
      def setRemoveOnSpill(value: Boolean): Self = StObject.set(x, "removeOnSpill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOnSpillUndefined: Self = StObject.set(x, "removeOnSpill", js.undefined)
      
      @scala.inline
      def setRevertOnSpill(value: Boolean): Self = StObject.set(x, "revertOnSpill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevertOnSpillUndefined: Self = StObject.set(x, "revertOnSpill", js.undefined)
    }
  }
  
  @js.native
  trait Drake extends StObject {
    
    def canMove(item: Element): Boolean = js.native
    
    def cancel(): Unit = js.native
    def cancel(revert: Boolean): Unit = js.native
    
    var containers: js.Array[Element] = js.native
    
    def destroy(): Unit = js.native
    
    var dragging: Boolean = js.native
    
    def end(): Unit = js.native
    
    def on(
      event: cloned,
      listener: js.Function3[/* clone */ Element, /* original */ Element, /* type */ mirror | copy, Unit]
    ): Drake = js.native
    @JSName("on")
    def on_cancel(
      event: cancel,
      listener: js.Function3[/* el */ Element, /* container */ Element, /* source */ Element, Unit]
    ): Drake = js.native
    @JSName("on")
    def on_drag(event: drag, listener: js.Function2[/* el */ Element, /* source */ Element, Unit]): Drake = js.native
    @JSName("on")
    def on_dragend(event: dragend, listener: js.Function1[/* el */ Element, Unit]): Drake = js.native
    @JSName("on")
    def on_drop(
      event: drop,
      listener: js.Function4[
          /* el */ Element, 
          /* target */ Element, 
          /* source */ Element, 
          /* sibling */ Element, 
          Unit
        ]
    ): Drake = js.native
    @JSName("on")
    def on_out(
      event: out,
      listener: js.Function3[/* el */ Element, /* container */ Element, /* source */ Element, Unit]
    ): Drake = js.native
    @JSName("on")
    def on_over(
      event: over,
      listener: js.Function3[/* el */ Element, /* container */ Element, /* source */ Element, Unit]
    ): Drake = js.native
    @JSName("on")
    def on_remove(
      event: remove,
      listener: js.Function3[/* el */ Element, /* container */ Element, /* source */ Element, Unit]
    ): Drake = js.native
    @JSName("on")
    def on_shadow(
      event: shadow,
      listener: js.Function3[/* el */ Element, /* container */ Element, /* source */ Element, Unit]
    ): Drake = js.native
    
    def remove(): Unit = js.native
    
    def start(item: Element): Unit = js.native
  }
  
  type _To = Dragula
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Dragula = ^
}
