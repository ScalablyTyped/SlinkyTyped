package typingsSlinky.firefoxWebextBrowser.global.browser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firefoxWebextBrowser.browser.telemetry.EventData
import typingsSlinky.firefoxWebextBrowser.browser.telemetry.ScalarData
import typingsSlinky.firefoxWebextBrowser.browser.telemetry.SubmitEncryptedPingOptions
import typingsSlinky.firefoxWebextBrowser.browser.telemetry.SubmitPingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.telemetry` API to send telemetry data to the Mozilla Telemetry service. Restricted to Mozilla privileged webextensions.
  *
  * Permissions: `telemetry`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object telemetry {
  
  /** Checks if Telemetry upload is enabled. */
  @JSGlobal("browser.telemetry.canUpload")
  @js.native
  def canUpload(): js.Promise[_] = js.native
  
  /**
    * Adds the value to the given keyed scalar.
    * @param name The scalar name
    * @param key The key name
    * @param value The numeric value to add to the scalar. Only unsigned integers supported.
    */
  @JSGlobal("browser.telemetry.keyedScalarAdd")
  @js.native
  def keyedScalarAdd(name: String, key: String, value: Double): js.Promise[_] = js.native
  
  /**
    * Sets the keyed scalar to the given value. Throws if the value type doesn't match the scalar type.
    * @param name The scalar name.
    * @param key The key name.
    * @param value The value to set the scalar to.
    */
  @JSGlobal("browser.telemetry.keyedScalarSet")
  @js.native
  def keyedScalarSet(name: String, key: String, value: String): js.Promise[_] = js.native
  @JSGlobal("browser.telemetry.keyedScalarSet")
  @js.native
  def keyedScalarSet(name: String, key: String, value: StringDictionary[js.Any]): js.Promise[_] = js.native
  @JSGlobal("browser.telemetry.keyedScalarSet")
  @js.native
  def keyedScalarSet(name: String, key: String, value: Boolean): js.Promise[_] = js.native
  @JSGlobal("browser.telemetry.keyedScalarSet")
  @js.native
  def keyedScalarSet(name: String, key: String, value: Double): js.Promise[_] = js.native
  
  /**
    * Sets the keyed scalar to the maximum of the current and the passed value
    * @param name The scalar name.
    * @param key The key name.
    * @param value The numeric value to set the scalar to. Only unsigned integers supported.
    */
  @JSGlobal("browser.telemetry.keyedScalarSetMaximum")
  @js.native
  def keyedScalarSetMaximum(name: String, key: String, value: Double): js.Promise[_] = js.native
  
  /**
    * Record an event in Telemetry. Throws when trying to record an unknown event.
    * @param category The category name.
    * @param method The method name.
    * @param object The object name.
    * @param [value] An optional string value to record.
    * @param [extra] An optional object of the form (string -> string). It should only contain registered extra keys.
    */
  @JSGlobal("browser.telemetry.recordEvent")
  @js.native
  def recordEvent(category: String, method: String, `object`: String): js.Promise[_] = js.native
  @JSGlobal("browser.telemetry.recordEvent")
  @js.native
  def recordEvent(
    category: String,
    method: String,
    `object`: String,
    value: js.UndefOr[scala.Nothing],
    extra: StringDictionary[String]
  ): js.Promise[_] = js.native
  @JSGlobal("browser.telemetry.recordEvent")
  @js.native
  def recordEvent(category: String, method: String, `object`: String, value: String): js.Promise[_] = js.native
  @JSGlobal("browser.telemetry.recordEvent")
  @js.native
  def recordEvent(category: String, method: String, `object`: String, value: String, extra: StringDictionary[String]): js.Promise[_] = js.native
  
  /**
    * Register new events to record them from addons. See nsITelemetry.idl for more details.
    * @param category The unique category the events are registered in.
    * @param data An object that contains registration data for 1+ events. Each property name is the category name, and the corresponding property value is an object of EventData type.
    */
  @JSGlobal("browser.telemetry.registerEvents")
  @js.native
  def registerEvents(category: String, data: StringDictionary[EventData]): js.Promise[_] = js.native
  
  /**
    * Register new scalars to record them from addons. See nsITelemetry.idl for more details.
    * @param category The unique category the scalars are registered in.
    * @param data An object that contains registration data for multiple scalars. Each property name is the scalar name, and the corresponding property value is an object of ScalarData type.
    */
  @JSGlobal("browser.telemetry.registerScalars")
  @js.native
  def registerScalars(category: String, data: StringDictionary[ScalarData]): js.Promise[_] = js.native
  
  /**
    * Adds the value to the given scalar.
    * @param name The scalar name.
    * @param value The numeric value to add to the scalar. Only unsigned integers supported.
    */
  @JSGlobal("browser.telemetry.scalarAdd")
  @js.native
  def scalarAdd(name: String, value: Double): js.Promise[_] = js.native
  
  /**
    * Sets the named scalar to the given value. Throws if the value type doesn't match the scalar type.
    * @param name The scalar name
    * @param value The value to set the scalar to
    */
  @JSGlobal("browser.telemetry.scalarSet")
  @js.native
  def scalarSet(name: String, value: String): js.Promise[_] = js.native
  @JSGlobal("browser.telemetry.scalarSet")
  @js.native
  def scalarSet(name: String, value: StringDictionary[js.Any]): js.Promise[_] = js.native
  @JSGlobal("browser.telemetry.scalarSet")
  @js.native
  def scalarSet(name: String, value: Boolean): js.Promise[_] = js.native
  @JSGlobal("browser.telemetry.scalarSet")
  @js.native
  def scalarSet(name: String, value: Double): js.Promise[_] = js.native
  
  /**
    * Sets the scalar to the maximum of the current and the passed value
    * @param name The scalar name.
    * @param value The numeric value to set the scalar to. Only unsigned integers supported.
    */
  @JSGlobal("browser.telemetry.scalarSetMaximum")
  @js.native
  def scalarSetMaximum(name: String, value: Double): js.Promise[_] = js.native
  
  /**
    * Enable recording of events in a category. Events default to recording disabled. This allows to toggle recording for all events in the specified category.
    * @param category The category name.
    * @param enabled Whether recording is enabled for events in that category.
    */
  @JSGlobal("browser.telemetry.setEventRecordingEnabled")
  @js.native
  def setEventRecordingEnabled(category: String, enabled: Boolean): js.Promise[_] = js.native
  
  /**
    * Submits a custom ping to the Telemetry back-end, with an encrypted payload. Requires a telemetry entry in the manifest to be used.
    * @param message The data payload for the ping, which will be encrypted.
    * @param options Options object.
    */
  @JSGlobal("browser.telemetry.submitEncryptedPing")
  @js.native
  def submitEncryptedPing(message: StringDictionary[js.Any], options: SubmitEncryptedPingOptions): js.Promise[_] = js.native
  
  /* telemetry functions */
  /**
    * Submits a custom ping to the Telemetry back-end. See `submitExternalPing` inside TelemetryController.jsm for more details.
    * @param type The type of the ping.
    * @param message The data payload for the ping.
    * @param options Options object.
    */
  @JSGlobal("browser.telemetry.submitPing")
  @js.native
  def submitPing(`type`: String, message: StringDictionary[js.Any], options: SubmitPingOptions): js.Promise[_] = js.native
}
