package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.AboutCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.AppsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.ChangesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.ChannelsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.ChildrenCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.CommentsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.DrivesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.FilesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.ParentsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.PermissionsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.PropertiesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.RealtimeCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.RepliesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.RevisionsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Collection.TeamdrivesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.Channel
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.ChildReference
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.Comment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.CommentContext
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.CommentReply
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.DriveBackgroundImageFile
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.DriveCapabilities
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.DriveRestrictions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.File
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.FileCapabilities
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.FileImageMediaMetadata
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.FileImageMediaMetadataLocation
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.FileIndexableText
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.FileLabels
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.FileThumbnail
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.FileVideoMediaMetadata
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.ParentReference
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.PermissionPermissionDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.PermissionTeamDrivePermissionDetails
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.Property
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.Revision
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.TeamDrive
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.TeamDriveBackgroundImageFile
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.TeamDriveCapabilities
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.TeamDriveRestrictions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.User
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.UserPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drive_ extends js.Object {
  var About: js.UndefOr[AboutCollection] = js.native
  var Apps: js.UndefOr[AppsCollection] = js.native
  var Changes: js.UndefOr[ChangesCollection] = js.native
  var Channels: js.UndefOr[ChannelsCollection] = js.native
  var Children: js.UndefOr[ChildrenCollection] = js.native
  var Comments: js.UndefOr[CommentsCollection] = js.native
  var Drives: js.UndefOr[DrivesCollection] = js.native
  var Files: js.UndefOr[FilesCollection] = js.native
  var Parents: js.UndefOr[ParentsCollection] = js.native
  var Permissions: js.UndefOr[PermissionsCollection] = js.native
  var Properties: js.UndefOr[PropertiesCollection] = js.native
  var Realtime: js.UndefOr[RealtimeCollection] = js.native
  var Replies: js.UndefOr[RepliesCollection] = js.native
  var Revisions: js.UndefOr[RevisionsCollection] = js.native
  var Teamdrives: js.UndefOr[TeamdrivesCollection] = js.native
  // Create a new instance of Channel
  def newChannel(): Channel = js.native
  // Create a new instance of ChildReference
  def newChildReference(): ChildReference = js.native
  // Create a new instance of Comment
  def newComment(): Comment = js.native
  // Create a new instance of CommentContext
  def newCommentContext(): CommentContext = js.native
  // Create a new instance of CommentReply
  def newCommentReply(): CommentReply = js.native
  // Create a new instance of Drive
  def newDrive(): typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive = js.native
  // Create a new instance of DriveBackgroundImageFile
  def newDriveBackgroundImageFile(): DriveBackgroundImageFile = js.native
  // Create a new instance of DriveCapabilities
  def newDriveCapabilities(): DriveCapabilities = js.native
  // Create a new instance of DriveRestrictions
  def newDriveRestrictions(): DriveRestrictions = js.native
  // Create a new instance of File
  def newFile(): File = js.native
  // Create a new instance of FileCapabilities
  def newFileCapabilities(): FileCapabilities = js.native
  // Create a new instance of FileImageMediaMetadata
  def newFileImageMediaMetadata(): FileImageMediaMetadata = js.native
  // Create a new instance of FileImageMediaMetadataLocation
  def newFileImageMediaMetadataLocation(): FileImageMediaMetadataLocation = js.native
  // Create a new instance of FileIndexableText
  def newFileIndexableText(): FileIndexableText = js.native
  // Create a new instance of FileLabels
  def newFileLabels(): FileLabels = js.native
  // Create a new instance of FileThumbnail
  def newFileThumbnail(): FileThumbnail = js.native
  // Create a new instance of FileVideoMediaMetadata
  def newFileVideoMediaMetadata(): FileVideoMediaMetadata = js.native
  // Create a new instance of ParentReference
  def newParentReference(): ParentReference = js.native
  // Create a new instance of Permission
  def newPermission(): Permission = js.native
  // Create a new instance of PermissionPermissionDetails
  def newPermissionPermissionDetails(): PermissionPermissionDetails = js.native
  // Create a new instance of PermissionTeamDrivePermissionDetails
  def newPermissionTeamDrivePermissionDetails(): PermissionTeamDrivePermissionDetails = js.native
  // Create a new instance of Property
  def newProperty(): Property = js.native
  // Create a new instance of Revision
  def newRevision(): Revision = js.native
  // Create a new instance of TeamDrive
  def newTeamDrive(): TeamDrive = js.native
  // Create a new instance of TeamDriveBackgroundImageFile
  def newTeamDriveBackgroundImageFile(): TeamDriveBackgroundImageFile = js.native
  // Create a new instance of TeamDriveCapabilities
  def newTeamDriveCapabilities(): TeamDriveCapabilities = js.native
  // Create a new instance of TeamDriveRestrictions
  def newTeamDriveRestrictions(): TeamDriveRestrictions = js.native
  // Create a new instance of User
  def newUser(): User = js.native
  // Create a new instance of UserPicture
  def newUserPicture(): UserPicture = js.native
}

