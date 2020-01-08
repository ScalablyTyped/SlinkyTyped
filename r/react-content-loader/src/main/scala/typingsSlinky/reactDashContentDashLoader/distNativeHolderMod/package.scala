package typingsSlinky.reactDashContentDashLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distNativeHolderMod {
  import typingsSlinky.reactDashContentDashLoader.distNativeInterfaceMod.IContentLoaderProps
  import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.animate
  import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.height
  import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.preserveAspectRatio
  import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.primaryColor
  import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.rtl
  import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.secondaryColor
  import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.speed
  import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.style
  import typingsSlinky.reactDashContentDashLoader.reactDashContentDashLoaderStrings.width
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Required

  type DefaultProps = Pick[
    Required[IContentLoaderProps], 
    animate | height | preserveAspectRatio | primaryColor | rtl | secondaryColor | speed | style | width
  ]
}
