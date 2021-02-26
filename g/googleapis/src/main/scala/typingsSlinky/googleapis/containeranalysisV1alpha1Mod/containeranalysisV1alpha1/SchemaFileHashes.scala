package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container message for hashes of byte content of files, used in Source
  * messages to verify integrity of source input to the build.
  */
@js.native
trait SchemaFileHashes extends StObject {
  
  /**
    * Collection of file hashes.
    */
  var fileHash: js.UndefOr[js.Array[SchemaHash]] = js.native
}
object SchemaFileHashes {
  
  @scala.inline
  def apply(): SchemaFileHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileHashes]
  }
  
  @scala.inline
  implicit class SchemaFileHashesMutableBuilder[Self <: SchemaFileHashes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileHash(value: js.Array[SchemaHash]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    @scala.inline
    def setFileHashVarargs(value: SchemaHash*): Self = StObject.set(x, "fileHash", js.Array(value :_*))
  }
}
