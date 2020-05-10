package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveItem extends BaseItem {
  /**
    * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some
    * contexts and folders in others. Read-only.
    */
  @JSName("package")
  var _package: js.UndefOr[Package] = js.native
  // Analytics about the view activities that took place on this item.
  var analytics: js.UndefOr[ItemAnalytics] = js.native
  // Audio metadata, if the item is an audio file. Read-only.
  var audio: js.UndefOr[Audio] = js.native
  /**
    * An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is
    * not returned if the item is a folder. Read-only.
    */
  var cTag: js.UndefOr[String] = js.native
  /**
    * Collection containing Item objects for the immediate children of Item. Only items representing folders have children.
    * Read-only. Nullable.
    */
  var children: js.UndefOr[js.Array[DriveItem]] = js.native
  // The content stream, if the item represents a file.
  var content: js.UndefOr[js.Any] = js.native
  // Information about the deleted state of the item. Read-only.
  var deleted: js.UndefOr[Deleted] = js.native
  // File metadata, if the item is a file. Read-only.
  var file: js.UndefOr[File] = js.native
  // File system information on client. Read-write.
  var fileSystemInfo: js.UndefOr[FileSystemInfo] = js.native
  // Folder metadata, if the item is a folder. Read-only.
  var folder: js.UndefOr[Folder] = js.native
  // Image metadata, if the item is an image. Read-only.
  var image: js.UndefOr[Image] = js.native
  // For drives in SharePoint, the associated document library list item. Read-only. Nullable.
  var listItem: js.UndefOr[ListItem] = js.native
  // Location metadata, if the item has location data. Read-only.
  var location: js.UndefOr[GeoCoordinates] = js.native
  // The set of permissions for the item. Read-only. Nullable.
  var permissions: js.UndefOr[js.Array[Permission]] = js.native
  // Photo metadata, if the item is a photo. Read-only.
  var photo: js.UndefOr[Photo] = js.native
  /**
    * Provides information about the published or checked-out state of an item, in locations that support such actions. This
    * property is not returned by default. Read-only.
    */
  var publication: js.UndefOr[PublicationFacet] = js.native
  // Remote item data, if the item is shared from a drive other than the one being accessed. Read-only.
  var remoteItem: js.UndefOr[RemoteItem] = js.native
  // If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive.
  var root: js.UndefOr[Root] = js.native
  // Search metadata, if the item is from a search result. Read-only.
  var searchResult: js.UndefOr[SearchResult] = js.native
  /**
    * Indicates that the item has been shared with others and provides information about the shared state of the item.
    * Read-only.
    */
  var shared: js.UndefOr[Shared] = js.native
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[SharepointIds] = js.native
  // Size of the item in bytes. Read-only.
  var size: js.UndefOr[Double] = js.native
  // If the current item is also available as a special folder, this facet is returned. Read-only.
  var specialFolder: js.UndefOr[SpecialFolder] = js.native
  // The set of subscriptions on the item. Only supported on the root of a drive.
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
  /**
    * Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][].
    * Read-only. Nullable.
    */
  var thumbnails: js.UndefOr[js.Array[ThumbnailSet]] = js.native
  // The list of previous versions of the item. For more info, see [getting previous versions][]. Read-only. Nullable.
  var versions: js.UndefOr[js.Array[DriveItemVersion]] = js.native
  // Video metadata, if the item is a video. Read-only.
  var video: js.UndefOr[Video] = js.native
  // WebDAV compatible URL for the item.
  var webDavUrl: js.UndefOr[String] = js.native
  // For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
  var workbook: js.UndefOr[Workbook] = js.native
}

object DriveItem {
  @scala.inline
  def apply(): DriveItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveItem]
  }
  @scala.inline
  implicit class DriveItemOps[Self <: DriveItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: Package): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_package: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalytics(value: ItemAnalytics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(js.undefined)
        ret
    }
    @scala.inline
    def withAudio(value: Audio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withCTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cTag")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[DriveItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleted(value: Deleted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSystemInfo(value: FileSystemInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystemInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystemInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystemInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFolder(value: Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withListItem(value: ListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItem")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: GeoCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto(value: Photo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(js.undefined)
        ret
    }
    @scala.inline
    def withPublication(value: PublicationFacet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publication")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteItem(value: RemoteItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteItem")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: Root): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchResult(value: SearchResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResult")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Shared): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
    @scala.inline
    def withSharepointIds(value: SharepointIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharepointIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharepointIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharepointIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialFolder(value: SpecialFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptions(value: js.Array[Subscription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnails(value: js.Array[ThumbnailSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(js.undefined)
        ret
    }
    @scala.inline
    def withVersions(value: js.Array[DriveItemVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: Video): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
    @scala.inline
    def withWebDavUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webDavUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebDavUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webDavUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkbook(value: Workbook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workbook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkbook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workbook")(js.undefined)
        ret
    }
  }
  
}

