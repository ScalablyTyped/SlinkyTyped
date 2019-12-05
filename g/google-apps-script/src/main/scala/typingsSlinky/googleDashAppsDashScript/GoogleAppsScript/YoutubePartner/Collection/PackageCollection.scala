package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Collection

import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema.Package
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema.PackageInsertResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageCollection extends js.Object {
  // Retrieves information for the specified package.
  def get(packageId: String): Package = js.native
  // Retrieves information for the specified package.
  def get(packageId: String, optionalArgs: js.Object): Package = js.native
  // Inserts a metadata-only package.
  def insert(resource: Package): PackageInsertResponse = js.native
  // Inserts a metadata-only package.
  def insert(resource: Package, optionalArgs: js.Object): PackageInsertResponse = js.native
}

