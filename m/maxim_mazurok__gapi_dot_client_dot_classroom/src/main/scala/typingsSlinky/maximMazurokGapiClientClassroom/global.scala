package typingsSlinky.maximMazurokGapiClientClassroom

import typingsSlinky.maximMazurokGapiClientClassroom.gapi.client.classroom.CoursesResource
import typingsSlinky.maximMazurokGapiClientClassroom.gapi.client.classroom.InvitationsResource
import typingsSlinky.maximMazurokGapiClientClassroom.gapi.client.classroom.RegistrationsResource
import typingsSlinky.maximMazurokGapiClientClassroom.gapi.client.classroom.UserProfilesResource
import typingsSlinky.maximMazurokGapiClientClassroom.maximMazurokGapiClientClassroomStrings.classroom
import typingsSlinky.maximMazurokGapiClientClassroom.maximMazurokGapiClientClassroomStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Google Classroom API v1 */
      def load(name: classroom, version: v1): js.Thenable[Unit] = js.native
      def load(name: classroom, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object classroom extends js.Object {
        
        val courses: CoursesResource = js.native
        
        val invitations: InvitationsResource = js.native
        
        val registrations: RegistrationsResource = js.native
        
        val userProfiles: UserProfilesResource = js.native
      }
    }
  }
}
