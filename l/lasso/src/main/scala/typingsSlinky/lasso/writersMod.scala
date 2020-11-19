package typingsSlinky.lasso

import typingsSlinky.lasso.lassoMod.LassoConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lasso/lib/writers", JSImport.Namespace)
@js.native
object writersMod extends js.Object {
  
  def createWriter(writerImpl: js.Any): Writer = js.native
  
  def fileWriter(fileWriterConfig: js.Any, lassoConfig: LassoConfig): js.Any = js.native
  
  type Writer = typingsSlinky.lasso.writerMod.Writer
}
