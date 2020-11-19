package typingsSlinky.googleAppsScript.GoogleAppsScript.Drive

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Date
import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A file in Google Drive. Files can be accessed or created from DriveApp.
  *
  *     // Trash every untitled spreadsheet that hasn't been updated in a week.
  *     var files = DriveApp.getFilesByName('Untitled spreadsheet');
  *     while (files.hasNext()) {
  *       var file = files.next();
  *       if (new Date() - file.getLastUpdated() > 7 * 24 * 60 * 60 * 1000) {
  *         file.setTrashed(true);
  *       }
  *     }
  */
@js.native
trait File extends js.Object {
  
  def addCommenter(emailAddress: String): File = js.native
  def addCommenter(user: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User): File = js.native
  
  def addCommenters(emailAddresses: js.Array[String]): File = js.native
  
  def addEditor(emailAddress: String): File = js.native
  def addEditor(user: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User): File = js.native
  
  def addEditors(emailAddresses: js.Array[String]): File = js.native
  
  def addViewer(emailAddress: String): File = js.native
  def addViewer(user: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User): File = js.native
  
  def addViewers(emailAddresses: js.Array[String]): File = js.native
  
  def getAccess(email: String): Permission = js.native
  def getAccess(user: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User): Permission = js.native
  
  def getAs(contentType: String): Blob = js.native
  
  def getBlob(): Blob = js.native
  
  def getDateCreated(): Date = js.native
  
  def getDescription(): String = js.native
  
  def getDownloadUrl(): String = js.native
  
  def getEditors(): js.Array[User] = js.native
  
  def getId(): String = js.native
  
  def getLastUpdated(): Date = js.native
  
  def getMimeType(): String = js.native
  
  def getName(): String = js.native
  
  def getOwner(): User = js.native
  
  def getParents(): FolderIterator = js.native
  
  def getSharingAccess(): Access = js.native
  
  def getSharingPermission(): Permission = js.native
  
  def getSize(): Integer = js.native
  
  def getThumbnail(): Blob = js.native
  
  def getUrl(): String = js.native
  
  def getViewers(): js.Array[User] = js.native
  
  def isShareableByEditors(): Boolean = js.native
  
  def isStarred(): Boolean = js.native
  
  def isTrashed(): Boolean = js.native
  
  def makeCopy(): File = js.native
  def makeCopy(destination: Folder): File = js.native
  def makeCopy(name: String): File = js.native
  def makeCopy(name: String, destination: Folder): File = js.native
  
  def removeCommenter(emailAddress: String): File = js.native
  def removeCommenter(user: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User): File = js.native
  
  def removeEditor(emailAddress: String): File = js.native
  def removeEditor(user: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User): File = js.native
  
  def removeViewer(emailAddress: String): File = js.native
  def removeViewer(user: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User): File = js.native
  
  def revokePermissions(user: String): File = js.native
  def revokePermissions(user: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User): File = js.native
  
  def setContent(content: String): File = js.native
  
  def setDescription(description: String): File = js.native
  
  def setName(name: String): File = js.native
  
  def setOwner(emailAddress: String): File = js.native
  def setOwner(user: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User): File = js.native
  
  def setShareableByEditors(shareable: Boolean): File = js.native
  
  def setSharing(accessType: Access, permissionType: Permission): File = js.native
  
  def setStarred(starred: Boolean): File = js.native
  
  def setTrashed(trashed: Boolean): File = js.native
}
