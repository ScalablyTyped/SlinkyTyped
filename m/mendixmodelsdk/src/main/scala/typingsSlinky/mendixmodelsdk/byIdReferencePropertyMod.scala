package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.byIdReferenceMod.ByIdReference
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byIdReferencePropertyMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/ByIdReferenceProperty", "ByIdReferenceProperty")
  @js.native
  class ByIdReferenceProperty[T /* <: AbstractElement[IAbstractModel, Container] */] protected () extends AbstractProperty[T | Null, ByIdReference[T]] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: T,
      moreArgs: js.Any*
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: Null,
      moreArgs: js.Any*
    ) = this()
    
    @JSName("parent")
    var parent_ByIdReferenceProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def resolveReference(): Unit = js.native
    
    def set(): Unit = js.native
    def set(value: T): Unit = js.native
    
    def updateElementContainer(): Unit = js.native
    
    def updateWithRawValue(value: String): Unit = js.native
  }
}
