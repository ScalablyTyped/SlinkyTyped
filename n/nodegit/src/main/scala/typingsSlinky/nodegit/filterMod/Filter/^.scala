package typingsSlinky.nodegit.filterMod.Filter

import typingsSlinky.node.fsMod.WriteStream
import typingsSlinky.nodegit.blobMod.Blob
import typingsSlinky.nodegit.bufMod.Buf
import typingsSlinky.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/filter", "Filter")
@js.native
object ^ extends js.Object {
  def listContains(filters: js.Any, name: String): Double = js.native
  def listLength(fl: js.Any): Double = js.native
  def listNew(repo: Repository, mode: Double, options: Double): js.Promise[_] = js.native
  def listStreamBlob(filters: js.Any, blob: Blob, target: WriteStream): Double = js.native
  def listStreamData(filters: js.Any, data: Buf, target: WriteStream): Double = js.native
  def listStreamFile(filters: js.Any, repo: Repository, path: String, target: WriteStream): Double = js.native
  def unregister(name: String): Double = js.native
}

