package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notApplicable
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.installed
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notInstalled
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.uninstallFailed
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
*/
trait InstallState extends js.Object
object InstallState {
  
  @scala.inline
  def failed: failed_ = "failed".asInstanceOf[failed_]
  
  @scala.inline
  def installed: typingsSlinky.microsoftGraph.microsoftGraphStrings.installed = "installed".asInstanceOf[typingsSlinky.microsoftGraph.microsoftGraphStrings.installed]
  
  @scala.inline
  def notApplicable: typingsSlinky.microsoftGraph.microsoftGraphStrings.notApplicable = "notApplicable".asInstanceOf[typingsSlinky.microsoftGraph.microsoftGraphStrings.notApplicable]
  
  @scala.inline
  def notInstalled: typingsSlinky.microsoftGraph.microsoftGraphStrings.notInstalled = "notInstalled".asInstanceOf[typingsSlinky.microsoftGraph.microsoftGraphStrings.notInstalled]
  
  @scala.inline
  def uninstallFailed: typingsSlinky.microsoftGraph.microsoftGraphStrings.uninstallFailed = "uninstallFailed".asInstanceOf[typingsSlinky.microsoftGraph.microsoftGraphStrings.uninstallFailed]
  
  @scala.inline
  def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
}
