package typingsSlinky.jqueryJsignature

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * inits the jSignature widget
    */
  def jSignature(): JQuery = js.native
  /**
    * Arguments vary per command. When provided, command is expected to be a string with a command for jSignature. Commands supported at this time: init, reset, getData, setData, listPlugins
    * @summary
    * init is the default, assumed action. init takes one argument - a settings Object. You can omit the command and just pass the settings object in upon init. Returns (in a traditional jQuery chainable way) jQuery object ref to the element onto which the plugin was applied.
    * clear (also aliased as reset) clears the signature pad, data store (and puts back signature line and other decor). Returns (in a traditional jQuery chainable way) jQuery object ref to the element onto which the plugin was applied.
    * getData takes an argument - the name of the data format. Returns a data object appropriate for the data format.
    * setData (also aliased as importData) takes two arguments - data object, (optional) data format name. When data object is a string formatted in data-url pattern you don't need to specify the data dormat name. The data format name (mime) will be implied from the data-url prefix. Returns (in a traditional jQuery chainable way) jQuery object ref to the element onto which the plugin was applied.
    * listPlugins takes an argument - a string denoting the category (Only export, import supported at this time) of plugins to list. Returns an array of strings.
    *
    * @param command the command used to perform an action on the jSignature canvas
    * @see http://willowsystems.github.io/jSignature/#/about/
    *
    */
  def jSignature(command: String): js.Any = js.native
  /**
    * Arguments vary per command. When provided, command is expected to be a string with a command for jSignature. Commands supported at this time: init, reset, getData, setData, listPlugins
    * @summary
    * init is the default, assumed action. init takes one argument - a settings Object. You can omit the command and just pass the settings object in upon init. Returns (in a traditional jQuery chainable way) jQuery object ref to the element onto which the plugin was applied.
    * clear (also aliased as reset) clears the signature pad, data store (and puts back signature line and other decor). Returns (in a traditional jQuery chainable way) jQuery object ref to the element onto which the plugin was applied.
    * getData takes an argument - the name of the data format. Returns a data object appropriate for the data format.
    * setData (also aliased as importData) takes two arguments - data object, (optional) data format name. When data object is a string formatted in data-url pattern you don't need to specify the data dormat name. The data format name (mime) will be implied from the data-url prefix. Returns (in a traditional jQuery chainable way) jQuery object ref to the element onto which the plugin was applied.
    * listPlugins takes an argument - a string denoting the category (Only export, import supported at this time) of plugins to list. Returns an array of strings.
    *
    * @param command the command used to perform an action on the jSignature canvas
    * @param arg the argument used with the specified command
    * @see http://willowsystems.github.io/jSignature/#/about/
    *
    */
  def jSignature(command: String, arg: String*): js.Any = js.native
}
