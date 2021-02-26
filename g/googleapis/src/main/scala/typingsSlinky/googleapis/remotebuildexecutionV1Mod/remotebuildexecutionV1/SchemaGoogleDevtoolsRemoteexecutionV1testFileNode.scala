package typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `FileNode` represents a single file and associated metadata.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testFileNode extends StObject {
  
  /**
    * The digest of the file&#39;s content.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.native
  
  /**
    * True if file is executable, false otherwise.
    */
  var isExecutable: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the file.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGoogleDevtoolsRemoteexecutionV1testFileNode {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testFileNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testFileNode]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testFileNodeMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testFileNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: SchemaGoogleDevtoolsRemoteexecutionV1testDigest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setIsExecutable(value: Boolean): Self = StObject.set(x, "isExecutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExecutableUndefined: Self = StObject.set(x, "isExecutable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
