package typingsSlinky.classnames

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.classnames.anon.DefaultClassNamesFn
import typingsSlinky.classnames.typesMod.ClassValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("classnames", JSImport.Namespace)
@js.native
object mod extends TopLevel[DefaultClassNamesFn] {
  def apply(classes: ClassValue*): String = js.native
}

