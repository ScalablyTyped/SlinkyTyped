package typingsSlinky.createHtmlElement.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("create-html-element", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  def apply(): String = js.native
  def apply(options: Options): String = js.native
}
