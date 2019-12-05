package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typingsSlinky.instagramDashPrivateDashApi.distResponsesDirectDotRepositoryDotCreateDashGroupDashThreadDotResponseMod.DirectRepositoryCreateGroupThreadResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesDirectDotRepositoryDotGetDashPresenceDotResponseMod.DirectRepositoryGetPresenceResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesDirectDotRepositoryDotRankedDashRecipientsDotResponseMod.DirectRepositoryRankedRecipientsResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.raven
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.reshare
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/direct.repository", JSImport.Namespace)
@js.native
object distRepositoriesDirectDotRepositoryMod extends js.Object {
  @js.native
  class DirectRepository () extends Repository {
    def createGroupThread(recipientUsers: js.Array[String], threadTitle: String): js.Promise[DirectRepositoryCreateGroupThreadResponseRootObject] = js.native
    def getPresence(): js.Promise[DirectRepositoryGetPresenceResponseRootObject] = js.native
    def rankedRecipients(): js.Promise[DirectRepositoryRankedRecipientsResponseRootObject] = js.native
    @JSName("rankedRecipients")
    def rankedRecipients_raven(mode: raven): js.Promise[DirectRepositoryRankedRecipientsResponseRootObject] = js.native
    @JSName("rankedRecipients")
    def rankedRecipients_raven(mode: raven, query: String): js.Promise[DirectRepositoryRankedRecipientsResponseRootObject] = js.native
    @JSName("rankedRecipients")
    def rankedRecipients_reshare(mode: reshare): js.Promise[DirectRepositoryRankedRecipientsResponseRootObject] = js.native
    @JSName("rankedRecipients")
    def rankedRecipients_reshare(mode: reshare, query: String): js.Promise[DirectRepositoryRankedRecipientsResponseRootObject] = js.native
  }
  
}

