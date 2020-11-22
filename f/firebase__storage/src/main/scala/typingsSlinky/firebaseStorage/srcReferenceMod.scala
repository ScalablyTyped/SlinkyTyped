package typingsSlinky.firebaseStorage

import org.scalajs.dom.raw.Blob
import typingsSlinky.firebaseStorage.locationMod.Location
import typingsSlinky.firebaseStorage.srcListMod.ListOptions
import typingsSlinky.firebaseStorage.srcListMod.ListResult
import typingsSlinky.firebaseStorage.srcMetadataMod.Metadata
import typingsSlinky.firebaseStorage.srcServiceMod.StorageService
import typingsSlinky.firebaseStorage.srcTaskMod.UploadTask
import typingsSlinky.firebaseStorage.stringMod.StringFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/reference", JSImport.Namespace)
@js.native
object srcReferenceMod extends js.Object {
  
  def deleteObject(ref: Reference): js.Promise[Unit] = js.native
  
  def getChild(ref: Reference, childPath: String): Reference = js.native
  
  def getDownloadURL(ref: Reference): js.Promise[String] = js.native
  
  def getMetadata(ref: Reference): js.Promise[Metadata] = js.native
  
  def list(ref: Reference): js.Promise[ListResult] = js.native
  def list(ref: Reference, options: ListOptions): js.Promise[ListResult] = js.native
  
  def listAll(ref: Reference): js.Promise[ListResult] = js.native
  
  def updateMetadata(ref: Reference, metadata: Metadata): js.Promise[Metadata] = js.native
  
  def uploadBytesResumable(ref: Reference, data: js.typedarray.ArrayBuffer): UploadTask = js.native
  def uploadBytesResumable(ref: Reference, data: js.typedarray.ArrayBuffer, metadata: Metadata): UploadTask = js.native
  def uploadBytesResumable(ref: Reference, data: Blob): UploadTask = js.native
  def uploadBytesResumable(ref: Reference, data: Blob, metadata: Metadata): UploadTask = js.native
  def uploadBytesResumable(ref: Reference, data: js.typedarray.Uint8Array): UploadTask = js.native
  def uploadBytesResumable(ref: Reference, data: js.typedarray.Uint8Array, metadata: Metadata): UploadTask = js.native
  
  def uploadString(ref: Reference, value: String): UploadTask = js.native
  def uploadString(ref: Reference, value: String, format: js.UndefOr[scala.Nothing], metadata: Metadata): UploadTask = js.native
  def uploadString(ref: Reference, value: String, format: StringFormat): UploadTask = js.native
  def uploadString(ref: Reference, value: String, format: StringFormat, metadata: Metadata): UploadTask = js.native
  
  @js.native
  class Reference protected () extends js.Object {
    def this(_service: StorageService, location: String) = this()
    def this(_service: StorageService, location: Location) = this()
    
    /**
      * @internal
      */
    var _location: Location = js.native
    
    var _service: js.Any = js.native
    
    def _throwIfRoot(name: String): Unit = js.native
    
    def bucket: String = js.native
    
    def fullPath: String = js.native
    
    def name: String = js.native
    
    /* protected */ def newRef(service: StorageService, location: Location): Reference = js.native
    
    def parent: Reference | Null = js.native
    
    /**
      * @returns An reference to the root of this
      *     object's bucket.
      */
    def root: Reference = js.native
    
    def storage: StorageService = js.native
  }
}
