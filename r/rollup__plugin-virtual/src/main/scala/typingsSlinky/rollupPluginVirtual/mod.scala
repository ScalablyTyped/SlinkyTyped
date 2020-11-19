package typingsSlinky.rollupPluginVirtual

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.rollup.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rollup/plugin-virtual", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * A Rollup plugin which loads virtual modules from memory.
    */
  def apply(): Plugin = js.native
  def apply(options: Options): Plugin = js.native
  
  type Options = StringDictionary[String]
}
