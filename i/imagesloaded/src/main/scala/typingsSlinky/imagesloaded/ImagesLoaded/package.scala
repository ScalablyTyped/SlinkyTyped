package typingsSlinky.imagesloaded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImagesLoaded {
  type ElementSelector = org.scalajs.dom.raw.Element | org.scalajs.dom.raw.NodeList | js.Array[org.scalajs.dom.raw.Element] | java.lang.String
  type ImagesLoadedCallback = js.Function1[
    /* instance */ js.UndefOr[typingsSlinky.imagesloaded.ImagesLoaded.ImagesLoaded], 
    scala.Unit
  ]
  type ImagesLoadedListener = js.Function2[
    /* instance */ typingsSlinky.imagesloaded.ImagesLoaded.ImagesLoaded, 
    /* image */ js.UndefOr[typingsSlinky.imagesloaded.ImagesLoaded.LoadingImage], 
    scala.Unit
  ]
}
