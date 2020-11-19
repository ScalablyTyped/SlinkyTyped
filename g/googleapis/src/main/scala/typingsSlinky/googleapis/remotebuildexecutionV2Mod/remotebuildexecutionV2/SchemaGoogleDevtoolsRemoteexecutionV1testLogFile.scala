package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `LogFile` is a log stored in the CAS.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testLogFile extends js.Object {
  
  /**
    * The digest of the log contents.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.native
  
  /**
    * This is a hint as to the purpose of the log, and is set to true if the
    * log is human-readable text that can be usefully displayed to a user, and
    * false otherwise. For instance, if a command-line client wishes to print
    * the server logs to the terminal for a failed action, this allows it to
    * avoid displaying a binary file.
    */
  var humanReadable: js.UndefOr[Boolean] = js.native
}
object SchemaGoogleDevtoolsRemoteexecutionV1testLogFile {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testLogFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testLogFile]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testLogFileOps[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testLogFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDigest(value: SchemaGoogleDevtoolsRemoteexecutionV1testDigest): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    
    @scala.inline
    def setHumanReadable(value: Boolean): Self = this.set("humanReadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanReadable: Self = this.set("humanReadable", js.undefined)
  }
}
