package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sarif.mod.Artifact.roles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Artifact extends StObject {
  
  /**
    * The contents of the artifact.
    */
  var contents: js.UndefOr[ArtifactContent] = js.native
  
  /**
    * A short description of the artifact.
    */
  var description: js.UndefOr[Message] = js.native
  
  /**
    * Specifies the encoding for an artifact object that refers to a text file.
    */
  var encoding: js.UndefOr[String] = js.native
  
  /**
    * A dictionary, each of whose keys is the name of a hash function and each of whose values is the hashed value of
    * the artifact produced by the specified hash function.
    */
  var hashes: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The Coordinated Universal Time (UTC) date and time at which the artifact was most recently modified. See
    * "Date/time properties" in the SARIF spec for the required format.
    */
  var lastModifiedTimeUtc: js.UndefOr[String] = js.native
  
  /**
    * The length of the artifact in bytes.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * The location of the artifact.
    */
  var location: js.UndefOr[ArtifactLocation] = js.native
  
  /**
    * The MIME type (RFC 2045) of the artifact.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * The offset in bytes of the artifact within its containing artifact.
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * Identifies the index of the immediate parent of the artifact, if this artifact is nested.
    */
  var parentIndex: js.UndefOr[Double] = js.native
  
  /**
    * Key/value pairs that provide additional information about the artifact.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * The role or roles played by the artifact in the analysis.
    */
  var roles: js.UndefOr[js.Array[roles]] = js.native
  
  /**
    * Specifies the source language for any artifact object that refers to a text file that contains source code.
    */
  var sourceLanguage: js.UndefOr[String] = js.native
}
object Artifact {
  
