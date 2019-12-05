package typingsSlinky.atKeystonejsApolloDashHelpers.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atKeystonejsApolloDashHelpers.atKeystonejsApolloDashHelpersMod.KeystoneMutationTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mutation
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atKeystonejsApolloDashHelpers.atKeystonejsApolloDashHelpersMod.Mutation
    ] {
  @JSImport("@keystonejs/apollo-helpers", "Mutation")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    mutation: String,
    invalidatesTypes: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.atKeystonejsApolloDashHelpers.atKeystonejsApolloDashHelpersMod.Mutation
  ] = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any])
    if (!js.isUndefined(invalidatesTypes)) __obj.updateDynamic("invalidatesTypes")(invalidatesTypes.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = KeystoneMutationTypeProps
}

