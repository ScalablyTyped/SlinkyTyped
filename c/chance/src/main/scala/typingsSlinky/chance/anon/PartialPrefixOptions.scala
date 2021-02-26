package typingsSlinky.chance.anon

import typingsSlinky.chance.chanceStrings.all
import typingsSlinky.chance.chanceStrings.female
import typingsSlinky.chance.chanceStrings.male
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.PrefixOptions> */
@js.native
trait PartialPrefixOptions extends StObject {
  
  var full: js.UndefOr[Boolean] = js.native
  
  var gender: js.UndefOr[male | female | all] = js.native
}
object PartialPrefixOptions {
  
  @scala.inline
  def apply(): PartialPrefixOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPrefixOptions]
  }
  
  @scala.inline
  implicit class PartialPrefixOptionsMutableBuilder[Self <: PartialPrefixOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    @scala.inline
    def setGender(value: male | female | all): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
  }
}
