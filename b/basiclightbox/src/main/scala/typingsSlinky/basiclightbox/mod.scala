package typingsSlinky.basiclightbox

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("basiclightbox", "create")
  @js.native
  def create(content: String): BasicLightBox = js.native
  @JSImport("basiclightbox", "create")
  @js.native
  def create(content: String, options: BasicLightBoxOptions): BasicLightBox = js.native
  @JSImport("basiclightbox", "create")
  @js.native
  def create(content: Element): BasicLightBox = js.native
  @JSImport("basiclightbox", "create")
  @js.native
  def create(content: Element, options: BasicLightBoxOptions): BasicLightBox = js.native
  
  @JSImport("basiclightbox", "visible")
  @js.native
  def visible(): Boolean = js.native
  
  @js.native
  trait BasicLightBox extends StObject {
    
    /**
      * Closes a lightbox instance.
      *
      * @param cb A function that gets executed as soon as the lightbox has been faded out.
      */
    def close(): Unit = js.native
    def close(cb: js.Function0[Unit]): Unit = js.native
    
    /**
      * Returns the DOM element/node associated with the instance.
      */
    def element(): Element = js.native
    
    /**
      * Shows a lightbox instance.
      *
      * @param cb A function that gets executed as soon as the lightbox starts to fade in.
      */
    def show(): Unit = js.native
    def show(cb: js.Function0[Unit]): Unit = js.native
    
    /**
      * Returns true when the lightbox instance is visible. Also returns true when the lightbox is currently in the process of showing/hiding and not fully visible/hidden, yet.
      */
    def visible(): Boolean = js.native
  }
  
  @js.native
  trait BasicLightBoxOptions extends StObject {
    
    /*
      * One or more space separated classes to be added to the basicLightbox element.
      */
    var className: js.UndefOr[String] = js.native
    
    /*
      * Prevents the lightbox from closing when clicking its background.
      */
    var closable: js.UndefOr[Boolean] = js.native
    
    /*
      * Function that gets executed before the lightbox closes.
      * Returning false will prevent the lightbox from closing.
      */
    var onClose: js.UndefOr[js.Function1[/* instance */ BasicLightBox, Boolean]] = js.native
    
    /*
      * Function that gets executed before the lightbox will be shown.
      * Returning false will prevent the lightbox from showing.
      */
    var onShow: js.UndefOr[js.Function1[/* instance */ BasicLightBox, Boolean]] = js.native
  }
  object BasicLightBoxOptions {
    
    @scala.inline
    def apply(): BasicLightBoxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicLightBoxOptions]
    }
    
    @scala.inline
    implicit class BasicLightBoxOptionsMutableBuilder[Self <: BasicLightBoxOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* instance */ BasicLightBox => Boolean): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* instance */ BasicLightBox => Boolean): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    }
  }
}
