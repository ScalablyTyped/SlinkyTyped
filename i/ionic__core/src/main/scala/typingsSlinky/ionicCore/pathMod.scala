package typingsSlinky.ionicCore

import org.scalajs.dom.raw.History
import org.scalajs.dom.raw.Location
import typingsSlinky.ionicCore.interfaceMod.RouteChain
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/components/router/utils/path", JSImport.Namespace)
@js.native
object pathMod extends js.Object {
  
  def chainToPath(chain: RouteChain): js.Array[String] | Null = js.native
  
  def generatePath(segments: js.Array[String]): String = js.native
  
  def parsePath(): js.Array[String] = js.native
  def parsePath(path: String): js.Array[String] = js.native
  
  def readPath(loc: Location, root: String, useHash: Boolean): js.Array[String] | Null = js.native
  
  def removePrefix(prefix: js.Array[String], path: js.Array[String]): js.Array[String] | Null = js.native
  
  def writePath(
    history: History,
    root: String,
    useHash: Boolean,
    path: js.Array[String],
    direction: RouterDirection,
    state: Double
  ): Unit = js.native
  def writePath(
    history: History,
    root: String,
    useHash: Boolean,
    path: js.Array[String],
    direction: RouterDirection,
    state: Double,
    queryString: String
  ): Unit = js.native
}
