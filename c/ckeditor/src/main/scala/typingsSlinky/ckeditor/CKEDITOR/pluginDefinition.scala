package typingsSlinky.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait pluginDefinition extends StObject {
  
  var afterInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.native
  
  var beforeInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.native
  
  var hidpi: js.UndefOr[Boolean] = js.native
  
  var init: js.UndefOr[js.Function1[/* editor */ editor, Unit]] = js.native
  
  var lang: js.UndefOr[String | js.Array[String]] = js.native
  
  var onLoad: js.UndefOr[js.Function0[_]] = js.native
  
  var requires: js.UndefOr[String | js.Array[String]] = js.native
}
object pluginDefinition {
  
  @scala.inline
  def apply(): pluginDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluginDefinition]
  }
  
  @scala.inline
  implicit class pluginDefinitionMutableBuilder[Self <: pluginDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterInit(value: /* editor */ editor => _): Self = StObject.set(x, "afterInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
    
    @scala.inline
    def setBeforeInit(value: /* editor */ editor => _): Self = StObject.set(x, "beforeInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
    
    @scala.inline
    def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
    
    @scala.inline
    def setInit(value: /* editor */ editor => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setLang(value: String | js.Array[String]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setLangVarargs(value: String*): Self = StObject.set(x, "lang", js.Array(value :_*))
    
    @scala.inline
    def setOnLoad(value: () => _): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setRequires(value: String | js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
    
    @scala.inline
    def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value :_*))
  }
}
