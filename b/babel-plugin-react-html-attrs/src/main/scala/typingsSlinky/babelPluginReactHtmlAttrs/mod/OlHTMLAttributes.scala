package typingsSlinky.babelPluginReactHtmlAttrs.mod

import typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.A
import typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.I
import typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`1`
import typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.a_
import typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.i_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var reversed: js.UndefOr[Boolean | String] = js.native
  
  var start: js.UndefOr[Double | String] = js.native
  
  var `type`: js.UndefOr[`1` | a_ | A | i_ | I] = js.native
}
object OlHTMLAttributes {
  
  @scala.inline
  def apply[T](): OlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class OlHTMLAttributesMutableBuilder[Self <: OlHTMLAttributes[_], T] (val x: Self with OlHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setReversed(value: Boolean | String): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    @scala.inline
    def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setType(value: `1` | a_ | A | i_ | I): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
