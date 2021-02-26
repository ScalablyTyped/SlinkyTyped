package typingsSlinky.jsGit

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSGit {
  
  @js.native
  trait DB extends StObject {
    
    /**
      * This is for when the user wants to delete or otherwise reclaim your database's resources.
      */
    def clear(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /**
      * Remove an object or ref from the database.
      */
    def del(key: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /**
      * Load a ref or object from the database.
      * The database should assume that keys that are 40-character long hex strings are sha1 hashes. The value for these will always be binary (Buffer in node, Uint8Array in browser) All other keys are paths like refs/heads/master or HEAD and the value is a string.
      */
    def get(key: String, callback: js.Function2[/* err */ js.Any, /* value */ js.Any, Unit]): Unit = js.native
    
    /**
      * Check if a key is in the database
      */
    def has(key: String, callback: js.Function2[/* err */ js.Any, /* hasKey */ Boolean, Unit]): Unit = js.native
    
    /**
      * Initialize a database. This is where you db implementation can setup stuff.
      */
    def init(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /**
      * Given a path prefix, give all the keys. This is like a readdir if you treat the keys as paths.
      * For example, given the keys refs/heads/master, refs/heads/experimental, refs/tags/0.1.3 and the prefix refs/heads/, the output would be master and experimental.
      * A null prefix returns all non hash keys.
      */
    def keys(prefix: String, callback: js.Function2[/* err */ js.Any, /* keys */ js.Array[String], Unit]): Unit = js.native
    
    /**
      * Save a value to the database. Same rules apply about hash keys being binary values and other keys being string values.
      */
    def set(key: String, value: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  }
  object DB {
    
    @scala.inline
    def apply(
      clear: js.Function1[/* err */ js.Any, Unit] => Unit,
      del: (String, js.Function1[/* err */ js.Any, Unit]) => Unit,
      get: (String, js.Function2[/* err */ js.Any, /* value */ js.Any, Unit]) => Unit,
      has: (String, js.Function2[/* err */ js.Any, /* hasKey */ Boolean, Unit]) => Unit,
      init: js.Function1[/* err */ js.Any, Unit] => Unit,
      keys: (String, js.Function2[/* err */ js.Any, /* keys */ js.Array[String], Unit]) => Unit,
      set: (String, js.Any, js.Function1[/* err */ js.Any, Unit]) => Unit
    ): DB = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), del = js.Any.fromFunction2(del), get = js.Any.fromFunction2(get), has = js.Any.fromFunction2(has), init = js.Any.fromFunction1(init), keys = js.Any.fromFunction2(keys), set = js.Any.fromFunction3(set))
      __obj.asInstanceOf[DB]
    }
    
    @scala.inline
    implicit class DBMutableBuilder[Self <: DB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: js.Function1[/* err */ js.Any, Unit] => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDel(value: (String, js.Function1[/* err */ js.Any, Unit]) => Unit): Self = StObject.set(x, "del", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGet(value: (String, js.Function2[/* err */ js.Any, /* value */ js.Any, Unit]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHas(value: (String, js.Function2[/* err */ js.Any, /* hasKey */ Boolean, Unit]) => Unit): Self = StObject.set(x, "has", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInit(value: js.Function1[/* err */ js.Any, Unit] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeys(value: (String, js.Function2[/* err */ js.Any, /* keys */ js.Array[String], Unit]) => Unit): Self = StObject.set(x, "keys", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSet(value: (String, js.Any, js.Function1[/* err */ js.Any, Unit]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait GitAuthor extends StObject {
    
    var date: js.Date = js.native
    
    var email: String = js.native
    
    var name: String = js.native
  }
  object GitAuthor {
    
    @scala.inline
    def apply(date: js.Date, email: String, name: String): GitAuthor = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitAuthor]
    }
    
    @scala.inline
    implicit class GitAuthorMutableBuilder[Self <: GitAuthor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GitCommit extends StObject {
    
    var author: GitAuthor = js.native
    
    var message: String = js.native
    
    var tree: String = js.native
  }
  object GitCommit {
    
    @scala.inline
    def apply(author: GitAuthor, message: String, tree: String): GitCommit = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitCommit]
    }
    
    @scala.inline
    implicit class GitCommitMutableBuilder[Self <: GitCommit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: GitAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTree(value: String): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GitObject extends StObject {
    
    var body: js.Any = js.native
    
    var `type`: String = js.native
  }
  object GitObject {
    
    @scala.inline
    def apply(body: js.Any, `type`: String): GitObject = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitObject]
    }
    
    @scala.inline
    implicit class GitObjectMutableBuilder[Self <: GitObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GitTree = NumberDictionary[GitTreeElem]
  
  @js.native
  trait GitTreeElem extends StObject {
    
    var hash: String = js.native
    
    var mode: Double = js.native
    
    var name: String = js.native
  }
  object GitTreeElem {
    
    @scala.inline
    def apply(hash: String, mode: Double, name: String): GitTreeElem = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitTreeElem]
    }
    
    @scala.inline
    implicit class GitTreeElemMutableBuilder[Self <: GitTreeElem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Remote extends StObject {
    
    def close(): Unit = js.native
    def close(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    def discover(callback: js.Function2[/* err */ js.Any, /* refs */ StringMap, Unit]): Unit = js.native
    
    def fetch(repo: Repo, opts: js.Object, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    var hostname: String = js.native
    
    var pathname: String = js.native
  }
  
  @js.native
  trait Repo extends StObject {
    
    /**
      * Convenience wrapper that fetches from a remote instance and calls repo.unpack with the resulting packfile stream for you.
      */
    def fetch(remote: Remote, opts: js.Object, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /**
      * Read the current active branch.
      */
    def getHead(callback: js.Function2[/* err */ js.Any, /* ref_name */ String, Unit]): Unit = js.native
    
    /**
      * Load a git object from the database. You can pass in either a hash or a symbolic name like HEAD or refs/tags/v3.1.4.
      *
      * The object will be of the form:
      * {
      *   type: "commit", // Or "tag", "tree", or "blob"
      *   body: { ... } // Or an array for tree and a binary value for blob.
      * }
      */
    def load(hashish: String, callback: js.Function2[/* err */ js.Any, /* git_object */ GitObject, Unit]): Unit = js.native
    
    /**
      * This convenience wrapper will call repo.load for you and then check if the type is what you expected. If it is, it will return the body directly. If it's not, it will error.
      *
      * var commit = yield repo.loadAs("commit", "HEAD");
      * var tree = yield repo.loadAs("tree", commit.tree);
      *
      * I'm using yield syntax because it's simpler, you can use callbacks instead if you prefer.
      */
    def loadAs(`type`: String, hash: String, callback: js.Function2[/* err */ js.Any, /* body */ js.Any, Unit]): Unit = js.native
    
    /**
      * This convenience wrapper creates a readable stream of the history sorted by author date.
      * If you want full history, pass in HEAD for the hash.
      */
    def logWalk(hashish: String, callback: js.Function2[/* err */ js.Any, /* log_stream */ js.Any, Unit]): Unit = js.native
    
    /**
      * Remove an object.
      */
    def remove(hash: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /**
      * Resolve a ref, branch, or tag to a real hash.
      */
    def resolveHashish(hashish: String, callback: js.Function2[/* err */ js.Any, /* hash */ String, Unit]): Unit = js.native
    
    /**
      * Save an object to the database. This will give you back the hash of the cotent by which you can retrieve the value back.
      */
    def save(git_object: GitObject, callback: js.Function2[/* err */ js.Any, /* hash */ String, Unit]): Unit = js.native
    
    /**
      * Another convenience wrapper, this time to save objects as a specefic type. The body must be in the right format.
      *
      * var blobHash = yield repo.saveAs("blob", binaryData);
      * var treeHash = yield repo.saveAs("tree", [
      *   { mode: 0100644, name: "file.dat", hash: blobHash }
      * ]);
      * var commitHash = yield repo.saveAs("commit", {
      *   tree: treeHash,
      *   author: { name: "Tim Caswell", email: "tim@creationix.com", date: new Date },
      *   message: "Save the blob"
      * });
      */
    def saveAs(`type`: String, body: js.Any, callback: js.Function2[/* err */ js.Any, /* hash */ String, Unit]): Unit = js.native
    
    /**
      * Set the current active branch.
      */
    def setHead(ref: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /**
      * This helper will return a stream of files suitable for traversing a file tree as a linear stream. The hash can be a ref to a commit, a commit hash or a tree hash directly.
      */
    def treeWalk(hashish: String, callback: js.Function2[/* err */ js.Any, /* file_stream */ js.Any, Unit]): Unit = js.native
    
    /**
      * Import a packfile stream (simple-stream format) into the current database. This is used mostly for clone and fetch operations where the stream comes from a remote repo.
      *
      * opts is a hash of optional configs.
      *
      * opts.onProgress(progress) - listen to the git progress channel by passing in a event listener.
      * opts.onError(error) - same thing, but for the error channel.
      * opts.deline - If this is truthy, the progress and error messages will be rechunked to be whole lines. They usually come jumbled in the internal sidechannel.
      */
    def unpack(packFileStream: js.Any, opts: js.Object, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /**
      * Update whatever branch HEAD is pointing to so that it points to hash.
      * You'll usually want to do this after creating a new commint in the HEAD branch.
      */
    def updateHead(hash: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /**
      * This is the generic helper that logWalk and treeWalk use. See js-git.js source for usage.
      */
    def walk(seed: js.Any, scan: js.Any, loadKey: js.Any, compare: js.Any): js.Any = js.native
  }
  object Repo {
    
    @scala.inline
    def apply(
      fetch: (Remote, js.Object, js.Function1[/* err */ js.Any, Unit]) => Unit,
      getHead: js.Function2[/* err */ js.Any, /* ref_name */ String, Unit] => Unit,
      load: (String, js.Function2[/* err */ js.Any, /* git_object */ GitObject, Unit]) => Unit,
      loadAs: (String, String, js.Function2[/* err */ js.Any, /* body */ js.Any, Unit]) => Unit,
      logWalk: (String, js.Function2[/* err */ js.Any, /* log_stream */ js.Any, Unit]) => Unit,
      remove: (String, js.Function1[/* err */ js.Any, Unit]) => Unit,
      resolveHashish: (String, js.Function2[/* err */ js.Any, /* hash */ String, Unit]) => Unit,
      save: (GitObject, js.Function2[/* err */ js.Any, /* hash */ String, Unit]) => Unit,
      saveAs: (String, js.Any, js.Function2[/* err */ js.Any, /* hash */ String, Unit]) => Unit,
      setHead: (String, js.Function1[/* err */ js.Any, Unit]) => Unit,
      treeWalk: (String, js.Function2[/* err */ js.Any, /* file_stream */ js.Any, Unit]) => Unit,
      unpack: (js.Any, js.Object, js.Function1[/* err */ js.Any, Unit]) => Unit,
      updateHead: (String, js.Function1[/* err */ js.Any, Unit]) => Unit,
      walk: (js.Any, js.Any, js.Any, js.Any) => js.Any
    ): Repo = {
      val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction3(fetch), getHead = js.Any.fromFunction1(getHead), load = js.Any.fromFunction2(load), loadAs = js.Any.fromFunction3(loadAs), logWalk = js.Any.fromFunction2(logWalk), remove = js.Any.fromFunction2(remove), resolveHashish = js.Any.fromFunction2(resolveHashish), save = js.Any.fromFunction2(save), saveAs = js.Any.fromFunction3(saveAs), setHead = js.Any.fromFunction2(setHead), treeWalk = js.Any.fromFunction2(treeWalk), unpack = js.Any.fromFunction3(unpack), updateHead = js.Any.fromFunction2(updateHead), walk = js.Any.fromFunction4(walk))
      __obj.asInstanceOf[Repo]
    }
    
    @scala.inline
    implicit class RepoMutableBuilder[Self <: Repo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetch(value: (Remote, js.Object, js.Function1[/* err */ js.Any, Unit]) => Unit): Self = StObject.set(x, "fetch", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetHead(value: js.Function2[/* err */ js.Any, /* ref_name */ String, Unit] => Unit): Self = StObject.set(x, "getHead", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoad(value: (String, js.Function2[/* err */ js.Any, /* git_object */ GitObject, Unit]) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadAs(value: (String, String, js.Function2[/* err */ js.Any, /* body */ js.Any, Unit]) => Unit): Self = StObject.set(x, "loadAs", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLogWalk(value: (String, js.Function2[/* err */ js.Any, /* log_stream */ js.Any, Unit]) => Unit): Self = StObject.set(x, "logWalk", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemove(value: (String, js.Function1[/* err */ js.Any, Unit]) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolveHashish(value: (String, js.Function2[/* err */ js.Any, /* hash */ String, Unit]) => Unit): Self = StObject.set(x, "resolveHashish", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSave(value: (GitObject, js.Function2[/* err */ js.Any, /* hash */ String, Unit]) => Unit): Self = StObject.set(x, "save", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSaveAs(value: (String, js.Any, js.Function2[/* err */ js.Any, /* hash */ String, Unit]) => Unit): Self = StObject.set(x, "saveAs", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetHead(value: (String, js.Function1[/* err */ js.Any, Unit]) => Unit): Self = StObject.set(x, "setHead", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTreeWalk(value: (String, js.Function2[/* err */ js.Any, /* file_stream */ js.Any, Unit]) => Unit): Self = StObject.set(x, "treeWalk", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnpack(value: (js.Any, js.Object, js.Function1[/* err */ js.Any, Unit]) => Unit): Self = StObject.set(x, "unpack", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdateHead(value: (String, js.Function1[/* err */ js.Any, Unit]) => Unit): Self = StObject.set(x, "updateHead", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWalk(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "walk", js.Any.fromFunction4(value))
    }
  }
  
  type StringMap = StringDictionary[String]
}
