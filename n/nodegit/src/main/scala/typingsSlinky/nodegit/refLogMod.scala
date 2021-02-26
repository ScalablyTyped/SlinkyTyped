package typingsSlinky.nodegit

import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.signatureMod.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refLogMod {
  
  @JSImport("nodegit/ref-log", "Reflog")
  @js.native
  class Reflog () extends StObject {
    
    def append(id: Oid, committer: Signature, msg: String): Double = js.native
    
    def drop(idx: Double, rewritePreviousEntry: Double): Double = js.native
    
    def entryByIndex(idx: Double): ReflogEntry = js.native
    
    def entrycount(): Double = js.native
    
    def free(): Unit = js.native
    
    def write(): Double = js.native
  }
  /* static members */
  object Reflog {
    
    @JSImport("nodegit/ref-log", "Reflog.delete")
    @js.native
    def delete(repo: Repository, name: String): Double = js.native
    
    @JSImport("nodegit/ref-log", "Reflog.read")
    @js.native
    def read(repo: Repository, name: String): js.Promise[Reflog] = js.native
    
    @JSImport("nodegit/ref-log", "Reflog.rename")
    @js.native
    def rename(repo: Repository, oldName: String, name: String): Double = js.native
  }
  
  @JSImport("nodegit/ref-log", "ReflogEntry")
  @js.native
  class ReflogEntry () extends StObject {
    
    def committer(): Signature = js.native
    
    def idNew(): Oid = js.native
    
    def idOld(): Oid = js.native
    
    def message(): String = js.native
  }
}
