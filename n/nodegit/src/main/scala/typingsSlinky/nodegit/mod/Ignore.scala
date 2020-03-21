package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Ignore")
@js.native
class Ignore ()
  extends typingsSlinky.nodegit.ignoreMod.Ignore

/* static members */
@JSImport("nodegit", "Ignore")
@js.native
object Ignore extends js.Object {
  def addRule(repo: typingsSlinky.nodegit.repositoryMod.Repository, rules: String): Double = js.native
  def clearInternalRules(repo: typingsSlinky.nodegit.repositoryMod.Repository): Double = js.native
  def pathIsIgnored(repo: typingsSlinky.nodegit.repositoryMod.Repository, path: String): js.Promise[Double] = js.native
}

