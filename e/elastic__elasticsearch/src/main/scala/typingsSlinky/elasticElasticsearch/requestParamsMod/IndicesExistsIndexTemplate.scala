package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesExistsIndexTemplate extends Generic {
  
  var flat_settings: js.UndefOr[Boolean] = js.native
  
  var local: js.UndefOr[Boolean] = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var name: String = js.native
}
object IndicesExistsIndexTemplate {
  
  @scala.inline
  def apply(name: String): IndicesExistsIndexTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesExistsIndexTemplate]
  }
  
  @scala.inline
  implicit class IndicesExistsIndexTemplateMutableBuilder[Self <: IndicesExistsIndexTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlat_settings(value: Boolean): Self = StObject.set(x, "flat_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlat_settingsUndefined: Self = StObject.set(x, "flat_settings", js.undefined)
    
    @scala.inline
    def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
