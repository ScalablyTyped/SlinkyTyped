package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Revparse")
@js.native
class Revparse ()
  extends typingsSlinky.nodegit.revParseMod.Revparse

/* static members */
@JSImport("nodegit", "Revparse")
@js.native
object Revparse extends js.Object {
  def ext(
    objectOut: typingsSlinky.nodegit.objectMod.Object,
    referenceOut: typingsSlinky.nodegit.referenceMod.Reference,
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    spec: String
  ): Double = js.native
  def single(repo: typingsSlinky.nodegit.repositoryMod.Repository, spec: String): js.Promise[typingsSlinky.nodegit.objectMod.Object] = js.native
}

