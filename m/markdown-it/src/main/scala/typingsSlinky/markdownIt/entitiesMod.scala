package typingsSlinky.markdownIt

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitiesMod extends Shortcut {
  
  @JSImport("markdown-it/lib/common/entities", JSImport.Namespace)
  @js.native
  val ^ : MapType = js.native
  
  type MapType = StringDictionary[String]
  
  type _To = MapType
  
  /* This means you don't have to write `^`, but can instead just say `entitiesMod.foo` */
  override def _to: MapType = ^
}
