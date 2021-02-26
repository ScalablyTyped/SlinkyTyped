package typingsSlinky.nodegit

import typingsSlinky.nodegit.nodegitNumbers.`0`
import typingsSlinky.nodegit.nodegitNumbers.`1`
import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.revWalkMod.Revwalk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packBuilderMod {
  
  @JSImport("nodegit/pack-builder", "Packbuilder")
  @js.native
  class Packbuilder () extends StObject {
    
    def free(): Unit = js.native
    
    def hash(): Oid = js.native
    
    def insert(id: Oid, name: String): Double = js.native
    
    def insertCommit(id: Oid): Double = js.native
    
    def insertRecur(id: Oid, name: String): Double = js.native
    
    def insertTree(id: Oid): Double = js.native
    
    def insertWalk(walk: Revwalk): Double = js.native
    
    def objectCount(): Double = js.native
    
    def setThreads(n: Double): Double = js.native
    
    def written(): Double = js.native
  }
  /* static members */
  object Packbuilder {
    
    @JSImport("nodegit/pack-builder", "Packbuilder.create")
    @js.native
    def create(repo: Repository): Packbuilder = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
    */
    trait STAGE extends StObject
    object STAGE {
      
      @scala.inline
      def ADDING_OBJECTS: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def DELTAFICATION: `1` = 1.asInstanceOf[`1`]
    }
  }
}
