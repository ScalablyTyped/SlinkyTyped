package typingsSlinky.nodegit

import typingsSlinky.nodegit.nodegitNumbers.`0`
import typingsSlinky.nodegit.nodegitNumbers.`1024`
import typingsSlinky.nodegit.nodegitNumbers.`128`
import typingsSlinky.nodegit.nodegitNumbers.`16384`
import typingsSlinky.nodegit.nodegitNumbers.`16`
import typingsSlinky.nodegit.nodegitNumbers.`1`
import typingsSlinky.nodegit.nodegitNumbers.`2048`
import typingsSlinky.nodegit.nodegitNumbers.`256`
import typingsSlinky.nodegit.nodegitNumbers.`2`
import typingsSlinky.nodegit.nodegitNumbers.`32768`
import typingsSlinky.nodegit.nodegitNumbers.`32`
import typingsSlinky.nodegit.nodegitNumbers.`4096`
import typingsSlinky.nodegit.nodegitNumbers.`4`
import typingsSlinky.nodegit.nodegitNumbers.`512`
import typingsSlinky.nodegit.nodegitNumbers.`64`
import typingsSlinky.nodegit.nodegitNumbers.`8192`
import typingsSlinky.nodegit.nodegitNumbers.`8`
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.statusEntryMod.StatusEntry
import typingsSlinky.nodegit.statusListMod.StatusList
import typingsSlinky.nodegit.statusOptionsMod.StatusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusMod {
  
  @JSImport("nodegit/status", "Status")
  @js.native
  class Status () extends StObject
  /* static members */
  object Status {
    
    @JSImport("nodegit/status", "Status.byIndex")
    @js.native
    def byIndex(statuslist: StatusList, idx: Double): StatusEntry = js.native
    
    @JSImport("nodegit/status", "Status.file")
    @js.native
    def file(repo: Repository, path: String): Double = js.native
    
    @JSImport("nodegit/status", "Status.foreach")
    @js.native
    def foreach(repo: Repository): js.Promise[Double] = js.native
    @JSImport("nodegit/status", "Status.foreach")
    @js.native
    def foreach(repo: Repository, callback: js.Function): js.Promise[Double] = js.native
    
    @JSImport("nodegit/status", "Status.foreachExt")
    @js.native
    def foreachExt(repo: Repository): js.Promise[Double] = js.native
    @JSImport("nodegit/status", "Status.foreachExt")
    @js.native
    def foreachExt(repo: Repository, opts: js.UndefOr[scala.Nothing], callback: js.Function): js.Promise[Double] = js.native
    @JSImport("nodegit/status", "Status.foreachExt")
    @js.native
    def foreachExt(repo: Repository, opts: StatusOptions): js.Promise[Double] = js.native
    @JSImport("nodegit/status", "Status.foreachExt")
    @js.native
    def foreachExt(repo: Repository, opts: StatusOptions, callback: js.Function): js.Promise[Double] = js.native
    
    @JSImport("nodegit/status", "Status.shouldIgnore")
    @js.native
    def shouldIgnore(ignored: Double, repo: Repository, path: String): Double = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
      - typingsSlinky.nodegit.nodegitNumbers.`4`
      - typingsSlinky.nodegit.nodegitNumbers.`8`
      - typingsSlinky.nodegit.nodegitNumbers.`16`
      - typingsSlinky.nodegit.nodegitNumbers.`32`
      - typingsSlinky.nodegit.nodegitNumbers.`64`
      - typingsSlinky.nodegit.nodegitNumbers.`128`
      - typingsSlinky.nodegit.nodegitNumbers.`256`
      - typingsSlinky.nodegit.nodegitNumbers.`512`
      - typingsSlinky.nodegit.nodegitNumbers.`1024`
      - typingsSlinky.nodegit.nodegitNumbers.`2048`
      - typingsSlinky.nodegit.nodegitNumbers.`4096`
      - typingsSlinky.nodegit.nodegitNumbers.`8192`
      - typingsSlinky.nodegit.nodegitNumbers.`16384`
      - typingsSlinky.nodegit.nodegitNumbers.`32768`
    */
    trait OPT extends StObject
    object OPT {
      
      @scala.inline
      def DISABLE_PATHSPEC_MATCH: `32` = 32.asInstanceOf[`32`]
      
      @scala.inline
      def EXCLUDE_SUBMODULES: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def INCLUDE_IGNORED: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def INCLUDE_UNMODIFIED: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def INCLUDE_UNREADABLE: `16384` = 16384.asInstanceOf[`16384`]
      
      @scala.inline
      def INCLUDE_UNREADABLE_AS_UNTRACKED: `32768` = 32768.asInstanceOf[`32768`]
      
      @scala.inline
      def INCLUDE_UNTRACKED: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def NO_REFRESH: `4096` = 4096.asInstanceOf[`4096`]
      
      @scala.inline
      def RECURSE_IGNORED_DIRS: `64` = 64.asInstanceOf[`64`]
      
      @scala.inline
      def RECURSE_UNTRACKED_DIRS: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def RENAMES_FROM_REWRITES: `2048` = 2048.asInstanceOf[`2048`]
      
      @scala.inline
      def RENAMES_HEAD_TO_INDEX: `128` = 128.asInstanceOf[`128`]
      
      @scala.inline
      def RENAMES_INDEX_TO_WORKDIR: `256` = 256.asInstanceOf[`256`]
      
      @scala.inline
      def SORT_CASE_INSENSITIVELY: `1024` = 1024.asInstanceOf[`1024`]
      
      @scala.inline
      def SORT_CASE_SENSITIVELY: `512` = 512.asInstanceOf[`512`]
      
      @scala.inline
      def UPDATE_INDEX: `8192` = 8192.asInstanceOf[`8192`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
    */
    trait SHOW extends StObject
    object SHOW {
      
      @scala.inline
      def INDEX_AND_WORKDIR: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def INDEX_ONLY: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def WORKDIR_ONLY: `2` = 2.asInstanceOf[`2`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
      - typingsSlinky.nodegit.nodegitNumbers.`4`
      - typingsSlinky.nodegit.nodegitNumbers.`8`
      - typingsSlinky.nodegit.nodegitNumbers.`16`
      - typingsSlinky.nodegit.nodegitNumbers.`128`
      - typingsSlinky.nodegit.nodegitNumbers.`256`
      - typingsSlinky.nodegit.nodegitNumbers.`512`
      - typingsSlinky.nodegit.nodegitNumbers.`1024`
      - typingsSlinky.nodegit.nodegitNumbers.`2048`
      - typingsSlinky.nodegit.nodegitNumbers.`4096`
      - typingsSlinky.nodegit.nodegitNumbers.`16384`
      - typingsSlinky.nodegit.nodegitNumbers.`32768`
    */
    trait STATUS extends StObject
    object STATUS {
      
      @scala.inline
      def CONFLICTED: `32768` = 32768.asInstanceOf[`32768`]
      
      @scala.inline
      def CURRENT: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def IGNORED: `16384` = 16384.asInstanceOf[`16384`]
      
      @scala.inline
      def INDEX_DELETED: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def INDEX_MODIFIED: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def INDEX_NEW: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def INDEX_RENAMED: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def INDEX_TYPECHANGE: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def WT_DELETED: `512` = 512.asInstanceOf[`512`]
      
      @scala.inline
      def WT_MODIFIED: `256` = 256.asInstanceOf[`256`]
      
      @scala.inline
      def WT_NEW: `128` = 128.asInstanceOf[`128`]
      
      @scala.inline
      def WT_RENAMED: `2048` = 2048.asInstanceOf[`2048`]
      
      @scala.inline
      def WT_TYPECHANGE: `1024` = 1024.asInstanceOf[`1024`]
      
      @scala.inline
      def WT_UNREADABLE: `4096` = 4096.asInstanceOf[`4096`]
    }
  }
}
