package typingsSlinky.morphdom

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("morphdom", JSImport.Namespace)
  @js.native
  def apply(fromNode: Node, toNode: String): Unit = js.native
  @JSImport("morphdom", JSImport.Namespace)
  @js.native
  def apply(fromNode: Node, toNode: String, options: MorphDomOptions): Unit = js.native
  @JSImport("morphdom", JSImport.Namespace)
  @js.native
  def apply(fromNode: Node, toNode: Node): Unit = js.native
  @JSImport("morphdom", JSImport.Namespace)
  @js.native
  def apply(fromNode: Node, toNode: Node, options: MorphDomOptions): Unit = js.native
  
  @js.native
  trait MorphDomOptions extends StObject {
    
    var childrenOnly: js.UndefOr[Boolean] = js.native
    
    var getNodeKey: js.UndefOr[js.Function1[/* node */ Node, _]] = js.native
    
    var onBeforeElChildrenUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.native
    
    var onBeforeElUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.native
    
    var onBeforeNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.native
    
    var onBeforeNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.native
    
    var onElUpdated: js.UndefOr[js.Function1[/* el */ HTMLElement, Unit]] = js.native
    
    var onNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.native
    
    var onNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  }
  object MorphDomOptions {
    
    @scala.inline
    def apply(): MorphDomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MorphDomOptions]
    }
    
    @scala.inline
    implicit class MorphDomOptionsMutableBuilder[Self <: MorphDomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildrenOnly(value: Boolean): Self = StObject.set(x, "childrenOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenOnlyUndefined: Self = StObject.set(x, "childrenOnly", js.undefined)
      
      @scala.inline
      def setGetNodeKey(value: /* node */ Node => _): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNodeKeyUndefined: Self = StObject.set(x, "getNodeKey", js.undefined)
      
      @scala.inline
      def setOnBeforeElChildrenUpdated(value: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => Boolean): Self = StObject.set(x, "onBeforeElChildrenUpdated", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforeElChildrenUpdatedUndefined: Self = StObject.set(x, "onBeforeElChildrenUpdated", js.undefined)
      
      @scala.inline
      def setOnBeforeElUpdated(value: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => Boolean): Self = StObject.set(x, "onBeforeElUpdated", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforeElUpdatedUndefined: Self = StObject.set(x, "onBeforeElUpdated", js.undefined)
      
      @scala.inline
      def setOnBeforeNodeAdded(value: /* node */ Node => Node): Self = StObject.set(x, "onBeforeNodeAdded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeNodeAddedUndefined: Self = StObject.set(x, "onBeforeNodeAdded", js.undefined)
      
      @scala.inline
      def setOnBeforeNodeDiscarded(value: /* node */ Node => Boolean): Self = StObject.set(x, "onBeforeNodeDiscarded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeNodeDiscardedUndefined: Self = StObject.set(x, "onBeforeNodeDiscarded", js.undefined)
      
      @scala.inline
      def setOnElUpdated(value: /* el */ HTMLElement => Unit): Self = StObject.set(x, "onElUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnElUpdatedUndefined: Self = StObject.set(x, "onElUpdated", js.undefined)
      
      @scala.inline
      def setOnNodeAdded(value: /* node */ Node => Node): Self = StObject.set(x, "onNodeAdded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNodeAddedUndefined: Self = StObject.set(x, "onNodeAdded", js.undefined)
      
      @scala.inline
      def setOnNodeDiscarded(value: /* node */ Node => Unit): Self = StObject.set(x, "onNodeDiscarded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNodeDiscardedUndefined: Self = StObject.set(x, "onNodeDiscarded", js.undefined)
    }
  }
}
