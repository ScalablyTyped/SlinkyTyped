package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "scheduledevents")
@js.native
object scheduledevents extends js.Object {
  
  @js.native
  class IntervalType ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.scheduledevents.IntervalType
  /* static members */
  @js.native
  object IntervalType extends js.Object {
    
    var Day: typingsSlinky.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    
    var Hour: typingsSlinky.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    
    var Minute: typingsSlinky.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    
    var Month: typingsSlinky.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    
    var Second: typingsSlinky.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    
    var Week: typingsSlinky.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    
    var Year: typingsSlinky.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/scheduled-events relevant section in reference guide}
    */
  @js.native
  class ScheduledEvent protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.scheduledevents.ScheduledEvent {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  /* static members */
  @js.native
  object ScheduledEvent extends js.Object {
    
    /**
      * Creates a new ScheduledEvent unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.scheduledeventsMod.scheduledevents.ScheduledEvent = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.scheduledeventsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class TimeZoneEnum ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.scheduledevents.TimeZoneEnum
  /* static members */
  @js.native
  object TimeZoneEnum extends js.Object {
    
    var Server: typingsSlinky.mendixmodelsdk.scheduledeventsMod.scheduledevents.TimeZoneEnum = js.native
    
    var UTC: typingsSlinky.mendixmodelsdk.scheduledeventsMod.scheduledevents.TimeZoneEnum = js.native
  }
}
