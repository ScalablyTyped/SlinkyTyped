package typingsSlinky.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFastFieldMod {
  import typingsSlinky.formik.distTypesMod.GenericFieldHTMLAttributes

  type FastFieldAttributes[T] = GenericFieldHTMLAttributes with FastFieldConfig[T] with T
}
