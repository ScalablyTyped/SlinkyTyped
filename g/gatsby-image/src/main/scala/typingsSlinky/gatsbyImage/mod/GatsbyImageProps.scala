package typingsSlinky.gatsbyImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gatsbyImage.mod.GatsbyImageFluidProps
  - typingsSlinky.gatsbyImage.mod.GatsbyImageFixedProps
*/
trait GatsbyImageProps extends js.Object
object GatsbyImageProps {
  
  @scala.inline
  def GatsbyImageFluidProps(fluid: FluidObject | js.Array[FluidObject]): GatsbyImageProps = {
    val __obj = js.Dynamic.literal(fluid = fluid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyImageProps]
  }
  
  @scala.inline
  def GatsbyImageFixedProps(fixed: FixedObject | js.Array[FixedObject]): GatsbyImageProps = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyImageProps]
  }
}
