package typingsSlinky.jupyterlabRendermime

import typingsSlinky.jupyterlabRendermime.anon.Math
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/rendermime/lib/latex", JSImport.Namespace)
@js.native
object latexMod extends js.Object {
  
  def removeMath(text: String): Math = js.native
  
  def replaceMath(text: String, math: js.Array[String]): String = js.native
}
