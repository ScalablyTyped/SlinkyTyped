package typingsSlinky.crittersWebpackPlugin.mod.Critters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The mechanism to use for lazy-loading stylesheets.
  * indicates that a strategy requires JavaScript (falls back to `<noscript>`).
  * - **default:** Move stylesheet links to the end of the document and insert preload meta tags in their place.
  * - **"body":** Move all external stylesheet links to the end of the document.
  * - **"media":** Load stylesheets asynchronously by adding `media="not x"` and removing once loaded. _[JS]_
  * - **"swap":** Convert stylesheet links to preloads that swap to `rel="stylesheet"` once loaded. _[JS]_
  * - **"js":** Inject an asynchronous CSS loader similar to [LoadCSS](https://github.com/filamentgroup/loadCSS) and use it to load stylesheets. _[JS]_
  * - **"js-lazy":** Like `"js"`, but the stylesheet is disabled until fully loaded.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.body
  - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.media
  - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.swap
  - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.js_
  - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.`js-lazy`
*/
trait PreloadStrategy extends js.Object
object PreloadStrategy {
  
  @scala.inline
  def body: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.body = "body".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.body]
  
  @scala.inline
  def `js-lazy`: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.`js-lazy` = "js-lazy".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.`js-lazy`]
  
  @scala.inline
  def js_ : typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.js_ = "js".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.js_]
  
  @scala.inline
  def media: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.media = "media".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.media]
  
  @scala.inline
  def swap: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.swap = "swap".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.swap]
}
