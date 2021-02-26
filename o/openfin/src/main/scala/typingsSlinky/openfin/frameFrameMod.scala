package typingsSlinky.openfin

import typingsSlinky.openfin.baseMod.Base
import typingsSlinky.openfin.baseMod.EmitterBase
import typingsSlinky.openfin.frameMod.FrameEvents
import typingsSlinky.openfin.identityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frameFrameMod {
  
  @JSImport("openfin/_v2/api/frame/frame", JSImport.Default)
  @js.native
  class default () extends FrameModule
  
  @JSImport("openfin/_v2/api/frame/frame", "_Frame")
  @js.native
  class Frame protected () extends EmitterBase[FrameEvents] {
    def this(wire: typingsSlinky.openfin.transportMod.default, identity: Identity) = this()
    
    /**
      * Adds the listener function to the end of the listeners array for the specified event type.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - Called whenever an event of the specified type occurs.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function addListener
      * @memberof Frame
      * @instance
      * @tutorial Frame.EventEmitter
      */
    /**
      * Adds a listener to the end of the listeners array for the specified event.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - Called whenever an event of the specified type occurs.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function on
      * @memberof Frame
      * @instance
      * @tutorial Frame.EventEmitter
      */
    /**
      * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - The callback function.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function once
      * @memberof Frame
      * @instance
      * @tutorial Frame.EventEmitter
      */
    /**
      * Adds a listener to the beginning of the listeners array for the specified event.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - The callback function.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function prependListener
      * @memberof Frame
      * @instance
      * @tutorial Frame.EventEmitter
      */
    /**
      * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
      * The listener is added to the beginning of the listeners array.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - The callback function.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function prependOnceListener
      * @memberof Frame
      * @instance
      * @tutorial Frame.EventEmitter
      */
    /**
      * Remove a listener from the listener array for the specified event.
      * Caution: Calling this method changes the array indices in the listener array behind the listener.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - The callback function.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function removeListener
      * @memberof Frame
      * @instance
      * @tutorial Frame.EventEmitter
      */
    /**
      * Removes all listeners, or those of the specified event.
      * @param { string | symbol } [eventType]  - The type of the event.
      * @return {Promise.<this>}
      * @function removeAllListeners
      * @memberof Frame
      * @instance
      * @tutorial Frame.EventEmitter
      */
    /**
      * Returns a frame info object for the represented frame
      * @return {Promise.<FrameInfo>}
      * @tutorial Frame.getInfo
      */
    def getInfo(): js.Promise[FrameInfo] = js.native
    
    /**
      * Returns a frame info object representing the window that the referenced iframe is
      * currently embedded in
      * @return {Promise.<FrameInfo>}
      * @tutorial Frame.getParentWindow
      */
    def getParentWindow(): js.Promise[FrameInfo] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.openfin.openfinStrings.window
    - typingsSlinky.openfin.openfinStrings.iframe
    - typingsSlinky.openfin.openfinStrings.`external connection`
    - typingsSlinky.openfin.openfinStrings.view
    - typingsSlinky.openfin.openfinStrings.unknown
  */
  trait EntityType extends StObject
  object EntityType {
    
    @scala.inline
    def `external connection`: typingsSlinky.openfin.openfinStrings.`external connection` = ("external connection").asInstanceOf[typingsSlinky.openfin.openfinStrings.`external connection`]
    
    @scala.inline
    def iframe: typingsSlinky.openfin.openfinStrings.iframe = "iframe".asInstanceOf[typingsSlinky.openfin.openfinStrings.iframe]
    
    @scala.inline
    def unknown: typingsSlinky.openfin.openfinStrings.unknown = "unknown".asInstanceOf[typingsSlinky.openfin.openfinStrings.unknown]
    
    @scala.inline
    def view: typingsSlinky.openfin.openfinStrings.view = "view".asInstanceOf[typingsSlinky.openfin.openfinStrings.view]
    
    @scala.inline
    def window: typingsSlinky.openfin.openfinStrings.window = "window".asInstanceOf[typingsSlinky.openfin.openfinStrings.window]
  }
  
  @js.native
  trait FrameInfo extends StObject {
    
    var entityType: EntityType = js.native
    
    var name: String = js.native
    
    var parent: Identity = js.native
    
    var uuid: String = js.native
  }
  object FrameInfo {
    
    @scala.inline
    def apply(entityType: EntityType, name: String, parent: Identity, uuid: String): FrameInfo = {
      val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameInfo]
    }
    
    @scala.inline
    implicit class FrameInfoMutableBuilder[Self <: FrameInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Identity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FrameModule extends Base {
    
    /**
      * Asynchronously returns a reference to the current frame
      * @return {Promise.<_Frame>}
      * @tutorial Frame.getCurrent
      * @static
      */
    def getCurrent(): js.Promise[Frame] = js.native
    
    /**
      * Synchronously returns a reference to the current frame
      * @return {_Frame}
      * @tutorial Frame.getCurrentSync
      * @static
      */
    def getCurrentSync(): Frame = js.native
    
    /**
      * Asynchronously returns a reference to the specified frame. The frame does not have to exist
      * @param {Identity} identity - the identity of the frame you want to wrap
      * @return {Promise.<_Frame>}
      * @tutorial Frame.wrap
      * @static
      */
    def wrap(identity: Identity): js.Promise[Frame] = js.native
    
    /**
      * Synchronously returns a reference to the specified frame. The frame does not have to exist
      * @param {Identity} identity - the identity of the frame you want to wrap
      * @return {_Frame}
      * @tutorial Frame.wrapSync
      * @static
      */
    def wrapSync(identity: Identity): Frame = js.native
  }
}
