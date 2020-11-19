package typingsSlinky.sade.anon

import typingsSlinky.mri.mod.ArrayOrString
import typingsSlinky.mri.mod.DictionaryObject
import typingsSlinky.sade.sadeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  lazy :true} & sade.sade.ParseOptions */
@js.native
trait lazytrueParseOptions extends js.Object {
  
  /** Additional aliases for specific flags */
  var alias: js.UndefOr[DictionaryObject[ArrayOrString]] = js.native
  
  /** A flag or array of flags whose values are boolean */
  var boolean: js.UndefOr[ArrayOrString] = js.native
  
  /** Default values for flags */
  var default: js.UndefOr[DictionaryObject[_]] = js.native
  
  var `lazy`: `true` with js.UndefOr[Boolean] = js.native
  
  var string: js.UndefOr[ArrayOrString] = js.native
  
  var unknown: js.UndefOr[js.Function1[/* flag */ String, Unit]] = js.native
}
object lazytrueParseOptions {
  
  @scala.inline
  def apply(`lazy`: `true` with js.UndefOr[Boolean]): lazytrueParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[lazytrueParseOptions]
  }
  
  @scala.inline
  implicit class lazytrueParseOptionsOps[Self <: lazytrueParseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLazy(value: `true` with js.UndefOr[Boolean]): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlias(value: DictionaryObject[ArrayOrString]): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setBooleanVarargs(value: String*): Self = this.set("boolean", js.Array(value :_*))
    
    @scala.inline
    def setBoolean(value: ArrayOrString): Self = this.set("boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    
    @scala.inline
    def setDefault(value: DictionaryObject[_]): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setStringVarargs(value: String*): Self = this.set("string", js.Array(value :_*))
    
    @scala.inline
    def setString(value: ArrayOrString): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    
    @scala.inline
    def setUnknown(value: /* flag */ String => Unit): Self = this.set("unknown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnknown: Self = this.set("unknown", js.undefined)
  }
}