object Drive_ {
  @scala.inline
  def apply(
    newChannel: () => Channel,
    newChildReference: () => ChildReference,
    newComment: () => Comment,
    newCommentContext: () => CommentContext,
    newCommentReply: () => CommentReply,
    newDrive: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive,
    newDriveBackgroundImageFile: () => DriveBackgroundImageFile,
    newDriveCapabilities: () => DriveCapabilities,
    newDriveRestrictions: () => DriveRestrictions,
    newFile: () => File,
    newFileCapabilities: () => FileCapabilities,
    newFileImageMediaMetadata: () => FileImageMediaMetadata,
    newFileImageMediaMetadataLocation: () => FileImageMediaMetadataLocation,
    newFileIndexableText: () => FileIndexableText,
    newFileLabels: () => FileLabels,
    newFileThumbnail: () => FileThumbnail,
    newFileVideoMediaMetadata: () => FileVideoMediaMetadata,
    newParentReference: () => ParentReference,
    newPermission: () => Permission,
    newPermissionPermissionDetails: () => PermissionPermissionDetails,
    newPermissionTeamDrivePermissionDetails: () => PermissionTeamDrivePermissionDetails,
    newProperty: () => Property,
    newRevision: () => Revision,
    newTeamDrive: () => TeamDrive,
    newTeamDriveBackgroundImageFile: () => TeamDriveBackgroundImageFile,
    newTeamDriveCapabilities: () => TeamDriveCapabilities,
    newTeamDriveRestrictions: () => TeamDriveRestrictions,
    newUser: () => User,
    newUserPicture: () => UserPicture
  ): Drive_ = {
    val __obj = js.Dynamic.literal(newChannel = js.Any.fromFunction0(newChannel), newChildReference = js.Any.fromFunction0(newChildReference), newComment = js.Any.fromFunction0(newComment), newCommentContext = js.Any.fromFunction0(newCommentContext), newCommentReply = js.Any.fromFunction0(newCommentReply), newDrive = js.Any.fromFunction0(newDrive), newDriveBackgroundImageFile = js.Any.fromFunction0(newDriveBackgroundImageFile), newDriveCapabilities = js.Any.fromFunction0(newDriveCapabilities), newDriveRestrictions = js.Any.fromFunction0(newDriveRestrictions), newFile = js.Any.fromFunction0(newFile), newFileCapabilities = js.Any.fromFunction0(newFileCapabilities), newFileImageMediaMetadata = js.Any.fromFunction0(newFileImageMediaMetadata), newFileImageMediaMetadataLocation = js.Any.fromFunction0(newFileImageMediaMetadataLocation), newFileIndexableText = js.Any.fromFunction0(newFileIndexableText), newFileLabels = js.Any.fromFunction0(newFileLabels), newFileThumbnail = js.Any.fromFunction0(newFileThumbnail), newFileVideoMediaMetadata = js.Any.fromFunction0(newFileVideoMediaMetadata), newParentReference = js.Any.fromFunction0(newParentReference), newPermission = js.Any.fromFunction0(newPermission), newPermissionPermissionDetails = js.Any.fromFunction0(newPermissionPermissionDetails), newPermissionTeamDrivePermissionDetails = js.Any.fromFunction0(newPermissionTeamDrivePermissionDetails), newProperty = js.Any.fromFunction0(newProperty), newRevision = js.Any.fromFunction0(newRevision), newTeamDrive = js.Any.fromFunction0(newTeamDrive), newTeamDriveBackgroundImageFile = js.Any.fromFunction0(newTeamDriveBackgroundImageFile), newTeamDriveCapabilities = js.Any.fromFunction0(newTeamDriveCapabilities), newTeamDriveRestrictions = js.Any.fromFunction0(newTeamDriveRestrictions), newUser = js.Any.fromFunction0(newUser), newUserPicture = js.Any.fromFunction0(newUserPicture))
    __obj.asInstanceOf[Drive_]
  }
  @scala.inline
  implicit class Drive_Ops[Self <: Drive_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewChannel(value: () => Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChildReference(value: () => ChildReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChildReference")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewComment(value: () => Comment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newComment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCommentContext(value: () => CommentContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCommentContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCommentReply(value: () => CommentReply): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCommentReply")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDrive(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDrive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDriveBackgroundImageFile(value: () => DriveBackgroundImageFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDriveBackgroundImageFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDriveCapabilities(value: () => DriveCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDriveCapabilities")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDriveRestrictions(value: () => DriveRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDriveRestrictions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFile(value: () => File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFileCapabilities(value: () => FileCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFileCapabilities")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFileImageMediaMetadata(value: () => FileImageMediaMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFileImageMediaMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFileImageMediaMetadataLocation(value: () => FileImageMediaMetadataLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFileImageMediaMetadataLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFileIndexableText(value: () => FileIndexableText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFileIndexableText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFileLabels(value: () => FileLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFileLabels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFileThumbnail(value: () => FileThumbnail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFileThumbnail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFileVideoMediaMetadata(value: () => FileVideoMediaMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFileVideoMediaMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewParentReference(value: () => ParentReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newParentReference")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPermission(value: () => Permission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPermission")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPermissionPermissionDetails(value: () => PermissionPermissionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPermissionPermissionDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPermissionTeamDrivePermissionDetails(value: () => PermissionTeamDrivePermissionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPermissionTeamDrivePermissionDetails")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProperty(value: () => Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRevision(value: () => Revision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRevision")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTeamDrive(value: () => TeamDrive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTeamDrive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTeamDriveBackgroundImageFile(value: () => TeamDriveBackgroundImageFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTeamDriveBackgroundImageFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTeamDriveCapabilities(value: () => TeamDriveCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTeamDriveCapabilities")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTeamDriveRestrictions(value: () => TeamDriveRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTeamDriveRestrictions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUser(value: () => User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUser")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserPicture(value: () => UserPicture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserPicture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAbout(value: AboutCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("About")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("About")(js.undefined)
        ret
    }
    @scala.inline
    def withApps(value: AppsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Apps")(js.undefined)
        ret
    }
    @scala.inline
    def withChanges(value: ChangesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Changes")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: ChannelsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: ChildrenCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Children")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: CommentsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comments")(js.undefined)
        ret
    }
    @scala.inline
    def withDrives(value: DrivesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Drives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Drives")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: FilesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Files")(js.undefined)
        ret
    }
    @scala.inline
    def withParents(value: ParentsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parents")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: PermissionsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertiesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(js.undefined)
        ret
    }
    @scala.inline
    def withRealtime(value: RealtimeCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Realtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Realtime")(js.undefined)
        ret
    }
    @scala.inline
    def withReplies(value: RepliesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replies")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisions(value: RevisionsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Revisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Revisions")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamdrives(value: TeamdrivesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Teamdrives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamdrives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Teamdrives")(js.undefined)
        ret
    }
  }
  
}

