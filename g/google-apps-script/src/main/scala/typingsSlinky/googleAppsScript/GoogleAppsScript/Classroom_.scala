package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Collection.CoursesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Collection.InvitationsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Collection.RegistrationsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfilesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Announcement
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Assignment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.AssignmentSubmission
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Attachment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.CloudPubsubTopic
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Course
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseAlias
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseMaterial
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseMaterialSet
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseRosterChangesInfo
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseWork
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseWorkChangesInfo
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Date
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.DriveFile
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.DriveFolder
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Feed
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Form
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.GlobalPermission
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.GradeHistory
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.GuardianInvitation
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.IndividualStudentsOptions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Invitation
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Link
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Material
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyAnnouncementAssigneesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyAttachmentsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyCourseWorkAssigneesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyIndividualStudentsOptions
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.MultipleChoiceQuestion
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.MultipleChoiceSubmission
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Name
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Registration
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.SharedDriveFile
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.ShortAnswerSubmission
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.StateHistory
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Student
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.StudentSubmission
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.SubmissionHistory
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.Teacher
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.TimeOfDay
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.UserProfile
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.YouTubeVideo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classroom_ extends js.Object {
  var Courses: js.UndefOr[CoursesCollection] = js.native
  var Invitations: js.UndefOr[InvitationsCollection] = js.native
  var Registrations: js.UndefOr[RegistrationsCollection] = js.native
  var UserProfiles: js.UndefOr[UserProfilesCollection] = js.native
  // Create a new instance of Announcement
  def newAnnouncement(): Announcement = js.native
  // Create a new instance of Assignment
  def newAssignment(): Assignment = js.native
  // Create a new instance of AssignmentSubmission
  def newAssignmentSubmission(): AssignmentSubmission = js.native
  // Create a new instance of Attachment
  def newAttachment(): Attachment = js.native
  // Create a new instance of CloudPubsubTopic
  def newCloudPubsubTopic(): CloudPubsubTopic = js.native
  // Create a new instance of Course
  def newCourse(): Course = js.native
  // Create a new instance of CourseAlias
  def newCourseAlias(): CourseAlias = js.native
  // Create a new instance of CourseMaterial
  def newCourseMaterial(): CourseMaterial = js.native
  // Create a new instance of CourseMaterialSet
  def newCourseMaterialSet(): CourseMaterialSet = js.native
  // Create a new instance of CourseRosterChangesInfo
  def newCourseRosterChangesInfo(): CourseRosterChangesInfo = js.native
  // Create a new instance of CourseWork
  def newCourseWork(): CourseWork = js.native
  // Create a new instance of CourseWorkChangesInfo
  def newCourseWorkChangesInfo(): CourseWorkChangesInfo = js.native
  // Create a new instance of Date
  def newDate(): Date = js.native
  // Create a new instance of DriveFile
  def newDriveFile(): DriveFile = js.native
  // Create a new instance of DriveFolder
  def newDriveFolder(): DriveFolder = js.native
  // Create a new instance of Feed
  def newFeed(): Feed = js.native
  // Create a new instance of Form
  def newForm(): Form = js.native
  // Create a new instance of GlobalPermission
  def newGlobalPermission(): GlobalPermission = js.native
  // Create a new instance of GradeHistory
  def newGradeHistory(): GradeHistory = js.native
  // Create a new instance of GuardianInvitation
  def newGuardianInvitation(): GuardianInvitation = js.native
  // Create a new instance of IndividualStudentsOptions
  def newIndividualStudentsOptions(): IndividualStudentsOptions = js.native
  // Create a new instance of Invitation
  def newInvitation(): Invitation = js.native
  // Create a new instance of Link
  def newLink(): Link = js.native
  // Create a new instance of Material
  def newMaterial(): Material = js.native
  // Create a new instance of ModifyAnnouncementAssigneesRequest
  def newModifyAnnouncementAssigneesRequest(): ModifyAnnouncementAssigneesRequest = js.native
  // Create a new instance of ModifyAttachmentsRequest
  def newModifyAttachmentsRequest(): ModifyAttachmentsRequest = js.native
  // Create a new instance of ModifyCourseWorkAssigneesRequest
  def newModifyCourseWorkAssigneesRequest(): ModifyCourseWorkAssigneesRequest = js.native
  // Create a new instance of ModifyIndividualStudentsOptions
  def newModifyIndividualStudentsOptions(): ModifyIndividualStudentsOptions = js.native
  // Create a new instance of MultipleChoiceQuestion
  def newMultipleChoiceQuestion(): MultipleChoiceQuestion = js.native
  // Create a new instance of MultipleChoiceSubmission
  def newMultipleChoiceSubmission(): MultipleChoiceSubmission = js.native
  // Create a new instance of Name
  def newName(): Name = js.native
  // Create a new instance of ReclaimStudentSubmissionRequest
  def newReclaimStudentSubmissionRequest(): js.Any = js.native
  // Create a new instance of Registration
  def newRegistration(): Registration = js.native
  // Create a new instance of ReturnStudentSubmissionRequest
  def newReturnStudentSubmissionRequest(): js.Any = js.native
  // Create a new instance of SharedDriveFile
  def newSharedDriveFile(): SharedDriveFile = js.native
  // Create a new instance of ShortAnswerSubmission
  def newShortAnswerSubmission(): ShortAnswerSubmission = js.native
  // Create a new instance of StateHistory
  def newStateHistory(): StateHistory = js.native
  // Create a new instance of Student
  def newStudent(): Student = js.native
  // Create a new instance of StudentSubmission
  def newStudentSubmission(): StudentSubmission = js.native
  // Create a new instance of SubmissionHistory
  def newSubmissionHistory(): SubmissionHistory = js.native
  // Create a new instance of Teacher
  def newTeacher(): Teacher = js.native
  // Create a new instance of TimeOfDay
  def newTimeOfDay(): TimeOfDay = js.native
  // Create a new instance of TurnInStudentSubmissionRequest
  def newTurnInStudentSubmissionRequest(): js.Any = js.native
  // Create a new instance of UserProfile
  def newUserProfile(): UserProfile = js.native
  // Create a new instance of YouTubeVideo
  def newYouTubeVideo(): YouTubeVideo = js.native
}

