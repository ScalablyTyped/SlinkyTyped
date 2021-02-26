package typingsSlinky.rollup.mod

import typingsSlinky.rollup.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollupLogProps extends StObject {
  
  var code: js.UndefOr[String] = js.native
  
  var frame: js.UndefOr[String] = js.native
  
  var hook: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var loc: js.UndefOr[Column] = js.native
  
  var message: String = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var plugin: js.UndefOr[String] = js.native
  
  var pluginCode: js.UndefOr[String] = js.native
  
  var pos: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object RollupLogProps {
  
  @scala.inline
  def apply(message: String): RollupLogProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupLogProps]
  }
  
  @scala.inline
  implicit class RollupLogPropsMutableBuilder[Self <: RollupLogProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    @scala.inline
    def setHook(value: String): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLoc(value: Column): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginCode(value: String): Self = StObject.set(x, "pluginCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginCodeUndefined: Self = StObject.set(x, "pluginCode", js.undefined)
    
    @scala.inline
    def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    @scala.inline
    def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
