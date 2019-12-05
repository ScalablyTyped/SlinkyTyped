package typingsSlinky.reactDashTagsinput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTagsinputMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.facade.ReactElement
  import typingsSlinky.react.reactMod.ReactChild

  type InputProps = StringDictionary[js.Any]
  type RenderLayout = js.Function2[
    /* tagElements */ js.Array[ReactElement], 
    /* inputElement */ ReactElement, 
    ReactChild
  ]
  type Tag = js.Any
  type TagProps = StringDictionary[js.Any]
}