object Classroom_ {
  @scala.inline
  def apply(
    newAnnouncement: () => Announcement,
    newAssignment: () => Assignment,
    newAssignmentSubmission: () => AssignmentSubmission,
    newAttachment: () => Attachment,
    newCloudPubsubTopic: () => CloudPubsubTopic,
    newCourse: () => Course,
    newCourseAlias: () => CourseAlias,
    newCourseMaterial: () => CourseMaterial,
    newCourseMaterialSet: () => CourseMaterialSet,
    newCourseRosterChangesInfo: () => CourseRosterChangesInfo,
    newCourseWork: () => CourseWork,
    newCourseWorkChangesInfo: () => CourseWorkChangesInfo,
    newDate: () => Date,
    newDriveFile: () => DriveFile,
    newDriveFolder: () => DriveFolder,
    newFeed: () => Feed,
    newForm: () => Form,
    newGlobalPermission: () => GlobalPermission,
    newGradeHistory: () => GradeHistory,
    newGuardianInvitation: () => GuardianInvitation,
    newIndividualStudentsOptions: () => IndividualStudentsOptions,
    newInvitation: () => Invitation,
    newLink: () => Link,
    newMaterial: () => Material,
    newModifyAnnouncementAssigneesRequest: () => ModifyAnnouncementAssigneesRequest,
    newModifyAttachmentsRequest: () => ModifyAttachmentsRequest,
    newModifyCourseWorkAssigneesRequest: () => ModifyCourseWorkAssigneesRequest,
    newModifyIndividualStudentsOptions: () => ModifyIndividualStudentsOptions,
    newMultipleChoiceQuestion: () => MultipleChoiceQuestion,
    newMultipleChoiceSubmission: () => MultipleChoiceSubmission,
    newName: () => Name,
    newReclaimStudentSubmissionRequest: () => js.Any,
    newRegistration: () => Registration,
    newReturnStudentSubmissionRequest: () => js.Any,
    newSharedDriveFile: () => SharedDriveFile,
    newShortAnswerSubmission: () => ShortAnswerSubmission,
    newStateHistory: () => StateHistory,
    newStudent: () => Student,
    newStudentSubmission: () => StudentSubmission,
    newSubmissionHistory: () => SubmissionHistory,
    newTeacher: () => Teacher,
    newTimeOfDay: () => TimeOfDay,
    newTurnInStudentSubmissionRequest: () => js.Any,
    newUserProfile: () => UserProfile,
    newYouTubeVideo: () => YouTubeVideo
  ): Classroom_ = {
    val __obj = js.Dynamic.literal(newAnnouncement = js.Any.fromFunction0(newAnnouncement), newAssignment = js.Any.fromFunction0(newAssignment), newAssignmentSubmission = js.Any.fromFunction0(newAssignmentSubmission), newAttachment = js.Any.fromFunction0(newAttachment), newCloudPubsubTopic = js.Any.fromFunction0(newCloudPubsubTopic), newCourse = js.Any.fromFunction0(newCourse), newCourseAlias = js.Any.fromFunction0(newCourseAlias), newCourseMaterial = js.Any.fromFunction0(newCourseMaterial), newCourseMaterialSet = js.Any.fromFunction0(newCourseMaterialSet), newCourseRosterChangesInfo = js.Any.fromFunction0(newCourseRosterChangesInfo), newCourseWork = js.Any.fromFunction0(newCourseWork), newCourseWorkChangesInfo = js.Any.fromFunction0(newCourseWorkChangesInfo), newDate = js.Any.fromFunction0(newDate), newDriveFile = js.Any.fromFunction0(newDriveFile), newDriveFolder = js.Any.fromFunction0(newDriveFolder), newFeed = js.Any.fromFunction0(newFeed), newForm = js.Any.fromFunction0(newForm), newGlobalPermission = js.Any.fromFunction0(newGlobalPermission), newGradeHistory = js.Any.fromFunction0(newGradeHistory), newGuardianInvitation = js.Any.fromFunction0(newGuardianInvitation), newIndividualStudentsOptions = js.Any.fromFunction0(newIndividualStudentsOptions), newInvitation = js.Any.fromFunction0(newInvitation), newLink = js.Any.fromFunction0(newLink), newMaterial = js.Any.fromFunction0(newMaterial), newModifyAnnouncementAssigneesRequest = js.Any.fromFunction0(newModifyAnnouncementAssigneesRequest), newModifyAttachmentsRequest = js.Any.fromFunction0(newModifyAttachmentsRequest), newModifyCourseWorkAssigneesRequest = js.Any.fromFunction0(newModifyCourseWorkAssigneesRequest), newModifyIndividualStudentsOptions = js.Any.fromFunction0(newModifyIndividualStudentsOptions), newMultipleChoiceQuestion = js.Any.fromFunction0(newMultipleChoiceQuestion), newMultipleChoiceSubmission = js.Any.fromFunction0(newMultipleChoiceSubmission), newName = js.Any.fromFunction0(newName), newReclaimStudentSubmissionRequest = js.Any.fromFunction0(newReclaimStudentSubmissionRequest), newRegistration = js.Any.fromFunction0(newRegistration), newReturnStudentSubmissionRequest = js.Any.fromFunction0(newReturnStudentSubmissionRequest), newSharedDriveFile = js.Any.fromFunction0(newSharedDriveFile), newShortAnswerSubmission = js.Any.fromFunction0(newShortAnswerSubmission), newStateHistory = js.Any.fromFunction0(newStateHistory), newStudent = js.Any.fromFunction0(newStudent), newStudentSubmission = js.Any.fromFunction0(newStudentSubmission), newSubmissionHistory = js.Any.fromFunction0(newSubmissionHistory), newTeacher = js.Any.fromFunction0(newTeacher), newTimeOfDay = js.Any.fromFunction0(newTimeOfDay), newTurnInStudentSubmissionRequest = js.Any.fromFunction0(newTurnInStudentSubmissionRequest), newUserProfile = js.Any.fromFunction0(newUserProfile), newYouTubeVideo = js.Any.fromFunction0(newYouTubeVideo))
    __obj.asInstanceOf[Classroom_]
  }
  @scala.inline
  implicit class Classroom_Ops[Self <: Classroom_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAnnouncement(value: () => Announcement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAnnouncement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAssignment(value: () => Assignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAssignment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAssignmentSubmission(value: () => AssignmentSubmission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAssignmentSubmission")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAttachment(value: () => Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAttachment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCloudPubsubTopic(value: () => CloudPubsubTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCloudPubsubTopic")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCourse(value: () => Course): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCourse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCourseAlias(value: () => CourseAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCourseAlias")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCourseMaterial(value: () => CourseMaterial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCourseMaterial")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCourseMaterialSet(value: () => CourseMaterialSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCourseMaterialSet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCourseRosterChangesInfo(value: () => CourseRosterChangesInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCourseRosterChangesInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCourseWork(value: () => CourseWork): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCourseWork")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCourseWorkChangesInfo(value: () => CourseWorkChangesInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCourseWorkChangesInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDate(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDriveFile(value: () => DriveFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDriveFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDriveFolder(value: () => DriveFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDriveFolder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFeed(value: () => Feed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFeed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewForm(value: () => Form): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newForm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGlobalPermission(value: () => GlobalPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGlobalPermission")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGradeHistory(value: () => GradeHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGradeHistory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGuardianInvitation(value: () => GuardianInvitation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGuardianInvitation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewIndividualStudentsOptions(value: () => IndividualStudentsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIndividualStudentsOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInvitation(value: () => Invitation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInvitation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLink(value: () => Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMaterial(value: () => Material): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMaterial")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewModifyAnnouncementAssigneesRequest(value: () => ModifyAnnouncementAssigneesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newModifyAnnouncementAssigneesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewModifyAttachmentsRequest(value: () => ModifyAttachmentsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newModifyAttachmentsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewModifyCourseWorkAssigneesRequest(value: () => ModifyCourseWorkAssigneesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newModifyCourseWorkAssigneesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewModifyIndividualStudentsOptions(value: () => ModifyIndividualStudentsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newModifyIndividualStudentsOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMultipleChoiceQuestion(value: () => MultipleChoiceQuestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMultipleChoiceQuestion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMultipleChoiceSubmission(value: () => MultipleChoiceSubmission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMultipleChoiceSubmission")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewName(value: () => Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewReclaimStudentSubmissionRequest(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newReclaimStudentSubmissionRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRegistration(value: () => Registration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRegistration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewReturnStudentSubmissionRequest(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newReturnStudentSubmissionRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSharedDriveFile(value: () => SharedDriveFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSharedDriveFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewShortAnswerSubmission(value: () => ShortAnswerSubmission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShortAnswerSubmission")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewStateHistory(value: () => StateHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStateHistory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewStudent(value: () => Student): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStudent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewStudentSubmission(value: () => StudentSubmission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStudentSubmission")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSubmissionHistory(value: () => SubmissionHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSubmissionHistory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTeacher(value: () => Teacher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTeacher")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTimeOfDay(value: () => TimeOfDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTimeOfDay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTurnInStudentSubmissionRequest(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTurnInStudentSubmissionRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserProfile(value: () => UserProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserProfile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewYouTubeVideo(value: () => YouTubeVideo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newYouTubeVideo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCourses(value: CoursesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Courses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCourses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Courses")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitations(value: InvitationsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Invitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Invitations")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrations(value: RegistrationsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Registrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Registrations")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProfiles(value: UserProfilesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfiles")(js.undefined)
        ret
    }
  }
  
}

