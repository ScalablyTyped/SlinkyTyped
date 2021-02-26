package typingsSlinky.jointjs.mod.shapes.standard

import typingsSlinky.jointjs.mod.dia.Element
import typingsSlinky.jointjs.mod.dia.Element.GenericAttributes
import typingsSlinky.jointjs.mod.dia.Graph.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "shapes.standard.Cylinder")
@js.native
class Cylinder () extends Element {
  def this(attributes: GenericAttributes[CylinderSelectors]) = this()
  def this(attributes: js.UndefOr[scala.Nothing], opt: Options) = this()
  def this(attributes: GenericAttributes[CylinderSelectors], opt: Options) = this()
  
  def topRy(): String | Double = js.native
  def topRy(t: String): this.type = js.native
  def topRy(t: String, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
  def topRy(t: Double): this.type = js.native
  def topRy(t: Double, opt: typingsSlinky.jointjs.mod.dia.Cell.Options): this.type = js.native
}
