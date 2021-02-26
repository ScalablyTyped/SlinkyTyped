package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.FeatureGroup_
import typingsSlinky.reactLeaflet.mod.FeatureGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object FeatureGroup {
  
  def apply[P /* <: FeatureGroupProps */, E /* <: FeatureGroup_[js.Any] */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-leaflet", "FeatureGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[P /* <: FeatureGroupProps */, E /* <: FeatureGroup_[js.Any] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.FeatureGroup[P, E]]
  
  implicit def make[P /* <: FeatureGroupProps */, E /* <: FeatureGroup_[js.Any] */](companion: FeatureGroup.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
