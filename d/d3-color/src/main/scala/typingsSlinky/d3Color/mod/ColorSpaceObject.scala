package typingsSlinky.d3Color.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.d3Color.mod.RGBColor
  - typingsSlinky.d3Color.mod.HSLColor
  - typingsSlinky.d3Color.mod.LabColor
  - typingsSlinky.d3Color.mod.HCLColor
  - typingsSlinky.d3Color.mod.CubehelixColor
*/
trait ColorSpaceObject extends js.Object

object ColorSpaceObject {
  @scala.inline
  implicit def apply(value: CubehelixColor): ColorSpaceObject = value.asInstanceOf[ColorSpaceObject]
  @scala.inline
  implicit def apply(value: HCLColor): ColorSpaceObject = value.asInstanceOf[ColorSpaceObject]
  @scala.inline
  implicit def apply(value: HSLColor): ColorSpaceObject = value.asInstanceOf[ColorSpaceObject]
  @scala.inline
  implicit def apply(value: LabColor): ColorSpaceObject = value.asInstanceOf[ColorSpaceObject]
  @scala.inline
  implicit def apply(value: RGBColor): ColorSpaceObject = value.asInstanceOf[ColorSpaceObject]
}

