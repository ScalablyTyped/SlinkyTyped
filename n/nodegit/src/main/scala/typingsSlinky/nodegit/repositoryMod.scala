package typingsSlinky.nodegit

import typingsSlinky.node.Buffer
import typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit
import typingsSlinky.nodegit.blobMod.Blob
import typingsSlinky.nodegit.bufMod.Buf
import typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
import typingsSlinky.nodegit.commitMod.Commit
import typingsSlinky.nodegit.configMod.Config
import typingsSlinky.nodegit.diffLineMod.DiffLine
import typingsSlinky.nodegit.fetchOptionsMod.FetchOptions
import typingsSlinky.nodegit.indexMod.Index
import typingsSlinky.nodegit.mergeMod.Merge.PREFERENCE
import typingsSlinky.nodegit.mergeOptionsMod.MergeOptions
import typingsSlinky.nodegit.odbMod.Odb
import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.refDbMod.Refdb
import typingsSlinky.nodegit.referenceMod.Reference
import typingsSlinky.nodegit.referenceMod.Reference.TYPE
import typingsSlinky.nodegit.remoteMod.Remote
import typingsSlinky.nodegit.revWalkMod.Revwalk
import typingsSlinky.nodegit.signatureMod.Signature
import typingsSlinky.nodegit.statusFileMod.StatusFile
import typingsSlinky.nodegit.statusOptionsMod.StatusOptions
import typingsSlinky.nodegit.tagMod.Tag
import typingsSlinky.nodegit.treeBuilderMod.Treebuilder
import typingsSlinky.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryMod {
  
  @JSImport("nodegit/repository", "Repository")
  @js.native
  class Repository () extends StObject {
    
    /**
      * This will set the HEAD to point to the local branch and then attempt to update the index and working tree to match the content of the latest commit on that branch
      */
    def checkoutBranch(branch: String): js.Promise[Reference] = js.native
    def checkoutBranch(branch: String, opts: CheckoutOptions): js.Promise[Reference] = js.native
    def checkoutBranch(branch: Reference): js.Promise[Reference] = js.native
    def checkoutBranch(branch: Reference, opts: CheckoutOptions): js.Promise[Reference] = js.native
    
    /**
      * This will set the HEAD to point to the reference and then attempt to update the index and working tree to match the content of the latest commit on that reference
      */
    def checkoutRef(reference: Reference): js.Promise[Reference] = js.native
    def checkoutRef(reference: Reference, opts: CheckoutOptions): js.Promise[Reference] = js.native
    
    def cleanup(): Unit = js.native
    
    def commondir(): String = js.native
    
    def config(): js.Promise[Config] = js.native
    
    def configSnapshot(): js.Promise[Config] = js.native
    
    def continueRebase(signature: Signature, beforeNextFn: js.Function): js.Promise[Oid] = js.native
    
    /**
      * Create a blob from a buffer
      */
    def createBlobFromBuffer(buffer: Buffer): js.Promise[Oid] = js.native
    
    def createBranch(name: String, commit: String): js.Promise[Reference] = js.native
    def createBranch(name: String, commit: String, force: Boolean): js.Promise[Reference] = js.native
    /**
      * Creates a branch with the passed in name pointing to the commit
      */
    def createBranch(name: String, commit: Commit): js.Promise[Reference] = js.native
    def createBranch(name: String, commit: Commit, force: Boolean): js.Promise[Reference] = js.native
    def createBranch(name: String, commit: Oid): js.Promise[Reference] = js.native
    def createBranch(name: String, commit: Oid, force: Boolean): js.Promise[Reference] = js.native
    
    def createCommit(
      updateRef: String,
      author: Signature,
      committer: Signature,
      message: String,
      Tree: String,
      parents: js.Array[String | Commit | Oid]
    ): js.Promise[Oid] = js.native
    def createCommit(
      updateRef: String,
      author: Signature,
      committer: Signature,
      message: String,
      Tree: String,
      parents: js.Array[String | Commit | Oid],
      callback: js.Function
    ): js.Promise[Oid] = js.native
    def createCommit(
      updateRef: String,
      author: Signature,
      committer: Signature,
      message: String,
      Tree: Oid,
      parents: js.Array[String | Commit | Oid]
    ): js.Promise[Oid] = js.native
    def createCommit(
      updateRef: String,
      author: Signature,
      committer: Signature,
      message: String,
      Tree: Oid,
      parents: js.Array[String | Commit | Oid],
      callback: js.Function
    ): js.Promise[Oid] = js.native
    def createCommit(
      updateRef: String,
      author: Signature,
      committer: Signature,
      message: String,
      Tree: Tree,
      parents: js.Array[String | Commit | Oid]
    ): js.Promise[Oid] = js.native
    def createCommit(
      updateRef: String,
      author: Signature,
      committer: Signature,
      message: String,
      Tree: Tree,
      parents: js.Array[String | Commit | Oid],
      callback: js.Function
    ): js.Promise[Oid] = js.native
    
    /**
      * Creates a new commit on HEAD from the list of passed in files
      */
    def createCommitOnHead(filesToAdd: js.Array[String], author: Signature, committer: Signature, message: String): js.Promise[Oid] = js.native
    
    /**
      * Creates a new lightweight tag
      */
    def createLightweightTag(string: String, name: String): js.Promise[Reference] = js.native
    def createLightweightTag(string: Oid, name: String): js.Promise[Reference] = js.native
    
    /**
      * Instantiate a new revision walker for browsing the Repository"s history. See also Commit.prototype.history()
      */
    def createRevWalk(): Revwalk = js.native
    
    def createTag(string: String, name: String, message: String): js.Promise[Tag] = js.native
    def createTag(string: Oid, name: String, message: String): js.Promise[Tag] = js.native
    
    /**
      * Gets the default signature for the default user and now timestamp
      */
    def defaultSignature(): Signature = js.native
    
    /**
      * Deletes a tag from a repository by the tag name.
      */
    def deleteTagByName(Short: String): js.Promise[Double] = js.native
    
    def detachHead(): Double = js.native
    
    /**
      * Discard line selection of a specified file. Assumes selected lines are unstaged.
      */
    def discardLines(filePath: String, selectedLines: js.Array[DiffLine]): js.Promise[Double] = js.native
    
    /**
      * Fetches from a remote
      */
    def fetch(remote: String): js.Promise[Unit] = js.native
    def fetch(remote: String, fetchOptions: FetchOptions): js.Promise[Unit] = js.native
    def fetch(remote: Remote): js.Promise[Unit] = js.native
    def fetch(remote: Remote, fetchOptions: FetchOptions): js.Promise[Unit] = js.native
    
    /**
      * Fetches from all remotes. This is done in series due to deadlocking issues with fetching from many remotes that can happen.
      */
    def fetchAll(): js.Promise[Unit] = js.native
    def fetchAll(fetchOptions: js.UndefOr[scala.Nothing], callback: js.Function): js.Promise[Unit] = js.native
    def fetchAll(fetchOptions: FetchOptions): js.Promise[Unit] = js.native
    def fetchAll(fetchOptions: FetchOptions, callback: js.Function): js.Promise[Unit] = js.native
    
    def fetchheadForeach(): js.Promise[_] = js.native
    def fetchheadForeach(callback: js.Function): js.Promise[_] = js.native
    
    def free(): Unit = js.native
    
    /**
      * Retrieve the blob represented by the oid.
      */
    def getBlob(string: String): js.Promise[Blob] = js.native
    def getBlob(string: Oid): js.Promise[Blob] = js.native
    
    /**
      * Look up a branch. Alias for getReference
      */
    def getBranch(name: String): js.Promise[Reference] = js.native
    def getBranch(name: Reference): js.Promise[Reference] = js.native
    
    /**
      * Look up a branch's most recent commit. Alias to getReferenceCommit
      */
    def getBranchCommit(name: String): js.Promise[Commit] = js.native
    def getBranchCommit(name: Reference): js.Promise[Commit] = js.native
    
    def getCommit(string: String): js.Promise[Commit] = js.native
    def getCommit(string: Commit): js.Promise[Commit] = js.native
    def getCommit(string: Oid): js.Promise[Commit] = js.native
    
    /**
      * Gets the branch that HEAD currently points to Is an alias to head()
      */
    def getCurrentBranch(): js.Promise[Reference] = js.native
    
    /**
      * Retrieve the commit that HEAD is currently pointing to
      */
    def getHeadCommit(): js.Promise[Commit] = js.native
    
    /**
      * Retrieve the master branch commit.
      */
    def getMasterCommit(): js.Promise[Commit] = js.native
    
    def getNamespace(): String = js.native
    
    /**
      * Lookup the reference with the given name.
      */
    def getReference(name: String): js.Promise[Reference] = js.native
    def getReference(name: Reference): js.Promise[Reference] = js.native
    
    /**
      * Look up a refs's commit.
      */
    def getReferenceCommit(name: String): js.Promise[Commit] = js.native
    def getReferenceCommit(name: Reference): js.Promise[Commit] = js.native
    
    /**
      * Lookup reference names for a repository.
      */
    def getReferenceNames(`type`: TYPE): js.Promise[js.Array[String]] = js.native
    
    /**
      * Lookup references for a repository.
      */
    def getReferences(): js.Promise[js.Array[Reference]] = js.native
    
    /**
      * Gets a remote from the repo
      */
    def getRemote(remote: String): js.Promise[Remote] = js.native
    def getRemote(remote: String, callback: js.Function): js.Promise[Remote] = js.native
    def getRemote(remote: Remote): js.Promise[Remote] = js.native
    def getRemote(remote: Remote, callback: js.Function): js.Promise[Remote] = js.native
    
    /**
      * Lists out the remotes in the given repository.
      */
    def getRemotes(): js.Promise[js.Array[Remote]] = js.native
    def getRemotes(callback: js.Function): js.Promise[js.Array[Remote]] = js.native
    
    /**
      * Get the status of a repo to it's working directory
      */
    def getStatus(): js.Promise[js.Array[StatusFile]] = js.native
    def getStatus(opts: StatusOptions): js.Promise[js.Array[StatusFile]] = js.native
    
    /**
      * Get extended statuses of a repo to it's working directory. Status entries have status, headToIndex delta, and indexToWorkdir deltas
      */
    def getStatusExt(): js.Promise[js.Array[StatusFile]] = js.native
    def getStatusExt(opts: StatusOptions): js.Promise[js.Array[StatusFile]] = js.native
    
    /**
      * Get the names of the submodules in the repository.
      */
    def getSubmoduleNames(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Retrieve the tag represented by the oid.
      */
    def getTag(string: String): js.Promise[Tag] = js.native
    def getTag(string: Oid): js.Promise[Tag] = js.native
    
    /**
      * Retrieve the tag represented by the tag name.
      */
    def getTagByName(Short: String): js.Promise[Tag] = js.native
    
    /**
      * Retrieve the tree represented by the oid.
      */
    def getTree(string: String): js.Promise[Tree] = js.native
    def getTree(string: Oid): js.Promise[Tree] = js.native
    
    def head(): js.Promise[Reference] = js.native
    
    def headDetached(): Double = js.native
    
    def headUnborn(): Double = js.native
    
    def index(): js.Promise[Index] = js.native
    
    /**
      * Returns true if the repository is in the APPLY_MAILBOX or APPLY_MAILBOX_OR_REBASE state.
      */
    def isApplyingMailbox(): Boolean = js.native
    
    def isBare(): Double = js.native
    
    /**
      * Returns true if the repository is in the BISECT state.
      */
    def isBisecting(): Boolean = js.native
    
    /**
      * Returns true if the repository is in the CHERRYPICK state.
      */
    def isCherrypicking(): Boolean = js.native
    
    /**
      * Returns true if the repository is in the default NONE state.
      */
    def isDefaultState(): Boolean = js.native
    
    def isEmpty(): Double = js.native
    
    /**
      * Returns true if the repository is in the MERGE state.
      */
    def isMerging(): Boolean = js.native
    
    /**
      * Returns true if the repository is in the REBASE, REBASE_INTERACTIVE, or REBASE_MERGE state.
      */
    def isRebasing(): Boolean = js.native
    
    /**
      * Returns true if the repository is in the REVERT state.
      */
    def isReverting(): Boolean = js.native
    
    def isShallow(): Double = js.native
    
    def mergeBranches(to: String, from: String): js.Promise[Oid] = js.native
    def mergeBranches(
      to: String,
      from: String,
      signature: js.UndefOr[scala.Nothing],
      mergePreference: js.UndefOr[scala.Nothing],
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: String, from: String, signature: js.UndefOr[scala.Nothing], mergePreference: PREFERENCE): js.Promise[Oid] = js.native
    def mergeBranches(
      to: String,
      from: String,
      signature: js.UndefOr[scala.Nothing],
      mergePreference: PREFERENCE,
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: String, from: String, signature: Signature): js.Promise[Oid] = js.native
    def mergeBranches(
      to: String,
      from: String,
      signature: Signature,
      mergePreference: js.UndefOr[scala.Nothing],
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: String, from: String, signature: Signature, mergePreference: PREFERENCE): js.Promise[Oid] = js.native
    def mergeBranches(
      to: String,
      from: String,
      signature: Signature,
      mergePreference: PREFERENCE,
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: String, from: Reference): js.Promise[Oid] = js.native
    def mergeBranches(
      to: String,
      from: Reference,
      signature: js.UndefOr[scala.Nothing],
      mergePreference: js.UndefOr[scala.Nothing],
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: String, from: Reference, signature: js.UndefOr[scala.Nothing], mergePreference: PREFERENCE): js.Promise[Oid] = js.native
    def mergeBranches(
      to: String,
      from: Reference,
      signature: js.UndefOr[scala.Nothing],
      mergePreference: PREFERENCE,
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: String, from: Reference, signature: Signature): js.Promise[Oid] = js.native
    def mergeBranches(
      to: String,
      from: Reference,
      signature: Signature,
      mergePreference: js.UndefOr[scala.Nothing],
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: String, from: Reference, signature: Signature, mergePreference: PREFERENCE): js.Promise[Oid] = js.native
    def mergeBranches(
      to: String,
      from: Reference,
      signature: Signature,
      mergePreference: PREFERENCE,
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: Reference, from: String): js.Promise[Oid] = js.native
    def mergeBranches(
      to: Reference,
      from: String,
      signature: js.UndefOr[scala.Nothing],
      mergePreference: js.UndefOr[scala.Nothing],
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: Reference, from: String, signature: js.UndefOr[scala.Nothing], mergePreference: PREFERENCE): js.Promise[Oid] = js.native
    def mergeBranches(
      to: Reference,
      from: String,
      signature: js.UndefOr[scala.Nothing],
      mergePreference: PREFERENCE,
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: Reference, from: String, signature: Signature): js.Promise[Oid] = js.native
    def mergeBranches(
      to: Reference,
      from: String,
      signature: Signature,
      mergePreference: js.UndefOr[scala.Nothing],
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: Reference, from: String, signature: Signature, mergePreference: PREFERENCE): js.Promise[Oid] = js.native
    def mergeBranches(
      to: Reference,
      from: String,
      signature: Signature,
      mergePreference: PREFERENCE,
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: Reference, from: Reference): js.Promise[Oid] = js.native
    def mergeBranches(
      to: Reference,
      from: Reference,
      signature: js.UndefOr[scala.Nothing],
      mergePreference: js.UndefOr[scala.Nothing],
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: Reference, from: Reference, signature: js.UndefOr[scala.Nothing], mergePreference: PREFERENCE): js.Promise[Oid] = js.native
    def mergeBranches(
      to: Reference,
      from: Reference,
      signature: js.UndefOr[scala.Nothing],
      mergePreference: PREFERENCE,
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: Reference, from: Reference, signature: Signature): js.Promise[Oid] = js.native
    def mergeBranches(
      to: Reference,
      from: Reference,
      signature: Signature,
      mergePreference: js.UndefOr[scala.Nothing],
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    def mergeBranches(to: Reference, from: Reference, signature: Signature, mergePreference: PREFERENCE): js.Promise[Oid] = js.native
    def mergeBranches(
      to: Reference,
      from: Reference,
      signature: Signature,
      mergePreference: PREFERENCE,
      mergeOptions: MergeOptions
    ): js.Promise[Oid] = js.native
    
    def mergeheadForeach(): js.Promise[_] = js.native
    def mergeheadForeach(callback: js.Function): js.Promise[_] = js.native
    
    def messageRemove(): Double = js.native
    
    def odb(): js.Promise[Odb] = js.native
    
    def path(): String = js.native
    
    /**
      * Rebases a branch onto another branch
      */
    def rebaseBranches(branch: String, upstream: String, onto: String, signature: Signature, beforeNextFn: js.Function): js.Promise[Oid] = js.native
    
    def refdb(): js.Promise[Refdb] = js.native
    
    /**
      * Grabs a fresh copy of the index from the repository. Invalidates all previously grabbed indexes
      */
    def refreshIndex(): js.Promise[Index] = js.native
    
    def setHead(refname: String): js.Promise[Double] = js.native
    
    def setHeadDetached(commitish: Oid): Double = js.native
    
    def setHeadDetachedFromAnnotated(commitish: AnnotatedCommit): Double = js.native
    
    def setIdent(name: String, email: String): Double = js.native
    
    def setNamespace(nmspace: String): Double = js.native
    
    def setWorkdir(workdir: String, updateGitLink: Double): Double = js.native
    
    /**
      * Stages or unstages line selection of a specified file
      */
    def stageFilemode(filePath: String, stageNew: Boolean): js.Promise[Double] = js.native
    def stageFilemode(filePath: js.Array[String], stageNew: Boolean): js.Promise[Double] = js.native
    
    /**
      * Stages or unstages line selection of a specified file
      */
    def stageLines(filePath: String, newLines: js.Array[DiffLine], isStaged: Boolean): js.Promise[Double] = js.native
    
    def state(): Double = js.native
    
    def stateCleanup(): Double = js.native
    
    def treeBuilder(tree: Tree): js.Promise[Treebuilder] = js.native
    
    def workdir(): String = js.native
  }
  /* static members */
  object Repository {
    
    /**
      * Creates a branch with the passed in name pointing to the commit
      */
    @JSImport("nodegit/repository", "Repository.discover")
    @js.native
    def discover(startPath: String, acrossFs: Double, ceilingDirs: String): js.Promise[Buf] = js.native
    
    @JSImport("nodegit/repository", "Repository.init")
    @js.native
    def init(path: String, isBare: Double): js.Promise[Repository] = js.native
    
    @JSImport("nodegit/repository", "Repository.initExt")
    @js.native
    def initExt(repoPath: String): js.Promise[Repository] = js.native
    @JSImport("nodegit/repository", "Repository.initExt")
    @js.native
    def initExt(repoPath: String, options: RepositoryInitOptions): js.Promise[Repository] = js.native
    
    @JSImport("nodegit/repository", "Repository.open")
    @js.native
    def open(path: String): js.Promise[Repository] = js.native
    
    @JSImport("nodegit/repository", "Repository.openBare")
    @js.native
    def openBare(barePath: String): js.Promise[Repository] = js.native
    
    @JSImport("nodegit/repository", "Repository.openExt")
    @js.native
    def openExt(path: String): js.Promise[Repository] = js.native
    @JSImport("nodegit/repository", "Repository.openExt")
    @js.native
    def openExt(path: String, flags: js.UndefOr[scala.Nothing], ceilingDirs: String): js.Promise[Repository] = js.native
    @JSImport("nodegit/repository", "Repository.openExt")
    @js.native
    def openExt(path: String, flags: Double): js.Promise[Repository] = js.native
    @JSImport("nodegit/repository", "Repository.openExt")
    @js.native
    def openExt(path: String, flags: Double, ceilingDirs: String): js.Promise[Repository] = js.native
    
    @JSImport("nodegit/repository", "Repository.wrapOdb")
    @js.native
    def wrapOdb(odb: Odb): js.Promise[Repository] = js.native
  }
  
  @js.native
  trait RepositoryInitOptions extends StObject {
    
    var description: String = js.native
    
    var flags: Double = js.native
    
    var initialHead: String = js.native
    
    var mode: Double = js.native
    
    var originUrl: String = js.native
    
    var templatePath: String = js.native
    
    var version: Double = js.native
    
    var workdirPath: String = js.native
  }
  object RepositoryInitOptions {
    
    @scala.inline
    def apply(
      description: String,
      flags: Double,
      initialHead: String,
      mode: Double,
      originUrl: String,
      templatePath: String,
      version: Double,
      workdirPath: String
    ): RepositoryInitOptions = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], initialHead = initialHead.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], originUrl = originUrl.asInstanceOf[js.Any], templatePath = templatePath.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], workdirPath = workdirPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryInitOptions]
    }
    
    @scala.inline
    implicit class RepositoryInitOptionsMutableBuilder[Self <: RepositoryInitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialHead(value: String): Self = StObject.set(x, "initialHead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUrl(value: String): Self = StObject.set(x, "originUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplatePath(value: String): Self = StObject.set(x, "templatePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkdirPath(value: String): Self = StObject.set(x, "workdirPath", value.asInstanceOf[js.Any])
    }
  }
}
