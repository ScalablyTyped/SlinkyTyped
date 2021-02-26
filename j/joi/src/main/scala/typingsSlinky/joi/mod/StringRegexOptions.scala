package typingsSlinky.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringRegexOptions extends StObject {
  
  /**
    * when true, the provided pattern will be disallowed instead of required.
    *
    * @default false
    */
  var invert: js.UndefOr[Boolean] = js.native
  
  /**
    * optional pattern name.
    */
  var name: js.UndefOr[String] = js.native
}
object StringRegexOptions {
  
  @scala.inline
  def apply(): StringRegexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringRegexOptions]
  }
  
  @scala.inline
  implicit class StringRegexOptionsMutableBuilder[Self <: StringRegexOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
