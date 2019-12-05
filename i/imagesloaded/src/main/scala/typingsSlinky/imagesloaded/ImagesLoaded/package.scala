package typingsSlinky.imagesloaded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImagesLoaded {
  import org.scalajs.dom.raw.Element
  import org.scalajs.dom.raw.NodeList

  type ElementSelector = Element | NodeList | js.Array[Element] | String
  type ImagesLoadedCallback = js.Function1[
    /* instance */ js.UndefOr[typingsSlinky.imagesloaded.ImagesLoaded.ImagesLoaded], 
    Unit
  ]
  type ImagesLoadedListener = js.Function2[
    /* instance */ typingsSlinky.imagesloaded.ImagesLoaded.ImagesLoaded, 
    /* image */ js.UndefOr[LoadingImage], 
    Unit
  ]
}
