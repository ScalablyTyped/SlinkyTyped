package typingsSlinky.pulumiAws.inputMod.iot

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThingTypeProperties extends StObject {
  
  /**
    * The description of the thing type.
    */
  var description: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object ThingTypeProperties {
  
  @scala.inline
  def apply(): ThingTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeProperties]
  }
  
  @scala.inline
  implicit class ThingTypePropertiesMutableBuilder[Self <: ThingTypeProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setSearchableAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "searchableAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableAttributesUndefined: Self = StObject.set(x, "searchableAttributes", js.undefined)
    
    @scala.inline
    def setSearchableAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "searchableAttributes", js.Array(value :_*))
  }
}
