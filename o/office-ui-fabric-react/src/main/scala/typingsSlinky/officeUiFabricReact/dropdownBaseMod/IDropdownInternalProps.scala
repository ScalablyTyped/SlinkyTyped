package typingsSlinky.officeUiFabricReact.dropdownBaseMod

import typingsSlinky.officeUiFabricReact.dropdownTypesMod.IDropdownOption
import typingsSlinky.officeUiFabricReact.dropdownTypesMod.IDropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.officeUiFabricReact.withResponsiveModeMod.IWithResponsiveModeState because var conflicts: responsiveMode. Inlined  */ @js.native
trait IDropdownInternalProps extends IDropdownProps

object IDropdownInternalProps {
  @scala.inline
  def apply(options: js.Array[IDropdownOption]): IDropdownInternalProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownInternalProps]
  }
}

