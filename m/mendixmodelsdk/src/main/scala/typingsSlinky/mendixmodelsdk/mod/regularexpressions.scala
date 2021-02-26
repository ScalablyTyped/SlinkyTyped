package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regularexpressions {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/regular-expressions relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "regularexpressions.RegularExpression")
  @js.native
  class RegularExpression protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.regularexpressions.RegularExpression {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object RegularExpression {
    
    @JSImport("mendixmodelsdk", "regularexpressions.RegularExpression")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new RegularExpression unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "regularexpressions.RegularExpression.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.regularexpressionsMod.regularexpressions.RegularExpression = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "regularexpressions.RegularExpression.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "regularexpressions.RegularExpression.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.regularexpressionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.regularexpressionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
