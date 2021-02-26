package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Tag")
@js.native
class Tag ()
  extends typingsSlinky.nodegit.tagMod.Tag
/* static members */
object Tag {
  
  @JSImport("nodegit", "Tag.annotationCreate")
  @js.native
  def annotationCreate(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typingsSlinky.nodegit.objectMod.Object,
    tagger: typingsSlinky.nodegit.signatureMod.Signature,
    message: String
  ): js.Promise[typingsSlinky.nodegit.oidMod.Oid] = js.native
  
  @JSImport("nodegit", "Tag.create")
  @js.native
  def create(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typingsSlinky.nodegit.objectMod.Object,
    tagger: typingsSlinky.nodegit.signatureMod.Signature,
    message: String,
    force: Double
  ): js.Promise[typingsSlinky.nodegit.oidMod.Oid] = js.native
  
  @JSImport("nodegit", "Tag.createLightweight")
  @js.native
  def createLightweight(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    tagName: String,
    target: typingsSlinky.nodegit.objectMod.Object,
    force: Double
  ): js.Promise[typingsSlinky.nodegit.oidMod.Oid] = js.native
  
  @JSImport("nodegit", "Tag.delete")
  @js.native
  def delete(repo: typingsSlinky.nodegit.repositoryMod.Repository, tagName: String): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Tag.list")
  @js.native
  def list(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  
  @JSImport("nodegit", "Tag.listMatch")
  @js.native
  def listMatch(tagNames: String, pattern: String, repo: typingsSlinky.nodegit.repositoryMod.Repository): Double = js.native
  @JSImport("nodegit", "Tag.listMatch")
  @js.native
  def listMatch(tagNames: js.Array[String], pattern: String, repo: typingsSlinky.nodegit.repositoryMod.Repository): Double = js.native
  @JSImport("nodegit", "Tag.listMatch")
  @js.native
  def listMatch(
    tagNames: typingsSlinky.nodegit.strArrayMod.Strarray,
    pattern: String,
    repo: typingsSlinky.nodegit.repositoryMod.Repository
  ): Double = js.native
  
  /**
    * Retrieves the tag pointed to by the oid
    *
    *
    */
  @JSImport("nodegit", "Tag.lookup")
  @js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsSlinky.nodegit.tagMod.Tag] = js.native
  @JSImport("nodegit", "Tag.lookup")
  @js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: typingsSlinky.nodegit.oidMod.Oid): js.Promise[typingsSlinky.nodegit.tagMod.Tag] = js.native
  @JSImport("nodegit", "Tag.lookup")
  @js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: typingsSlinky.nodegit.tagMod.Tag): js.Promise[typingsSlinky.nodegit.tagMod.Tag] = js.native
  
  @JSImport("nodegit", "Tag.lookupPrefix")
  @js.native
  def lookupPrefix(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.oidMod.Oid,
    len: Double
  ): js.Promise[typingsSlinky.nodegit.tagMod.Tag] = js.native
}
