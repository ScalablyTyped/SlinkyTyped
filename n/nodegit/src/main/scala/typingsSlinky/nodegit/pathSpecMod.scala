package typingsSlinky.nodegit

import typingsSlinky.nodegit.diffDeltaMod.DiffDelta
import typingsSlinky.nodegit.diffMod.Diff
import typingsSlinky.nodegit.mod.Index
import typingsSlinky.nodegit.nodegitNumbers.`0`
import typingsSlinky.nodegit.nodegitNumbers.`16`
import typingsSlinky.nodegit.nodegitNumbers.`1`
import typingsSlinky.nodegit.nodegitNumbers.`2`
import typingsSlinky.nodegit.nodegitNumbers.`32`
import typingsSlinky.nodegit.nodegitNumbers.`4`
import typingsSlinky.nodegit.nodegitNumbers.`8`
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.strArrayMod.Strarray
import typingsSlinky.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathSpecMod {
  
  @JSImport("nodegit/path-spec", "Pathspec")
  @js.native
  class Pathspec () extends StObject {
    
    def free(): Unit = js.native
    
    def matchDiff(diff: Diff, flags: Double): js.Promise[_] = js.native
    
    def matchIndex(index: Index, flags: Double): js.Promise[_] = js.native
    
    def matchTree(tree: Tree, flags: Double): js.Promise[_] = js.native
    
    def matchWorkdir(repo: Repository, flags: Double): js.Promise[_] = js.native
    
    def matchesPath(flags: Double, path: String): Double = js.native
  }
  /* static members */
  object Pathspec {
    
    @JSImport("nodegit/path-spec", "Pathspec.create")
    @js.native
    def create(pathspec: String): Pathspec = js.native
    @JSImport("nodegit/path-spec", "Pathspec.create")
    @js.native
    def create(pathspec: js.Array[String]): Pathspec = js.native
    @JSImport("nodegit/path-spec", "Pathspec.create")
    @js.native
    def create(pathspec: Strarray): Pathspec = js.native
    
    @JSImport("nodegit/path-spec", "Pathspec.matchListDiffEntry")
    @js.native
    def matchListDiffEntry(m: js.Any, pos: Double): DiffDelta = js.native
    
    @JSImport("nodegit/path-spec", "Pathspec.matchListEntry")
    @js.native
    def matchListEntry(m: js.Any, pos: Double): String = js.native
    
    @JSImport("nodegit/path-spec", "Pathspec.matchListEntrycount")
    @js.native
    def matchListEntrycount(m: js.Any): Double = js.native
    
    @JSImport("nodegit/path-spec", "Pathspec.matchListFailedEntry")
    @js.native
    def matchListFailedEntry(m: js.Any, pos: Double): String = js.native
    
    @JSImport("nodegit/path-spec", "Pathspec.matchListFailedEntrycount")
    @js.native
    def matchListFailedEntrycount(m: js.Any): Double = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
      - typingsSlinky.nodegit.nodegitNumbers.`4`
      - typingsSlinky.nodegit.nodegitNumbers.`8`
      - typingsSlinky.nodegit.nodegitNumbers.`16`
      - typingsSlinky.nodegit.nodegitNumbers.`32`
    */
    trait FLAG extends StObject
    object FLAG {
      
      @scala.inline
      def DEFAULT: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def FAILURES_ONLY: `32` = 32.asInstanceOf[`32`]
      
      @scala.inline
      def FIND_FAILURES: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def IGNORE_CASE: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def NO_GLOB: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def NO_MATCH_ERROR: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def USE_CASE: `2` = 2.asInstanceOf[`2`]
    }
  }
}
