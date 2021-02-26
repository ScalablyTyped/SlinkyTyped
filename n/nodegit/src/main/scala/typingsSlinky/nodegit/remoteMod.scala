package typingsSlinky.nodegit

import typingsSlinky.nodegit.bufMod.Buf
import typingsSlinky.nodegit.enumsMod.Enums.DIRECTION
import typingsSlinky.nodegit.fetchOptionsMod.FetchOptions
import typingsSlinky.nodegit.nodegitNumbers.`0`
import typingsSlinky.nodegit.nodegitNumbers.`1`
import typingsSlinky.nodegit.nodegitNumbers.`2`
import typingsSlinky.nodegit.nodegitNumbers.`3`
import typingsSlinky.nodegit.pushOptionsMod.PushOptions
import typingsSlinky.nodegit.refSpecMod.Refspec
import typingsSlinky.nodegit.remoteCallbacksMod.RemoteCallbacks
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.strArrayMod.Strarray
import typingsSlinky.nodegit.transferProgressMod.TransferProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteMod {
  
  @JSImport("nodegit/remote", "Remote")
  @js.native
  class Remote () extends StObject {
    
    def autotag(): Double = js.native
    
    def connect(direction: DIRECTION, callbacks: RemoteCallbacks): js.Promise[Double] = js.native
    def connect(direction: DIRECTION, callbacks: RemoteCallbacks, callback: js.Function): js.Promise[Double] = js.native
    
    def connected(): Double = js.native
    
    def defaultBranch(): js.Promise[Buf] = js.native
    
    def disconnect(): js.Promise[Unit] = js.native
    
    def download(refSpecs: js.Array[_]): js.Promise[Double] = js.native
    def download(refSpecs: js.Array[_], opts: js.UndefOr[scala.Nothing], callback: js.Function): js.Promise[Double] = js.native
    def download(refSpecs: js.Array[_], opts: FetchOptions): js.Promise[Double] = js.native
    def download(refSpecs: js.Array[_], opts: FetchOptions, callback: js.Function): js.Promise[Double] = js.native
    
    def dup(): js.Promise[Remote] = js.native
    
    def fetch(refSpecs: js.Array[_], opts: FetchOptions, message: String): js.Promise[Double] = js.native
    def fetch(refSpecs: js.Array[_], opts: FetchOptions, message: String, callback: js.Function): js.Promise[Double] = js.native
    
    def free(): Unit = js.native
    
    def getFetchRefspecs(): js.Promise[js.Array[_]] = js.native
    
    def getPushRefspecs(): js.Promise[js.Array[_]] = js.native
    
    def getRefspec(n: Double): Refspec = js.native
    
    def name(): String = js.native
    
    def owner(): Repository = js.native
    
    def prune(callbacks: RemoteCallbacks): Double = js.native
    
    def pruneRefs(): Double = js.native
    
    def push(refSpecs: js.Array[_]): js.Promise[Double] = js.native
    def push(refSpecs: js.Array[_], options: js.UndefOr[scala.Nothing], callback: js.Function): js.Promise[Double] = js.native
    def push(refSpecs: js.Array[_], options: PushOptions): js.Promise[Double] = js.native
    def push(refSpecs: js.Array[_], options: PushOptions, callback: js.Function): js.Promise[Double] = js.native
    
    def pushurl(): String = js.native
    
    /**
      * Lists advertised references from a remote. You must connect to the remote before using referenceList.
      */
    def referenceList(): js.Promise[js.Array[_]] = js.native
    
    def refspecCount(): Double = js.native
    
    def stats(): TransferProgress = js.native
    
    def stop(): Unit = js.native
    
    def updateTips(callbacks: RemoteCallbacks, updateFetchhead: Double, downloadTags: Double, reflogMessage: String): Double = js.native
    
    def upload(refspecs: String): Double = js.native
    def upload(refspecs: String, opts: PushOptions): Double = js.native
    def upload(refspecs: js.Array[String]): Double = js.native
    def upload(refspecs: js.Array[String], opts: PushOptions): Double = js.native
    def upload(refspecs: Strarray): Double = js.native
    def upload(refspecs: Strarray, opts: PushOptions): Double = js.native
    
    def url(): String = js.native
  }
  /* static members */
  object Remote {
    
    @JSImport("nodegit/remote", "Remote.addFetch")
    @js.native
    def addFetch(repo: Repository, remote: String, refspec: String): Double = js.native
    
    @JSImport("nodegit/remote", "Remote.addPush")
    @js.native
    def addPush(repo: Repository, remote: String, refspec: String): Double = js.native
    
    @JSImport("nodegit/remote", "Remote.create")
    @js.native
    def create(repo: Repository, name: String, url: String): js.Promise[Remote] = js.native
    
    @JSImport("nodegit/remote", "Remote.createAnonymous")
    @js.native
    def createAnonymous(repo: Repository, url: String): js.Promise[Remote] = js.native
    
    @JSImport("nodegit/remote", "Remote.createDetached")
    @js.native
    def createDetached(url: String): js.Promise[Remote] = js.native
    
    @JSImport("nodegit/remote", "Remote.createWithFetchspec")
    @js.native
    def createWithFetchspec(repo: Repository, name: String, url: String, fetch: String): js.Promise[Remote] = js.native
    
    @JSImport("nodegit/remote", "Remote.delete")
    @js.native
    def delete(repo: Repository, name: String): js.Promise[Double] = js.native
    
    @JSImport("nodegit/remote", "Remote.initCallbacks")
    @js.native
    def initCallbacks(opts: RemoteCallbacks, version: Double): Double = js.native
    
    @JSImport("nodegit/remote", "Remote.isValidName")
    @js.native
    def isValidName(remoteName: String): Boolean = js.native
    
    @JSImport("nodegit/remote", "Remote.list")
    @js.native
    def list(repo: Repository): js.Promise[js.Array[_]] = js.native
    
    @JSImport("nodegit/remote", "Remote.lookup")
    @js.native
    def lookup(repo: Repository, name: String): js.Promise[Remote] = js.native
    @JSImport("nodegit/remote", "Remote.lookup")
    @js.native
    def lookup(repo: Repository, name: String, callback: js.Function): js.Promise[Remote] = js.native
    @JSImport("nodegit/remote", "Remote.lookup")
    @js.native
    def lookup(repo: Repository, name: Remote): js.Promise[Remote] = js.native
    @JSImport("nodegit/remote", "Remote.lookup")
    @js.native
    def lookup(repo: Repository, name: Remote, callback: js.Function): js.Promise[Remote] = js.native
    
    @JSImport("nodegit/remote", "Remote.setAutotag")
    @js.native
    def setAutotag(repo: Repository, remote: String, value: Double): Double = js.native
    
    @JSImport("nodegit/remote", "Remote.setPushurl")
    @js.native
    def setPushurl(repo: Repository, remote: String, url: String): Double = js.native
    
    @JSImport("nodegit/remote", "Remote.setUrl")
    @js.native
    def setUrl(repo: Repository, remote: String, url: String): Double = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
      - typingsSlinky.nodegit.nodegitNumbers.`3`
    */
    trait AUTOTAG_OPTION extends StObject
    object AUTOTAG_OPTION {
      
      @scala.inline
      def DOWNLOAD_TAGS_ALL: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def DOWNLOAD_TAGS_AUTO: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def DOWNLOAD_TAGS_NONE: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def DOWNLOAD_TAGS_UNSPECIFIED: `0` = 0.asInstanceOf[`0`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
    */
    trait COMPLETION_TYPE extends StObject
    object COMPLETION_TYPE {
      
      @scala.inline
      def COMPLETION_DOWNLOAD: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def COMPLETION_ERROR: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def COMPLETION_INDEXING: `1` = 1.asInstanceOf[`1`]
    }
  }
}
