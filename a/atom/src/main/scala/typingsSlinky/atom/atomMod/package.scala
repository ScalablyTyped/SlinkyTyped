package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atomMod {
  import org.scalajs.dom.raw.EventTarget
  import typingsSlinky.atom.Anon_Description
  import typingsSlinky.atom.atomStrings.created
  import typingsSlinky.atom.atomStrings.deleted
  import typingsSlinky.atom.atomStrings.modified

  type CommandRegistryListener[TargetType /* <: EventTarget */] = Anon_Description[TargetType] | (js.Function1[/* event */ CommandEvent[TargetType], Unit | js.Promise[Unit]])
  type FilesystemChange = (FilesystemChangeBasic[created | modified | deleted]) | FilesystemChangeRename
  type FilesystemChangeEvent = js.Array[FilesystemChange]
  type PointCompatible = PointLike | (js.Tuple2[Double, Double])
  type RangeCompatible = RangeLike | (js.Tuple2[PointLike | (js.Tuple2[Double, Double]), PointLike | (js.Tuple2[Double, Double])])
  type TestRunner = js.Function1[/* params */ TestRunnerParams, js.Promise[Double]]
}
