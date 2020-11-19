package typingsSlinky.mendixmodelsdk.elementsMod

import typingsSlinky.mendixmodelsdk.structuresMod.IStructure
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstractElement
  extends IStructure
     with IContainer {
  
  def asLoaded(): IAbstractElement = js.native
  
  def load(): js.Promise[IAbstractElement] = js.native
  def load(callback: js.Function1[/* element */ this.type, Unit]): Unit = js.native
  def load(callback: js.Function1[/* element */ this.type, Unit], forceRefresh: Boolean): Unit = js.native
  def load(forceRefresh: Boolean): js.Promise[IAbstractElement] = js.native
}
