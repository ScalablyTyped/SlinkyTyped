package typingsSlinky.onsenui.onsenuiMod

import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsSplitterContentElement extends HTMLElement {
  /**
    * @description Page element loaded in the splitter content.
    */
  var page: String = js.native
  var pageLoader: js.Any = js.native
  /**
    * @description Show the page specified in pageUrl in the right section. Returns: Resolves to the new page element
    * @param {*} page
    * @param {Object} [options]
    * @return {Promise}
    */
  def load(page: js.Any): js.Promise[org.scalajs.dom.raw.HTMLElement] = js.native
  def load(page: js.Any, options: SplitterContentOptions): js.Promise[org.scalajs.dom.raw.HTMLElement] = js.native
}

