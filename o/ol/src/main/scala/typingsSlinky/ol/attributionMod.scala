package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributionMod {
  
  @JSImport("ol/control/Attribution", JSImport.Default)
  @js.native
  class default () extends Attribution {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait Attribution
    extends typingsSlinky.ol.controlControlMod.default {
    
    /**
      * Return true when the attribution is currently collapsed or false
      * otherwise.
      */
    def getCollapsed(): Boolean = js.native
    
    /**
      * Return true if the attribution is collapsible, false otherwise.
      */
    def getCollapsible(): Boolean = js.native
    
    /**
      * Collapse or expand the attribution according to the passed parameter. Will
      * not do anything if the attribution isn't collapsible or if the current
      * collapsed state is already the one requested.
      */
    def setCollapsed(collapsed: Boolean): Unit = js.native
    
    /**
      * Set whether the attribution should be collapsible.
      */
    def setCollapsible(collapsible: Boolean): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var collapseLabel: js.UndefOr[String | HTMLElement] = js.native
    
    var collapsed: js.UndefOr[Boolean] = js.native
    
    var collapsible: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[String | HTMLElement] = js.native
    
    var render: js.UndefOr[js.Function1[/* p0 */ typingsSlinky.ol.mapEventMod.default, Unit]] = js.native
    
    var target: js.UndefOr[HTMLElement | String] = js.native
    
    var tipLabel: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapseLabel(value: String | HTMLElement): Self = StObject.set(x, "collapseLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseLabelHTMLElement(value: HTMLElement): Self = StObject.set(x, "collapseLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseLabelUndefined: Self = StObject.set(x, "collapseLabel", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setLabel(value: String | HTMLElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHTMLElement(value: HTMLElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRender(value: /* p0 */ typingsSlinky.ol.mapEventMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetHTMLElement(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
}
