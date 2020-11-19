package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The expected state of a client&#39;s local database.
  */
@js.native
trait SchemaChecksum extends js.Object {
  
  /**
    * The SHA256 hash of the client state; that is, of the sorted list of all
    * hashes present in the database.
    */
  var sha256: js.UndefOr[String] = js.native
}
object SchemaChecksum {
  
  @scala.inline
  def apply(): SchemaChecksum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChecksum]
  }
  
  @scala.inline
  implicit class SchemaChecksumOps[Self <: SchemaChecksum] (val x: Self) extends AnyVal {
    
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
    def setSha256(value: String): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
  }
}
