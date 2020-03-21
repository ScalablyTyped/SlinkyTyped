package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.IMicroflowActionInfo
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.securityMod.security.IModuleRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/microflows relevant section in reference guide}
  */
@js.native
trait IMicroflow extends IServerSideMicroflow {
  /**
    * In version 7.23.0: added public
    */
  val allowedModuleRoles: IList[IModuleRole] = js.native
  val allowedModuleRolesQualifiedNames: js.Array[String] = js.native
  /**
    * In version 8.0.0: introduced
    */
  val microflowActionInfo: IMicroflowActionInfo | Null = js.native
}

