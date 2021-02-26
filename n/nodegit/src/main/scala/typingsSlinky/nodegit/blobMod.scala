package typingsSlinky.nodegit

import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.WriteStream
import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.wrapperMod.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blobMod {
  
  @JSImport("nodegit/blob", "Blob")
  @js.native
  class Blob () extends StObject {
    
    def content(): Buffer = js.native
    
    def dup(): js.Promise[Blob] = js.native
    
    def filemode(): Double = js.native
    
    def free(): Unit = js.native
    
    def id(): Oid = js.native
    
    def isBinary(): Double = js.native
    
    def owner(): Repository = js.native
    
    def rawcontent(): Wrapper = js.native
    
    def rawsize(): Double = js.native
  }
  /* static members */
  object Blob {
    
    /**
      * @param repo - repository where to blob will be written
      * @param buffer - data to be written into the blob
      * @param len - length of the data
      * @returns - return the id of the written blob
      */
    @JSImport("nodegit/blob", "Blob.createFromBuffer")
    @js.native
    def createFromBuffer(repo: Repository, buffer: Buffer, len: Double): js.Promise[Oid] = js.native
    
    /**
      * @param repo - repository where the blob will be written. this repository can be bare or not
      * @param path - file from which the blob will be created
      */
    @JSImport("nodegit/blob", "Blob.createFromDisk")
    @js.native
    def createFromDisk(repo: Repository, path: String): js.Promise[Oid] = js.native
    
    @JSImport("nodegit/blob", "Blob.createFromStream")
    @js.native
    def createFromStream(repo: Repository, hintPath: String): js.Promise[WriteStream] = js.native
    
    /**
      * @param repo - repository where the blob will be written. this repository cannot be bare
      * @param relativePath - file from which the blob will be created, relative to the repository's working dir
      * @returns - 0 or an error code
      */
    @JSImport("nodegit/blob", "Blob.createFromWorkdir")
    @js.native
    def createFromWorkdir(repo: Repository, relativePath: String): js.Promise[Oid] = js.native
    
    @JSImport("nodegit/blob", "Blob.filteredContent")
    @js.native
    def filteredContent(blob: Blob, as_path: String, check_for_binary_data: Double): js.Promise[Buffer] = js.native
    
    @JSImport("nodegit/blob", "Blob.lookup")
    @js.native
    def lookup(repo: Repository, id: String): js.Promise[Blob] = js.native
    @JSImport("nodegit/blob", "Blob.lookup")
    @js.native
    def lookup(repo: Repository, id: Blob): js.Promise[Blob] = js.native
    @JSImport("nodegit/blob", "Blob.lookup")
    @js.native
    def lookup(repo: Repository, id: Oid): js.Promise[Blob] = js.native
    
    @JSImport("nodegit/blob", "Blob.lookupPrefix")
    @js.native
    def lookupPrefix(repo: Repository, id: Oid, len: Double): js.Promise[Blob] = js.native
  }
}
