package typingsSlinky.materialUiStyles.withStylesWithStylesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSProperties
  extends BaseCSSProperties
     with // Allow pseudo selectors and media queries
// `unknown` is used since TS does not allow assigning an interface without
// an index signature to one with an index signature. This is to allow type safe
// module augmentation.
// Technically we want any key not typed in `BaseCSSProperties` to be of type
// `CSSProperties` but this doesn't work. The index signature needs to cover
// BaseCSSProperties as well. Usually you would use `BaseCSSProperties[keyof BaseCSSProperties]`
// but this would not allow assigning React.CSSProperties to CSSProperties
/* k */ StringDictionary[js.Any | CSSProperties]
object CSSProperties {
  
  @scala.inline
  def apply(): CSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSProperties]
  }
}
