package typingsSlinky.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTabDashBarPropsTypeMod {
  import slinky.core.TagMod
  import typingsSlinky.reactDashNative.reactDashNativeMod.ImageRequireSource
  import typingsSlinky.reactDashNative.reactDashNativeMod.ImageURISource

  type TabBarIcon = ImageURISource | js.Array[ImageURISource] | ImageRequireSource | TagMod[Any]
}
