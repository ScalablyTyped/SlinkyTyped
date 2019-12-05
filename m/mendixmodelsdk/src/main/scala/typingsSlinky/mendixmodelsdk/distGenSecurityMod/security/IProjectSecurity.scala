package typingsSlinky.mendixmodelsdk.distGenSecurityMod.security

import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IProjectDocument
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/project-security relevant section in reference guide}
  */
@js.native
trait IProjectSecurity extends IProjectDocument {
  val userRoles: IList[IUserRole] = js.native
}

