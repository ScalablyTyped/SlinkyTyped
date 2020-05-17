package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.AccessComments
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PrivateNameKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassPrivatePropertyBuilder extends js.Object {
  def apply(key: PrivateNameKind): ClassPrivateProperty = js.native
  def apply(key: PrivateNameKind, value: ExpressionKind): ClassPrivateProperty = js.native
  def from(params: AccessComments): ClassPrivateProperty = js.native
}

