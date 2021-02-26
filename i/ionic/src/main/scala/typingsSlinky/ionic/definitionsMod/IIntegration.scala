package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionicCliFramework.mod.BaseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIntegration[T /* <: ProjectIntegration */] extends StObject {
  
  def add(details: IntegrationAddDetails): js.Promise[Unit] = js.native
  
  val archiveUrl: js.UndefOr[String] = js.native
  
  val config: BaseConfig[T] = js.native
  
  def disable(): js.Promise[Unit] = js.native
  
  def enable(): js.Promise[Unit] = js.native
  def enable(config: T): js.Promise[Unit] = js.native
  
  def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
  
  def isAdded(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
  
  val name: IntegrationName = js.native
  
  def personalize(details: ProjectPersonalizationDetails): js.Promise[Unit] = js.native
  
  val summary: String = js.native
}
