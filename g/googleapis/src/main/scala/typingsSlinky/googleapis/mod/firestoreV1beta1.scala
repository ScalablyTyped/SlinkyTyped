package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreV1beta1 {
  
  /**
    * Cloud Firestore API
    *
    * Accesses the NoSQL document database built for automatic scaling, high
    * performance, and ease of application development.
    *
    * @example
    * const {google} = require('googleapis');
    * const firestore = google.firestore('v1beta1');
    *
    * @namespace firestore
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Firestore
    */
  @JSImport("googleapis", "firestore_v1beta1.Firestore")
  @js.native
  class Firestore protected ()
    extends typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Firestore {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "firestore_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firestore_v1beta1.Resource$Projects$Databases")
  @js.native
  class ResourceProjectsDatabases protected ()
    extends typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1.ResourceProjectsDatabases {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firestore_v1beta1.Resource$Projects$Databases$Documents")
  @js.native
  class ResourceProjectsDatabasesDocuments protected ()
    extends typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1.ResourceProjectsDatabasesDocuments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firestore_v1beta1.Resource$Projects$Databases$Indexes")
  @js.native
  class ResourceProjectsDatabasesIndexes protected ()
    extends typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1.ResourceProjectsDatabasesIndexes {
    def this(context: APIRequestContext) = this()
  }
}
