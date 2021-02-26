package typingsSlinky.nodegit

import typingsSlinky.nodegit.blobMod.Blob
import typingsSlinky.nodegit.nodegitNumbers.`0`
import typingsSlinky.nodegit.nodegitNumbers.`16384`
import typingsSlinky.nodegit.nodegitNumbers.`33188`
import typingsSlinky.nodegit.nodegitNumbers.`33261`
import typingsSlinky.nodegit.nodegitNumbers.`40960`
import typingsSlinky.nodegit.nodegitNumbers.`57344`
import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.treeEntryMod.TreeEntry.FILEMODE
import typingsSlinky.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeEntryMod {
  
  @JSImport("nodegit/tree-entry", "TreeEntry")
  @js.native
  class TreeEntry () extends StObject {
    
    def filemode(): FILEMODE = js.native
    
    def filemodeRaw(): FILEMODE = js.native
    
    def free(): Unit = js.native
    
    def getBlob(): js.Promise[Blob] = js.native
    
    def getTree(): js.Promise[Tree] = js.native
    
    def id(): Oid = js.native
    
    def isBlob(): Boolean = js.native
    
    def isDirectory(): Boolean = js.native
    
    def isFile(): Boolean = js.native
    
    def isSubmodule(): Boolean = js.native
    
    def isTree(): Boolean = js.native
    
    def name(): String = js.native
    
    /**
      * Retrieve the SHA for this TreeEntry. Alias for sha
      */
    def oid(): String = js.native
    
    /**
      * Returns the path for this entry.
      */
    def path(): String = js.native
    
    /**
      * Retrieve the SHA for this TreeEntry.
      */
    def sha(): String = js.native
    
    def toObject(repo: Repository): js.Object = js.native
    
    def `type`(): Double = js.native
  }
  object TreeEntry {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`16384`
      - typingsSlinky.nodegit.nodegitNumbers.`33188`
      - typingsSlinky.nodegit.nodegitNumbers.`33261`
      - typingsSlinky.nodegit.nodegitNumbers.`40960`
      - typingsSlinky.nodegit.nodegitNumbers.`57344`
    */
    trait FILEMODE extends StObject
    object FILEMODE {
      
      @scala.inline
      def BLOB: `33188` = 33188.asInstanceOf[`33188`]
      
      @scala.inline
      def COMMIT: `57344` = 57344.asInstanceOf[`57344`]
      
      @scala.inline
      def EXECUTABLE: `33261` = 33261.asInstanceOf[`33261`]
      
      @scala.inline
      def LINK: `40960` = 40960.asInstanceOf[`40960`]
      
      @scala.inline
      def TREE: `16384` = 16384.asInstanceOf[`16384`]
      
      @scala.inline
      def UNREADABLE: `0` = 0.asInstanceOf[`0`]
    }
  }
}
