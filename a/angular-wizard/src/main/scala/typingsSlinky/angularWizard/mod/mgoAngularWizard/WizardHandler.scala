package typingsSlinky.angularWizard.mod.mgoAngularWizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WizardHandler extends js.Object {
  
  def addWizard(name: String, wizard: Wizard): Unit = js.native
  
  def removeWizard(name: String): Unit = js.native
  
  def wizard(): Wizard = js.native
  def wizard(name: String): Wizard = js.native
}
