package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.iobroker.anon.Channel
import typingsSlinky.iobroker.anon.Entries
import typingsSlinky.iobroker.anon.Id
import typingsSlinky.iobroker.anon.Mode
import typingsSlinky.iobroker.anon.PartialChannelCommon
import typingsSlinky.iobroker.anon.PartialObjectCommon
import typingsSlinky.iobroker.anon.PartialStateCommon
import typingsSlinky.iobroker.anon.RequestEnum
import typingsSlinky.iobroker.anon.Sorted
import typingsSlinky.iobroker.iobrokerStrings.message
import typingsSlinky.iobroker.iobrokerStrings.objectChange
import typingsSlinky.iobroker.iobrokerStrings.ready
import typingsSlinky.iobroker.iobrokerStrings.stateChange
import typingsSlinky.iobroker.iobrokerStrings.unload
import typingsSlinky.iobroker.objectsMod.global.ioBroker.ChannelObject
import typingsSlinky.iobroker.objectsMod.global.ioBroker.DeviceObject
import typingsSlinky.iobroker.objectsMod.global.ioBroker.Object
import typingsSlinky.iobroker.objectsMod.global.ioBroker.ObjectType
import typingsSlinky.iobroker.objectsMod.global.ioBroker.PartialObject
import typingsSlinky.iobroker.objectsMod.global.ioBroker.SettableObject
import typingsSlinky.iobroker.objectsMod.global.ioBroker.StateObject
import typingsSlinky.node.Buffer
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adapter extends StObject {
  
  /** path to the adapter folder */
  var adapterDir: String = js.native
  
  def addChannelToEnum(enumName: String, addTo: String, parentDevice: String, channelName: String): Unit = js.native
  def addChannelToEnum(
    enumName: String,
    addTo: String,
    parentDevice: String,
    channelName: String,
    callback: ErrorCallback
  ): Unit = js.native
  def addChannelToEnum(enumName: String, addTo: String, parentDevice: String, channelName: String, options: js.Any): Unit = js.native
  def addChannelToEnum(
    enumName: String,
    addTo: String,
    parentDevice: String,
    channelName: String,
    options: js.Any,
    callback: ErrorCallback
  ): Unit = js.native
  
  def addChannelToEnumAsync(enumName: String, addTo: String, parentDevice: String, channelName: String): js.Promise[Unit] = js.native
  def addChannelToEnumAsync(enumName: String, addTo: String, parentDevice: String, channelName: String, options: js.Any): js.Promise[Unit] = js.native
  
  def addStateToEnum(enumName: String, addTo: String, parentDevice: String, parentChannel: String, stateName: String): Unit = js.native
  def addStateToEnum(
    enumName: String,
    addTo: String,
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    callback: ErrorCallback
  ): Unit = js.native
  def addStateToEnum(
    enumName: String,
    addTo: String,
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    options: js.Any
  ): Unit = js.native
  def addStateToEnum(
    enumName: String,
    addTo: String,
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    options: js.Any,
    callback: ErrorCallback
  ): Unit = js.native
  
  def addStateToEnumAsync(enumName: String, addTo: String, parentDevice: String, parentChannel: String, stateName: String): js.Promise[Unit] = js.native
  def addStateToEnumAsync(
    enumName: String,
    addTo: String,
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    options: js.Any
  ): js.Promise[Unit] = js.native
  
  /** <INTERNAL> Determines the users permissions */
  def calculatePermissions(
    user: String,
    commandsPermissions: CommandsPermissions,
    callback: js.Function1[/* result */ PermissionSet, Unit]
  ): Unit = js.native
  def calculatePermissions(
    user: String,
    commandsPermissions: CommandsPermissions,
    options: js.Any,
    callback: js.Function1[/* result */ PermissionSet, Unit]
  ): Unit = js.native
  
  /** <INTERNAL> Determines the users permissions */
  def calculatePermissionsAsync(user: String, commandsPermissions: CommandsPermissions): js.Promise[PermissionSet] = js.native
  def calculatePermissionsAsync(user: String, commandsPermissions: CommandsPermissions, options: js.Any): js.Promise[PermissionSet] = js.native
  
  /** <INTERNAL> Checks if a user exists and is in the given group. */
  def checkGroup(user: String, group: String, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def checkGroup(user: String, group: String, options: js.Any, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  /** <INTERNAL> Checks if a user exists and is in the given group. */
  def checkGroupAsync(user: String, group: String): js.Promise[Boolean] = js.native
  def checkGroupAsync(user: String, group: String, options: js.Any): js.Promise[Boolean] = js.native
  
  // ==============================
  // GENERAL
  /** Validates username and password */
  def checkPassword(user: String, password: String, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def checkPassword(
    user: String,
    password: String,
    options: js.Any,
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
  
  /** Validates username and password */
  def checkPasswordAsync(user: String, password: String): js.Promise[Boolean] = js.native
  def checkPasswordAsync(user: String, password: String, options: js.Any): js.Promise[Boolean] = js.native
  
  /**
    * Changes access rights of all files in the adapter directory
    * @param adapter Name of the adapter instance, e.g. "admin.0". Defaults to the namespace of this adapter.
    * @param path Pattern to match the file path against
    * @param options Mode of the access change as a number or hexadecimal string
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def chmodFile(adapter: String, path: String, options: Mode, callback: ChownFileCallback): Unit = js.native
  def chmodFile(adapter: String, path: String, options: Record[String, _], callback: ChownFileCallback): Unit = js.native
  def chmodFile(adapter: Null, path: String, options: Mode, callback: ChownFileCallback): Unit = js.native
  def chmodFile(adapter: Null, path: String, options: Record[String, _], callback: ChownFileCallback): Unit = js.native
  
  def chmodFileAsync(adapter: String, path: String, options: Mode): js.Promise[Entries] = js.native
  def chmodFileAsync(adapter: String, path: String, options: Record[String, _]): js.Promise[Entries] = js.native
  def chmodFileAsync(adapter: Null, path: String, options: Mode): js.Promise[Entries] = js.native
  def chmodFileAsync(adapter: Null, path: String, options: Record[String, _]): js.Promise[Entries] = js.native
  
  def clearInterval(intervalId: Interval): Unit = js.native
  
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  
  /** common part of the adapter settings */
  var common: js.Any = js.native
  
  /** native part of the adapter settings */
  var config: AdapterConfig = js.native
  
  /** if the adapter is connected to the host */
  var connected: Boolean = js.native
  
  /** Creates an object with type channel. It must be located under a device */
  def createChannel(parentDevice: String, channelName: String): Unit = js.native
  def createChannel(parentDevice: String, channelName: String, callback: SetObjectCallback): Unit = js.native
  def createChannel(parentDevice: String, channelName: String, roleOrCommon: String): Unit = js.native
  def createChannel(parentDevice: String, channelName: String, roleOrCommon: String, callback: SetObjectCallback): Unit = js.native
  def createChannel(parentDevice: String, channelName: String, roleOrCommon: String, native: Record[String, _]): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: String,
    native: Record[String, _],
    callback: SetObjectCallback
  ): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: String,
    native: Record[String, _],
    options: js.Any
  ): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: String,
    native: Record[String, _],
    options: js.Any,
    callback: SetObjectCallback
  ): Unit = js.native
  def createChannel(parentDevice: String, channelName: String, roleOrCommon: PartialChannelCommon): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    callback: SetObjectCallback
  ): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    native: Record[String, _]
  ): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    native: Record[String, _],
    callback: SetObjectCallback
  ): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    native: Record[String, _],
    options: js.Any
  ): Unit = js.native
  def createChannel(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    native: Record[String, _],
    options: js.Any,
    callback: SetObjectCallback
  ): Unit = js.native
  
  /** Creates an object with type channel. It must be located under a device */
  def createChannelAsync(parentDevice: String, channelName: String): SetObjectPromise = js.native
  def createChannelAsync(parentDevice: String, channelName: String, roleOrCommon: String): SetObjectPromise = js.native
  def createChannelAsync(parentDevice: String, channelName: String, roleOrCommon: String, native: Record[String, _]): SetObjectPromise = js.native
  def createChannelAsync(
    parentDevice: String,
    channelName: String,
    roleOrCommon: String,
    native: Record[String, _],
    options: js.Any
  ): SetObjectPromise = js.native
  def createChannelAsync(parentDevice: String, channelName: String, roleOrCommon: PartialChannelCommon): SetObjectPromise = js.native
  def createChannelAsync(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    native: Record[String, _]
  ): SetObjectPromise = js.native
  def createChannelAsync(
    parentDevice: String,
    channelName: String,
    roleOrCommon: PartialChannelCommon,
    native: Record[String, _],
    options: js.Any
  ): SetObjectPromise = js.native
  
  // ==============================
  // devices and channels
  // tslint:disable:unified-signatures
  /** creates an object with type device */
  def createDevice(deviceName: String): Unit = js.native
  def createDevice(deviceName: String, callback: SetObjectCallback): Unit = js.native
  def createDevice(deviceName: String, common: PartialObjectCommon): Unit = js.native
  def createDevice(deviceName: String, common: PartialObjectCommon, callback: SetObjectCallback): Unit = js.native
  def createDevice(deviceName: String, common: PartialObjectCommon, native: Record[String, _]): Unit = js.native
  def createDevice(
    deviceName: String,
    common: PartialObjectCommon,
    native: Record[String, _],
    callback: SetObjectCallback
  ): Unit = js.native
  def createDevice(deviceName: String, common: PartialObjectCommon, native: Record[String, _], options: js.Any): Unit = js.native
  def createDevice(
    deviceName: String,
    common: PartialObjectCommon,
    native: Record[String, _],
    options: js.Any,
    callback: SetObjectCallback
  ): Unit = js.native
  
  /** creates an object with type device */
  def createDeviceAsync(deviceName: String): SetObjectPromise = js.native
  def createDeviceAsync(deviceName: String, common: PartialObjectCommon): SetObjectPromise = js.native
  def createDeviceAsync(deviceName: String, common: PartialObjectCommon, native: Record[String, _]): SetObjectPromise = js.native
  def createDeviceAsync(deviceName: String, common: PartialObjectCommon, native: Record[String, _], options: js.Any): SetObjectPromise = js.native
  
  /**
    * Creates a state and the corresponding object. It must be located in a channel under a device
    */
  def createState(parentDevice: String, parentChannel: String, stateName: String): Unit = js.native
  def createState(parentDevice: String, parentChannel: String, stateName: String, callback: SetObjectCallback): Unit = js.native
  def createState(parentDevice: String, parentChannel: String, stateName: String, roleOrCommon: String): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    callback: SetObjectCallback
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    native: Record[String, _]
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    native: Record[String, _],
    callback: SetObjectCallback
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    native: Record[String, _],
    options: js.Any
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    native: Record[String, _],
    options: js.Any,
    callback: SetObjectCallback
  ): Unit = js.native
  def createState(parentDevice: String, parentChannel: String, stateName: String, roleOrCommon: PartialStateCommon): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    callback: SetObjectCallback
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    native: Record[String, _]
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    native: Record[String, _],
    callback: SetObjectCallback
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    native: Record[String, _],
    options: js.Any
  ): Unit = js.native
  def createState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    native: Record[String, _],
    options: js.Any,
    callback: SetObjectCallback
  ): Unit = js.native
  
  /**
    * Creates a state and the corresponding object. It must be located in a channel under a device
    */
  def createStateAsync(parentDevice: String, parentChannel: String, stateName: String): SetObjectPromise = js.native
  def createStateAsync(parentDevice: String, parentChannel: String, stateName: String, roleOrCommon: String): SetObjectPromise = js.native
  def createStateAsync(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    native: Record[String, _]
  ): SetObjectPromise = js.native
  def createStateAsync(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: String,
    native: Record[String, _],
    options: js.Any
  ): SetObjectPromise = js.native
  def createStateAsync(parentDevice: String, parentChannel: String, stateName: String, roleOrCommon: PartialStateCommon): SetObjectPromise = js.native
  def createStateAsync(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    native: Record[String, _]
  ): SetObjectPromise = js.native
  def createStateAsync(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    roleOrCommon: PartialStateCommon,
    native: Record[String, _],
    options: js.Any
  ): SetObjectPromise = js.native
  
  /**
    * Decrypt a value that has been encrypted with the `encrypt` method
    */
  def decrypt(ciphertext: String): String = js.native
  
  /**
    * Deletes a given file
    * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
    * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
    */
  def delFile(adapterName: String, path: String, callback: ErrnoCallback): Unit = js.native
  def delFile(adapterName: String, path: String, options: js.Any, callback: ErrnoCallback): Unit = js.native
  def delFile(adapterName: Null, path: String, callback: ErrnoCallback): Unit = js.native
  def delFile(adapterName: Null, path: String, options: js.Any, callback: ErrnoCallback): Unit = js.native
  
  /**
    * Deletes a given file
    * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
    * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
    */
  def delFileAsync(adapterName: String, path: String): js.Promise[Unit] = js.native
  def delFileAsync(adapterName: String, path: String, options: js.Any): js.Promise[Unit] = js.native
  def delFileAsync(adapterName: Null, path: String): js.Promise[Unit] = js.native
  def delFileAsync(adapterName: Null, path: String, options: js.Any): js.Promise[Unit] = js.native
  
  /**
    * Deletes an object (which might not belong to this adapter) from the object db
    * @param id - The id of the object including namespace
    */
  def delForeignObject(id: String): Unit = js.native
  def delForeignObject(id: String, callback: ErrorCallback): Unit = js.native
  def delForeignObject(id: String, options: js.Any): Unit = js.native
  def delForeignObject(id: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /**
    * Deletes an object (which might not belong to this adapter) from the object db
    * @param id - The id of the object including namespace
    */
  def delForeignObjectAsync(id: String): js.Promise[Unit] = js.native
  def delForeignObjectAsync(id: String, options: js.Any): js.Promise[Unit] = js.native
  
  /** Deletes a state from the states DB, but not the associated object */
  def delForeignState(id: String): Unit = js.native
  def delForeignState(id: String, callback: ErrorCallback): Unit = js.native
  def delForeignState(id: String, options: js.Any): Unit = js.native
  def delForeignState(id: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /** Deletes a state from the states DB, but not the associated object */
  def delForeignStateAsync(id: String): js.Promise[Unit] = js.native
  def delForeignStateAsync(id: String, options: js.Any): js.Promise[Unit] = js.native
  
  /**
    * Deletes an object from the object db
    * @param id - The id of the object without namespace
    */
  def delObject(id: String): Unit = js.native
  def delObject(id: String, callback: ErrorCallback): Unit = js.native
  def delObject(id: String, options: js.Any): Unit = js.native
  def delObject(id: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /**
    * Deletes an object from the object db
    * @param id - The id of the object without namespace
    */
  def delObjectAsync(id: String): js.Promise[Unit] = js.native
  def delObjectAsync(id: String, options: js.Any): js.Promise[Unit] = js.native
  
  /** Deletes a state from the states DB, but not the associated object. Consider using @link{deleteState} instead */
  def delState(id: String): Unit = js.native
  def delState(id: String, callback: ErrorCallback): Unit = js.native
  def delState(id: String, options: js.Any): Unit = js.native
  def delState(id: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /** Deletes a state from the states DB, but not the associated object. Consider using @link{deleteState} instead */
  def delStateAsync(id: String): js.Promise[Unit] = js.native
  def delStateAsync(id: String, options: js.Any): js.Promise[Unit] = js.native
  
  /** Deletes a channel and its states. It must have been created with `createChannel` */
  def deleteChannel(channelName: String): Unit = js.native
  def deleteChannel(channelName: String, options: js.UndefOr[scala.Nothing], callback: ErrorCallback): Unit = js.native
  def deleteChannel(channelName: String, options: js.Any): Unit = js.native
  def deleteChannel(channelName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  def deleteChannel(parentDevice: String, channelName: String): Unit = js.native
  def deleteChannel(
    parentDevice: String,
    channelName: String,
    options: js.UndefOr[scala.Nothing],
    callback: ErrorCallback
  ): Unit = js.native
  def deleteChannel(parentDevice: String, channelName: String, options: js.Any): Unit = js.native
  def deleteChannel(parentDevice: String, channelName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /** Deletes a channel and its states. It must have been created with `createChannel` */
  def deleteChannelAsync(channelName: String): js.Promise[Unit] = js.native
  def deleteChannelAsync(channelName: String, options: js.Any): js.Promise[Unit] = js.native
  def deleteChannelAsync(parentDevice: String, channelName: String): js.Promise[Unit] = js.native
  def deleteChannelAsync(parentDevice: String, channelName: String, options: js.Any): js.Promise[Unit] = js.native
  
  def deleteChannelFromEnum(enumName: String, parentDevice: String, channelName: String): Unit = js.native
  def deleteChannelFromEnum(enumName: String, parentDevice: String, channelName: String, callback: ErrorCallback): Unit = js.native
  def deleteChannelFromEnum(enumName: String, parentDevice: String, channelName: String, options: js.Any): Unit = js.native
  def deleteChannelFromEnum(
    enumName: String,
    parentDevice: String,
    channelName: String,
    options: js.Any,
    callback: ErrorCallback
  ): Unit = js.native
  
  def deleteChannelFromEnumAsync(enumName: String, parentDevice: String, channelName: String): js.Promise[Unit] = js.native
  def deleteChannelFromEnumAsync(enumName: String, parentDevice: String, channelName: String, options: js.Any): js.Promise[Unit] = js.native
  
  /** deletes a device, its channels and states */
  def deleteDevice(deviceName: String): Unit = js.native
  def deleteDevice(deviceName: String, callback: ErrorCallback): Unit = js.native
  def deleteDevice(deviceName: String, options: js.Any): Unit = js.native
  def deleteDevice(deviceName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /** deletes a device, its channels and states */
  def deleteDeviceAsync(deviceName: String): js.Promise[Unit] = js.native
  def deleteDeviceAsync(deviceName: String, options: js.Any): js.Promise[Unit] = js.native
  
  def deleteState(parentChannel: String, stateName: String): Unit = js.native
  def deleteState(
    parentChannel: String,
    stateName: String,
    options: js.UndefOr[scala.Nothing],
    callback: ErrorCallback
  ): Unit = js.native
  def deleteState(parentChannel: String, stateName: String, options: js.Any): Unit = js.native
  def deleteState(parentChannel: String, stateName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  def deleteState(parentDevice: String, parentChannel: String, stateName: String): Unit = js.native
  def deleteState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    options: js.UndefOr[scala.Nothing],
    callback: ErrorCallback
  ): Unit = js.native
  def deleteState(parentDevice: String, parentChannel: String, stateName: String, options: js.Any): Unit = js.native
  def deleteState(
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    options: js.Any,
    callback: ErrorCallback
  ): Unit = js.native
  /** Deletes a state. It must have been created with `createState` */
  def deleteState(stateName: String): Unit = js.native
  def deleteState(stateName: String, options: js.UndefOr[scala.Nothing], callback: ErrorCallback): Unit = js.native
  def deleteState(stateName: String, options: js.Any): Unit = js.native
  def deleteState(stateName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  def deleteStateAsync(parentChannel: String, stateName: String): js.Promise[Unit] = js.native
  def deleteStateAsync(parentChannel: String, stateName: String, options: js.Any): js.Promise[Unit] = js.native
  def deleteStateAsync(parentDevice: String, parentChannel: String, stateName: String): js.Promise[Unit] = js.native
  def deleteStateAsync(parentDevice: String, parentChannel: String, stateName: String, options: js.Any): js.Promise[Unit] = js.native
  /** Deletes a state. It must have been created with `createState` */
  def deleteStateAsync(stateName: String): js.Promise[Unit] = js.native
  def deleteStateAsync(stateName: String, options: js.Any): js.Promise[Unit] = js.native
  
  def deleteStateFromEnum(enumName: String, parentDevice: String, parentChannel: String, stateName: String): Unit = js.native
  def deleteStateFromEnum(
    enumName: String,
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    callback: ErrorCallback
  ): Unit = js.native
  def deleteStateFromEnum(enumName: String, parentDevice: String, parentChannel: String, stateName: String, options: js.Any): Unit = js.native
  def deleteStateFromEnum(
    enumName: String,
    parentDevice: String,
    parentChannel: String,
    stateName: String,
    options: js.Any,
    callback: ErrorCallback
  ): Unit = js.native
  
  def deleteStateFromEnumAsync(enumName: String, parentDevice: String, parentChannel: String, stateName: String): js.Promise[Unit] = js.native
  def deleteStateFromEnumAsync(enumName: String, parentDevice: String, parentChannel: String, stateName: String, options: js.Any): js.Promise[Unit] = js.native
  
  /**
    * Disables and stops the adapter instance.
    * It is recommended that you leave the current method (e.g. by using `return`) after calling this.
    */
  def disable(): Unit = js.native
  
  // TODO: getCertificates cannot be represented with promises right now
  /**
    * Encrypt the given cleartext, so it can be stored securely in adapter settings.
    */
  def encrypt(cleartext: String): String = js.native
  
  /** Extend an object (which might not belong to this adapter) and create it if it might not exist */
  def extendForeignObject(id: String, objPart: PartialObject): Unit = js.native
  def extendForeignObject(id: String, objPart: PartialObject, callback: SetObjectCallback): Unit = js.native
  def extendForeignObject(id: String, objPart: PartialObject, options: js.Any): Unit = js.native
  def extendForeignObject(id: String, objPart: PartialObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
  
  /** Extend an object (which might not belong to this adapter) and create it if it might not exist */
  def extendForeignObjectAsync(id: String, objPart: PartialObject): SetObjectPromise = js.native
  def extendForeignObjectAsync(id: String, objPart: PartialObject, options: js.Any): SetObjectPromise = js.native
  
  /** Extend an object and create it if it might not exist */
  def extendObject(id: String, objPart: PartialObject): Unit = js.native
  def extendObject(id: String, objPart: PartialObject, callback: SetObjectCallback): Unit = js.native
  def extendObject(id: String, objPart: PartialObject, options: js.Any): Unit = js.native
  def extendObject(id: String, objPart: PartialObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
  
  /** Extend an object and create it if it might not exist */
  def extendObjectAsync(id: String, objPart: PartialObject): SetObjectPromise = js.native
  def extendObjectAsync(id: String, objPart: PartialObject, options: js.Any): SetObjectPromise = js.native
  
  /**
    * Finds an object by its ID or name
    * @param type - common.type of the state
    */
  def findForeignObject(idOrName: String, `type`: String, callback: FindObjectCallback): Unit = js.native
  def findForeignObject(idOrName: String, `type`: String, options: js.Any, callback: FindObjectCallback): Unit = js.native
  
  /**
    * Finds an object by its ID or name
    * @param type - common.type of the state
    */
  def findForeignObjectAsync(idOrName: String, `type`: String): js.Promise[Id] = js.native
  
  def formatDate(dateObj: String, format: String): String = js.native
  def formatDate(dateObj: String, isDuration: String, format: String): String = js.native
  def formatDate(dateObj: String, isDuration: Boolean, format: String): String = js.native
  def formatDate(dateObj: js.Date, format: String): String = js.native
  def formatDate(dateObj: js.Date, isDuration: String, format: String): String = js.native
  def formatDate(dateObj: js.Date, isDuration: Boolean, format: String): String = js.native
  def formatDate(dateObj: Double, format: String): String = js.native
  def formatDate(dateObj: Double, isDuration: String, format: String): String = js.native
  def formatDate(dateObj: Double, isDuration: Boolean, format: String): String = js.native
  
  def formatValue(value: String, decimals: Double, format: js.Any): String = js.native
  def formatValue(value: String, format: js.Any): String = js.native
  def formatValue(value: Double, decimals: Double, format: js.Any): String = js.native
  // ==============================
  // formatting
  def formatValue(value: Double, format: js.Any): String = js.native
  
  /** Get all states, channels and devices of this adapter */
  def getAdapterObjects(callback: js.Function1[/* objects */ Record[String, Object], Unit]): Unit = js.native
  
  /** Get all states, channels and devices of this adapter */
  def getAdapterObjectsAsync(): js.Promise[Record[String, Object]] = js.native
  
  /**
    * Reads a binary state from Redis
    * @param id The id of the state
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getBinaryState(id: String, callback: GetBinaryStateCallback): Unit = js.native
  def getBinaryState(id: String, options: js.Any, callback: GetBinaryStateCallback): Unit = js.native
  
  /**
    * Reads a binary state from Redis
    * @param id The id of the state
    * @param options (optional) Some internal options.
    */
  def getBinaryStateAsync(id: String): GetBinaryStatePromise = js.native
  def getBinaryStateAsync(id: String, options: js.Any): GetBinaryStatePromise = js.native
  
  /** Returns SSL certificates by name (private key, public cert and chained certificate) for creation of HTTPS servers */
  def getCertificates(
    publicName: String,
    privateName: String,
    chainedName: String,
    callback: js.Function3[
      /* err */ js.UndefOr[js.Error | Null], 
      /* certs */ js.UndefOr[Certificates], 
      /* useLetsEncryptCert */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Returns a list of all channels in this adapter instance
    * @param parentDevice (optional) Name of the parent device to filter the channels by
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getChannels(callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
  def getChannels(parentDevice: String, callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
  def getChannels(parentDevice: String, options: js.Any, callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
  
  /**
    * Returns a list of all channels in this adapter instance
    * @param parentDevice (optional) Name of the parent device to filter the channels by
    * @param options (optional) Some internal options.
    */
  def getChannelsAsync(): js.Promise[js.Array[ChannelObject]] = js.native
  // tslint:disable-next-line:unified-signatures
  def getChannelsAsync(parentDevice: String): js.Promise[js.Array[ChannelObject]] = js.native
  def getChannelsAsync(parentDevice: String, options: js.Any): js.Promise[js.Array[ChannelObject]] = js.native
  
  /**
    * Returns a list of all channels in this adapter instance
    * @param parentDevice (optional) Name of the parent device to filter the channels by
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getChannelsOf(callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
  def getChannelsOf(parentDevice: String, callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
  def getChannelsOf(parentDevice: String, options: js.Any, callback: GetObjectsCallback3[ChannelObject]): Unit = js.native
  
  /**
    * Returns a list of all channels in this adapter instance
    * @param parentDevice (optional) Name of the parent device to filter the channels by
    * @param options (optional) Some internal options.
    */
  def getChannelsOfAsync(): js.Promise[js.Array[ChannelObject]] = js.native
  // tslint:disable-next-line:unified-signatures
  def getChannelsOfAsync(parentDevice: String): js.Promise[js.Array[ChannelObject]] = js.native
  def getChannelsOfAsync(parentDevice: String, options: js.Any): js.Promise[js.Array[ChannelObject]] = js.native
  
  // tslint:enable:unified-signatures
  /**
    * Returns a list of all devices in this adapter instance
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getDevices(callback: GetObjectsCallback3[DeviceObject]): Unit = js.native
  def getDevices(options: js.Any, callback: GetObjectsCallback3[DeviceObject]): Unit = js.native
  
  /**
    * Returns a list of all devices in this adapter instance
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getDevicesAsync(): js.Promise[js.Array[DeviceObject]] = js.native
  def getDevicesAsync(options: js.Any): js.Promise[js.Array[DeviceObject]] = js.native
  
  // ==============================
  // enums
  /** Returns the enum tree, filtered by the optional enum name */
  def getEnum(callback: GetEnumCallback): Unit = js.native
  def getEnum(name: String, callback: GetEnumCallback): Unit = js.native
  def getEnum(name: String, options: js.Any, callback: GetEnumCallback): Unit = js.native
  
  /** Returns the enum tree, filtered by the optional enum name */
  def getEnumAsync(name: String): js.Promise[RequestEnum] = js.native
  def getEnumAsync(name: String, options: js.Any): js.Promise[RequestEnum] = js.native
  
  /** Returns the enum tree, filtered by the optional enum name */
  def getEnums(callback: GetEnumsCallback): Unit = js.native
  def getEnums(enumList: EnumList, callback: GetEnumsCallback): Unit = js.native
  def getEnums(enumList: EnumList, options: js.Any, callback: GetEnumsCallback): Unit = js.native
  
  /** Returns the enum tree, filtered by the optional enum name */
  def getEnumsAsync(enumList: EnumList): GetEnumsPromise = js.native
  def getEnumsAsync(enumList: EnumList, options: js.Any): GetEnumsPromise = js.native
  
  // ==============================
  // foreign objects
  /** Reads an object (which might not belong to this adapter) from the object db */
  def getForeignObject(id: String, callback: GetObjectCallback): Unit = js.native
  def getForeignObject(id: String, options: js.Any, callback: GetObjectCallback): Unit = js.native
  
  /** Reads an object (which might not belong to this adapter) from the object db */
  def getForeignObjectAsync(id: String): GetObjectPromise = js.native
  def getForeignObjectAsync(id: String, options: js.Any): GetObjectPromise = js.native
  
  /** Get foreign objects by pattern, by specific type and resolve their enums. */
  // tslint:disable:unified-signatures
  def getForeignObjects(pattern: String, callback: GetObjectsCallback): Unit = js.native
  def getForeignObjects(pattern: String, options: js.Any, callback: GetObjectsCallback): Unit = js.native
  def getForeignObjects(pattern: String, `type`: ObjectType, callback: GetObjectsCallback): Unit = js.native
  def getForeignObjects(pattern: String, `type`: ObjectType, enums: EnumList, callback: GetObjectsCallback): Unit = js.native
  def getForeignObjects(
    pattern: String,
    `type`: ObjectType,
    enums: EnumList,
    options: js.Any,
    callback: GetObjectsCallback
  ): Unit = js.native
  def getForeignObjects(pattern: String, `type`: ObjectType, options: js.Any, callback: GetObjectsCallback): Unit = js.native
  
  // tslint:enable:unified-signatures
  /** Get foreign objects by pattern, by specific type and resolve their enums. */
  def getForeignObjectsAsync(pattern: String): GetObjectsPromise = js.native
  def getForeignObjectsAsync(pattern: String, options: js.Any): GetObjectsPromise = js.native
  def getForeignObjectsAsync(pattern: String, `type`: ObjectType): GetObjectsPromise = js.native
  def getForeignObjectsAsync(pattern: String, `type`: ObjectType, enums: EnumList): GetObjectsPromise = js.native
  def getForeignObjectsAsync(pattern: String, `type`: ObjectType, enums: EnumList, options: js.Any): GetObjectsPromise = js.native
  def getForeignObjectsAsync(pattern: String, `type`: ObjectType, options: js.Any): GetObjectsPromise = js.native
  
  /** Read a value (which might not belong to this adapter) from the states DB. */
  def getForeignState(id: String, callback: GetStateCallback): Unit = js.native
  def getForeignState(id: String, options: js.Any, callback: GetStateCallback): Unit = js.native
  
  /** Read a value (which might not belong to this adapter) from the states DB. */
  def getForeignStateAsync(id: String): GetStatePromise = js.native
  def getForeignStateAsync(id: String, options: js.Any): GetStatePromise = js.native
  
  /** Read all states (which might not belong to this adapter) which match the given pattern */
  def getForeignStates(pattern: String, callback: GetStatesCallback): Unit = js.native
  def getForeignStates(pattern: String, options: js.Any, callback: GetStatesCallback): Unit = js.native
  
  /** Read all states (which might not belong to this adapter) which match the given pattern */
  def getForeignStatesAsync(pattern: String): GetStatesPromise = js.native
  def getForeignStatesAsync(pattern: String, options: js.Any): GetStatesPromise = js.native
  
  def getHistory(id: String, options: GetHistoryOptions, callback: GetHistoryCallback): Unit = js.native
  
  // ==============================
  // own objects
  /** Reads an object from the object db */
  def getObject(id: String, callback: GetObjectCallback): Unit = js.native
  def getObject(id: String, options: js.Any, callback: GetObjectCallback): Unit = js.native
  
  /** Reads an object from the object db */
  def getObjectAsync(id: String): GetObjectPromise = js.native
  def getObjectAsync(id: String, options: js.Any): GetObjectPromise = js.native
  
  def getObjectList(params: Null, callback: GetObjectListCallback): Unit = js.native
  def getObjectList(params: Null, options: Sorted, callback: GetObjectListCallback): Unit = js.native
  def getObjectList(params: Null, options: Record[String, _], callback: GetObjectListCallback): Unit = js.native
  /**
    * Returns a list of objects with id between params.startkey and params.endkey
    * @param params Parameters determining the objects included in the return list. Null to include all objects
    * @param options If the returned list should be sorted. And some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getObjectList(params: GetObjectListParams, callback: GetObjectListCallback): Unit = js.native
  def getObjectList(params: GetObjectListParams, options: Sorted, callback: GetObjectListCallback): Unit = js.native
  def getObjectList(params: GetObjectListParams, options: Record[String, _], callback: GetObjectListCallback): Unit = js.native
  
  /**
    * Returns a list of objects with id between params.startkey and params.endkey
    * @param params Parameters determining the objects included in the return list. Null to include all objects
    * @param options If the returned list should be sorted. And some internal options.
    */
  def getObjectListAsync(): GetObjectListPromise = js.native
  def getObjectListAsync(params: Null, options: Sorted): GetObjectListPromise = js.native
  def getObjectListAsync(params: Null, options: Record[String, _]): GetObjectListPromise = js.native
  def getObjectListAsync(params: GetObjectListParams): GetObjectListPromise = js.native
  def getObjectListAsync(params: GetObjectListParams, options: Sorted): GetObjectListPromise = js.native
  def getObjectListAsync(params: GetObjectListParams, options: Record[String, _]): GetObjectListPromise = js.native
  
  def getObjectView(design: String, search: String, params: js.UndefOr[scala.Nothing], callback: GetObjectViewCallback): Unit = js.native
  def getObjectView(
    design: String,
    search: String,
    params: js.UndefOr[scala.Nothing],
    options: js.Any,
    callback: GetObjectViewCallback
  ): Unit = js.native
  def getObjectView(design: String, search: String, params: Null, callback: GetObjectViewCallback): Unit = js.native
  def getObjectView(design: String, search: String, params: Null, options: js.Any, callback: GetObjectViewCallback): Unit = js.native
  /**
    * Query a predefined object view (similar to SQL stored procedures) and return the results
    * For a detailed description refer to https://github.com/ioBroker/ioBroker/wiki/Adapter-Development-Documentation#object-fields
    * or http://guide.couchdb.org/editions/1/en/views.html
    * @param design The namespace of the object view, as defined in io-package.json. Usually the adapter name, e.g. "hm-rpc"
    * @param search The name of the object view.
    * @param params Parameters to additionally filter out objects from the return list. Null to include all objects
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getObjectView(design: String, search: String, params: GetObjectViewParams, callback: GetObjectViewCallback): Unit = js.native
  def getObjectView(
    design: String,
    search: String,
    params: GetObjectViewParams,
    options: js.Any,
    callback: GetObjectViewCallback
  ): Unit = js.native
  
  /**
    * Query a predefined object view (similar to SQL stored procedures) and return the results
    * For a detailed description refer to https://github.com/ioBroker/ioBroker/wiki/Adapter-Development-Documentation#object-fields
    * or http://guide.couchdb.org/editions/1/en/views.html
    * @param design The namespace of the object view, as defined in io-package.json. Usually the adapter name, e.g. "hm-rpc"
    * @param search The name of the object view.
    * @param params Parameters to additionally filter out objects from the return list. Null to include all objects
    * @param options (optional) Some internal options.
    */
  def getObjectViewAsync(design: String, search: String): GetObjectViewPromise = js.native
  def getObjectViewAsync(design: String, search: String, params: js.UndefOr[scala.Nothing], options: js.Any): GetObjectViewPromise = js.native
  def getObjectViewAsync(design: String, search: String, params: Null, options: js.Any): GetObjectViewPromise = js.native
  def getObjectViewAsync(design: String, search: String, params: GetObjectViewParams): GetObjectViewPromise = js.native
  def getObjectViewAsync(design: String, search: String, params: GetObjectViewParams, options: js.Any): GetObjectViewPromise = js.native
  
  /**
    * Returns the configuration for a loaded plugin
    * @param name The name of the plugin
    * @returns The plugin configuration or null if it is not existent or not active
    */
  def getPluginConfig(name: String): (Record[String, _]) | Null = js.native
  
  /**
    * Returns an instance of a loaded plugin
    * @param name The name of the plugin
    * @returns The plugin instance or null if it is not existent or not active
    */
  def getPluginInstance(name: String): Plugin | Null = js.native
  
  /*    ===============================
    Functions defined in adapter.js
    =============================== */
  /**
    * Helper function that looks for first free TCP port starting with the given one.
    * @param port - The port to start with
    * @param callback - gets called when a free port is found
    */
  def getPort(port: Double, callback: js.Function1[/* port */ Double, Unit]): Unit = js.native
  
  /**
    * Helper function that looks for first free TCP port starting with the given one.
    * @param port - The port to start with
    */
  def getPortAsync(port: Double): js.Promise[Double] = js.native
  
  // tslint:enable:unified-signatures
  /** Read a value from the states DB. */
  def getState(id: String, callback: GetStateCallback): Unit = js.native
  def getState(id: String, options: js.Any, callback: GetStateCallback): Unit = js.native
  
  /** Read a value from the states DB. */
  def getStateAsync(id: String): GetStatePromise = js.native
  def getStateAsync(id: String, options: js.Any): GetStatePromise = js.native
  
  /** Read all states of this adapter which match the given pattern */
  def getStates(pattern: String, callback: GetStatesCallback): Unit = js.native
  def getStates(pattern: String, options: js.Any, callback: GetStatesCallback): Unit = js.native
  
  /** Read all states of this adapter which match the given pattern */
  def getStatesAsync(pattern: String): GetStatesPromise = js.native
  def getStatesAsync(pattern: String, options: js.Any): GetStatesPromise = js.native
  
  /**
    * Returns a list of all states in this adapter instance
    * @param parentDevice (optional) Name of the parent device to filter the channels by
    * @param parentChannel (optional) Name of the parent channel to filter the channels by
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getStatesOf(callback: GetObjectsCallback3[StateObject]): Unit = js.native
  def getStatesOf(parentDevice: String, callback: GetObjectsCallback3[StateObject]): Unit = js.native
  def getStatesOf(parentDevice: String, parentChannel: String, callback: GetObjectsCallback3[StateObject]): Unit = js.native
  def getStatesOf(
    parentDevice: String,
    parentChannel: String,
    options: js.Any,
    callback: GetObjectsCallback3[StateObject]
  ): Unit = js.native
  
  /**
    * Returns a list of all states in this adapter instance
    * @param parentDevice (optional) Name of the parent device to filter the channels by
    * @param parentChannel (optional) Name of the parent channel to filter the channels by
    * @param options (optional) Some internal options.
    */
  // tslint:disable:unified-signatures
  def getStatesOfAsync(): js.Promise[js.Array[StateObject]] = js.native
  def getStatesOfAsync(parentDevice: String): js.Promise[js.Array[StateObject]] = js.native
  def getStatesOfAsync(parentDevice: String, parentChannel: String): js.Promise[js.Array[StateObject]] = js.native
  def getStatesOfAsync(parentDevice: String, parentChannel: String, options: js.Any): js.Promise[js.Array[StateObject]] = js.native
  
  /** The name of the host where the adapter is running */
  var host: String = js.native
  
  /** Convert ID to {device: D, channel: C, state: S} */
  def idToDCS(id: String): Channel = js.native
  
  /** instance number of this adapter instance */
  var instance: Double = js.native
  
  /** content of io-package.json */
  var ioPack: js.Any = js.native
  
  /** access to the logging functions */
  var log: Logger = js.native
  
  def mkDir(adapterName: String, path: String, callback: ErrnoCallback): Unit = js.native
  def mkDir(adapterName: String, path: String, options: js.Any, callback: ErrnoCallback): Unit = js.native
  def mkDir(adapterName: Null, path: String, callback: ErrnoCallback): Unit = js.native
  def mkDir(adapterName: Null, path: String, options: js.Any, callback: ErrnoCallback): Unit = js.native
  
  def mkDirAsync(adapterName: String, path: String): js.Promise[Unit] = js.native
  def mkDirAsync(adapterName: String, path: String, options: js.Any): js.Promise[Unit] = js.native
  def mkDirAsync(adapterName: Null, path: String): js.Promise[Unit] = js.native
  def mkDirAsync(adapterName: Null, path: String, options: js.Any): js.Promise[Unit] = js.native
  
  /** The name of the adapter */
  var name: String = js.native
  
  /** Namespace of adapter objects: "<name>.<instance>" */
  val namespace: String = js.native
  
  /**
    * Contains a live cache of the adapter's objects.
    *
    * NOTE: This is only defined if the adapter was initialized with the option `objects: true`.
    */
  var oObjects: js.UndefOr[Record[String, js.UndefOr[Object]]] = js.native
  
  /**
    * Contains a live cache of the adapter's states.
    *
    * NOTE: This is only defined if the adapter was initialized with the option `states: true`.
    */
  var oStates: js.UndefOr[Record[String, js.UndefOr[State]]] = js.native
  
  @JSName("on")
  def on_message(event: message, handler: MessageHandler): this.type = js.native
  @JSName("on")
  def on_objectChange(event: objectChange, handler: ObjectChangeHandler): this.type = js.native
  // =============================================
  // Events exposed through EventEmitter interface
  // =============================================
  @JSName("on")
  def on_ready(event: ready, handler: ReadyHandler): this.type = js.native
  @JSName("on")
  def on_stateChange(event: stateChange, handler: StateChangeHandler): this.type = js.native
  @JSName("on")
  def on_unload(event: unload, handler: UnloadHandler): this.type = js.native
  
  /** content of package.json */
  var pack: js.Any = js.native
  
  // tslint:enable:unified-signatures
  // ==============================
  // filesystem
  /**
    * reads the content of directory from DB for given adapter and path
    * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
    * @param path - path to directory without adapter name. E.g. If you want to read "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
    */
  def readDir(adapterName: String, path: String, callback: ReadDirCallback): Unit = js.native
  def readDir(adapterName: String, path: String, options: js.Any, callback: ReadDirCallback): Unit = js.native
  def readDir(adapterName: Null, path: String, callback: ReadDirCallback): Unit = js.native
  def readDir(adapterName: Null, path: String, options: js.Any, callback: ReadDirCallback): Unit = js.native
  
  /**
    * reads the content of directory from DB for given adapter and path
    * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
    * @param path - path to directory without adapter name. E.g. If you want to read "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
    */
  def readDirAsync(adapterName: String, path: String): ReadDirPromise = js.native
  def readDirAsync(adapterName: String, path: String, options: js.Any): ReadDirPromise = js.native
  def readDirAsync(adapterName: Null, path: String): ReadDirPromise = js.native
  def readDirAsync(adapterName: Null, path: String, options: js.Any): ReadDirPromise = js.native
  
  def readFile(adapterName: String, path: String, callback: ReadFileCallback): Unit = js.native
  def readFile(adapterName: String, path: String, options: js.Any, callback: ReadFileCallback): Unit = js.native
  def readFile(adapterName: Null, path: String, callback: ReadFileCallback): Unit = js.native
  def readFile(adapterName: Null, path: String, options: js.Any, callback: ReadFileCallback): Unit = js.native
  
  def readFileAsync(adapterName: String, path: String): ReadFilePromise = js.native
  def readFileAsync(adapterName: String, path: String, options: js.Any): ReadFilePromise = js.native
  def readFileAsync(adapterName: Null, path: String): ReadFilePromise = js.native
  def readFileAsync(adapterName: Null, path: String, options: js.Any): ReadFilePromise = js.native
  
  def removeAllListeners(): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_message(event: message): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_objectChange(event: objectChange): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_ready(event: ready): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_stateChange(event: stateChange): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_unload(event: unload): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_message(event: message, handler: MessageHandler): this.type = js.native
  @JSName("removeListener")
  def removeListener_objectChange(event: objectChange, handler: ObjectChangeHandler): this.type = js.native
  // The error event handler can not be attached later
  @JSName("removeListener")
  def removeListener_ready(event: ready, handler: ReadyHandler): this.type = js.native
  @JSName("removeListener")
  def removeListener_stateChange(event: stateChange, handler: StateChangeHandler): this.type = js.native
  @JSName("removeListener")
  def removeListener_unload(event: unload, handler: UnloadHandler): this.type = js.native
  
  def rename(adapterName: String, oldName: String, newName: String, callback: ErrnoCallback): Unit = js.native
  def rename(adapterName: String, oldName: String, newName: String, options: js.Any, callback: ErrnoCallback): Unit = js.native
  def rename(adapterName: Null, oldName: String, newName: String, callback: ErrnoCallback): Unit = js.native
  def rename(adapterName: Null, oldName: String, newName: String, options: js.Any, callback: ErrnoCallback): Unit = js.native
  
  def renameAsync(adapterName: String, oldName: String, newName: String): js.Promise[Unit] = js.native
  def renameAsync(adapterName: String, oldName: String, newName: String, options: js.Any): js.Promise[Unit] = js.native
  def renameAsync(adapterName: Null, oldName: String, newName: String): js.Promise[Unit] = js.native
  def renameAsync(adapterName: Null, oldName: String, newName: String, options: js.Any): js.Promise[Unit] = js.native
  
  /** Restarts the adapter */
  def restart(): scala.Nothing = js.native
  
  def sendTo(instanceName: String, command: String, message: MessagePayload): Unit = js.native
  def sendTo(instanceName: String, command: String, message: MessagePayload, callback: MessageCallback): Unit = js.native
  def sendTo(instanceName: String, command: String, message: MessagePayload, callback: MessageCallbackInfo): Unit = js.native
  /**
    * Sends a message to a specific instance or all instances of some specific adapter.
    * @param instanceName The instance to send this message to.
    * If the ID of an instance is given (e.g. "admin.0"), only this instance will receive the message.
    * If the name of an adapter is given (e.g. "admin"), all instances of this adapter will receive it.
    * @param command (optional) Command name of the target instance. Default: "send"
    * @param message The message (e.g. params) to send.
    */
  def sendTo(instanceName: String, message: MessagePayload): Unit = js.native
  def sendTo(instanceName: String, message: MessagePayload, callback: MessageCallback): Unit = js.native
  def sendTo(instanceName: String, message: MessagePayload, callback: MessageCallbackInfo): Unit = js.native
  
  def sendToAsync(instanceName: String, command: String, message: MessagePayload): js.Promise[js.UndefOr[Message]] = js.native
  /**
    * Sends a message to a specific instance or all instances of some specific adapter.
    * @param instanceName The instance to send this message to.
    * If the ID of an instance is given (e.g. "admin.0"), only this instance will receive the message.
    * If the name of an adapter is given (e.g. "admin"), all instances of this adapter will receive it.
    * @param command (optional) Command name of the target instance. Default: "send"
    * @param message The message (e.g. params) to send.
    */
  def sendToAsync(instanceName: String, message: MessagePayload): js.Promise[js.UndefOr[Message]] = js.native
  
  def sendToHost(hostName: String, command: String, message: MessagePayload): Unit = js.native
  def sendToHost(hostName: String, command: String, message: MessagePayload, callback: MessageCallback): Unit = js.native
  def sendToHost(hostName: String, command: String, message: MessagePayload, callback: MessageCallbackInfo): Unit = js.native
  /**
    * Sends a message to a specific host or all hosts.
    */
  def sendToHost(hostName: String, message: MessagePayload): Unit = js.native
  def sendToHost(hostName: String, message: MessagePayload, callback: MessageCallback): Unit = js.native
  def sendToHost(hostName: String, message: MessagePayload, callback: MessageCallbackInfo): Unit = js.native
  
  def sendToHostAsync(hostName: String, command: String, message: MessagePayload): js.Promise[js.UndefOr[Message]] = js.native
  /**
    * Sends a message to a specific host or all hosts.
    */
  def sendToHostAsync(hostName: String, message: MessagePayload): js.Promise[js.UndefOr[Message]] = js.native
  
  // TODO: getHistoryAsync
  // MISSING:
  // pushFifo and similar https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/adapter.js#L4105
  // logRedirect https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/adapter.js#L4294
  // requireLog https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/adapter.js#L4336
  // processLog https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/adapter.js#L4360
  /**
    * Writes a binary state into Redis
    * @param id The id of the state
    * @param binary The data to be written
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def setBinaryState(id: String, binary: Buffer, callback: SetStateCallback): Unit = js.native
  def setBinaryState(id: String, binary: Buffer, options: js.Any, callback: SetStateCallback): Unit = js.native
  
  /**
    * Writes a binary state into Redis
    * @param id The id of the state
    * @param binary The data to be written
    * @param options (optional) Some internal options.
    */
  def setBinaryStateAsync(id: String, binary: Buffer): SetStatePromise = js.native
  def setBinaryStateAsync(id: String, binary: Buffer, options: js.Any): SetStatePromise = js.native
  
  /** Creates or overwrites an object (which might not belong to this adapter) in the object db */
  def setForeignObject(id: String, obj: SettableObject): Unit = js.native
  def setForeignObject(id: String, obj: SettableObject, callback: SetObjectCallback): Unit = js.native
  def setForeignObject(id: String, obj: SettableObject, options: js.Any): Unit = js.native
  def setForeignObject(id: String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
  
  /** Creates or overwrites an object (which might not belong to this adapter) in the object db */
  def setForeignObjectAsync(id: String, obj: SettableObject): SetObjectPromise = js.native
  def setForeignObjectAsync(id: String, obj: SettableObject, options: js.Any): SetObjectPromise = js.native
  
  /** Creates an object (which might not belong to this adapter) in the object db. Existing objects are not overwritten. */
  def setForeignObjectNotExists(id: String, obj: SettableObject): Unit = js.native
  def setForeignObjectNotExists(id: String, obj: SettableObject, callback: SetObjectCallback): Unit = js.native
  def setForeignObjectNotExists(id: String, obj: SettableObject, options: js.Any): Unit = js.native
  def setForeignObjectNotExists(id: String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
  
  /** Creates an object (which might not belong to this adapter) in the object db. Existing objects are not overwritten. */
  def setForeignObjectNotExistsAsync(id: String, obj: SettableObject): SetObjectPromise = js.native
  def setForeignObjectNotExistsAsync(id: String, obj: SettableObject, options: js.Any): SetObjectPromise = js.native
  
  /** Writes a value (which might not belong to this adapter) into the states DB. */
  def setForeignState(id: String): Unit = js.native
  def setForeignState(id: String, state: String): Unit = js.native
  def setForeignState(id: String, state: String, ack: Boolean): Unit = js.native
  def setForeignState(id: String, state: String, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: String, ack: Boolean, options: js.Any): Unit = js.native
  def setForeignState(id: String, state: String, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: String, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: String, options: js.Any): Unit = js.native
  def setForeignState(id: String, state: String, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: Boolean): Unit = js.native
  def setForeignState(id: String, state: Boolean, ack: Boolean): Unit = js.native
  def setForeignState(id: String, state: Boolean, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: Boolean, ack: Boolean, options: js.Any): Unit = js.native
  def setForeignState(id: String, state: Boolean, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: Boolean, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: Boolean, options: js.Any): Unit = js.native
  def setForeignState(id: String, state: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: Double): Unit = js.native
  def setForeignState(id: String, state: Double, ack: Boolean): Unit = js.native
  def setForeignState(id: String, state: Double, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: Double, ack: Boolean, options: js.Any): Unit = js.native
  def setForeignState(id: String, state: Double, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: Double, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: Double, options: js.Any): Unit = js.native
  def setForeignState(id: String, state: Double, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: Null, ack: Boolean): Unit = js.native
  def setForeignState(id: String, state: Null, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: Null, ack: Boolean, options: js.Any): Unit = js.native
  def setForeignState(id: String, state: Null, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: Null, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: Null, options: js.Any): Unit = js.native
  def setForeignState(id: String, state: Null, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: SettableState): Unit = js.native
  def setForeignState(id: String, state: SettableState, ack: Boolean): Unit = js.native
  def setForeignState(id: String, state: SettableState, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: SettableState, ack: Boolean, options: js.Any): Unit = js.native
  def setForeignState(id: String, state: SettableState, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: SettableState, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: SettableState, options: js.Any): Unit = js.native
  def setForeignState(id: String, state: SettableState, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: State): Unit = js.native
  def setForeignState(id: String, state: State, ack: Boolean): Unit = js.native
  def setForeignState(id: String, state: State, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: State, ack: Boolean, options: js.Any): Unit = js.native
  def setForeignState(id: String, state: State, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: State, callback: SetStateCallback): Unit = js.native
  def setForeignState(id: String, state: State, options: js.Any): Unit = js.native
  def setForeignState(id: String, state: State, options: js.Any, callback: SetStateCallback): Unit = js.native
  
  /** Writes a value (which might not belong to this adapter) into the states DB. */
  def setForeignStateAsync(id: String): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: String): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: String, ack: Boolean): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: String, ack: Boolean, options: js.Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: String, options: js.Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: Boolean): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: Boolean, ack: Boolean): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: Boolean, ack: Boolean, options: js.Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: Boolean, options: js.Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: Double): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: Double, ack: Boolean): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: Double, ack: Boolean, options: js.Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: Double, options: js.Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: Null, ack: Boolean): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: Null, ack: Boolean, options: js.Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: Null, options: js.Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: SettableState): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: SettableState, ack: Boolean): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: SettableState, ack: Boolean, options: js.Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: SettableState, options: js.Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: State): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: State, ack: Boolean): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: State, ack: Boolean, options: js.Any): SetStatePromise = js.native
  def setForeignStateAsync(id: String, state: State, options: js.Any): SetStatePromise = js.native
  
  /** Writes a value (which might not belong to this adapter) into the states DB only if it has changed. */
  def setForeignStateChanged(id: String): Unit = js.native
  def setForeignStateChanged(id: String, state: String): Unit = js.native
  def setForeignStateChanged(id: String, state: String, ack: Boolean): Unit = js.native
  def setForeignStateChanged(id: String, state: String, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: String, ack: Boolean, options: js.Any): Unit = js.native
  def setForeignStateChanged(id: String, state: String, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: String, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: String, options: js.Any): Unit = js.native
  def setForeignStateChanged(id: String, state: String, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: Boolean): Unit = js.native
  def setForeignStateChanged(id: String, state: Boolean, ack: Boolean): Unit = js.native
  def setForeignStateChanged(id: String, state: Boolean, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: Boolean, ack: Boolean, options: js.Any): Unit = js.native
  def setForeignStateChanged(id: String, state: Boolean, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: Boolean, options: js.Any): Unit = js.native
  def setForeignStateChanged(id: String, state: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: Double): Unit = js.native
  def setForeignStateChanged(id: String, state: Double, ack: Boolean): Unit = js.native
  def setForeignStateChanged(id: String, state: Double, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: Double, ack: Boolean, options: js.Any): Unit = js.native
  def setForeignStateChanged(id: String, state: Double, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: Double, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: Double, options: js.Any): Unit = js.native
  def setForeignStateChanged(id: String, state: Double, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: Null, ack: Boolean): Unit = js.native
  def setForeignStateChanged(id: String, state: Null, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: Null, ack: Boolean, options: js.Any): Unit = js.native
  def setForeignStateChanged(id: String, state: Null, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: Null, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: Null, options: js.Any): Unit = js.native
  def setForeignStateChanged(id: String, state: Null, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, ack: Boolean): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, ack: Boolean, options: js.Any): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, options: js.Any): Unit = js.native
  def setForeignStateChanged(id: String, state: SettableState, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: State): Unit = js.native
  def setForeignStateChanged(id: String, state: State, ack: Boolean): Unit = js.native
  def setForeignStateChanged(id: String, state: State, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: State, ack: Boolean, options: js.Any): Unit = js.native
  def setForeignStateChanged(id: String, state: State, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: State, callback: SetStateChangedCallback): Unit = js.native
  def setForeignStateChanged(id: String, state: State, options: js.Any): Unit = js.native
  def setForeignStateChanged(id: String, state: State, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  
  /** Writes a value (which might not belong to this adapter) into the states DB only if it has changed. */
  def setForeignStateChangedAsync(id: String): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: String): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: String, ack: Boolean): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: String, ack: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: String, options: js.Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: Boolean): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: Boolean, ack: Boolean): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: Boolean, ack: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: Double): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: Double, ack: Boolean): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: Double, ack: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: Double, options: js.Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: Null, ack: Boolean): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: Null, ack: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: Null, options: js.Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: SettableState): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: SettableState, ack: Boolean): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: SettableState, ack: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: SettableState, options: js.Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: State): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: State, ack: Boolean): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: State, ack: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setForeignStateChangedAsync(id: String, state: State, options: js.Any): SetStateChangedPromise = js.native
  
  /** Creates an interval that can automatically be cleared when the adapter is terminated */
  def setInterval[T /* <: js.Array[_] */](
    callback: js.Function1[/* args */ T, Unit],
    ms: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Interval = js.native
  
  /** Creates or overwrites an object in the object db */
  def setObject(id: String, obj: SettableObject): Unit = js.native
  def setObject(id: String, obj: SettableObject, callback: SetObjectCallback): Unit = js.native
  def setObject(id: String, obj: SettableObject, options: js.Any): Unit = js.native
  def setObject(id: String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
  
  /** Creates or overwrites an object in the object db */
  def setObjectAsync(id: String, obj: SettableObject): SetObjectPromise = js.native
  def setObjectAsync(id: String, obj: SettableObject, options: js.Any): SetObjectPromise = js.native
  
  /** Creates an object in the object db. Existing objects are not overwritten. */
  def setObjectNotExists(id: String, obj: SettableObject): Unit = js.native
  def setObjectNotExists(id: String, obj: SettableObject, callback: SetObjectCallback): Unit = js.native
  def setObjectNotExists(id: String, obj: SettableObject, options: js.Any): Unit = js.native
  def setObjectNotExists(id: String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
  
  /** Creates an object in the object db. Existing objects are not overwritten. */
  def setObjectNotExistsAsync(id: String, obj: SettableObject): SetObjectPromise = js.native
  def setObjectNotExistsAsync(id: String, obj: SettableObject, options: js.Any): SetObjectPromise = js.native
  
  /** Sets a new password for the given user */
  def setPassword(user: String, password: String): Unit = js.native
  def setPassword(user: String, password: String, callback: ErrorCallback): Unit = js.native
  def setPassword(user: String, password: String, options: js.Any): Unit = js.native
  def setPassword(user: String, password: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /** Sets a new password for the given user */
  def setPasswordAsync(user: String, password: String): js.Promise[Unit] = js.native
  def setPasswordAsync(user: String, password: String, options: js.Any): js.Promise[Unit] = js.native
  
  // ==============================
  // states
  // Multiple signatures help understanding what the parameters are about
  /** Writes a value into the states DB. */
  // tslint:disable:unified-signatures
  def setState(id: String): Unit = js.native
  def setState(id: String, state: String): Unit = js.native
  def setState(id: String, state: String, ack: Boolean): Unit = js.native
  def setState(id: String, state: String, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: String, ack: Boolean, options: js.Any): Unit = js.native
  def setState(id: String, state: String, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: String, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: String, options: js.Any): Unit = js.native
  def setState(id: String, state: String, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Boolean): Unit = js.native
  def setState(id: String, state: Boolean, ack: Boolean): Unit = js.native
  def setState(id: String, state: Boolean, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Boolean, ack: Boolean, options: js.Any): Unit = js.native
  def setState(id: String, state: Boolean, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Boolean, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Boolean, options: js.Any): Unit = js.native
  def setState(id: String, state: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Double): Unit = js.native
  def setState(id: String, state: Double, ack: Boolean): Unit = js.native
  def setState(id: String, state: Double, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Double, ack: Boolean, options: js.Any): Unit = js.native
  def setState(id: String, state: Double, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Double, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Double, options: js.Any): Unit = js.native
  def setState(id: String, state: Double, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Null, ack: Boolean): Unit = js.native
  def setState(id: String, state: Null, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Null, ack: Boolean, options: js.Any): Unit = js.native
  def setState(id: String, state: Null, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Null, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Null, options: js.Any): Unit = js.native
  def setState(id: String, state: Null, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: SettableState): Unit = js.native
  def setState(id: String, state: SettableState, ack: Boolean): Unit = js.native
  def setState(id: String, state: SettableState, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: SettableState, ack: Boolean, options: js.Any): Unit = js.native
  def setState(id: String, state: SettableState, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: SettableState, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: SettableState, options: js.Any): Unit = js.native
  def setState(id: String, state: SettableState, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: State): Unit = js.native
  def setState(id: String, state: State, ack: Boolean): Unit = js.native
  def setState(id: String, state: State, ack: Boolean, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: State, ack: Boolean, options: js.Any): Unit = js.native
  def setState(id: String, state: State, ack: Boolean, options: js.Any, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: State, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: State, options: js.Any): Unit = js.native
  def setState(id: String, state: State, options: js.Any, callback: SetStateCallback): Unit = js.native
  
  /** Writes a value into the states DB. */
  def setStateAsync(id: String): SetStatePromise = js.native
  def setStateAsync(id: String, state: String): SetStatePromise = js.native
  def setStateAsync(id: String, state: String, ack: Boolean): SetStatePromise = js.native
  def setStateAsync(id: String, state: String, ack: Boolean, options: js.Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: String, options: js.Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: Boolean): SetStatePromise = js.native
  def setStateAsync(id: String, state: Boolean, ack: Boolean): SetStatePromise = js.native
  def setStateAsync(id: String, state: Boolean, ack: Boolean, options: js.Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: Boolean, options: js.Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: Double): SetStatePromise = js.native
  def setStateAsync(id: String, state: Double, ack: Boolean): SetStatePromise = js.native
  def setStateAsync(id: String, state: Double, ack: Boolean, options: js.Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: Double, options: js.Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: Null, ack: Boolean): SetStatePromise = js.native
  def setStateAsync(id: String, state: Null, ack: Boolean, options: js.Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: Null, options: js.Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: SettableState): SetStatePromise = js.native
  def setStateAsync(id: String, state: SettableState, ack: Boolean): SetStatePromise = js.native
  def setStateAsync(id: String, state: SettableState, ack: Boolean, options: js.Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: SettableState, options: js.Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: State): SetStatePromise = js.native
  def setStateAsync(id: String, state: State, ack: Boolean): SetStatePromise = js.native
  def setStateAsync(id: String, state: State, ack: Boolean, options: js.Any): SetStatePromise = js.native
  def setStateAsync(id: String, state: State, options: js.Any): SetStatePromise = js.native
  
  /** Writes a value into the states DB only if it has changed. */
  def setStateChanged(id: String): Unit = js.native
  def setStateChanged(id: String, state: String): Unit = js.native
  def setStateChanged(id: String, state: String, ack: Boolean): Unit = js.native
  def setStateChanged(id: String, state: String, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: String, ack: Boolean, options: js.Any): Unit = js.native
  def setStateChanged(id: String, state: String, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: String, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: String, options: js.Any): Unit = js.native
  def setStateChanged(id: String, state: String, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: Boolean): Unit = js.native
  def setStateChanged(id: String, state: Boolean, ack: Boolean): Unit = js.native
  def setStateChanged(id: String, state: Boolean, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: Boolean, ack: Boolean, options: js.Any): Unit = js.native
  def setStateChanged(id: String, state: Boolean, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: Boolean, options: js.Any): Unit = js.native
  def setStateChanged(id: String, state: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: Double): Unit = js.native
  def setStateChanged(id: String, state: Double, ack: Boolean): Unit = js.native
  def setStateChanged(id: String, state: Double, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: Double, ack: Boolean, options: js.Any): Unit = js.native
  def setStateChanged(id: String, state: Double, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: Double, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: Double, options: js.Any): Unit = js.native
  def setStateChanged(id: String, state: Double, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: Null, ack: Boolean): Unit = js.native
  def setStateChanged(id: String, state: Null, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: Null, ack: Boolean, options: js.Any): Unit = js.native
  def setStateChanged(id: String, state: Null, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: Null, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: Null, options: js.Any): Unit = js.native
  def setStateChanged(id: String, state: Null, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: SettableState): Unit = js.native
  def setStateChanged(id: String, state: SettableState, ack: Boolean): Unit = js.native
  def setStateChanged(id: String, state: SettableState, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: SettableState, ack: Boolean, options: js.Any): Unit = js.native
  def setStateChanged(id: String, state: SettableState, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: SettableState, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: SettableState, options: js.Any): Unit = js.native
  def setStateChanged(id: String, state: SettableState, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: State): Unit = js.native
  def setStateChanged(id: String, state: State, ack: Boolean): Unit = js.native
  def setStateChanged(id: String, state: State, ack: Boolean, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: State, ack: Boolean, options: js.Any): Unit = js.native
  def setStateChanged(id: String, state: State, ack: Boolean, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: State, callback: SetStateChangedCallback): Unit = js.native
  def setStateChanged(id: String, state: State, options: js.Any): Unit = js.native
  def setStateChanged(id: String, state: State, options: js.Any, callback: SetStateChangedCallback): Unit = js.native
  
  /** Writes a value into the states DB only if it has changed. */
  def setStateChangedAsync(id: String): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: String): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: String, ack: Boolean): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: String, ack: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: String, options: js.Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: Boolean): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: Boolean, ack: Boolean): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: Boolean, ack: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: Double): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: Double, ack: Boolean): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: Double, ack: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: Double, options: js.Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: Null, ack: Boolean): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: Null, ack: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: Null, options: js.Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: SettableState): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: SettableState, ack: Boolean): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: SettableState, ack: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: SettableState, options: js.Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: State): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: State, ack: Boolean): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: State, ack: Boolean, options: js.Any): SetStateChangedPromise = js.native
  def setStateChangedAsync(id: String, state: State, options: js.Any): SetStateChangedPromise = js.native
  
  // =============================================
  // Managed version of builtin setTimeout/setInterval/clear...
  // =============================================
  /** Creates a timeout that can automatically be cleared when the adapter is terminated */
  def setTimeout[T /* <: js.Array[_] */](
    callback: js.Function1[/* args */ T, Unit],
    ms: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Timeout = js.native
  
  /** Stops the adapter. Note: Is not always defined. */
  var stop: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Subscribe to changes of objects (which might not belong to this adapter) */
  def subscribeForeignObjects(pattern: String): Unit = js.native
  def subscribeForeignObjects(pattern: String, callback: ErrorCallback): Unit = js.native
  def subscribeForeignObjects(pattern: String, options: js.Any): Unit = js.native
  def subscribeForeignObjects(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /** Subscribe to changes of objects (which might not belong to this adapter) */
  def subscribeForeignObjectsAsync(pattern: String): js.Promise[Unit] = js.native
  def subscribeForeignObjectsAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
  
  /** Subscribe to changes of states (which might not belong to this adapter) */
  def subscribeForeignStates(pattern: String): Unit = js.native
  def subscribeForeignStates(pattern: String, callback: ErrorCallback): Unit = js.native
  def subscribeForeignStates(pattern: String, options: js.Any): Unit = js.native
  def subscribeForeignStates(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /** Subscribe to changes of states (which might not belong to this adapter) */
  def subscribeForeignStatesAsync(pattern: String): js.Promise[Unit] = js.native
  def subscribeForeignStatesAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
  
  // ==============================
  // subscriptions
  /** Subscribe to changes of objects in this instance */
  def subscribeObjects(pattern: String): Unit = js.native
  def subscribeObjects(pattern: String, callback: ErrorCallback): Unit = js.native
  def subscribeObjects(pattern: String, options: js.Any): Unit = js.native
  def subscribeObjects(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /** Subscribe to changes of objects in this instance */
  def subscribeObjectsAsync(pattern: String): js.Promise[Unit] = js.native
  def subscribeObjectsAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
  
  /** Subscribe to changes of states in this instance */
  def subscribeStates(pattern: String): Unit = js.native
  def subscribeStates(pattern: String, callback: ErrorCallback): Unit = js.native
  def subscribeStates(pattern: String, options: js.Any): Unit = js.native
  def subscribeStates(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /** Subscribe to changes of states in this instance */
  def subscribeStatesAsync(pattern: String): js.Promise[Unit] = js.native
  def subscribeStatesAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
  
  /**
    * Checks if a given feature is supported by the current installation
    * @param featureName The name of the feature to test for
    */
  var supportsFeature: js.UndefOr[js.Function1[/* featureName */ String, Boolean]] = js.native
  
  /** system part of the adapter settings */
  var systemConfig: js.UndefOr[js.Any] = js.native
  
  /**
    * Terminates the adapter execution but does not disable the adapter
    * @param reason (optional) A message to print into the log prior to termination
    * @param exitCode (optional) The exit code to use for termination
    */
  def terminate(): scala.Nothing = js.native
  def terminate(exitCode: Double): scala.Nothing = js.native
  def terminate(reason: js.UndefOr[scala.Nothing], exitCode: Double): scala.Nothing = js.native
  def terminate(reason: String): scala.Nothing = js.native
  def terminate(reason: String, exitCode: Double): scala.Nothing = js.native
  
  /**
    * Deletes a given file
    * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
    * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
    */
  def unlink(adapterName: String, path: String, callback: ErrnoCallback): Unit = js.native
  def unlink(adapterName: String, path: String, options: js.Any, callback: ErrnoCallback): Unit = js.native
  def unlink(adapterName: Null, path: String, callback: ErrnoCallback): Unit = js.native
  def unlink(adapterName: Null, path: String, options: js.Any, callback: ErrnoCallback): Unit = js.native
  
  /**
    * Deletes a given file
    * @param adapterName - adapter name. If adapter name is null, default will be the name of the current adapter.
    * @param path - path to directory without adapter name. E.g. If you want to delete "/vis.0/main/views.json", here must be "/main/views.json" and _adapter must be equal to "vis.0".
    */
  def unlinkAsync(adapterName: String, path: String): js.Promise[Unit] = js.native
  def unlinkAsync(adapterName: String, path: String, options: js.Any): js.Promise[Unit] = js.native
  def unlinkAsync(adapterName: Null, path: String): js.Promise[Unit] = js.native
  def unlinkAsync(adapterName: Null, path: String, options: js.Any): js.Promise[Unit] = js.native
  
  /** Unsubscribe from changes of objects (which might not belong to this adapter) */
  def unsubscribeForeignObjects(pattern: String): Unit = js.native
  def unsubscribeForeignObjects(pattern: String, callback: ErrorCallback): Unit = js.native
  def unsubscribeForeignObjects(pattern: String, options: js.Any): Unit = js.native
  def unsubscribeForeignObjects(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /** Unsubscribe from changes of objects (which might not belong to this adapter) */
  def unsubscribeForeignObjectsAsync(pattern: String): js.Promise[Unit] = js.native
  def unsubscribeForeignObjectsAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
  
  /**
    * Subscribe from changes of states (which might not belong to this adapter)
    * @param pattern - Must match the pattern used to subscribe
    */
  def unsubscribeForeignStates(pattern: String): Unit = js.native
  def unsubscribeForeignStates(pattern: String, callback: ErrorCallback): Unit = js.native
  def unsubscribeForeignStates(pattern: String, options: js.Any): Unit = js.native
  def unsubscribeForeignStates(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /**
    * Subscribe from changes of states (which might not belong to this adapter)
    * @param pattern - Must match the pattern used to subscribe
    */
  def unsubscribeForeignStatesAsync(pattern: String): js.Promise[Unit] = js.native
  def unsubscribeForeignStatesAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
  
  /** Unsubscribe from changes of objects in this instance */
  def unsubscribeObjects(pattern: String): Unit = js.native
  def unsubscribeObjects(pattern: String, callback: ErrorCallback): Unit = js.native
  def unsubscribeObjects(pattern: String, options: js.Any): Unit = js.native
  def unsubscribeObjects(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /** Unsubscribe from changes of objects in this instance */
  def unsubscribeObjectsAsync(pattern: String): js.Promise[Unit] = js.native
  def unsubscribeObjectsAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
  
  /**
    * Subscribe from changes of states in this instance
    * @param pattern - Must match the pattern used to subscribe
    */
  def unsubscribeStates(pattern: String): Unit = js.native
  def unsubscribeStates(pattern: String, callback: ErrorCallback): Unit = js.native
  def unsubscribeStates(pattern: String, options: js.Any): Unit = js.native
  def unsubscribeStates(pattern: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  
  /**
    * Subscribe from changes of states in this instance
    * @param pattern - Must match the pattern used to subscribe
    */
  def unsubscribeStatesAsync(pattern: String): js.Promise[Unit] = js.native
  def unsubscribeStatesAsync(pattern: String, options: js.Any): js.Promise[Unit] = js.native
  
  /**
    * Updates the adapter config with new values. Only a subset of the configuration has to be provided,
    * since merging with the existing config is done automatically.
    *
    * After updating the configuration, the adapter is automatically restarted. It is recommended that you
    * leave the current method (e.g. by using `return`) after calling this.
    *
    * @param newConfig The new config values to be stored
    */
  def updateConfig(newConfig: js.Object): Unit = js.native
  
  /** adapter version */
  var version: js.Any = js.native
  
  def writeFile(adapterName: String, path: String, data: String, callback: ErrnoCallback): Unit = js.native
  def writeFile(adapterName: String, path: String, data: String, options: js.Any, callback: ErrnoCallback): Unit = js.native
  def writeFile(adapterName: String, path: String, data: Buffer, callback: ErrnoCallback): Unit = js.native
  // options see https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/objects/objectsInMemServer.js#L599
  def writeFile(adapterName: String, path: String, data: Buffer, options: js.Any, callback: ErrnoCallback): Unit = js.native
  def writeFile(adapterName: Null, path: String, data: String, callback: ErrnoCallback): Unit = js.native
  def writeFile(adapterName: Null, path: String, data: String, options: js.Any, callback: ErrnoCallback): Unit = js.native
  def writeFile(adapterName: Null, path: String, data: Buffer, callback: ErrnoCallback): Unit = js.native
  def writeFile(adapterName: Null, path: String, data: Buffer, options: js.Any, callback: ErrnoCallback): Unit = js.native
  
  def writeFileAsync(adapterName: String, path: String, data: String): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: String, path: String, data: String, options: js.Any): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: String, path: String, data: Buffer): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: String, path: String, data: Buffer, options: js.Any): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: Null, path: String, data: String): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: Null, path: String, data: String, options: js.Any): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: Null, path: String, data: Buffer): js.Promise[Unit] = js.native
  def writeFileAsync(adapterName: Null, path: String, data: Buffer, options: js.Any): js.Promise[Unit] = js.native
}
