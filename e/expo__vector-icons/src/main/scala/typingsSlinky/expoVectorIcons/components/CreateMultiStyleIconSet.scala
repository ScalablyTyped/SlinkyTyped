package typingsSlinky.expoVectorIcons.components

import org.scalablytyped.runtime.StringDictionary
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.expoVectorIcons.createMultiStyleIconSetMod.FontStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CreateMultiStyleIconSet {
  @JSImport("@expo/vector-icons/build/createMultiStyleIconSet", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: StringDictionary[FontStyle]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CreateMultiStyleIconSet.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

