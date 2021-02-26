package typingsSlinky.nodegit

import typingsSlinky.nodegit.cloneOptionsMod.CloneOptions
import typingsSlinky.nodegit.nodegitNumbers.`0`
import typingsSlinky.nodegit.nodegitNumbers.`1`
import typingsSlinky.nodegit.nodegitNumbers.`2`
import typingsSlinky.nodegit.nodegitNumbers.`3`
import typingsSlinky.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloneMod {
  
  @JSImport("nodegit/clone", "Clone")
  @js.native
  class Clone () extends StObject
  /* static members */
  object Clone {
    
    /**
      * Patch repository cloning to automatically coerce objects.
      */
    @JSImport("nodegit/clone", "Clone.clone")
    @js.native
    def clone(url: String, localPath: String): js.Promise[Repository] = js.native
    @JSImport("nodegit/clone", "Clone.clone")
    @js.native
    def clone(url: String, localPath: String, options: CloneOptions): js.Promise[Repository] = js.native
    
    @JSImport("nodegit/clone", "Clone.initOptions")
    @js.native
    def initOptions(opts: CloneOptions, version: Double): Double = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
      - typingsSlinky.nodegit.nodegitNumbers.`3`
    */
    trait LOCAL extends StObject
    object LOCAL {
      
      @scala.inline
      def AUTO: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def LOCAL: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def NO_LINKS: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def NO_LOCAL: `2` = 2.asInstanceOf[`2`]
    }
  }
}
