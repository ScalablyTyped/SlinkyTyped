package typingsSlinky.amazonConnectStreams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object connect {
  
  /**
    * A callback to receive `Agent` API object instances.
    *
    * @param agent The `Agent` API object instance.
    */
  type AgentCallback = js.Function1[/* agent */ typingsSlinky.amazonConnectStreams.connect.Agent, scala.Unit]
  
  type AgentChannelConcurrencyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ channel in amazon-connect-streams.connect.ChannelType ]: number}
    */ typingsSlinky.amazonConnectStreams.amazonConnectStreamsStrings.AgentChannelConcurrencyMap with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /**
    * A callback to receive `AgentMutedStatus` API object instances.
    *
    * @param agentMutedStatus The `AgentMutedStatus` API object instance.
    */
  type AgentMutedStatusCallback = js.Function1[
    /* agentMutedStatus */ typingsSlinky.amazonConnectStreams.connect.AgentMutedStatus, 
    scala.Unit
  ]
  
  /**
    * A callback to receive an agent state change event.
    *
    * @param agentStateChange The agent state change event.
    */
  type AgentStateChangeCallback = js.Function1[
    /* agentStateChange */ typingsSlinky.amazonConnectStreams.connect.AgentStateChange, 
    scala.Unit
  ]
  
  type AttributeDictionary = org.scalablytyped.runtime.StringDictionary[typingsSlinky.amazonConnectStreams.anon.Name]
  
  /**
    * A callback to receive `Contact` API object instances.
    *
    * @param contact A `Contact` API object instance.
    */
  type ContactCallback = js.Function1[/* contact */ typingsSlinky.amazonConnectStreams.connect.Contact, scala.Unit]
  
  /**
    * A callback to receive `SoftphoneError` errors.
    *
    * @param error A `SoftphoneError` error.
    */
  type SoftphoneErrorCallback = js.Function1[/* error */ typingsSlinky.amazonConnectStreams.connect.SoftphoneError, scala.Unit]
  
  /*
    * A callback to receive notifications of success or failure.
    */
  type SuccessFailCallback[T /* <: js.Array[_] */] = js.Function1[/* args */ T, scala.Unit]
  
  /**
    * A callback to receive `ViewContactEvent` objects.
    *
    * @param contact A `ViewContactEvent` object.
    */
  type ViewContactCallback = js.Function1[
    /* contact */ typingsSlinky.amazonConnectStreams.connect.ViewContactEvent, 
    scala.Unit
  ]
}
