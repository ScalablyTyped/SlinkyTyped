package typingsSlinky.mendixmodelsdk.distGenNavigationMod.navigation

import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IProjectDocument
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/navigation relevant section in reference guide}
  */
@js.native
trait INavigationDocument extends IProjectDocument {
  /**
    * In version 7.2.0: introduced
    */
  val profiles: IList[INavigationProfileBase] = js.native
}

