package typingsSlinky.psi.mod

import typingsSlinky.psi.psiStrings.desktop
import typingsSlinky.psi.psiStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  /**
    * When using this module for a production-level build process,
    * registering for an API key from the Google Developer Console is recommended.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Locale results should be generated in.
    * @default 'en_US'
    */
  var locale: js.UndefOr[String] = js.native
  
  var nokey: js.UndefOr[String] = js.native
  
  /**
    * Strategy to use when analyzing the page.
    * @default 'mobile'
    */
  var strategy: js.UndefOr[mobile | desktop] = js.native
  
  /**
    * Threshold score to pass the PageSpeed test. Useful for setting a performance budget.
    * @default 70
    */
  var treshold: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setNokey(value: String): Self = StObject.set(x, "nokey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNokeyUndefined: Self = StObject.set(x, "nokey", js.undefined)
    
    @scala.inline
    def setStrategy(value: mobile | desktop): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    @scala.inline
    def setTreshold(value: Double): Self = StObject.set(x, "treshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTresholdUndefined: Self = StObject.set(x, "treshold", js.undefined)
  }
}
