package typingsSlinky.kiiCloudSdk.global.KiiCloud

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiThingFields
import typingsSlinky.kiiCloudSdk.anon.`1`
import typingsSlinky.kiiCloudSdk.anon.`2`
import typingsSlinky.kiiCloudSdk.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Thing object
  */
@JSGlobal("KiiCloud.KiiThing")
@js.native
class KiiThing ()
  extends typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing
/* static members */
@JSGlobal("KiiCloud.KiiThing")
@js.native
object KiiThing extends js.Object {
  
  /**
    * Load thing with thing id given by Kii Cloud.
    * <br>This API is authorized by owner of thing.
    * <br>Need user login who owns this thing before execute this API.
    * <br>To let users to own Thing, please call {@link KiiThing#registerOwner}
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * thing id can be obtained by {@link thingID}
    *
    * @param thingID registered thing id.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is a KiiThing instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     KiiThing.loadWithThingID("thing-xxxx-yyyy",{
    *         success: function(thing) {
    *             // Load succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     KiiThing.loadWithVendorThingID("thing-xxxx-yyyy").then(
    *         function(thing) {
    *             // Load succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def loadWithThingID(thingID: String): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing] = js.native
  def loadWithThingID(thingID: String, callbacks: `1`): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing] = js.native
  
  /**
    * Load thing with given vendor thing id.
    * <br>This API is authorized by owner of thing.
    * <br>Need user login who owns this thing before execute this API.
    * <br>To let users to own Thing, please call {@link KiiThing#registerOwner}
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * @param vendorThingID registered vendor thing id.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is a KiiThing instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     KiiThing.loadWithVendorThingID("thing-xxxx-yyyy",{
    *         success: function(thing) {
    *             // Load succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     KiiThing.loadWithVendorThingID("thing-xxxx-yyyy").then(
    *         function(thing) {
    *             // Load succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def loadWithVendorThingID(vendorThingID: String): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing] = js.native
  def loadWithVendorThingID(vendorThingID: String, callbacks: `1`): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing] = js.native
  
  /**
    * Register thing in KiiCloud.<br>
    * This API doesnt require users login Anonymous user can register thing.
    * <br>
    * Propertis started with '_' in the fields is reserved by Kii Cloud.<br>
    * Those properties are indexed in Kii Cloud storage.<br>
    * Properties not started with '_' is custom properties defined by developer.<br>
    * Custom properties are not indexed in KiiCloud storage.<br>
    * Following properties are readonly and ignored on creation/{@link #update} of thing.<br>
    * '_thingID', '_created', '_accessToken' <br>
    * Following properties are readonly after creation and will be ignored on {@link #update} of thing.<br>
    * '_vendorThingID', '_password'<br>
    * As Property prefixed with '_' is reserved by Kii Cloud,
    * properties other than ones described in the parameter secion
    * and '_layoutPosition' are ignored on creation/{@link #update} of thing.<br>
    * Those ignored properties won't be removed from fields object passed as argument.
    * However it won't be reflected to fields object property of created/updated Thing.
    *
    * @param fields of the thing to be registered.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(thing). thing is a KiiThing instance.</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.target is the KiiThing instance.</li>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     KiiThing.register(
    *         {
    *             _vendorThingID: "thing-XXXX-YYYY-ZZZZZ",
    *             _password: "thing-password",
    *             _thingType: "thermometer",
    *             yourCustomObj: // Arbitrary key can be used.
    *             { // Object, Array, Number, String can be used. Should be compatible with JSON.
    *                 yourCustomKey1: "value",
    *                 yourCustomKey2: 100
    *             }
    *         },
    *         {
    *             success: function(thing) {
    *                 // Register Thing succeeded.
    *             },
    *             failure: function(error) {
    *                 // Handle error.
    *             }
    *         }
    *     );
    *
    *     // example to use Promise
    *     KiiThing.register(
    *         {
    *             _vendorThingID: "thing-XXXX-YYYY-ZZZZZ",
    *             _password: "thing-password",
    *             _thingType: "thermometer",
    *             yourCustomObj: // Arbitrary key can be used.
    *             { // Object, Array, Number, String can be used. Should be compatible with JSON.
    *                 yourCustomKey1: "value",
    *                 yourCustomKey2: 100
    *             }
    *         }
    *     ).then(
    *         function(thing) {
    *             // Register Thing succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def register(fields: KiiThingFields): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing] = js.native
  def register(fields: KiiThingFields, callbacks: `1`): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing] = js.native
  
  def registerOwnerWithThingID(thingID: String, owner: typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup] = js.native
  def registerOwnerWithThingID(thingID: String, owner: typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup, callbacks: `3`): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup] = js.native
  /**
    * Register user/group as owner of specified thing.
    * <br>Need user login before execute this API.
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * @param thingID The ID of thing
    * @param owner instance of KiiUser/KiiGroup to be registered as owner.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is an Array instance.
    *       <ul>
    *         <li>params[0] is a KiiUser/KiiGroup instance.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume thing/group is already registered.
    *     var group = KiiGroup.groupWithURI("kiicloud://groups/xxxyyyy");
    *     KiiThing.registerOwnerWithThingID("th.xxxx-yyyy-zzzz", group, {
    *         success: function(group) {
    *             // Register owner succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume thing/group is already registered.
    *     var group = KiiGroup.groupWithURI("kiicloud://groups/xxxyyyy");
    *     KiiThing.registerOwnerWithThingID("th.xxxx-yyyy-zzzz", group).then(
    *         function(params) {
    *             // Register owner succeeded.
    *             var group = params[0];
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def registerOwnerWithThingID(thingID: String, owner: typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser] = js.native
  def registerOwnerWithThingID(thingID: String, owner: typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser, callbacks: `2`): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser] = js.native
  
  def registerOwnerWithVendorThingID(vendorThingID: String, owner: typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup] = js.native
  def registerOwnerWithVendorThingID(vendorThingID: String, owner: typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup, callbacks: `3`): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup] = js.native
  /**
    * Register user/group as owner of specified thing.
    * <br>Need user login before execute this API.
    * <br>Note: if you obtain thing instance from {@link KiiAppAdminContext},
    * API is authorized by app admin.<br>
    *
    * @param vendorThingID The vendor thing ID of thing
    * @param owner instance of KiiUser/KiiGroup to be registered as owner.
    * @param callbacks object holds callback functions.
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(params). params is an Array instance.
    *       <ul>
    *         <li>params[0] is a KiiUser/KiiGroup instance.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *     // example to use callbacks directly
    *     // assume thing/group is already registered.
    *     var group = KiiGroup.groupWithURI("kiicloud://groups/xxxyyyy");
    *     KiiThing.registerOwnerWithVendorThingID("xxxx-yyyy-zzzz", group, {
    *         success: function(group) {
    *             // Register owner succeeded.
    *         },
    *         failure: function(error) {
    *             // Handle error.
    *         }
    *     });
    *
    *     // example to use Promise
    *     // assume thing/group is already registered.
    *     var group = KiiGroup.groupWithURI("kiicloud://groups/xxxyyyy");
    *     KiiThing.registerOwnerWithVendorThingID("xxxx-yyyy-zzzz", group).then(
    *         function(group) {
    *             // Register owner succeeded.
    *         },
    *         function(error) {
    *             // Handle error.
    *         }
    *     );
    */
  def registerOwnerWithVendorThingID(vendorThingID: String, owner: typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser] = js.native
  def registerOwnerWithVendorThingID(vendorThingID: String, owner: typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser, callbacks: `2`): js.Promise[typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser] = js.native
}
