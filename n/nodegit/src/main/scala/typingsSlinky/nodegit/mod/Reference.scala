package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Reference")
@js.native
class Reference ()
  extends typingsSlinky.nodegit.referenceMod.Reference
/* static members */
object Reference {
  
  @JSImport("nodegit", "Reference.create")
  @js.native
  def create(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    name: String,
    id: typingsSlinky.nodegit.oidMod.Oid,
    force: Double,
    logMessage: String
  ): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  
  @JSImport("nodegit", "Reference.createMatching")
  @js.native
  def createMatching(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    name: String,
    id: typingsSlinky.nodegit.oidMod.Oid,
    force: Double,
    currentId: typingsSlinky.nodegit.oidMod.Oid,
    logMessage: String
  ): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  
  @JSImport("nodegit", "Reference.dwim")
  @js.native
  def dwim(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  @JSImport("nodegit", "Reference.dwim")
  @js.native
  def dwim(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  @JSImport("nodegit", "Reference.dwim")
  @js.native
  def dwim(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.referenceMod.Reference
  ): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  @JSImport("nodegit", "Reference.dwim")
  @js.native
  def dwim(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.referenceMod.Reference,
    callback: js.Function
  ): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  
  @JSImport("nodegit", "Reference.ensureLog")
  @js.native
  def ensureLog(repo: typingsSlinky.nodegit.repositoryMod.Repository, refname: String): Double = js.native
  
  @JSImport("nodegit", "Reference.hasLog")
  @js.native
  def hasLog(repo: typingsSlinky.nodegit.repositoryMod.Repository, refname: String): Double = js.native
  
  @JSImport("nodegit", "Reference.isValidName")
  @js.native
  def isValidName(refname: String): Double = js.native
  
  @JSImport("nodegit", "Reference.list")
  @js.native
  def list(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  
  @JSImport("nodegit", "Reference.lookup")
  @js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  @JSImport("nodegit", "Reference.lookup")
  @js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  @JSImport("nodegit", "Reference.lookup")
  @js.native
  def lookup(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.referenceMod.Reference
  ): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  @JSImport("nodegit", "Reference.lookup")
  @js.native
  def lookup(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.referenceMod.Reference,
    callback: js.Function
  ): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  
  @JSImport("nodegit", "Reference.nameToId")
  @js.native
  def nameToId(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsSlinky.nodegit.oidMod.Oid] = js.native
  
  @JSImport("nodegit", "Reference.normalizeName")
  @js.native
  def normalizeName(bufferOut: String, bufferSize: Double, name: String, flags: Double): Double = js.native
  
  @JSImport("nodegit", "Reference.remove")
  @js.native
  def remove(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String): Double = js.native
  
  @JSImport("nodegit", "Reference.symbolicCreate")
  @js.native
  def symbolicCreate(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    name: String,
    target: String,
    force: Double,
    logMessage: String
  ): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  
  @JSImport("nodegit", "Reference.symbolicCreateMatching")
  @js.native
  def symbolicCreateMatching(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    name: String,
    target: String,
    force: Double,
    currentValue: String,
    logMessage: String
  ): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
}
