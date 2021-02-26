package typingsSlinky.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties of inheriting and overriding the default click-through event
  * tag. A campaign may override the event tag defined at the advertiser level,
  * and an ad may also override the campaign&#39;s setting further.
  */
@js.native
trait SchemaDefaultClickThroughEventTagProperties extends StObject {
  
  /**
    * ID of the click-through event tag to apply to all ads in this
    * entity&#39;s scope.
    */
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.native
  
  /**
    * Whether this entity should override the inherited default click-through
    * event tag with its own defined value.
    */
  var overrideInheritedEventTag: js.UndefOr[Boolean] = js.native
}
object SchemaDefaultClickThroughEventTagProperties {
  
  @scala.inline
  def apply(): SchemaDefaultClickThroughEventTagProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDefaultClickThroughEventTagProperties]
  }
  
  @scala.inline
  implicit class SchemaDefaultClickThroughEventTagPropertiesMutableBuilder[Self <: SchemaDefaultClickThroughEventTagProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultClickThroughEventTagId(value: String): Self = StObject.set(x, "defaultClickThroughEventTagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultClickThroughEventTagIdUndefined: Self = StObject.set(x, "defaultClickThroughEventTagId", js.undefined)
    
    @scala.inline
    def setOverrideInheritedEventTag(value: Boolean): Self = StObject.set(x, "overrideInheritedEventTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideInheritedEventTagUndefined: Self = StObject.set(x, "overrideInheritedEventTag", js.undefined)
  }
}
