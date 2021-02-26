package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageV1beta1 {
  
  @JSImport("googleapis", "storage_v1beta1.Resource$Bucketaccesscontrols")
  @js.native
  class ResourceBucketaccesscontrols protected ()
    extends typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1.ResourceBucketaccesscontrols {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1beta1.Resource$Buckets")
  @js.native
  class ResourceBuckets protected ()
    extends typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1.ResourceBuckets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1beta1.Resource$Objectaccesscontrols")
  @js.native
  class ResourceObjectaccesscontrols protected ()
    extends typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1.ResourceObjectaccesscontrols {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "storage_v1beta1.Resource$Objects")
  @js.native
  class ResourceObjects protected ()
    extends typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1.ResourceObjects {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Storage JSON API
    *
    * Lets you store and retrieve potentially-large, immutable data objects.
    *
    * @example
    * const {google} = require('googleapis');
    * const storage = google.storage('v1beta1');
    *
    * @namespace storage
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Storage
    */
  @JSImport("googleapis", "storage_v1beta1.Storage")
  @js.native
  class Storage protected ()
    extends typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1.Storage {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
