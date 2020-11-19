package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relocates machine code for arm.
  */
@JSGlobal("ThumbRelocator")
@js.native
class ThumbRelocator protected ()
  extends typingsSlinky.fridaGum.ThumbRelocator {
  /**
    * Creates a new code relocator for copying ARM instructions
    * from one memory location to another, taking care to adjust
    * position-dependent instructions accordingly.
    *
    * @param inputCode Source address to copy instructions from.
    * @param output ThumbWriter pointed at the desired target memory
    *               address.
    */
  def this(inputCode: NativePointerValue, output: typingsSlinky.fridaGum.ThumbWriter) = this()
}
