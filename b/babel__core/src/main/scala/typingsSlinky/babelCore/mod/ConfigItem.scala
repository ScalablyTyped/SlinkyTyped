package typingsSlinky.babelCore.mod

import typingsSlinky.babelCore.anon.Request
import typingsSlinky.babelCore.babelCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigItem extends StObject {
  
  /**
    * The path that the options are relative to.
    */
  var dirname: String = js.native
  
  /**
    * Information about the plugin's file, if Babel knows it.
    *  *
    */
  var file: js.UndefOr[Request | Null] = js.native
  
  /**
    * The name that the user gave the plugin instance, e.g. `plugins: [ ['env', {}, 'my-env'] ]`
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The options object passed to the plugin.
    */
  var options: js.UndefOr[js.Object | `false`] = js.native
  
  /**
    * The resolved value of the plugin.
    */
  var value: js.Object | (js.Function1[/* repeated */ js.Any, _]) = js.native
}
object ConfigItem {
  
  @scala.inline
  def apply(dirname: String, value: js.Object | (js.Function1[/* repeated */ js.Any, _])): ConfigItem = {
    val __obj = js.Dynamic.literal(dirname = dirname.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigItem]
  }
  
  @scala.inline
  implicit class ConfigItemMutableBuilder[Self <: ConfigItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: Request): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNull: Self = StObject.set(x, "file", null)
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Object | `false`): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setValue(value: js.Object | (js.Function1[/* repeated */ js.Any, _])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFunction1(value: /* repeated */ js.Any => _): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
