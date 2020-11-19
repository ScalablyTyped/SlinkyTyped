package typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.ParentList
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.ParentReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentsCollection extends js.Object {
  
  // Gets a specific parent reference.
  def get(fileId: String, parentId: String): ParentReference = js.native
  
  // Adds a parent folder for a file.
  def insert(resource: ParentReference, fileId: String): ParentReference = js.native
  // Adds a parent folder for a file.
  def insert(resource: ParentReference, fileId: String, optionalArgs: js.Object): ParentReference = js.native
  
  // Lists a file's parents.
  def list(fileId: String): ParentList = js.native
  
  // Removes a parent from a file.
  def remove(fileId: String, parentId: String): Unit = js.native
}
