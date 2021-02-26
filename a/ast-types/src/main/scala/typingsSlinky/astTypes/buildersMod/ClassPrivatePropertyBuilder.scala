package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Static
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PrivateNameKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassPrivatePropertyBuilder extends StObject {
  
  def apply(key: PrivateNameKind): ClassPrivateProperty = js.native
  def apply(key: PrivateNameKind, value: ExpressionKind): ClassPrivateProperty = js.native
  
  def from(params: Static): ClassPrivateProperty = js.native
}
