package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FilesystemChangeEvent = js.Array[typingsSlinky.atom.mod.FilesystemChange]
  type TestRunner = js.Function1[/* params */ typingsSlinky.atom.mod.TestRunnerParams, js.Promise[scala.Double]]
}
