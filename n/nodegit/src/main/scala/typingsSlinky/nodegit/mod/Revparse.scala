package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Revparse")
@js.native
class Revparse ()
  extends typingsSlinky.nodegit.revParseMod.Revparse
/* static members */
object Revparse {
  
  @JSImport("nodegit", "Revparse.ext")
  @js.native
  def ext(
    objectOut: typingsSlinky.nodegit.objectMod.Object,
    referenceOut: typingsSlinky.nodegit.referenceMod.Reference,
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    spec: String
  ): Double = js.native
  
  @JSImport("nodegit", "Revparse.single")
  @js.native
  def single(repo: typingsSlinky.nodegit.repositoryMod.Repository, spec: String): js.Promise[typingsSlinky.nodegit.objectMod.Object] = js.native
}
