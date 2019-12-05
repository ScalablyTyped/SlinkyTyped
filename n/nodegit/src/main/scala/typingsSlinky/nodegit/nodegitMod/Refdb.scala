package typingsSlinky.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Refdb")
@js.native
class Refdb ()
  extends typingsSlinky.nodegit.refDashDbMod.Refdb

/* static members */
@JSImport("nodegit", "Refdb")
@js.native
object Refdb extends js.Object {
  def open(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[typingsSlinky.nodegit.refDashDbMod.Refdb] = js.native
}