  @scala.inline
  def apply(): Artifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Artifact]
  }
  
  @scala.inline
  implicit class ArtifactMutableBuilder[Self <: Artifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: ArtifactContent): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setHashes(value: StringDictionary[String]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    @scala.inline
    def setLastModifiedTimeUtc(value: String): Self = StObject.set(x, "lastModifiedTimeUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUtcUndefined: Self = StObject.set(x, "lastModifiedTimeUtc", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setLocation(value: ArtifactLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setParentIndex(value: Double): Self = StObject.set(x, "parentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIndexUndefined: Self = StObject.set(x, "parentIndex", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRoles(value: js.Array[roles]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: roles*): Self = StObject.set(x, "roles", js.Array(value :_*))
    
    @scala.inline
    def setSourceLanguage(value: String): Self = StObject.set(x, "sourceLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLanguageUndefined: Self = StObject.set(x, "sourceLanguage", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sarif.sarifStrings.analysisTarget
    - typingsSlinky.sarif.sarifStrings.attachment
    - typingsSlinky.sarif.sarifStrings.responseFile
    - typingsSlinky.sarif.sarifStrings.resultFile
    - typingsSlinky.sarif.sarifStrings.standardStream
    - typingsSlinky.sarif.sarifStrings.tracedFile
    - typingsSlinky.sarif.sarifStrings.unmodified
    - typingsSlinky.sarif.sarifStrings.modified
    - typingsSlinky.sarif.sarifStrings.added
    - typingsSlinky.sarif.sarifStrings.deleted
    - typingsSlinky.sarif.sarifStrings.renamed
    - typingsSlinky.sarif.sarifStrings.uncontrolled
    - typingsSlinky.sarif.sarifStrings.driver
    - typingsSlinky.sarif.sarifStrings.extension
    - typingsSlinky.sarif.sarifStrings.translation
    - typingsSlinky.sarif.sarifStrings.taxonomy
    - typingsSlinky.sarif.sarifStrings.policy
    - typingsSlinky.sarif.sarifStrings.referencedOnCommandLine
    - typingsSlinky.sarif.sarifStrings.memoryContents
    - typingsSlinky.sarif.sarifStrings.directory
    - typingsSlinky.sarif.sarifStrings.userSpecifiedConfiguration
    - typingsSlinky.sarif.sarifStrings.toolSpecifiedConfiguration
    - typingsSlinky.sarif.sarifStrings.debugOutputFile
  */
  trait roles extends StObject
  object roles {
    
    @scala.inline
    def added: typingsSlinky.sarif.sarifStrings.added = "added".asInstanceOf[typingsSlinky.sarif.sarifStrings.added]
    
    @scala.inline
    def analysisTarget: typingsSlinky.sarif.sarifStrings.analysisTarget = "analysisTarget".asInstanceOf[typingsSlinky.sarif.sarifStrings.analysisTarget]
    
    @scala.inline
    def attachment: typingsSlinky.sarif.sarifStrings.attachment = "attachment".asInstanceOf[typingsSlinky.sarif.sarifStrings.attachment]
    
    @scala.inline
    def debugOutputFile: typingsSlinky.sarif.sarifStrings.debugOutputFile = "debugOutputFile".asInstanceOf[typingsSlinky.sarif.sarifStrings.debugOutputFile]
    
    @scala.inline
    def deleted: typingsSlinky.sarif.sarifStrings.deleted = "deleted".asInstanceOf[typingsSlinky.sarif.sarifStrings.deleted]
    
    @scala.inline
    def directory: typingsSlinky.sarif.sarifStrings.directory = "directory".asInstanceOf[typingsSlinky.sarif.sarifStrings.directory]
    
    @scala.inline
    def driver: typingsSlinky.sarif.sarifStrings.driver = "driver".asInstanceOf[typingsSlinky.sarif.sarifStrings.driver]
    
    @scala.inline
    def extension: typingsSlinky.sarif.sarifStrings.extension = "extension".asInstanceOf[typingsSlinky.sarif.sarifStrings.extension]
    
    @scala.inline
    def memoryContents: typingsSlinky.sarif.sarifStrings.memoryContents = "memoryContents".asInstanceOf[typingsSlinky.sarif.sarifStrings.memoryContents]
    
    @scala.inline
    def modified: typingsSlinky.sarif.sarifStrings.modified = "modified".asInstanceOf[typingsSlinky.sarif.sarifStrings.modified]
    
    @scala.inline
    def policy: typingsSlinky.sarif.sarifStrings.policy = "policy".asInstanceOf[typingsSlinky.sarif.sarifStrings.policy]
    
    @scala.inline
    def referencedOnCommandLine: typingsSlinky.sarif.sarifStrings.referencedOnCommandLine = "referencedOnCommandLine".asInstanceOf[typingsSlinky.sarif.sarifStrings.referencedOnCommandLine]
    
    @scala.inline
    def renamed: typingsSlinky.sarif.sarifStrings.renamed = "renamed".asInstanceOf[typingsSlinky.sarif.sarifStrings.renamed]
    
    @scala.inline
    def responseFile: typingsSlinky.sarif.sarifStrings.responseFile = "responseFile".asInstanceOf[typingsSlinky.sarif.sarifStrings.responseFile]
    
    @scala.inline
    def resultFile: typingsSlinky.sarif.sarifStrings.resultFile = "resultFile".asInstanceOf[typingsSlinky.sarif.sarifStrings.resultFile]
    
    @scala.inline
    def standardStream: typingsSlinky.sarif.sarifStrings.standardStream = "standardStream".asInstanceOf[typingsSlinky.sarif.sarifStrings.standardStream]
    
    @scala.inline
    def taxonomy: typingsSlinky.sarif.sarifStrings.taxonomy = "taxonomy".asInstanceOf[typingsSlinky.sarif.sarifStrings.taxonomy]
    
    @scala.inline
    def toolSpecifiedConfiguration: typingsSlinky.sarif.sarifStrings.toolSpecifiedConfiguration = "toolSpecifiedConfiguration".asInstanceOf[typingsSlinky.sarif.sarifStrings.toolSpecifiedConfiguration]
    
    @scala.inline
    def tracedFile: typingsSlinky.sarif.sarifStrings.tracedFile = "tracedFile".asInstanceOf[typingsSlinky.sarif.sarifStrings.tracedFile]
    
    @scala.inline
    def translation: typingsSlinky.sarif.sarifStrings.translation = "translation".asInstanceOf[typingsSlinky.sarif.sarifStrings.translation]
    
    @scala.inline
    def uncontrolled: typingsSlinky.sarif.sarifStrings.uncontrolled = "uncontrolled".asInstanceOf[typingsSlinky.sarif.sarifStrings.uncontrolled]
    
    @scala.inline
    def unmodified: typingsSlinky.sarif.sarifStrings.unmodified = "unmodified".asInstanceOf[typingsSlinky.sarif.sarifStrings.unmodified]
    
    @scala.inline
    def userSpecifiedConfiguration: typingsSlinky.sarif.sarifStrings.userSpecifiedConfiguration = "userSpecifiedConfiguration".asInstanceOf[typingsSlinky.sarif.sarifStrings.userSpecifiedConfiguration]
  }
}
