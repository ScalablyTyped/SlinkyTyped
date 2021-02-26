package typingsSlinky.phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A configuration object that may be applied to a Context Choose operation.
  */
@js.native
trait ChooseContextConfig extends StObject {
  
  /**
    * The set of filters to apply to the context suggestions: 'NEW_CONTEXT_ONLY', 'INCLUDE_EXISTING_CHALLENGES' or 'NEW_PLAYERS_ONLY'.
    */
  var filters: js.UndefOr[js.Array[ContextFilter]] = js.native
  
  /**
    * The maximum number of participants that a suggested context should ideally have.
    */
  var maxSize: js.UndefOr[Double] = js.native
  
  /**
    * The minimum number of participants that a suggested context should ideally have.
    */
  var minSize: js.UndefOr[Double] = js.native
}
object ChooseContextConfig {
  
  @scala.inline
  def apply(): ChooseContextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseContextConfig]
  }
  
  @scala.inline
  implicit class ChooseContextConfigMutableBuilder[Self <: ChooseContextConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[ContextFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: ContextFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
