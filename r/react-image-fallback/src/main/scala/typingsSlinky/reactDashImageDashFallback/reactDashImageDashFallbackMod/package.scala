package typingsSlinky.reactDashImageDashFallback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashImageDashFallbackMod {
  import org.scalajs.dom.raw.HTMLImageElement
  import slinky.core.ReactComponentClass
  import typingsSlinky.react.reactMod.DetailedHTMLProps
  import typingsSlinky.react.reactMod.ImgHTMLAttributes

  type ReactImageFallback = ReactComponentClass[
    ReactImageFallbackProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ]
}
