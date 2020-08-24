package typingsSlinky.appBuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windowsCodeSignMod {
  type CustomWindowsSign = js.Function2[
    /* configuration */ typingsSlinky.appBuilderLib.windowsCodeSignMod.CustomWindowsSignTaskConfiguration, 
    /* packager */ js.UndefOr[typingsSlinky.appBuilderLib.winPackagerMod.WinPackager], 
    js.Promise[js.Any]
  ]
}
