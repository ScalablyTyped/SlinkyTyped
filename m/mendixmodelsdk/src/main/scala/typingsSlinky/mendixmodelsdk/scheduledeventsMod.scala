package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.internalMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/scheduledevents", JSImport.Namespace)
@js.native
object scheduledeventsMod extends js.Object {
  
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object scheduledevents extends js.Object {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `ScheduledEvents`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide/scheduled-events relevant section in reference guide}
      */
    @js.native
    trait IScheduledEvent extends IDocument
    
    @js.native
    class IntervalType () extends AbstractEnum
    /* static members */
    @js.native
    object IntervalType extends js.Object {
      
      var Day: IntervalType = js.native
      
      var Hour: IntervalType = js.native
      
      var Minute: IntervalType = js.native
      
      var Month: IntervalType = js.native
      
      var Second: IntervalType = js.native
      
      var Week: IntervalType = js.native
      
      var Year: IntervalType = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/scheduled-events relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.scheduledeventsMod.scheduledevents.IScheduledEvent because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
    class ScheduledEvent protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MScheduledEvent: FolderBase = js.native
      
      def enabled: Boolean = js.native
      def enabled_=(newValue: Boolean): Unit = js.native
      
      def interval: Double = js.native
      
      def intervalType: IntervalType = js.native
      def intervalType_=(newValue: IntervalType): Unit = js.native
      
      def interval_=(newValue: Double): Unit = js.native
      
      def microflow: IMicroflow | Null = js.native
      
      def microflowQualifiedName: String | Null = js.native
      
      def microflow_=(newValue: IMicroflow | Null): Unit = js.native
      
      def startDateTime: String = js.native
      def startDateTime_=(newValue: String): Unit = js.native
      
      def timeZone: TimeZoneEnum = js.native
      def timeZone_=(newValue: TimeZoneEnum): Unit = js.native
    }
    /* static members */
    @js.native
    object ScheduledEvent extends js.Object {
      
      /**
        * Creates a new ScheduledEvent unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): ScheduledEvent = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
    
    @js.native
    class TimeZoneEnum () extends AbstractEnum
    /* static members */
    @js.native
    object TimeZoneEnum extends js.Object {
      
      var Server: TimeZoneEnum = js.native
      
      var UTC: TimeZoneEnum = js.native
    }
  }
}
