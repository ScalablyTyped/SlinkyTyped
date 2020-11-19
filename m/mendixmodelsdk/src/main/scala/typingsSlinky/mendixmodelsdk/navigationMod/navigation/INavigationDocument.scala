package typingsSlinky.mendixmodelsdk.navigationMod.navigation

import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IProjectDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
