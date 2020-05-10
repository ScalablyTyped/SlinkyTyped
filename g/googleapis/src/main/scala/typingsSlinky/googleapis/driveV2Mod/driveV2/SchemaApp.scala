package typingsSlinky.googleapis.driveV2Mod.driveV2

import typingsSlinky.googleapis.AnonCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The apps resource provides a list of the apps that a user has installed,
  * with information about each app&#39;s supported MIME types, file
  * extensions, and other details.
  */
@js.native
trait SchemaApp extends js.Object {
  /**
    * Whether the app is authorized to access data on the user&#39;s Drive.
    */
  var authorized: js.UndefOr[Boolean] = js.native
  /**
    * The template url to create a new file with this app in a given folder.
    * The template will contain {folderId} to be replaced by the folder to
    * create the new file in.
    */
  var createInFolderTemplate: js.UndefOr[String] = js.native
  /**
    * The url to create a new file with this app.
    */
  var createUrl: js.UndefOr[String] = js.native
  /**
    * Whether the app has drive-wide scope. An app with drive-wide scope can
    * access all files in the user&#39;s drive.
    */
  var hasDriveWideScope: js.UndefOr[Boolean] = js.native
  /**
    * The various icons for the app.
    */
  var icons: js.UndefOr[js.Array[AnonCategory]] = js.native
  /**
    * The ID of the app.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether the app is installed.
    */
  var installed: js.UndefOr[Boolean] = js.native
  /**
    * This is always drive#app.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A long description of the app.
    */
  var longDescription: js.UndefOr[String] = js.native
  /**
    * The name of the app.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of object this app creates (e.g. Chart). If empty, the app name
    * should be used instead.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * The template url for opening files with this app. The template will
    * contain {ids} and/or {exportIds} to be replaced by the actual file ids.
    * See  Open Files  for the full documentation.
    */
  var openUrlTemplate: js.UndefOr[String] = js.native
  /**
    * The list of primary file extensions.
    */
  var primaryFileExtensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of primary mime types.
    */
  var primaryMimeTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID of the product listing for this app.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * A link to the product listing for this app.
    */
  var productUrl: js.UndefOr[String] = js.native
  /**
    * The list of secondary file extensions.
    */
  var secondaryFileExtensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of secondary mime types.
    */
  var secondaryMimeTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * A short description of the app.
    */
  var shortDescription: js.UndefOr[String] = js.native
  /**
    * Whether this app supports creating new objects.
    */
  var supportsCreate: js.UndefOr[Boolean] = js.native
  /**
    * Whether this app supports importing Google Docs.
    */
  var supportsImport: js.UndefOr[Boolean] = js.native
  /**
    * Whether this app supports opening more than one file.
    */
  var supportsMultiOpen: js.UndefOr[Boolean] = js.native
  /**
    * Whether this app supports creating new files when offline.
    */
  var supportsOfflineCreate: js.UndefOr[Boolean] = js.native
  /**
    * Whether the app is selected as the default handler for the types it
    * supports.
    */
  var useByDefault: js.UndefOr[Boolean] = js.native
}

object SchemaApp {
  @scala.inline
  def apply(): SchemaApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApp]
  }
  @scala.inline
  implicit class SchemaAppOps[Self <: SchemaApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorized")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateInFolderTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInFolderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateInFolderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInFolderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHasDriveWideScope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDriveWideScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDriveWideScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDriveWideScope")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: js.Array[AnonCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInstalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installed")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLongDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenUrlTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUrlTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenUrlTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUrlTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryFileExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryFileExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryFileExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryFileExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryMimeTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryMimeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryMimeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryMimeTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryFileExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryFileExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryFileExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryFileExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryMimeTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryMimeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryMimeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryMimeTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withShortDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsImport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsImport")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsMultiOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsMultiOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsMultiOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsMultiOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsOfflineCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsOfflineCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsOfflineCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsOfflineCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withUseByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useByDefault")(js.undefined)
        ret
    }
  }
  
}

