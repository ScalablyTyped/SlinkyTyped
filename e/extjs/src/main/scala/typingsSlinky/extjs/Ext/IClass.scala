package typingsSlinky.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClass extends StObject {
  
  /** [Config Option] (String[]) */
  var alias: js.UndefOr[Array] = js.native
  
  /** [Config Option] (String/String[]) */
  var alternateClassName: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var config: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var extend: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Object) */
  var inheritableStatics: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String[]/Object) */
  var mixins: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String[]) */
  var requires: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Boolean) */
  var singleton: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var statics: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String[]) */
  var uses: js.UndefOr[Array] = js.native
}
object IClass {
  
  @scala.inline
  def apply(): IClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClass]
  }
  
  @scala.inline
  implicit class IClassMutableBuilder[Self <: IClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: Array): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setAlternateClassName(value: js.Any): Self = StObject.set(x, "alternateClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateClassNameUndefined: Self = StObject.set(x, "alternateClassName", js.undefined)
    
    @scala.inline
    def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setExtend(value: java.lang.String): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setInheritableStatics(value: js.Any): Self = StObject.set(x, "inheritableStatics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritableStaticsUndefined: Self = StObject.set(x, "inheritableStatics", js.undefined)
    
    @scala.inline
    def setMixins(value: js.Any): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
    
    @scala.inline
    def setRequires(value: Array): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
    
    @scala.inline
    def setSingleton(value: Boolean): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
    
    @scala.inline
    def setStatics(value: js.Any): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticsUndefined: Self = StObject.set(x, "statics", js.undefined)
    
    @scala.inline
    def setUses(value: Array): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsesUndefined: Self = StObject.set(x, "uses", js.undefined)
  }
}
