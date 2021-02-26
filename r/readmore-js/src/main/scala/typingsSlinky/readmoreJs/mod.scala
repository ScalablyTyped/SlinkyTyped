package typingsSlinky.readmoreJs

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.NodeList
import typingsSlinky.readmoreJs.readmoreJsStrings.after
import typingsSlinky.readmoreJs.readmoreJsStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("readmore-js", JSImport.Namespace)
  @js.native
  class ^ protected () extends Readmore {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: NodeList) = this()
    def this(element: String, options: Options) = this()
    def this(element: Element, options: Options) = this()
    def this(element: NodeList, options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    // called once per block during initilization after Readmore.js has processed the block
    var afterToggle: js.UndefOr[
        js.Function3[/* trigger */ Element, /* element */ Element, /* expanded */ Boolean, Unit]
      ] = js.native
    
    var beforeToggle: js.UndefOr[
        js.Function3[/* trigger */ Element, /* element */ Element, /* expanded */ Boolean, Unit]
      ] = js.native
    
    // insert required CSS dynamically, set this to false if you include the necessary CSS in a stylesheet
    var blockCSS: js.UndefOr[String] = js.native
    
    // called after a more or less link is clicked, but before the block is collapsed or expanded
    var blockProcessed: js.UndefOr[js.Function2[/* element */ Element, /* collapsable */ Boolean, Unit]] = js.native
    
    // 100 in milliseconds
    var collapsedHeight: js.UndefOr[Double] = js.native
    
    // HTML string for the "less" toggle link; also accepts a callback function that returns an HTML string
    var embedCSS: js.UndefOr[Boolean] = js.native
    
    // 200 in pixels
    var heightMargin: js.UndefOr[Double] = js.native
    
    // HTML string for the "more" toggle link; also accepts a callback function that returns an HTML string
    var lessLink: js.UndefOr[(js.Function1[/* element */ Element, String]) | String] = js.native
    
    // 16 in pixels, avoids collapsing blocks that are only slightly larger than collapsedHeight
    var moreLink: js.UndefOr[(js.Function1[/* element */ Element, String]) | String] = js.native
    
    var sourceOrder: js.UndefOr[after | before] = js.native
    
    var speed: js.UndefOr[Double] = js.native
    
    // sets the styling of the blocks, ignored if embedCSS is false
    var startOpen: js.UndefOr[Boolean] = js.native
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
      def setAfterToggle(value: (/* trigger */ Element, /* element */ Element, /* expanded */ Boolean) => Unit): Self = StObject.set(x, "afterToggle", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAfterToggleUndefined: Self = StObject.set(x, "afterToggle", js.undefined)
      
      @scala.inline
      def setBeforeToggle(value: (/* trigger */ Element, /* element */ Element, /* expanded */ Boolean) => Unit): Self = StObject.set(x, "beforeToggle", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBeforeToggleUndefined: Self = StObject.set(x, "beforeToggle", js.undefined)
      
      @scala.inline
      def setBlockCSS(value: String): Self = StObject.set(x, "blockCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockCSSUndefined: Self = StObject.set(x, "blockCSS", js.undefined)
      
      @scala.inline
      def setBlockProcessed(value: (/* element */ Element, /* collapsable */ Boolean) => Unit): Self = StObject.set(x, "blockProcessed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlockProcessedUndefined: Self = StObject.set(x, "blockProcessed", js.undefined)
      
      @scala.inline
      def setCollapsedHeight(value: Double): Self = StObject.set(x, "collapsedHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedHeightUndefined: Self = StObject.set(x, "collapsedHeight", js.undefined)
      
      @scala.inline
      def setEmbedCSS(value: Boolean): Self = StObject.set(x, "embedCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmbedCSSUndefined: Self = StObject.set(x, "embedCSS", js.undefined)
      
      @scala.inline
      def setHeightMargin(value: Double): Self = StObject.set(x, "heightMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightMarginUndefined: Self = StObject.set(x, "heightMargin", js.undefined)
      
      @scala.inline
      def setLessLink(value: (js.Function1[/* element */ Element, String]) | String): Self = StObject.set(x, "lessLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLessLinkFunction1(value: /* element */ Element => String): Self = StObject.set(x, "lessLink", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLessLinkUndefined: Self = StObject.set(x, "lessLink", js.undefined)
      
      @scala.inline
      def setMoreLink(value: (js.Function1[/* element */ Element, String]) | String): Self = StObject.set(x, "moreLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoreLinkFunction1(value: /* element */ Element => String): Self = StObject.set(x, "moreLink", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMoreLinkUndefined: Self = StObject.set(x, "moreLink", js.undefined)
      
      @scala.inline
      def setSourceOrder(value: after | before): Self = StObject.set(x, "sourceOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceOrderUndefined: Self = StObject.set(x, "sourceOrder", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setStartOpen(value: Boolean): Self = StObject.set(x, "startOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartOpenUndefined: Self = StObject.set(x, "startOpen", js.undefined)
    }
  }
  
  @js.native
  trait Readmore extends StObject {
    
    def destroy(): Unit = js.native
    
    def toggle(): Unit = js.native
    def toggle(element: String): Unit = js.native
    def toggle(element: Element): Unit = js.native
    def toggle(element: NodeList): Unit = js.native
  }
}
