package typingsSlinky.jestDashChangedDashFiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typingsSlinky.atJestTypes.buildConfigMod.Path
  import typingsSlinky.std.Set

  type ChangedFilesPromise = js.Promise[ChangedFiles]
  type Paths = Set[Path]
}
