package typingsSlinky.nodegit.diffMod

import typingsSlinky.nodegit.bufMod.Buf
import typingsSlinky.nodegit.convenientPatchMod.ConvenientPatch
import typingsSlinky.nodegit.diffDeltaMod.DiffDelta
import typingsSlinky.nodegit.diffMod.Diff.FORMAT
import typingsSlinky.nodegit.diffPerfDataMod.DiffPerfdata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff", "Diff")
@js.native
class Diff_ () extends js.Object {
  def findSimilar(): js.Promise[Double] = js.native
  def findSimilar(options: DiffFindOptions): js.Promise[Double] = js.native
  def getDelta(idx: Double): DiffDelta = js.native
  def getPerfdata(): js.Promise[DiffPerfdata] = js.native
  def merge(from: Diff): js.Promise[Double] = js.native
  def numDeltas(): Double = js.native
  /**
    * Retrieve patches in this difflist
    *
    *
    */
  def patches(): js.Promise[js.Array[ConvenientPatch]] = js.native
  def toBuf(format: FORMAT): js.Promise[Buf] = js.native
}

