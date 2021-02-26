package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.securityMod.security.IModuleRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/nanoflows relevant section in reference guide}
  *
  * In version 7.12.0: removed experimental
  * In version 7.10.0: introduced
  */
@js.native
trait INanoflow extends IMicroflowBase {
  
  /**
    * In version 7.23.0: added public
    */
  val allowedModuleRoles: IList[IModuleRole] = js.native
  
  val allowedModuleRolesQualifiedNames: js.Array[String] = js.native
}
