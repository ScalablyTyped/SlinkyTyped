package typingsSlinky.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alias extends StObject {
  
  /**
    * Describes the state of the DNS alias.   AVAILABLE - The DNS alias is associated with an Amazon FSx file system.   CREATING - Amazon FSx is creating the DNS alias and associating it with the file system.   CREATE_FAILED - Amazon FSx was unable to associate the DNS alias with the file system.   DELETING - Amazon FSx is disassociating the DNS alias from the file system and deleting it.   DELETE_FAILED - Amazon FSx was unable to disassocate the DNS alias from the file system.  
    */
  var Lifecycle: js.UndefOr[AliasLifecycle] = js.native
  
  /**
    * The name of the DNS alias. The alias name has to meet the following requirements:   Formatted as a fully-qualified domain name (FQDN), hostname.domain, for example, accounting.example.com.   Can contain alphanumeric characters and the hyphen (-).   Cannot start or end with a hyphen.   Can start with a numeric.   For DNS names, Amazon FSx stores alphabetic characters as lowercase letters (a-z), regardless of how you specify them: as uppercase letters, lowercase letters, or the corresponding letters in escape codes.
    */
  var Name: js.UndefOr[AlternateDNSName] = js.native
}
object Alias {
  
  @scala.inline
  def apply(): Alias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alias]
  }
  
  @scala.inline
  implicit class AliasMutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifecycle(value: AliasLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    @scala.inline
    def setName(value: AlternateDNSName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
