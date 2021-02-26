package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFamilies extends StObject {
  
  /**
    * The cursive font-family.
    */
  var cursive: js.UndefOr[String] = js.native
  
  /**
    * The fantasy font-family.
    */
  var fantasy: js.UndefOr[String] = js.native
  
  /**
    * The fixed font-family.
    */
  var fixed: js.UndefOr[String] = js.native
  
  /**
    * The pictograph font-family.
    */
  var pictograph: js.UndefOr[String] = js.native
  
  /**
    * The sansSerif font-family.
    */
  var sansSerif: js.UndefOr[String] = js.native
  
  /**
    * The serif font-family.
    */
  var serif: js.UndefOr[String] = js.native
  
  /**
    * The standard font-family.
    */
  var standard: js.UndefOr[String] = js.native
}
object FontFamilies {
  
  @scala.inline
  def apply(): FontFamilies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFamilies]
  }
  
  @scala.inline
  implicit class FontFamiliesMutableBuilder[Self <: FontFamilies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursive(value: String): Self = StObject.set(x, "cursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursiveUndefined: Self = StObject.set(x, "cursive", js.undefined)
    
    @scala.inline
    def setFantasy(value: String): Self = StObject.set(x, "fantasy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFantasyUndefined: Self = StObject.set(x, "fantasy", js.undefined)
    
    @scala.inline
    def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setPictograph(value: String): Self = StObject.set(x, "pictograph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictographUndefined: Self = StObject.set(x, "pictograph", js.undefined)
    
    @scala.inline
    def setSansSerif(value: String): Self = StObject.set(x, "sansSerif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSansSerifUndefined: Self = StObject.set(x, "sansSerif", js.undefined)
    
    @scala.inline
    def setSerif(value: String): Self = StObject.set(x, "serif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerifUndefined: Self = StObject.set(x, "serif", js.undefined)
    
    @scala.inline
    def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
