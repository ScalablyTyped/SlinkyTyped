package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peopleV1 {
  
  /**
    * People API
    *
    * Provides access to information about profiles and contacts.
    *
    * @example
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * @namespace people
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for People
    */
  @JSImport("googleapis", "people_v1.People")
  @js.native
  class People protected ()
    extends typingsSlinky.googleapis.peopleV1Mod.peopleV1.People {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "people_v1.Resource$Contactgroups")
  @js.native
  class ResourceContactgroups protected ()
    extends typingsSlinky.googleapis.peopleV1Mod.peopleV1.ResourceContactgroups {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "people_v1.Resource$Contactgroups$Members")
  @js.native
  class ResourceContactgroupsMembers protected ()
    extends typingsSlinky.googleapis.peopleV1Mod.peopleV1.ResourceContactgroupsMembers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "people_v1.Resource$People")
  @js.native
  class ResourcePeople protected ()
    extends typingsSlinky.googleapis.peopleV1Mod.peopleV1.ResourcePeople {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "people_v1.Resource$People$Connections")
  @js.native
  class ResourcePeopleConnections protected ()
    extends typingsSlinky.googleapis.peopleV1Mod.peopleV1.ResourcePeopleConnections {
    def this(context: APIRequestContext) = this()
  }
}
