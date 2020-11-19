package typingsSlinky.icheck

import typingsSlinky.icheck.ICheck.Options
import typingsSlinky.icheck.icheckStrings.check
import typingsSlinky.icheck.icheckStrings.destroy
import typingsSlinky.icheck.icheckStrings.determinate
import typingsSlinky.icheck.icheckStrings.disable
import typingsSlinky.icheck.icheckStrings.enable
import typingsSlinky.icheck.icheckStrings.indeterminate
import typingsSlinky.icheck.icheckStrings.toggle
import typingsSlinky.icheck.icheckStrings.uncheck
import typingsSlinky.icheck.icheckStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def iCheck(): this.type = js.native
  def iCheck(options: Options): this.type = js.native
  def iCheck[T /* <: /* keyof icheck.ICheck.Methods */ check | uncheck | toggle | disable | enable | indeterminate | determinate | update | destroy */](method: T): this.type = js.native
  def iCheck[T /* <: /* keyof icheck.ICheck.Methods */ check | uncheck | toggle | disable | enable | indeterminate | determinate | update | destroy */](
    method: T,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: icheck.ICheck.Methods[T] */ js.Any
  ): this.type = js.native
}
