package typingsSlinky.nodegit.mod

import typingsSlinky.nodegit.statusOptionsMod.StatusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "StatusList")
@js.native
class StatusList ()
  extends typingsSlinky.nodegit.statusListMod.StatusList

/* static members */
@JSImport("nodegit", "StatusList")
@js.native
object StatusList extends js.Object {
  def create(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[typingsSlinky.nodegit.statusListMod.StatusList] = js.native
  def create(repo: typingsSlinky.nodegit.repositoryMod.Repository, opts: StatusOptions): js.Promise[typingsSlinky.nodegit.statusListMod.StatusList] = js.native
}

