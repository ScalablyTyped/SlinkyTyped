package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.securityMod.security.IModuleRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/page relevant section in reference guide}
  */
@js.native
trait IPage extends IFormBase {
  
  /**
    * In version 7.23.0: added public
    */
  val allowedRoles: IList[IModuleRole] = js.native
  
  val allowedRolesQualifiedNames: js.Array[String] = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.17.0: added public
    */
  val layoutCall: ILayoutCall = js.native
}
