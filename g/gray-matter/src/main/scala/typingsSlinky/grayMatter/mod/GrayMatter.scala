package typingsSlinky.grayMatter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrayMatter extends js.Object {
  
  def apply(str: String): js.Any = js.native
  def apply(
    str: String,
    options: js.UndefOr[scala.Nothing],
    delims: js.UndefOr[scala.Nothing],
    parser: js.Function
  ): js.Any = js.native
  def apply(str: String, options: js.UndefOr[scala.Nothing], delims: js.Array[String]): js.Any = js.native
  def apply(str: String, options: js.UndefOr[scala.Nothing], delims: js.Array[String], parser: js.Function): js.Any = js.native
  def apply(str: String, options: GrayMatterOption): js.Any = js.native
  def apply(str: String, options: GrayMatterOption, delims: js.UndefOr[scala.Nothing], parser: js.Function): js.Any = js.native
  def apply(str: String, options: GrayMatterOption, delims: js.Array[String]): js.Any = js.native
  def apply(str: String, options: GrayMatterOption, delims: js.Array[String], parser: js.Function): js.Any = js.native
  
  def read(fp: String): js.Any = js.native
  def read(fp: String, options: GrayMatterOption): js.Any = js.native
  
  def stringify(str: String, data: js.Object): String = js.native
  def stringify(str: String, data: js.Object, options: GrayMatterOption): String = js.native
}
