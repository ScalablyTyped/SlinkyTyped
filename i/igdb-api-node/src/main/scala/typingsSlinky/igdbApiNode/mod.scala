package typingsSlinky.igdbApiNode

import typingsSlinky.apicalypse.mod.Apicalypse
import typingsSlinky.apicalypse.mod.ApicalypseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("igdb-api-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Apicalypse = js.native
  def default(apiKey: js.UndefOr[scala.Nothing], opts: ApicalypseConfig): Apicalypse = js.native
  def default(apiKey: String): Apicalypse = js.native
  def default(apiKey: String, opts: ApicalypseConfig): Apicalypse = js.native
  
  def getTagNumber(category: Double, id: Double): Double = js.native
}
