package typingsSlinky.nodegit

import typingsSlinky.nodegit.fetchOptionsMod.FetchOptions
import typingsSlinky.nodegit.nodegitNumbers.`0`
import typingsSlinky.nodegit.nodegitNumbers.`1`
import typingsSlinky.nodegit.nodegitNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchMod {
  
  @JSImport("nodegit/fetch", "Fetch")
  @js.native
  class Fetch () extends StObject
  /* static members */
  object Fetch {
    
    @JSImport("nodegit/fetch", "Fetch.initOptions")
    @js.native
    def initOptions(opts: FetchOptions, version: Double): Double = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
    */
    trait PRUNE extends StObject
    object PRUNE {
      
      @scala.inline
      def GIT_FETCH_NO_PRUNE: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def GIT_FETCH_PRUNE: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def GIT_FETCH_PRUNE_UNSPECIFIED: `0` = 0.asInstanceOf[`0`]
    }
  }
}
