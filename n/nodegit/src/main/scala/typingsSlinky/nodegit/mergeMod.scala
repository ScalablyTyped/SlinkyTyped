package typingsSlinky.nodegit

import typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit
import typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
import typingsSlinky.nodegit.commitMod.Commit
import typingsSlinky.nodegit.mergeFileInputMod.MergeFileInput
import typingsSlinky.nodegit.mergeOptionsMod.MergeOptions
import typingsSlinky.nodegit.mod.Index
import typingsSlinky.nodegit.nodegitNumbers.`0`
import typingsSlinky.nodegit.nodegitNumbers.`128`
import typingsSlinky.nodegit.nodegitNumbers.`16`
import typingsSlinky.nodegit.nodegitNumbers.`1`
import typingsSlinky.nodegit.nodegitNumbers.`2`
import typingsSlinky.nodegit.nodegitNumbers.`32`
import typingsSlinky.nodegit.nodegitNumbers.`3`
import typingsSlinky.nodegit.nodegitNumbers.`4`
import typingsSlinky.nodegit.nodegitNumbers.`64`
import typingsSlinky.nodegit.nodegitNumbers.`8`
import typingsSlinky.nodegit.oidArrayMod.Oidarray
import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
  @JSImport("nodegit/merge", "Merge")
  @js.native
  class Merge () extends StObject
  /* static members */
  object Merge {
    
    @JSImport("nodegit/merge", "Merge.base")
    @js.native
    def base(repo: Repository, one: Oid, two: Oid): js.Promise[Oid] = js.native
    
    @JSImport("nodegit/merge", "Merge.bases")
    @js.native
    def bases(repo: Repository, one: Oid, two: Oid): js.Promise[Oidarray] = js.native
    
    @JSImport("nodegit/merge", "Merge.commits")
    @js.native
    def commits(repo: Repository, ourCommit: Commit, theirCommit: Commit): js.Any = js.native
    @JSImport("nodegit/merge", "Merge.commits")
    @js.native
    def commits(repo: Repository, ourCommit: Commit, theirCommit: Commit, options: MergeOptions): js.Any = js.native
    
    @JSImport("nodegit/merge", "Merge.fileInitInput")
    @js.native
    def fileInitInput(opts: MergeFileInput, version: Double): Double = js.native
    
    @JSImport("nodegit/merge", "Merge.initOptions")
    @js.native
    def initOptions(opts: MergeOptions, version: Double): Double = js.native
    
    @JSImport("nodegit/merge", "Merge.merge")
    @js.native
    def merge(repo: Repository, theirHead: AnnotatedCommit): js.Any = js.native
    @JSImport("nodegit/merge", "Merge.merge")
    @js.native
    def merge(
      repo: Repository,
      theirHead: AnnotatedCommit,
      mergeOpts: js.UndefOr[scala.Nothing],
      checkoutOpts: CheckoutOptions
    ): js.Any = js.native
    @JSImport("nodegit/merge", "Merge.merge")
    @js.native
    def merge(repo: Repository, theirHead: AnnotatedCommit, mergeOpts: MergeOptions): js.Any = js.native
    @JSImport("nodegit/merge", "Merge.merge")
    @js.native
    def merge(
      repo: Repository,
      theirHead: AnnotatedCommit,
      mergeOpts: MergeOptions,
      checkoutOpts: CheckoutOptions
    ): js.Any = js.native
    
    @JSImport("nodegit/merge", "Merge.trees")
    @js.native
    def trees(repo: Repository, ancestorTree: Tree, ourTree: Tree, theirTree: Tree): js.Promise[Index] = js.native
    @JSImport("nodegit/merge", "Merge.trees")
    @js.native
    def trees(repo: Repository, ancestorTree: Tree, ourTree: Tree, theirTree: Tree, opts: MergeOptions): js.Promise[Index] = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
      - typingsSlinky.nodegit.nodegitNumbers.`4`
      - typingsSlinky.nodegit.nodegitNumbers.`8`
    */
    trait ANALYSIS extends StObject
    object ANALYSIS {
      
      @scala.inline
      def FASTFORWARD: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def NONE: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def NORMAL: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def UNBORN: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def UP_TO_DATE: `2` = 2.asInstanceOf[`2`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
      - typingsSlinky.nodegit.nodegitNumbers.`3`
    */
    trait FILE_FAVOR extends StObject
    object FILE_FAVOR {
      
      @scala.inline
      def NORMAL: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def OURS: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def THEIRS: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def UNION: `3` = 3.asInstanceOf[`3`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
      - typingsSlinky.nodegit.nodegitNumbers.`4`
      - typingsSlinky.nodegit.nodegitNumbers.`8`
      - typingsSlinky.nodegit.nodegitNumbers.`16`
      - typingsSlinky.nodegit.nodegitNumbers.`32`
      - typingsSlinky.nodegit.nodegitNumbers.`64`
      - typingsSlinky.nodegit.nodegitNumbers.`128`
    */
    trait FILE_FLAGS extends StObject
    object FILE_FLAGS {
      
      @scala.inline
      def FILE_DEFAULT: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def FILE_DIFF_MINIMAL: `128` = 128.asInstanceOf[`128`]
      
      @scala.inline
      def FILE_DIFF_PATIENCE: `64` = 64.asInstanceOf[`64`]
      
      @scala.inline
      def FILE_IGNORE_WHITESPACE: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def FILE_IGNORE_WHITESPACE_CHANGE: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def FILE_IGNORE_WHITESPACE_EOL: `32` = 32.asInstanceOf[`32`]
      
      @scala.inline
      def FILE_SIMPLIFY_ALNUM: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def FILE_STYLE_DIFF3: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def FILE_STYLE_MERGE: `1` = 1.asInstanceOf[`1`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
    */
    trait PREFERENCE extends StObject
    object PREFERENCE {
      
      @scala.inline
      def FASTFORWARD_ONLY: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def NONE: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def NO_FASTFORWARD: `1` = 1.asInstanceOf[`1`]
    }
    
    object TREE_FLAG {
      
      @scala.inline
      def TREE_FIND_RENAMES: `1` = 1.asInstanceOf[`1`]
    }
    type TREE_FLAG = `1`
  }
}
