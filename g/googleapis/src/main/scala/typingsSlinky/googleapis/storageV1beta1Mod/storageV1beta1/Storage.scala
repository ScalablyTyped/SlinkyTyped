package typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("googleapis/build/src/apis/storage/v1beta1", "storage_v1beta1.Storage")
@js.native
class Storage protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var bucketAccessControls: ResourceBucketaccesscontrols = js.native
  
  var buckets: ResourceBuckets = js.native
  
  var context: APIRequestContext = js.native
  
  var objectAccessControls: ResourceObjectaccesscontrols = js.native
  
  var objects: ResourceObjects = js.native
}
