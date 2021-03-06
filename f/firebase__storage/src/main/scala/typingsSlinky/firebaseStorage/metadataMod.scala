package typingsSlinky.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseStorage.srcMetadataMod.Metadata
import typingsSlinky.firebaseStorage.srcServiceMod.StorageService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/metadata", "addRef")
  @js.native
  def addRef(metadata: Metadata, service: StorageService): Unit = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/metadata", "downloadUrlFromResourceString")
  @js.native
  def downloadUrlFromResourceString(metadata: Metadata, resourceString: String): String | Null = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/metadata", "fromResource")
  @js.native
  def fromResource(service: StorageService, resource: StringDictionary[js.Any], mappings: Mappings): Metadata = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/metadata", "fromResourceString")
  @js.native
  def fromResourceString(service: StorageService, resourceString: String, mappings: Mappings): Metadata | Null = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/metadata", "getMappings")
  @js.native
  def getMappings(): Mappings = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/metadata", "noXform_")
  @js.native
  def noXform[T](metadata: Metadata, value: T): T = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/metadata", "toResourceString")
  @js.native
  def toResourceString(metadata: Metadata, mappings: Mappings): String = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/metadata", "xformPath")
  @js.native
  def xformPath(): js.UndefOr[String] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/metadata", "xformPath")
  @js.native
  def xformPath(fullPath: String): js.UndefOr[String] = js.native
  
  @js.native
  trait Mapping[T] extends StObject {
    
    var local: String = js.native
    
    var server: String = js.native
    
    var writable: Boolean = js.native
    
    def xform(p1: Metadata): js.UndefOr[T] = js.native
    def xform(p1: Metadata, p2: T): js.UndefOr[T] = js.native
  }
  
  type Mappings = js.Array[Mapping[Double | String]]
}
