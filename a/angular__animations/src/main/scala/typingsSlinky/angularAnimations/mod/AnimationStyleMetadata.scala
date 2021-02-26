package typingsSlinky.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularAnimations.angularAnimationsStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationStyleMetadata extends AnimationMetadata {
  
  /**
    * A percentage of the total animate time at which the style is to be applied.
    */
  var offset: Double | Null = js.native
  
  /**
    * A set of CSS style properties.
    */
  var styles: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk]) = js.native
}
object AnimationStyleMetadata {
  
  @scala.inline
  def apply(
    styles: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk]),
    `type`: AnimationMetadataType
  ): AnimationStyleMetadata = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStyleMetadata]
  }
  
  @scala.inline
  implicit class AnimationStyleMetadataMutableBuilder[Self <: AnimationStyleMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    @scala.inline
    def setStyles(
      value: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk])
    ): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: ((StringDictionary[String | Double]) | Asterisk)*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
