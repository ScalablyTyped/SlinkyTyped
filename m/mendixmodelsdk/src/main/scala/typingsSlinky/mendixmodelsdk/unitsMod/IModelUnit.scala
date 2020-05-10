package typingsSlinky.mendixmodelsdk.unitsMod

import typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined load, load, load, load, asLoaded */ @js.native
trait IModelUnit extends IAbstractUnit {
  def asLoaded(): IAbstractElement = js.native
  def delete(): Unit = js.native
  def load(): js.Promise[IAbstractElement] = js.native
  def load(callback: js.Function1[/* element */ this.type, Unit]): Unit = js.native
  def load(callback: js.Function1[/* element */ this.type, Unit], forceRefresh: Boolean): Unit = js.native
  def load(forceRefresh: Boolean): js.Promise[IAbstractElement] = js.native
}

