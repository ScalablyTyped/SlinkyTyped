package typingsSlinky.createHtmlElement

import typingsSlinky.stringifyAttributes.mod.Attributes
import typingsSlinky.typeFest.mergeExclusiveMod.MergeExclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Create a HTML element string.
  @example
  ```
  import createHtmlElement = require('create-html-element');
  createHtmlElement({
  	name: 'h1',
  	attributes: {
  		class: 'unicorn',
  		rainbow: true,
  		horse: false,
  		number: 1,
  		multiple: ['a', 'b']
  	},
  	html: '🦄'
  });
  //=> '<h1 class="unicorn" rainbow number="1" multiple="a b">🦄</h1>'
  createHtmlElement({text: 'Hello <em>World</em>'});
  //=> '<div>Hello &lt;em&gt;World&lt;/em&gt;</div>'
  ```
  */
  @JSImport("create-html-element", JSImport.Namespace)
  @js.native
  def apply(): String = js.native
  @JSImport("create-html-element", JSImport.Namespace)
  @js.native
  def apply(options: Options): String = js.native
  
  @js.native
  trait BaseOptions extends StObject {
    
    /**
    		HTML tag attributes.
    		*/
    var attributes: js.UndefOr[Attributes] = js.native
    
    /**
    		HTML tag name.
    		@default 'div'
    		*/
    var name: js.UndefOr[String] = js.native
  }
  object BaseOptions {
    
    @scala.inline
    def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait HtmlOptions extends StObject {
    
    /**
    		HTML tag value in unescaped HTML.
    		*/
    var html: js.UndefOr[String] = js.native
  }
  object HtmlOptions {
    
    @scala.inline
    def apply(): HtmlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlOptions]
    }
    
    @scala.inline
    implicit class HtmlOptionsMutableBuilder[Self <: HtmlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    }
  }
  
  type Options = BaseOptions with (MergeExclusive[HtmlOptions, TextOptions])
  
  @js.native
  trait TextOptions extends StObject {
    
    /**
    		HTML tag value in escaped HTML.
    		*/
    var text: js.UndefOr[String] = js.native
  }
  object TextOptions {
    
    @scala.inline
    def apply(): TextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextOptions]
    }
    
    @scala.inline
    implicit class TextOptionsMutableBuilder[Self <: TextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
