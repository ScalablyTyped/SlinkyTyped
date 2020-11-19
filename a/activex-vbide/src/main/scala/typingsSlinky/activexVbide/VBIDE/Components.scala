package typingsSlinky.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Components extends js.Object {
  
  def apply(index: js.Any): Component = js.native
  
  def Add(ComponentType: vbextComponentType): Component = js.native
  
  val Application: typingsSlinky.activexVbide.VBIDE.Application = js.native
  
  val Count: Double = js.native
  
  def Import(FileName: String): Component = js.native
  
  def Item(index: js.Any): Component = js.native
  
  val Parent: VBProject = js.native
  
  def Remove(Component: Component): Unit = js.native
  
  val VBE: typingsSlinky.activexVbide.VBIDE.VBE = js.native
}
