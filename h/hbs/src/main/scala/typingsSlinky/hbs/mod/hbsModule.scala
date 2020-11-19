package typingsSlinky.hbs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hbsModule extends js.Object {
  
  def __express(filename: String, options: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  val handlebars: handlebarsModule = js.native
  
  def localsAsTemplateData(app: js.Any): Unit = js.native
  
  def registerHelper(helperName: String, helperFunction: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  def registerPartial(partialName: String, partialValue: String): Unit = js.native
  
  def registerPartials(directoryName: String): Unit = js.native
  def registerPartials(directoryName: String, callback: js.Function0[Unit]): Unit = js.native
}
