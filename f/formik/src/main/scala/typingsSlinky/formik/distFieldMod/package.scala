package typingsSlinky.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFieldMod {
  import typingsSlinky.formik.distTypesMod.GenericFieldHTMLAttributes

  type FieldAttributes[T] = GenericFieldHTMLAttributes with FieldConfig with T
}
